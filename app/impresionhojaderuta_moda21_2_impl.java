package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresionhojaderuta_moda21_2_impl extends GXDataArea
{
   public impresionhojaderuta_moda21_2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresionhojaderuta_moda21_2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresionhojaderuta_moda21_2_impl.class ));
   }

   public impresionhojaderuta_moda21_2_impl( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavAutomatico = UIFactory.getCheckbox(this);
      chkavOpi = UIFactory.getCheckbox(this);
      chkavImp_bol = UIFactory.getCheckbox(this);
      chkavNo_hdr = UIFactory.getCheckbox(this);
      chkavNo_regqua = UIFactory.getCheckbox(this);
      chkavNo_regcarlam = UIFactory.getCheckbox(this);
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
      pa2A32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2A32( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.impresionhojaderuta_moda21_2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vYEAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOUNTH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDAY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLI350", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cli350), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV60WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTPUTI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Outputi, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV63DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV63DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTPRINTER_DATA", AV62ListPrinter_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTPRINTER_DATA", AV62ListPrinter_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV50Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vYEAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMOUNTH", GXutil.ltrim( localUtil.ntoc( AV52Mounth, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOUNTH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDAY", GXutil.ltrim( localUtil.ntoc( AV51Day, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDAY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV34PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARLIS", GXutil.ltrim( localUtil.ntoc( A178BarLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASOPEINS", GXutil.rtrim( A7057FasOpeIns));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCARDA", GXutil.rtrim( A13809FasCarda));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLI350", GXutil.ltrim( localUtil.ntoc( AV17Cli350, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLI350", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cli350), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV5ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5ContVal), "ZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWWPCONTEXT", AV60WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT", AV60WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV60WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV23ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTPUTI", GXutil.rtrim( AV32Outputi));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTPUTI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Outputi, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Cls", GXutil.rtrim( Combo_listprinter_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_set", GXutil.rtrim( Combo_listprinter_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedtext_set", GXutil.rtrim( Combo_listprinter_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Visible", GXutil.booltostr( Combo_listprinter_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Emptyitem", GXutil.booltostr( Combo_listprinter_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Width", GXutil.rtrim( Dvpanel_unnamedtable6_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable6_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable6_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Cls", GXutil.rtrim( Dvpanel_unnamedtable6_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Title", GXutil.rtrim( Dvpanel_unnamedtable6_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable6_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable6_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable6_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE6_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable6_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_get", GXutil.rtrim( Combo_listprinter_Selectedvalue_get));
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
         we2A32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2A32( ) ;
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
      return formatLink("app.impresionhojaderuta_moda21_2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ImpresionHojadeRuta_Moda21_2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impressão da Ordem de Serviço", "") ;
   }

   public void wb2A30( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Desde", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº O.S", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV12BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV12BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV10BarCodPar), GXutil.rtrim( localUtil.format( AV10BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup5_Internalname, httpContext.getMessage( "Hasta", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodto_Internalname, httpContext.getMessage( "Nº O.S", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV14BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoto_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparto_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV11BarCodParto), GXutil.rtrim( localUtil.format( AV11BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable6.setProperty("Width", Dvpanel_unnamedtable6_Width);
         ucDvpanel_unnamedtable6.setProperty("AutoWidth", Dvpanel_unnamedtable6_Autowidth);
         ucDvpanel_unnamedtable6.setProperty("AutoHeight", Dvpanel_unnamedtable6_Autoheight);
         ucDvpanel_unnamedtable6.setProperty("Cls", Dvpanel_unnamedtable6_Cls);
         ucDvpanel_unnamedtable6.setProperty("Title", Dvpanel_unnamedtable6_Title);
         ucDvpanel_unnamedtable6.setProperty("Collapsible", Dvpanel_unnamedtable6_Collapsible);
         ucDvpanel_unnamedtable6.setProperty("Collapsed", Dvpanel_unnamedtable6_Collapsed);
         ucDvpanel_unnamedtable6.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable6_Showcollapseicon);
         ucDvpanel_unnamedtable6.setProperty("IconPosition", Dvpanel_unnamedtable6_Iconposition);
         ucDvpanel_unnamedtable6.setProperty("AutoScroll", Dvpanel_unnamedtable6_Autoscroll);
         ucDvpanel_unnamedtable6.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable6_Internalname, "DVPANEL_UNNAMEDTABLE6Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE6Container"+"UnnamedTable6"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavAutomatico.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavAutomatico.getInternalname(), httpContext.getMessage( "Automatico?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavAutomatico.getInternalname(), GXutil.str( AV7Automatico, 1, 0), "", httpContext.getMessage( "Automatico?", ""), 1, chkavAutomatico.getEnabled(), "1", httpContext.getMessage( "Automatico?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(68, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpi.getInternalname(), httpContext.getMessage( "Ecrã", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpi.getInternalname(), AV31Opi, "", httpContext.getMessage( "Ecrã", ""), 1, chkavOpi.getEnabled(), "1", httpContext.getMessage( "Ecrã", ""), StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,72);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Nº Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV19Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlistprinter_Internalname, divTablesplittedlistprinter_Visible, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_listprinter_Internalname, httpContext.getMessage( "Impressora Servidor", ""), "", "", lblTextblockcombo_listprinter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_listprinter.setProperty("Caption", Combo_listprinter_Caption);
         ucCombo_listprinter.setProperty("Cls", Combo_listprinter_Cls);
         ucCombo_listprinter.setProperty("EmptyItem", Combo_listprinter_Emptyitem);
         ucCombo_listprinter.setProperty("DropDownOptionsTitleSettingsIcons", AV63DDO_TitleSettingsIcons);
         ucCombo_listprinter.setProperty("DropDownOptionsData", AV62ListPrinter_Data);
         ucCombo_listprinter.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_listprinter_Internalname, "COMBO_LISTPRINTERContainer");
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
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavImp_bol.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavImp_bol.getInternalname(), AV22imp_bol, "", "", 1, chkavImp_bol.getEnabled(), "S", httpContext.getMessage( "Imprimir Boletim de nao Conformidade?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(93, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,93);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavNo_hdr.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavNo_hdr.getInternalname(), AV26No_hdr, "", "", 1, chkavNo_hdr.getEnabled(), "S", httpContext.getMessage( "Nao Imprimir Ordem Serviço", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(97, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,97);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavNo_regqua.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavNo_regqua.getInternalname(), AV28No_RegQua, "", "", 1, chkavNo_regqua.getEnabled(), "S", httpContext.getMessage( "Nao Imprimir registo de qualidade", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(101, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,101);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavNo_regcarlam.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavNo_regcarlam.getInternalname(), AV27No_regcarlam, "", "", 1, chkavNo_regcarlam.getEnabled(), "S", httpContext.getMessage( "Nao Imprimir resgisto Cada/E/L", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(105, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,105);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "TablePaddingTop5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Imprimir", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionHojadeRuta_Moda21_2.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV74Pgmname), GXutil.rtrim( localUtil.format( AV74Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListprinter_Internalname, AV61ListPrinter, GXutil.rtrim( localUtil.format( AV61ListPrinter, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,132);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListprinter_Jsonclick, 0, "Attribute", "", "", "", "", edtavListprinter_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavListpdfjson_Internalname, AV25ListPdfJson, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,133);\"", (short)(0), edtavListpdfjson_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ImpresionHojadeRuta_Moda21_2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2A32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impressão da Ordem de Serviço", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2A30( ) ;
   }

   public void ws2A32( )
   {
      start2A32( ) ;
      evt2A32( ) ;
   }

   public void evt2A32( )
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
                           e112A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e122A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e132A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e142A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODREO.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172A32 ();
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

   public void we2A32( )
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

   public void pa2A32( )
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
            GX_FocusControl = edtavBarcod_Internalname ;
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
      AV7Automatico = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV7Automatico, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Automatico", GXutil.str( AV7Automatico, 1, 0));
      AV31Opi = ((GXutil.strcmp(GXutil.rtrim( AV31Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Opi", AV31Opi);
      AV22imp_bol = ((GXutil.strcmp(GXutil.rtrim( AV22imp_bol), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22imp_bol", AV22imp_bol);
      AV26No_hdr = ((GXutil.strcmp(GXutil.rtrim( AV26No_hdr), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26No_hdr", AV26No_hdr);
      AV28No_RegQua = ((GXutil.strcmp(GXutil.rtrim( AV28No_RegQua), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28No_RegQua", AV28No_RegQua);
      AV27No_regcarlam = ((GXutil.strcmp(GXutil.rtrim( AV27No_regcarlam), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27No_regcarlam", AV27No_regcarlam);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2A32( ) ;
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
      AV74Pgmname = "ImpresionHojadeRuta_Moda21_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2A32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e142A32 ();
         wb2A30( ) ;
      }
   }

   public void send_integrity_lvl_hashes2A32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vYEAR", GXutil.ltrim( localUtil.ntoc( AV50Year, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vYEAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMOUNTH", GXutil.ltrim( localUtil.ntoc( AV52Mounth, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOUNTH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDAY", GXutil.ltrim( localUtil.ntoc( AV51Day, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDAY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV34PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV20EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLI350", GXutil.ltrim( localUtil.ntoc( AV17Cli350, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLI350", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cli350), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV5ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5ContVal), "ZZZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vWWPCONTEXT", AV60WWPContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vWWPCONTEXT", AV60WWPContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWWPCONTEXT", getSecureSignedToken( "", AV60WWPContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV23ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTPUTI", GXutil.rtrim( AV32Outputi));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTPUTI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Outputi, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "ImpresionHojadeRuta_Moda21_2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2A30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e112A32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV63DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLISTPRINTER_DATA"), AV62ListPrinter_Data);
         /* Read saved values. */
         Combo_listprinter_Cls = httpContext.cgiGet( "COMBO_LISTPRINTER_Cls") ;
         Combo_listprinter_Selectedvalue_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedvalue_set") ;
         Combo_listprinter_Selectedtext_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedtext_set") ;
         Combo_listprinter_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Visible")) ;
         Combo_listprinter_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Emptyitem")) ;
         Dvpanel_unnamedtable6_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Width") ;
         Dvpanel_unnamedtable6_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autowidth")) ;
         Dvpanel_unnamedtable6_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoheight")) ;
         Dvpanel_unnamedtable6_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Cls") ;
         Dvpanel_unnamedtable6_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Title") ;
         Dvpanel_unnamedtable6_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsible")) ;
         Dvpanel_unnamedtable6_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Collapsed")) ;
         Dvpanel_unnamedtable6_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Showcollapseicon")) ;
         Dvpanel_unnamedtable6_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Iconposition") ;
         Dvpanel_unnamedtable6_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE6_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         }
         else
         {
            AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarCodReo", GXutil.str( AV12BarCodReo, 1, 0));
         }
         else
         {
            AV12BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12BarCodReo", GXutil.str( AV12BarCodReo, 1, 0));
         }
         AV10BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodPar", AV10BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCodto), 8, 0));
         }
         else
         {
            AV14BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReoto", GXutil.str( AV13BarCodReoto, 1, 0));
         }
         else
         {
            AV13BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReoto", GXutil.str( AV13BarCodReoto, 1, 0));
         }
         AV11BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodParto", AV11BarCodParto);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavAutomatico.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavAutomatico.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAUTOMATICO");
            GX_FocusControl = chkavAutomatico.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Automatico = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Automatico", GXutil.str( AV7Automatico, 1, 0));
         }
         else
         {
            AV7Automatico = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavAutomatico.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Automatico", GXutil.str( AV7Automatico, 1, 0));
         }
         AV31Opi = ((GXutil.strcmp(httpContext.cgiGet( chkavOpi.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31Opi", AV31Opi);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Copias2), 4, 0));
         }
         else
         {
            AV19Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Copias2), 4, 0));
         }
         AV22imp_bol = ((GXutil.strcmp(httpContext.cgiGet( chkavImp_bol.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22imp_bol", AV22imp_bol);
         AV26No_hdr = ((GXutil.strcmp(httpContext.cgiGet( chkavNo_hdr.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26No_hdr", AV26No_hdr);
         AV28No_RegQua = ((GXutil.strcmp(httpContext.cgiGet( chkavNo_regqua.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28No_RegQua", AV28No_RegQua);
         AV27No_regcarlam = ((GXutil.strcmp(httpContext.cgiGet( chkavNo_regcarlam.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27No_regcarlam", AV27No_regcarlam);
         AV74Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Pgmname", AV74Pgmname);
         AV61ListPrinter = httpContext.cgiGet( edtavListprinter_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ListPrinter", AV61ListPrinter);
         AV25ListPdfJson = httpContext.cgiGet( edtavListpdfjson_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ListPdfJson", AV25ListPdfJson);
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
      e112A32 ();
      if (returnInSub) return;
   }

   public void e112A32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      impresionhojaderuta_moda21_2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      impresionhojaderuta_moda21_2_impl.this.AV20EmprCod = GXv_char2[0] ;
      impresionhojaderuta_moda21_2_impl.this.AV21EmprNom = GXv_char3[0] ;
      impresionhojaderuta_moda21_2_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV63DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV63DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavListprinter_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListprinter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListprinter_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLISTPRINTER' */
      S112 ();
      if (returnInSub) return;
      edtavListpdfjson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListpdfjson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListpdfjson_Visible), 5, 0), true);
      GXv_SdtWWPContext7[0] = AV60WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV60WWPContext = GXv_SdtWWPContext7[0] ;
      GXt_int8 = (byte)(AV17Cli350) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int9) ;
      impresionhojaderuta_moda21_2_impl.this.GXt_int8 = GXv_int9[0] ;
      AV17Cli350 = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Cli350", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Cli350), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLI350", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Cli350), "ZZZ9")));
      GXt_int10 = AV5ContVal ;
      GXv_int11[0] = GXt_int10 ;
      new app.pbuscon(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "CLI350", ""), GXv_int11) ;
      impresionhojaderuta_moda21_2_impl.this.GXt_int10 = GXv_int11[0] ;
      AV5ContVal = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5ContVal), "ZZZZZZZ9")));
      GXt_int10 = AV18Copias ;
      GXv_int11[0] = GXt_int10 ;
      new app.pbuscon(remoteHandle, context).execute( AV20EmprCod, "100002", GXv_int11) ;
      impresionhojaderuta_moda21_2_impl.this.GXt_int10 = GXv_int11[0] ;
      AV18Copias = (short)(GXt_int10) ;
      AV18Copias = (short)(((0==AV18Copias) ? 1 : AV18Copias)) ;
      AV31Opi = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Opi", AV31Opi);
      AV19Copias2 = AV18Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Copias2), 4, 0));
      AV7Automatico = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Automatico", GXutil.str( AV7Automatico, 1, 0));
      GXt_char1 = AV34PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV20EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      impresionhojaderuta_moda21_2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34PATHPDF", AV34PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PATHPDF, ""))));
      AV50Year = (short)(GXutil.year( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Year", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50Year), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vYEAR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999")));
      AV51Day = (byte)(GXutil.day( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Day", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51Day), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDAY", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99")));
      AV52Mounth = (byte)(GXutil.month( Gx_date)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Mounth", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Mounth), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOUNTH", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99")));
      if ( ! (GXutil.strcmp("", AV60WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV61ListPrinter = AV60WWPContext.getgxTv_SdtWWPContext_Usurprint() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ListPrinter", AV61ListPrinter);
         Combo_listprinter_Selectedtext_set = AV61ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedText_set", Combo_listprinter_Selectedtext_set);
         Combo_listprinter_Selectedvalue_set = AV61ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
      }
   }

   public void e122A32( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV15Barlis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Barlis", GXutil.str( AV15Barlis, 1, 0));
      AV16Barlisto = (byte)(((AV7Automatico==1) ? 0 : 1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Barlisto", GXutil.str( AV16Barlisto, 1, 0));
      AV46x = (short)(1) ;
      AV40Sdt_MergePDF.clear();
      AV48registrosleidos = (short)(0) ;
      AV49strDate = localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999") + localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99") + localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99") ;
      AV54StrNmrHDR = GXutil.format( "%1_%2", GXutil.trim( GXutil.str( AV9BarCod, 8, 0)), GXutil.trim( GXutil.str( AV12BarCodReo, 1, 0)), "", "", "", "", "", "", "") ;
      AV39ReportOutPut = GXutil.format( "%1/OS_%2.pdf", AV34PATHPDF, GXutil.trim( AV54StrNmrHDR), GXutil.trim( AV49strDate), "", "", "", "", "", "") ;
      AV38ReportInPut = GXutil.trim( AV34PATHPDF) ;
      AV76GXLvl58 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9BarCod) ,
                                           Integer.valueOf(AV14BarCodto) ,
                                           Byte.valueOf(AV12BarCodReo) ,
                                           AV10BarCodPar ,
                                           Byte.valueOf(AV13BarCodReoto) ,
                                           AV11BarCodParto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV20EmprCod ,
                                           Byte.valueOf(AV15Barlis) ,
                                           A396EmprCod ,
                                           Byte.valueOf(A178BarLis) ,
                                           Byte.valueOf(AV16Barlisto) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      /* Using cursor H02A32 */
      pr_default.execute(0, new Object[] {AV20EmprCod, Byte.valueOf(AV15Barlis), Byte.valueOf(AV16Barlisto), Integer.valueOf(AV9BarCod), Integer.valueOf(AV14BarCodto), Byte.valueOf(AV12BarCodReo), AV10BarCodPar, Byte.valueOf(AV13BarCodReoto), AV11BarCodParto});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H02A32_A396EmprCod[0] ;
         A130BarCodPar = H02A32_A130BarCodPar[0] ;
         A132BarCodReo = H02A32_A132BarCodReo[0] ;
         A129BarCod = H02A32_A129BarCod[0] ;
         A178BarLis = H02A32_A178BarLis[0] ;
         A252CliCod = H02A32_A252CliCod[0] ;
         n252CliCod = H02A32_n252CliCod[0] ;
         A120BarAgrEst = H02A32_A120BarAgrEst[0] ;
         AV76GXLvl58 = (byte)(1) ;
         AV54StrNmrHDR = "" ;
         AV56Rel_EmprCod = "" ;
         AV57Rel_BarCod = 0 ;
         AV58Rel_BarCodReo = (byte)(0) ;
         AV59Rel_BarCodPar = "" ;
         AV53CliCod = A252CliCod ;
         AV8BarAgrEst = A120BarAgrEst ;
         AV56Rel_EmprCod = A396EmprCod ;
         AV57Rel_BarCod = A129BarCod ;
         AV58Rel_BarCodReo = A132BarCodReo ;
         AV59Rel_BarCodPar = A130BarCodPar ;
         AV30Ok_f = httpContext.getMessage( "N", "") ;
         /* Using cursor H02A33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A457FasCod = H02A33_A457FasCod[0] ;
            A7057FasOpeIns = H02A33_A7057FasOpeIns[0] ;
            n7057FasOpeIns = H02A33_n7057FasOpeIns[0] ;
            A194BarOrdLin = H02A33_A194BarOrdLin[0] ;
            A758ProCod = H02A33_A758ProCod[0] ;
            A7057FasOpeIns = H02A33_A7057FasOpeIns[0] ;
            n7057FasOpeIns = H02A33_n7057FasOpeIns[0] ;
            AV30Ok_f = "S" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV29Ok_cl = "N" ;
         /* Using cursor H02A34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A457FasCod = H02A34_A457FasCod[0] ;
            A13809FasCarda = H02A34_A13809FasCarda[0] ;
            A194BarOrdLin = H02A34_A194BarOrdLin[0] ;
            A758ProCod = H02A34_A758ProCod[0] ;
            A13809FasCarda = H02A34_A13809FasCarda[0] ;
            AV29Ok_cl = "S" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( ( AV17Cli350 == 1 ) && ( AV5ContVal == 1 ) && ( A252CliCod == 350 ) )
         {
         }
         else
         {
            AV18Copias = AV19Copias2 ;
            if ( GXutil.strcmp(AV26No_hdr, "N") == 0 )
            {
               AV18Copias = AV19Copias2 ;
               while ( AV18Copias > 0 )
               {
                  AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                  new app.rhdrmod_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, httpContext.getMessage( "SCR", "")) ;
                  AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                  AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                  AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                  AV18Copias = (short)(AV18Copias-1) ;
                  AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                  AV46x = (short)(AV46x+1) ;
               }
               new app.pbaredi(remoteHandle, context).execute( AV56Rel_EmprCod, AV57Rel_BarCod, AV59Rel_BarCodPar, AV58Rel_BarCodReo) ;
            }
            if ( GXutil.strcmp(AV22imp_bol, "S") == 0 )
            {
               AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
               new app.rhdrbnc_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
               AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
               AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
               AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
               AV48registrosleidos = (short)(AV48registrosleidos+1) ;
               AV46x = (short)(AV46x+1) ;
            }
            AV36Princp = "S" ;
            if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar) ;
               AV36Princp = "N" ;
               if ( ( A129BarCod == AV9BarCod ) && ( AV58Rel_BarCodReo == AV12BarCodReo ) && ( GXutil.strcmp(AV59Rel_BarCodPar, AV10BarCodPar) == 0 ) )
               {
                  AV36Princp = "S" ;
               }
            }
            if ( GXutil.strcmp(AV28No_RegQua, "N") == 0 )
            {
               if ( GXutil.strcmp(AV36Princp, "S") == 0 )
               {
                  AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                  new app.rregqua_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                  AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                  AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                  AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                  AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                  AV46x = (short)(AV46x+1) ;
               }
               else
               {
                  if ( ( GXutil.strcmp(AV8BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV30Ok_f, "S") == 0 ) )
                  {
                     AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                     new app.rregqua_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                     AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                     AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                     AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                     AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                     AV46x = (short)(AV46x+1) ;
                  }
               }
            }
            if ( GXutil.strcmp(AV27No_regcarlam, "N") == 0 )
            {
               if ( GXutil.strcmp(AV29Ok_cl, "S") == 0 )
               {
                  if ( GXutil.strcmp(AV36Princp, "S") == 0 )
                  {
                     AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                     new app.prgcarla_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                     AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                     AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                     AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                     AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                     AV46x = (short)(AV46x+1) ;
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV8BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV29Ok_cl, "S") == 0 ) )
                     {
                        AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                        new app.prgcarla_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                        AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                        AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                        AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                        AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                        AV46x = (short)(AV46x+1) ;
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV76GXLvl58 == 0 )
      {
         AV46x = (short)(AV46x+1) ;
      }
      AV25ListPdfJson = AV40Sdt_MergePDF.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ListPdfJson", AV25ListPdfJson);
      if ( (0==AV48registrosleidos) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se proceso ningun registro", ""));
      }
      else
      {
         AV39ReportOutPut = GXutil.strReplace( AV39ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), localUtil.format( DecimalUtil.doubleToDec(AV53CliCod), "999999")) ;
         AV35PathPDFFull = AV47AppTool.merge(AV25ListPdfJson, AV39ReportOutPut, true) ;
         if ( ( GXutil.strcmp(AV31Opi, "0") == 0 ) && ! (GXutil.strcmp("", AV61ListPrinter)==0) )
         {
            AV71Aviso = AV47AppTool.printto(AV35PathPDFFull, AV61ListPrinter, (byte)(AV19Copias2), true, false) ;
            if ( GXutil.strcmp(AV71Aviso, "SUCCESS") == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( " Documento enviado a la impressora con sucesso ! ", ""));
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( " Impression no se pudo ser realizada! ", ""));
            }
         }
         if ( GXutil.strcmp(AV31Opi, "1") == 0 )
         {
            GXt_char1 = AV24Link ;
            GXv_char4[0] = GXt_char1 ;
            new app.viewfile(remoteHandle, context).execute( AV35PathPDFFull, "", GXv_char4) ;
            impresionhojaderuta_moda21_2_impl.this.GXt_char1 = GXv_char4[0] ;
            AV24Link = GXt_char1 ;
            this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV24Link,httpContext.getMessage( "_blank", "")});
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
            AV39ReportOutPut = "" ;
         }
      }
      /*  Sending Event outputs  */
   }

   public void e132A32( )
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
      /* 'LOADCOMBOLISTPRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV60WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV65ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV65ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV60WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV65ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV60WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV62ListPrinter_Data.add(AV65ListPrinter_Data_Item, 0);
      }
      /* Execute user subroutine: 'LOADPRINTERFROMSERVER' */
      S122 ();
      if (returnInSub) return;
      AV62ListPrinter_Data.sort("Title");
      Combo_listprinter_Selectedvalue_set = AV61ListPrinter ;
      ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
   }

   public void e152A32( )
   {
      /* Barcod_Isvalid Routine */
      returnInSub = false ;
      if ( (0==AV14BarCodto) )
      {
         AV14BarCodto = AV9BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14BarCodto), 8, 0));
      }
      /*  Sending Event outputs  */
   }

   public void e162A32( )
   {
      /* Barcodreo_Isvalid Routine */
      returnInSub = false ;
      if ( (0==AV13BarCodReoto) )
      {
         AV13BarCodReoto = AV12BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarCodReoto", GXutil.str( AV13BarCodReoto, 1, 0));
      }
      /*  Sending Event outputs  */
   }

   public void e172A32( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV11BarCodParto)==0) )
      {
         AV11BarCodParto = AV10BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11BarCodParto", AV11BarCodParto);
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'DO ACTION RESULTADOS' Routine */
      returnInSub = false ;
      AV15Barlis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Barlis", GXutil.str( AV15Barlis, 1, 0));
      AV16Barlisto = (byte)(((AV7Automatico==1) ? 0 : 1)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Barlisto", GXutil.str( AV16Barlisto, 1, 0));
      AV46x = (short)(1) ;
      AV40Sdt_MergePDF.clear();
      AV48registrosleidos = (short)(0) ;
      AV49strDate = localUtil.format( DecimalUtil.doubleToDec(AV50Year), "9999") + localUtil.format( DecimalUtil.doubleToDec(AV52Mounth), "99") + localUtil.format( DecimalUtil.doubleToDec(AV51Day), "99") ;
      AV54StrNmrHDR = GXutil.format( "%1_%2", GXutil.trim( GXutil.str( AV9BarCod, 8, 0)), GXutil.trim( GXutil.str( AV12BarCodReo, 1, 0)), "", "", "", "", "", "", "") ;
      AV39ReportOutPut = GXutil.format( "%1/OS_%2.pdf", AV34PATHPDF, GXutil.trim( AV54StrNmrHDR), GXutil.trim( AV49strDate), "", "", "", "", "", "") ;
      AV38ReportInPut = GXutil.trim( AV34PATHPDF) ;
      AV79GXLvl378 = (byte)(0) ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9BarCod) ,
                                           Integer.valueOf(AV14BarCodto) ,
                                           Byte.valueOf(AV12BarCodReo) ,
                                           AV10BarCodPar ,
                                           Byte.valueOf(AV13BarCodReoto) ,
                                           AV11BarCodParto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV20EmprCod ,
                                           Byte.valueOf(AV15Barlis) ,
                                           A396EmprCod ,
                                           Byte.valueOf(A178BarLis) ,
                                           Byte.valueOf(AV16Barlisto) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE
                                           }
      });
      /* Using cursor H02A35 */
      pr_default.execute(3, new Object[] {AV20EmprCod, Byte.valueOf(AV15Barlis), Byte.valueOf(AV16Barlisto), Integer.valueOf(AV9BarCod), Integer.valueOf(AV14BarCodto), Byte.valueOf(AV12BarCodReo), AV10BarCodPar, Byte.valueOf(AV13BarCodReoto), AV11BarCodParto});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H02A35_A396EmprCod[0] ;
         A130BarCodPar = H02A35_A130BarCodPar[0] ;
         A132BarCodReo = H02A35_A132BarCodReo[0] ;
         A129BarCod = H02A35_A129BarCod[0] ;
         A178BarLis = H02A35_A178BarLis[0] ;
         A252CliCod = H02A35_A252CliCod[0] ;
         n252CliCod = H02A35_n252CliCod[0] ;
         A120BarAgrEst = H02A35_A120BarAgrEst[0] ;
         AV79GXLvl378 = (byte)(1) ;
         AV54StrNmrHDR = "" ;
         AV56Rel_EmprCod = "" ;
         AV57Rel_BarCod = 0 ;
         AV58Rel_BarCodReo = (byte)(0) ;
         AV59Rel_BarCodPar = "" ;
         AV53CliCod = A252CliCod ;
         AV8BarAgrEst = A120BarAgrEst ;
         AV56Rel_EmprCod = A396EmprCod ;
         AV57Rel_BarCod = A129BarCod ;
         AV58Rel_BarCodReo = A132BarCodReo ;
         AV59Rel_BarCodPar = A130BarCodPar ;
         AV30Ok_f = httpContext.getMessage( "N", "") ;
         /* Using cursor H02A36 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A457FasCod = H02A36_A457FasCod[0] ;
            A7057FasOpeIns = H02A36_A7057FasOpeIns[0] ;
            n7057FasOpeIns = H02A36_n7057FasOpeIns[0] ;
            A194BarOrdLin = H02A36_A194BarOrdLin[0] ;
            A758ProCod = H02A36_A758ProCod[0] ;
            A7057FasOpeIns = H02A36_A7057FasOpeIns[0] ;
            n7057FasOpeIns = H02A36_n7057FasOpeIns[0] ;
            AV30Ok_f = "S" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV29Ok_cl = "N" ;
         /* Using cursor H02A37 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A457FasCod = H02A37_A457FasCod[0] ;
            A13809FasCarda = H02A37_A13809FasCarda[0] ;
            A194BarOrdLin = H02A37_A194BarOrdLin[0] ;
            A758ProCod = H02A37_A758ProCod[0] ;
            A13809FasCarda = H02A37_A13809FasCarda[0] ;
            AV29Ok_cl = "S" ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(5);
         }
         pr_default.close(5);
         if ( ( AV17Cli350 == 1 ) && ( AV5ContVal == 1 ) && ( A252CliCod == 350 ) )
         {
         }
         else
         {
            AV18Copias = AV19Copias2 ;
            if ( GXutil.strcmp(AV26No_hdr, "N") == 0 )
            {
               AV18Copias = AV19Copias2 ;
               while ( AV18Copias > 0 )
               {
                  AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                  new app.rhdrmod_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, httpContext.getMessage( "SCR", "")) ;
                  AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                  AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                  AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                  AV18Copias = (short)(AV18Copias-1) ;
                  AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                  AV46x = (short)(AV46x+1) ;
               }
               new app.pbaredi(remoteHandle, context).execute( AV56Rel_EmprCod, AV57Rel_BarCod, AV59Rel_BarCodPar, AV58Rel_BarCodReo) ;
            }
            if ( GXutil.strcmp(AV22imp_bol, httpContext.getMessage( "S", "")) == 0 )
            {
               AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
               new app.rhdrbnc_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
               AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
               AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
               AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
               AV48registrosleidos = (short)(AV48registrosleidos+1) ;
               AV46x = (short)(AV46x+1) ;
            }
            AV36Princp = "S" ;
            if ( GXutil.strcmp(A120BarAgrEst, "S") == 0 )
            {
               new app.pminagr(remoteHandle, context).execute( AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar) ;
               AV36Princp = httpContext.getMessage( "N", "") ;
               if ( ( A129BarCod == AV9BarCod ) && ( AV58Rel_BarCodReo == AV12BarCodReo ) && ( GXutil.strcmp(AV59Rel_BarCodPar, AV10BarCodPar) == 0 ) )
               {
                  AV36Princp = httpContext.getMessage( "S", "") ;
               }
            }
            if ( GXutil.strcmp(AV28No_RegQua, "N") == 0 )
            {
               if ( GXutil.strcmp(AV36Princp, "S") == 0 )
               {
                  AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                  new app.rregqua_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                  AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                  AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                  AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                  AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                  AV46x = (short)(AV46x+1) ;
               }
               else
               {
                  if ( ( GXutil.strcmp(AV8BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV30Ok_f, "S") == 0 ) )
                  {
                     AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                     new app.rregqua_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                     AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                     AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                     AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                     AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                     AV46x = (short)(AV46x+1) ;
                  }
               }
            }
            if ( GXutil.strcmp(AV27No_regcarlam, "N") == 0 )
            {
               if ( GXutil.strcmp(AV29Ok_cl, "S") == 0 )
               {
                  if ( GXutil.strcmp(AV36Princp, "S") == 0 )
                  {
                     AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                     new app.prgcarla_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                     AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                     AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                     AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                     AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                     AV46x = (short)(AV46x+1) ;
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV8BarAgrEst, "S") == 0 ) && ( GXutil.strcmp(AV29Ok_cl, "S") == 0 ) )
                     {
                        AV33PathFile = GXutil.format( httpContext.getMessage( "%1Report_%3%2.pdf", ""), AV38ReportInPut, GXutil.trim( GXutil.str( AV46x, 4, 0)), AV60WWPContext.getgxTv_SdtWWPContext_Userguid().toString(), "", "", "", "", "", "") ;
                        new app.prgcarla_2(remoteHandle, context).execute( AV33PathFile, AV56Rel_EmprCod, AV57Rel_BarCod, AV58Rel_BarCodReo, AV59Rel_BarCodPar, AV23ImpCod, AV32Outputi) ;
                        AV41Sdt_MergePDF_Item = (app.SdtSdt_MergePDF_PDF)new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
                        AV41Sdt_MergePDF_Item.setgxTv_SdtSdt_MergePDF_PDF_Realpath( AV33PathFile );
                        AV40Sdt_MergePDF.add(AV41Sdt_MergePDF_Item, 0);
                        AV48registrosleidos = (short)(AV48registrosleidos+1) ;
                        AV46x = (short)(AV46x+1) ;
                     }
                  }
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV79GXLvl378 == 0 )
      {
         AV46x = (short)(AV46x+1) ;
      }
      AV25ListPdfJson = AV40Sdt_MergePDF.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ListPdfJson", AV25ListPdfJson);
      if ( (0==AV48registrosleidos) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se proceso ningun registro", ""));
      }
      else
      {
         AV39ReportOutPut = GXutil.strReplace( AV39ReportOutPut, httpContext.getMessage( "##CLIENTE##", ""), localUtil.format( DecimalUtil.doubleToDec(AV53CliCod), "999999")) ;
         AV35PathPDFFull = AV47AppTool.merge(AV25ListPdfJson, AV39ReportOutPut, true) ;
         if ( ( GXutil.strcmp(AV31Opi, "0") == 0 ) && ! (GXutil.strcmp("", AV61ListPrinter)==0) )
         {
            AV71Aviso = AV47AppTool.printto(AV35PathPDFFull, AV61ListPrinter, (byte)(AV19Copias2), false, false) ;
            httpContext.GX_msglist.addItem(AV71Aviso);
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Selecione una impressora , por favor !", ""));
         }
         if ( GXutil.strcmp(AV31Opi, "1") == 0 )
         {
            GXt_char1 = AV24Link ;
            GXv_char4[0] = GXt_char1 ;
            new app.viewfile(remoteHandle, context).execute( AV35PathPDFFull, "", GXv_char4) ;
            impresionhojaderuta_moda21_2_impl.this.GXt_char1 = GXv_char4[0] ;
            AV24Link = GXt_char1 ;
            this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV24Link,httpContext.getMessage( "_blank", "")});
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
            AV39ReportOutPut = "" ;
         }
      }
   }

   public void S122( )
   {
      /* 'LOADPRINTERFROMSERVER' Routine */
      returnInSub = false ;
      AV66STR_SDTListPrinter = AV47AppTool.listprinter() ;
      if ( AV68SDTListPrinter.fromJSonString(AV66STR_SDTListPrinter, AV67Messages) )
      {
         AV82GXV1 = 1 ;
         while ( AV82GXV1 <= AV68SDTListPrinter.size() )
         {
            AV70SDTListPrinter_item = (app.SdtSDTListPrinter_SDTListPrinterItem)((app.SdtSDTListPrinter_SDTListPrinterItem)AV68SDTListPrinter.elementAt(-1+AV82GXV1));
            if ( GXutil.strcmp(AV60WWPContext.getgxTv_SdtWWPContext_Usurprint(), AV70SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name()) != 0 )
            {
               AV65ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV65ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV70SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV65ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV70SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV62ListPrinter_Data.add(AV65ListPrinter_Data_Item, 0);
            }
            AV82GXV1 = (int)(AV82GXV1+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ninguna impressora localizada", ""));
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e142A32( )
   {
      /* Load Routine */
      returnInSub = false ;
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
      pa2A32( ) ;
      ws2A32( ) ;
      we2A32( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152368", true, true);
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
      httpContext.AddJavascriptSource("impresionhojaderuta_moda21_2.js", "?202682116152369", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      edtavBarcodto_Internalname = "vBARCODTO" ;
      edtavBarcodreoto_Internalname = "vBARCODREOTO" ;
      edtavBarcodparto_Internalname = "vBARCODPARTO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      grpUnnamedgroup5_Internalname = "UNNAMEDGROUP5" ;
      chkavAutomatico.setInternalname( "vAUTOMATICO" );
      chkavOpi.setInternalname( "vOPI" );
      edtavCopias2_Internalname = "vCOPIAS2" ;
      lblTextblockcombo_listprinter_Internalname = "TEXTBLOCKCOMBO_LISTPRINTER" ;
      Combo_listprinter_Internalname = "COMBO_LISTPRINTER" ;
      divTablesplittedlistprinter_Internalname = "TABLESPLITTEDLISTPRINTER" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      Dvpanel_unnamedtable6_Internalname = "DVPANEL_UNNAMEDTABLE6" ;
      chkavImp_bol.setInternalname( "vIMP_BOL" );
      chkavNo_hdr.setInternalname( "vNO_HDR" );
      chkavNo_regqua.setInternalname( "vNO_REGQUA" );
      chkavNo_regcarlam.setInternalname( "vNO_REGCARLAM" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavListprinter_Internalname = "vLISTPRINTER" ;
      edtavListpdfjson_Internalname = "vLISTPDFJSON" ;
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
      edtavListpdfjson_Visible = 1 ;
      edtavListprinter_Jsonclick = "" ;
      edtavListprinter_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavNo_regcarlam.setEnabled( 1 );
      chkavNo_regqua.setEnabled( 1 );
      chkavNo_hdr.setEnabled( 1 );
      chkavImp_bol.setEnabled( 1 );
      Combo_listprinter_Caption = "" ;
      divTablesplittedlistprinter_Visible = 1 ;
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      chkavOpi.setEnabled( 1 );
      chkavAutomatico.setEnabled( 1 );
      edtavBarcodparto_Jsonclick = "" ;
      edtavBarcodparto_Enabled = 1 ;
      edtavBarcodreoto_Jsonclick = "" ;
      edtavBarcodreoto_Enabled = 1 ;
      edtavBarcodto_Jsonclick = "" ;
      edtavBarcodto_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
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
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Formatos", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable6_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Iconposition = "Right" ;
      Dvpanel_unnamedtable6_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Title = httpContext.getMessage( "Tipo de impressão", "") ;
      Dvpanel_unnamedtable6_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable6_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable6_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable6_Width = "100%" ;
      Combo_listprinter_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_listprinter_Visible = GXutil.toBoolean( -1) ;
      Combo_listprinter_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impressão da Ordem de Serviço", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavAutomatico.setName( "vAUTOMATICO" );
      chkavAutomatico.setWebtags( "" );
      chkavAutomatico.setCaption( httpContext.getMessage( "Automatico?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavAutomatico.getInternalname(), "TitleCaption", chkavAutomatico.getCaption(), true);
      chkavAutomatico.setCheckedValue( "0" );
      AV7Automatico = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV7Automatico, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Automatico", GXutil.str( AV7Automatico, 1, 0));
      chkavOpi.setName( "vOPI" );
      chkavOpi.setWebtags( "" );
      chkavOpi.setCaption( httpContext.getMessage( "Ecrã", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpi.getInternalname(), "TitleCaption", chkavOpi.getCaption(), true);
      chkavOpi.setCheckedValue( "0" );
      AV31Opi = ((GXutil.strcmp(GXutil.rtrim( AV31Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Opi", AV31Opi);
      chkavImp_bol.setName( "vIMP_BOL" );
      chkavImp_bol.setWebtags( "" );
      chkavImp_bol.setCaption( httpContext.getMessage( "Imprimir Boletim de nao Conformidade?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavImp_bol.getInternalname(), "TitleCaption", chkavImp_bol.getCaption(), true);
      chkavImp_bol.setCheckedValue( "N" );
      AV22imp_bol = ((GXutil.strcmp(GXutil.rtrim( AV22imp_bol), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22imp_bol", AV22imp_bol);
      chkavNo_hdr.setName( "vNO_HDR" );
      chkavNo_hdr.setWebtags( "" );
      chkavNo_hdr.setCaption( httpContext.getMessage( "Nao Imprimir Ordem Serviço", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavNo_hdr.getInternalname(), "TitleCaption", chkavNo_hdr.getCaption(), true);
      chkavNo_hdr.setCheckedValue( "N" );
      AV26No_hdr = ((GXutil.strcmp(GXutil.rtrim( AV26No_hdr), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26No_hdr", AV26No_hdr);
      chkavNo_regqua.setName( "vNO_REGQUA" );
      chkavNo_regqua.setWebtags( "" );
      chkavNo_regqua.setCaption( httpContext.getMessage( "Nao Imprimir registo de qualidade", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavNo_regqua.getInternalname(), "TitleCaption", chkavNo_regqua.getCaption(), true);
      chkavNo_regqua.setCheckedValue( "N" );
      AV28No_RegQua = ((GXutil.strcmp(GXutil.rtrim( AV28No_RegQua), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28No_RegQua", AV28No_RegQua);
      chkavNo_regcarlam.setName( "vNO_REGCARLAM" );
      chkavNo_regcarlam.setWebtags( "" );
      chkavNo_regcarlam.setCaption( httpContext.getMessage( "Nao Imprimir resgisto Cada/E/L", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavNo_regcarlam.getInternalname(), "TitleCaption", chkavNo_regcarlam.getCaption(), true);
      chkavNo_regcarlam.setCheckedValue( "N" );
      AV27No_regcarlam = ((GXutil.strcmp(GXutil.rtrim( AV27No_regcarlam), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27No_regcarlam", AV27No_regcarlam);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV7Automatico',fld:'vAUTOMATICO',pic:'9'},{av:'AV31Opi',fld:'vOPI',pic:''},{av:'AV22imp_bol',fld:'vIMP_BOL',pic:''},{av:'AV26No_hdr',fld:'vNO_HDR',pic:''},{av:'AV28No_RegQua',fld:'vNO_REGQUA',pic:''},{av:'AV27No_regcarlam',fld:'vNO_REGCARLAM',pic:''},{av:'AV50Year',fld:'vYEAR',pic:'9999',hsh:true},{av:'AV52Mounth',fld:'vMOUNTH',pic:'99',hsh:true},{av:'AV51Day',fld:'vDAY',pic:'99',hsh:true},{av:'AV34PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17Cli350',fld:'vCLI350',pic:'ZZZ9',hsh:true},{av:'AV5ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV60WWPContext',fld:'vWWPCONTEXT',pic:'',hsh:true},{av:'AV23ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV32Outputi',fld:'vOUTPUTI',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e122A32',iparms:[{av:'AV7Automatico',fld:'vAUTOMATICO',pic:'9'},{av:'AV50Year',fld:'vYEAR',pic:'9999',hsh:true},{av:'AV52Mounth',fld:'vMOUNTH',pic:'99',hsh:true},{av:'AV51Day',fld:'vDAY',pic:'99',hsh:true},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV34PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A178BarLis',fld:'BARLIS',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV20EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV13BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV11BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A7057FasOpeIns',fld:'FASOPEINS',pic:''},{av:'A13809FasCarda',fld:'FASCARDA',pic:''},{av:'AV17Cli350',fld:'vCLI350',pic:'ZZZ9',hsh:true},{av:'AV5ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV19Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV26No_hdr',fld:'vNO_HDR',pic:''},{av:'AV60WWPContext',fld:'vWWPCONTEXT',pic:'',hsh:true},{av:'AV23ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'AV22imp_bol',fld:'vIMP_BOL',pic:''},{av:'AV32Outputi',fld:'vOUTPUTI',pic:'',hsh:true},{av:'AV28No_RegQua',fld:'vNO_REGQUA',pic:''},{av:'AV27No_regcarlam',fld:'vNO_REGCARLAM',pic:''},{av:'AV31Opi',fld:'vOPI',pic:''},{av:'AV61ListPrinter',fld:'vLISTPRINTER',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV15Barlis',fld:'vBARLIS',pic:'9'},{av:'AV16Barlisto',fld:'vBARLISTO',pic:'9'},{av:'AV25ListPdfJson',fld:'vLISTPDFJSON',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e132A32',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VBARCOD.ISVALID","{handler:'e152A32',iparms:[{av:'AV14BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCOD.ISVALID",",oparms:[{av:'AV14BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VBARCODREO.ISVALID","{handler:'e162A32',iparms:[{av:'AV13BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV12BarCodReo',fld:'vBARCODREO',pic:'9'}]");
      setEventMetadata("VBARCODREO.ISVALID",",oparms:[{av:'AV13BarCodReoto',fld:'vBARCODREOTO',pic:'9'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e172A32',iparms:[{av:'AV11BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'AV11BarCodParto',fld:'vBARCODPARTO',pic:''}]}");
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
      Combo_listprinter_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV34PATHPDF = "" ;
      AV20EmprCod = "" ;
      AV60WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      AV23ImpCod = "" ;
      AV32Outputi = "" ;
      GXKey = "" ;
      AV63DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV62ListPrinter_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A758ProCod = "" ;
      A7057FasOpeIns = "" ;
      A13809FasCarda = "" ;
      Combo_listprinter_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedtext_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV10BarCodPar = "" ;
      AV11BarCodParto = "" ;
      ucDvpanel_unnamedtable6 = new com.genexus.webpanels.GXUserControl();
      AV31Opi = "" ;
      lblTextblockcombo_listprinter_Jsonclick = "" ;
      ucCombo_listprinter = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      AV22imp_bol = "" ;
      AV26No_hdr = "" ;
      AV28No_RegQua = "" ;
      AV27No_regcarlam = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      AV74Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV61ListPrinter = "" ;
      AV25ListPdfJson = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      AV42Station = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV43UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int11 = new int[1] ;
      AV40Sdt_MergePDF = new GXBaseCollection<app.SdtSdt_MergePDF_PDF>(app.SdtSdt_MergePDF_PDF.class, "PDF", "TexplusNET", remoteHandle);
      AV49strDate = "" ;
      AV54StrNmrHDR = "" ;
      AV39ReportOutPut = "" ;
      AV38ReportInPut = "" ;
      scmdbuf = "" ;
      H02A32_A396EmprCod = new String[] {""} ;
      H02A32_A130BarCodPar = new String[] {""} ;
      H02A32_A132BarCodReo = new byte[1] ;
      H02A32_A129BarCod = new int[1] ;
      H02A32_A178BarLis = new byte[1] ;
      H02A32_A252CliCod = new int[1] ;
      H02A32_n252CliCod = new boolean[] {false} ;
      H02A32_A120BarAgrEst = new String[] {""} ;
      AV56Rel_EmprCod = "" ;
      AV59Rel_BarCodPar = "" ;
      AV8BarAgrEst = "" ;
      AV30Ok_f = "" ;
      H02A33_A457FasCod = new String[] {""} ;
      H02A33_A396EmprCod = new String[] {""} ;
      H02A33_A129BarCod = new int[1] ;
      H02A33_A132BarCodReo = new byte[1] ;
      H02A33_A130BarCodPar = new String[] {""} ;
      H02A33_A7057FasOpeIns = new String[] {""} ;
      H02A33_n7057FasOpeIns = new boolean[] {false} ;
      H02A33_A194BarOrdLin = new short[1] ;
      H02A33_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      AV29Ok_cl = "" ;
      H02A34_A457FasCod = new String[] {""} ;
      H02A34_A396EmprCod = new String[] {""} ;
      H02A34_A129BarCod = new int[1] ;
      H02A34_A132BarCodReo = new byte[1] ;
      H02A34_A130BarCodPar = new String[] {""} ;
      H02A34_A13809FasCarda = new String[] {""} ;
      H02A34_A194BarOrdLin = new short[1] ;
      H02A34_A758ProCod = new String[] {""} ;
      AV33PathFile = "" ;
      AV41Sdt_MergePDF_Item = new app.SdtSdt_MergePDF_PDF(remoteHandle, context);
      AV36Princp = "" ;
      AV35PathPDFFull = "" ;
      AV47AppTool = new app.SdtAppTool(remoteHandle, context);
      AV71Aviso = "" ;
      AV24Link = "" ;
      AV65ListPrinter_Data_Item = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02A35_A396EmprCod = new String[] {""} ;
      H02A35_A130BarCodPar = new String[] {""} ;
      H02A35_A132BarCodReo = new byte[1] ;
      H02A35_A129BarCod = new int[1] ;
      H02A35_A178BarLis = new byte[1] ;
      H02A35_A252CliCod = new int[1] ;
      H02A35_n252CliCod = new boolean[] {false} ;
      H02A35_A120BarAgrEst = new String[] {""} ;
      H02A36_A457FasCod = new String[] {""} ;
      H02A36_A396EmprCod = new String[] {""} ;
      H02A36_A129BarCod = new int[1] ;
      H02A36_A132BarCodReo = new byte[1] ;
      H02A36_A130BarCodPar = new String[] {""} ;
      H02A36_A7057FasOpeIns = new String[] {""} ;
      H02A36_n7057FasOpeIns = new boolean[] {false} ;
      H02A36_A194BarOrdLin = new short[1] ;
      H02A36_A758ProCod = new String[] {""} ;
      H02A37_A457FasCod = new String[] {""} ;
      H02A37_A396EmprCod = new String[] {""} ;
      H02A37_A129BarCod = new int[1] ;
      H02A37_A132BarCodReo = new byte[1] ;
      H02A37_A130BarCodPar = new String[] {""} ;
      H02A37_A13809FasCarda = new String[] {""} ;
      H02A37_A194BarOrdLin = new short[1] ;
      H02A37_A758ProCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV66STR_SDTListPrinter = "" ;
      AV67Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV68SDTListPrinter = new GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem>(app.SdtSDTListPrinter_SDTListPrinterItem.class, "SDTListPrinterItem", "TexplusNET", remoteHandle);
      AV70SDTListPrinter_item = new app.SdtSDTListPrinter_SDTListPrinterItem(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresionhojaderuta_moda21_2__default(),
         new Object[] {
             new Object[] {
            H02A32_A396EmprCod, H02A32_A130BarCodPar, H02A32_A132BarCodReo, H02A32_A129BarCod, H02A32_A178BarLis, H02A32_A252CliCod, H02A32_n252CliCod, H02A32_A120BarAgrEst
            }
            , new Object[] {
            H02A33_A457FasCod, H02A33_A396EmprCod, H02A33_A129BarCod, H02A33_A132BarCodReo, H02A33_A130BarCodPar, H02A33_A7057FasOpeIns, H02A33_n7057FasOpeIns, H02A33_A194BarOrdLin, H02A33_A758ProCod
            }
            , new Object[] {
            H02A34_A457FasCod, H02A34_A396EmprCod, H02A34_A129BarCod, H02A34_A132BarCodReo, H02A34_A130BarCodPar, H02A34_A13809FasCarda, H02A34_A194BarOrdLin, H02A34_A758ProCod
            }
            , new Object[] {
            H02A35_A396EmprCod, H02A35_A130BarCodPar, H02A35_A132BarCodReo, H02A35_A129BarCod, H02A35_A178BarLis, H02A35_A252CliCod, H02A35_n252CliCod, H02A35_A120BarAgrEst
            }
            , new Object[] {
            H02A36_A457FasCod, H02A36_A396EmprCod, H02A36_A129BarCod, H02A36_A132BarCodReo, H02A36_A130BarCodPar, H02A36_A7057FasOpeIns, H02A36_n7057FasOpeIns, H02A36_A194BarOrdLin, H02A36_A758ProCod
            }
            , new Object[] {
            H02A37_A457FasCod, H02A37_A396EmprCod, H02A37_A129BarCod, H02A37_A132BarCodReo, H02A37_A130BarCodPar, H02A37_A13809FasCarda, H02A37_A194BarOrdLin, H02A37_A758ProCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "ImpresionHojadeRuta_Moda21_2" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV74Pgmname = "ImpresionHojadeRuta_Moda21_2" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV52Mounth ;
   private byte AV51Day ;
   private byte A178BarLis ;
   private byte A132BarCodReo ;
   private byte AV12BarCodReo ;
   private byte AV13BarCodReoto ;
   private byte AV7Automatico ;
   private byte nDonePA ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte AV15Barlis ;
   private byte AV16Barlisto ;
   private byte AV76GXLvl58 ;
   private byte AV58Rel_BarCodReo ;
   private byte AV79GXLvl378 ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV50Year ;
   private short AV17Cli350 ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV19Copias2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV18Copias ;
   private short AV46x ;
   private short AV48registrosleidos ;
   private int AV5ContVal ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int AV9BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int AV14BarCodto ;
   private int edtavBarcodto_Enabled ;
   private int edtavBarcodreoto_Enabled ;
   private int edtavBarcodparto_Enabled ;
   private int edtavCopias2_Enabled ;
   private int divTablesplittedlistprinter_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavListprinter_Visible ;
   private int edtavListpdfjson_Visible ;
   private int GXt_int10 ;
   private int GXv_int11[] ;
   private int AV57Rel_BarCod ;
   private int AV53CliCod ;
   private int AV82GXV1 ;
   private int idxLst ;
   private String Combo_listprinter_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV34PATHPDF ;
   private String AV20EmprCod ;
   private String AV23ImpCod ;
   private String AV32Outputi ;
   private String GXKey ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A120BarAgrEst ;
   private String A758ProCod ;
   private String A7057FasOpeIns ;
   private String A13809FasCarda ;
   private String Combo_listprinter_Cls ;
   private String Combo_listprinter_Selectedvalue_set ;
   private String Combo_listprinter_Selectedtext_set ;
   private String Dvpanel_unnamedtable6_Width ;
   private String Dvpanel_unnamedtable6_Cls ;
   private String Dvpanel_unnamedtable6_Title ;
   private String Dvpanel_unnamedtable6_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String grpUnnamedgroup3_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarcod_Internalname ;
   private String TempTags ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV10BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String grpUnnamedgroup5_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcodto_Internalname ;
   private String edtavBarcodto_Jsonclick ;
   private String edtavBarcodreoto_Internalname ;
   private String edtavBarcodreoto_Jsonclick ;
   private String edtavBarcodparto_Internalname ;
   private String AV11BarCodParto ;
   private String edtavBarcodparto_Jsonclick ;
   private String Dvpanel_unnamedtable6_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String AV31Opi ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String divTablesplittedlistprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Jsonclick ;
   private String Combo_listprinter_Caption ;
   private String Combo_listprinter_Internalname ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String AV22imp_bol ;
   private String AV26No_hdr ;
   private String AV28No_RegQua ;
   private String AV27No_regcarlam ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV74Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavListprinter_Internalname ;
   private String edtavListprinter_Jsonclick ;
   private String edtavListpdfjson_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV42Station ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String GXv_char3[] ;
   private String AV43UsurCod ;
   private String scmdbuf ;
   private String AV56Rel_EmprCod ;
   private String AV59Rel_BarCodPar ;
   private String AV8BarAgrEst ;
   private String AV30Ok_f ;
   private String A457FasCod ;
   private String AV29Ok_cl ;
   private String AV36Princp ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_listprinter_Visible ;
   private boolean Combo_listprinter_Emptyitem ;
   private boolean Dvpanel_unnamedtable6_Autowidth ;
   private boolean Dvpanel_unnamedtable6_Autoheight ;
   private boolean Dvpanel_unnamedtable6_Collapsible ;
   private boolean Dvpanel_unnamedtable6_Collapsed ;
   private boolean Dvpanel_unnamedtable6_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable6_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
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
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n7057FasOpeIns ;
   private String AV25ListPdfJson ;
   private String AV66STR_SDTListPrinter ;
   private String AV61ListPrinter ;
   private String AV49strDate ;
   private String AV54StrNmrHDR ;
   private String AV39ReportOutPut ;
   private String AV38ReportInPut ;
   private String AV33PathFile ;
   private String AV35PathPDFFull ;
   private String AV71Aviso ;
   private String AV24Link ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable6 ;
   private com.genexus.webpanels.GXUserControl ucCombo_listprinter ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem> AV68SDTListPrinter ;
   private app.SdtAppTool AV47AppTool ;
   private ICheckbox chkavAutomatico ;
   private ICheckbox chkavOpi ;
   private ICheckbox chkavImp_bol ;
   private ICheckbox chkavNo_hdr ;
   private ICheckbox chkavNo_regqua ;
   private ICheckbox chkavNo_regcarlam ;
   private IDataStoreProvider pr_default ;
   private String[] H02A32_A396EmprCod ;
   private String[] H02A32_A130BarCodPar ;
   private byte[] H02A32_A132BarCodReo ;
   private int[] H02A32_A129BarCod ;
   private byte[] H02A32_A178BarLis ;
   private int[] H02A32_A252CliCod ;
   private boolean[] H02A32_n252CliCod ;
   private String[] H02A32_A120BarAgrEst ;
   private String[] H02A33_A457FasCod ;
   private String[] H02A33_A396EmprCod ;
   private int[] H02A33_A129BarCod ;
   private byte[] H02A33_A132BarCodReo ;
   private String[] H02A33_A130BarCodPar ;
   private String[] H02A33_A7057FasOpeIns ;
   private boolean[] H02A33_n7057FasOpeIns ;
   private short[] H02A33_A194BarOrdLin ;
   private String[] H02A33_A758ProCod ;
   private String[] H02A34_A457FasCod ;
   private String[] H02A34_A396EmprCod ;
   private int[] H02A34_A129BarCod ;
   private byte[] H02A34_A132BarCodReo ;
   private String[] H02A34_A130BarCodPar ;
   private String[] H02A34_A13809FasCarda ;
   private short[] H02A34_A194BarOrdLin ;
   private String[] H02A34_A758ProCod ;
   private String[] H02A35_A396EmprCod ;
   private String[] H02A35_A130BarCodPar ;
   private byte[] H02A35_A132BarCodReo ;
   private int[] H02A35_A129BarCod ;
   private byte[] H02A35_A178BarLis ;
   private int[] H02A35_A252CliCod ;
   private boolean[] H02A35_n252CliCod ;
   private String[] H02A35_A120BarAgrEst ;
   private String[] H02A36_A457FasCod ;
   private String[] H02A36_A396EmprCod ;
   private int[] H02A36_A129BarCod ;
   private byte[] H02A36_A132BarCodReo ;
   private String[] H02A36_A130BarCodPar ;
   private String[] H02A36_A7057FasOpeIns ;
   private boolean[] H02A36_n7057FasOpeIns ;
   private short[] H02A36_A194BarOrdLin ;
   private String[] H02A36_A758ProCod ;
   private String[] H02A37_A457FasCod ;
   private String[] H02A37_A396EmprCod ;
   private int[] H02A37_A129BarCod ;
   private byte[] H02A37_A132BarCodReo ;
   private String[] H02A37_A130BarCodPar ;
   private String[] H02A37_A13809FasCarda ;
   private short[] H02A37_A194BarOrdLin ;
   private String[] H02A37_A758ProCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdt_MergePDF_PDF> AV40Sdt_MergePDF ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV62ListPrinter_Data ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV67Messages ;
   private app.SdtSdt_MergePDF_PDF AV41Sdt_MergePDF_Item ;
   private app.wwpbaseobjects.SdtWWPContext AV60WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV65ListPrinter_Data_Item ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV63DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.SdtSDTListPrinter_SDTListPrinterItem AV70SDTListPrinter_item ;
}

final  class impresionhojaderuta_moda21_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02A32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9BarCod ,
                                          int AV14BarCodto ,
                                          byte AV12BarCodReo ,
                                          String AV10BarCodPar ,
                                          byte AV13BarCodReoto ,
                                          String AV11BarCodParto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV20EmprCod ,
                                          byte AV15Barlis ,
                                          String A396EmprCod ,
                                          byte A178BarLis ,
                                          byte AV16Barlisto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[9];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarLis, CliCod, BarAgrEst FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarLis >= ?)");
      addWhere(sWhereString, "(BarLis <= ?)");
      if ( ! (0==AV9BarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodto) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV12BarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         addWhere(sWhereString, "(BarCodPar >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV13BarCodReoto) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11BarCodParto)==0) )
      {
         addWhere(sWhereString, "(BarCodPar <= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarLis, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H02A35( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9BarCod ,
                                          int AV14BarCodto ,
                                          byte AV12BarCodReo ,
                                          String AV10BarCodPar ,
                                          byte AV13BarCodReoto ,
                                          String AV11BarCodParto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV20EmprCod ,
                                          byte AV15Barlis ,
                                          String A396EmprCod ,
                                          byte A178BarLis ,
                                          byte AV16Barlisto )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[9];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarLis, CliCod, BarAgrEst FROM TXPBARCAD" ;
      addWhere(sWhereString, "(EmprCod = ? and BarLis >= ?)");
      addWhere(sWhereString, "(BarLis <= ?)");
      if ( ! (0==AV9BarCod) )
      {
         addWhere(sWhereString, "(BarCod >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! (0==AV14BarCodto) )
      {
         addWhere(sWhereString, "(BarCod <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV12BarCodReo) )
      {
         addWhere(sWhereString, "(BarCodReo >= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10BarCodPar)==0) )
      {
         addWhere(sWhereString, "(BarCodPar >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV13BarCodReoto) )
      {
         addWhere(sWhereString, "(BarCodReo <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV11BarCodParto)==0) )
      {
         addWhere(sWhereString, "(BarCodPar <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, BarLis, BarCod, BarCodReo, BarCodPar" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
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
                  return conditional_H02A32(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() );
            case 3 :
                  return conditional_H02A35(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , (String)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02A32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02A33", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasOpeIns, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasOpeIns = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02A34", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasCarda, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasCarda = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02A35", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02A36", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasOpeIns, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasOpeIns = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02A37", "SELECT * FROM (SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasCarda, T1.BarOrdLin, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T2.FasCarda = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
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
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[11]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[14]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[16]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

