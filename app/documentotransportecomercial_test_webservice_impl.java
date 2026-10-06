package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_test_webservice_impl extends GXDataArea
{
   public documentotransportecomercial_test_webservice_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_test_webservice_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_test_webservice_impl.class ));
   }

   public documentotransportecomercial_test_webservice_impl( int remoteHandle ,
                                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavOk = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            AV11Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV36AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProCod), 10, 0));
               AV37AlbProPri = httpContext.GetPar( "AlbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProPri", AV37AlbProPri);
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
      pa29R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29R2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial_test_webservice", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV37AlbProPri))}, new String[] {"Emprcod","AlbProCod","AlbProPri"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIR", getSecureSignedToken( "", AV9Dir));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSERAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25UserAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21PassAT, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV37AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV36AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIR", AV9Dir);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIR", getSecureSignedToken( "", AV9Dir));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV11Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSERAT", GXutil.rtrim( AV25UserAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSERAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25UserAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSAT", GXutil.rtrim( AV21PassAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21PassAT, ""))));
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
         we29R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29R2( ) ;
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
      return formatLink("app.documentotransportecomercial_test_webservice", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV36AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV37AlbProPri))}, new String[] {"Emprcod","AlbProCod","AlbProPri"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial_Test_WebService" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Test Envio AT", "") ;
   }

   public void wb29R0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Envio WebService", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Envio WebService", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial_Test_WebService.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOk.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOk.getInternalname(), httpContext.getMessage( "Ok", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOk.getInternalname(), GXutil.booltostr( AV32Ok), "", httpContext.getMessage( "Ok", ""), 1, chkavOk.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(35, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,35);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMessagesxml_tojson_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMessagesxml_tojson_Internalname, httpContext.getMessage( "Messages XML", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMessagesxml_tojson_Internalname, AV41MessagesXML_tojson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", (short)(0), 1, edtavMessagesxml_tojson_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteComercial_Test_WebService.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMessages_tojson_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMessages_tojson_Internalname, httpContext.getMessage( "Messages RESULT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMessages_tojson_Internalname, AV19Messages_tojson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", (short)(0), 1, edtavMessages_tojson_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteComercial_Test_WebService.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVar_file_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVar_file_Internalname, httpContext.getMessage( "File", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavVar_file_Internalname, AV33Var_File, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", (short)(0), 1, edtavVar_file_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_DocumentoTransporteComercial_Test_WebService.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial_Test_WebService.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start29R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Test Envio AT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29R0( ) ;
   }

   public void ws29R2( )
   {
      start29R2( ) ;
      evt29R2( ) ;
   }

   public void evt29R2( )
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
                           e1129R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e1229R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1329R2 ();
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

   public void we29R2( )
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

   public void pa29R2( )
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
            GX_FocusControl = chkavOk.getInternalname() ;
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
      AV32Ok = GXutil.strtobool( GXutil.booltostr( AV32Ok)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV44Pgmname = "DocumentoTransporteComercial_Test_WebService" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_err = (short)(0) ;
      edtavMessagesxml_tojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessagesxml_tojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessagesxml_tojson_Enabled), 5, 0), true);
      edtavMessages_tojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_tojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_tojson_Enabled), 5, 0), true);
      edtavVar_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_file_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1329R2 ();
         wb29R0( ) ;
      }
   }

   public void send_integrity_lvl_hashes29R2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vDIR", AV9Dir);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIR", getSecureSignedToken( "", AV9Dir));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSERAT", GXutil.rtrim( AV25UserAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSERAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25UserAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSAT", GXutil.rtrim( AV21PassAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21PassAT, ""))));
   }

   public void before_start_formulas( )
   {
      AV44Pgmname = "DocumentoTransporteComercial_Test_WebService" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      Gx_err = (short)(0) ;
      edtavMessagesxml_tojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessagesxml_tojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessagesxml_tojson_Enabled), 5, 0), true);
      edtavMessages_tojson_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_tojson_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_tojson_Enabled), 5, 0), true);
      edtavVar_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_file_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1129R2 ();
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
         AV32Ok = GXutil.strtobool( httpContext.cgiGet( chkavOk.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
         AV41MessagesXML_tojson = httpContext.cgiGet( edtavMessagesxml_tojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41MessagesXML_tojson", AV41MessagesXML_tojson);
         AV19Messages_tojson = httpContext.cgiGet( edtavMessages_tojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Messages_tojson", AV19Messages_tojson);
         AV33Var_File = httpContext.cgiGet( edtavVar_file_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Var_File", AV33Var_File);
         AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
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
      e1129R2 ();
      if (returnInSub) return;
   }

   public void e1129R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Path_ApiSender ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.getpathapp(remoteHandle, context).execute( "java", GXv_char2) ;
      documentotransportecomercial_test_webservice_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Path_ApiSender = GXt_char1 + "\\at" ;
      GXt_char1 = AV9Dir ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV11Emprcod, httpContext.getMessage( "SAFTW1", ""), GXv_char2) ;
      documentotransportecomercial_test_webservice_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Dir = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Dir", AV9Dir);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDIR", getSecureSignedToken( "", AV9Dir));
      GXt_char1 = AV25UserAT ;
      GXv_char2[0] = AV11Emprcod ;
      GXv_char3[0] = httpContext.getMessage( "USEAT2", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_test_webservice_impl.this.AV11Emprcod = GXv_char2[0] ;
      documentotransportecomercial_test_webservice_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
      AV25UserAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25UserAT", AV25UserAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSERAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25UserAT, ""))));
      GXt_char1 = AV21PassAT ;
      GXv_char4[0] = AV11Emprcod ;
      GXv_char3[0] = httpContext.getMessage( "PASAT2", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      documentotransportecomercial_test_webservice_impl.this.AV11Emprcod = GXv_char4[0] ;
      documentotransportecomercial_test_webservice_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
      AV21PassAT = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21PassAT", AV21PassAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21PassAT, ""))));
      AV19Messages_tojson = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Messages_tojson", AV19Messages_tojson);
      AV32Ok = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
      AV33Var_File = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Var_File", AV33Var_File);
      GXt_char1 = AV38Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentotransportecomercial_test_webservice_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38Station = GXt_char1 ;
      GXv_char4[0] = AV11Emprcod ;
      GXv_char3[0] = AV39EmprNom ;
      GXv_char2[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentotransportecomercial_test_webservice_impl.this.AV11Emprcod = GXv_char4[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV39EmprNom = GXv_char3[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV40UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
   }

   public void e1229R2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37AlbProPri, "1") == 0 )
      {
         AV14Fichero = httpContext.getMessage( "GR3", "") + GXutil.padl( GXutil.trim( GXutil.str( AV36AlbProCod, 8, 0)), (short)(8), "0") ;
      }
      else
      {
         AV14Fichero = httpContext.getMessage( "GT4", "") + GXutil.padl( GXutil.trim( GXutil.str( AV36AlbProCod, 8, 0)), (short)(8), "0") ;
      }
      AV15File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV14Fichero)+httpContext.getMessage( ".xml", "") );
      AV22Path = GXutil.trim( AV9Dir) ;
      GXv_char4[0] = AV11Emprcod ;
      GXv_int5[0] = AV36AlbProCod ;
      GXv_char3[0] = AV22Path ;
      GXv_char2[0] = AV14Fichero ;
      GXv_objcol_SdtMessages_Message6[0] = AV18Messages ;
      GXv_boolean7[0] = AV32Ok ;
      new app.documentotrasportecomercialxml(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_char2, GXv_objcol_SdtMessages_Message6, GXv_boolean7) ;
      documentotransportecomercial_test_webservice_impl.this.AV11Emprcod = GXv_char4[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV36AlbProCod = GXv_int5[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV22Path = GXv_char3[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV14Fichero = GXv_char2[0] ;
      AV18Messages = GXv_objcol_SdtMessages_Message6[0] ;
      documentotransportecomercial_test_webservice_impl.this.AV32Ok = GXv_boolean7[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
      AV33Var_File = AV15File.getAbsoluteName() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Var_File", AV33Var_File);
      AV41MessagesXML_tojson = AV18Messages.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41MessagesXML_tojson", AV41MessagesXML_tojson);
      if ( AV32Ok )
      {
         GXv_objcol_SdtMessages_Message6[0] = AV18Messages ;
         GXv_boolean7[0] = AV32Ok ;
         new app.at_comunicar(remoteHandle, context).execute( AV11Emprcod, AV14Fichero, AV25UserAT, AV21PassAT, GXv_objcol_SdtMessages_Message6, GXv_boolean7) ;
         AV18Messages = GXv_objcol_SdtMessages_Message6[0] ;
         documentotransportecomercial_test_webservice_impl.this.AV32Ok = GXv_boolean7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
         AV19Messages_tojson = AV18Messages.toJSonString(false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Messages_tojson", AV19Messages_tojson);
         if ( AV32Ok )
         {
            if ( GXutil.strcmp(AV37AlbProPri, "1") == 0 )
            {
               AV16FileR = httpContext.getMessage( "GR3", "") + GXutil.padl( GXutil.trim( GXutil.str( AV36AlbProCod, 10, 0)), (short)(10), "0") ;
            }
            else
            {
               AV16FileR = httpContext.getMessage( "GT4", "") + GXutil.padl( GXutil.trim( GXutil.str( AV36AlbProCod, 10, 0)), (short)(10), "0") ;
            }
            AV15File.setSource( GXutil.trim( AV9Dir)+"\\"+GXutil.trim( AV16FileR)+httpContext.getMessage( "result", "")+httpContext.getMessage( ".xml", "") );
            AV33Var_File = AV15File.getAbsoluteName() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Var_File", AV33Var_File);
            if ( AV32Ok )
            {
               GXv_char4[0] = AV11Emprcod ;
               GXv_char3[0] = AV14Fichero ;
               GXv_int5[0] = AV36AlbProCod ;
               GXv_char2[0] = AV37AlbProPri ;
               GXv_objcol_SdtMessages_Message6[0] = AV18Messages ;
               GXv_boolean7[0] = AV32Ok ;
               new app.documentotransporteproduccion.documentotransportecomercial_result(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5, GXv_char2, GXv_objcol_SdtMessages_Message6, GXv_boolean7) ;
               documentotransportecomercial_test_webservice_impl.this.AV11Emprcod = GXv_char4[0] ;
               documentotransportecomercial_test_webservice_impl.this.AV14Fichero = GXv_char3[0] ;
               documentotransportecomercial_test_webservice_impl.this.AV36AlbProCod = GXv_int5[0] ;
               documentotransportecomercial_test_webservice_impl.this.AV37AlbProPri = GXv_char2[0] ;
               AV18Messages = GXv_objcol_SdtMessages_Message6[0] ;
               documentotransportecomercial_test_webservice_impl.this.AV32Ok = GXv_boolean7[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProCod), 10, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProPri", AV37AlbProPri);
               httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
               AV19Messages_tojson = AV18Messages.toJSonString(false) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Messages_tojson", AV19Messages_tojson);
               httpContext.popup(formatLink("app.documentotransportecomercial.documentodetransporte_lectura_result", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV14Fichero)),GXutil.URLEncode(GXutil.ltrimstr(AV36AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV37AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV19Messages_tojson)),GXutil.URLEncode(GXutil.booltostr(AV32Ok))}, new String[] {"Emprcod","Fichero","AlbProCod","ALbProPri","Messages_tojson","Ok"}) , new Object[] {});
            }
            else
            {
               AV45GXV1 = 1 ;
               while ( AV45GXV1 <= AV18Messages.size() )
               {
                  AV34Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV18Messages.elementAt(-1+AV45GXV1));
                  AV35Var_mensaje = AV34Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
                  AV35Var_mensaje += AV34Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
                  httpContext.GX_msglist.addItem(AV35Var_mensaje);
                  AV45GXV1 = (int)(AV45GXV1+1) ;
               }
            }
         }
         else
         {
            AV46GXV2 = 1 ;
            while ( AV46GXV2 <= AV18Messages.size() )
            {
               AV34Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV18Messages.elementAt(-1+AV46GXV2));
               AV35Var_mensaje = AV34Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
               AV35Var_mensaje += AV34Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
               httpContext.GX_msglist.addItem(AV35Var_mensaje);
               AV46GXV2 = (int)(AV46GXV2+1) ;
            }
         }
      }
      else
      {
         AV47GXV3 = 1 ;
         while ( AV47GXV3 <= AV18Messages.size() )
         {
            AV34Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV18Messages.elementAt(-1+AV47GXV3));
            AV35Var_mensaje = AV34Message.getgxTv_SdtMessages_Message_Id() + GXutil.newLine( ) ;
            AV35Var_mensaje += AV34Message.getgxTv_SdtMessages_Message_Description() + GXutil.newLine( ) ;
            httpContext.GX_msglist.addItem(AV35Var_mensaje);
            AV47GXV3 = (int)(AV47GXV3+1) ;
         }
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e1329R2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Emprcod", AV11Emprcod);
      AV36AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36AlbProCod), 10, 0));
      AV37AlbProPri = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProPri", AV37AlbProPri);
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
      pa29R2( ) ;
      ws29R2( ) ;
      we29R2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016453697", true, true);
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
      httpContext.AddJavascriptSource("documentotransportecomercial_test_webservice.js", "?202661016453697", false, true);
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
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      chkavOk.setInternalname( "vOK" );
      edtavMessagesxml_tojson_Internalname = "vMESSAGESXML_TOJSON" ;
      edtavMessages_tojson_Internalname = "vMESSAGES_TOJSON" ;
      edtavVar_file_Internalname = "vVAR_FILE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavVar_file_Enabled = 1 ;
      edtavMessages_tojson_Enabled = 1 ;
      edtavMessagesxml_tojson_Enabled = 1 ;
      chkavOk.setEnabled( 1 );
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Variables Control", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Test Envio AT", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavOk.setName( "vOK" );
      chkavOk.setWebtags( "" );
      chkavOk.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOk.getInternalname(), "TitleCaption", chkavOk.getCaption(), true);
      chkavOk.setCheckedValue( "false" );
      AV32Ok = GXutil.strtobool( GXutil.booltostr( AV32Ok)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Ok", AV32Ok);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV32Ok',fld:'vOK',pic:''},{av:'AV9Dir',fld:'vDIR',pic:'',hsh:true},{av:'AV25UserAT',fld:'vUSERAT',pic:'',hsh:true},{av:'AV21PassAT',fld:'vPASSAT',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1229R2',iparms:[{av:'AV37AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV36AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV9Dir',fld:'vDIR',pic:'',hsh:true},{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25UserAT',fld:'vUSERAT',pic:'',hsh:true},{av:'AV21PassAT',fld:'vPASSAT',pic:'',hsh:true}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV32Ok',fld:'vOK',pic:''},{av:'AV36AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV11Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33Var_File',fld:'vVAR_FILE',pic:''},{av:'AV41MessagesXML_tojson',fld:'vMESSAGESXML_TOJSON',pic:''},{av:'AV19Messages_tojson',fld:'vMESSAGES_TOJSON',pic:''},{av:'AV37AlbProPri',fld:'vALBPROPRI',pic:'9'}]}");
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
      wcpOAV11Emprcod = "" ;
      wcpOAV37AlbProPri = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV11Emprcod = "" ;
      AV37AlbProPri = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV9Dir = "" ;
      AV25UserAT = "" ;
      AV21PassAT = "" ;
      GXKey = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnuseraction1_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV41MessagesXML_tojson = "" ;
      AV19Messages_tojson = "" ;
      AV33Var_File = "" ;
      AV44Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV23Path_ApiSender = "" ;
      AV38Station = "" ;
      GXt_char1 = "" ;
      AV39EmprNom = "" ;
      AV40UsurCod = "" ;
      AV14Fichero = "" ;
      AV15File = new com.genexus.util.GXFile();
      AV22Path = "" ;
      AV18Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV16FileR = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_char2 = new String[1] ;
      GXv_objcol_SdtMessages_Message6 = new GXBaseCollection[1] ;
      GXv_boolean7 = new boolean[1] ;
      AV34Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV35Var_mensaje = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      AV44Pgmname = "DocumentoTransporteComercial_Test_WebService" ;
      /* GeneXus formulas. */
      AV44Pgmname = "DocumentoTransporteComercial_Test_WebService" ;
      Gx_err = (short)(0) ;
      edtavMessagesxml_tojson_Enabled = 0 ;
      edtavMessages_tojson_Enabled = 0 ;
      edtavVar_file_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavMessagesxml_tojson_Enabled ;
   private int edtavMessages_tojson_Enabled ;
   private int edtavVar_file_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV45GXV1 ;
   private int AV46GXV2 ;
   private int AV47GXV3 ;
   private int idxLst ;
   private long wcpOAV36AlbProCod ;
   private long AV36AlbProCod ;
   private long GXv_int5[] ;
   private String wcpOAV11Emprcod ;
   private String wcpOAV37AlbProPri ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV11Emprcod ;
   private String AV37AlbProPri ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV25UserAT ;
   private String AV21PassAT ;
   private String GXKey ;
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
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavMessagesxml_tojson_Internalname ;
   private String edtavMessages_tojson_Internalname ;
   private String edtavVar_file_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV38Station ;
   private String GXt_char1 ;
   private String AV39EmprNom ;
   private String AV40UsurCod ;
   private String AV14Fichero ;
   private String AV16FileR ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
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
   private boolean AV32Ok ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean GXv_boolean7[] ;
   private String AV9Dir ;
   private String AV41MessagesXML_tojson ;
   private String AV19Messages_tojson ;
   private String AV23Path_ApiSender ;
   private String AV22Path ;
   private String AV33Var_File ;
   private String AV35Var_mensaje ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.util.GXFile AV15File ;
   private ICheckbox chkavOk ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV18Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message6[] ;
   private com.genexus.SdtMessages_Message AV34Message ;
}

