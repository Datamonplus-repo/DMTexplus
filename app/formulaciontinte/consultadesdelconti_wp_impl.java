package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultadesdelconti_wp_impl extends GXDataArea
{
   public consultadesdelconti_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultadesdelconti_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultadesdelconti_wp_impl.class ));
   }

   public consultadesdelconti_wp_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHreracab = new HTMLChoice();
      chkavSoload = UIFactory.getCheckbox(this);
      chkavCoradi = UIFactory.getCheckbox(this);
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
      pa1XF2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1XF2( ) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.consultadesdelconti_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNMESES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73nmeses), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPCLICOD_DATA", AV41PCliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPCLICOD_DATA", AV41PCliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUCLICOD_DATA", AV59UCliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUCLICOD_DATA", AV59UCliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODI_DATA", AV71MaqCodi_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODI_DATA", AV71MaqCodi_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODF_DATA", AV72MaqCodf_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODF_DATA", AV72MaqCodf_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCODFROM_DATA", AV68TipArtCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCODFROM_DATA", AV68TipArtCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCODTO_DATA", AV70TipArtCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCODTO_DATA", AV70TipArtCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV64EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNMESES", GXutil.ltrim( localUtil.ntoc( AV73nmeses, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNMESES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73nmeses), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Cls", GXutil.rtrim( Combo_pclicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Selectedvalue_set", GXutil.rtrim( Combo_pclicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Selectedtext_set", GXutil.rtrim( Combo_pclicod_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Emptyitemtext", GXutil.rtrim( Combo_pclicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UCLICOD_Cls", GXutil.rtrim( Combo_uclicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UCLICOD_Selectedvalue_set", GXutil.rtrim( Combo_uclicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UCLICOD_Selectedtext_set", GXutil.rtrim( Combo_uclicod_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UCLICOD_Emptyitemtext", GXutil.rtrim( Combo_uclicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Cls", GXutil.rtrim( Combo_maqcodi_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Selectedvalue_set", GXutil.rtrim( Combo_maqcodi_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Selectedtext_set", GXutil.rtrim( Combo_maqcodi_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Emptyitemtext", GXutil.rtrim( Combo_maqcodi_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODF_Cls", GXutil.rtrim( Combo_maqcodf_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODF_Selectedvalue_set", GXutil.rtrim( Combo_maqcodf_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODF_Selectedtext_set", GXutil.rtrim( Combo_maqcodf_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODF_Emptyitemtext", GXutil.rtrim( Combo_maqcodf_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Cls", GXutil.rtrim( Combo_tipartcodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_tipartcodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedtext_set", GXutil.rtrim( Combo_tipartcodfrom_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Emptyitemtext", GXutil.rtrim( Combo_tipartcodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Cls", GXutil.rtrim( Combo_tipartcodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Selectedvalue_set", GXutil.rtrim( Combo_tipartcodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Selectedtext_set", GXutil.rtrim( Combo_tipartcodto_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Emptyitemtext", GXutil.rtrim( Combo_tipartcodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Class", GXutil.rtrim( Gxuitabspanel_tabs_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODTO_Selectedvalue_get", GXutil.rtrim( Combo_tipartcodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_tipartcodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCODFROM_Selectedtext_get", GXutil.rtrim( Combo_tipartcodfrom_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODF_Selectedvalue_get", GXutil.rtrim( Combo_maqcodf_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Selectedvalue_get", GXutil.rtrim( Combo_maqcodi_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCODI_Selectedtext_get", GXutil.rtrim( Combo_maqcodi_Selectedtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UCLICOD_Selectedvalue_get", GXutil.rtrim( Combo_uclicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Selectedvalue_get", GXutil.rtrim( Combo_pclicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PCLICOD_Selectedtext_get", GXutil.rtrim( Combo_pclicod_Selectedtext_get));
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
      if ( ! ( WebComp_Wcconsultadesdelconti == null ) )
      {
         WebComp_Wcconsultadesdelconti.componentjscripts();
      }
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
         we1XF2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1XF2( ) ;
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
      return formatLink("app.formulaciontinte.consultadesdelconti_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ConsultadesdeLconti_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Historico Recetas (from Lconti)", "") ;
   }

   public void wb1XF0( )
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV30Fec1, "99/99/99"), localUtil.format( AV30Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec2_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV31Fec2, "99/99/99"), localUtil.format( AV31Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedpclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_pclicod_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_pclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_pclicod.setProperty("Caption", Combo_pclicod_Caption);
         ucCombo_pclicod.setProperty("Cls", Combo_pclicod_Cls);
         ucCombo_pclicod.setProperty("EmptyItemText", Combo_pclicod_Emptyitemtext);
         ucCombo_pclicod.setProperty("DropDownOptionsData", AV41PCliCod_Data);
         ucCombo_pclicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_pclicod_Internalname, "COMBO_PCLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteduclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_uclicod_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_uclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_uclicod.setProperty("Caption", Combo_uclicod_Caption);
         ucCombo_uclicod.setProperty("Cls", Combo_uclicod_Cls);
         ucCombo_uclicod.setProperty("EmptyItemText", Combo_uclicod_Emptyitemtext);
         ucCombo_uclicod.setProperty("DropDownOptionsData", AV59UCliCod_Data);
         ucCombo_uclicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_uclicod_Internalname, "COMBO_UCLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPserie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPserie_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPserie_Internalname, GXutil.rtrim( AV45PSerie), GXutil.rtrim( localUtil.format( AV45PSerie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPserie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPserie_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUserie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUserie_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUserie_Internalname, GXutil.rtrim( AV62USerie), GXutil.rtrim( localUtil.format( AV62USerie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUserie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUserie_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDispcli1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDispcli1_Internalname, httpContext.getMessage( "Pedido Cli Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDispcli1_Internalname, GXutil.rtrim( AV27DispCli1), GXutil.rtrim( localUtil.format( AV27DispCli1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDispcli1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDispcli1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDispcli2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDispcli2_Internalname, httpContext.getMessage( "Pedido Cli Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDispcli2_Internalname, GXutil.rtrim( AV28DispCli2), GXutil.rtrim( localUtil.format( AV28DispCli2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDispcli2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDispcli2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
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
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, "", 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPcolor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPcolor_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPcolor_Internalname, GXutil.rtrim( AV43PColor), GXutil.rtrim( localUtil.format( AV43PColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPcolor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPcolor_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV42PColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42PColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42PColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUcolor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUcolor_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUcolor_Internalname, GXutil.rtrim( AV61UColor), GXutil.rtrim( localUtil.format( AV61UColor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUcolor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUcolor_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV60UColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60UColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60UColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodi_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodi_Internalname, httpContext.getMessage( "Maquina Inicial", ""), "", "", lblTextblockcombo_maqcodi_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodi.setProperty("Caption", Combo_maqcodi_Caption);
         ucCombo_maqcodi.setProperty("Cls", Combo_maqcodi_Cls);
         ucCombo_maqcodi.setProperty("EmptyItemText", Combo_maqcodi_Emptyitemtext);
         ucCombo_maqcodi.setProperty("DropDownOptionsData", AV71MaqCodi_Data);
         ucCombo_maqcodi.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodi_Internalname, "COMBO_MAQCODIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcodf_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcodf_Internalname, httpContext.getMessage( "Maquina Final", ""), "", "", lblTextblockcombo_maqcodf_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcodf.setProperty("Caption", Combo_maqcodf_Caption);
         ucCombo_maqcodf.setProperty("Cls", Combo_maqcodf_Cls);
         ucCombo_maqcodf.setProperty("EmptyItemText", Combo_maqcodf_Emptyitemtext);
         ucCombo_maqcodf.setProperty("DropDownOptionsData", AV72MaqCodf_Data);
         ucCombo_maqcodf.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcodf_Internalname, "COMBO_MAQCODFContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaracs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaracs_Internalname, httpContext.getMessage( "Acs", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaracs_Internalname, GXutil.rtrim( AV19BarAcs), GXutil.rtrim( localUtil.format( AV19BarAcs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaracs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaracs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHreracab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHreracab.getInternalname(), httpContext.getMessage( "Tipo Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHreracab, cmbavHreracab.getInternalname(), GXutil.rtrim( AV67HreRacab), 1, cmbavHreracab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHreracab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         cmbavHreracab.setValue( GXutil.rtrim( AV67HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavSoload.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSoload.getInternalname(), AV47SoloAd, "", "", 1, chkavSoload.getEnabled(), "S", httpContext.getMessage( "Solo con Añadidas?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(121, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,121);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavCoradi.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCoradi.getInternalname(), AV26CorAdi, "", "", 1, chkavCoradi.getEnabled(), "S", httpContext.getMessage( "Corantes?", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(125, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,125);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcodfrom_Internalname, httpContext.getMessage( "Tip. Art. Ini.", ""), "", "", lblTextblockcombo_tipartcodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcodfrom.setProperty("Caption", Combo_tipartcodfrom_Caption);
         ucCombo_tipartcodfrom.setProperty("Cls", Combo_tipartcodfrom_Cls);
         ucCombo_tipartcodfrom.setProperty("EmptyItemText", Combo_tipartcodfrom_Emptyitemtext);
         ucCombo_tipartcodfrom.setProperty("DropDownOptionsData", AV68TipArtCodfrom_Data);
         ucCombo_tipartcodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcodfrom_Internalname, "COMBO_TIPARTCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipartcodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipartcodto_Internalname, httpContext.getMessage( "Tip. Art. Fin.", ""), "", "", lblTextblockcombo_tipartcodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipartcodto.setProperty("Caption", Combo_tipartcodto_Caption);
         ucCombo_tipartcodto.setProperty("Cls", Combo_tipartcodto_Cls);
         ucCombo_tipartcodto.setProperty("EmptyItemText", Combo_tipartcodto_Emptyitemtext);
         ucCombo_tipartcodto.setProperty("DropDownOptionsData", AV70TipArtCodto_Data);
         ucCombo_tipartcodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcodto_Internalname, "COMBO_TIPARTCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPbarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPbarcod_Internalname, httpContext.getMessage( "Nº Hdr Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPbarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV37PBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37PBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37PBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPbarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPbarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPbarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPbarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPbarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV39PBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPbarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39PBarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV39PBarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPbarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPbarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPbarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPbarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPbarcodpar_Internalname, GXutil.rtrim( AV38PBarCodPar), GXutil.rtrim( localUtil.format( AV38PBarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPbarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPbarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUbarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUbarcod_Internalname, httpContext.getMessage( "Nº Hdr Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUbarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV55UBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55UBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55UBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUbarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUbarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUbarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUbarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUbarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV57UBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUbarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57UBarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV57UBarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,167);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUbarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUbarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUbarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUbarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUbarcodpar_Internalname, GXutil.rtrim( AV56UBarCodPar), GXutil.rtrim( localUtil.format( AV56UBarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUbarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUbarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "", httpContext.getMessage( "Limpiar Variables Pantalha", ""), bttBtnlimpiarvariables_Jsonclick, 7, httpContext.getMessage( "Limpiar Variables Pantalha", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111xf1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
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
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs.setProperty("PageCount", Gxuitabspanel_tabs_Pagecount);
         ucGxuitabspanel_tabs.setProperty("Class", Gxuitabspanel_tabs_Class);
         ucGxuitabspanel_tabs.setProperty("HistoryManagement", Gxuitabspanel_tabs_Historymanagement);
         ucGxuitabspanel_tabs.render(context, "tab", Gxuitabspanel_tabs_Internalname, "GXUITABSPANEL_TABSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0205"+"", GXutil.rtrim( WebComp_Wcconsultadesdelconti_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0205"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcconsultadesdelconti_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadesdelconti), GXutil.lower( WebComp_Wcconsultadesdelconti_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0205"+"");
               }
               WebComp_Wcconsultadesdelconti.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcconsultadesdelconti), GXutil.lower( WebComp_Wcconsultadesdelconti_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV76Pgmname), GXutil.rtrim( localUtil.format( AV76Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV40PCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40PCliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavPclicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV58UCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV58UCliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavUclicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodi_Internalname, GXutil.rtrim( AV36MaqCodi), GXutil.rtrim( localUtil.format( AV36MaqCodi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodi_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcodi_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodf_Internalname, GXutil.rtrim( AV35MaqCodf), GXutil.rtrim( localUtil.format( AV35MaqCodf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodf_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcodf_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV48TipArtCodfrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TipArtCodfrom), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcodfrom_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV49TipArtCodto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV49TipArtCodto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,218);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipartcodto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ConsultadesdeLconti_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1XF2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Historico Recetas (from Lconti)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1XF0( ) ;
   }

   public void ws1XF2( )
   {
      start1XF2( ) ;
      evt1XF2( ) ;
   }

   public void evt1XF2( )
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
                           e121XF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e131XF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141XF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151XF2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 205 )
                     {
                        OldWcconsultadesdelconti = httpContext.cgiGet( "W0205") ;
                        if ( ( GXutil.len( OldWcconsultadesdelconti) == 0 ) || ( GXutil.strcmp(OldWcconsultadesdelconti, WebComp_Wcconsultadesdelconti_Component) != 0 ) )
                        {
                           WebComp_Wcconsultadesdelconti = WebUtils.getWebComponent(getClass(), "app." + OldWcconsultadesdelconti + "_impl", remoteHandle, context);
                           WebComp_Wcconsultadesdelconti_Component = OldWcconsultadesdelconti ;
                        }
                        if ( GXutil.len( WebComp_Wcconsultadesdelconti_Component) != 0 )
                        {
                           WebComp_Wcconsultadesdelconti.componentprocess("W0205", "", sEvt);
                        }
                        WebComp_Wcconsultadesdelconti_Component = OldWcconsultadesdelconti ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1XF2( )
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

   public void pa1XF2( )
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
            GX_FocusControl = edtavFec1_Internalname ;
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
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV67HreRacab = cmbavHreracab.getValidValue(AV67HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67HreRacab", AV67HreRacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHreracab.setValue( GXutil.rtrim( AV67HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      }
      AV47SoloAd = ((GXutil.strcmp(GXutil.rtrim( AV47SoloAd), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47SoloAd", AV47SoloAd);
      AV26CorAdi = ((GXutil.strcmp(GXutil.rtrim( AV26CorAdi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CorAdi", AV26CorAdi);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1XF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV76Pgmname = "FormulacionTinte.ConsultadesdeLconti_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1XF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcconsultadesdelconti_Component) != 0 )
            {
               WebComp_Wcconsultadesdelconti.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151XF2 ();
         wb1XF0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1XF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV64EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNMESES", GXutil.ltrim( localUtil.ntoc( AV73nmeses, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNMESES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73nmeses), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV76Pgmname = "FormulacionTinte.ConsultadesdeLconti_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1XF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121XF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPCLICOD_DATA"), AV41PCliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUCLICOD_DATA"), AV59UCliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODI_DATA"), AV71MaqCodi_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCODF_DATA"), AV72MaqCodf_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCODFROM_DATA"), AV68TipArtCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCODTO_DATA"), AV70TipArtCodto_Data);
         /* Read saved values. */
         AV73nmeses = (short)(localUtil.ctol( httpContext.cgiGet( "vNMESES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Combo_pclicod_Cls = httpContext.cgiGet( "COMBO_PCLICOD_Cls") ;
         Combo_pclicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PCLICOD_Selectedvalue_set") ;
         Combo_pclicod_Selectedtext_set = httpContext.cgiGet( "COMBO_PCLICOD_Selectedtext_set") ;
         Combo_pclicod_Emptyitemtext = httpContext.cgiGet( "COMBO_PCLICOD_Emptyitemtext") ;
         Combo_uclicod_Cls = httpContext.cgiGet( "COMBO_UCLICOD_Cls") ;
         Combo_uclicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_UCLICOD_Selectedvalue_set") ;
         Combo_uclicod_Selectedtext_set = httpContext.cgiGet( "COMBO_UCLICOD_Selectedtext_set") ;
         Combo_uclicod_Emptyitemtext = httpContext.cgiGet( "COMBO_UCLICOD_Emptyitemtext") ;
         Combo_maqcodi_Cls = httpContext.cgiGet( "COMBO_MAQCODI_Cls") ;
         Combo_maqcodi_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODI_Selectedvalue_set") ;
         Combo_maqcodi_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQCODI_Selectedtext_set") ;
         Combo_maqcodi_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCODI_Emptyitemtext") ;
         Combo_maqcodf_Cls = httpContext.cgiGet( "COMBO_MAQCODF_Cls") ;
         Combo_maqcodf_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCODF_Selectedvalue_set") ;
         Combo_maqcodf_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQCODF_Selectedtext_set") ;
         Combo_maqcodf_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCODF_Emptyitemtext") ;
         Combo_tipartcodfrom_Cls = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Cls") ;
         Combo_tipartcodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Selectedvalue_set") ;
         Combo_tipartcodfrom_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Selectedtext_set") ;
         Combo_tipartcodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCODFROM_Emptyitemtext") ;
         Combo_tipartcodto_Cls = httpContext.cgiGet( "COMBO_TIPARTCODTO_Cls") ;
         Combo_tipartcodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCODTO_Selectedvalue_set") ;
         Combo_tipartcodto_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPARTCODTO_Selectedtext_set") ;
         Combo_tipartcodto_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCODTO_Emptyitemtext") ;
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
         Gxuitabspanel_tabs_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS_Class") ;
         Gxuitabspanel_tabs_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS_Historymanagement")) ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
         }
         else
         {
            AV30Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
         }
         else
         {
            AV31Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
         }
         AV45PSerie = httpContext.cgiGet( edtavPserie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45PSerie", AV45PSerie);
         AV62USerie = httpContext.cgiGet( edtavUserie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62USerie", AV62USerie);
         AV27DispCli1 = httpContext.cgiGet( edtavDispcli1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DispCli1", AV27DispCli1);
         AV28DispCli2 = httpContext.cgiGet( edtavDispcli2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DispCli2", AV28DispCli2);
         AV43PColor = httpContext.cgiGet( edtavPcolor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43PColor", AV43PColor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPCOLNUM");
            GX_FocusControl = edtavPcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42PColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PColNum), 6, 0));
         }
         else
         {
            AV42PColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavPcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42PColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PColNum), 6, 0));
         }
         AV61UColor = httpContext.cgiGet( edtavUcolor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61UColor", AV61UColor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUCOLNUM");
            GX_FocusControl = edtavUcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60UColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60UColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60UColNum), 6, 0));
         }
         else
         {
            AV60UColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavUcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60UColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60UColNum), 6, 0));
         }
         AV19BarAcs = httpContext.cgiGet( edtavBaracs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarAcs", AV19BarAcs);
         cmbavHreracab.setValue( httpContext.cgiGet( cmbavHreracab.getInternalname()) );
         AV67HreRacab = httpContext.cgiGet( cmbavHreracab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67HreRacab", AV67HreRacab);
         AV47SoloAd = ((GXutil.strcmp(httpContext.cgiGet( chkavSoload.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47SoloAd", AV47SoloAd);
         AV26CorAdi = ((GXutil.strcmp(httpContext.cgiGet( chkavCoradi.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26CorAdi", AV26CorAdi);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPBARCOD");
            GX_FocusControl = edtavPbarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37PBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PBarCod), 8, 0));
         }
         else
         {
            AV37PBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37PBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37PBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPBARCODREO");
            GX_FocusControl = edtavPbarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39PBarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PBarCodReo", GXutil.str( AV39PBarCodReo, 1, 0));
         }
         else
         {
            AV39PBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavPbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PBarCodReo", GXutil.str( AV39PBarCodReo, 1, 0));
         }
         AV38PBarCodPar = httpContext.cgiGet( edtavPbarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38PBarCodPar", AV38PBarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUBARCOD");
            GX_FocusControl = edtavUbarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV55UBarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55UBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55UBarCod), 8, 0));
         }
         else
         {
            AV55UBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavUbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55UBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55UBarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUBARCODREO");
            GX_FocusControl = edtavUbarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57UBarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57UBarCodReo", GXutil.str( AV57UBarCodReo, 1, 0));
         }
         else
         {
            AV57UBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavUbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57UBarCodReo", GXutil.str( AV57UBarCodReo, 1, 0));
         }
         AV56UBarCodPar = httpContext.cgiGet( edtavUbarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56UBarCodPar", AV56UBarCodPar);
         AV76Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Pgmname", AV76Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPCLICOD");
            GX_FocusControl = edtavPclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40PCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40PCliCod), 6, 0));
         }
         else
         {
            AV40PCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40PCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40PCliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUCLICOD");
            GX_FocusControl = edtavUclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58UCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58UCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58UCliCod), 6, 0));
         }
         else
         {
            AV58UCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavUclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58UCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58UCliCod), 6, 0));
         }
         AV36MaqCodi = httpContext.cgiGet( edtavMaqcodi_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36MaqCodi", AV36MaqCodi);
         AV35MaqCodf = httpContext.cgiGet( edtavMaqcodf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35MaqCodf", AV35MaqCodf);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODFROM");
            GX_FocusControl = edtavTipartcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48TipArtCodfrom = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCodfrom), 4, 0));
         }
         else
         {
            AV48TipArtCodfrom = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TipArtCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TipArtCodfrom), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCODTO");
            GX_FocusControl = edtavTipartcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49TipArtCodto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCodto), 4, 0));
         }
         else
         {
            AV49TipArtCodto = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TipArtCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TipArtCodto), 4, 0));
         }
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
      e121XF2 ();
      if (returnInSub) return;
   }

   public void e121XF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultadesdelconti_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      GXv_char2[0] = AV64EmprCod ;
      GXv_char3[0] = AV65EmprNom ;
      GXv_char4[0] = AV66UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultadesdelconti_wp_impl.this.AV64EmprCod = GXv_char2[0] ;
      consultadesdelconti_wp_impl.this.AV65EmprNom = GXv_char3[0] ;
      consultadesdelconti_wp_impl.this.AV66UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64EmprCod", AV64EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64EmprCod, "@!"))));
      AV67HreRacab = httpContext.getMessage( "T", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67HreRacab", AV67HreRacab);
      AV47SoloAd = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47SoloAd", AV47SoloAd);
      AV26CorAdi = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CorAdi", AV26CorAdi);
      GXt_int5 = AV73nmeses ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV64EmprCod, httpContext.getMessage( "LCTNME", ""), GXv_int6) ;
      consultadesdelconti_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73nmeses = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73nmeses", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73nmeses), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNMESES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73nmeses), "ZZZ9")));
      AV73nmeses = (short)(((0==AV73nmeses) ? 180 : AV73nmeses)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73nmeses", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73nmeses), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNMESES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73nmeses), "ZZZ9")));
      AV30Fec1 = GXutil.dadd(GXutil.today( ),-((int)(AV73nmeses))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Fec1", localUtil.format(AV30Fec1, "99/99/99"));
      AV31Fec2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Fec2", localUtil.format(AV31Fec2, "99/99/99"));
      GXt_char1 = AV63Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      consultadesdelconti_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV63Station = GXt_char1 ;
      GXv_char4[0] = AV64EmprCod ;
      GXv_char3[0] = AV65EmprNom ;
      GXv_char2[0] = AV66UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char4, GXv_char3, GXv_char2) ;
      consultadesdelconti_wp_impl.this.AV64EmprCod = GXv_char4[0] ;
      consultadesdelconti_wp_impl.this.AV65EmprNom = GXv_char3[0] ;
      consultadesdelconti_wp_impl.this.AV66UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64EmprCod", AV64EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64EmprCod, "@!"))));
      edtavTipartcodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcodto_Visible), 5, 0), true);
      edtavTipartcodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartcodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartcodfrom_Visible), 5, 0), true);
      edtavMaqcodf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodf_Visible), 5, 0), true);
      edtavMaqcodi_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcodi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcodi_Visible), 5, 0), true);
      edtavUclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUclicod_Visible), 5, 0), true);
      edtavPclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPCLICOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOUCLICOD' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCODI' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCODF' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPARTCODFROM' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPARTCODTO' */
      S162 ();
      if (returnInSub) return;
   }

   public void e131XF2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV58UCliCod = ((0==AV58UCliCod) ? AV40PCliCod : AV58UCliCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58UCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58UCliCod), 6, 0));
      AV55UBarCod = ((0==AV55UBarCod) ? AV37PBarCod : AV55UBarCod) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55UBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55UBarCod), 8, 0));
      AV57UBarCodReo = ((0==AV57UBarCodReo) ? AV39PBarCodReo : AV57UBarCodReo) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57UBarCodReo", GXutil.str( AV57UBarCodReo, 1, 0));
      AV56UBarCodPar = ((GXutil.strcmp("", AV56UBarCodPar)==0) ? AV38PBarCodPar : AV56UBarCodPar) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56UBarCodPar", AV56UBarCodPar);
      AV62USerie = ((GXutil.strcmp("", AV62USerie)==0) ? AV45PSerie : AV62USerie) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62USerie", AV62USerie);
      AV61UColor = ((GXutil.strcmp("", AV61UColor)==0) ? AV43PColor : AV61UColor) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61UColor", AV61UColor);
      AV60UColNum = ((0==AV60UColNum) ? AV42PColNum : AV60UColNum) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60UColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60UColNum), 6, 0));
      AV28DispCli2 = ((GXutil.strcmp("", AV28DispCli2)==0) ? AV27DispCli1 : AV28DispCli2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DispCli2", AV28DispCli2);
      AV35MaqCodf = ((GXutil.strcmp("", AV35MaqCodf)==0) ? AV36MaqCodi : AV35MaqCodf) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35MaqCodf", AV35MaqCodf);
      AV32Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31Fec2)) ? GXutil.today( ) : AV31Fec2) ;
      AV50TipArtCodto2 = (short)(((0==AV49TipArtCodto) ? 9999 : AV49TipArtCodto)) ;
      if ( (0==AV58UCliCod) )
      {
         AV23CliCodP = 999999 ;
      }
      else
      {
         AV23CliCodP = AV58UCliCod ;
      }
      if ( (0==AV55UBarCod) )
      {
         AV20BarCodP = 99999999 ;
      }
      else
      {
         AV20BarCodP = AV55UBarCod ;
      }
      if ( (0==AV57UBarCodReo) && (0==AV55UBarCod) )
      {
         AV22BarCodReoP = (byte)(9) ;
      }
      else
      {
         AV22BarCodReoP = AV57UBarCodReo ;
      }
      if ( (GXutil.strcmp("", AV56UBarCodPar)==0) && (0==AV55UBarCod) )
      {
         AV21BarCodParP = httpContext.getMessage( "Z", "") ;
      }
      else
      {
         AV21BarCodParP = AV56UBarCodPar ;
      }
      if ( (GXutil.strcmp("", AV62USerie)==0) )
      {
         AV46SerieP = httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") ;
      }
      else
      {
         AV46SerieP = AV62USerie ;
      }
      if ( (GXutil.strcmp("", AV61UColor)==0) )
      {
         AV25ColorP = httpContext.getMessage( "zzzzzzzzzzzzz", "") ;
      }
      else
      {
         AV25ColorP = AV61UColor ;
      }
      if ( (0==AV60UColNum) )
      {
         AV24ColNumP = 999999 ;
      }
      else
      {
         AV24ColNumP = AV60UColNum ;
      }
      if ( (GXutil.strcmp("", AV28DispCli2)==0) )
      {
         AV29DispCli3 = httpContext.getMessage( "zzzzzzzzzzzzzzzzzzzz", "") ;
      }
      else
      {
         AV29DispCli3 = AV28DispCli2 ;
      }
      AV34maqcod3 = ((GXutil.strcmp("", AV35MaqCodf)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV35MaqCodf) ;
      AV50TipArtCodto2 = (short)(((0==AV49TipArtCodto) ? 9999 : AV49TipArtCodto)) ;
      AV44ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV44ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV44ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV44ProgressIndicator.show();
      AV44ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando consulta..", ""));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcconsultadesdelconti = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcconsultadesdelconti_Component), GXutil.lower( "FormulacionTinte.ConsultadesdeLconti")) != 0 )
      {
         WebComp_Wcconsultadesdelconti = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.consultadesdelconti_impl", remoteHandle, context);
         WebComp_Wcconsultadesdelconti_Component = "FormulacionTinte.ConsultadesdeLconti" ;
      }
      if ( GXutil.len( WebComp_Wcconsultadesdelconti_Component) != 0 )
      {
         WebComp_Wcconsultadesdelconti.setjustcreated();
         WebComp_Wcconsultadesdelconti.componentprepare(new Object[] {"W0205","",AV64EmprCod,AV30Fec1,AV32Fec3,Integer.valueOf(AV40PCliCod),Integer.valueOf(AV23CliCodP),Integer.valueOf(AV37PBarCod),Integer.valueOf(AV20BarCodP),Byte.valueOf(AV39PBarCodReo),Byte.valueOf(AV22BarCodReoP),AV38PBarCodPar,AV21BarCodParP,AV45PSerie,AV46SerieP,AV43PColor,AV25ColorP,Integer.valueOf(AV42PColNum),Integer.valueOf(AV24ColNumP),AV27DispCli1,AV29DispCli3,AV67HreRacab,AV36MaqCodi,AV34maqcod3,Short.valueOf(AV48TipArtCodfrom),Short.valueOf(AV50TipArtCodto2),AV47SoloAd,AV26CorAdi});
         WebComp_Wcconsultadesdelconti.componentbind(new Object[] {"","vFEC1","","vPCLICOD","","vPBARCOD","","vPBARCODREO","","vPBARCODPAR","","vPSERIE","","vPCOLOR","","vPCOLNUM","","vDISPCLI1","","vHRERACAB","vMAQCODI","","vTIPARTCODFROM","","vSOLOAD","vCORADI"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcconsultadesdelconti )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0205"+"");
         WebComp_Wcconsultadesdelconti.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV44ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV44ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ProgressIndicator", AV44ProgressIndicator);
   }

   public void e141XF2( )
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

   public void S162( )
   {
      /* 'LOADCOMBOTIPARTCODTO' Routine */
      returnInSub = false ;
      /* Using cursor H01XF2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13788TipArtCodD = H01XF2_A13788TipArtCodD[0] ;
         A829TipArtCod = H01XF2_A829TipArtCod[0] ;
         A830TipArtDsc = H01XF2_A830TipArtDsc[0] ;
         n830TipArtDsc = H01XF2_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H01XF2_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H01XF2_n6014TipArtDsc2[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV70TipArtCodto_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_tipartcodto_Selectedvalue_set = ((0==AV49TipArtCodto) ? "" : GXutil.trim( GXutil.str( AV49TipArtCodto, 4, 0))) ;
      ucCombo_tipartcodto.sendProperty(context, "", false, Combo_tipartcodto_Internalname, "SelectedValue_set", Combo_tipartcodto_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOTIPARTCODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H01XF3 */
      pr_default.execute(1);
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13788TipArtCodD = H01XF3_A13788TipArtCodD[0] ;
         A829TipArtCod = H01XF3_A829TipArtCod[0] ;
         A830TipArtDsc = H01XF3_A830TipArtDsc[0] ;
         n830TipArtDsc = H01XF3_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H01XF3_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H01XF3_n6014TipArtDsc2[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV68TipArtCodfrom_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_tipartcodfrom_Selectedvalue_set = ((0==AV48TipArtCodfrom) ? "" : GXutil.trim( GXutil.str( AV48TipArtCodfrom, 4, 0))) ;
      ucCombo_tipartcodfrom.sendProperty(context, "", false, Combo_tipartcodfrom_Internalname, "SelectedValue_set", Combo_tipartcodfrom_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOMAQCODF' Routine */
      returnInSub = false ;
      /* Using cursor H01XF4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13734MaqCDsc = H01XF4_A13734MaqCDsc[0] ;
         A602MaqCod = H01XF4_A602MaqCod[0] ;
         A606MaqDsc = H01XF4_A606MaqDsc[0] ;
         n606MaqDsc = H01XF4_n606MaqDsc[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV72MaqCodf_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_maqcodf_Selectedvalue_set = AV35MaqCodf ;
      ucCombo_maqcodf.sendProperty(context, "", false, Combo_maqcodf_Internalname, "SelectedValue_set", Combo_maqcodf_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOMAQCODI' Routine */
      returnInSub = false ;
      /* Using cursor H01XF5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13734MaqCDsc = H01XF5_A13734MaqCDsc[0] ;
         A602MaqCod = H01XF5_A602MaqCod[0] ;
         A606MaqDsc = H01XF5_A606MaqDsc[0] ;
         n606MaqDsc = H01XF5_n606MaqDsc[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13734MaqCDsc );
         AV71MaqCodi_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_maqcodi_Selectedvalue_set = AV36MaqCodi ;
      ucCombo_maqcodi.sendProperty(context, "", false, Combo_maqcodi_Internalname, "SelectedValue_set", Combo_maqcodi_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOUCLICOD' Routine */
      returnInSub = false ;
      /* Using cursor H01XF6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A10045CliAct = H01XF6_A10045CliAct[0] ;
         A13735CliCNom = H01XF6_A13735CliCNom[0] ;
         A252CliCod = H01XF6_A252CliCod[0] ;
         A279CliNom = H01XF6_A279CliNom[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV59UCliCod_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_uclicod_Selectedvalue_set = ((0==AV58UCliCod) ? "" : GXutil.trim( GXutil.str( AV58UCliCod, 6, 0))) ;
      ucCombo_uclicod.sendProperty(context, "", false, Combo_uclicod_Internalname, "SelectedValue_set", Combo_uclicod_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPCLICOD' Routine */
      returnInSub = false ;
      /* Using cursor H01XF7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H01XF7_A10045CliAct[0] ;
         A13735CliCNom = H01XF7_A13735CliCNom[0] ;
         A252CliCod = H01XF7_A252CliCod[0] ;
         A279CliNom = H01XF7_A279CliNom[0] ;
         AV69Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV69Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV41PCliCod_Data.add(AV69Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_pclicod_Selectedvalue_set = ((0==AV40PCliCod) ? "" : GXutil.trim( GXutil.str( AV40PCliCod, 6, 0))) ;
      ucCombo_pclicod.sendProperty(context, "", false, Combo_pclicod_Internalname, "SelectedValue_set", Combo_pclicod_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e151XF2( )
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
      pa1XF2( ) ;
      ws1XF2( ) ;
      we1XF2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcconsultadesdelconti == null ) )
      {
         if ( GXutil.len( WebComp_Wcconsultadesdelconti_Component) != 0 )
         {
            WebComp_Wcconsultadesdelconti.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268188161971", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/consultadesdelconti_wp.js", "?20268188161971", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      lblTextblockcombo_pclicod_Internalname = "TEXTBLOCKCOMBO_PCLICOD" ;
      Combo_pclicod_Internalname = "COMBO_PCLICOD" ;
      divTablesplittedpclicod_Internalname = "TABLESPLITTEDPCLICOD" ;
      lblTextblockcombo_uclicod_Internalname = "TEXTBLOCKCOMBO_UCLICOD" ;
      Combo_uclicod_Internalname = "COMBO_UCLICOD" ;
      divTablesplitteduclicod_Internalname = "TABLESPLITTEDUCLICOD" ;
      edtavPserie_Internalname = "vPSERIE" ;
      edtavUserie_Internalname = "vUSERIE" ;
      edtavDispcli1_Internalname = "vDISPCLI1" ;
      edtavDispcli2_Internalname = "vDISPCLI2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      edtavPcolor_Internalname = "vPCOLOR" ;
      edtavPcolnum_Internalname = "vPCOLNUM" ;
      edtavUcolor_Internalname = "vUCOLOR" ;
      edtavUcolnum_Internalname = "vUCOLNUM" ;
      lblTextblockcombo_maqcodi_Internalname = "TEXTBLOCKCOMBO_MAQCODI" ;
      Combo_maqcodi_Internalname = "COMBO_MAQCODI" ;
      divTablesplittedmaqcodi_Internalname = "TABLESPLITTEDMAQCODI" ;
      lblTextblockcombo_maqcodf_Internalname = "TEXTBLOCKCOMBO_MAQCODF" ;
      Combo_maqcodf_Internalname = "COMBO_MAQCODF" ;
      divTablesplittedmaqcodf_Internalname = "TABLESPLITTEDMAQCODF" ;
      edtavBaracs_Internalname = "vBARACS" ;
      cmbavHreracab.setInternalname( "vHRERACAB" );
      chkavSoload.setInternalname( "vSOLOAD" );
      chkavCoradi.setInternalname( "vCORADI" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
      lblTextblockcombo_tipartcodfrom_Internalname = "TEXTBLOCKCOMBO_TIPARTCODFROM" ;
      Combo_tipartcodfrom_Internalname = "COMBO_TIPARTCODFROM" ;
      divTablesplittedtipartcodfrom_Internalname = "TABLESPLITTEDTIPARTCODFROM" ;
      lblTextblockcombo_tipartcodto_Internalname = "TEXTBLOCKCOMBO_TIPARTCODTO" ;
      Combo_tipartcodto_Internalname = "COMBO_TIPARTCODTO" ;
      divTablesplittedtipartcodto_Internalname = "TABLESPLITTEDTIPARTCODTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavPbarcod_Internalname = "vPBARCOD" ;
      edtavPbarcodreo_Internalname = "vPBARCODREO" ;
      edtavPbarcodpar_Internalname = "vPBARCODPAR" ;
      edtavUbarcod_Internalname = "vUBARCOD" ;
      edtavUbarcodreo_Internalname = "vUBARCODREO" ;
      edtavUbarcodpar_Internalname = "vUBARCODPAR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPclicod_Internalname = "vPCLICOD" ;
      edtavUclicod_Internalname = "vUCLICOD" ;
      edtavMaqcodi_Internalname = "vMAQCODI" ;
      edtavMaqcodf_Internalname = "vMAQCODF" ;
      edtavTipartcodfrom_Internalname = "vTIPARTCODFROM" ;
      edtavTipartcodto_Internalname = "vTIPARTCODTO" ;
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
      edtavTipartcodto_Jsonclick = "" ;
      edtavTipartcodto_Visible = 1 ;
      edtavTipartcodfrom_Jsonclick = "" ;
      edtavTipartcodfrom_Visible = 1 ;
      edtavMaqcodf_Jsonclick = "" ;
      edtavMaqcodf_Visible = 1 ;
      edtavMaqcodi_Jsonclick = "" ;
      edtavMaqcodi_Visible = 1 ;
      edtavUclicod_Jsonclick = "" ;
      edtavUclicod_Visible = 1 ;
      edtavPclicod_Jsonclick = "" ;
      edtavPclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavUbarcodpar_Jsonclick = "" ;
      edtavUbarcodpar_Enabled = 1 ;
      edtavUbarcodreo_Jsonclick = "" ;
      edtavUbarcodreo_Enabled = 1 ;
      edtavUbarcod_Jsonclick = "" ;
      edtavUbarcod_Enabled = 1 ;
      edtavPbarcodpar_Jsonclick = "" ;
      edtavPbarcodpar_Enabled = 1 ;
      edtavPbarcodreo_Jsonclick = "" ;
      edtavPbarcodreo_Enabled = 1 ;
      edtavPbarcod_Jsonclick = "" ;
      edtavPbarcod_Enabled = 1 ;
      chkavCoradi.setEnabled( 1 );
      chkavSoload.setEnabled( 1 );
      cmbavHreracab.setJsonclick( "" );
      cmbavHreracab.setEnabled( 1 );
      edtavBaracs_Jsonclick = "" ;
      edtavBaracs_Enabled = 1 ;
      edtavUcolnum_Jsonclick = "" ;
      edtavUcolnum_Enabled = 1 ;
      edtavUcolor_Jsonclick = "" ;
      edtavUcolor_Enabled = 1 ;
      edtavPcolnum_Jsonclick = "" ;
      edtavPcolnum_Enabled = 1 ;
      edtavPcolor_Jsonclick = "" ;
      edtavPcolor_Enabled = 1 ;
      edtavDispcli2_Jsonclick = "" ;
      edtavDispcli2_Enabled = 1 ;
      edtavDispcli1_Jsonclick = "" ;
      edtavDispcli1_Enabled = 1 ;
      edtavUserie_Jsonclick = "" ;
      edtavUserie_Enabled = 1 ;
      edtavPserie_Jsonclick = "" ;
      edtavPserie_Enabled = 1 ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 1 ;
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
      Combo_tipartcodto_Emptyitemtext = "Todos" ;
      Combo_tipartcodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipartcodfrom_Emptyitemtext = "Todos" ;
      Combo_tipartcodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcodf_Emptyitemtext = "Todas" ;
      Combo_maqcodf_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcodi_Emptyitemtext = "Todas" ;
      Combo_maqcodi_Cls = "ExtendedCombo AttributeFL" ;
      Combo_uclicod_Emptyitemtext = "Todos" ;
      Combo_uclicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_pclicod_Emptyitemtext = "Todos" ;
      Combo_pclicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta Historico Recetas (from Lconti)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHreracab.setName( "vHRERACAB" );
      cmbavHreracab.setWebtags( "" );
      cmbavHreracab.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavHreracab.addItem("N", httpContext.getMessage( "Tinte", ""), (short)(0));
      cmbavHreracab.addItem("S", httpContext.getMessage( "Acabado", ""), (short)(0));
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV67HreRacab = cmbavHreracab.getValidValue(AV67HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67HreRacab", AV67HreRacab);
      }
      chkavSoload.setName( "vSOLOAD" );
      chkavSoload.setWebtags( "" );
      chkavSoload.setCaption( httpContext.getMessage( "Solo con Añadidas?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSoload.getInternalname(), "TitleCaption", chkavSoload.getCaption(), true);
      chkavSoload.setCheckedValue( "N" );
      AV47SoloAd = ((GXutil.strcmp(GXutil.rtrim( AV47SoloAd), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47SoloAd", AV47SoloAd);
      chkavCoradi.setName( "vCORADI" );
      chkavCoradi.setWebtags( "" );
      chkavCoradi.setCaption( httpContext.getMessage( "Corantes?", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavCoradi.getInternalname(), "TitleCaption", chkavCoradi.getCaption(), true);
      chkavCoradi.setCheckedValue( "N" );
      AV26CorAdi = ((GXutil.strcmp(GXutil.rtrim( AV26CorAdi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26CorAdi", AV26CorAdi);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV47SoloAd',fld:'vSOLOAD',pic:''},{av:'AV26CorAdi',fld:'vCORADI',pic:''},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV73nmeses',fld:'vNMESES',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e131XF2',iparms:[{av:'AV40PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV58UCliCod',fld:'vUCLICOD',pic:'ZZZZZ9'},{av:'AV37PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV55UBarCod',fld:'vUBARCOD',pic:'ZZZZZZZ9'},{av:'AV39PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV57UBarCodReo',fld:'vUBARCODREO',pic:'9'},{av:'AV38PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV56UBarCodPar',fld:'vUBARCODPAR',pic:''},{av:'AV45PSerie',fld:'vPSERIE',pic:''},{av:'AV62USerie',fld:'vUSERIE',pic:''},{av:'AV43PColor',fld:'vPCOLOR',pic:''},{av:'AV61UColor',fld:'vUCOLOR',pic:''},{av:'AV42PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV60UColNum',fld:'vUCOLNUM',pic:'ZZZZZ9'},{av:'AV27DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV28DispCli2',fld:'vDISPCLI2',pic:''},{av:'AV36MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV35MaqCodf',fld:'vMAQCODF',pic:''},{av:'AV31Fec2',fld:'vFEC2',pic:''},{av:'AV49TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV64EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30Fec1',fld:'vFEC1',pic:''},{av:'cmbavHreracab'},{av:'AV67HreRacab',fld:'vHRERACAB',pic:''},{av:'AV48TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV47SoloAd',fld:'vSOLOAD',pic:''},{av:'AV26CorAdi',fld:'vCORADI',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV58UCliCod',fld:'vUCLICOD',pic:'ZZZZZ9'},{av:'AV55UBarCod',fld:'vUBARCOD',pic:'ZZZZZZZ9'},{av:'AV57UBarCodReo',fld:'vUBARCODREO',pic:'9'},{av:'AV56UBarCodPar',fld:'vUBARCODPAR',pic:''},{av:'AV62USerie',fld:'vUSERIE',pic:''},{av:'AV61UColor',fld:'vUCOLOR',pic:''},{av:'AV60UColNum',fld:'vUCOLNUM',pic:'ZZZZZ9'},{av:'AV28DispCli2',fld:'vDISPCLI2',pic:''},{av:'AV35MaqCodf',fld:'vMAQCODF',pic:''},{ctrl:'WCCONSULTADESDELCONTI'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e111XF1',iparms:[{av:'AV73nmeses',fld:'vNMESES',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV30Fec1',fld:'vFEC1',pic:''},{av:'AV31Fec2',fld:'vFEC2',pic:''},{av:'AV40PCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV58UCliCod',fld:'vUCLICOD',pic:'ZZZZZ9'},{av:'AV45PSerie',fld:'vPSERIE',pic:''},{av:'AV62USerie',fld:'vUSERIE',pic:''},{av:'AV27DispCli1',fld:'vDISPCLI1',pic:''},{av:'AV28DispCli2',fld:'vDISPCLI2',pic:''},{av:'Combo_pclicod_Selectedtext_set',ctrl:'COMBO_PCLICOD',prop:'SelectedText_set'},{av:'Combo_pclicod_Selectedvalue_set',ctrl:'COMBO_PCLICOD',prop:'SelectedValue_set'},{av:'Combo_uclicod_Selectedtext_set',ctrl:'COMBO_UCLICOD',prop:'SelectedText_set'},{av:'Combo_uclicod_Selectedvalue_set',ctrl:'COMBO_UCLICOD',prop:'SelectedValue_set'},{av:'Combo_maqcodi_Selectedtext_set',ctrl:'COMBO_MAQCODI',prop:'SelectedText_set'},{av:'Combo_maqcodi_Selectedvalue_set',ctrl:'COMBO_MAQCODI',prop:'SelectedValue_set'},{av:'Combo_maqcodf_Selectedtext_set',ctrl:'COMBO_MAQCODF',prop:'SelectedText_set'},{av:'Combo_maqcodf_Selectedvalue_set',ctrl:'COMBO_MAQCODF',prop:'SelectedValue_set'},{av:'Combo_tipartcodfrom_Selectedtext_set',ctrl:'COMBO_TIPARTCODFROM',prop:'SelectedText_set'},{av:'Combo_tipartcodto_Selectedvalue_set',ctrl:'COMBO_TIPARTCODTO',prop:'SelectedValue_set'},{av:'Combo_tipartcodfrom_Selectedvalue_set',ctrl:'COMBO_TIPARTCODFROM',prop:'SelectedValue_set'},{av:'AV43PColor',fld:'vPCOLOR',pic:''},{av:'AV42PColNum',fld:'vPCOLNUM',pic:'ZZZZZ9'},{av:'AV61UColor',fld:'vUCOLOR',pic:''},{av:'AV60UColNum',fld:'vUCOLNUM',pic:'ZZZZZ9'},{av:'AV36MaqCodi',fld:'vMAQCODI',pic:''},{av:'AV35MaqCodf',fld:'vMAQCODF',pic:''},{av:'AV19BarAcs',fld:'vBARACS',pic:''},{av:'cmbavHreracab'},{av:'AV67HreRacab',fld:'vHRERACAB',pic:''},{av:'AV47SoloAd',fld:'vSOLOAD',pic:''},{av:'AV26CorAdi',fld:'vCORADI',pic:''},{av:'AV48TipArtCodfrom',fld:'vTIPARTCODFROM',pic:'ZZZ9'},{av:'AV49TipArtCodto',fld:'vTIPARTCODTO',pic:'ZZZ9'},{av:'AV37PBarCod',fld:'vPBARCOD',pic:'ZZZZZZZ9'},{av:'AV39PBarCodReo',fld:'vPBARCODREO',pic:'9'},{av:'AV38PBarCodPar',fld:'vPBARCODPAR',pic:''},{av:'AV55UBarCod',fld:'vUBARCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141XF2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
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
      Combo_tipartcodto_Selectedvalue_get = "" ;
      Combo_tipartcodfrom_Selectedvalue_get = "" ;
      Combo_tipartcodfrom_Selectedtext_get = "" ;
      Combo_maqcodf_Selectedvalue_get = "" ;
      Combo_maqcodi_Selectedvalue_get = "" ;
      Combo_maqcodi_Selectedtext_get = "" ;
      Combo_uclicod_Selectedvalue_get = "" ;
      Combo_pclicod_Selectedvalue_get = "" ;
      Combo_pclicod_Selectedtext_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV64EmprCod = "" ;
      GXKey = "" ;
      AV41PCliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV59UCliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV71MaqCodi_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV72MaqCodf_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV68TipArtCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV70TipArtCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Combo_pclicod_Selectedvalue_set = "" ;
      Combo_pclicod_Selectedtext_set = "" ;
      Combo_uclicod_Selectedvalue_set = "" ;
      Combo_uclicod_Selectedtext_set = "" ;
      Combo_maqcodi_Selectedvalue_set = "" ;
      Combo_maqcodi_Selectedtext_set = "" ;
      Combo_maqcodf_Selectedvalue_set = "" ;
      Combo_maqcodf_Selectedtext_set = "" ;
      Combo_tipartcodfrom_Selectedvalue_set = "" ;
      Combo_tipartcodfrom_Selectedtext_set = "" ;
      Combo_tipartcodto_Selectedvalue_set = "" ;
      Combo_tipartcodto_Selectedtext_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV30Fec1 = GXutil.nullDate() ;
      AV31Fec2 = GXutil.nullDate() ;
      lblTextblockcombo_pclicod_Jsonclick = "" ;
      ucCombo_pclicod = new com.genexus.webpanels.GXUserControl();
      Combo_pclicod_Caption = "" ;
      lblTextblockcombo_uclicod_Jsonclick = "" ;
      ucCombo_uclicod = new com.genexus.webpanels.GXUserControl();
      Combo_uclicod_Caption = "" ;
      AV45PSerie = "" ;
      AV62USerie = "" ;
      AV27DispCli1 = "" ;
      AV28DispCli2 = "" ;
      AV43PColor = "" ;
      AV61UColor = "" ;
      lblTextblockcombo_maqcodi_Jsonclick = "" ;
      ucCombo_maqcodi = new com.genexus.webpanels.GXUserControl();
      Combo_maqcodi_Caption = "" ;
      lblTextblockcombo_maqcodf_Jsonclick = "" ;
      ucCombo_maqcodf = new com.genexus.webpanels.GXUserControl();
      Combo_maqcodf_Caption = "" ;
      AV19BarAcs = "" ;
      AV67HreRacab = "" ;
      AV47SoloAd = "" ;
      AV26CorAdi = "" ;
      lblTextblockcombo_tipartcodfrom_Jsonclick = "" ;
      ucCombo_tipartcodfrom = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcodfrom_Caption = "" ;
      lblTextblockcombo_tipartcodto_Jsonclick = "" ;
      ucCombo_tipartcodto = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcodto_Caption = "" ;
      AV38PBarCodPar = "" ;
      AV56UBarCodPar = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcconsultadesdelconti_Component = "" ;
      OldWcconsultadesdelconti = "" ;
      AV76Pgmname = "" ;
      AV36MaqCodi = "" ;
      AV35MaqCodf = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV63Station = "" ;
      AV65EmprNom = "" ;
      AV66UsurCod = "" ;
      GXv_int6 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV32Fec3 = GXutil.nullDate() ;
      AV21BarCodParP = "" ;
      AV46SerieP = "" ;
      AV25ColorP = "" ;
      AV29DispCli3 = "" ;
      AV34maqcod3 = "" ;
      AV44ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H01XF2_A396EmprCod = new String[] {""} ;
      H01XF2_A13788TipArtCodD = new String[] {""} ;
      H01XF2_A829TipArtCod = new short[1] ;
      H01XF2_A830TipArtDsc = new String[] {""} ;
      H01XF2_n830TipArtDsc = new boolean[] {false} ;
      H01XF2_A6014TipArtDsc2 = new String[] {""} ;
      H01XF2_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      AV69Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01XF3_A396EmprCod = new String[] {""} ;
      H01XF3_A13788TipArtCodD = new String[] {""} ;
      H01XF3_A829TipArtCod = new short[1] ;
      H01XF3_A830TipArtDsc = new String[] {""} ;
      H01XF3_n830TipArtDsc = new boolean[] {false} ;
      H01XF3_A6014TipArtDsc2 = new String[] {""} ;
      H01XF3_n6014TipArtDsc2 = new boolean[] {false} ;
      H01XF4_A396EmprCod = new String[] {""} ;
      H01XF4_A13734MaqCDsc = new String[] {""} ;
      H01XF4_A602MaqCod = new String[] {""} ;
      H01XF4_A606MaqDsc = new String[] {""} ;
      H01XF4_n606MaqDsc = new boolean[] {false} ;
      A13734MaqCDsc = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      H01XF5_A396EmprCod = new String[] {""} ;
      H01XF5_A13734MaqCDsc = new String[] {""} ;
      H01XF5_A602MaqCod = new String[] {""} ;
      H01XF5_A606MaqDsc = new String[] {""} ;
      H01XF5_n606MaqDsc = new boolean[] {false} ;
      H01XF6_A396EmprCod = new String[] {""} ;
      H01XF6_A10045CliAct = new String[] {""} ;
      H01XF6_A13735CliCNom = new String[] {""} ;
      H01XF6_A252CliCod = new int[1] ;
      H01XF6_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H01XF7_A396EmprCod = new String[] {""} ;
      H01XF7_A10045CliAct = new String[] {""} ;
      H01XF7_A13735CliCNom = new String[] {""} ;
      H01XF7_A252CliCod = new int[1] ;
      H01XF7_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultadesdelconti_wp__default(),
         new Object[] {
             new Object[] {
            H01XF2_A396EmprCod, H01XF2_A13788TipArtCodD, H01XF2_A829TipArtCod, H01XF2_A830TipArtDsc, H01XF2_n830TipArtDsc, H01XF2_A6014TipArtDsc2, H01XF2_n6014TipArtDsc2
            }
            , new Object[] {
            H01XF3_A396EmprCod, H01XF3_A13788TipArtCodD, H01XF3_A829TipArtCod, H01XF3_A830TipArtDsc, H01XF3_n830TipArtDsc, H01XF3_A6014TipArtDsc2, H01XF3_n6014TipArtDsc2
            }
            , new Object[] {
            H01XF4_A396EmprCod, H01XF4_A13734MaqCDsc, H01XF4_A602MaqCod, H01XF4_A606MaqDsc, H01XF4_n606MaqDsc
            }
            , new Object[] {
            H01XF5_A396EmprCod, H01XF5_A13734MaqCDsc, H01XF5_A602MaqCod, H01XF5_A606MaqDsc, H01XF5_n606MaqDsc
            }
            , new Object[] {
            H01XF6_A396EmprCod, H01XF6_A10045CliAct, H01XF6_A13735CliCNom, H01XF6_A252CliCod, H01XF6_A279CliNom
            }
            , new Object[] {
            H01XF7_A396EmprCod, H01XF7_A10045CliAct, H01XF7_A13735CliCNom, H01XF7_A252CliCod, H01XF7_A279CliNom
            }
         }
      );
      AV76Pgmname = "FormulacionTinte.ConsultadesdeLconti_WP" ;
      /* GeneXus formulas. */
      AV76Pgmname = "FormulacionTinte.ConsultadesdeLconti_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcconsultadesdelconti = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV39PBarCodReo ;
   private byte AV57UBarCodReo ;
   private byte nDonePA ;
   private byte AV22BarCodReoP ;
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
   private short AV73nmeses ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48TipArtCodfrom ;
   private short AV49TipArtCodto ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV50TipArtCodto2 ;
   private short A829TipArtCod ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int edtavPserie_Enabled ;
   private int edtavUserie_Enabled ;
   private int edtavDispcli1_Enabled ;
   private int edtavDispcli2_Enabled ;
   private int edtavPcolor_Enabled ;
   private int AV42PColNum ;
   private int edtavPcolnum_Enabled ;
   private int edtavUcolor_Enabled ;
   private int AV60UColNum ;
   private int edtavUcolnum_Enabled ;
   private int edtavBaracs_Enabled ;
   private int AV37PBarCod ;
   private int edtavPbarcod_Enabled ;
   private int edtavPbarcodreo_Enabled ;
   private int edtavPbarcodpar_Enabled ;
   private int AV55UBarCod ;
   private int edtavUbarcod_Enabled ;
   private int edtavUbarcodreo_Enabled ;
   private int edtavUbarcodpar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV40PCliCod ;
   private int edtavPclicod_Visible ;
   private int AV58UCliCod ;
   private int edtavUclicod_Visible ;
   private int edtavMaqcodi_Visible ;
   private int edtavMaqcodf_Visible ;
   private int edtavTipartcodfrom_Visible ;
   private int edtavTipartcodto_Visible ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int AV23CliCodP ;
   private int AV20BarCodP ;
   private int AV24ColNumP ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_tipartcodto_Selectedvalue_get ;
   private String Combo_tipartcodfrom_Selectedvalue_get ;
   private String Combo_tipartcodfrom_Selectedtext_get ;
   private String Combo_maqcodf_Selectedvalue_get ;
   private String Combo_maqcodi_Selectedvalue_get ;
   private String Combo_maqcodi_Selectedtext_get ;
   private String Combo_uclicod_Selectedvalue_get ;
   private String Combo_pclicod_Selectedvalue_get ;
   private String Combo_pclicod_Selectedtext_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV64EmprCod ;
   private String GXKey ;
   private String Combo_pclicod_Cls ;
   private String Combo_pclicod_Selectedvalue_set ;
   private String Combo_pclicod_Selectedtext_set ;
   private String Combo_pclicod_Emptyitemtext ;
   private String Combo_uclicod_Cls ;
   private String Combo_uclicod_Selectedvalue_set ;
   private String Combo_uclicod_Selectedtext_set ;
   private String Combo_uclicod_Emptyitemtext ;
   private String Combo_maqcodi_Cls ;
   private String Combo_maqcodi_Selectedvalue_set ;
   private String Combo_maqcodi_Selectedtext_set ;
   private String Combo_maqcodi_Emptyitemtext ;
   private String Combo_maqcodf_Cls ;
   private String Combo_maqcodf_Selectedvalue_set ;
   private String Combo_maqcodf_Selectedtext_set ;
   private String Combo_maqcodf_Emptyitemtext ;
   private String Combo_tipartcodfrom_Cls ;
   private String Combo_tipartcodfrom_Selectedvalue_set ;
   private String Combo_tipartcodfrom_Selectedtext_set ;
   private String Combo_tipartcodfrom_Emptyitemtext ;
   private String Combo_tipartcodto_Cls ;
   private String Combo_tipartcodto_Selectedvalue_set ;
   private String Combo_tipartcodto_Selectedtext_set ;
   private String Combo_tipartcodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
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
   private String grpUnnamedgroup2_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavFec1_Internalname ;
   private String TempTags ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String divTablesplittedpclicod_Internalname ;
   private String lblTextblockcombo_pclicod_Internalname ;
   private String lblTextblockcombo_pclicod_Jsonclick ;
   private String Combo_pclicod_Caption ;
   private String Combo_pclicod_Internalname ;
   private String divTablesplitteduclicod_Internalname ;
   private String lblTextblockcombo_uclicod_Internalname ;
   private String lblTextblockcombo_uclicod_Jsonclick ;
   private String Combo_uclicod_Caption ;
   private String Combo_uclicod_Internalname ;
   private String edtavPserie_Internalname ;
   private String AV45PSerie ;
   private String edtavPserie_Jsonclick ;
   private String edtavUserie_Internalname ;
   private String AV62USerie ;
   private String edtavUserie_Jsonclick ;
   private String edtavDispcli1_Internalname ;
   private String AV27DispCli1 ;
   private String edtavDispcli1_Jsonclick ;
   private String edtavDispcli2_Internalname ;
   private String AV28DispCli2 ;
   private String edtavDispcli2_Jsonclick ;
   private String grpUnnamedgroup4_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPcolor_Internalname ;
   private String AV43PColor ;
   private String edtavPcolor_Jsonclick ;
   private String edtavPcolnum_Internalname ;
   private String edtavPcolnum_Jsonclick ;
   private String edtavUcolor_Internalname ;
   private String AV61UColor ;
   private String edtavUcolor_Jsonclick ;
   private String edtavUcolnum_Internalname ;
   private String edtavUcolnum_Jsonclick ;
   private String divTablesplittedmaqcodi_Internalname ;
   private String lblTextblockcombo_maqcodi_Internalname ;
   private String lblTextblockcombo_maqcodi_Jsonclick ;
   private String Combo_maqcodi_Caption ;
   private String Combo_maqcodi_Internalname ;
   private String divTablesplittedmaqcodf_Internalname ;
   private String lblTextblockcombo_maqcodf_Internalname ;
   private String lblTextblockcombo_maqcodf_Jsonclick ;
   private String Combo_maqcodf_Caption ;
   private String Combo_maqcodf_Internalname ;
   private String edtavBaracs_Internalname ;
   private String AV19BarAcs ;
   private String edtavBaracs_Jsonclick ;
   private String AV67HreRacab ;
   private String AV47SoloAd ;
   private String AV26CorAdi ;
   private String divUnnamedtable5_Internalname ;
   private String divTablesplittedtipartcodfrom_Internalname ;
   private String lblTextblockcombo_tipartcodfrom_Internalname ;
   private String lblTextblockcombo_tipartcodfrom_Jsonclick ;
   private String Combo_tipartcodfrom_Caption ;
   private String Combo_tipartcodfrom_Internalname ;
   private String divTablesplittedtipartcodto_Internalname ;
   private String lblTextblockcombo_tipartcodto_Internalname ;
   private String lblTextblockcombo_tipartcodto_Jsonclick ;
   private String Combo_tipartcodto_Caption ;
   private String Combo_tipartcodto_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavPbarcod_Internalname ;
   private String edtavPbarcod_Jsonclick ;
   private String edtavPbarcodreo_Internalname ;
   private String edtavPbarcodreo_Jsonclick ;
   private String edtavPbarcodpar_Internalname ;
   private String AV38PBarCodPar ;
   private String edtavPbarcodpar_Jsonclick ;
   private String edtavUbarcod_Internalname ;
   private String edtavUbarcod_Jsonclick ;
   private String edtavUbarcodreo_Internalname ;
   private String edtavUbarcodreo_Jsonclick ;
   private String edtavUbarcodpar_Internalname ;
   private String AV56UBarCodPar ;
   private String edtavUbarcodpar_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcconsultadesdelconti_Component ;
   private String OldWcconsultadesdelconti ;
   private String edtavPgmname_Internalname ;
   private String AV76Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPclicod_Internalname ;
   private String edtavPclicod_Jsonclick ;
   private String edtavUclicod_Internalname ;
   private String edtavUclicod_Jsonclick ;
   private String edtavMaqcodi_Internalname ;
   private String AV36MaqCodi ;
   private String edtavMaqcodi_Jsonclick ;
   private String edtavMaqcodf_Internalname ;
   private String AV35MaqCodf ;
   private String edtavMaqcodf_Jsonclick ;
   private String edtavTipartcodfrom_Internalname ;
   private String edtavTipartcodfrom_Jsonclick ;
   private String edtavTipartcodto_Internalname ;
   private String edtavTipartcodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV63Station ;
   private String AV65EmprNom ;
   private String AV66UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV21BarCodParP ;
   private String AV46SerieP ;
   private String AV25ColorP ;
   private String AV29DispCli3 ;
   private String AV34maqcod3 ;
   private String scmdbuf ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private java.util.Date AV30Fec1 ;
   private java.util.Date AV31Fec2 ;
   private java.util.Date AV32Fec3 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcconsultadesdelconti ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private boolean n606MaqDsc ;
   private String A13788TipArtCodD ;
   private String A13734MaqCDsc ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcconsultadesdelconti ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_pclicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_uclicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodi ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcodf ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV44ProgressIndicator ;
   private HTMLChoice cmbavHreracab ;
   private ICheckbox chkavSoload ;
   private ICheckbox chkavCoradi ;
   private IDataStoreProvider pr_default ;
   private String[] H01XF2_A396EmprCod ;
   private String[] H01XF2_A13788TipArtCodD ;
   private short[] H01XF2_A829TipArtCod ;
   private String[] H01XF2_A830TipArtDsc ;
   private boolean[] H01XF2_n830TipArtDsc ;
   private String[] H01XF2_A6014TipArtDsc2 ;
   private boolean[] H01XF2_n6014TipArtDsc2 ;
   private String[] H01XF3_A396EmprCod ;
   private String[] H01XF3_A13788TipArtCodD ;
   private short[] H01XF3_A829TipArtCod ;
   private String[] H01XF3_A830TipArtDsc ;
   private boolean[] H01XF3_n830TipArtDsc ;
   private String[] H01XF3_A6014TipArtDsc2 ;
   private boolean[] H01XF3_n6014TipArtDsc2 ;
   private String[] H01XF4_A396EmprCod ;
   private String[] H01XF4_A13734MaqCDsc ;
   private String[] H01XF4_A602MaqCod ;
   private String[] H01XF4_A606MaqDsc ;
   private boolean[] H01XF4_n606MaqDsc ;
   private String[] H01XF5_A396EmprCod ;
   private String[] H01XF5_A13734MaqCDsc ;
   private String[] H01XF5_A602MaqCod ;
   private String[] H01XF5_A606MaqDsc ;
   private boolean[] H01XF5_n606MaqDsc ;
   private String[] H01XF6_A396EmprCod ;
   private String[] H01XF6_A10045CliAct ;
   private String[] H01XF6_A13735CliCNom ;
   private int[] H01XF6_A252CliCod ;
   private String[] H01XF6_A279CliNom ;
   private String[] H01XF7_A396EmprCod ;
   private String[] H01XF7_A10045CliAct ;
   private String[] H01XF7_A13735CliCNom ;
   private int[] H01XF7_A252CliCod ;
   private String[] H01XF7_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41PCliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV59UCliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV71MaqCodi_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV72MaqCodf_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV68TipArtCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV70TipArtCodto_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV69Combo_DataItem ;
}

final  class consultadesdelconti_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XF2", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XF3", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XF4", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XF5", "SELECT EmprCod, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, MaqCod, MaqDsc FROM TXPMAQUIN ORDER BY MaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XF6", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XF7", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

