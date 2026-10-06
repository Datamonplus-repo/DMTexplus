package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwem000_impl extends GXDataArea
{
   public webwem000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwem000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwem000_impl.class ));
   }

   public webwem000_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavOp_i = new HTMLChoice();
      chkavFormatoxls = UIFactory.getCheckbox(this);
      cmbavEstado_e = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      paAV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAV2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwem000", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD_F", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12ArtCod_f, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD_F", GXutil.rtrim( AV12ArtCod_f));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD_F", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12ArtCod_f, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV29ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPENTCODI", GXutil.ltrim( localUtil.ntoc( AV84TipEntcodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILENAME", AV104Filename);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRORMESSAGE", AV103ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCECODI", GXutil.ltrim( localUtil.ntoc( AV72Procecodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRNCODI", GXutil.ltrim( localUtil.ntoc( AV86TrnCodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIDAD", GXutil.rtrim( AV94Unidad));
      app.GxWebStd.gx_hidden_field( httpContext, "vENC20", GXutil.ltrim( localUtil.ntoc( AV22Enc20, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETALLE", GXutil.ltrim( localUtil.ntoc( AV19Detalle, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
         weAV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAV2( ) ;
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
      return formatLink("app.webwem000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWEM000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informes Entradas Almacen", "") ;
   }

   public void wbAV0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         wb_table1_17_AV2( true) ;
      }
      else
      {
         wb_table1_17_AV2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_AV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         wb_table2_112_AV2( true) ;
      }
      else
      {
         wb_table2_112_AV2( false) ;
      }
      return  ;
   }

   public void wb_table2_112_AV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void startAV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informes Entradas Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAV0( ) ;
   }

   public void wsAV2( )
   {
      startAV2( ) ;
      evtAV2( ) ;
   }

   public void evtAV2( )
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
                           e11AV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e12AV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e13AV2 ();
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

   public void weAV2( )
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

   public void paAV2( )
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
            GX_FocusControl = edtavPclicod_Internalname ;
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
      if ( cmbavOp_i.getItemCount() > 0 )
      {
         AV64Op_i = (byte)(GXutil.lval( cmbavOp_i.getValidValue(GXutil.trim( GXutil.str( AV64Op_i, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Op_i", GXutil.str( AV64Op_i, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOp_i.setValue( GXutil.trim( GXutil.str( AV64Op_i, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_i.getInternalname(), "Values", cmbavOp_i.ToJavascriptSource(), true);
      }
      AV105formatoxls = GXutil.strtobool( GXutil.booltostr( AV105formatoxls)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105formatoxls", AV105formatoxls);
      if ( cmbavEstado_e.getItemCount() > 0 )
      {
         AV25Estado_e = cmbavEstado_e.getValidValue(AV25Estado_e) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavEstado_e.setValue( GXutil.rtrim( AV25Estado_e) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_e.getInternalname(), "Values", cmbavEstado_e.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfAV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   public void rfAV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e13AV2 ();
         wbAV0( ) ;
      }
   }

   public void send_integrity_lvl_hashesAV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD_F", GXutil.rtrim( AV12ArtCod_f));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vARTCOD_F", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV12ArtCod_f, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupAV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11AV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPCLICOD");
            GX_FocusControl = edtavPclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68PCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
         }
         else
         {
            AV68PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUCLICOD");
            GX_FocusControl = edtavUclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90UCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90UCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90UCliCod), 6, 0));
         }
         else
         {
            AV90UCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90UCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90UCliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavPfecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vPFECHA");
            GX_FocusControl = edtavPfecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69Pfecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
         }
         else
         {
            AV69Pfecha = localUtil.ctod( httpContext.cgiGet( edtavPfecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavUfecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vUFECHA");
            GX_FocusControl = edtavUfecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91UFecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91UFecha", localUtil.format(AV91UFecha, "99/99/99"));
         }
         else
         {
            AV91UFecha = localUtil.ctod( httpContext.cgiGet( edtavUfecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91UFecha", localUtil.format(AV91UFecha, "99/99/99"));
         }
         AV14ArtCod_i = httpContext.cgiGet( edtavArtcod_i_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14ArtCod_i", AV14ArtCod_i);
         AV13ArtCod_ff = httpContext.cgiGet( edtavArtcod_ff_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODI");
            GX_FocusControl = edtavTipartcodi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82TipArtCodi = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
         }
         else
         {
            AV82TipArtCodi = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODF");
            GX_FocusControl = edtavTipartcodf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81TipArtCodf = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TipArtCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TipArtCodf), 4, 0));
         }
         else
         {
            AV81TipArtCodf = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TipArtCodf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81TipArtCodf), 4, 0));
         }
         AV70PNent = httpContext.cgiGet( edtavPnent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70PNent", AV70PNent);
         AV93UNent = httpContext.cgiGet( edtavUnent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93UNent", AV93UNent);
         AV67Palb = httpContext.cgiGet( edtavPalb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Palb", AV67Palb);
         AV88Ualb = httpContext.cgiGet( edtavUalb_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Ualb", AV88Ualb);
         cmbavOp_i.setValue( httpContext.cgiGet( cmbavOp_i.getInternalname()) );
         AV64Op_i = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOp_i.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Op_i", GXutil.str( AV64Op_i, 1, 0));
         AV105formatoxls = GXutil.strtobool( httpContext.cgiGet( chkavFormatoxls.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV105formatoxls", AV105formatoxls);
         cmbavEstado_e.setValue( httpContext.cgiGet( cmbavEstado_e.getInternalname()) );
         AV25Estado_e = httpContext.cgiGet( cmbavEstado_e.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
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
      e11AV2 ();
      if (returnInSub) return;
   }

   public void e11AV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwem000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwem000_impl.this.AV20EmprCod = GXv_char2[0] ;
      webwem000_impl.this.AV21EmprNom = GXv_char3[0] ;
      webwem000_impl.this.AV95UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      GXt_int5 = AV22Enc20 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "ENC20C", ""), GXv_int6) ;
      webwem000_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22Enc20 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Enc20", GXutil.str( AV22Enc20, 1, 0));
      edtavPnent_Visible = ((AV22Enc20==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPnent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPnent_Visible), 5, 0), true);
      edtavUnent_Visible = ((AV22Enc20==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnent_Visible), 5, 0), true);
      edtavPalb_Visible = ((AV22Enc20==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPalb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPalb_Visible), 5, 0), true);
      edtavUalb_Visible = ((AV22Enc20==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUalb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUalb_Visible), 5, 0), true);
      GXt_char1 = AV79Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwem000_impl.this.GXt_char1 = GXv_char4[0] ;
      AV79Station = GXt_char1 ;
      GXv_char4[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char2[0] = AV95UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwem000_impl.this.AV20EmprCod = GXv_char4[0] ;
      webwem000_impl.this.AV21EmprNom = GXv_char3[0] ;
      webwem000_impl.this.AV95UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
   }

   public void e12AV2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( AV64Op_i == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir Opcion", ""));
      }
      else
      {
         AV89UCli = ((0==AV90UCliCod) ? 999999 : AV90UCliCod) ;
         AV92Ufecha2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91UFecha)) ? GXutil.today( ) : AV91UFecha) ;
         AV13ArtCod_ff = ((GXutil.strcmp("", AV12ArtCod_f)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV12ArtCod_f) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
         AV7Albrentf = ((GXutil.strcmp("", AV93UNent)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV93UNent) ;
         AV80TipArtCod2 = (short)(((0==AV81TipArtCodf) ? 9999 : AV81TipArtCodf)) ;
         AV106Ualb2 = ((GXutil.strcmp("", AV88Ualb)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzzzzzz", "") : AV88Ualb) ;
         AV71Procecodf = (short)(9999) ;
         AV85TrnCodf = (short)(9999) ;
         if ( AV64Op_i == 1 )
         {
            if ( AV105formatoxls )
            {
               GXv_char4[0] = AV20EmprCod ;
               GXv_char3[0] = AV29ImpCod ;
               GXv_int7[0] = AV68PCliCod ;
               GXv_int8[0] = AV89UCli ;
               GXv_date9[0] = AV69Pfecha ;
               GXv_date10[0] = AV92Ufecha2 ;
               GXv_char2[0] = AV14ArtCod_i ;
               GXv_char11[0] = AV13ArtCod_ff ;
               GXv_char12[0] = AV70PNent ;
               GXv_char13[0] = AV7Albrentf ;
               GXv_int14[0] = AV84TipEntcodi ;
               GXv_int15[0] = AV82TipArtCodi ;
               GXv_int16[0] = AV80TipArtCod2 ;
               GXv_char17[0] = AV25Estado_e ;
               GXv_char18[0] = AV67Palb ;
               GXv_char19[0] = AV106Ualb2 ;
               GXv_char20[0] = AV104Filename ;
               GXv_char21[0] = AV103ErrorMessage ;
               new app.xlsrem0000(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int7, GXv_int8, GXv_date9, GXv_date10, GXv_char2, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21) ;
               webwem000_impl.this.AV20EmprCod = GXv_char4[0] ;
               webwem000_impl.this.AV29ImpCod = GXv_char3[0] ;
               webwem000_impl.this.AV68PCliCod = GXv_int7[0] ;
               webwem000_impl.this.AV89UCli = GXv_int8[0] ;
               webwem000_impl.this.AV69Pfecha = GXv_date9[0] ;
               webwem000_impl.this.AV92Ufecha2 = GXv_date10[0] ;
               webwem000_impl.this.AV14ArtCod_i = GXv_char2[0] ;
               webwem000_impl.this.AV13ArtCod_ff = GXv_char11[0] ;
               webwem000_impl.this.AV70PNent = GXv_char12[0] ;
               webwem000_impl.this.AV7Albrentf = GXv_char13[0] ;
               webwem000_impl.this.AV84TipEntcodi = GXv_int14[0] ;
               webwem000_impl.this.AV82TipArtCodi = GXv_int15[0] ;
               webwem000_impl.this.AV80TipArtCod2 = GXv_int16[0] ;
               webwem000_impl.this.AV25Estado_e = GXv_char17[0] ;
               webwem000_impl.this.AV67Palb = GXv_char18[0] ;
               webwem000_impl.this.AV106Ualb2 = GXv_char19[0] ;
               webwem000_impl.this.AV104Filename = GXv_char20[0] ;
               webwem000_impl.this.AV103ErrorMessage = GXv_char21[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV29ImpCod", AV29ImpCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV14ArtCod_i", AV14ArtCod_i);
               httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
               httpContext.ajax_rsp_assign_attri("", false, "AV70PNent", AV70PNent);
               httpContext.ajax_rsp_assign_attri("", false, "AV84TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TipEntcodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
               httpContext.ajax_rsp_assign_attri("", false, "AV67Palb", AV67Palb);
               httpContext.ajax_rsp_assign_attri("", false, "AV104Filename", AV104Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV103ErrorMessage", AV103ErrorMessage);
               if ( (GXutil.strcmp("", AV104Filename)==0) )
               {
                  httpContext.GX_msglist.addItem(AV103ErrorMessage);
               }
               else
               {
                  callWebObject(formatLink(AV104Filename, new String[] {}, new String[] {}) );
                  httpContext.wjLocDisableFrm = (byte)(0) ;
               }
            }
            else
            {
               callWebObject(formatLink("app.rem0000", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV29ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89UCli,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV69Pfecha)),GXutil.URLEncode(GXutil.formatDateParm(AV92Ufecha2)),GXutil.URLEncode(GXutil.rtrim(AV14ArtCod_i)),GXutil.URLEncode(GXutil.rtrim(AV13ArtCod_ff)),GXutil.URLEncode(GXutil.rtrim(AV70PNent)),GXutil.URLEncode(GXutil.rtrim(AV7Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV84TipEntcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82TipArtCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80TipArtCod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV25Estado_e)),GXutil.URLEncode(GXutil.rtrim(AV67Palb)),GXutil.URLEncode(GXutil.rtrim(AV106Ualb2))}, new String[] {"EmprCod","ImpCod","PCliente","UCliente","PFecha","UFecha","AlbRef_i","AlbRef_f","Albrenti","Albrentf","TipEntcodi","Tipartcod1","Tipartcod2","Estado_a"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
            }
         }
         else if ( AV64Op_i == 2 )
         {
            if ( AV105formatoxls )
            {
               GXv_char21[0] = AV20EmprCod ;
               GXv_char20[0] = AV29ImpCod ;
               GXv_int8[0] = AV68PCliCod ;
               GXv_int7[0] = AV89UCli ;
               GXv_date10[0] = AV69Pfecha ;
               GXv_date9[0] = AV92Ufecha2 ;
               GXv_char19[0] = AV14ArtCod_i ;
               GXv_char18[0] = AV13ArtCod_ff ;
               GXv_char17[0] = AV25Estado_e ;
               GXv_char13[0] = AV70PNent ;
               GXv_char12[0] = AV7Albrentf ;
               GXv_int16[0] = AV84TipEntcodi ;
               GXv_int15[0] = AV72Procecodi ;
               GXv_int14[0] = AV71Procecodf ;
               GXv_int22[0] = AV86TrnCodi ;
               GXv_int23[0] = AV85TrnCodf ;
               GXv_int24[0] = AV82TipArtCodi ;
               GXv_int25[0] = AV80TipArtCod2 ;
               GXv_char11[0] = AV94Unidad ;
               GXv_char4[0] = AV104Filename ;
               GXv_char3[0] = AV103ErrorMessage ;
               new app.xlsrem0003(remoteHandle, context).execute( GXv_char21, GXv_char20, GXv_int8, GXv_int7, GXv_date10, GXv_date9, GXv_char19, GXv_char18, GXv_char17, GXv_char13, GXv_char12, GXv_int16, GXv_int15, GXv_int14, GXv_int22, GXv_int23, GXv_int24, GXv_int25, GXv_char11, GXv_char4, GXv_char3) ;
               webwem000_impl.this.AV20EmprCod = GXv_char21[0] ;
               webwem000_impl.this.AV29ImpCod = GXv_char20[0] ;
               webwem000_impl.this.AV68PCliCod = GXv_int8[0] ;
               webwem000_impl.this.AV89UCli = GXv_int7[0] ;
               webwem000_impl.this.AV69Pfecha = GXv_date10[0] ;
               webwem000_impl.this.AV92Ufecha2 = GXv_date9[0] ;
               webwem000_impl.this.AV14ArtCod_i = GXv_char19[0] ;
               webwem000_impl.this.AV13ArtCod_ff = GXv_char18[0] ;
               webwem000_impl.this.AV25Estado_e = GXv_char17[0] ;
               webwem000_impl.this.AV70PNent = GXv_char13[0] ;
               webwem000_impl.this.AV7Albrentf = GXv_char12[0] ;
               webwem000_impl.this.AV84TipEntcodi = GXv_int16[0] ;
               webwem000_impl.this.AV72Procecodi = GXv_int15[0] ;
               webwem000_impl.this.AV71Procecodf = GXv_int14[0] ;
               webwem000_impl.this.AV86TrnCodi = GXv_int22[0] ;
               webwem000_impl.this.AV85TrnCodf = GXv_int23[0] ;
               webwem000_impl.this.AV82TipArtCodi = GXv_int24[0] ;
               webwem000_impl.this.AV80TipArtCod2 = GXv_int25[0] ;
               webwem000_impl.this.AV94Unidad = GXv_char11[0] ;
               webwem000_impl.this.AV104Filename = GXv_char4[0] ;
               webwem000_impl.this.AV103ErrorMessage = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV29ImpCod", AV29ImpCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV14ArtCod_i", AV14ArtCod_i);
               httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
               httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
               httpContext.ajax_rsp_assign_attri("", false, "AV70PNent", AV70PNent);
               httpContext.ajax_rsp_assign_attri("", false, "AV84TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TipEntcodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV72Procecodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72Procecodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV86TrnCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TrnCodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV94Unidad", AV94Unidad);
               httpContext.ajax_rsp_assign_attri("", false, "AV104Filename", AV104Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV103ErrorMessage", AV103ErrorMessage);
               if ( (GXutil.strcmp("", AV104Filename)==0) )
               {
                  httpContext.GX_msglist.addItem(AV103ErrorMessage);
               }
               else
               {
                  callWebObject(formatLink(AV104Filename, new String[] {}, new String[] {}) );
                  httpContext.wjLocDisableFrm = (byte)(0) ;
               }
            }
            else
            {
               callWebObject(formatLink("app.rem0003", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV29ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89UCli,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV69Pfecha)),GXutil.URLEncode(GXutil.formatDateParm(AV92Ufecha2)),GXutil.URLEncode(GXutil.rtrim(AV14ArtCod_i)),GXutil.URLEncode(GXutil.rtrim(AV13ArtCod_ff)),GXutil.URLEncode(GXutil.rtrim(AV25Estado_e)),GXutil.URLEncode(GXutil.rtrim(AV70PNent)),GXutil.URLEncode(GXutil.rtrim(AV7Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV84TipEntcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV72Procecodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV71Procecodf,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV86TrnCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV85TrnCodf,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82TipArtCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80TipArtCod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV94Unidad)),GXutil.URLEncode(GXutil.rtrim(AV67Palb)),GXutil.URLEncode(GXutil.rtrim(AV106Ualb2))}, new String[] {"EmprCod","ImpCod","PCliente","UCliente","PFecha","UFecha","AlbRef_i","AlbRef_f","Estado_a","Albrenti","Albrentf","TipENtcodi","Procodi","Procodf","trnCodi","TrnCodf","Tipartcod1","Tipartcod2","Unidad"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
            }
         }
         else if ( AV64Op_i == 3 )
         {
            if ( AV105formatoxls )
            {
               GXv_char21[0] = AV20EmprCod ;
               GXv_char20[0] = AV29ImpCod ;
               GXv_int8[0] = AV68PCliCod ;
               GXv_int7[0] = AV89UCli ;
               GXv_date10[0] = AV69Pfecha ;
               GXv_date9[0] = AV92Ufecha2 ;
               GXv_char19[0] = AV14ArtCod_i ;
               GXv_char18[0] = AV13ArtCod_ff ;
               GXv_char17[0] = AV70PNent ;
               GXv_char13[0] = AV7Albrentf ;
               GXv_int25[0] = AV84TipEntcodi ;
               GXv_int24[0] = AV82TipArtCodi ;
               GXv_int23[0] = AV80TipArtCod2 ;
               GXv_char12[0] = AV25Estado_e ;
               GXv_char11[0] = AV104Filename ;
               GXv_char4[0] = AV103ErrorMessage ;
               new app.xlsrem0002(remoteHandle, context).execute( GXv_char21, GXv_char20, GXv_int8, GXv_int7, GXv_date10, GXv_date9, GXv_char19, GXv_char18, GXv_char17, GXv_char13, GXv_int25, GXv_int24, GXv_int23, GXv_char12, GXv_char11, GXv_char4) ;
               webwem000_impl.this.AV20EmprCod = GXv_char21[0] ;
               webwem000_impl.this.AV29ImpCod = GXv_char20[0] ;
               webwem000_impl.this.AV68PCliCod = GXv_int8[0] ;
               webwem000_impl.this.AV89UCli = GXv_int7[0] ;
               webwem000_impl.this.AV69Pfecha = GXv_date10[0] ;
               webwem000_impl.this.AV92Ufecha2 = GXv_date9[0] ;
               webwem000_impl.this.AV14ArtCod_i = GXv_char19[0] ;
               webwem000_impl.this.AV13ArtCod_ff = GXv_char18[0] ;
               webwem000_impl.this.AV70PNent = GXv_char17[0] ;
               webwem000_impl.this.AV7Albrentf = GXv_char13[0] ;
               webwem000_impl.this.AV84TipEntcodi = GXv_int25[0] ;
               webwem000_impl.this.AV82TipArtCodi = GXv_int24[0] ;
               webwem000_impl.this.AV80TipArtCod2 = GXv_int23[0] ;
               webwem000_impl.this.AV25Estado_e = GXv_char12[0] ;
               webwem000_impl.this.AV104Filename = GXv_char11[0] ;
               webwem000_impl.this.AV103ErrorMessage = GXv_char4[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV29ImpCod", AV29ImpCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV14ArtCod_i", AV14ArtCod_i);
               httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
               httpContext.ajax_rsp_assign_attri("", false, "AV70PNent", AV70PNent);
               httpContext.ajax_rsp_assign_attri("", false, "AV84TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TipEntcodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
               httpContext.ajax_rsp_assign_attri("", false, "AV104Filename", AV104Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV103ErrorMessage", AV103ErrorMessage);
               if ( (GXutil.strcmp("", AV104Filename)==0) )
               {
                  httpContext.GX_msglist.addItem(AV103ErrorMessage);
               }
               else
               {
                  callWebObject(formatLink(AV104Filename, new String[] {}, new String[] {}) );
                  httpContext.wjLocDisableFrm = (byte)(0) ;
               }
            }
            else
            {
               callWebObject(formatLink("app.rem0002", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV29ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89UCli,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV69Pfecha)),GXutil.URLEncode(GXutil.formatDateParm(AV92Ufecha2)),GXutil.URLEncode(GXutil.rtrim(AV14ArtCod_i)),GXutil.URLEncode(GXutil.rtrim(AV13ArtCod_ff)),GXutil.URLEncode(GXutil.rtrim(AV70PNent)),GXutil.URLEncode(GXutil.rtrim(AV7Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV84TipEntcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82TipArtCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80TipArtCod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV25Estado_e))}, new String[] {"EmprCod","ImpCod","PCliente","UCliente","PFecha","UFecha","AlbRef_i","AlbRef_f","Albrenti","Albrentf","TipENtcodi","Tipartcod1","Tipartcod2","Estado_a"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
            }
         }
         else if ( AV64Op_i == 4 )
         {
            if ( AV105formatoxls )
            {
               AV88Ualb = httpContext.getMessage( "zzzzzzzzzzzzzzzzzzzz", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV88Ualb", AV88Ualb);
               AV73Reo = "*" ;
               GXv_char21[0] = AV20EmprCod ;
               GXv_char20[0] = AV29ImpCod ;
               GXv_int8[0] = AV68PCliCod ;
               GXv_int7[0] = AV89UCli ;
               GXv_date10[0] = AV69Pfecha ;
               GXv_date9[0] = AV92Ufecha2 ;
               GXv_char19[0] = AV14ArtCod_i ;
               GXv_char18[0] = AV13ArtCod_ff ;
               GXv_char17[0] = AV70PNent ;
               GXv_char13[0] = AV7Albrentf ;
               GXv_int25[0] = AV84TipEntcodi ;
               GXv_int24[0] = AV82TipArtCodi ;
               GXv_int23[0] = AV80TipArtCod2 ;
               GXv_int6[0] = AV22Enc20 ;
               GXv_char12[0] = AV67Palb ;
               GXv_char11[0] = AV88Ualb ;
               GXv_char4[0] = AV73Reo ;
               GXv_char3[0] = AV25Estado_e ;
               GXv_int26[0] = AV19Detalle ;
               GXv_char2[0] = AV104Filename ;
               GXv_char27[0] = AV103ErrorMessage ;
               new app.xlsrem0005(remoteHandle, context).execute( GXv_char21, GXv_char20, GXv_int8, GXv_int7, GXv_date10, GXv_date9, GXv_char19, GXv_char18, GXv_char17, GXv_char13, GXv_int25, GXv_int24, GXv_int23, GXv_int6, GXv_char12, GXv_char11, GXv_char4, GXv_char3, GXv_int26, GXv_char2, GXv_char27) ;
               webwem000_impl.this.AV20EmprCod = GXv_char21[0] ;
               webwem000_impl.this.AV29ImpCod = GXv_char20[0] ;
               webwem000_impl.this.AV68PCliCod = GXv_int8[0] ;
               webwem000_impl.this.AV89UCli = GXv_int7[0] ;
               webwem000_impl.this.AV69Pfecha = GXv_date10[0] ;
               webwem000_impl.this.AV92Ufecha2 = GXv_date9[0] ;
               webwem000_impl.this.AV14ArtCod_i = GXv_char19[0] ;
               webwem000_impl.this.AV13ArtCod_ff = GXv_char18[0] ;
               webwem000_impl.this.AV70PNent = GXv_char17[0] ;
               webwem000_impl.this.AV7Albrentf = GXv_char13[0] ;
               webwem000_impl.this.AV84TipEntcodi = GXv_int25[0] ;
               webwem000_impl.this.AV82TipArtCodi = GXv_int24[0] ;
               webwem000_impl.this.AV80TipArtCod2 = GXv_int23[0] ;
               webwem000_impl.this.AV22Enc20 = GXv_int6[0] ;
               webwem000_impl.this.AV67Palb = GXv_char12[0] ;
               webwem000_impl.this.AV88Ualb = GXv_char11[0] ;
               webwem000_impl.this.AV73Reo = GXv_char4[0] ;
               webwem000_impl.this.AV25Estado_e = GXv_char3[0] ;
               webwem000_impl.this.AV19Detalle = GXv_int26[0] ;
               webwem000_impl.this.AV104Filename = GXv_char2[0] ;
               webwem000_impl.this.AV103ErrorMessage = GXv_char27[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV29ImpCod", AV29ImpCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV68PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68PCliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV69Pfecha", localUtil.format(AV69Pfecha, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV14ArtCod_i", AV14ArtCod_i);
               httpContext.ajax_rsp_assign_attri("", false, "AV13ArtCod_ff", AV13ArtCod_ff);
               httpContext.ajax_rsp_assign_attri("", false, "AV70PNent", AV70PNent);
               httpContext.ajax_rsp_assign_attri("", false, "AV84TipEntcodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84TipEntcodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV82TipArtCodi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82TipArtCodi), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV22Enc20", GXutil.str( AV22Enc20, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV67Palb", AV67Palb);
               httpContext.ajax_rsp_assign_attri("", false, "AV88Ualb", AV88Ualb);
               httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
               httpContext.ajax_rsp_assign_attri("", false, "AV19Detalle", GXutil.str( AV19Detalle, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV104Filename", AV104Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV103ErrorMessage", AV103ErrorMessage);
               if ( (GXutil.strcmp("", AV104Filename)==0) )
               {
                  httpContext.GX_msglist.addItem(AV103ErrorMessage);
               }
               else
               {
                  callWebObject(formatLink(AV104Filename, new String[] {}, new String[] {}) );
                  httpContext.wjLocDisableFrm = (byte)(0) ;
               }
            }
            else
            {
               callWebObject(formatLink("app.rem0005", new String[] {GXutil.URLEncode(GXutil.rtrim(AV20EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV29ImpCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68PCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89UCli,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV69Pfecha)),GXutil.URLEncode(GXutil.formatDateParm(AV92Ufecha2)),GXutil.URLEncode(GXutil.rtrim(AV14ArtCod_i)),GXutil.URLEncode(GXutil.rtrim(AV13ArtCod_ff)),GXutil.URLEncode(GXutil.rtrim(AV70PNent)),GXutil.URLEncode(GXutil.rtrim(AV7Albrentf)),GXutil.URLEncode(GXutil.ltrimstr(AV84TipEntcodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82TipArtCodi,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV80TipArtCod2,4,0)),GXutil.URLEncode(GXutil.rtrim(AV25Estado_e))}, new String[] {"EmprCod","ImpCod","PCliente","UCliente","PFecha","UFecha","ALbRef_i","AlbRef_f","Albrenti","Albrentf","Tipentcodi","Tipartcod1","Tipartcod2","Estado_a","AlbRecCod"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
            }
         }
      }
      /*  Sending Event outputs  */
      cmbavEstado_e.setValue( GXutil.rtrim( AV25Estado_e) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_e.getInternalname(), "Values", cmbavEstado_e.ToJavascriptSource(), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e13AV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table2_112_AV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;align-self:center;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_112_AV2e( true) ;
      }
      else
      {
         wb_table2_112_AV2e( false) ;
      }
   }

   public void wb_table1_17_AV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "TableDate", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPclicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPclicod_Internalname, httpContext.getMessage( "Clientes", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV68PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68PCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68PCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPclicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavUclicod_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV90UCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90UCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90UCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUclicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPfecha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPfecha_Internalname, httpContext.getMessage( "Fechas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavPfecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPfecha_Internalname, localUtil.format(AV69Pfecha, "99/99/99"), localUtil.format( AV69Pfecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPfecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPfecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPfecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavPfecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWEM000.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavUfecha_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavUfecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUfecha_Internalname, localUtil.format(AV91UFecha, "99/99/99"), localUtil.format( AV91UFecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUfecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUfecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavUfecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavUfecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWEM000.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_i_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_i_Internalname, httpContext.getMessage( "Articulos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_i_Internalname, GXutil.rtrim( AV14ArtCod_i), GXutil.rtrim( localUtil.format( AV14ArtCod_i, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_i_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_i_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_ff_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_ff_Internalname, GXutil.rtrim( AV13ArtCod_ff), GXutil.rtrim( localUtil.format( AV13ArtCod_ff, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_ff_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_ff_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcodi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcodi_Internalname, httpContext.getMessage( "Tipo Artículo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodi_Internalname, GXutil.ltrim( localUtil.ntoc( AV82TipArtCodi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcodi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82TipArtCodi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82TipArtCodi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodi_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcodi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcodf_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodf_Internalname, GXutil.ltrim( localUtil.ntoc( AV81TipArtCodf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcodf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81TipArtCodf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81TipArtCodf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcodf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavPnent_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPnent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPnent_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPnent_Internalname, GXutil.rtrim( AV70PNent), GXutil.rtrim( localUtil.format( AV70PNent, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPnent_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavPnent_Visible, edtavPnent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavUnent_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavUnent_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUnent_Internalname, GXutil.rtrim( AV93UNent), GXutil.rtrim( localUtil.format( AV93UNent, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUnent_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavUnent_Visible, edtavUnent_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavPalb_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavPalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPalb_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPalb_Internalname, GXutil.rtrim( AV67Palb), GXutil.rtrim( localUtil.format( AV67Palb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPalb_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavPalb_Visible, edtavPalb_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavUalb_Visible, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavUalb_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUalb_Internalname, GXutil.rtrim( AV88Ualb), GXutil.rtrim( localUtil.format( AV88Ualb, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUalb_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavUalb_Visible, edtavUalb_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableop_i_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockop_i_Internalname, httpContext.getMessage( "Opciones", ""), "", "", lblTextblockop_i_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOp_i.getInternalname(), httpContext.getMessage( "Op i", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOp_i, cmbavOp_i.getInternalname(), GXutil.trim( GXutil.str( AV64Op_i, 1, 0)), 1, cmbavOp_i.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOp_i.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "", true, (byte)(0), "HLP_WebWEM000.htm");
         cmbavOp_i.setValue( GXutil.trim( GXutil.str( AV64Op_i, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_i.getInternalname(), "Values", cmbavOp_i.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableformatoxls_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockformatoxls_Internalname, httpContext.getMessage( "Formato XLS", ""), "", "", lblTextblockformatoxls_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWEM000.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavFormatoxls.getInternalname(), httpContext.getMessage( "formatoxls", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavFormatoxls.getInternalname(), GXutil.booltostr( AV105formatoxls), "", httpContext.getMessage( "formatoxls", ""), 1, chkavFormatoxls.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(102, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,102);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavEstado_e.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavEstado_e.getInternalname(), httpContext.getMessage( "Estado Entradas", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavEstado_e, cmbavEstado_e.getInternalname(), GXutil.rtrim( AV25Estado_e), 1, cmbavEstado_e.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavEstado_e.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "", true, (byte)(0), "HLP_WebWEM000.htm");
         cmbavEstado_e.setValue( GXutil.rtrim( AV25Estado_e) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavEstado_e.getInternalname(), "Values", cmbavEstado_e.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_AV2e( true) ;
      }
      else
      {
         wb_table1_17_AV2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paAV2( ) ;
      wsAV2( ) ;
      weAV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405037", true, true);
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
      httpContext.AddJavascriptSource("webwem000.js", "?202661016405037", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPclicod_Internalname = "vPCLICOD" ;
      edtavUclicod_Internalname = "vUCLICOD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavPfecha_Internalname = "vPFECHA" ;
      edtavUfecha_Internalname = "vUFECHA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavArtcod_i_Internalname = "vARTCOD_I" ;
      edtavArtcod_ff_Internalname = "vARTCOD_FF" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavTipartcodi_Internalname = "vTIPARTCODI" ;
      edtavTipartcodf_Internalname = "vTIPARTCODF" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavPnent_Internalname = "vPNENT" ;
      edtavUnent_Internalname = "vUNENT" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavPalb_Internalname = "vPALB" ;
      edtavUalb_Internalname = "vUALB" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      lblTextblockop_i_Internalname = "TEXTBLOCKOP_I" ;
      cmbavOp_i.setInternalname( "vOP_I" );
      divUnnamedtableop_i_Internalname = "UNNAMEDTABLEOP_I" ;
      lblTextblockformatoxls_Internalname = "TEXTBLOCKFORMATOXLS" ;
      chkavFormatoxls.setInternalname( "vFORMATOXLS" );
      divUnnamedtableformatoxls_Internalname = "UNNAMEDTABLEFORMATOXLS" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      cmbavEstado_e.setInternalname( "vESTADO_E" );
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      cmbavEstado_e.setJsonclick( "" );
      cmbavEstado_e.setEnabled( 1 );
      chkavFormatoxls.setEnabled( 1 );
      cmbavOp_i.setJsonclick( "" );
      cmbavOp_i.setEnabled( 1 );
      edtavUalb_Jsonclick = "" ;
      edtavUalb_Enabled = 1 ;
      edtavPalb_Jsonclick = "" ;
      edtavPalb_Enabled = 1 ;
      edtavUnent_Jsonclick = "" ;
      edtavUnent_Enabled = 1 ;
      edtavPnent_Jsonclick = "" ;
      edtavPnent_Enabled = 1 ;
      edtavTipartcodf_Jsonclick = "" ;
      edtavTipartcodf_Enabled = 1 ;
      edtavTipartcodi_Jsonclick = "" ;
      edtavTipartcodi_Enabled = 1 ;
      edtavArtcod_ff_Jsonclick = "" ;
      edtavArtcod_ff_Enabled = 1 ;
      edtavArtcod_i_Jsonclick = "" ;
      edtavArtcod_i_Enabled = 1 ;
      edtavUfecha_Jsonclick = "" ;
      edtavUfecha_Enabled = 1 ;
      edtavPfecha_Jsonclick = "" ;
      edtavPfecha_Enabled = 1 ;
      edtavUclicod_Jsonclick = "" ;
      edtavUclicod_Enabled = 1 ;
      edtavPclicod_Jsonclick = "" ;
      edtavPclicod_Enabled = 1 ;
      edtavUalb_Visible = 1 ;
      edtavPalb_Visible = 1 ;
      edtavUnent_Visible = 1 ;
      edtavPnent_Visible = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informes Entradas Almacen", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavOp_i.setName( "vOP_I" );
      cmbavOp_i.setWebtags( "" );
      cmbavOp_i.addItem("0", httpContext.getMessage( "Definir Opcion", ""), (short)(0));
      cmbavOp_i.addItem("1", httpContext.getMessage( "Listado Entradas Resumen Cliente-articulo", ""), (short)(0));
      cmbavOp_i.addItem("2", httpContext.getMessage( "Listado Entradas Detalle", ""), (short)(0));
      cmbavOp_i.addItem("3", httpContext.getMessage( "Listado Entradas Resumen Cliente", ""), (short)(0));
      cmbavOp_i.addItem("4", httpContext.getMessage( "Listado Entradas Distribucion por Hdr", ""), (short)(0));
      if ( cmbavOp_i.getItemCount() > 0 )
      {
         AV64Op_i = (byte)(GXutil.lval( cmbavOp_i.getValidValue(GXutil.trim( GXutil.str( AV64Op_i, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Op_i", GXutil.str( AV64Op_i, 1, 0));
      }
      chkavFormatoxls.setName( "vFORMATOXLS" );
      chkavFormatoxls.setWebtags( "" );
      chkavFormatoxls.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFormatoxls.getInternalname(), "TitleCaption", chkavFormatoxls.getCaption(), true);
      chkavFormatoxls.setCheckedValue( "false" );
      AV105formatoxls = GXutil.strtobool( GXutil.booltostr( AV105formatoxls)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105formatoxls", AV105formatoxls);
      cmbavEstado_e.setName( "vESTADO_E" );
      cmbavEstado_e.setWebtags( "" );
      cmbavEstado_e.addItem("2", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavEstado_e.addItem("0", httpContext.getMessage( "Abiertas", ""), (short)(0));
      cmbavEstado_e.addItem("1", httpContext.getMessage( "Cerradas", ""), (short)(0));
      if ( cmbavEstado_e.getItemCount() > 0 )
      {
         AV25Estado_e = cmbavEstado_e.getValidValue(AV25Estado_e) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Estado_e", AV25Estado_e);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV105formatoxls',fld:'vFORMATOXLS',pic:''},{av:'AV12ArtCod_f',fld:'vARTCOD_F',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e12AV2',iparms:[{av:'cmbavOp_i'},{av:'AV64Op_i',fld:'vOP_I',pic:'9'},{av:'AV90UCliCod',fld:'vUCLICOD',pic:'ZZZZZ9'},{av:'AV91UFecha',fld:'vUFECHA',pic:''},{av:'AV12ArtCod_f',fld:'vARTCOD_F',pic:'',hsh:true},{av:'AV93UNent',fld:'vUNENT',pic:''},{av:'AV81TipArtCodf',fld:'vTIPARTCODF',pic:'ZZZ9'},{av:'AV88Ualb',fld:'vUALB',pic:''},{av:'AV105formatoxls',fld:'vFORMATOXLS',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV68PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV69Pfecha',fld:'vPFECHA',pic:''},{av:'AV14ArtCod_i',fld:'vARTCOD_I',pic:''},{av:'AV70PNent',fld:'vPNENT',pic:''},{av:'AV84TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV82TipArtCodi',fld:'vTIPARTCODI',pic:'ZZZ9'},{av:'cmbavEstado_e'},{av:'AV25Estado_e',fld:'vESTADO_E',pic:''},{av:'AV67Palb',fld:'vPALB',pic:''},{av:'AV104Filename',fld:'vFILENAME',pic:''},{av:'AV103ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV72Procecodi',fld:'vPROCECODI',pic:'ZZZ9'},{av:'AV86TrnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV94Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV22Enc20',fld:'vENC20',pic:'9'},{av:'AV19Detalle',fld:'vDETALLE',pic:'9'}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV13ArtCod_ff',fld:'vARTCOD_FF',pic:''},{av:'AV103ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV104Filename',fld:'vFILENAME',pic:''},{av:'AV67Palb',fld:'vPALB',pic:''},{av:'cmbavEstado_e'},{av:'AV25Estado_e',fld:'vESTADO_E',pic:''},{av:'AV82TipArtCodi',fld:'vTIPARTCODI',pic:'ZZZ9'},{av:'AV84TipEntcodi',fld:'vTIPENTCODI',pic:'ZZZ9'},{av:'AV70PNent',fld:'vPNENT',pic:''},{av:'AV14ArtCod_i',fld:'vARTCOD_I',pic:''},{av:'AV69Pfecha',fld:'vPFECHA',pic:''},{av:'AV68PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV29ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94Unidad',fld:'vUNIDAD',pic:'@!'},{av:'AV86TrnCodi',fld:'vTRNCODI',pic:'ZZZ9'},{av:'AV72Procecodi',fld:'vPROCECODI',pic:'ZZZ9'},{av:'AV88Ualb',fld:'vUALB',pic:''},{av:'AV19Detalle',fld:'vDETALLE',pic:'9'},{av:'AV22Enc20',fld:'vENC20',pic:'9'}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV12ArtCod_f = "" ;
      GXKey = "" ;
      AV20EmprCod = "" ;
      AV29ImpCod = "" ;
      AV104Filename = "" ;
      AV103ErrorMessage = "" ;
      AV94Unidad = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Estado_e = "" ;
      AV69Pfecha = GXutil.nullDate() ;
      AV91UFecha = GXutil.nullDate() ;
      AV14ArtCod_i = "" ;
      AV13ArtCod_ff = "" ;
      AV70PNent = "" ;
      AV93UNent = "" ;
      AV67Palb = "" ;
      AV88Ualb = "" ;
      AV79Station = "" ;
      AV21EmprNom = "" ;
      AV95UsurCod = "" ;
      GXt_char1 = "" ;
      AV92Ufecha2 = GXutil.nullDate() ;
      AV7Albrentf = "" ;
      AV106Ualb2 = "" ;
      GXv_int16 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int22 = new short[1] ;
      AV73Reo = "" ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_date9 = new java.util.Date[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int25 = new short[1] ;
      GXv_int24 = new short[1] ;
      GXv_int23 = new short[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int26 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_char27 = new String[1] ;
      sStyleString = "" ;
      TempTags = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      lblTextblockop_i_Jsonclick = "" ;
      lblTextblockformatoxls_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV22Enc20 ;
   private byte AV19Detalle ;
   private byte nDonePA ;
   private byte AV64Op_i ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int26[] ;
   private byte nGXWrapped ;
   private short AV84TipEntcodi ;
   private short AV72Procecodi ;
   private short AV86TrnCodi ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV82TipArtCodi ;
   private short AV81TipArtCodf ;
   private short AV80TipArtCod2 ;
   private short AV71Procecodf ;
   private short AV85TrnCodf ;
   private short GXv_int16[] ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int22[] ;
   private short GXv_int25[] ;
   private short GXv_int24[] ;
   private short GXv_int23[] ;
   private int AV68PCliCod ;
   private int AV90UCliCod ;
   private int edtavPnent_Visible ;
   private int edtavUnent_Visible ;
   private int edtavPalb_Visible ;
   private int edtavUalb_Visible ;
   private int AV89UCli ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private int edtavPclicod_Enabled ;
   private int edtavUclicod_Enabled ;
   private int edtavPfecha_Enabled ;
   private int edtavUfecha_Enabled ;
   private int edtavArtcod_i_Enabled ;
   private int edtavArtcod_ff_Enabled ;
   private int edtavTipartcodi_Enabled ;
   private int edtavTipartcodf_Enabled ;
   private int edtavPnent_Enabled ;
   private int edtavUnent_Enabled ;
   private int edtavPalb_Enabled ;
   private int edtavUalb_Enabled ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV12ArtCod_f ;
   private String GXKey ;
   private String AV20EmprCod ;
   private String AV29ImpCod ;
   private String AV94Unidad ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavPclicod_Internalname ;
   private String AV25Estado_e ;
   private String edtavUclicod_Internalname ;
   private String edtavPfecha_Internalname ;
   private String edtavUfecha_Internalname ;
   private String AV14ArtCod_i ;
   private String edtavArtcod_i_Internalname ;
   private String AV13ArtCod_ff ;
   private String edtavArtcod_ff_Internalname ;
   private String edtavTipartcodi_Internalname ;
   private String edtavTipartcodf_Internalname ;
   private String AV70PNent ;
   private String edtavPnent_Internalname ;
   private String AV93UNent ;
   private String edtavUnent_Internalname ;
   private String AV67Palb ;
   private String edtavPalb_Internalname ;
   private String AV88Ualb ;
   private String edtavUalb_Internalname ;
   private String AV79Station ;
   private String AV21EmprNom ;
   private String AV95UsurCod ;
   private String GXt_char1 ;
   private String AV7Albrentf ;
   private String AV106Ualb2 ;
   private String AV73Reo ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char27[] ;
   private String sStyleString ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavPclicod_Jsonclick ;
   private String edtavUclicod_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavPfecha_Jsonclick ;
   private String edtavUfecha_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavArtcod_i_Jsonclick ;
   private String edtavArtcod_ff_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavTipartcodi_Jsonclick ;
   private String edtavTipartcodf_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavPnent_Jsonclick ;
   private String edtavUnent_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavPalb_Jsonclick ;
   private String edtavUalb_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtableop_i_Internalname ;
   private String lblTextblockop_i_Internalname ;
   private String lblTextblockop_i_Jsonclick ;
   private String divUnnamedtableformatoxls_Internalname ;
   private String lblTextblockformatoxls_Internalname ;
   private String lblTextblockformatoxls_Jsonclick ;
   private java.util.Date AV69Pfecha ;
   private java.util.Date AV91UFecha ;
   private java.util.Date AV92Ufecha2 ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date9[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV105formatoxls ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String AV104Filename ;
   private String AV103ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private HTMLChoice cmbavOp_i ;
   private ICheckbox chkavFormatoxls ;
   private HTMLChoice cmbavEstado_e ;
   private com.genexus.webpanels.GXWebForm Form ;
}

