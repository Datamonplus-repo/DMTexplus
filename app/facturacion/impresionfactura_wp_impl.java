package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionfactura_wp_impl extends GXDataArea
{
   public impresionfactura_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionfactura_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionfactura_wp_impl.class ));
   }

   public impresionfactura_wp_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavVersumlin = UIFactory.getCheckbox(this);
      cmbavF_header = new HTMLChoice();
      cmbavAgr_fases = new HTMLChoice();
      chkavMail = UIFactory.getCheckbox(this);
      chkavVermail = UIFactory.getCheckbox(this);
      chkavManaut = UIFactory.getCheckbox(this);
      chkavOpi = UIFactory.getCheckbox(this);
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
      pa1ZV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1ZV2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.impresionfactura_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR_OUTPUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Var_OutPut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV65WWPContext));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionFactura_WP");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV52PATHPDF, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\impresionfactura_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV24CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV24CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV26CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV26CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTPRINTER_DATA", AV46ListPrinter_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTPRINTER_DATA", AV46ListPrinter_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOD", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACEST", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACFCH", localUtil.dtoc( A436FacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACPRI", GXutil.rtrim( A450FacPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIO", GXutil.rtrim( AV27PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACTIPFAC", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACEST", GXutil.ltrim( localUtil.ntoc( AV41FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACESTTO", GXutil.ltrim( localUtil.ntoc( AV42FacEstto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIEMF", GXutil.rtrim( A10050Cliemf));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR_OUTPUT", GXutil.rtrim( AV11Var_OutPut));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR_OUTPUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Var_OutPut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSFACCOD", GXutil.rtrim( AV60sfaccod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOPIA", AV6Copia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOPIA", AV6Copia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vSCLICOD", GXutil.rtrim( AV73sclicod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWWPCONTEXT", AV65WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT", AV65WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV65WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_FRA", GXutil.ltrim( localUtil.ntoc( AV72CliCod_fra, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Cls", GXutil.rtrim( Combo_listprinter_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_set", GXutil.rtrim( Combo_listprinter_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedtext_set", GXutil.rtrim( Combo_listprinter_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Visible", GXutil.booltostr( Combo_listprinter_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Emptyitem", GXutil.booltostr( Combo_listprinter_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Width", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Cls", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Title", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Width", GXutil.rtrim( Dvpanel_panel_filtros_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtros_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtros_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Cls", GXutil.rtrim( Dvpanel_panel_filtros_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Title", GXutil.rtrim( Dvpanel_panel_filtros_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtros_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtros_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtros_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtros_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtros_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_get", GXutil.rtrim( Combo_listprinter_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
         we1ZV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1ZV2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.facturacion.impresionfactura_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.ImpresionFactura_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Factura", "") ;
   }

   public void wb1ZV0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtros.setProperty("Width", Dvpanel_panel_filtros_Width);
         ucDvpanel_panel_filtros.setProperty("AutoWidth", Dvpanel_panel_filtros_Autowidth);
         ucDvpanel_panel_filtros.setProperty("AutoHeight", Dvpanel_panel_filtros_Autoheight);
         ucDvpanel_panel_filtros.setProperty("Cls", Dvpanel_panel_filtros_Cls);
         ucDvpanel_panel_filtros.setProperty("Title", Dvpanel_panel_filtros_Title);
         ucDvpanel_panel_filtros.setProperty("Collapsible", Dvpanel_panel_filtros_Collapsible);
         ucDvpanel_panel_filtros.setProperty("Collapsed", Dvpanel_panel_filtros_Collapsed);
         ucDvpanel_panel_filtros.setProperty("ShowCollapseIcon", Dvpanel_panel_filtros_Showcollapseicon);
         ucDvpanel_panel_filtros.setProperty("IconPosition", Dvpanel_panel_filtros_Iconposition);
         ucDvpanel_panel_filtros.setProperty("AutoScroll", Dvpanel_panel_filtros_Autoscroll);
         ucDvpanel_panel_filtros.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtros_Internalname, "DVPANEL_PANEL_FILTROSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSContainer"+"Panel_Filtros"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtros_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosgenerales.setProperty("Width", Dvpanel_panel_filtrosgenerales_Width);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoWidth", Dvpanel_panel_filtrosgenerales_Autowidth);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoHeight", Dvpanel_panel_filtrosgenerales_Autoheight);
         ucDvpanel_panel_filtrosgenerales.setProperty("Cls", Dvpanel_panel_filtrosgenerales_Cls);
         ucDvpanel_panel_filtrosgenerales.setProperty("Title", Dvpanel_panel_filtrosgenerales_Title);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsible", Dvpanel_panel_filtrosgenerales_Collapsible);
         ucDvpanel_panel_filtrosgenerales.setProperty("Collapsed", Dvpanel_panel_filtrosgenerales_Collapsed);
         ucDvpanel_panel_filtrosgenerales.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosgenerales_Showcollapseicon);
         ucDvpanel_panel_filtrosgenerales.setProperty("IconPosition", Dvpanel_panel_filtrosgenerales_Iconposition);
         ucDvpanel_panel_filtrosgenerales.setProperty("AutoScroll", Dvpanel_panel_filtrosgenerales_Autoscroll);
         ucDvpanel_panel_filtrosgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosgenerales_Internalname, "DVPANEL_PANEL_FILTROSGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSGENERALESContainer"+"Panel_FiltrosGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_filtrosgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV24CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV26CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchfrom_Internalname, localUtil.format(AV20FacFchfrom, "99/99/99"), localUtil.format( AV20FacFchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchto_Internalname, localUtil.format(AV21FacFchto, "99/99/99"), localUtil.format( AV21FacFchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodfrom_Internalname, httpContext.getMessage( "Factura Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV18FacCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18FacCodfrom), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18FacCodfrom), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodfrom_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccodto_Internalname, httpContext.getMessage( "Factura Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV19FacCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19FacCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19FacCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Nº Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV5Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV5Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVersumlin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVersumlin.getInternalname(), httpContext.getMessage( "Ver Suma Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVersumlin.getInternalname(), GXutil.str( AV15VerSumLin, 1, 0), "", httpContext.getMessage( "Ver Suma Total", ""), 1, chkavVersumlin.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(79, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavF_header.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavF_header, cmbavF_header.getInternalname(), GXutil.trim( GXutil.str( AV12F_header, 1, 0)), 1, cmbavF_header.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavF_header.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "", true, (byte)(0), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV12F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAgr_fases.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAgr_fases, cmbavAgr_fases.getInternalname(), GXutil.trim( GXutil.str( AV16Agr_Fases, 4, 0)), 1, cmbavAgr_fases.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAgr_fases.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "", true, (byte)(0), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV16Agr_Fases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavMail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavMail.getInternalname(), httpContext.getMessage( "Envio Faturas por E-mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavMail.getInternalname(), AV48Mail, "", httpContext.getMessage( "Envio Faturas por E-mail?", ""), 1, chkavMail.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(95, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,95);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVermail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVermail.getInternalname(), httpContext.getMessage( "Veja a ecran de envio de correio?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV64VerMail), "", httpContext.getMessage( "Veja a ecran de envio de correio?", ""), 1, chkavVermail.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(99, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,99);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV52PATHPDF), GXutil.rtrim( localUtil.format( AV52PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavManaut.getInternalname(), httpContext.getMessage( "Automatico?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavManaut.getInternalname(), AV17ManAut, "", httpContext.getMessage( "Automatico?", ""), 1, chkavManaut.getEnabled(), "A", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(111, this, 'A', 'M',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,111);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpi.getInternalname(), httpContext.getMessage( "Ecrã", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpi.getInternalname(), AV50Opi, "", httpContext.getMessage( "Ecrã", ""), 1, chkavOpi.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,115);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlistprinter_Internalname, divTablesplittedlistprinter_Visible, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_listprinter_Internalname, httpContext.getMessage( "Impressora Servidor", ""), "", "", lblTextblockcombo_listprinter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_listprinter.setProperty("Caption", Combo_listprinter_Caption);
         ucCombo_listprinter.setProperty("Cls", Combo_listprinter_Cls);
         ucCombo_listprinter.setProperty("EmptyItem", Combo_listprinter_Emptyitem);
         ucCombo_listprinter.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucCombo_listprinter.setProperty("DropDownOptionsData", AV46ListPrinter_Data);
         ucCombo_listprinter.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_listprinter_Internalname, "COMBO_LISTPRINTERContainer");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_acciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111zv1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV84Pgmname), GXutil.rtrim( localUtil.format( AV84Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInnewwindowpdf.render(context, "innewwindow", Innewwindowpdf_Internalname, "INNEWWINDOWPDFContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV22CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV22CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV23CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,147);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListprinter_Internalname, AV45ListPrinter, GXutil.rtrim( localUtil.format( AV45ListPrinter, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,148);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListprinter_Jsonclick, 0, "Attribute", "", "", "", "", edtavListprinter_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ImpresionFactura_WP.htm");
         wb_table1_149_1ZV2( true) ;
      }
      else
      {
         wb_table1_149_1ZV2( false) ;
      }
      return  ;
   }

   public void wb_table1_149_1ZV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1ZV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Factura", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1ZV0( ) ;
   }

   public void ws1ZV2( )
   {
      start1ZV2( ) ;
      evt1ZV2( ) ;
   }

   public void evt1ZV2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODFROM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121ZV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131ZV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141ZV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e151ZV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e161ZV2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171ZV2 ();
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

   public void we1ZV2( )
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

   public void pa1ZV2( )
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
            GX_FocusControl = edtavFacfchfrom_Internalname ;
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
      AV15VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV15VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15VerSumLin", GXutil.str( AV15VerSumLin, 1, 0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV12F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV12F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12F_header", GXutil.str( AV12F_header, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV12F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
      }
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV16Agr_Fases = (short)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV16Agr_Fases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Agr_Fases), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV16Agr_Fases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
      }
      AV48Mail = ((GXutil.strcmp(GXutil.rtrim( AV48Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mail", AV48Mail);
      AV64VerMail = GXutil.strtobool( GXutil.booltostr( AV64VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerMail", AV64VerMail);
      AV17ManAut = ((GXutil.strcmp(GXutil.rtrim( AV17ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ManAut", AV17ManAut);
      AV50Opi = ((GXutil.strcmp(GXutil.rtrim( AV50Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Opi", AV50Opi);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1ZV2( ) ;
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
      AV84Pgmname = "Facturacion.ImpresionFactura_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1ZV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171ZV2 ();
         wb1ZV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1ZV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIO", GXutil.rtrim( AV27PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27PRIO, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR_OUTPUT", GXutil.rtrim( AV11Var_OutPut));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR_OUTPUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Var_OutPut, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWWPCONTEXT", AV65WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT", AV65WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV65WWPContext));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV84Pgmname = "Facturacion.ImpresionFactura_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151ZV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV24CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV26CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV40DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLISTPRINTER_DATA"), AV46ListPrinter_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
         Combo_listprinter_Cls = httpContext.cgiGet( "COMBO_LISTPRINTER_Cls") ;
         Combo_listprinter_Selectedvalue_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedvalue_set") ;
         Combo_listprinter_Selectedtext_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedtext_set") ;
         Combo_listprinter_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Visible")) ;
         Combo_listprinter_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Emptyitem")) ;
         Dvpanel_panel_filtrosgenerales_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Width") ;
         Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autowidth")) ;
         Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoheight")) ;
         Dvpanel_panel_filtrosgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Cls") ;
         Dvpanel_panel_filtrosgenerales_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Title") ;
         Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsible")) ;
         Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Collapsed")) ;
         Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Showcollapseicon")) ;
         Dvpanel_panel_filtrosgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Iconposition") ;
         Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSGENERALES_Autoscroll")) ;
         Dvpanel_panel_filtros_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Width") ;
         Dvpanel_panel_filtros_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autowidth")) ;
         Dvpanel_panel_filtros_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoheight")) ;
         Dvpanel_panel_filtros_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Cls") ;
         Dvpanel_panel_filtros_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Title") ;
         Dvpanel_panel_filtros_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsible")) ;
         Dvpanel_panel_filtros_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Collapsed")) ;
         Dvpanel_panel_filtros_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Showcollapseicon")) ;
         Dvpanel_panel_filtros_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Iconposition") ;
         Dvpanel_panel_filtros_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROS_Autoscroll")) ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHFROM");
            GX_FocusControl = edtavFacfchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20FacFchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FacFchfrom", localUtil.format(AV20FacFchfrom, "99/99/99"));
         }
         else
         {
            AV20FacFchfrom = localUtil.ctod( httpContext.cgiGet( edtavFacfchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20FacFchfrom", localUtil.format(AV20FacFchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHTO");
            GX_FocusControl = edtavFacfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21FacFchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21FacFchto", localUtil.format(AV21FacFchto, "99/99/99"));
         }
         else
         {
            AV21FacFchto = localUtil.ctod( httpContext.cgiGet( edtavFacfchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21FacFchto", localUtil.format(AV21FacFchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODFROM");
            GX_FocusControl = edtavFaccodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18FacCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FacCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FacCodfrom), 8, 0));
         }
         else
         {
            AV18FacCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FacCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FacCodfrom), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCODTO");
            GX_FocusControl = edtavFaccodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19FacCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19FacCodto), 8, 0));
         }
         else
         {
            AV19FacCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19FacCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19FacCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Copias2), 4, 0));
         }
         else
         {
            AV5Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Copias2), 4, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVERSUMLIN");
            GX_FocusControl = chkavVersumlin.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15VerSumLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15VerSumLin", GXutil.str( AV15VerSumLin, 1, 0));
         }
         else
         {
            AV15VerSumLin = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15VerSumLin", GXutil.str( AV15VerSumLin, 1, 0));
         }
         cmbavF_header.setValue( httpContext.cgiGet( cmbavF_header.getInternalname()) );
         AV12F_header = (byte)(GXutil.lval( httpContext.cgiGet( cmbavF_header.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12F_header", GXutil.str( AV12F_header, 1, 0));
         cmbavAgr_fases.setValue( httpContext.cgiGet( cmbavAgr_fases.getInternalname()) );
         AV16Agr_Fases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAgr_fases.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Agr_Fases), 4, 0));
         AV48Mail = ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Mail", AV48Mail);
         AV64VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64VerMail", AV64VerMail);
         AV52PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52PATHPDF", AV52PATHPDF);
         AV17ManAut = ((GXutil.strcmp(httpContext.cgiGet( chkavManaut.getInternalname()), "A")==0) ? "A" : "M") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ManAut", AV17ManAut);
         AV50Opi = ((GXutil.strcmp(httpContext.cgiGet( chkavOpi.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Opi", AV50Opi);
         AV84Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Pgmname", AV84Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCodfrom), 6, 0));
         }
         else
         {
            AV22CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodto), 6, 0));
         }
         else
         {
            AV23CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodto), 6, 0));
         }
         AV45ListPrinter = httpContext.cgiGet( edtavListprinter_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ListPrinter", AV45ListPrinter);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionFactura_WP");
         AV52PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52PATHPDF", AV52PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV52PATHPDF, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\impresionfactura_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e151ZV2 ();
      if (returnInSub) return;
   }

   public void e151ZV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV65WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV65WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_char2 = AV77Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      impresionfactura_wp_impl.this.GXt_char2 = GXv_char3[0] ;
      AV77Station = GXt_char2 ;
      GXv_char3[0] = AV10EmprCod ;
      GXv_char4[0] = AV8EmprNom ;
      GXv_char5[0] = AV9UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV77Station, GXv_char3, GXv_char4, GXv_char5) ;
      impresionfactura_wp_impl.this.AV10EmprCod = GXv_char3[0] ;
      impresionfactura_wp_impl.this.AV8EmprNom = GXv_char4[0] ;
      impresionfactura_wp_impl.this.AV9UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV40DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV40DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavListprinter_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListprinter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListprinter_Visible), 5, 0), true);
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOLISTPRINTER' */
      S132 ();
      if (returnInSub) return;
      AV64VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerMail", AV64VerMail);
      GXt_char2 = AV52PATHPDF ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char5) ;
      impresionfactura_wp_impl.this.GXt_char2 = GXv_char5[0] ;
      AV52PATHPDF = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PATHPDF", AV52PATHPDF);
      AV50Opi = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Opi", AV50Opi);
      if ( ! (GXutil.strcmp("", AV65WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV45ListPrinter = AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ListPrinter", AV45ListPrinter);
         Combo_listprinter_Selectedtext_set = AV45ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedText_set", Combo_listprinter_Selectedtext_set);
         Combo_listprinter_Selectedvalue_set = AV45ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
      }
      AV17ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ManAut", AV17ManAut);
      AV15VerSumLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15VerSumLin", GXutil.str( AV15VerSumLin, 1, 0));
      AV12F_header = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12F_header", GXutil.str( AV12F_header, 1, 0));
      AV16Agr_Fases = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Agr_Fases), 4, 0));
      AV11Var_OutPut = httpContext.getMessage( "PRN", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Var_OutPut", AV11Var_OutPut);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAR_OUTPUT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV11Var_OutPut, ""))));
      AV27PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PRIO", AV27PRIO);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27PRIO, "9"))));
      AV21FacFchto = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21FacFchto", localUtil.format(AV21FacFchto, "99/99/99"));
      GXt_int8 = AV28Copias ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( AV10EmprCod, "100005", GXv_int9) ;
      impresionfactura_wp_impl.this.GXt_int8 = GXv_int9[0] ;
      AV28Copias = (short)(GXt_int8) ;
      if ( AV28Copias == 0 )
      {
         AV28Copias = (short)(1) ;
      }
      AV5Copias2 = AV28Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Copias2), 4, 0));
      AV6Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV6Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV6Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV6Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV67Year = (short)(GXutil.year( Gx_date)) ;
      AV39Day = (short)(GXutil.day( Gx_date)) ;
      AV49Mounth = (short)(GXutil.month( Gx_date)) ;
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e161ZV2 ();
      if (returnInSub) return;
   }

   public void e161ZV2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
   }

   public void e141ZV2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e131ZV2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV23CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e121ZV2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV22CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV41FacEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FacEst", GXutil.str( AV41FacEst, 1, 0));
      AV42FacEstto = (byte)(((GXutil.strcmp(AV17ManAut, "A")==0) ? 0 : 2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42FacEstto", GXutil.str( AV42FacEstto, 1, 0));
      AV60sfaccod = localUtil.format( DecimalUtil.doubleToDec(AV18FacCodfrom), "ZZZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60sfaccod", AV60sfaccod);
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV18FacCodfrom) ,
                                           Integer.valueOf(AV19FacCodto) ,
                                           AV20FacFchfrom ,
                                           AV21FacFchto ,
                                           Integer.valueOf(AV22CliCodfrom) ,
                                           Integer.valueOf(AV23CliCodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           Byte.valueOf(AV41FacEst) ,
                                           Byte.valueOf(AV42FacEstto) ,
                                           A450FacPri ,
                                           AV27PRIO ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV10EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01ZV2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, Byte.valueOf(AV41FacEst), Byte.valueOf(AV42FacEstto), AV27PRIO, Integer.valueOf(AV18FacCodfrom), Integer.valueOf(AV19FacCodto), AV20FacFchfrom, AV21FacFchto, Integer.valueOf(AV22CliCodfrom), Integer.valueOf(AV23CliCodto)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1153FacTipFac = H01ZV2_A1153FacTipFac[0] ;
         A450FacPri = H01ZV2_A450FacPri[0] ;
         A252CliCod = H01ZV2_A252CliCod[0] ;
         A436FacFch = H01ZV2_A436FacFch[0] ;
         A430FacCod = H01ZV2_A430FacCod[0] ;
         A435FacEst = H01ZV2_A435FacEst[0] ;
         A396EmprCod = H01ZV2_A396EmprCod[0] ;
         AV18FacCodfrom = A430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18FacCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18FacCodfrom), 8, 0));
         AV72CliCod_fra = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72CliCod_fra", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CliCod_fra), 6, 0));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV73sclicod = localUtil.format( DecimalUtil.doubleToDec(AV72CliCod_fra), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73sclicod", AV73sclicod);
      if ( GXutil.strcmp(AV48Mail, "S") == 0 )
      {
         /* Execute user subroutine: 'ENVIARMAIL' */
         S152 ();
         if (returnInSub) return;
         if ( GXutil.strcmp(AV50Opi, "0") == 0 )
         {
            /* Execute user subroutine: 'IMPRIMIRAUTOMATICO' */
            S162 ();
            if (returnInSub) return;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV50Opi, "1") == 0 )
         {
            /* Execute user subroutine: 'PREVIEW' */
            S172 ();
            if (returnInSub) return;
         }
         else
         {
            /* Execute user subroutine: 'IMPRIMIRAUTOMATICO' */
            S162 ();
            if (returnInSub) return;
         }
      }
   }

   public void S132( )
   {
      /* 'LOADCOMBOLISTPRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV65WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV47ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV47ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV47ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV65WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV46ListPrinter_Data.add(AV47ListPrinter_Data_Item, 0);
      }
      /* Execute user subroutine: 'LOADPRINTERFROMSERVER' */
      S182 ();
      if (returnInSub) return;
      AV46ListPrinter_Data.sort("Title");
      Combo_listprinter_Selectedvalue_set = AV45ListPrinter ;
      ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01ZV3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H01ZV3_A10045CliAct[0] ;
         A13735CliCNom = H01ZV3_A13735CliCNom[0] ;
         A252CliCod = H01ZV3_A252CliCod[0] ;
         A279CliNom = H01ZV3_A279CliNom[0] ;
         AV25Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV25Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV25Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV26CliCodto_Data.add(AV25Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodto_Selectedvalue_set = ((0==AV23CliCodto) ? "" : GXutil.trim( GXutil.str( AV23CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H01ZV4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H01ZV4_A10045CliAct[0] ;
         A13735CliCNom = H01ZV4_A13735CliCNom[0] ;
         A252CliCod = H01ZV4_A252CliCod[0] ;
         A279CliNom = H01ZV4_A279CliNom[0] ;
         AV25Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV25Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV25Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV24CliCodfrom_Data.add(AV25Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV22CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV22CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void S182( )
   {
      /* 'LOADPRINTERFROMSERVER' Routine */
      returnInSub = false ;
      AV61STR_SDTListPrinter = AV74AppTool.listprinter() ;
      if ( AV79SDTListPrinter.fromJSonString(AV61STR_SDTListPrinter, AV78Messages) )
      {
         AV89GXV1 = 1 ;
         while ( AV89GXV1 <= AV79SDTListPrinter.size() )
         {
            AV80SDTListPrinter_item = (app.SdtSDTListPrinter_SDTListPrinterItem)((app.SdtSDTListPrinter_SDTListPrinterItem)AV79SDTListPrinter.elementAt(-1+AV89GXV1));
            if ( GXutil.strcmp(AV65WWPContext.getgxTv_SdtWWPContext_Usurprint(), AV80SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name()) != 0 )
            {
               AV47ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV47ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV80SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV47ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV80SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV46ListPrinter_Data.add(AV47ListPrinter_Data_Item, 0);
            }
            AV89GXV1 = (int)(AV89GXV1+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ninguna impressora localizada", ""));
      }
   }

   public void S152( )
   {
      /* 'ENVIARMAIL' Routine */
      returnInSub = false ;
      AV54registrosleidos = (short)(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV18FacCodfrom) ,
                                           Integer.valueOf(AV19FacCodto) ,
                                           AV20FacFchfrom ,
                                           AV21FacFchto ,
                                           Integer.valueOf(AV22CliCodfrom) ,
                                           Integer.valueOf(AV23CliCodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           Byte.valueOf(AV41FacEst) ,
                                           Byte.valueOf(AV42FacEstto) ,
                                           A450FacPri ,
                                           AV27PRIO ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV10EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01ZV5 */
      pr_default.execute(3, new Object[] {AV10EmprCod, Byte.valueOf(AV41FacEst), Byte.valueOf(AV42FacEstto), AV27PRIO, Integer.valueOf(AV18FacCodfrom), Integer.valueOf(AV19FacCodto), AV20FacFchfrom, AV21FacFchto, Integer.valueOf(AV22CliCodfrom), Integer.valueOf(AV23CliCodto)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A1153FacTipFac = H01ZV5_A1153FacTipFac[0] ;
         A450FacPri = H01ZV5_A450FacPri[0] ;
         A252CliCod = H01ZV5_A252CliCod[0] ;
         A436FacFch = H01ZV5_A436FacFch[0] ;
         A430FacCod = H01ZV5_A430FacCod[0] ;
         A435FacEst = H01ZV5_A435FacEst[0] ;
         A396EmprCod = H01ZV5_A396EmprCod[0] ;
         A10050Cliemf = H01ZV5_A10050Cliemf[0] ;
         A9606FacHor = H01ZV5_A9606FacHor[0] ;
         A279CliNom = H01ZV5_A279CliNom[0] ;
         A10050Cliemf = H01ZV5_A10050Cliemf[0] ;
         A279CliNom = H01ZV5_A279CliNom[0] ;
         AV38Cliemf = A10050Cliemf ;
         if ( ! (GXutil.strcmp("", AV38Cliemf)==0) )
         {
            GXt_boolean10 = AV69Factura_existe ;
            GXv_boolean11[0] = GXt_boolean10 ;
            new app.facturacion.impresionfactura_mail(remoteHandle, context).execute( AV10EmprCod, A430FacCod, A436FacFch, A9606FacHor, A252CliCod, A279CliNom, AV11Var_OutPut, AV12F_header, AV16Agr_Fases, AV15VerSumLin, AV5Copias2, AV52PATHPDF, AV38Cliemf, AV64VerMail, GXv_boolean11) ;
            impresionfactura_wp_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
            AV69Factura_existe = GXt_boolean10 ;
            if ( AV69Factura_existe )
            {
               new app.facturacion.factura_enviomailsdp(remoteHandle, context).execute( AV10EmprCod, A430FacCod, A436FacFch, A252CliCod, A279CliNom, AV38Cliemf, AV64VerMail) ;
            }
            AV54registrosleidos = (short)(AV54registrosleidos+1) ;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S172( )
   {
      /* 'PREVIEW' Routine */
      returnInSub = false ;
      AV66x = (short)(1) ;
      AV58Sdt_MergePDF.clear();
      AV54registrosleidos = (short)(0) ;
      AV57ReportOutPut = "" ;
      AV62strDate = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( Gx_date), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( Gx_date), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( Gx_date), 10, 0)), (short)(2), "0") ;
      AV60sfaccod = localUtil.format( DecimalUtil.doubleToDec(AV18FacCodfrom), "ZZZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60sfaccod", AV60sfaccod);
      AV57ReportOutPut = GXutil.format( "%1/##CLIENTE##_%2_%3.pdf", AV52PATHPDF, GXutil.trim( AV60sfaccod), GXutil.trim( AV62strDate), "", "", "", "", "", "") ;
      AV56ReportInPut = GXutil.trim( AV52PATHPDF) ;
      AV91GXLvl317 = (byte)(0) ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV18FacCodfrom) ,
                                           Integer.valueOf(AV19FacCodto) ,
                                           AV20FacFchfrom ,
                                           AV21FacFchto ,
                                           Integer.valueOf(AV22CliCodfrom) ,
                                           Integer.valueOf(AV23CliCodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           Byte.valueOf(AV41FacEst) ,
                                           Byte.valueOf(AV42FacEstto) ,
                                           A450FacPri ,
                                           AV27PRIO ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV10EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01ZV6 */
      pr_default.execute(4, new Object[] {AV10EmprCod, Byte.valueOf(AV41FacEst), Byte.valueOf(AV42FacEstto), AV27PRIO, Integer.valueOf(AV18FacCodfrom), Integer.valueOf(AV19FacCodto), AV20FacFchfrom, AV21FacFchto, Integer.valueOf(AV22CliCodfrom), Integer.valueOf(AV23CliCodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1153FacTipFac = H01ZV6_A1153FacTipFac[0] ;
         A450FacPri = H01ZV6_A450FacPri[0] ;
         A252CliCod = H01ZV6_A252CliCod[0] ;
         A436FacFch = H01ZV6_A436FacFch[0] ;
         A430FacCod = H01ZV6_A430FacCod[0] ;
         A435FacEst = H01ZV6_A435FacEst[0] ;
         A396EmprCod = H01ZV6_A396EmprCod[0] ;
         A9606FacHor = H01ZV6_A9606FacHor[0] ;
         AV91GXLvl317 = (byte)(1) ;
         AV30faccod = A430FacCod ;
         AV75CliCod = A252CliCod ;
         AV13i = (short)(1) ;
         AV28Copias = AV5Copias2 ;
         while ( AV28Copias > 0 )
         {
            AV14TextoCopia = AV6Copia[AV13i-1] ;
            AV51PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV56ReportInPut, GXutil.trim( GXutil.str( AV66x, 4, 0)), AV65WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
            new app.pwfacm21(remoteHandle, context).execute( AV51PathFile, A396EmprCod, AV30faccod, "", DecimalUtil.doubleToDec(0), AV14TextoCopia, AV11Var_OutPut, AV12F_header, (byte)(AV16Agr_Fases), AV15VerSumLin) ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int9[0] = AV30faccod ;
            GXv_dtime12[0] = A9606FacHor ;
            new app.pfiritems(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_dtime12) ;
            impresionfactura_wp_impl.this.A396EmprCod = GXv_char5[0] ;
            impresionfactura_wp_impl.this.AV30faccod = GXv_int9[0] ;
            impresionfactura_wp_impl.this.A9606FacHor = GXv_dtime12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV59Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
            AV59Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV51PathFile );
            AV58Sdt_MergePDF.add(AV59Sdt_MergePDF_Item, 0);
            AV28Copias = (short)(AV28Copias-1) ;
            AV13i = (short)(AV13i+1) ;
            AV54registrosleidos = (short)(AV54registrosleidos+1) ;
            AV66x = (short)(AV66x+1) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV91GXLvl317 == 0 )
      {
         AV66x = (short)(AV66x+1) ;
      }
      AV44ListPdfJson = AV58Sdt_MergePDF.toJSonString(false) ;
      if ( (0==AV54registrosleidos) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se proceso ningun registro", ""));
      }
      else
      {
         AV57ReportOutPut = GXutil.strReplace( AV57ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), GXutil.trim( GXutil.str( AV72CliCod_fra, 6, 0))) ;
         AV53PathPDFFull = AV74AppTool.merge(AV44ListPdfJson, AV57ReportOutPut, true) ;
         GXt_char2 = AV43Link ;
         GXv_char5[0] = GXt_char2 ;
         new app.viewfile(remoteHandle, context).execute( AV53PathPDFFull, "", GXv_char5) ;
         impresionfactura_wp_impl.this.GXt_char2 = GXv_char5[0] ;
         AV43Link = GXt_char2 ;
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV43Link,httpContext.getMessage( "_blank", "")});
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
         AV57ReportOutPut = "" ;
      }
   }

   public void S162( )
   {
      /* 'IMPRIMIRAUTOMATICO' Routine */
      returnInSub = false ;
      AV66x = (short)(1) ;
      AV58Sdt_MergePDF.clear();
      AV54registrosleidos = (short)(0) ;
      AV92GXLvl391 = (byte)(0) ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Integer.valueOf(AV18FacCodfrom) ,
                                           Integer.valueOf(AV19FacCodto) ,
                                           AV20FacFchfrom ,
                                           AV21FacFchto ,
                                           Integer.valueOf(AV22CliCodfrom) ,
                                           Integer.valueOf(AV23CliCodto) ,
                                           Integer.valueOf(A430FacCod) ,
                                           A436FacFch ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A435FacEst) ,
                                           Byte.valueOf(AV41FacEst) ,
                                           Byte.valueOf(AV42FacEstto) ,
                                           A450FacPri ,
                                           AV27PRIO ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV10EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H01ZV7 */
      pr_default.execute(5, new Object[] {AV10EmprCod, Byte.valueOf(AV41FacEst), Byte.valueOf(AV42FacEstto), AV27PRIO, Integer.valueOf(AV18FacCodfrom), Integer.valueOf(AV19FacCodto), AV20FacFchfrom, AV21FacFchto, Integer.valueOf(AV22CliCodfrom), Integer.valueOf(AV23CliCodto)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1153FacTipFac = H01ZV7_A1153FacTipFac[0] ;
         A450FacPri = H01ZV7_A450FacPri[0] ;
         A252CliCod = H01ZV7_A252CliCod[0] ;
         A436FacFch = H01ZV7_A436FacFch[0] ;
         A430FacCod = H01ZV7_A430FacCod[0] ;
         A435FacEst = H01ZV7_A435FacEst[0] ;
         A396EmprCod = H01ZV7_A396EmprCod[0] ;
         A9606FacHor = H01ZV7_A9606FacHor[0] ;
         AV92GXLvl391 = (byte)(1) ;
         AV30faccod = A430FacCod ;
         AV62strDate = GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( A436FacFch), 10, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A436FacFch), 10, 0)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( A436FacFch), 10, 0)), (short)(2), "0") ;
         AV57ReportOutPut = GXutil.format( "%1/##CLIENTE##_%2_%3.pdf", AV52PATHPDF, GXutil.trim( AV60sfaccod), GXutil.trim( AV62strDate), "", "", "", "", "", "") ;
         AV56ReportInPut = GXutil.trim( AV52PATHPDF) ;
         AV13i = (short)(1) ;
         AV28Copias = AV5Copias2 ;
         while ( AV28Copias > 0 )
         {
            AV14TextoCopia = AV6Copia[AV13i-1] ;
            AV51PathFile = GXutil.format( httpContext.getMessage( "%1Report_%2_%3.pdf", ""), AV56ReportInPut, GXutil.trim( AV14TextoCopia), GXutil.trim( GXutil.str( AV66x, 4, 0)), "", "", "", "", "", "") ;
            new app.pwfacm21(remoteHandle, context).execute( AV51PathFile, A396EmprCod, AV30faccod, "", DecimalUtil.doubleToDec(0), AV14TextoCopia, AV11Var_OutPut, AV12F_header, (byte)(AV16Agr_Fases), AV15VerSumLin) ;
            GXv_char5[0] = A396EmprCod ;
            GXv_int9[0] = AV30faccod ;
            GXv_dtime12[0] = A9606FacHor ;
            new app.pfiritems(remoteHandle, context).execute( GXv_char5, GXv_int9, GXv_dtime12) ;
            impresionfactura_wp_impl.this.A396EmprCod = GXv_char5[0] ;
            impresionfactura_wp_impl.this.AV30faccod = GXv_int9[0] ;
            impresionfactura_wp_impl.this.A9606FacHor = GXv_dtime12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV59Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
            AV59Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV51PathFile );
            AV58Sdt_MergePDF.add(AV59Sdt_MergePDF_Item, 0);
            AV28Copias = (short)(AV28Copias-1) ;
            AV13i = (short)(AV13i+1) ;
            AV54registrosleidos = (short)(AV54registrosleidos+1) ;
            AV66x = (short)(AV66x+1) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      if ( AV92GXLvl391 == 0 )
      {
         AV66x = (short)(AV66x+1) ;
      }
      if ( (0==AV54registrosleidos) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se proceso ningun registro", ""));
      }
      AV44ListPdfJson = AV58Sdt_MergePDF.toJSonString(false) ;
      AV57ReportOutPut = GXutil.strReplace( AV57ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), GXutil.trim( AV73sclicod)) ;
      AV53PathPDFFull = AV74AppTool.merge(AV44ListPdfJson, AV57ReportOutPut, true) ;
      AV37Aviso = AV74AppTool.printto(AV53PathPDFFull, AV45ListPrinter, (byte)(AV5Copias2), true, false) ;
      if ( GXutil.strcmp(AV37Aviso, "SUCCESS") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( " Documento enviado a la impressora con sucesso ! ", ""));
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( " Impression no se pudo ser realizada! ", ""));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e171ZV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_149_1ZV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_149_1ZV2e( true) ;
      }
      else
      {
         wb_table1_149_1ZV2e( false) ;
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
      pa1ZV2( ) ;
      ws1ZV2( ) ;
      we1ZV2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143527", true, true);
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
      httpContext.AddJavascriptSource("facturacion/impresionfactura_wp.js", "?202682116143528", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavFacfchfrom_Internalname = "vFACFCHFROM" ;
      edtavFacfchto_Internalname = "vFACFCHTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavFaccodfrom_Internalname = "vFACCODFROM" ;
      edtavFaccodto_Internalname = "vFACCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavCopias2_Internalname = "vCOPIAS2" ;
      chkavVersumlin.setInternalname( "vVERSUMLIN" );
      cmbavF_header.setInternalname( "vF_HEADER" );
      cmbavAgr_fases.setInternalname( "vAGR_FASES" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      chkavMail.setInternalname( "vMAIL" );
      chkavVermail.setInternalname( "vVERMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      chkavManaut.setInternalname( "vMANAUT" );
      chkavOpi.setInternalname( "vOPI" );
      lblTextblockcombo_listprinter_Internalname = "TEXTBLOCKCOMBO_LISTPRINTER" ;
      Combo_listprinter_Internalname = "COMBO_LISTPRINTER" ;
      divTablesplittedlistprinter_Internalname = "TABLESPLITTEDLISTPRINTER" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Innewwindowpdf_Internalname = "INNEWWINDOWPDF" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavListprinter_Internalname = "vLISTPRINTER" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavListprinter_Jsonclick = "" ;
      edtavListprinter_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Combo_listprinter_Caption = "" ;
      divTablesplittedlistprinter_Visible = 1 ;
      chkavOpi.setEnabled( 1 );
      chkavManaut.setEnabled( 1 );
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavVermail.setEnabled( 1 );
      chkavMail.setEnabled( 1 );
      cmbavAgr_fases.setJsonclick( "" );
      cmbavAgr_fases.setEnabled( 1 );
      cmbavF_header.setJsonclick( "" );
      cmbavF_header.setEnabled( 1 );
      chkavVersumlin.setEnabled( 1 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      edtavFaccodto_Jsonclick = "" ;
      edtavFaccodto_Enabled = 1 ;
      edtavFaccodfrom_Jsonclick = "" ;
      edtavFaccodfrom_Enabled = 1 ;
      edtavFacfchto_Jsonclick = "" ;
      edtavFacfchto_Enabled = 1 ;
      edtavFacfchfrom_Jsonclick = "" ;
      edtavFacfchfrom_Enabled = 1 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Pretende imprimir as faturas??" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Filtros", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_listprinter_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_listprinter_Visible = GXutil.toBoolean( -1) ;
      Combo_listprinter_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impresion Factura", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavVersumlin.setName( "vVERSUMLIN" );
      chkavVersumlin.setWebtags( "" );
      chkavVersumlin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVersumlin.getInternalname(), "TitleCaption", chkavVersumlin.getCaption(), true);
      chkavVersumlin.setCheckedValue( "0" );
      AV15VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV15VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15VerSumLin", GXutil.str( AV15VerSumLin, 1, 0));
      cmbavF_header.setName( "vF_HEADER" );
      cmbavF_header.setWebtags( "" );
      cmbavF_header.addItem("1", httpContext.getMessage( "Formato Inicial", ""), (short)(0));
      cmbavF_header.addItem("2", httpContext.getMessage( "Formato Novo", ""), (short)(0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV12F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV12F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12F_header", GXutil.str( AV12F_header, 1, 0));
      }
      cmbavAgr_fases.setName( "vAGR_FASES" );
      cmbavAgr_fases.setWebtags( "" );
      cmbavAgr_fases.addItem("1", httpContext.getMessage( "Agrupaçao Fases", ""), (short)(0));
      cmbavAgr_fases.addItem("2", httpContext.getMessage( "Agrupaçao + Detalle Fases ", ""), (short)(0));
      cmbavAgr_fases.addItem("3", httpContext.getMessage( "Detalle Fases", ""), (short)(0));
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV16Agr_Fases = (short)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV16Agr_Fases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Agr_Fases), 4, 0));
      }
      chkavMail.setName( "vMAIL" );
      chkavMail.setWebtags( "" );
      chkavMail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavMail.getInternalname(), "TitleCaption", chkavMail.getCaption(), true);
      chkavMail.setCheckedValue( "N" );
      AV48Mail = ((GXutil.strcmp(GXutil.rtrim( AV48Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Mail", AV48Mail);
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV64VerMail = GXutil.strtobool( GXutil.booltostr( AV64VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64VerMail", AV64VerMail);
      chkavManaut.setName( "vMANAUT" );
      chkavManaut.setWebtags( "" );
      chkavManaut.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavManaut.getInternalname(), "TitleCaption", chkavManaut.getCaption(), true);
      chkavManaut.setCheckedValue( "M" );
      AV17ManAut = ((GXutil.strcmp(GXutil.rtrim( AV17ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ManAut", AV17ManAut);
      chkavOpi.setName( "vOPI" );
      chkavOpi.setWebtags( "" );
      chkavOpi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpi.getInternalname(), "TitleCaption", chkavOpi.getCaption(), true);
      chkavOpi.setCheckedValue( "0" );
      AV50Opi = ((GXutil.strcmp(GXutil.rtrim( AV50Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Opi", AV50Opi);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV15VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV48Mail',fld:'vMAIL',pic:''},{av:'AV64VerMail',fld:'vVERMAIL',pic:''},{av:'AV17ManAut',fld:'vMANAUT',pic:''},{av:'AV50Opi',fld:'vOPI',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV27PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'AV11Var_OutPut',fld:'vVAR_OUTPUT',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV65WWPContext',fld:'vWWPCONTEXT',pic:'',hsh:true},{av:'AV52PATHPDF',fld:'vPATHPDF',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e161ZV2',iparms:[]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e141ZV2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV17ManAut',fld:'vMANAUT',pic:''},{av:'AV18FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'AV19FacCodto',fld:'vFACCODTO',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'AV20FacFchfrom',fld:'vFACFCHFROM',pic:''},{av:'AV21FacFchto',fld:'vFACFCHTO',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV22CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV23CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'AV27PRIO',fld:'vPRIO',pic:'9',hsh:true},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'AV48Mail',fld:'vMAIL',pic:''},{av:'AV50Opi',fld:'vOPI',pic:''},{av:'AV41FacEst',fld:'vFACEST',pic:'9'},{av:'AV42FacEstto',fld:'vFACESTTO',pic:'9'},{av:'A10050Cliemf',fld:'CLIEMF',pic:''},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV11Var_OutPut',fld:'vVAR_OUTPUT',pic:'',hsh:true},{av:'cmbavF_header'},{av:'AV12F_header',fld:'vF_HEADER',pic:'9'},{av:'cmbavAgr_fases'},{av:'AV16Agr_Fases',fld:'vAGR_FASES',pic:'ZZZ9'},{av:'AV15VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV5Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV52PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV64VerMail',fld:'vVERMAIL',pic:''},{av:'AV60sfaccod',fld:'vSFACCOD',pic:''},{av:'AV6Copia',fld:'vCOPIA',pic:''},{av:'AV73sclicod',fld:'vSCLICOD',pic:''},{av:'AV45ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV65WWPContext',fld:'vWWPCONTEXT',pic:'',hsh:true},{av:'AV72CliCod_fra',fld:'vCLICOD_FRA',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV41FacEst',fld:'vFACEST',pic:'9'},{av:'AV42FacEstto',fld:'vFACESTTO',pic:'9'},{av:'AV60sfaccod',fld:'vSFACCOD',pic:''},{av:'AV18FacCodfrom',fld:'vFACCODFROM',pic:'ZZZZZZZ9'},{av:'AV72CliCod_fra',fld:'vCLICOD_FRA',pic:'ZZZZZ9'},{av:'AV73sclicod',fld:'vSCLICOD',pic:''},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e111ZV1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e131ZV2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV23CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e121ZV2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV22CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
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
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_listprinter_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV10EmprCod = "" ;
      AV27PRIO = "" ;
      AV11Var_OutPut = "" ;
      Gx_date = GXutil.nullDate() ;
      AV65WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV52PATHPDF = "" ;
      AV24CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV26CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV46ListPrinter_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      A436FacFch = GXutil.nullDate() ;
      A450FacPri = "" ;
      A10050Cliemf = "" ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      AV60sfaccod = "" ;
      AV6Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV6Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV73sclicod = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedtext_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_clicodfrom_Caption = "" ;
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      Combo_clicodto_Caption = "" ;
      TempTags = "" ;
      AV20FacFchfrom = GXutil.nullDate() ;
      AV21FacFchto = GXutil.nullDate() ;
      AV48Mail = "" ;
      AV17ManAut = "" ;
      AV50Opi = "" ;
      lblTextblockcombo_listprinter_Jsonclick = "" ;
      ucCombo_listprinter = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV84Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucInnewwindowpdf = new com.genexus.webpanels.GXUserControl();
      AV45ListPrinter = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV77Station = "" ;
      GXv_char3 = new String[1] ;
      AV8EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV9UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      scmdbuf = "" ;
      H01ZV2_A1153FacTipFac = new byte[1] ;
      H01ZV2_A450FacPri = new String[] {""} ;
      H01ZV2_A252CliCod = new int[1] ;
      H01ZV2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZV2_A430FacCod = new int[1] ;
      H01ZV2_A435FacEst = new byte[1] ;
      H01ZV2_A396EmprCod = new String[] {""} ;
      AV47ListPrinter_Data_Item = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01ZV3_A396EmprCod = new String[] {""} ;
      H01ZV3_A10045CliAct = new String[] {""} ;
      H01ZV3_A13735CliCNom = new String[] {""} ;
      H01ZV3_A252CliCod = new int[1] ;
      H01ZV3_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      AV25Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01ZV4_A396EmprCod = new String[] {""} ;
      H01ZV4_A10045CliAct = new String[] {""} ;
      H01ZV4_A13735CliCNom = new String[] {""} ;
      H01ZV4_A252CliCod = new int[1] ;
      H01ZV4_A279CliNom = new String[] {""} ;
      AV61STR_SDTListPrinter = "" ;
      AV74AppTool = new app.SdtAppTool(remoteHandle, context);
      AV78Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV79SDTListPrinter = new GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem>(app.SdtSDTListPrinter_SDTListPrinterItem.class, "SDTListPrinterItem", "TexplusNET", remoteHandle);
      AV80SDTListPrinter_item = new app.SdtSDTListPrinter_SDTListPrinterItem(remoteHandle, context);
      H01ZV5_A1153FacTipFac = new byte[1] ;
      H01ZV5_A450FacPri = new String[] {""} ;
      H01ZV5_A252CliCod = new int[1] ;
      H01ZV5_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZV5_A430FacCod = new int[1] ;
      H01ZV5_A435FacEst = new byte[1] ;
      H01ZV5_A396EmprCod = new String[] {""} ;
      H01ZV5_A10050Cliemf = new String[] {""} ;
      H01ZV5_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZV5_A279CliNom = new String[] {""} ;
      AV38Cliemf = "" ;
      GXv_boolean11 = new boolean[1] ;
      AV58Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV57ReportOutPut = "" ;
      AV62strDate = "" ;
      AV56ReportInPut = "" ;
      H01ZV6_A1153FacTipFac = new byte[1] ;
      H01ZV6_A450FacPri = new String[] {""} ;
      H01ZV6_A252CliCod = new int[1] ;
      H01ZV6_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZV6_A430FacCod = new int[1] ;
      H01ZV6_A435FacEst = new byte[1] ;
      H01ZV6_A396EmprCod = new String[] {""} ;
      H01ZV6_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      AV14TextoCopia = "" ;
      AV51PathFile = "" ;
      AV59Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV44ListPdfJson = "" ;
      AV53PathPDFFull = "" ;
      AV43Link = "" ;
      GXt_char2 = "" ;
      H01ZV7_A1153FacTipFac = new byte[1] ;
      H01ZV7_A450FacPri = new String[] {""} ;
      H01ZV7_A252CliCod = new int[1] ;
      H01ZV7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZV7_A430FacCod = new int[1] ;
      H01ZV7_A435FacEst = new byte[1] ;
      H01ZV7_A396EmprCod = new String[] {""} ;
      H01ZV7_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      GXv_char5 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_dtime12 = new java.util.Date[1] ;
      AV37Aviso = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.impresionfactura_wp__default(),
         new Object[] {
             new Object[] {
            H01ZV2_A1153FacTipFac, H01ZV2_A450FacPri, H01ZV2_A252CliCod, H01ZV2_A436FacFch, H01ZV2_A430FacCod, H01ZV2_A435FacEst, H01ZV2_A396EmprCod
            }
            , new Object[] {
            H01ZV3_A396EmprCod, H01ZV3_A10045CliAct, H01ZV3_A13735CliCNom, H01ZV3_A252CliCod, H01ZV3_A279CliNom
            }
            , new Object[] {
            H01ZV4_A396EmprCod, H01ZV4_A10045CliAct, H01ZV4_A13735CliCNom, H01ZV4_A252CliCod, H01ZV4_A279CliNom
            }
            , new Object[] {
            H01ZV5_A1153FacTipFac, H01ZV5_A450FacPri, H01ZV5_A252CliCod, H01ZV5_A436FacFch, H01ZV5_A430FacCod, H01ZV5_A435FacEst, H01ZV5_A396EmprCod, H01ZV5_A10050Cliemf, H01ZV5_A9606FacHor, H01ZV5_A279CliNom
            }
            , new Object[] {
            H01ZV6_A1153FacTipFac, H01ZV6_A450FacPri, H01ZV6_A252CliCod, H01ZV6_A436FacFch, H01ZV6_A430FacCod, H01ZV6_A435FacEst, H01ZV6_A396EmprCod, H01ZV6_A9606FacHor
            }
            , new Object[] {
            H01ZV7_A1153FacTipFac, H01ZV7_A450FacPri, H01ZV7_A252CliCod, H01ZV7_A436FacFch, H01ZV7_A430FacCod, H01ZV7_A435FacEst, H01ZV7_A396EmprCod, H01ZV7_A9606FacHor
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV84Pgmname = "Facturacion.ImpresionFactura_WP" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV84Pgmname = "Facturacion.ImpresionFactura_WP" ;
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A435FacEst ;
   private byte A1153FacTipFac ;
   private byte AV41FacEst ;
   private byte AV42FacEstto ;
   private byte AV15VerSumLin ;
   private byte AV12F_header ;
   private byte nDonePA ;
   private byte AV91GXLvl317 ;
   private byte AV92GXLvl391 ;
   private byte nGXWrapped ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV5Copias2 ;
   private short AV16Agr_Fases ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV28Copias ;
   private short AV67Year ;
   private short AV39Day ;
   private short AV49Mounth ;
   private short AV54registrosleidos ;
   private short AV66x ;
   private short AV13i ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int AV72CliCod_fra ;
   private int edtavFacfchfrom_Enabled ;
   private int edtavFacfchto_Enabled ;
   private int AV18FacCodfrom ;
   private int edtavFaccodfrom_Enabled ;
   private int AV19FacCodto ;
   private int edtavFaccodto_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int divTablesplittedlistprinter_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV22CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV23CliCodto ;
   private int edtavClicodto_Visible ;
   private int edtavListprinter_Visible ;
   private int GXt_int8 ;
   private int AV89GXV1 ;
   private int AV30faccod ;
   private int AV75CliCod ;
   private int GXv_int9[] ;
   private int idxLst ;
   private int GX_I ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_listprinter_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV10EmprCod ;
   private String AV27PRIO ;
   private String AV11Var_OutPut ;
   private String GXKey ;
   private String AV52PATHPDF ;
   private String A396EmprCod ;
   private String A450FacPri ;
   private String A10050Cliemf ;
   private String A279CliNom ;
   private String AV60sfaccod ;
   private String AV6Copia[] ;
   private String AV73sclicod ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Combo_listprinter_Cls ;
   private String Combo_listprinter_Selectedvalue_set ;
   private String Combo_listprinter_Selectedtext_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divTablesplittedclicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Internalname ;
   private String lblTextblockcombo_clicodfrom_Jsonclick ;
   private String Combo_clicodfrom_Caption ;
   private String Combo_clicodfrom_Internalname ;
   private String divTablesplittedclicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Internalname ;
   private String lblTextblockcombo_clicodto_Jsonclick ;
   private String Combo_clicodto_Caption ;
   private String Combo_clicodto_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavFacfchfrom_Internalname ;
   private String TempTags ;
   private String edtavFacfchfrom_Jsonclick ;
   private String edtavFacfchto_Internalname ;
   private String edtavFacfchto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavFaccodfrom_Internalname ;
   private String edtavFaccodfrom_Jsonclick ;
   private String edtavFaccodto_Internalname ;
   private String edtavFaccodto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String AV48Mail ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String AV17ManAut ;
   private String AV50Opi ;
   private String divTablesplittedlistprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Jsonclick ;
   private String Combo_listprinter_Caption ;
   private String Combo_listprinter_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV84Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Innewwindowpdf_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavListprinter_Internalname ;
   private String edtavListprinter_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String AV77Station ;
   private String GXv_char3[] ;
   private String AV8EmprNom ;
   private String GXv_char4[] ;
   private String AV9UsurCod ;
   private String scmdbuf ;
   private String A10045CliAct ;
   private String AV38Cliemf ;
   private String AV14TextoCopia ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private java.util.Date A9606FacHor ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date Gx_date ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV20FacFchfrom ;
   private java.util.Date AV21FacFchto ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_listprinter_Visible ;
   private boolean Combo_listprinter_Emptyitem ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV64VerMail ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV69Factura_existe ;
   private boolean GXt_boolean10 ;
   private boolean GXv_boolean11[] ;
   private String AV61STR_SDTListPrinter ;
   private String AV44ListPdfJson ;
   private String AV45ListPrinter ;
   private String A13735CliCNom ;
   private String AV57ReportOutPut ;
   private String AV62strDate ;
   private String AV56ReportInPut ;
   private String AV51PathFile ;
   private String AV53PathPDFFull ;
   private String AV43Link ;
   private String AV37Aviso ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_listprinter ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucInnewwindowpdf ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem> AV79SDTListPrinter ;
   private app.SdtAppTool AV74AppTool ;
   private ICheckbox chkavVersumlin ;
   private HTMLChoice cmbavF_header ;
   private HTMLChoice cmbavAgr_fases ;
   private ICheckbox chkavMail ;
   private ICheckbox chkavVermail ;
   private ICheckbox chkavManaut ;
   private ICheckbox chkavOpi ;
   private IDataStoreProvider pr_default ;
   private byte[] H01ZV2_A1153FacTipFac ;
   private String[] H01ZV2_A450FacPri ;
   private int[] H01ZV2_A252CliCod ;
   private java.util.Date[] H01ZV2_A436FacFch ;
   private int[] H01ZV2_A430FacCod ;
   private byte[] H01ZV2_A435FacEst ;
   private String[] H01ZV2_A396EmprCod ;
   private String[] H01ZV3_A396EmprCod ;
   private String[] H01ZV3_A10045CliAct ;
   private String[] H01ZV3_A13735CliCNom ;
   private int[] H01ZV3_A252CliCod ;
   private String[] H01ZV3_A279CliNom ;
   private String[] H01ZV4_A396EmprCod ;
   private String[] H01ZV4_A10045CliAct ;
   private String[] H01ZV4_A13735CliCNom ;
   private int[] H01ZV4_A252CliCod ;
   private String[] H01ZV4_A279CliNom ;
   private byte[] H01ZV5_A1153FacTipFac ;
   private String[] H01ZV5_A450FacPri ;
   private int[] H01ZV5_A252CliCod ;
   private java.util.Date[] H01ZV5_A436FacFch ;
   private int[] H01ZV5_A430FacCod ;
   private byte[] H01ZV5_A435FacEst ;
   private String[] H01ZV5_A396EmprCod ;
   private String[] H01ZV5_A10050Cliemf ;
   private java.util.Date[] H01ZV5_A9606FacHor ;
   private String[] H01ZV5_A279CliNom ;
   private byte[] H01ZV6_A1153FacTipFac ;
   private String[] H01ZV6_A450FacPri ;
   private int[] H01ZV6_A252CliCod ;
   private java.util.Date[] H01ZV6_A436FacFch ;
   private int[] H01ZV6_A430FacCod ;
   private byte[] H01ZV6_A435FacEst ;
   private String[] H01ZV6_A396EmprCod ;
   private java.util.Date[] H01ZV6_A9606FacHor ;
   private byte[] H01ZV7_A1153FacTipFac ;
   private String[] H01ZV7_A450FacPri ;
   private int[] H01ZV7_A252CliCod ;
   private java.util.Date[] H01ZV7_A436FacFch ;
   private int[] H01ZV7_A430FacCod ;
   private byte[] H01ZV7_A435FacEst ;
   private String[] H01ZV7_A396EmprCod ;
   private java.util.Date[] H01ZV7_A9606FacHor ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV78Messages ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV26CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46ListPrinter_Data ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV58Sdt_MergePDF ;
   private app.SdtSDTListPrinter_SDTListPrinterItem AV80SDTListPrinter_item ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV47ListPrinter_Data_Item ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV25Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV40DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.SdtSdt_MergePDF_PDF AV59Sdt_MergePDF_Item ;
   private app.wwpbaseobjects.SdtWWPContext AV65WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class impresionfactura_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01ZV2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV18FacCodfrom ,
                                          int AV19FacCodto ,
                                          java.util.Date AV20FacFchfrom ,
                                          java.util.Date AV21FacFchto ,
                                          int AV22CliCodfrom ,
                                          int AV23CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          byte AV41FacEst ,
                                          byte AV42FacEstto ,
                                          String A450FacPri ,
                                          String AV27PRIO ,
                                          byte A1153FacTipFac ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[10];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT FacTipFac, FacPri, CliCod, FacFch, FacCod, FacEst, EmprCod FROM TXPCFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacEst >= ?)");
      addWhere(sWhereString, "(FacEst <= ?)");
      addWhere(sWhereString, "(FacPri = ?)");
      addWhere(sWhereString, "(FacTipFac = 0)");
      if ( ! (0==AV18FacCodfrom) )
      {
         addWhere(sWhereString, "(FacCod >= ?)");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
      }
      if ( ! (0==AV19FacCodto) )
      {
         addWhere(sWhereString, "(FacCod <= ?)");
      }
      else
      {
         GXv_int13[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20FacFchfrom)) )
      {
         addWhere(sWhereString, "(FacFch >= ?)");
      }
      else
      {
         GXv_int13[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21FacFchto)) )
      {
         addWhere(sWhereString, "(FacFch <= ?)");
      }
      else
      {
         GXv_int13[7] = (byte)(1) ;
      }
      if ( ! (0==AV22CliCodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int13[8] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int13[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, FacCod" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01ZV5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV18FacCodfrom ,
                                          int AV19FacCodto ,
                                          java.util.Date AV20FacFchfrom ,
                                          java.util.Date AV21FacFchto ,
                                          int AV22CliCodfrom ,
                                          int AV23CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          byte AV41FacEst ,
                                          byte AV42FacEstto ,
                                          String A450FacPri ,
                                          String AV27PRIO ,
                                          byte A1153FacTipFac ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[10];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT T1.FacTipFac, T1.FacPri, T1.CliCod, T1.FacFch, T1.FacCod, T1.FacEst, T1.EmprCod, T2.Cliemf, T1.FacHor, T2.CliNom FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.FacEst >= ?)");
      addWhere(sWhereString, "(T1.FacEst <= ?)");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( ! (0==AV18FacCodfrom) )
      {
         addWhere(sWhereString, "(T1.FacCod >= ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (0==AV19FacCodto) )
      {
         addWhere(sWhereString, "(T1.FacCod <= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20FacFchfrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21FacFchto)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV22CliCodfrom) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.FacCod" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01ZV6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV18FacCodfrom ,
                                          int AV19FacCodto ,
                                          java.util.Date AV20FacFchfrom ,
                                          java.util.Date AV21FacFchto ,
                                          int AV22CliCodfrom ,
                                          int AV23CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          byte AV41FacEst ,
                                          byte AV42FacEstto ,
                                          String A450FacPri ,
                                          String AV27PRIO ,
                                          byte A1153FacTipFac ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[10];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT FacTipFac, FacPri, CliCod, FacFch, FacCod, FacEst, EmprCod, FacHor FROM TXPCFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacEst >= ?)");
      addWhere(sWhereString, "(FacEst <= ?)");
      addWhere(sWhereString, "(FacPri = ?)");
      addWhere(sWhereString, "(FacTipFac = 0)");
      if ( ! (0==AV18FacCodfrom) )
      {
         addWhere(sWhereString, "(FacCod >= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (0==AV19FacCodto) )
      {
         addWhere(sWhereString, "(FacCod <= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20FacFchfrom)) )
      {
         addWhere(sWhereString, "(FacFch >= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21FacFchto)) )
      {
         addWhere(sWhereString, "(FacFch <= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV22CliCodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, FacCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01ZV7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV18FacCodfrom ,
                                          int AV19FacCodto ,
                                          java.util.Date AV20FacFchfrom ,
                                          java.util.Date AV21FacFchto ,
                                          int AV22CliCodfrom ,
                                          int AV23CliCodto ,
                                          int A430FacCod ,
                                          java.util.Date A436FacFch ,
                                          int A252CliCod ,
                                          byte A435FacEst ,
                                          byte AV41FacEst ,
                                          byte AV42FacEstto ,
                                          String A450FacPri ,
                                          String AV27PRIO ,
                                          byte A1153FacTipFac ,
                                          String AV10EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[10];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT FacTipFac, FacPri, CliCod, FacFch, FacCod, FacEst, EmprCod, FacHor FROM TXPCFAVEN" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(FacEst >= ?)");
      addWhere(sWhereString, "(FacEst <= ?)");
      addWhere(sWhereString, "(FacPri = ?)");
      addWhere(sWhereString, "(FacTipFac = 0)");
      if ( ! (0==AV18FacCodfrom) )
      {
         addWhere(sWhereString, "(FacCod >= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (0==AV19FacCodto) )
      {
         addWhere(sWhereString, "(FacCod <= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV20FacFchfrom)) )
      {
         addWhere(sWhereString, "(FacFch >= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21FacFchto)) )
      {
         addWhere(sWhereString, "(FacFch <= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV22CliCodfrom) )
      {
         addWhere(sWhereString, "(CliCod >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodto) )
      {
         addWhere(sWhereString, "(CliCod <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, FacCod" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H01ZV2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 3 :
                  return conditional_H01ZV5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 4 :
                  return conditional_H01ZV6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
            case 5 :
                  return conditional_H01ZV7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZV2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZV3", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZV4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZV5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZV6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZV7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 40);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[12]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               return;
      }
   }

}

