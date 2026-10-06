package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwcal002_impl extends GXDataArea
{
   public webwcal002_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwcal002_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwcal002_impl.class ));
   }

   public webwcal002_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDiasem = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         gxfirstwebparm_bkp = gxfirstwebparm ;
         gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
         {
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            dyncall( httpContext.GetNextPar( )) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
         {
            httpContext.setAjaxEventMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else
         {
            if ( ! httpContext.IsValidAjaxCall( false) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = gxfirstwebparm_bkp ;
         }
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV24EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV64MAQUINA = httpContext.GetPar( "MAQUINA") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64MAQUINA", AV64MAQUINA);
               AV65MM = (byte)(GXutil.lval( httpContext.GetPar( "MM"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65MM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MM), 2, 0));
               AV5AA = (short)(GXutil.lval( httpContext.GetPar( "AA"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5AA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AA), 4, 0));
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa9M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start9M2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwcal002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV64MAQUINA)),GXutil.URLEncode(GXutil.ltrimstr(AV65MM,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5AA,4,0))}, new String[] {"EmprCod","MAQUINA","MM","AA"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI1F", localUtil.ttoc( AV58MaqHnpI1f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI1I", localUtil.ttoc( AV59MaqHnpI1i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI2F", localUtil.ttoc( AV60MaqHnpi2f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI2I", localUtil.ttoc( AV61MaqHnpI2i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI3F", localUtil.ttoc( AV62MaqHnpI3f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQHNPI3I", localUtil.ttoc( AV63MaqHnpI3i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQANY", GXutil.ltrim( localUtil.ntoc( A599MaqAny, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQMES", GXutil.ltrim( localUtil.ntoc( A614MaqMes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPDIA", GXutil.ltrim( localUtil.ntoc( A5123MaqHnpDia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1I", localUtil.ttoc( A5124MaqHnpI1i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI1F", localUtil.ttoc( A5125MaqHnpI1f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2I", localUtil.ttoc( A5126MaqHnpI2i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI2F", localUtil.ttoc( A5127MaqHnpI2f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3I", localUtil.ttoc( A5128MaqHnpI3i, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQHNPI3F", localUtil.ttoc( A5129MaqHnpI3f, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_dvpanel_tableheader_Autoscroll));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we9M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt9M2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webwcal002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV64MAQUINA)),GXutil.URLEncode(GXutil.ltrimstr(AV65MM,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5AA,4,0))}, new String[] {"EmprCod","MAQUINA","MM","AA"})  ;
   }

   public String getPgmname( )
   {
      return "WebWCAL002" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MODIF. CALEND. HORAS NO PROD.", "") ;
   }

   public void wb9M0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_dvpanel_tableheader.setProperty("Width", Dvpanel_dvpanel_tableheader_Width);
         ucDvpanel_dvpanel_tableheader.setProperty("AutoWidth", Dvpanel_dvpanel_tableheader_Autowidth);
         ucDvpanel_dvpanel_tableheader.setProperty("AutoHeight", Dvpanel_dvpanel_tableheader_Autoheight);
         ucDvpanel_dvpanel_tableheader.setProperty("Cls", Dvpanel_dvpanel_tableheader_Cls);
         ucDvpanel_dvpanel_tableheader.setProperty("Title", Dvpanel_dvpanel_tableheader_Title);
         ucDvpanel_dvpanel_tableheader.setProperty("Collapsible", Dvpanel_dvpanel_tableheader_Collapsible);
         ucDvpanel_dvpanel_tableheader.setProperty("Collapsed", Dvpanel_dvpanel_tableheader_Collapsed);
         ucDvpanel_dvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_dvpanel_tableheader.setProperty("IconPosition", Dvpanel_dvpanel_tableheader_Iconposition);
         ucDvpanel_dvpanel_tableheader.setProperty("AutoScroll", Dvpanel_dvpanel_tableheader_Autoscroll);
         ucDvpanel_dvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_dvpanel_tableheader_Internalname, "DVPANEL_DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_DVPANEL_TABLEHEADERContainer"+"DVPanel_TableHeader"+"\" style=\"display:none;\">") ;
         wb_table1_14_9M2( true) ;
      }
      else
      {
         wb_table1_14_9M2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprcod_Internalname, GXutil.rtrim( AV24EmprCod), GXutil.rtrim( localUtil.format( AV24EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprcod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCAL002.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom_Internalname, GXutil.rtrim( AV25EmprNom), GXutil.rtrim( localUtil.format( AV25EmprNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprnom_Visible, 1, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start9M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "MODIF. CALEND. HORAS NO PROD.", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup9M0( ) ;
   }

   public void ws9M2( )
   {
      start9M2( ) ;
      evt9M2( ) ;
   }

   public void evt9M2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e119M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e129M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e139M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "BINOCULARS.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e149M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e159M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                              }
                              dynload_actions( ) ;
                           }
                           /* No code required for Cancel button. It is implemented as the Reset button. */
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we9M2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa9M2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavUsurcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void send_integrity_hashes( )
   {
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavDiasem.getItemCount() > 0 )
      {
         AV13DiaSem = (byte)(GXutil.lval( cmbavDiasem.getValidValue(GXutil.trim( GXutil.str( AV13DiaSem, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13DiaSem", GXutil.str( AV13DiaSem, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDiasem.setValue( GXutil.trim( GXutil.str( AV13DiaSem, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDiasem.getInternalname(), "Values", cmbavDiasem.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf9M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavMaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquina_Enabled), 5, 0), true);
      edtavMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMm_Enabled), 5, 0), true);
      edtavAa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAa_Enabled), 5, 0), true);
   }

   public void rf9M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e159M2 ();
         wb9M0( ) ;
      }
   }

   public void send_integrity_lvl_hashes9M2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavToday_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToday_Enabled), 5, 0), true);
      edtavUsurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUsurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUsurcod_Enabled), 5, 0), true);
      edtavMaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquina_Enabled), 5, 0), true);
      edtavMm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMm_Enabled), 5, 0), true);
      edtavAa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAa_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup9M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e119M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV63MaqHnpI3i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI3I"), 0)) ;
         AV62MaqHnpI3f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI3F"), 0)) ;
         AV61MaqHnpI2i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI2I"), 0)) ;
         AV60MaqHnpi2f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI2F"), 0)) ;
         AV59MaqHnpI1i = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI1I"), 0)) ;
         AV58MaqHnpI1f = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "vMAQHNPI1F"), 0)) ;
         Dvpanel_dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DVPANEL_TABLEHEADER_Autoscroll")) ;
         /* Read variables values. */
         Gx_date = localUtil.ctod( httpContext.cgiGet( edtavToday_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_date", localUtil.format(Gx_date, "99/99/99"));
         AV133UsurCod = httpContext.cgiGet( edtavUsurcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV133UsurCod", AV133UsurCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDdini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDdini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDDINI");
            GX_FocusControl = edtavDdini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10DDINI = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDINI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DDINI), 2, 0));
         }
         else
         {
            AV10DDINI = (byte)(localUtil.ctol( httpContext.cgiGet( edtavDdini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10DDINI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DDINI), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDdfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDdfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDDFI");
            GX_FocusControl = edtavDdfi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9DDFI = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9DDFI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DDFI), 2, 0));
         }
         else
         {
            AV9DDFI = (byte)(localUtil.ctol( httpContext.cgiGet( edtavDdfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9DDFI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DDFI), 2, 0));
         }
         cmbavDiasem.setValue( httpContext.cgiGet( cmbavDiasem.getInternalname()) );
         AV13DiaSem = (byte)(GXutil.lval( httpContext.cgiGet( cmbavDiasem.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13DiaSem", GXutil.str( AV13DiaSem, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHnpdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHnpdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHNPDIA");
            GX_FocusControl = edtavHnpdia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39HNPDIA = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39HNPDIA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39HNPDIA), 2, 0));
         }
         else
         {
            AV39HNPDIA = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHnpdia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39HNPDIA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39HNPDIA), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO1_HORAS");
            GX_FocusControl = edtavIniciaintervalo1_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV141IniciaIntervalo1_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141IniciaIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141IniciaIntervalo1_Horas), 2, 0));
         }
         else
         {
            AV141IniciaIntervalo1_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV141IniciaIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141IniciaIntervalo1_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO1_MINUTOS");
            GX_FocusControl = edtavIniciaintervalo1_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV142IniciaIntervalo1_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142IniciaIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV142IniciaIntervalo1_Minutos), 2, 0));
         }
         else
         {
            AV142IniciaIntervalo1_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV142IniciaIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV142IniciaIntervalo1_Minutos), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO1_HORAS");
            GX_FocusControl = edtavFinalintervalo1_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV135FinalIntervalo1_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135FinalIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV135FinalIntervalo1_Horas), 2, 0));
         }
         else
         {
            AV135FinalIntervalo1_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV135FinalIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV135FinalIntervalo1_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO1_MINUTOS");
            GX_FocusControl = edtavFinalintervalo1_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV136FinalIntervalo1_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136FinalIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136FinalIntervalo1_Minutos), 2, 0));
         }
         else
         {
            AV136FinalIntervalo1_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo1_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV136FinalIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136FinalIntervalo1_Minutos), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO2_HORAS");
            GX_FocusControl = edtavIniciaintervalo2_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV143IniciaIntervalo2_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143IniciaIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143IniciaIntervalo2_Horas), 2, 0));
         }
         else
         {
            AV143IniciaIntervalo2_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143IniciaIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143IniciaIntervalo2_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO2_MINUTOS");
            GX_FocusControl = edtavIniciaintervalo2_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV144IniciaIntervalo2_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144IniciaIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144IniciaIntervalo2_Minutos), 2, 0));
         }
         else
         {
            AV144IniciaIntervalo2_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV144IniciaIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144IniciaIntervalo2_Minutos), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO2_HORAS");
            GX_FocusControl = edtavFinalintervalo2_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV137FinalIntervalo2_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137FinalIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137FinalIntervalo2_Horas), 2, 0));
         }
         else
         {
            AV137FinalIntervalo2_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137FinalIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137FinalIntervalo2_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO2_MINUTOS");
            GX_FocusControl = edtavFinalintervalo2_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV138FinalIntervalo2_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138FinalIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138FinalIntervalo2_Minutos), 2, 0));
         }
         else
         {
            AV138FinalIntervalo2_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo2_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV138FinalIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138FinalIntervalo2_Minutos), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO3_HORAS");
            GX_FocusControl = edtavIniciaintervalo3_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV145IniciaIntervalo3_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145IniciaIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145IniciaIntervalo3_Horas), 2, 0));
         }
         else
         {
            AV145IniciaIntervalo3_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV145IniciaIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145IniciaIntervalo3_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINICIAINTERVALO3_MINUTOS");
            GX_FocusControl = edtavIniciaintervalo3_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV146IniciaIntervalo3_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146IniciaIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146IniciaIntervalo3_Minutos), 2, 0));
         }
         else
         {
            AV146IniciaIntervalo3_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIniciaintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146IniciaIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146IniciaIntervalo3_Minutos), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO3_HORAS");
            GX_FocusControl = edtavFinalintervalo3_horas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV139FinalIntervalo3_Horas = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139FinalIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139FinalIntervalo3_Horas), 2, 0));
         }
         else
         {
            AV139FinalIntervalo3_Horas = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_horas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV139FinalIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139FinalIntervalo3_Horas), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < -9 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFINALINTERVALO3_MINUTOS");
            GX_FocusControl = edtavFinalintervalo3_minutos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV140FinalIntervalo3_Minutos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140FinalIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140FinalIntervalo3_Minutos), 2, 0));
         }
         else
         {
            AV140FinalIntervalo3_Minutos = (byte)(localUtil.ctol( httpContext.cgiGet( edtavFinalintervalo3_minutos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140FinalIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140FinalIntervalo3_Minutos), 2, 0));
         }
         AV25EmprNom = httpContext.cgiGet( edtavEmprnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e119M2 ();
      if (returnInSub) return;
   }

   public void e119M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV10DDINI = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10DDINI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DDINI), 2, 0));
      AV9DDFI = (byte)(GXutil.day( GXutil.eomdate( localUtil.ymdtod( AV5AA, AV65MM, 1)))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9DDFI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DDFI), 2, 0));
      GXt_char1 = AV78Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwcal002_impl.this.GXt_char1 = GXv_char2[0] ;
      AV78Station = GXt_char1 ;
      GXv_char2[0] = AV157CargueEmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV133UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwcal002_impl.this.AV157CargueEmprCod = GXv_char2[0] ;
      webwcal002_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwcal002_impl.this.AV133UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV133UsurCod", AV133UsurCod);
      GXv_int5[0] = AV41IntHnp ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "INTHNP", ""), GXv_int5) ;
      webwcal002_impl.this.AV41IntHnp = GXv_int5[0] ;
      GXt_char1 = AV78Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwcal002_impl.this.GXt_char1 = GXv_char4[0] ;
      AV78Station = GXt_char1 ;
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV133UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV78Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwcal002_impl.this.AV24EmprCod = GXv_char4[0] ;
      webwcal002_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwcal002_impl.this.AV133UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV133UsurCod", AV133UsurCod);
      tblDvpanel_tableheader_Width = 800 ;
      httpContext.ajax_rsp_assign_prop("", false, tblDvpanel_tableheader_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblDvpanel_tableheader_Width), 9, 0), true);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavEmprcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Visible), 5, 0), true);
      edtavEmprnom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom_Visible), 5, 0), true);
   }

   public void e129M2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = AV64MAQUINA ;
      GXv_int6[0] = AV5AA ;
      GXv_int5[0] = AV65MM ;
      new app.pmaqhnp(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6, GXv_int5) ;
      webwcal002_impl.this.AV24EmprCod = GXv_char4[0] ;
      webwcal002_impl.this.AV64MAQUINA = GXv_char3[0] ;
      webwcal002_impl.this.AV5AA = GXv_int6[0] ;
      webwcal002_impl.this.AV65MM = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV64MAQUINA", AV64MAQUINA);
      httpContext.ajax_rsp_assign_attri("", false, "AV5AA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AA), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV65MM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MM), 2, 0));
      /* Execute user subroutine: 'ARREGLOINTERVALO' */
      S122 ();
      if (returnInSub) return;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      cmbavDiasem.setValue( GXutil.trim( GXutil.str( AV13DiaSem, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDiasem.getInternalname(), "Values", cmbavDiasem.ToJavascriptSource(), true);
   }

   public void e139M2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTablecalendar_Visible = (((0==AV39HNPDIA)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecalendar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecalendar_Visible), 5, 0), true);
   }

   public void e149M2( )
   {
      /* Binoculars_Click Routine */
      returnInSub = false ;
      AV158Mensaje = "" ;
      AV159CantidadRegistros = (short)(0) ;
      /* Using cursor H009M2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, AV64MAQUINA, Short.valueOf(AV5AA), Byte.valueOf(AV65MM), Byte.valueOf(AV10DDINI), Byte.valueOf(AV9DDFI)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5123MaqHnpDia = H009M2_A5123MaqHnpDia[0] ;
         A614MaqMes = H009M2_A614MaqMes[0] ;
         A599MaqAny = H009M2_A599MaqAny[0] ;
         A602MaqCod = H009M2_A602MaqCod[0] ;
         A396EmprCod = H009M2_A396EmprCod[0] ;
         A5124MaqHnpI1i = H009M2_A5124MaqHnpI1i[0] ;
         n5124MaqHnpI1i = H009M2_n5124MaqHnpI1i[0] ;
         A5125MaqHnpI1f = H009M2_A5125MaqHnpI1f[0] ;
         n5125MaqHnpI1f = H009M2_n5125MaqHnpI1f[0] ;
         A5126MaqHnpI2i = H009M2_A5126MaqHnpI2i[0] ;
         n5126MaqHnpI2i = H009M2_n5126MaqHnpI2i[0] ;
         A5127MaqHnpI2f = H009M2_A5127MaqHnpI2f[0] ;
         n5127MaqHnpI2f = H009M2_n5127MaqHnpI2f[0] ;
         A5128MaqHnpI3i = H009M2_A5128MaqHnpI3i[0] ;
         n5128MaqHnpI3i = H009M2_n5128MaqHnpI3i[0] ;
         A5129MaqHnpI3f = H009M2_A5129MaqHnpI3f[0] ;
         n5129MaqHnpI3f = H009M2_n5129MaqHnpI3f[0] ;
         AV59MaqHnpI1i = A5124MaqHnpI1i ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59MaqHnpI1i", localUtil.ttoc( AV59MaqHnpI1i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV58MaqHnpI1f = A5125MaqHnpI1f ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58MaqHnpI1f", localUtil.ttoc( AV58MaqHnpI1f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV61MaqHnpI2i = A5126MaqHnpI2i ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61MaqHnpI2i", localUtil.ttoc( AV61MaqHnpI2i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV60MaqHnpi2f = A5127MaqHnpI2f ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60MaqHnpi2f", localUtil.ttoc( AV60MaqHnpi2f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV63MaqHnpI3i = A5128MaqHnpI3i ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MaqHnpI3i", localUtil.ttoc( AV63MaqHnpI3i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV62MaqHnpI3f = A5129MaqHnpI3f ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62MaqHnpI3f", localUtil.ttoc( AV62MaqHnpI3f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV141IniciaIntervalo1_Horas = (byte)(GXutil.hour( A5124MaqHnpI1i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV141IniciaIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV141IniciaIntervalo1_Horas), 2, 0));
         AV142IniciaIntervalo1_Minutos = (byte)(GXutil.minute( A5124MaqHnpI1i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142IniciaIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV142IniciaIntervalo1_Minutos), 2, 0));
         AV135FinalIntervalo1_Horas = (byte)(GXutil.hour( A5125MaqHnpI1f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV135FinalIntervalo1_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV135FinalIntervalo1_Horas), 2, 0));
         AV136FinalIntervalo1_Minutos = (byte)(GXutil.minute( A5125MaqHnpI1f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV136FinalIntervalo1_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV136FinalIntervalo1_Minutos), 2, 0));
         AV143IniciaIntervalo2_Horas = (byte)(GXutil.hour( A5126MaqHnpI2i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV143IniciaIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143IniciaIntervalo2_Horas), 2, 0));
         AV144IniciaIntervalo2_Minutos = (byte)(GXutil.minute( A5126MaqHnpI2i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV144IniciaIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144IniciaIntervalo2_Minutos), 2, 0));
         AV137FinalIntervalo2_Horas = (byte)(GXutil.hour( A5127MaqHnpI2f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV137FinalIntervalo2_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137FinalIntervalo2_Horas), 2, 0));
         AV138FinalIntervalo2_Minutos = (byte)(GXutil.minute( A5127MaqHnpI2f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV138FinalIntervalo2_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138FinalIntervalo2_Minutos), 2, 0));
         AV145IniciaIntervalo3_Horas = (byte)(GXutil.hour( A5128MaqHnpI3i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV145IniciaIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145IniciaIntervalo3_Horas), 2, 0));
         AV146IniciaIntervalo3_Minutos = (byte)(GXutil.minute( A5128MaqHnpI3i)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV146IniciaIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146IniciaIntervalo3_Minutos), 2, 0));
         AV139FinalIntervalo3_Horas = (byte)(GXutil.hour( A5129MaqHnpI3f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV139FinalIntervalo3_Horas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139FinalIntervalo3_Horas), 2, 0));
         AV140FinalIntervalo3_Minutos = (byte)(GXutil.minute( A5129MaqHnpI3f)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV140FinalIntervalo3_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140FinalIntervalo3_Minutos), 2, 0));
         AV159CantidadRegistros = (short)(AV159CantidadRegistros+1) ;
         AV160DiaCargado = localUtil.ymdtod( A599MaqAny, A614MaqMes, A5123MaqHnpDia) ;
         AV158Mensaje = GXutil.format( httpContext.getMessage( "Los intervalos cargados son los registrado para el %1", ""), localUtil.dtoc( AV160DiaCargado, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), "", "", "", "", "", "", "", "") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV159CantidadRegistros > 1 )
      {
         httpContext.GX_msglist.addItem(AV158Mensaje);
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ARREGLOINTERVALO' Routine */
      returnInSub = false ;
      AV156FechaVacia = GXutil.nullDate() ;
      if ( AV39HNPDIA < 0 )
      {
         AV39HNPDIA = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39HNPDIA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39HNPDIA), 2, 0));
      }
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = AV64MAQUINA ;
      GXv_int5[0] = AV65MM ;
      GXv_int6[0] = AV5AA ;
      GXv_int7[0] = AV10DDINI ;
      GXv_int8[0] = AV9DDFI ;
      GXv_int9[0] = AV13DiaSem ;
      GXv_int10[0] = AV39HNPDIA ;
      GXv_dtime11[0] = AV58MaqHnpI1f ;
      GXv_dtime12[0] = AV59MaqHnpI1i ;
      GXv_dtime13[0] = AV60MaqHnpi2f ;
      GXv_dtime14[0] = AV61MaqHnpI2i ;
      GXv_dtime15[0] = AV62MaqHnpI3f ;
      GXv_dtime16[0] = AV63MaqHnpI3i ;
      new app.pcal012(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_int6, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_dtime11, GXv_dtime12, GXv_dtime13, GXv_dtime14, GXv_dtime15, GXv_dtime16) ;
      webwcal002_impl.this.AV24EmprCod = GXv_char4[0] ;
      webwcal002_impl.this.AV64MAQUINA = GXv_char3[0] ;
      webwcal002_impl.this.AV65MM = GXv_int5[0] ;
      webwcal002_impl.this.AV5AA = GXv_int6[0] ;
      webwcal002_impl.this.AV10DDINI = GXv_int7[0] ;
      webwcal002_impl.this.AV9DDFI = GXv_int8[0] ;
      webwcal002_impl.this.AV13DiaSem = GXv_int9[0] ;
      webwcal002_impl.this.AV39HNPDIA = GXv_int10[0] ;
      webwcal002_impl.this.AV58MaqHnpI1f = GXv_dtime11[0] ;
      webwcal002_impl.this.AV59MaqHnpI1i = GXv_dtime12[0] ;
      webwcal002_impl.this.AV60MaqHnpi2f = GXv_dtime13[0] ;
      webwcal002_impl.this.AV61MaqHnpI2i = GXv_dtime14[0] ;
      webwcal002_impl.this.AV62MaqHnpI3f = GXv_dtime15[0] ;
      webwcal002_impl.this.AV63MaqHnpI3i = GXv_dtime16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV64MAQUINA", AV64MAQUINA);
      httpContext.ajax_rsp_assign_attri("", false, "AV65MM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MM), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5AA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AA), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10DDINI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10DDINI), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9DDFI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9DDFI), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV13DiaSem", GXutil.str( AV13DiaSem, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV39HNPDIA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39HNPDIA), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV58MaqHnpI1f", localUtil.ttoc( AV58MaqHnpI1f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV59MaqHnpI1i", localUtil.ttoc( AV59MaqHnpI1i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV60MaqHnpi2f", localUtil.ttoc( AV60MaqHnpi2f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV61MaqHnpI2i", localUtil.ttoc( AV61MaqHnpI2i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV62MaqHnpI3f", localUtil.ttoc( AV62MaqHnpI3f, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV63MaqHnpI3i", localUtil.ttoc( AV63MaqHnpI3i, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
   }

   protected void nextLoad( )
   {
   }

   protected void e159M2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_14_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         sStyleString += " width: " + GXutil.ltrimstr( DecimalUtil.doubleToDec(tblDvpanel_tableheader_Width), 10, 0) + "px" + ";" ;
         app.GxWebStd.gx_table_start( httpContext, tblDvpanel_tableheader_Internalname, tblDvpanel_tableheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavToday_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavToday_Internalname, httpContext.getMessage( "Data", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavToday_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavToday_Internalname, localUtil.format(Gx_date, "99/99/99"), localUtil.format( Gx_date, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavToday_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavToday_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavToday_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavToday_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWCAL002.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUsurcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUsurcod_Internalname, httpContext.getMessage( "Operador", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUsurcod_Internalname, GXutil.rtrim( AV133UsurCod), GXutil.rtrim( localUtil.format( AV133UsurCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUsurcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUsurcod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaquina_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaquina_Internalname, httpContext.getMessage( "Máquina", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaquina_Internalname, GXutil.rtrim( AV64MAQUINA), GXutil.rtrim( localUtil.format( AV64MAQUINA, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaquina_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaquina_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMm_Internalname, httpContext.getMessage( "Mes", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMm_Internalname, GXutil.ltrim( localUtil.ntoc( AV65MM, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65MM), "99") : localUtil.format( DecimalUtil.doubleToDec(AV65MM), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMm_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAa_Internalname, httpContext.getMessage( "Año", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAa_Internalname, GXutil.ltrim( localUtil.ntoc( AV5AA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5AA), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5AA), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAa_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblEspacio_Internalname, " ", "", "", lblEspacio_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintablebody_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDdini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDdini_Internalname, httpContext.getMessage( "Primer Dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdini_Internalname, GXutil.ltrim( localUtil.ntoc( AV10DDINI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDdini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10DDINI), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV10DDINI), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDdini_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDdfi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDdfi_Internalname, httpContext.getMessage( "Ultimo Dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdfi_Internalname, GXutil.ltrim( localUtil.ntoc( AV9DDFI, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDdfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9DDFI), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV9DDFI), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdfi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDdfi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavDiasem.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDiasem.getInternalname(), httpContext.getMessage( "Dia Semana", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDiasem, cmbavDiasem.getInternalname(), GXutil.trim( GXutil.str( AV13DiaSem, 1, 0)), 1, cmbavDiasem.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavDiasem.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "", true, (byte)(0), "HLP_WebWCAL002.htm");
         cmbavDiasem.setValue( GXutil.trim( GXutil.str( AV13DiaSem, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDiasem.getInternalname(), "Values", cmbavDiasem.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHnpdia_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHnpdia_Internalname, httpContext.getMessage( "Horas No Prod.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHnpdia_Internalname, GXutil.ltrim( localUtil.ntoc( AV39HNPDIA, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavHnpdia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39HNPDIA), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39HNPDIA), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHnpdia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHnpdia_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecalendar_Internalname, divTablecalendar_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBinoculars_Internalname, httpContext.getMessage( " Cargar Intervalos", ""), "", "", lblBinoculars_Jsonclick, "'"+""+"'"+",false,"+"'"+"EBINOCULARS.CLICK."+"'", "", "fas fa-binoculars", 5, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody3a_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 TextWebWCAL002", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblIntervalo1_Internalname, httpContext.getMessage( "Intervalo 1", ""), "", "", lblIntervalo1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "Center", "top", "", "", "div");
         wb_table2_79_9M2( true) ;
      }
      else
      {
         wb_table2_79_9M2( false) ;
      }
      return  ;
   }

   public void wb_table2_79_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody3b_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 TextWebWCAL002", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblIntervalo2_Internalname, httpContext.getMessage( "Intervalo 2", ""), "", "", lblIntervalo2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         wb_table3_112_9M2( true) ;
      }
      else
      {
         wb_table3_112_9M2( false) ;
      }
      return  ;
   }

   public void wb_table3_112_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebody3c_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 TextWebWCAL002", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblIntervalo3_Internalname, httpContext.getMessage( "Intervalo 3", ""), "", "", lblIntervalo3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         wb_table4_145_9M2( true) ;
      }
      else
      {
         wb_table4_145_9M2( false) ;
      }
      return  ;
   }

   public void wb_table4_145_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblEspacio1_Internalname, " ", "", "", lblEspacio1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_9M2e( true) ;
      }
      else
      {
         wb_table1_14_9M2e( false) ;
      }
   }

   public void wb_table4_145_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable1_Internalname, tblTablemergedunnamedtable1_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         wb_table5_148_9M2( true) ;
      }
      else
      {
         wb_table5_148_9M2( false) ;
      }
      return  ;
   }

   public void wb_table5_148_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparador3_Internalname, "-", "", "", lblSeparador3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SeparadorAlign", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table6_161_9M2( true) ;
      }
      else
      {
         wb_table6_161_9M2( false) ;
      }
      return  ;
   }

   public void wb_table6_161_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_145_9M2e( true) ;
      }
      else
      {
         wb_table4_145_9M2e( false) ;
      }
   }

   public void wb_table6_161_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo3_horas_Internalname, httpContext.getMessage( "Final Intervalo3_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo3_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV139FinalIntervalo3_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo3_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV139FinalIntervalo3_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV139FinalIntervalo3_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo3_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo3_horas_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras6_Internalname, ":", "", "", lblSeparadorhoras6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo3_minutos_Internalname, httpContext.getMessage( "Final Intervalo3_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo3_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV140FinalIntervalo3_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo3_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV140FinalIntervalo3_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV140FinalIntervalo3_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo3_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo3_minutos_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_161_9M2e( true) ;
      }
      else
      {
         wb_table6_161_9M2e( false) ;
      }
   }

   public void wb_table5_148_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo3_horas_Internalname, httpContext.getMessage( "Inicia Intervalo3_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo3_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV145IniciaIntervalo3_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo3_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV145IniciaIntervalo3_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV145IniciaIntervalo3_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo3_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo3_horas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras5_Internalname, ":", "", "", lblSeparadorhoras5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo3_minutos_Internalname, httpContext.getMessage( "Inicia Intervalo3_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo3_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV146IniciaIntervalo3_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo3_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV146IniciaIntervalo3_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV146IniciaIntervalo3_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo3_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo3_minutos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_148_9M2e( true) ;
      }
      else
      {
         wb_table5_148_9M2e( false) ;
      }
   }

   public void wb_table3_112_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable3_Internalname, tblTablemergedunnamedtable3_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         wb_table7_115_9M2( true) ;
      }
      else
      {
         wb_table7_115_9M2( false) ;
      }
      return  ;
   }

   public void wb_table7_115_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparador2_Internalname, "-", "", "", lblSeparador2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SeparadorAlign", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table8_128_9M2( true) ;
      }
      else
      {
         wb_table8_128_9M2( false) ;
      }
      return  ;
   }

   public void wb_table8_128_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_112_9M2e( true) ;
      }
      else
      {
         wb_table3_112_9M2e( false) ;
      }
   }

   public void wb_table8_128_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo2_horas_Internalname, httpContext.getMessage( "Final Intervalo2_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo2_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV137FinalIntervalo2_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo2_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV137FinalIntervalo2_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV137FinalIntervalo2_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo2_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo2_horas_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras4_Internalname, ":", "", "", lblSeparadorhoras4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo2_minutos_Internalname, httpContext.getMessage( "Final Intervalo2_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo2_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV138FinalIntervalo2_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo2_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV138FinalIntervalo2_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV138FinalIntervalo2_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo2_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo2_minutos_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_128_9M2e( true) ;
      }
      else
      {
         wb_table8_128_9M2e( false) ;
      }
   }

   public void wb_table7_115_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo2_horas_Internalname, httpContext.getMessage( "Inicia Intervalo2_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo2_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV143IniciaIntervalo2_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo2_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV143IniciaIntervalo2_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV143IniciaIntervalo2_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo2_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo2_horas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras3_Internalname, ":", "", "", lblSeparadorhoras3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo2_minutos_Internalname, httpContext.getMessage( "Inicia Intervalo2_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo2_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV144IniciaIntervalo2_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo2_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV144IniciaIntervalo2_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV144IniciaIntervalo2_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo2_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo2_minutos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_115_9M2e( true) ;
      }
      else
      {
         wb_table7_115_9M2e( false) ;
      }
   }

   public void wb_table2_79_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedunnamedtable5_Internalname, tblTablemergedunnamedtable5_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         wb_table9_82_9M2( true) ;
      }
      else
      {
         wb_table9_82_9M2( false) ;
      }
      return  ;
   }

   public void wb_table9_82_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparador_Internalname, "-", "", "", lblSeparador_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "SeparadorAlign", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         wb_table10_95_9M2( true) ;
      }
      else
      {
         wb_table10_95_9M2( false) ;
      }
      return  ;
   }

   public void wb_table10_95_9M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_79_9M2e( true) ;
      }
      else
      {
         wb_table2_79_9M2e( false) ;
      }
   }

   public void wb_table10_95_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable6_Internalname, tblUnnamedtable6_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo1_horas_Internalname, httpContext.getMessage( "Final Intervalo1_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo1_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV135FinalIntervalo1_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo1_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV135FinalIntervalo1_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV135FinalIntervalo1_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo1_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo1_horas_Enabled, 0, "text", "1", 1, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\" class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras2_Internalname, ":", "", "", lblSeparadorhoras2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFinalintervalo1_minutos_Internalname, httpContext.getMessage( "Final Intervalo1_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFinalintervalo1_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV136FinalIntervalo1_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFinalintervalo1_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV136FinalIntervalo1_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV136FinalIntervalo1_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFinalintervalo1_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFinalintervalo1_minutos_Enabled, 0, "text", "1", 1, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_95_9M2e( true) ;
      }
      else
      {
         wb_table10_95_9M2e( false) ;
      }
   }

   public void wb_table9_82_9M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Right\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Right;text-align:-moz-Right;text-align:-webkit-Right")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo1_horas_Internalname, httpContext.getMessage( "Inicia Intervalo1_Horas", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo1_horas_Internalname, GXutil.ltrim( localUtil.ntoc( AV141IniciaIntervalo1_Horas, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo1_horas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV141IniciaIntervalo1_Horas), "99") : localUtil.format( DecimalUtil.doubleToDec(AV141IniciaIntervalo1_Horas), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo1_horas_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo1_horas_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\" class='SeparadorHoras'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSeparadorhoras1_Internalname, ":", "", "", lblSeparadorhoras1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebWCAL002.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIniciaintervalo1_minutos_Internalname, httpContext.getMessage( "Inicia Intervalo1_Minutos", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIniciaintervalo1_minutos_Internalname, GXutil.ltrim( localUtil.ntoc( AV142IniciaIntervalo1_Minutos, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIniciaintervalo1_minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV142IniciaIntervalo1_Minutos), "99") : localUtil.format( DecimalUtil.doubleToDec(AV142IniciaIntervalo1_Minutos), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIniciaintervalo1_minutos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIniciaintervalo1_minutos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "left", false, "", "HLP_WebWCAL002.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_82_9M2e( true) ;
      }
      else
      {
         wb_table9_82_9M2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV24EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      AV64MAQUINA = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64MAQUINA", AV64MAQUINA);
      AV65MM = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65MM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65MM), 2, 0));
      AV5AA = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5AA), 4, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa9M2( ) ;
      ws9M2( ) ;
      we9M2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116113028", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("webwcal002.js", "?202682116113028", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavToday_Internalname = "vTODAY" ;
      edtavUsurcod_Internalname = "vUSURCOD" ;
      edtavMaquina_Internalname = "vMAQUINA" ;
      edtavMm_Internalname = "vMM" ;
      edtavAa_Internalname = "vAA" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      lblEspacio_Internalname = "ESPACIO" ;
      edtavDdini_Internalname = "vDDINI" ;
      edtavDdfi_Internalname = "vDDFI" ;
      cmbavDiasem.setInternalname( "vDIASEM" );
      edtavHnpdia_Internalname = "vHNPDIA" ;
      divTablebody_Internalname = "TABLEBODY" ;
      lblBinoculars_Internalname = "BINOCULARS" ;
      lblIntervalo1_Internalname = "INTERVALO1" ;
      edtavIniciaintervalo1_horas_Internalname = "vINICIAINTERVALO1_HORAS" ;
      lblSeparadorhoras1_Internalname = "SEPARADORHORAS1" ;
      edtavIniciaintervalo1_minutos_Internalname = "vINICIAINTERVALO1_MINUTOS" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblSeparador_Internalname = "SEPARADOR" ;
      edtavFinalintervalo1_horas_Internalname = "vFINALINTERVALO1_HORAS" ;
      lblSeparadorhoras2_Internalname = "SEPARADORHORAS2" ;
      edtavFinalintervalo1_minutos_Internalname = "vFINALINTERVALO1_MINUTOS" ;
      tblUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      tblTablemergedunnamedtable5_Internalname = "TABLEMERGEDUNNAMEDTABLE5" ;
      divTablebody3a_Internalname = "TABLEBODY3A" ;
      lblIntervalo2_Internalname = "INTERVALO2" ;
      edtavIniciaintervalo2_horas_Internalname = "vINICIAINTERVALO2_HORAS" ;
      lblSeparadorhoras3_Internalname = "SEPARADORHORAS3" ;
      edtavIniciaintervalo2_minutos_Internalname = "vINICIAINTERVALO2_MINUTOS" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblSeparador2_Internalname = "SEPARADOR2" ;
      edtavFinalintervalo2_horas_Internalname = "vFINALINTERVALO2_HORAS" ;
      lblSeparadorhoras4_Internalname = "SEPARADORHORAS4" ;
      edtavFinalintervalo2_minutos_Internalname = "vFINALINTERVALO2_MINUTOS" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblTablemergedunnamedtable3_Internalname = "TABLEMERGEDUNNAMEDTABLE3" ;
      divTablebody3b_Internalname = "TABLEBODY3B" ;
      lblIntervalo3_Internalname = "INTERVALO3" ;
      edtavIniciaintervalo3_horas_Internalname = "vINICIAINTERVALO3_HORAS" ;
      lblSeparadorhoras5_Internalname = "SEPARADORHORAS5" ;
      edtavIniciaintervalo3_minutos_Internalname = "vINICIAINTERVALO3_MINUTOS" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblSeparador3_Internalname = "SEPARADOR3" ;
      edtavFinalintervalo3_horas_Internalname = "vFINALINTERVALO3_HORAS" ;
      lblSeparadorhoras6_Internalname = "SEPARADORHORAS6" ;
      edtavFinalintervalo3_minutos_Internalname = "vFINALINTERVALO3_MINUTOS" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      tblTablemergedunnamedtable1_Internalname = "TABLEMERGEDUNNAMEDTABLE1" ;
      divTablebody3c_Internalname = "TABLEBODY3C" ;
      divTablecalendar_Internalname = "TABLECALENDAR" ;
      divMaintablebody_Internalname = "MAINTABLEBODY" ;
      lblEspacio1_Internalname = "ESPACIO1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      tblDvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      Dvpanel_dvpanel_tableheader_Internalname = "DVPANEL_DVPANEL_TABLEHEADER" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavEmprcod_Internalname = "vEMPRCOD" ;
      edtavEmprnom_Internalname = "vEMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      edtavIniciaintervalo1_minutos_Jsonclick = "" ;
      edtavIniciaintervalo1_minutos_Enabled = 1 ;
      edtavIniciaintervalo1_horas_Jsonclick = "" ;
      edtavIniciaintervalo1_horas_Enabled = 1 ;
      edtavFinalintervalo1_minutos_Jsonclick = "" ;
      edtavFinalintervalo1_minutos_Enabled = 1 ;
      edtavFinalintervalo1_horas_Jsonclick = "" ;
      edtavFinalintervalo1_horas_Enabled = 1 ;
      edtavIniciaintervalo2_minutos_Jsonclick = "" ;
      edtavIniciaintervalo2_minutos_Enabled = 1 ;
      edtavIniciaintervalo2_horas_Jsonclick = "" ;
      edtavIniciaintervalo2_horas_Enabled = 1 ;
      edtavFinalintervalo2_minutos_Jsonclick = "" ;
      edtavFinalintervalo2_minutos_Enabled = 1 ;
      edtavFinalintervalo2_horas_Jsonclick = "" ;
      edtavFinalintervalo2_horas_Enabled = 1 ;
      edtavIniciaintervalo3_minutos_Jsonclick = "" ;
      edtavIniciaintervalo3_minutos_Enabled = 1 ;
      edtavIniciaintervalo3_horas_Jsonclick = "" ;
      edtavIniciaintervalo3_horas_Enabled = 1 ;
      edtavFinalintervalo3_minutos_Jsonclick = "" ;
      edtavFinalintervalo3_minutos_Enabled = 1 ;
      edtavFinalintervalo3_horas_Jsonclick = "" ;
      edtavFinalintervalo3_horas_Enabled = 1 ;
      divTablecalendar_Visible = 1 ;
      edtavHnpdia_Jsonclick = "" ;
      edtavHnpdia_Enabled = 1 ;
      cmbavDiasem.setJsonclick( "" );
      cmbavDiasem.setEnabled( 1 );
      edtavDdfi_Jsonclick = "" ;
      edtavDdfi_Enabled = 1 ;
      edtavDdini_Jsonclick = "" ;
      edtavDdini_Enabled = 1 ;
      edtavAa_Jsonclick = "" ;
      edtavAa_Enabled = 0 ;
      edtavMm_Jsonclick = "" ;
      edtavMm_Enabled = 0 ;
      edtavMaquina_Jsonclick = "" ;
      edtavMaquina_Enabled = 0 ;
      edtavUsurcod_Jsonclick = "" ;
      edtavUsurcod_Enabled = 1 ;
      edtavToday_Jsonclick = "" ;
      edtavToday_Enabled = 0 ;
      tblDvpanel_tableheader_Width = 0 ;
      edtavEmprnom_Jsonclick = "" ;
      edtavEmprnom_Visible = 1 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Visible = 1 ;
      Dvpanel_dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_dvpanel_tableheader_Title = "" ;
      Dvpanel_dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MODIF. CALEND. HORAS NO PROD.", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDiasem.setName( "vDIASEM" );
      cmbavDiasem.setWebtags( "" );
      cmbavDiasem.addItem("0", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavDiasem.addItem("1", httpContext.getMessage( "Domingo", ""), (short)(0));
      cmbavDiasem.addItem("2", httpContext.getMessage( "Lunes", ""), (short)(0));
      cmbavDiasem.addItem("3", httpContext.getMessage( "Martes", ""), (short)(0));
      cmbavDiasem.addItem("4", httpContext.getMessage( "Miercoles", ""), (short)(0));
      cmbavDiasem.addItem("5", httpContext.getMessage( "Jueves", ""), (short)(0));
      cmbavDiasem.addItem("6", httpContext.getMessage( "Viernes", ""), (short)(0));
      cmbavDiasem.addItem("7", httpContext.getMessage( "Sabado", ""), (short)(0));
      if ( cmbavDiasem.getItemCount() > 0 )
      {
         AV13DiaSem = (byte)(GXutil.lval( cmbavDiasem.getValidValue(GXutil.trim( GXutil.str( AV13DiaSem, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13DiaSem", GXutil.str( AV13DiaSem, 1, 0));
      }
      /* End function init_web_controls */
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public String ajaxOnSessionTimeout( )
   {
      httpContext.setAjaxOnSessionTimeout("Warn");
      return "Warn" ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e129M2',iparms:[{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64MAQUINA',fld:'vMAQUINA',pic:''},{av:'AV5AA',fld:'vAA',pic:'ZZZ9'},{av:'AV65MM',fld:'vMM',pic:'99'},{av:'AV39HNPDIA',fld:'vHNPDIA',pic:'ZZ9'},{av:'AV10DDINI',fld:'vDDINI',pic:'Z9'},{av:'AV9DDFI',fld:'vDDFI',pic:'Z9'},{av:'cmbavDiasem'},{av:'AV13DiaSem',fld:'vDIASEM',pic:'9'},{av:'AV58MaqHnpI1f',fld:'vMAQHNPI1F',pic:'99:99'},{av:'AV59MaqHnpI1i',fld:'vMAQHNPI1I',pic:'99:99'},{av:'AV60MaqHnpi2f',fld:'vMAQHNPI2F',pic:'99:99'},{av:'AV61MaqHnpI2i',fld:'vMAQHNPI2I',pic:'99:99'},{av:'AV62MaqHnpI3f',fld:'vMAQHNPI3F',pic:'99:99'},{av:'AV63MaqHnpI3i',fld:'vMAQHNPI3I',pic:'99:99'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV65MM',fld:'vMM',pic:'99'},{av:'AV5AA',fld:'vAA',pic:'ZZZ9'},{av:'AV64MAQUINA',fld:'vMAQUINA',pic:''},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39HNPDIA',fld:'vHNPDIA',pic:'ZZ9'},{av:'AV63MaqHnpI3i',fld:'vMAQHNPI3I',pic:'99:99'},{av:'AV62MaqHnpI3f',fld:'vMAQHNPI3F',pic:'99:99'},{av:'AV61MaqHnpI2i',fld:'vMAQHNPI2I',pic:'99:99'},{av:'AV60MaqHnpi2f',fld:'vMAQHNPI2F',pic:'99:99'},{av:'AV59MaqHnpI1i',fld:'vMAQHNPI1I',pic:'99:99'},{av:'AV58MaqHnpI1f',fld:'vMAQHNPI1F',pic:'99:99'},{av:'cmbavDiasem'},{av:'AV13DiaSem',fld:'vDIASEM',pic:'9'},{av:'AV9DDFI',fld:'vDDFI',pic:'Z9'},{av:'AV10DDINI',fld:'vDDINI',pic:'Z9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e139M2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("BINOCULARS.CLICK","{handler:'e149M2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A599MaqAny',fld:'MAQANY',pic:'ZZZ9'},{av:'A614MaqMes',fld:'MAQMES',pic:'99'},{av:'A5123MaqHnpDia',fld:'MAQHNPDIA',pic:'Z9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64MAQUINA',fld:'vMAQUINA',pic:''},{av:'AV5AA',fld:'vAA',pic:'ZZZ9'},{av:'AV65MM',fld:'vMM',pic:'99'},{av:'AV10DDINI',fld:'vDDINI',pic:'Z9'},{av:'AV9DDFI',fld:'vDDFI',pic:'Z9'},{av:'A5124MaqHnpI1i',fld:'MAQHNPI1I',pic:'99:99'},{av:'A5125MaqHnpI1f',fld:'MAQHNPI1F',pic:'99:99'},{av:'A5126MaqHnpI2i',fld:'MAQHNPI2I',pic:'99:99'},{av:'A5127MaqHnpI2f',fld:'MAQHNPI2F',pic:'99:99'},{av:'A5128MaqHnpI3i',fld:'MAQHNPI3I',pic:'99:99'},{av:'A5129MaqHnpI3f',fld:'MAQHNPI3F',pic:'99:99'}]");
      setEventMetadata("BINOCULARS.CLICK",",oparms:[{av:'AV59MaqHnpI1i',fld:'vMAQHNPI1I',pic:'99:99'},{av:'AV58MaqHnpI1f',fld:'vMAQHNPI1F',pic:'99:99'},{av:'AV61MaqHnpI2i',fld:'vMAQHNPI2I',pic:'99:99'},{av:'AV60MaqHnpi2f',fld:'vMAQHNPI2F',pic:'99:99'},{av:'AV63MaqHnpI3i',fld:'vMAQHNPI3I',pic:'99:99'},{av:'AV62MaqHnpI3f',fld:'vMAQHNPI3F',pic:'99:99'},{av:'AV141IniciaIntervalo1_Horas',fld:'vINICIAINTERVALO1_HORAS',pic:'99'},{av:'AV142IniciaIntervalo1_Minutos',fld:'vINICIAINTERVALO1_MINUTOS',pic:'99'},{av:'AV135FinalIntervalo1_Horas',fld:'vFINALINTERVALO1_HORAS',pic:'99'},{av:'AV136FinalIntervalo1_Minutos',fld:'vFINALINTERVALO1_MINUTOS',pic:'99'},{av:'AV143IniciaIntervalo2_Horas',fld:'vINICIAINTERVALO2_HORAS',pic:'99'},{av:'AV144IniciaIntervalo2_Minutos',fld:'vINICIAINTERVALO2_MINUTOS',pic:'99'},{av:'AV137FinalIntervalo2_Horas',fld:'vFINALINTERVALO2_HORAS',pic:'99'},{av:'AV138FinalIntervalo2_Minutos',fld:'vFINALINTERVALO2_MINUTOS',pic:'99'},{av:'AV145IniciaIntervalo3_Horas',fld:'vINICIAINTERVALO3_HORAS',pic:'99'},{av:'AV146IniciaIntervalo3_Minutos',fld:'vINICIAINTERVALO3_MINUTOS',pic:'99'},{av:'AV139FinalIntervalo3_Horas',fld:'vFINALINTERVALO3_HORAS',pic:'99'},{av:'AV140FinalIntervalo3_Minutos',fld:'vFINALINTERVALO3_MINUTOS',pic:'99'}]}");
      setEventMetadata("VALIDV_MAQUINA","{handler:'validv_Maquina',iparms:[]");
      setEventMetadata("VALIDV_MAQUINA",",oparms:[]}");
      setEventMetadata("VALIDV_MM","{handler:'validv_Mm',iparms:[]");
      setEventMetadata("VALIDV_MM",",oparms:[]}");
      setEventMetadata("VALIDV_AA","{handler:'validv_Aa',iparms:[]");
      setEventMetadata("VALIDV_AA",",oparms:[]}");
      setEventMetadata("VALIDV_DIASEM","{handler:'validv_Diasem',iparms:[]");
      setEventMetadata("VALIDV_DIASEM",",oparms:[]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV24EmprCod = "" ;
      wcpOAV64MAQUINA = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV24EmprCod = "" ;
      AV64MAQUINA = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV58MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      AV59MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      AV60MaqHnpi2f = GXutil.resetTime( GXutil.nullDate() );
      AV61MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      AV62MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      AV63MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A5124MaqHnpI1i = GXutil.resetTime( GXutil.nullDate() );
      A5125MaqHnpI1f = GXutil.resetTime( GXutil.nullDate() );
      A5126MaqHnpI2i = GXutil.resetTime( GXutil.nullDate() );
      A5127MaqHnpI2f = GXutil.resetTime( GXutil.nullDate() );
      A5128MaqHnpI3i = GXutil.resetTime( GXutil.nullDate() );
      A5129MaqHnpI3f = GXutil.resetTime( GXutil.nullDate() );
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_dvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV25EmprNom = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV133UsurCod = "" ;
      AV78Station = "" ;
      AV157CargueEmprCod = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV158Mensaje = "" ;
      scmdbuf = "" ;
      H009M2_A5123MaqHnpDia = new byte[1] ;
      H009M2_A614MaqMes = new byte[1] ;
      H009M2_A599MaqAny = new short[1] ;
      H009M2_A602MaqCod = new String[] {""} ;
      H009M2_A396EmprCod = new String[] {""} ;
      H009M2_A5124MaqHnpI1i = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5124MaqHnpI1i = new boolean[] {false} ;
      H009M2_A5125MaqHnpI1f = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5125MaqHnpI1f = new boolean[] {false} ;
      H009M2_A5126MaqHnpI2i = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5126MaqHnpI2i = new boolean[] {false} ;
      H009M2_A5127MaqHnpI2f = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5127MaqHnpI2f = new boolean[] {false} ;
      H009M2_A5128MaqHnpI3i = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5128MaqHnpI3i = new boolean[] {false} ;
      H009M2_A5129MaqHnpI3f = new java.util.Date[] {GXutil.nullDate()} ;
      H009M2_n5129MaqHnpI3f = new boolean[] {false} ;
      AV160DiaCargado = GXutil.nullDate() ;
      AV156FechaVacia = GXutil.nullDate() ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new byte[1] ;
      GXv_int8 = new byte[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_dtime12 = new java.util.Date[1] ;
      GXv_dtime13 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      GXv_dtime15 = new java.util.Date[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      sStyleString = "" ;
      lblEspacio_Jsonclick = "" ;
      lblBinoculars_Jsonclick = "" ;
      lblIntervalo1_Jsonclick = "" ;
      lblIntervalo2_Jsonclick = "" ;
      lblIntervalo3_Jsonclick = "" ;
      lblEspacio1_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblSeparador3_Jsonclick = "" ;
      lblSeparadorhoras6_Jsonclick = "" ;
      lblSeparadorhoras5_Jsonclick = "" ;
      lblSeparador2_Jsonclick = "" ;
      lblSeparadorhoras4_Jsonclick = "" ;
      lblSeparadorhoras3_Jsonclick = "" ;
      lblSeparador_Jsonclick = "" ;
      lblSeparadorhoras2_Jsonclick = "" ;
      lblSeparadorhoras1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwcal002__default(),
         new Object[] {
             new Object[] {
            H009M2_A5123MaqHnpDia, H009M2_A614MaqMes, H009M2_A599MaqAny, H009M2_A602MaqCod, H009M2_A396EmprCod, H009M2_A5124MaqHnpI1i, H009M2_n5124MaqHnpI1i, H009M2_A5125MaqHnpI1f, H009M2_n5125MaqHnpI1f, H009M2_A5126MaqHnpI2i,
            H009M2_n5126MaqHnpI2i, H009M2_A5127MaqHnpI2f, H009M2_n5127MaqHnpI2f, H009M2_A5128MaqHnpI3i, H009M2_n5128MaqHnpI3i, H009M2_A5129MaqHnpI3f, H009M2_n5129MaqHnpI3f
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavToday_Enabled = 0 ;
      edtavUsurcod_Enabled = 0 ;
      edtavMaquina_Enabled = 0 ;
      edtavMm_Enabled = 0 ;
      edtavAa_Enabled = 0 ;
   }

   private byte wcpOAV65MM ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV65MM ;
   private byte gxajaxcallmode ;
   private byte A614MaqMes ;
   private byte A5123MaqHnpDia ;
   private byte nDonePA ;
   private byte AV13DiaSem ;
   private byte AV10DDINI ;
   private byte AV9DDFI ;
   private byte AV39HNPDIA ;
   private byte AV141IniciaIntervalo1_Horas ;
   private byte AV142IniciaIntervalo1_Minutos ;
   private byte AV135FinalIntervalo1_Horas ;
   private byte AV136FinalIntervalo1_Minutos ;
   private byte AV143IniciaIntervalo2_Horas ;
   private byte AV144IniciaIntervalo2_Minutos ;
   private byte AV137FinalIntervalo2_Horas ;
   private byte AV138FinalIntervalo2_Minutos ;
   private byte AV145IniciaIntervalo3_Horas ;
   private byte AV146IniciaIntervalo3_Minutos ;
   private byte AV139FinalIntervalo3_Horas ;
   private byte AV140FinalIntervalo3_Minutos ;
   private byte AV41IntHnp ;
   private byte GXv_int5[] ;
   private byte GXv_int7[] ;
   private byte GXv_int8[] ;
   private byte GXv_int9[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private short wcpOAV5AA ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV5AA ;
   private short A599MaqAny ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV159CantidadRegistros ;
   private short GXv_int6[] ;
   private int edtavEmprcod_Visible ;
   private int edtavEmprnom_Visible ;
   private int edtavToday_Enabled ;
   private int edtavUsurcod_Enabled ;
   private int edtavMaquina_Enabled ;
   private int edtavMm_Enabled ;
   private int edtavAa_Enabled ;
   private int tblDvpanel_tableheader_Width ;
   private int divTablecalendar_Visible ;
   private int edtavDdini_Enabled ;
   private int edtavDdfi_Enabled ;
   private int edtavHnpdia_Enabled ;
   private int edtavFinalintervalo3_horas_Enabled ;
   private int edtavFinalintervalo3_minutos_Enabled ;
   private int edtavIniciaintervalo3_horas_Enabled ;
   private int edtavIniciaintervalo3_minutos_Enabled ;
   private int edtavFinalintervalo2_horas_Enabled ;
   private int edtavFinalintervalo2_minutos_Enabled ;
   private int edtavIniciaintervalo2_horas_Enabled ;
   private int edtavIniciaintervalo2_minutos_Enabled ;
   private int edtavFinalintervalo1_horas_Enabled ;
   private int edtavFinalintervalo1_minutos_Enabled ;
   private int edtavIniciaintervalo1_horas_Enabled ;
   private int edtavIniciaintervalo1_minutos_Enabled ;
   private int idxLst ;
   private String wcpOAV24EmprCod ;
   private String wcpOAV64MAQUINA ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV24EmprCod ;
   private String AV64MAQUINA ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String Dvpanel_dvpanel_tableheader_Width ;
   private String Dvpanel_dvpanel_tableheader_Cls ;
   private String Dvpanel_dvpanel_tableheader_Title ;
   private String Dvpanel_dvpanel_tableheader_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_dvpanel_tableheader_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavEmprcod_Internalname ;
   private String edtavEmprcod_Jsonclick ;
   private String TempTags ;
   private String edtavEmprnom_Internalname ;
   private String AV25EmprNom ;
   private String edtavEmprnom_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavUsurcod_Internalname ;
   private String edtavToday_Internalname ;
   private String edtavMaquina_Internalname ;
   private String edtavMm_Internalname ;
   private String edtavAa_Internalname ;
   private String AV133UsurCod ;
   private String edtavDdini_Internalname ;
   private String edtavDdfi_Internalname ;
   private String edtavHnpdia_Internalname ;
   private String edtavIniciaintervalo1_horas_Internalname ;
   private String edtavIniciaintervalo1_minutos_Internalname ;
   private String edtavFinalintervalo1_horas_Internalname ;
   private String edtavFinalintervalo1_minutos_Internalname ;
   private String edtavIniciaintervalo2_horas_Internalname ;
   private String edtavIniciaintervalo2_minutos_Internalname ;
   private String edtavFinalintervalo2_horas_Internalname ;
   private String edtavFinalintervalo2_minutos_Internalname ;
   private String edtavIniciaintervalo3_horas_Internalname ;
   private String edtavIniciaintervalo3_minutos_Internalname ;
   private String edtavFinalintervalo3_horas_Internalname ;
   private String edtavFinalintervalo3_minutos_Internalname ;
   private String AV78Station ;
   private String AV157CargueEmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblDvpanel_tableheader_Internalname ;
   private String divTablecalendar_Internalname ;
   private String scmdbuf ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String divTableheader_Internalname ;
   private String edtavToday_Jsonclick ;
   private String edtavUsurcod_Jsonclick ;
   private String edtavMaquina_Jsonclick ;
   private String edtavMm_Jsonclick ;
   private String edtavAa_Jsonclick ;
   private String lblEspacio_Internalname ;
   private String lblEspacio_Jsonclick ;
   private String divMaintablebody_Internalname ;
   private String divTablebody_Internalname ;
   private String edtavDdini_Jsonclick ;
   private String edtavDdfi_Jsonclick ;
   private String edtavHnpdia_Jsonclick ;
   private String lblBinoculars_Internalname ;
   private String lblBinoculars_Jsonclick ;
   private String divTablebody3a_Internalname ;
   private String lblIntervalo1_Internalname ;
   private String lblIntervalo1_Jsonclick ;
   private String divTablebody3b_Internalname ;
   private String lblIntervalo2_Internalname ;
   private String lblIntervalo2_Jsonclick ;
   private String divTablebody3c_Internalname ;
   private String lblIntervalo3_Internalname ;
   private String lblIntervalo3_Jsonclick ;
   private String lblEspacio1_Internalname ;
   private String lblEspacio1_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String tblTablemergedunnamedtable1_Internalname ;
   private String lblSeparador3_Internalname ;
   private String lblSeparador3_Jsonclick ;
   private String tblUnnamedtable2_Internalname ;
   private String edtavFinalintervalo3_horas_Jsonclick ;
   private String lblSeparadorhoras6_Internalname ;
   private String lblSeparadorhoras6_Jsonclick ;
   private String edtavFinalintervalo3_minutos_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String edtavIniciaintervalo3_horas_Jsonclick ;
   private String lblSeparadorhoras5_Internalname ;
   private String lblSeparadorhoras5_Jsonclick ;
   private String edtavIniciaintervalo3_minutos_Jsonclick ;
   private String tblTablemergedunnamedtable3_Internalname ;
   private String lblSeparador2_Internalname ;
   private String lblSeparador2_Jsonclick ;
   private String tblUnnamedtable4_Internalname ;
   private String edtavFinalintervalo2_horas_Jsonclick ;
   private String lblSeparadorhoras4_Internalname ;
   private String lblSeparadorhoras4_Jsonclick ;
   private String edtavFinalintervalo2_minutos_Jsonclick ;
   private String tblUnnamedtable3_Internalname ;
   private String edtavIniciaintervalo2_horas_Jsonclick ;
   private String lblSeparadorhoras3_Internalname ;
   private String lblSeparadorhoras3_Jsonclick ;
   private String edtavIniciaintervalo2_minutos_Jsonclick ;
   private String tblTablemergedunnamedtable5_Internalname ;
   private String lblSeparador_Internalname ;
   private String lblSeparador_Jsonclick ;
   private String tblUnnamedtable6_Internalname ;
   private String edtavFinalintervalo1_horas_Jsonclick ;
   private String lblSeparadorhoras2_Internalname ;
   private String lblSeparadorhoras2_Jsonclick ;
   private String edtavFinalintervalo1_minutos_Jsonclick ;
   private String tblUnnamedtable5_Internalname ;
   private String edtavIniciaintervalo1_horas_Jsonclick ;
   private String lblSeparadorhoras1_Internalname ;
   private String lblSeparadorhoras1_Jsonclick ;
   private String edtavIniciaintervalo1_minutos_Jsonclick ;
   private java.util.Date AV58MaqHnpI1f ;
   private java.util.Date AV59MaqHnpI1i ;
   private java.util.Date AV60MaqHnpi2f ;
   private java.util.Date AV61MaqHnpI2i ;
   private java.util.Date AV62MaqHnpI3f ;
   private java.util.Date AV63MaqHnpI3i ;
   private java.util.Date A5124MaqHnpI1i ;
   private java.util.Date A5125MaqHnpI1f ;
   private java.util.Date A5126MaqHnpI2i ;
   private java.util.Date A5127MaqHnpI2f ;
   private java.util.Date A5128MaqHnpI3i ;
   private java.util.Date A5129MaqHnpI3f ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date GXv_dtime13[] ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date Gx_date ;
   private java.util.Date AV160DiaCargado ;
   private java.util.Date AV156FechaVacia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n5124MaqHnpI1i ;
   private boolean n5125MaqHnpI1f ;
   private boolean n5126MaqHnpI2i ;
   private boolean n5127MaqHnpI2f ;
   private boolean n5128MaqHnpI3i ;
   private boolean n5129MaqHnpI3f ;
   private String AV158Mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_dvpanel_tableheader ;
   private HTMLChoice cmbavDiasem ;
   private IDataStoreProvider pr_default ;
   private byte[] H009M2_A5123MaqHnpDia ;
   private byte[] H009M2_A614MaqMes ;
   private short[] H009M2_A599MaqAny ;
   private String[] H009M2_A602MaqCod ;
   private String[] H009M2_A396EmprCod ;
   private java.util.Date[] H009M2_A5124MaqHnpI1i ;
   private boolean[] H009M2_n5124MaqHnpI1i ;
   private java.util.Date[] H009M2_A5125MaqHnpI1f ;
   private boolean[] H009M2_n5125MaqHnpI1f ;
   private java.util.Date[] H009M2_A5126MaqHnpI2i ;
   private boolean[] H009M2_n5126MaqHnpI2i ;
   private java.util.Date[] H009M2_A5127MaqHnpI2f ;
   private boolean[] H009M2_n5127MaqHnpI2f ;
   private java.util.Date[] H009M2_A5128MaqHnpI3i ;
   private boolean[] H009M2_n5128MaqHnpI3i ;
   private java.util.Date[] H009M2_A5129MaqHnpI3f ;
   private boolean[] H009M2_n5129MaqHnpI3f ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwcal002__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H009M2", "SELECT MaqHnpDia, MaqMes, MaqAny, MaqCod, EmprCod, MaqHnpI1i, MaqHnpI1f, MaqHnpI2i, MaqHnpI2f, MaqHnpI3i, MaqHnpI3f FROM TXPINTHNP WHERE (EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? and MaqHnpDia >= ?) AND (MaqHnpDia <= ?) ORDER BY EmprCod, MaqCod, MaqAny, MaqMes, MaqHnpDia ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = GXutil.resetDate(rslt.getGXDateTime(6));
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = GXutil.resetDate(rslt.getGXDateTime(8));
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = GXutil.resetDate(rslt.getGXDateTime(10));
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = GXutil.resetDate(rslt.getGXDateTime(11));
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

