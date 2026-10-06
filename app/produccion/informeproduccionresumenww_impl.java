package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenww_impl extends GXDataArea
{
   public informeproduccionresumenww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenww_impl.class ));
   }

   public informeproduccionresumenww_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisestreo = new HTMLChoice();
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
      pa1YF2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1YF2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPMAQCOD_DATA", AV44TipMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPMAQCOD_DATA", AV44TipMaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPOPER_DATA", AV41Poper_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPOPER_DATA", AV41Poper_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUOPER_DATA", AV42Uoper_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUOPER_DATA", AV42Uoper_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV13DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD1_DATA", AV12MaqCod1_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD1_DATA", AV12MaqCod1_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD2_DATA", AV15MaqCod2_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD2_DATA", AV15MaqCod2_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLASS", AV32Class);
      app.GxWebStd.gx_hidden_field( httpContext, "vSHOWWITHTITLE", AV31ShowWithtitle);
      app.GxWebStd.gx_hidden_field( httpContext, "vHIDDEN", GXutil.ltrim( localUtil.ntoc( AV33Hidden, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALUE", GXutil.ltrim( localUtil.ntoc( AV29Value, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTYPE", GXutil.ltrim( localUtil.ntoc( AV28Type, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTFINAL", localUtil.ttoc( AV34HisProdtFinal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTINICIAL", localUtil.ttoc( AV35HisProdtInicial, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA_HORA", AV36Fecha_hora);
      app.GxWebStd.gx_hidden_field( httpContext, "vUOPER2", GXutil.ltrim( localUtil.ntoc( AV47Uoper2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODTO", GXutil.rtrim( AV46maqcodto));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODFROM", GXutil.rtrim( AV45maqcodfrom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Cls", GXutil.rtrim( Combo_tipmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Emptyitem", GXutil.booltostr( Combo_tipmaqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_POPER_Cls", GXutil.rtrim( Combo_poper_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_POPER_Selectedvalue_set", GXutil.rtrim( Combo_poper_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_POPER_Emptyitem", GXutil.booltostr( Combo_poper_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UOPER_Cls", GXutil.rtrim( Combo_uoper_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UOPER_Selectedvalue_set", GXutil.rtrim( Combo_uoper_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UOPER_Emptyitem", GXutil.booltostr( Combo_uoper_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD1_Cls", GXutil.rtrim( Combo_maqcod1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD1_Selectedvalue_set", GXutil.rtrim( Combo_maqcod1_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD1_Emptyitemtext", GXutil.rtrim( Combo_maqcod1_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD2_Cls", GXutil.rtrim( Combo_maqcod2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD2_Selectedvalue_set", GXutil.rtrim( Combo_maqcod2_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD2_Emptyitemtext", GXutil.rtrim( Combo_maqcod2_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Width", GXutil.rtrim( Dvpanel_panelresultadomaquina_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Autowidth", GXutil.booltostr( Dvpanel_panelresultadomaquina_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Autoheight", GXutil.booltostr( Dvpanel_panelresultadomaquina_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Cls", GXutil.rtrim( Dvpanel_panelresultadomaquina_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Title", GXutil.rtrim( Dvpanel_panelresultadomaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Collapsible", GXutil.booltostr( Dvpanel_panelresultadomaquina_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Collapsed", GXutil.booltostr( Dvpanel_panelresultadomaquina_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadomaquina_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Iconposition", GXutil.rtrim( Dvpanel_panelresultadomaquina_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOMAQUINA_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadomaquina_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Width", GXutil.rtrim( Dvpanel_panelresultadotipoarticulo_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Autowidth", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Autoheight", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Cls", GXutil.rtrim( Dvpanel_panelresultadotipoarticulo_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Title", GXutil.rtrim( Dvpanel_panelresultadotipoarticulo_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Collapsible", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Collapsed", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Iconposition", GXutil.rtrim( Dvpanel_panelresultadotipoarticulo_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOARTICULO_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadotipoarticulo_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Width", GXutil.rtrim( Dvpanel_panelresultadooperario_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Autowidth", GXutil.booltostr( Dvpanel_panelresultadooperario_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Autoheight", GXutil.booltostr( Dvpanel_panelresultadooperario_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Cls", GXutil.rtrim( Dvpanel_panelresultadooperario_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Title", GXutil.rtrim( Dvpanel_panelresultadooperario_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Collapsible", GXutil.booltostr( Dvpanel_panelresultadooperario_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Collapsed", GXutil.booltostr( Dvpanel_panelresultadooperario_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadooperario_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Iconposition", GXutil.rtrim( Dvpanel_panelresultadooperario_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOOPERARIO_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadooperario_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Width", GXutil.rtrim( Dvpanel_panelresultadotipocolor_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Autowidth", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Autoheight", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Cls", GXutil.rtrim( Dvpanel_panelresultadotipocolor_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Title", GXutil.rtrim( Dvpanel_panelresultadotipocolor_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Collapsible", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Collapsed", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Iconposition", GXutil.rtrim( Dvpanel_panelresultadotipocolor_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTIPOCOLOR_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadotipocolor_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Width", GXutil.rtrim( Dvpanel_panelresultadofase_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Autowidth", GXutil.booltostr( Dvpanel_panelresultadofase_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Autoheight", GXutil.booltostr( Dvpanel_panelresultadofase_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Cls", GXutil.rtrim( Dvpanel_panelresultadofase_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Title", GXutil.rtrim( Dvpanel_panelresultadofase_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Collapsible", GXutil.booltostr( Dvpanel_panelresultadofase_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Collapsed", GXutil.booltostr( Dvpanel_panelresultadofase_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadofase_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Iconposition", GXutil.rtrim( Dvpanel_panelresultadofase_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOFASE_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadofase_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Width", GXutil.rtrim( Dvpanel_panelresultadoturno_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Autowidth", GXutil.booltostr( Dvpanel_panelresultadoturno_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Autoheight", GXutil.booltostr( Dvpanel_panelresultadoturno_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Cls", GXutil.rtrim( Dvpanel_panelresultadoturno_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Title", GXutil.rtrim( Dvpanel_panelresultadoturno_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Collapsible", GXutil.booltostr( Dvpanel_panelresultadoturno_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Collapsed", GXutil.booltostr( Dvpanel_panelresultadoturno_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadoturno_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Iconposition", GXutil.rtrim( Dvpanel_panelresultadoturno_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOTURNO_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadoturno_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Width", GXutil.rtrim( Dvpanel_panelresultadohdr_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Autowidth", GXutil.booltostr( Dvpanel_panelresultadohdr_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Autoheight", GXutil.booltostr( Dvpanel_panelresultadohdr_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Cls", GXutil.rtrim( Dvpanel_panelresultadohdr_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Title", GXutil.rtrim( Dvpanel_panelresultadohdr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Collapsible", GXutil.booltostr( Dvpanel_panelresultadohdr_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Collapsed", GXutil.booltostr( Dvpanel_panelresultadohdr_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultadohdr_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Iconposition", GXutil.rtrim( Dvpanel_panelresultadohdr_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOHDR_Autoscroll", GXutil.booltostr( Dvpanel_panelresultadohdr_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD2_Selectedvalue_get", GXutil.rtrim( Combo_maqcod2_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD1_Selectedvalue_get", GXutil.rtrim( Combo_maqcod1_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_UOPER_Selectedvalue_get", GXutil.rtrim( Combo_uoper_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_POPER_Selectedvalue_get", GXutil.rtrim( Combo_poper_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPMAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipmaqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS_Activepagecontrolname", GXutil.rtrim( Gxuitabspanel_tabs_Activepagecontrolname));
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
      if ( ! ( WebComp_Wc_informeproduccionresumenmaquina == null ) )
      {
         WebComp_Wc_informeproduccionresumenmaquina.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumentipoarticulo == null ) )
      {
         WebComp_Wc_informeproduccionresumentipoarticulo.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenoperario == null ) )
      {
         WebComp_Wc_informeproduccionresumenoperario.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumentipocolorante == null ) )
      {
         WebComp_Wc_informeproduccionresumentipocolorante.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenfase == null ) )
      {
         WebComp_Wc_informeproduccionresumenfase.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenturno == null ) )
      {
         WebComp_Wc_informeproduccionresumenturno.componentjscripts();
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenhdr == null ) )
      {
         WebComp_Wc_informeproduccionresumenhdr.componentjscripts();
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
         we1YF2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1YF2( ) ;
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
      return formatLink("app.produccion.informeproduccionresumenww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.InformeProduccionResumenWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen (DataTime)", "") ;
   }

   public void wb1YF0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisestreo.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisestreo, cmbavHisestreo.getInternalname(), GXutil.trim( GXutil.str( AV11HisEstReo, 4, 0)), 1, cmbavHisestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV11HisEstReo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipmaqcod_Internalname, httpContext.getMessage( "Tipo de Máquina", ""), "", "", lblTextblockcombo_tipmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipmaqcod.setProperty("Caption", Combo_tipmaqcod_Caption);
         ucCombo_tipmaqcod.setProperty("Cls", Combo_tipmaqcod_Cls);
         ucCombo_tipmaqcod.setProperty("EmptyItem", Combo_tipmaqcod_Emptyitem);
         ucCombo_tipmaqcod.setProperty("DropDownOptionsData", AV44TipMaqCod_Data);
         ucCombo_tipmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipmaqcod_Internalname, "COMBO_TIPMAQCODContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedpoper_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_poper_Internalname, httpContext.getMessage( "Primeiro Operario", ""), "", "", lblTextblockcombo_poper_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_poper.setProperty("Caption", Combo_poper_Caption);
         ucCombo_poper.setProperty("Cls", Combo_poper_Cls);
         ucCombo_poper.setProperty("EmptyItem", Combo_poper_Emptyitem);
         ucCombo_poper.setProperty("DropDownOptionsData", AV41Poper_Data);
         ucCombo_poper.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_poper_Internalname, "COMBO_POPERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplitteduoper_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_uoper_Internalname, httpContext.getMessage( "Ultimo Operario", ""), "", "", lblTextblockcombo_uoper_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_uoper.setProperty("Caption", Combo_uoper_Caption);
         ucCombo_uoper.setProperty("Cls", Combo_uoper_Cls);
         ucCombo_uoper.setProperty("EmptyItem", Combo_uoper_Emptyitem);
         ucCombo_uoper.setProperty("DropDownOptionsData", AV42Uoper_Data);
         ucCombo_uoper.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_uoper_Internalname, "COMBO_UOPERContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemaq_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod1_Internalname, httpContext.getMessage( "Máquina desde", ""), "", "", lblTextblockcombo_maqcod1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod1.setProperty("Caption", Combo_maqcod1_Caption);
         ucCombo_maqcod1.setProperty("Cls", Combo_maqcod1_Cls);
         ucCombo_maqcod1.setProperty("EmptyItemText", Combo_maqcod1_Emptyitemtext);
         ucCombo_maqcod1.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_maqcod1.setProperty("DropDownOptionsData", AV12MaqCod1_Data);
         ucCombo_maqcod1.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod1_Internalname, "COMBO_MAQCOD1Container");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod2_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod2_Internalname, httpContext.getMessage( "hasta ", ""), "", "", lblTextblockcombo_maqcod2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod2.setProperty("Caption", Combo_maqcod2_Caption);
         ucCombo_maqcod2.setProperty("Cls", Combo_maqcod2_Cls);
         ucCombo_maqcod2.setProperty("EmptyItemText", Combo_maqcod2_Emptyitemtext);
         ucCombo_maqcod2.setProperty("DropDownOptionsTitleSettingsIcons", AV13DDO_TitleSettingsIcons);
         ucCombo_maqcod2.setProperty("DropDownOptionsData", AV15MaqCod2_Data);
         ucCombo_maqcod2.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod2_Internalname, "COMBO_MAQCOD2Container");
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
         app.GxWebStd.gx_div_start( httpContext, divTabledate_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprofec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprofec1_Internalname, httpContext.getMessage( "Periodo desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprofec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprofec1_Internalname, localUtil.format(AV5HisProFec1, "99/99/99"), localUtil.format( AV5HisProFec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprofec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprofec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprofec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprofec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHorai_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHorai_Internalname, httpContext.getMessage( "hora desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHorai_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHorai_Internalname, localUtil.ttoc( AV6HoraI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV6HoraI, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHorai_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHorai_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHorai_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHorai_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprofec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprofec2_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprofec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprofec2_Internalname, localUtil.format(AV7HisProFec2, "99/99/99"), localUtil.format( AV7HisProFec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,92);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprofec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprofec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprofec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprofec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHoraf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHoraf_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHoraf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHoraf_Internalname, localUtil.ttoc( AV8HoraF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV8HoraF, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHoraf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHoraf_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHoraf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHoraf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar (Resultados)", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableuc_datamon_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, divPanel_resultado_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablebarprogress_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Datos p/Maquina y Tipo Articulo", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadomaquina.setProperty("Width", Dvpanel_panelresultadomaquina_Width);
         ucDvpanel_panelresultadomaquina.setProperty("AutoWidth", Dvpanel_panelresultadomaquina_Autowidth);
         ucDvpanel_panelresultadomaquina.setProperty("AutoHeight", Dvpanel_panelresultadomaquina_Autoheight);
         ucDvpanel_panelresultadomaquina.setProperty("Cls", Dvpanel_panelresultadomaquina_Cls);
         ucDvpanel_panelresultadomaquina.setProperty("Title", Dvpanel_panelresultadomaquina_Title);
         ucDvpanel_panelresultadomaquina.setProperty("Collapsible", Dvpanel_panelresultadomaquina_Collapsible);
         ucDvpanel_panelresultadomaquina.setProperty("Collapsed", Dvpanel_panelresultadomaquina_Collapsed);
         ucDvpanel_panelresultadomaquina.setProperty("ShowCollapseIcon", Dvpanel_panelresultadomaquina_Showcollapseicon);
         ucDvpanel_panelresultadomaquina.setProperty("IconPosition", Dvpanel_panelresultadomaquina_Iconposition);
         ucDvpanel_panelresultadomaquina.setProperty("AutoScroll", Dvpanel_panelresultadomaquina_Autoscroll);
         ucDvpanel_panelresultadomaquina.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadomaquina_Internalname, "DVPANEL_PANELRESULTADOMAQUINAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOMAQUINAContainer"+"PanelResultadoMaquina"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadomaquina_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0142"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumenmaquina_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0142"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenmaquina), GXutil.lower( WebComp_Wc_informeproduccionresumenmaquina_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0142"+"");
               }
               WebComp_Wc_informeproduccionresumenmaquina.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenmaquina), GXutil.lower( WebComp_Wc_informeproduccionresumenmaquina_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadotipoarticulo.setProperty("Width", Dvpanel_panelresultadotipoarticulo_Width);
         ucDvpanel_panelresultadotipoarticulo.setProperty("AutoWidth", Dvpanel_panelresultadotipoarticulo_Autowidth);
         ucDvpanel_panelresultadotipoarticulo.setProperty("AutoHeight", Dvpanel_panelresultadotipoarticulo_Autoheight);
         ucDvpanel_panelresultadotipoarticulo.setProperty("Cls", Dvpanel_panelresultadotipoarticulo_Cls);
         ucDvpanel_panelresultadotipoarticulo.setProperty("Title", Dvpanel_panelresultadotipoarticulo_Title);
         ucDvpanel_panelresultadotipoarticulo.setProperty("Collapsible", Dvpanel_panelresultadotipoarticulo_Collapsible);
         ucDvpanel_panelresultadotipoarticulo.setProperty("Collapsed", Dvpanel_panelresultadotipoarticulo_Collapsed);
         ucDvpanel_panelresultadotipoarticulo.setProperty("ShowCollapseIcon", Dvpanel_panelresultadotipoarticulo_Showcollapseicon);
         ucDvpanel_panelresultadotipoarticulo.setProperty("IconPosition", Dvpanel_panelresultadotipoarticulo_Iconposition);
         ucDvpanel_panelresultadotipoarticulo.setProperty("AutoScroll", Dvpanel_panelresultadotipoarticulo_Autoscroll);
         ucDvpanel_panelresultadotipoarticulo.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadotipoarticulo_Internalname, "DVPANEL_PANELRESULTADOTIPOARTICULOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOTIPOARTICULOContainer"+"PanelResultadoTipoArticulo"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadotipoarticulo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0149"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumentipoarticulo_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0149"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumentipoarticulo), GXutil.lower( WebComp_Wc_informeproduccionresumentipoarticulo_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0149"+"");
               }
               WebComp_Wc_informeproduccionresumentipoarticulo.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumentipoarticulo), GXutil.lower( WebComp_Wc_informeproduccionresumentipoarticulo_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Datos p/Operario y Tipo Colorante", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadooperario.setProperty("Width", Dvpanel_panelresultadooperario_Width);
         ucDvpanel_panelresultadooperario.setProperty("AutoWidth", Dvpanel_panelresultadooperario_Autowidth);
         ucDvpanel_panelresultadooperario.setProperty("AutoHeight", Dvpanel_panelresultadooperario_Autoheight);
         ucDvpanel_panelresultadooperario.setProperty("Cls", Dvpanel_panelresultadooperario_Cls);
         ucDvpanel_panelresultadooperario.setProperty("Title", Dvpanel_panelresultadooperario_Title);
         ucDvpanel_panelresultadooperario.setProperty("Collapsible", Dvpanel_panelresultadooperario_Collapsible);
         ucDvpanel_panelresultadooperario.setProperty("Collapsed", Dvpanel_panelresultadooperario_Collapsed);
         ucDvpanel_panelresultadooperario.setProperty("ShowCollapseIcon", Dvpanel_panelresultadooperario_Showcollapseicon);
         ucDvpanel_panelresultadooperario.setProperty("IconPosition", Dvpanel_panelresultadooperario_Iconposition);
         ucDvpanel_panelresultadooperario.setProperty("AutoScroll", Dvpanel_panelresultadooperario_Autoscroll);
         ucDvpanel_panelresultadooperario.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadooperario_Internalname, "DVPANEL_PANELRESULTADOOPERARIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOOPERARIOContainer"+"PanelResultadoOperario"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadooperario_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0162"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumenoperario_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0162"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenoperario_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenoperario), GXutil.lower( WebComp_Wc_informeproduccionresumenoperario_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0162"+"");
               }
               WebComp_Wc_informeproduccionresumenoperario.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenoperario), GXutil.lower( WebComp_Wc_informeproduccionresumenoperario_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadotipocolor.setProperty("Width", Dvpanel_panelresultadotipocolor_Width);
         ucDvpanel_panelresultadotipocolor.setProperty("AutoWidth", Dvpanel_panelresultadotipocolor_Autowidth);
         ucDvpanel_panelresultadotipocolor.setProperty("AutoHeight", Dvpanel_panelresultadotipocolor_Autoheight);
         ucDvpanel_panelresultadotipocolor.setProperty("Cls", Dvpanel_panelresultadotipocolor_Cls);
         ucDvpanel_panelresultadotipocolor.setProperty("Title", Dvpanel_panelresultadotipocolor_Title);
         ucDvpanel_panelresultadotipocolor.setProperty("Collapsible", Dvpanel_panelresultadotipocolor_Collapsible);
         ucDvpanel_panelresultadotipocolor.setProperty("Collapsed", Dvpanel_panelresultadotipocolor_Collapsed);
         ucDvpanel_panelresultadotipocolor.setProperty("ShowCollapseIcon", Dvpanel_panelresultadotipocolor_Showcollapseicon);
         ucDvpanel_panelresultadotipocolor.setProperty("IconPosition", Dvpanel_panelresultadotipocolor_Iconposition);
         ucDvpanel_panelresultadotipocolor.setProperty("AutoScroll", Dvpanel_panelresultadotipocolor_Autoscroll);
         ucDvpanel_panelresultadotipocolor.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadotipocolor_Internalname, "DVPANEL_PANELRESULTADOTIPOCOLORContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOTIPOCOLORContainer"+"PanelResultadoTipoColor"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadotipocolor_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0169"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumentipocolorante_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0169"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumentipocolorante_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumentipocolorante), GXutil.lower( WebComp_Wc_informeproduccionresumentipocolorante_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0169"+"");
               }
               WebComp_Wc_informeproduccionresumentipocolorante.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumentipocolorante), GXutil.lower( WebComp_Wc_informeproduccionresumentipocolorante_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab03_title_Internalname, httpContext.getMessage( "Datos p/Fase y Turno", ""), "", "", lblTab03_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab03") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadofase.setProperty("Width", Dvpanel_panelresultadofase_Width);
         ucDvpanel_panelresultadofase.setProperty("AutoWidth", Dvpanel_panelresultadofase_Autowidth);
         ucDvpanel_panelresultadofase.setProperty("AutoHeight", Dvpanel_panelresultadofase_Autoheight);
         ucDvpanel_panelresultadofase.setProperty("Cls", Dvpanel_panelresultadofase_Cls);
         ucDvpanel_panelresultadofase.setProperty("Title", Dvpanel_panelresultadofase_Title);
         ucDvpanel_panelresultadofase.setProperty("Collapsible", Dvpanel_panelresultadofase_Collapsible);
         ucDvpanel_panelresultadofase.setProperty("Collapsed", Dvpanel_panelresultadofase_Collapsed);
         ucDvpanel_panelresultadofase.setProperty("ShowCollapseIcon", Dvpanel_panelresultadofase_Showcollapseicon);
         ucDvpanel_panelresultadofase.setProperty("IconPosition", Dvpanel_panelresultadofase_Iconposition);
         ucDvpanel_panelresultadofase.setProperty("AutoScroll", Dvpanel_panelresultadofase_Autoscroll);
         ucDvpanel_panelresultadofase.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadofase_Internalname, "DVPANEL_PANELRESULTADOFASEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOFASEContainer"+"PanelResultadoFase"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadofase_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0182"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumenfase_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0182"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenfase_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenfase), GXutil.lower( WebComp_Wc_informeproduccionresumenfase_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0182"+"");
               }
               WebComp_Wc_informeproduccionresumenfase.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenfase), GXutil.lower( WebComp_Wc_informeproduccionresumenfase_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadoturno.setProperty("Width", Dvpanel_panelresultadoturno_Width);
         ucDvpanel_panelresultadoturno.setProperty("AutoWidth", Dvpanel_panelresultadoturno_Autowidth);
         ucDvpanel_panelresultadoturno.setProperty("AutoHeight", Dvpanel_panelresultadoturno_Autoheight);
         ucDvpanel_panelresultadoturno.setProperty("Cls", Dvpanel_panelresultadoturno_Cls);
         ucDvpanel_panelresultadoturno.setProperty("Title", Dvpanel_panelresultadoturno_Title);
         ucDvpanel_panelresultadoturno.setProperty("Collapsible", Dvpanel_panelresultadoturno_Collapsible);
         ucDvpanel_panelresultadoturno.setProperty("Collapsed", Dvpanel_panelresultadoturno_Collapsed);
         ucDvpanel_panelresultadoturno.setProperty("ShowCollapseIcon", Dvpanel_panelresultadoturno_Showcollapseicon);
         ucDvpanel_panelresultadoturno.setProperty("IconPosition", Dvpanel_panelresultadoturno_Iconposition);
         ucDvpanel_panelresultadoturno.setProperty("AutoScroll", Dvpanel_panelresultadoturno_Autoscroll);
         ucDvpanel_panelresultadoturno.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadoturno_Internalname, "DVPANEL_PANELRESULTADOTURNOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOTURNOContainer"+"PanelResultadoTurno"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadoturno_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0189"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumenturno_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0189"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenturno_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenturno), GXutil.lower( WebComp_Wc_informeproduccionresumenturno_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0189"+"");
               }
               WebComp_Wc_informeproduccionresumenturno.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenturno), GXutil.lower( WebComp_Wc_informeproduccionresumenturno_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title4"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab04_title_Internalname, httpContext.getMessage( "Datos p/Hdr", ""), "", "", lblTab04_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab04") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel4"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultadohdr.setProperty("Width", Dvpanel_panelresultadohdr_Width);
         ucDvpanel_panelresultadohdr.setProperty("AutoWidth", Dvpanel_panelresultadohdr_Autowidth);
         ucDvpanel_panelresultadohdr.setProperty("AutoHeight", Dvpanel_panelresultadohdr_Autoheight);
         ucDvpanel_panelresultadohdr.setProperty("Cls", Dvpanel_panelresultadohdr_Cls);
         ucDvpanel_panelresultadohdr.setProperty("Title", Dvpanel_panelresultadohdr_Title);
         ucDvpanel_panelresultadohdr.setProperty("Collapsible", Dvpanel_panelresultadohdr_Collapsible);
         ucDvpanel_panelresultadohdr.setProperty("Collapsed", Dvpanel_panelresultadohdr_Collapsed);
         ucDvpanel_panelresultadohdr.setProperty("ShowCollapseIcon", Dvpanel_panelresultadohdr_Showcollapseicon);
         ucDvpanel_panelresultadohdr.setProperty("IconPosition", Dvpanel_panelresultadohdr_Iconposition);
         ucDvpanel_panelresultadohdr.setProperty("AutoScroll", Dvpanel_panelresultadohdr_Autoscroll);
         ucDvpanel_panelresultadohdr.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultadohdr_Internalname, "DVPANEL_PANELRESULTADOHDRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOHDRContainer"+"PanelResultadoHdr"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultadohdr_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0202"+"", GXutil.rtrim( WebComp_Wc_informeproduccionresumenhdr_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0202"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenhdr_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenhdr), GXutil.lower( WebComp_Wc_informeproduccionresumenhdr_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0202"+"");
               }
               WebComp_Wc_informeproduccionresumenhdr.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWc_informeproduccionresumenhdr), GXutil.lower( WebComp_Wc_informeproduccionresumenhdr_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV50Pgmname), GXutil.rtrim( localUtil.format( AV50Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmaqcod_Internalname, GXutil.rtrim( AV43TipMaqCod), GXutil.rtrim( localUtil.format( AV43TipMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,213);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipmaqcod_Visible, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPoper_Internalname, GXutil.ltrim( localUtil.ntoc( AV39Poper, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV39Poper), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPoper_Jsonclick, 0, "Attribute", "", "", "", "", edtavPoper_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUoper_Internalname, GXutil.ltrim( localUtil.ntoc( AV40Uoper, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40Uoper), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUoper_Jsonclick, 0, "Attribute", "", "", "", "", edtavUoper_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod1_Internalname, GXutil.rtrim( AV9MaqCod1), GXutil.rtrim( localUtil.format( AV9MaqCod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod1_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod1_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod2_Internalname, GXutil.rtrim( AV10MaqCod2), GXutil.rtrim( localUtil.format( AV10MaqCod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod2_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod2_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1YF2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen (DataTime)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1YF0( ) ;
   }

   public void ws1YF2( )
   {
      start1YF2( ) ;
      evt1YF2( ) ;
   }

   public void evt1YF2( )
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
                           e111YF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e121YF2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.PROGRESSBAR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131YF2 ();
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
                                 e141YF2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151YF2 ();
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
                     if ( nCmpId == 142 )
                     {
                        OldWc_informeproduccionresumenmaquina = httpContext.cgiGet( "W0142") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumenmaquina) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumenmaquina, WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumenmaquina = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumenmaquina + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumenmaquina_Component = OldWc_informeproduccionresumenmaquina ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumenmaquina.componentprocess("W0142", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumenmaquina_Component = OldWc_informeproduccionresumenmaquina ;
                     }
                     else if ( nCmpId == 149 )
                     {
                        OldWc_informeproduccionresumentipoarticulo = httpContext.cgiGet( "W0149") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumentipoarticulo) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumentipoarticulo, WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumentipoarticulo = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumentipoarticulo + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumentipoarticulo_Component = OldWc_informeproduccionresumentipoarticulo ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumentipoarticulo.componentprocess("W0149", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumentipoarticulo_Component = OldWc_informeproduccionresumentipoarticulo ;
                     }
                     else if ( nCmpId == 162 )
                     {
                        OldWc_informeproduccionresumenoperario = httpContext.cgiGet( "W0162") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumenoperario) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumenoperario, WebComp_Wc_informeproduccionresumenoperario_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumenoperario = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumenoperario + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumenoperario_Component = OldWc_informeproduccionresumenoperario ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumenoperario_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumenoperario.componentprocess("W0162", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumenoperario_Component = OldWc_informeproduccionresumenoperario ;
                     }
                     else if ( nCmpId == 169 )
                     {
                        OldWc_informeproduccionresumentipocolorante = httpContext.cgiGet( "W0169") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumentipocolorante) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumentipocolorante, WebComp_Wc_informeproduccionresumentipocolorante_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumentipocolorante = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumentipocolorante + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumentipocolorante_Component = OldWc_informeproduccionresumentipocolorante ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumentipocolorante_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumentipocolorante.componentprocess("W0169", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumentipocolorante_Component = OldWc_informeproduccionresumentipocolorante ;
                     }
                     else if ( nCmpId == 182 )
                     {
                        OldWc_informeproduccionresumenfase = httpContext.cgiGet( "W0182") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumenfase) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumenfase, WebComp_Wc_informeproduccionresumenfase_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumenfase = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumenfase + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumenfase_Component = OldWc_informeproduccionresumenfase ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumenfase_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumenfase.componentprocess("W0182", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumenfase_Component = OldWc_informeproduccionresumenfase ;
                     }
                     else if ( nCmpId == 189 )
                     {
                        OldWc_informeproduccionresumenturno = httpContext.cgiGet( "W0189") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumenturno) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumenturno, WebComp_Wc_informeproduccionresumenturno_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumenturno = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumenturno + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumenturno_Component = OldWc_informeproduccionresumenturno ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumenturno_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumenturno.componentprocess("W0189", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumenturno_Component = OldWc_informeproduccionresumenturno ;
                     }
                     else if ( nCmpId == 202 )
                     {
                        OldWc_informeproduccionresumenhdr = httpContext.cgiGet( "W0202") ;
                        if ( ( GXutil.len( OldWc_informeproduccionresumenhdr) == 0 ) || ( GXutil.strcmp(OldWc_informeproduccionresumenhdr, WebComp_Wc_informeproduccionresumenhdr_Component) != 0 ) )
                        {
                           WebComp_Wc_informeproduccionresumenhdr = WebUtils.getWebComponent(getClass(), "app." + OldWc_informeproduccionresumenhdr + "_impl", remoteHandle, context);
                           WebComp_Wc_informeproduccionresumenhdr_Component = OldWc_informeproduccionresumenhdr ;
                        }
                        if ( GXutil.len( WebComp_Wc_informeproduccionresumenhdr_Component) != 0 )
                        {
                           WebComp_Wc_informeproduccionresumenhdr.componentprocess("W0202", "", sEvt);
                        }
                        WebComp_Wc_informeproduccionresumenhdr_Component = OldWc_informeproduccionresumenhdr ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1YF2( )
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

   public void pa1YF2( )
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
            GX_FocusControl = cmbavHisestreo.getInternalname() ;
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
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV11HisEstReo = (short)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV11HisEstReo, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HisEstReo), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV11HisEstReo, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1YF2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV50Pgmname = "Produccion.InformeProduccionResumenWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1YF2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumenmaquina.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumentipoarticulo.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenoperario_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumenoperario.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumentipocolorante_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumentipocolorante.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenfase_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumenfase.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenturno_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumenturno.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wc_informeproduccionresumenhdr_Component) != 0 )
            {
               WebComp_Wc_informeproduccionresumenhdr.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151YF2 ();
         wb1YF0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1YF2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV50Pgmname = "Produccion.InformeProduccionResumenWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YF0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111YF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPMAQCOD_DATA"), AV44TipMaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPOPER_DATA"), AV41Poper_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUOPER_DATA"), AV42Uoper_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV13DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD1_DATA"), AV12MaqCod1_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD2_DATA"), AV15MaqCod2_Data);
         /* Read saved values. */
         AV17EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV34HisProdtFinal = localUtil.ctot( httpContext.cgiGet( "vHISPRODTFINAL"), 0) ;
         AV35HisProdtInicial = localUtil.ctot( httpContext.cgiGet( "vHISPRODTINICIAL"), 0) ;
         AV36Fecha_hora = httpContext.cgiGet( "vFECHA_HORA") ;
         AV47Uoper2 = (int)(localUtil.ctol( httpContext.cgiGet( "vUOPER2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46maqcodto = httpContext.cgiGet( "vMAQCODTO") ;
         AV45maqcodfrom = httpContext.cgiGet( "vMAQCODFROM") ;
         Combo_tipmaqcod_Cls = httpContext.cgiGet( "COMBO_TIPMAQCOD_Cls") ;
         Combo_tipmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPMAQCOD_Selectedvalue_set") ;
         Combo_tipmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPMAQCOD_Emptyitem")) ;
         Combo_poper_Cls = httpContext.cgiGet( "COMBO_POPER_Cls") ;
         Combo_poper_Selectedvalue_set = httpContext.cgiGet( "COMBO_POPER_Selectedvalue_set") ;
         Combo_poper_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_POPER_Emptyitem")) ;
         Combo_uoper_Cls = httpContext.cgiGet( "COMBO_UOPER_Cls") ;
         Combo_uoper_Selectedvalue_set = httpContext.cgiGet( "COMBO_UOPER_Selectedvalue_set") ;
         Combo_uoper_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_UOPER_Emptyitem")) ;
         Combo_maqcod1_Cls = httpContext.cgiGet( "COMBO_MAQCOD1_Cls") ;
         Combo_maqcod1_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD1_Selectedvalue_set") ;
         Combo_maqcod1_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD1_Emptyitemtext") ;
         Combo_maqcod2_Cls = httpContext.cgiGet( "COMBO_MAQCOD2_Cls") ;
         Combo_maqcod2_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD2_Selectedvalue_set") ;
         Combo_maqcod2_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD2_Emptyitemtext") ;
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
         Dvpanel_panelresultadomaquina_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Width") ;
         Dvpanel_panelresultadomaquina_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Autowidth")) ;
         Dvpanel_panelresultadomaquina_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Autoheight")) ;
         Dvpanel_panelresultadomaquina_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Cls") ;
         Dvpanel_panelresultadomaquina_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Title") ;
         Dvpanel_panelresultadomaquina_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Collapsible")) ;
         Dvpanel_panelresultadomaquina_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Collapsed")) ;
         Dvpanel_panelresultadomaquina_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Showcollapseicon")) ;
         Dvpanel_panelresultadomaquina_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Iconposition") ;
         Dvpanel_panelresultadomaquina_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOMAQUINA_Autoscroll")) ;
         Dvpanel_panelresultadotipoarticulo_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Width") ;
         Dvpanel_panelresultadotipoarticulo_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Autowidth")) ;
         Dvpanel_panelresultadotipoarticulo_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Autoheight")) ;
         Dvpanel_panelresultadotipoarticulo_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Cls") ;
         Dvpanel_panelresultadotipoarticulo_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Title") ;
         Dvpanel_panelresultadotipoarticulo_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Collapsible")) ;
         Dvpanel_panelresultadotipoarticulo_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Collapsed")) ;
         Dvpanel_panelresultadotipoarticulo_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Showcollapseicon")) ;
         Dvpanel_panelresultadotipoarticulo_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Iconposition") ;
         Dvpanel_panelresultadotipoarticulo_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOARTICULO_Autoscroll")) ;
         Dvpanel_panelresultadooperario_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Width") ;
         Dvpanel_panelresultadooperario_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Autowidth")) ;
         Dvpanel_panelresultadooperario_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Autoheight")) ;
         Dvpanel_panelresultadooperario_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Cls") ;
         Dvpanel_panelresultadooperario_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Title") ;
         Dvpanel_panelresultadooperario_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Collapsible")) ;
         Dvpanel_panelresultadooperario_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Collapsed")) ;
         Dvpanel_panelresultadooperario_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Showcollapseicon")) ;
         Dvpanel_panelresultadooperario_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Iconposition") ;
         Dvpanel_panelresultadooperario_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOOPERARIO_Autoscroll")) ;
         Dvpanel_panelresultadotipocolor_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Width") ;
         Dvpanel_panelresultadotipocolor_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Autowidth")) ;
         Dvpanel_panelresultadotipocolor_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Autoheight")) ;
         Dvpanel_panelresultadotipocolor_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Cls") ;
         Dvpanel_panelresultadotipocolor_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Title") ;
         Dvpanel_panelresultadotipocolor_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Collapsible")) ;
         Dvpanel_panelresultadotipocolor_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Collapsed")) ;
         Dvpanel_panelresultadotipocolor_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Showcollapseicon")) ;
         Dvpanel_panelresultadotipocolor_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Iconposition") ;
         Dvpanel_panelresultadotipocolor_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTIPOCOLOR_Autoscroll")) ;
         Dvpanel_panelresultadofase_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Width") ;
         Dvpanel_panelresultadofase_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Autowidth")) ;
         Dvpanel_panelresultadofase_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Autoheight")) ;
         Dvpanel_panelresultadofase_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Cls") ;
         Dvpanel_panelresultadofase_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Title") ;
         Dvpanel_panelresultadofase_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Collapsible")) ;
         Dvpanel_panelresultadofase_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Collapsed")) ;
         Dvpanel_panelresultadofase_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Showcollapseicon")) ;
         Dvpanel_panelresultadofase_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Iconposition") ;
         Dvpanel_panelresultadofase_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOFASE_Autoscroll")) ;
         Dvpanel_panelresultadoturno_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Width") ;
         Dvpanel_panelresultadoturno_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Autowidth")) ;
         Dvpanel_panelresultadoturno_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Autoheight")) ;
         Dvpanel_panelresultadoturno_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Cls") ;
         Dvpanel_panelresultadoturno_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Title") ;
         Dvpanel_panelresultadoturno_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Collapsible")) ;
         Dvpanel_panelresultadoturno_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Collapsed")) ;
         Dvpanel_panelresultadoturno_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Showcollapseicon")) ;
         Dvpanel_panelresultadoturno_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Iconposition") ;
         Dvpanel_panelresultadoturno_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOTURNO_Autoscroll")) ;
         Dvpanel_panelresultadohdr_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Width") ;
         Dvpanel_panelresultadohdr_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Autowidth")) ;
         Dvpanel_panelresultadohdr_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Autoheight")) ;
         Dvpanel_panelresultadohdr_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Cls") ;
         Dvpanel_panelresultadohdr_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Title") ;
         Dvpanel_panelresultadohdr_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Collapsible")) ;
         Dvpanel_panelresultadohdr_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Collapsed")) ;
         Dvpanel_panelresultadohdr_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Showcollapseicon")) ;
         Dvpanel_panelresultadohdr_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Iconposition") ;
         Dvpanel_panelresultadohdr_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOHDR_Autoscroll")) ;
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
         cmbavHisestreo.setValue( httpContext.cgiGet( cmbavHisestreo.getInternalname()) );
         AV11HisEstReo = (short)(GXutil.lval( httpContext.cgiGet( cmbavHisestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HisEstReo), 4, 0));
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprofec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISPROFEC1");
            GX_FocusControl = edtavHisprofec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5HisProFec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec1", localUtil.format(AV5HisProFec1, "99/99/99"));
         }
         else
         {
            AV5HisProFec1 = localUtil.ctod( httpContext.cgiGet( edtavHisprofec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5HisProFec1", localUtil.format(AV5HisProFec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHorai_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "vHORAI");
            GX_FocusControl = edtavHorai_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6HoraI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV6HoraI", localUtil.ttoc( AV6HoraI, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV6HoraI = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtavHorai_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6HoraI", localUtil.ttoc( AV6HoraI, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprofec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISPROFEC2");
            GX_FocusControl = edtavHisprofec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7HisProFec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProFec2", localUtil.format(AV7HisProFec2, "99/99/99"));
         }
         else
         {
            AV7HisProFec2 = localUtil.ctod( httpContext.cgiGet( edtavHisprofec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7HisProFec2", localUtil.format(AV7HisProFec2, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHoraf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "vHORAF");
            GX_FocusControl = edtavHoraf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8HoraF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV8HoraF", localUtil.ttoc( AV8HoraF, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV8HoraF = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtavHoraf_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8HoraF", localUtil.ttoc( AV8HoraF, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
         AV43TipMaqCod = httpContext.cgiGet( edtavTipmaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43TipMaqCod", AV43TipMaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPOPER");
            GX_FocusControl = edtavPoper_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39Poper = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Poper", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Poper), 6, 0));
         }
         else
         {
            AV39Poper = (int)(localUtil.ctol( httpContext.cgiGet( edtavPoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Poper", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Poper), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUOPER");
            GX_FocusControl = edtavUoper_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40Uoper = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Uoper", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Uoper), 6, 0));
         }
         else
         {
            AV40Uoper = (int)(localUtil.ctol( httpContext.cgiGet( edtavUoper_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Uoper", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Uoper), 6, 0));
         }
         AV9MaqCod1 = httpContext.cgiGet( edtavMaqcod1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod1", AV9MaqCod1);
         AV10MaqCod2 = httpContext.cgiGet( edtavMaqcod2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10MaqCod2", AV10MaqCod2);
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
      e111YF2 ();
      if (returnInSub) return;
   }

   public void e111YF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      divPanel_resultado_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divPanel_resultado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanel_resultado_Visible), 5, 0), true);
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      GXv_char2[0] = AV17EmprCod ;
      GXv_char3[0] = AV18EmprNom ;
      GXv_char4[0] = AV19UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenww_impl.this.AV17EmprCod = GXv_char2[0] ;
      informeproduccionresumenww_impl.this.AV18EmprNom = GXv_char3[0] ;
      informeproduccionresumenww_impl.this.AV19UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV13DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV13DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcod2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod2_Visible), 5, 0), true);
      edtavMaqcod1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod1_Visible), 5, 0), true);
      edtavUoper_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUoper_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUoper_Visible), 5, 0), true);
      edtavPoper_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPoper_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPoper_Visible), 5, 0), true);
      edtavTipmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTIPMAQCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPOPER' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOUOPER' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD1' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD2' */
      S152 ();
      if (returnInSub) return;
      AV11HisEstReo = (short)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HisEstReo), 4, 0));
      GXt_int7 = AV22Grulec ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int8) ;
      informeproduccionresumenww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV22Grulec = GXt_int7 ;
      GXt_int7 = AV23lecotex ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV17EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int8) ;
      informeproduccionresumenww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV23lecotex = GXt_int7 ;
      GXt_char1 = AV20Hhmmss_i ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTI", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      informeproduccionresumenww_impl.this.AV17EmprCod = GXv_char4[0] ;
      informeproduccionresumenww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      AV20Hhmmss_i = GXt_char1 ;
      AV20Hhmmss_i = ((GXutil.strcmp("", AV20Hhmmss_i)==0) ? "06:00:00" : AV20Hhmmss_i) ;
      GXt_char1 = AV21Hhmmss_f ;
      GXv_char4[0] = AV17EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTF", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      informeproduccionresumenww_impl.this.AV17EmprCod = GXv_char4[0] ;
      informeproduccionresumenww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17EmprCod", AV17EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17EmprCod, "@!"))));
      AV21Hhmmss_f = GXt_char1 ;
      AV21Hhmmss_f = ((GXutil.strcmp("", AV21Hhmmss_f)==0) ? "05:59:00" : AV21Hhmmss_f) ;
      AV6HoraI = GXutil.resetDate(localUtil.ctot( AV20Hhmmss_i, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6HoraI", localUtil.ttoc( AV6HoraI, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV8HoraF = GXutil.resetDate(localUtil.ctot( AV21Hhmmss_f, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8HoraF", localUtil.ttoc( AV8HoraF, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      if ( ! (GXutil.strcmp("", AV21Hhmmss_f)==0) || ! (GXutil.strcmp("", AV21Hhmmss_f)==0) )
      {
         AV6HoraI = GXutil.resetDate(localUtil.ctot( AV20Hhmmss_i, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6HoraI", localUtil.ttoc( AV6HoraI, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV8HoraF = GXutil.resetDate(localUtil.ctot( AV21Hhmmss_f, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8HoraF", localUtil.ttoc( AV8HoraF, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
   }

   public void e121YF2( )
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

   public void S152( )
   {
      /* 'LOADCOMBOMAQCOD2' Routine */
      returnInSub = false ;
      AV15MaqCod2_Data.clear();
      /* Using cursor H01YF2 */
      pr_default.execute(0, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A607MaqEst = H01YF2_A607MaqEst[0] ;
         n607MaqEst = H01YF2_n607MaqEst[0] ;
         A396EmprCod = H01YF2_A396EmprCod[0] ;
         A602MaqCod = H01YF2_A602MaqCod[0] ;
         A606MaqDsc = H01YF2_A606MaqDsc[0] ;
         n606MaqDsc = H01YF2_n606MaqDsc[0] ;
         AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV15MaqCod2_Data.add(AV14Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV15MaqCod2_Data.sort("Title");
      Combo_maqcod2_Selectedvalue_set = AV10MaqCod2 ;
      ucCombo_maqcod2.sendProperty(context, "", false, Combo_maqcod2_Internalname, "SelectedValue_set", Combo_maqcod2_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOMAQCOD1' Routine */
      returnInSub = false ;
      AV12MaqCod1_Data.clear();
      /* Using cursor H01YF3 */
      pr_default.execute(1, new Object[] {AV17EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A607MaqEst = H01YF3_A607MaqEst[0] ;
         n607MaqEst = H01YF3_n607MaqEst[0] ;
         A396EmprCod = H01YF3_A396EmprCod[0] ;
         A602MaqCod = H01YF3_A602MaqCod[0] ;
         A606MaqDsc = H01YF3_A606MaqDsc[0] ;
         n606MaqDsc = H01YF3_n606MaqDsc[0] ;
         AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV12MaqCod1_Data.add(AV14Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV12MaqCod1_Data.sort("Title");
      Combo_maqcod1_Selectedvalue_set = AV9MaqCod1 ;
      ucCombo_maqcod1.sendProperty(context, "", false, Combo_maqcod1_Internalname, "SelectedValue_set", Combo_maqcod1_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOUOPER' Routine */
      returnInSub = false ;
      /* Using cursor H01YF4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8482OpeAct = H01YF4_A8482OpeAct[0] ;
         n8482OpeAct = H01YF4_n8482OpeAct[0] ;
         A13748OpeCNom = H01YF4_A13748OpeCNom[0] ;
         A652OpeCod = H01YF4_A652OpeCod[0] ;
         A653OpeNom = H01YF4_A653OpeNom[0] ;
         n653OpeNom = H01YF4_n653OpeNom[0] ;
         if ( GXutil.strcmp(A8482OpeAct, httpContext.getMessage( "A", "")) == 0 )
         {
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
            AV42Uoper_Data.add(AV14Combo_DataItem, 0);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_uoper_Selectedvalue_set = ((0==AV40Uoper) ? "" : GXutil.trim( GXutil.str( AV40Uoper, 6, 0))) ;
      ucCombo_uoper.sendProperty(context, "", false, Combo_uoper_Internalname, "SelectedValue_set", Combo_uoper_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOPOPER' Routine */
      returnInSub = false ;
      /* Using cursor H01YF5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8482OpeAct = H01YF5_A8482OpeAct[0] ;
         n8482OpeAct = H01YF5_n8482OpeAct[0] ;
         A13748OpeCNom = H01YF5_A13748OpeCNom[0] ;
         A652OpeCod = H01YF5_A652OpeCod[0] ;
         A653OpeNom = H01YF5_A653OpeNom[0] ;
         n653OpeNom = H01YF5_n653OpeNom[0] ;
         if ( GXutil.strcmp(A8482OpeAct, httpContext.getMessage( "A", "")) == 0 )
         {
            AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
            AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13748OpeCNom );
            AV41Poper_Data.add(AV14Combo_DataItem, 0);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_poper_Selectedvalue_set = ((0==AV39Poper) ? "" : GXutil.trim( GXutil.str( AV39Poper, 6, 0))) ;
      ucCombo_poper.sendProperty(context, "", false, Combo_poper_Internalname, "SelectedValue_set", Combo_poper_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOTIPMAQCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01YF6 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A13835TipMaqCDsc = H01YF6_A13835TipMaqCDsc[0] ;
         A1011TipMaqCod = H01YF6_A1011TipMaqCod[0] ;
         A1012TipMaqDsc = H01YF6_A1012TipMaqDsc[0] ;
         n1012TipMaqDsc = H01YF6_n1012TipMaqDsc[0] ;
         AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A1011TipMaqCod );
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13835TipMaqCDsc );
         AV44TipMaqCod_Data.add(AV14Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_tipmaqcod_Selectedvalue_set = AV43TipMaqCod ;
      ucCombo_tipmaqcod.sendProperty(context, "", false, Combo_tipmaqcod_Internalname, "SelectedValue_set", Combo_tipmaqcod_Selectedvalue_set);
   }

   public void e131YF2( )
   {
      /* GlobalEvents_Progressbar Routine */
      returnInSub = false ;
      if ( AV28Type == 1 )
      {
         AV38ProgressIndicatorType = (byte)(1) ;
      }
      else if ( AV28Type == 0 )
      {
         AV38ProgressIndicatorType = (byte)(0) ;
      }
      else
      {
         AV38ProgressIndicatorType = (byte)(1) ;
      }
      AV25ProgressIndicator.setgxTv_SdtProgress_Type( AV38ProgressIndicatorType );
      AV25ProgressIndicator.setgxTv_SdtProgress_Class( AV32Class );
      AV25ProgressIndicator.showwithtitle(AV31ShowWithtitle);
      AV25ProgressIndicator.show();
      if ( ! (0==AV29Value) )
      {
         AV37i = (short)(1) ;
         while ( AV37i <= AV29Value )
         {
            AV25ProgressIndicator.setgxTv_SdtProgress_Value( AV29Value );
            AV37i = (short)(AV37i+1) ;
         }
      }
      AV25ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ProgressIndicator", AV25ProgressIndicator);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e141YF2 ();
      if (returnInSub) return;
   }

   public void e141YF2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV45maqcodfrom = ((GXutil.strcmp("", AV9MaqCod1)==0) ? httpContext.getMessage( "AAZZ99", "") : AV9MaqCod1) ;
      AV46maqcodto = ((GXutil.strcmp("", AV10MaqCod2)==0) ? httpContext.getMessage( "ZZZZ99", "") : AV10MaqCod2) ;
      AV47Uoper2 = ((0==AV40Uoper) ? 999999 : AV40Uoper) ;
      divPanel_resultado_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, divPanel_resultado_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divPanel_resultado_Visible), 5, 0), true);
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV36Fecha_hora = localUtil.dtoc( AV5HisProFec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV6HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV35HisProdtInicial = localUtil.ctot( AV36Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV36Fecha_hora = localUtil.dtoc( AV7HisProFec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV8HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV34HisProdtFinal = localUtil.ctot( AV36Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wc_informeproduccionresumenmaquina = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wc_informeproduccionresumenmaquina_Component), GXutil.lower( "Produccion.InformeProduccionResumenMaquinaDP_WC")) != 0 )
      {
         WebComp_Wc_informeproduccionresumenmaquina = WebUtils.getWebComponent(getClass(), "app.produccion.informeproduccionresumenmaquinadp_wc_impl", remoteHandle, context);
         WebComp_Wc_informeproduccionresumenmaquina_Component = "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
      }
      if ( GXutil.len( WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 )
      {
         WebComp_Wc_informeproduccionresumenmaquina.setjustcreated();
         WebComp_Wc_informeproduccionresumenmaquina.componentprepare(new Object[] {"W0142","",AV17EmprCod,Short.valueOf(AV11HisEstReo),AV45maqcodfrom,AV46maqcodto,AV35HisProdtInicial,AV34HisProdtFinal,Integer.valueOf(AV39Poper),Integer.valueOf(AV40Uoper)});
         WebComp_Wc_informeproduccionresumenmaquina.componentbind(new Object[] {"","vHISESTREO","","","","","vPOPER","vUOPER"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wc_informeproduccionresumenmaquina )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0142"+"");
         WebComp_Wc_informeproduccionresumenmaquina.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      System.out.println( httpContext.getMessage( "&HisProdtInicial=", "")+localUtil.format( AV35HisProdtInicial, "99/99/99 99:99")+httpContext.getMessage( "&HisProdtFina=", "")+localUtil.format( AV34HisProdtFinal, "99/99/99 99:99")+httpContext.getMessage( "&MaqCodfrom=", "")+AV45maqcodfrom+httpContext.getMessage( "&MaqCodto=", "")+AV46maqcodto+httpContext.getMessage( "&Poper=", "")+localUtil.format( DecimalUtil.doubleToDec(AV39Poper), "ZZZZZ9")+httpContext.getMessage( "Uoper2=", "")+localUtil.format( DecimalUtil.doubleToDec(AV47Uoper2), "ZZZZZ9") );
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wc_informeproduccionresumentipoarticulo = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wc_informeproduccionresumentipoarticulo_Component), GXutil.lower( "Produccion.InformeProduccionResumenTipoArticulo__WC")) != 0 )
      {
         WebComp_Wc_informeproduccionresumentipoarticulo = WebUtils.getWebComponent(getClass(), "app.produccion.informeproduccionresumentipoarticulo__wc_impl", remoteHandle, context);
         WebComp_Wc_informeproduccionresumentipoarticulo_Component = "Produccion.InformeProduccionResumenTipoArticulo__WC" ;
      }
      if ( GXutil.len( WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 )
      {
         WebComp_Wc_informeproduccionresumentipoarticulo.setjustcreated();
         WebComp_Wc_informeproduccionresumentipoarticulo.componentprepare(new Object[] {"W0149","",AV17EmprCod,AV35HisProdtInicial,AV34HisProdtFinal,AV45maqcodfrom,AV46maqcodto,Integer.valueOf(AV39Poper),Integer.valueOf(AV40Uoper),Short.valueOf(AV11HisEstReo)});
         WebComp_Wc_informeproduccionresumentipoarticulo.componentbind(new Object[] {"","","","","","vPOPER","vUOPER","vHISESTREO"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wc_informeproduccionresumentipoarticulo )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0149"+"");
         WebComp_Wc_informeproduccionresumentipoarticulo.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e151YF2( )
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
      pa1YF2( ) ;
      ws1YF2( ) ;
      we1YF2( ) ;
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
      if ( ! ( WebComp_Wc_informeproduccionresumenmaquina == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumenmaquina_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumenmaquina.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumentipoarticulo == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumentipoarticulo_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumentipoarticulo.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenoperario == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumenoperario_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumenoperario.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumentipocolorante == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumentipocolorante_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumentipocolorante.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenfase == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumenfase_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumenfase.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenturno == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumenturno_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumenturno.componentthemes();
         }
      }
      if ( ! ( WebComp_Wc_informeproduccionresumenhdr == null ) )
      {
         if ( GXutil.len( WebComp_Wc_informeproduccionresumenhdr_Component) != 0 )
         {
            WebComp_Wc_informeproduccionresumenhdr.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714195462", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenww.js", "?202681714195463", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavHisestreo.setInternalname( "vHISESTREO" );
      lblTextblockcombo_tipmaqcod_Internalname = "TEXTBLOCKCOMBO_TIPMAQCOD" ;
      Combo_tipmaqcod_Internalname = "COMBO_TIPMAQCOD" ;
      divTablesplittedtipmaqcod_Internalname = "TABLESPLITTEDTIPMAQCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockcombo_poper_Internalname = "TEXTBLOCKCOMBO_POPER" ;
      Combo_poper_Internalname = "COMBO_POPER" ;
      divTablesplittedpoper_Internalname = "TABLESPLITTEDPOPER" ;
      lblTextblockcombo_uoper_Internalname = "TEXTBLOCKCOMBO_UOPER" ;
      Combo_uoper_Internalname = "COMBO_UOPER" ;
      divTablesplitteduoper_Internalname = "TABLESPLITTEDUOPER" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockcombo_maqcod1_Internalname = "TEXTBLOCKCOMBO_MAQCOD1" ;
      Combo_maqcod1_Internalname = "COMBO_MAQCOD1" ;
      divTablesplittedmaqcod1_Internalname = "TABLESPLITTEDMAQCOD1" ;
      lblTextblockcombo_maqcod2_Internalname = "TEXTBLOCKCOMBO_MAQCOD2" ;
      Combo_maqcod2_Internalname = "COMBO_MAQCOD2" ;
      divTablesplittedmaqcod2_Internalname = "TABLESPLITTEDMAQCOD2" ;
      divTablemaq_Internalname = "TABLEMAQ" ;
      edtavHisprofec1_Internalname = "vHISPROFEC1" ;
      edtavHorai_Internalname = "vHORAI" ;
      edtavHisprofec2_Internalname = "vHISPROFEC2" ;
      edtavHoraf_Internalname = "vHORAF" ;
      divTabledate_Internalname = "TABLEDATE" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Datamon_Internalname = "DATAMON" ;
      divTableuc_datamon_Internalname = "TABLEUC_DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTablebarprogress_Internalname = "TABLEBARPROGRESS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divPanelresultadomaquina_Internalname = "PANELRESULTADOMAQUINA" ;
      Dvpanel_panelresultadomaquina_Internalname = "DVPANEL_PANELRESULTADOMAQUINA" ;
      divPanelresultadotipoarticulo_Internalname = "PANELRESULTADOTIPOARTICULO" ;
      Dvpanel_panelresultadotipoarticulo_Internalname = "DVPANEL_PANELRESULTADOTIPOARTICULO" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      divPanelresultadooperario_Internalname = "PANELRESULTADOOPERARIO" ;
      Dvpanel_panelresultadooperario_Internalname = "DVPANEL_PANELRESULTADOOPERARIO" ;
      divPanelresultadotipocolor_Internalname = "PANELRESULTADOTIPOCOLOR" ;
      Dvpanel_panelresultadotipocolor_Internalname = "DVPANEL_PANELRESULTADOTIPOCOLOR" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      lblTab03_title_Internalname = "TAB03_TITLE" ;
      divPanelresultadofase_Internalname = "PANELRESULTADOFASE" ;
      Dvpanel_panelresultadofase_Internalname = "DVPANEL_PANELRESULTADOFASE" ;
      divPanelresultadoturno_Internalname = "PANELRESULTADOTURNO" ;
      Dvpanel_panelresultadoturno_Internalname = "DVPANEL_PANELRESULTADOTURNO" ;
      divTableresultado3_Internalname = "TABLERESULTADO3" ;
      lblTab04_title_Internalname = "TAB04_TITLE" ;
      divPanelresultadohdr_Internalname = "PANELRESULTADOHDR" ;
      Dvpanel_panelresultadohdr_Internalname = "DVPANEL_PANELRESULTADOHDR" ;
      divTableresultado4_Internalname = "TABLERESULTADO4" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavTipmaqcod_Internalname = "vTIPMAQCOD" ;
      edtavPoper_Internalname = "vPOPER" ;
      edtavUoper_Internalname = "vUOPER" ;
      edtavMaqcod1_Internalname = "vMAQCOD1" ;
      edtavMaqcod2_Internalname = "vMAQCOD2" ;
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
      edtavMaqcod2_Jsonclick = "" ;
      edtavMaqcod2_Visible = 1 ;
      edtavMaqcod1_Jsonclick = "" ;
      edtavMaqcod1_Visible = 1 ;
      edtavUoper_Jsonclick = "" ;
      edtavUoper_Visible = 1 ;
      edtavPoper_Jsonclick = "" ;
      edtavPoper_Visible = 1 ;
      edtavTipmaqcod_Jsonclick = "" ;
      edtavTipmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divPanel_resultado_Visible = 1 ;
      edtavHoraf_Jsonclick = "" ;
      edtavHoraf_Enabled = 1 ;
      edtavHisprofec2_Jsonclick = "" ;
      edtavHisprofec2_Enabled = 1 ;
      edtavHorai_Jsonclick = "" ;
      edtavHorai_Enabled = 1 ;
      edtavHisprofec1_Jsonclick = "" ;
      edtavHisprofec1_Enabled = 1 ;
      Combo_maqcod2_Caption = "" ;
      Combo_maqcod1_Caption = "" ;
      cmbavHisestreo.setJsonclick( "" );
      cmbavHisestreo.setEnabled( 1 );
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
      Gxuitabspanel_tabs_Pagecount = 4 ;
      Dvpanel_panelresultadohdr_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadohdr_Iconposition = "Right" ;
      Dvpanel_panelresultadohdr_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadohdr_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadohdr_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadohdr_Title = "" ;
      Dvpanel_panelresultadohdr_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadohdr_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadohdr_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadohdr_Width = "100%" ;
      Dvpanel_panelresultadoturno_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadoturno_Iconposition = "Right" ;
      Dvpanel_panelresultadoturno_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadoturno_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadoturno_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadoturno_Title = "" ;
      Dvpanel_panelresultadoturno_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadoturno_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadoturno_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadoturno_Width = "100%" ;
      Dvpanel_panelresultadofase_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadofase_Iconposition = "Right" ;
      Dvpanel_panelresultadofase_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadofase_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadofase_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadofase_Title = "" ;
      Dvpanel_panelresultadofase_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadofase_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadofase_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadofase_Width = "100%" ;
      Dvpanel_panelresultadotipocolor_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipocolor_Iconposition = "Right" ;
      Dvpanel_panelresultadotipocolor_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipocolor_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipocolor_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadotipocolor_Title = "" ;
      Dvpanel_panelresultadotipocolor_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadotipocolor_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadotipocolor_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipocolor_Width = "100%" ;
      Dvpanel_panelresultadooperario_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadooperario_Iconposition = "Right" ;
      Dvpanel_panelresultadooperario_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadooperario_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadooperario_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadooperario_Title = "" ;
      Dvpanel_panelresultadooperario_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadooperario_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadooperario_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadooperario_Width = "100%" ;
      Dvpanel_panelresultadotipoarticulo_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipoarticulo_Iconposition = "Right" ;
      Dvpanel_panelresultadotipoarticulo_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipoarticulo_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipoarticulo_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadotipoarticulo_Title = "" ;
      Dvpanel_panelresultadotipoarticulo_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadotipoarticulo_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadotipoarticulo_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadotipoarticulo_Width = "100%" ;
      Dvpanel_panelresultadomaquina_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadomaquina_Iconposition = "Right" ;
      Dvpanel_panelresultadomaquina_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadomaquina_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadomaquina_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadomaquina_Title = "" ;
      Dvpanel_panelresultadomaquina_Cls = "PanelNoHeader" ;
      Dvpanel_panelresultadomaquina_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultadomaquina_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultadomaquina_Width = "100%" ;
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
      Combo_maqcod2_Emptyitemtext = "Todas" ;
      Combo_maqcod2_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod1_Emptyitemtext = "Todas" ;
      Combo_maqcod1_Cls = "ExtendedCombo AttributeFL" ;
      Combo_uoper_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_uoper_Cls = "ExtendedCombo AttributeFL" ;
      Combo_poper_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_poper_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipmaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe Produccion Resumen (DataTime)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisestreo.setName( "vHISESTREO" );
      cmbavHisestreo.setWebtags( "" );
      cmbavHisestreo.addItem("9", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavHisestreo.addItem("0", httpContext.getMessage( "Producción Normal", ""), (short)(0));
      cmbavHisestreo.addItem("1", httpContext.getMessage( "ReoperadoI", ""), (short)(0));
      cmbavHisestreo.addItem("2", httpContext.getMessage( "Reoperado E", ""), (short)(0));
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV11HisEstReo = (short)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV11HisEstReo, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11HisEstReo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11HisEstReo), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e121YF2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GLOBALEVENTS.PROGRESSBAR","{handler:'e131YF2',iparms:[{av:'AV32Class',fld:'vCLASS',pic:''},{av:'AV31ShowWithtitle',fld:'vSHOWWITHTITLE',pic:''},{av:'AV33Hidden',fld:'vHIDDEN',pic:'ZZZ9'},{av:'AV29Value',fld:'vVALUE',pic:'ZZZ9'},{av:'AV28Type',fld:'vTYPE',pic:'9'}]");
      setEventMetadata("GLOBALEVENTS.PROGRESSBAR",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e141YF2',iparms:[{av:'AV9MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV10MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV40Uoper',fld:'vUOPER',pic:'ZZZZZ9'},{av:'AV5HisProFec1',fld:'vHISPROFEC1',pic:''},{av:'AV6HoraI',fld:'vHORAI',pic:'99:99'},{av:'AV7HisProFec2',fld:'vHISPROFEC2',pic:''},{av:'AV8HoraF',fld:'vHORAF',pic:'99:99'},{av:'AV17EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'cmbavHisestreo'},{av:'AV11HisEstReo',fld:'vHISESTREO',pic:'ZZZ9'},{av:'AV39Poper',fld:'vPOPER',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'divPanel_resultado_Visible',ctrl:'PANEL_RESULTADO',prop:'Visible'},{ctrl:'WC_INFORMEPRODUCCIONRESUMENMAQUINA'},{ctrl:'WC_INFORMEPRODUCCIONRESUMENTIPOARTICULO'}]}");
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
      Combo_maqcod2_Selectedvalue_get = "" ;
      Combo_maqcod1_Selectedvalue_get = "" ;
      Combo_uoper_Selectedvalue_get = "" ;
      Combo_poper_Selectedvalue_get = "" ;
      Combo_tipmaqcod_Selectedvalue_get = "" ;
      Gxuitabspanel_tabs_Activepagecontrolname = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV17EmprCod = "" ;
      GXKey = "" ;
      AV44TipMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41Poper_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42Uoper_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV13DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12MaqCod1_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV15MaqCod2_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV32Class = "" ;
      AV31ShowWithtitle = "" ;
      AV34HisProdtFinal = GXutil.resetTime( GXutil.nullDate() );
      AV35HisProdtInicial = GXutil.resetTime( GXutil.nullDate() );
      AV36Fecha_hora = "" ;
      AV46maqcodto = "" ;
      AV45maqcodfrom = "" ;
      Combo_tipmaqcod_Selectedvalue_set = "" ;
      Combo_poper_Selectedvalue_set = "" ;
      Combo_uoper_Selectedvalue_set = "" ;
      Combo_maqcod1_Selectedvalue_set = "" ;
      Combo_maqcod2_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_tipmaqcod_Jsonclick = "" ;
      ucCombo_tipmaqcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipmaqcod_Caption = "" ;
      lblTextblockcombo_poper_Jsonclick = "" ;
      ucCombo_poper = new com.genexus.webpanels.GXUserControl();
      Combo_poper_Caption = "" ;
      lblTextblockcombo_uoper_Jsonclick = "" ;
      ucCombo_uoper = new com.genexus.webpanels.GXUserControl();
      Combo_uoper_Caption = "" ;
      lblTextblockcombo_maqcod1_Jsonclick = "" ;
      ucCombo_maqcod1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod2_Jsonclick = "" ;
      ucCombo_maqcod2 = new com.genexus.webpanels.GXUserControl();
      AV5HisProFec1 = GXutil.nullDate() ;
      AV6HoraI = GXutil.resetTime( GXutil.nullDate() );
      AV7HisProFec2 = GXutil.nullDate() ;
      AV8HoraF = GXutil.resetTime( GXutil.nullDate() );
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      ucDvpanel_panelresultadomaquina = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumenmaquina_Component = "" ;
      OldWc_informeproduccionresumenmaquina = "" ;
      ucDvpanel_panelresultadotipoarticulo = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumentipoarticulo_Component = "" ;
      OldWc_informeproduccionresumentipoarticulo = "" ;
      lblTab02_title_Jsonclick = "" ;
      ucDvpanel_panelresultadooperario = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumenoperario_Component = "" ;
      OldWc_informeproduccionresumenoperario = "" ;
      ucDvpanel_panelresultadotipocolor = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumentipocolorante_Component = "" ;
      OldWc_informeproduccionresumentipocolorante = "" ;
      lblTab03_title_Jsonclick = "" ;
      ucDvpanel_panelresultadofase = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumenfase_Component = "" ;
      OldWc_informeproduccionresumenfase = "" ;
      ucDvpanel_panelresultadoturno = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumenturno_Component = "" ;
      OldWc_informeproduccionresumenturno = "" ;
      lblTab04_title_Jsonclick = "" ;
      ucDvpanel_panelresultadohdr = new com.genexus.webpanels.GXUserControl();
      WebComp_Wc_informeproduccionresumenhdr_Component = "" ;
      OldWc_informeproduccionresumenhdr = "" ;
      AV50Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV43TipMaqCod = "" ;
      AV9MaqCod1 = "" ;
      AV10MaqCod2 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV16Station = "" ;
      AV18EmprNom = "" ;
      AV19UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV20Hhmmss_i = "" ;
      AV21Hhmmss_f = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      H01YF2_A607MaqEst = new String[] {""} ;
      H01YF2_n607MaqEst = new boolean[] {false} ;
      H01YF2_A396EmprCod = new String[] {""} ;
      H01YF2_A602MaqCod = new String[] {""} ;
      H01YF2_A606MaqDsc = new String[] {""} ;
      H01YF2_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      AV14Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01YF3_A607MaqEst = new String[] {""} ;
      H01YF3_n607MaqEst = new boolean[] {false} ;
      H01YF3_A396EmprCod = new String[] {""} ;
      H01YF3_A602MaqCod = new String[] {""} ;
      H01YF3_A606MaqDsc = new String[] {""} ;
      H01YF3_n606MaqDsc = new boolean[] {false} ;
      H01YF4_A396EmprCod = new String[] {""} ;
      H01YF4_A8482OpeAct = new String[] {""} ;
      H01YF4_n8482OpeAct = new boolean[] {false} ;
      H01YF4_A13748OpeCNom = new String[] {""} ;
      H01YF4_A652OpeCod = new int[1] ;
      H01YF4_A653OpeNom = new String[] {""} ;
      H01YF4_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A13748OpeCNom = "" ;
      A653OpeNom = "" ;
      H01YF5_A396EmprCod = new String[] {""} ;
      H01YF5_A8482OpeAct = new String[] {""} ;
      H01YF5_n8482OpeAct = new boolean[] {false} ;
      H01YF5_A13748OpeCNom = new String[] {""} ;
      H01YF5_A652OpeCod = new int[1] ;
      H01YF5_A653OpeNom = new String[] {""} ;
      H01YF5_n653OpeNom = new boolean[] {false} ;
      H01YF6_A396EmprCod = new String[] {""} ;
      H01YF6_A13835TipMaqCDsc = new String[] {""} ;
      H01YF6_A1011TipMaqCod = new String[] {""} ;
      H01YF6_A1012TipMaqDsc = new String[] {""} ;
      H01YF6_n1012TipMaqDsc = new boolean[] {false} ;
      A13835TipMaqCDsc = "" ;
      A1011TipMaqCod = "" ;
      A1012TipMaqDsc = "" ;
      AV25ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenww__default(),
         new Object[] {
             new Object[] {
            H01YF2_A607MaqEst, H01YF2_n607MaqEst, H01YF2_A396EmprCod, H01YF2_A602MaqCod, H01YF2_A606MaqDsc, H01YF2_n606MaqDsc
            }
            , new Object[] {
            H01YF3_A607MaqEst, H01YF3_n607MaqEst, H01YF3_A396EmprCod, H01YF3_A602MaqCod, H01YF3_A606MaqDsc, H01YF3_n606MaqDsc
            }
            , new Object[] {
            H01YF4_A396EmprCod, H01YF4_A8482OpeAct, H01YF4_n8482OpeAct, H01YF4_A13748OpeCNom, H01YF4_A652OpeCod, H01YF4_A653OpeNom, H01YF4_n653OpeNom
            }
            , new Object[] {
            H01YF5_A396EmprCod, H01YF5_A8482OpeAct, H01YF5_n8482OpeAct, H01YF5_A13748OpeCNom, H01YF5_A652OpeCod, H01YF5_A653OpeNom, H01YF5_n653OpeNom
            }
            , new Object[] {
            H01YF6_A396EmprCod, H01YF6_A13835TipMaqCDsc, H01YF6_A1011TipMaqCod, H01YF6_A1012TipMaqDsc, H01YF6_n1012TipMaqDsc
            }
         }
      );
      AV50Pgmname = "Produccion.InformeProduccionResumenWW" ;
      /* GeneXus formulas. */
      AV50Pgmname = "Produccion.InformeProduccionResumenWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wc_informeproduccionresumenmaquina = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumentipoarticulo = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumenoperario = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumentipocolorante = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumenfase = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumenturno = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wc_informeproduccionresumenhdr = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV28Type ;
   private byte nDonePA ;
   private byte AV22Grulec ;
   private byte AV23lecotex ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte AV38ProgressIndicatorType ;
   private byte nGXWrapped ;
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
   private short AV33Hidden ;
   private short AV29Value ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11HisEstReo ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV37i ;
   private int AV47Uoper2 ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavHisprofec1_Enabled ;
   private int edtavHorai_Enabled ;
   private int edtavHisprofec2_Enabled ;
   private int edtavHoraf_Enabled ;
   private int divPanel_resultado_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavTipmaqcod_Visible ;
   private int AV39Poper ;
   private int edtavPoper_Visible ;
   private int AV40Uoper ;
   private int edtavUoper_Visible ;
   private int edtavMaqcod1_Visible ;
   private int edtavMaqcod2_Visible ;
   private int A652OpeCod ;
   private int idxLst ;
   private String Combo_maqcod2_Selectedvalue_get ;
   private String Combo_maqcod1_Selectedvalue_get ;
   private String Combo_uoper_Selectedvalue_get ;
   private String Combo_poper_Selectedvalue_get ;
   private String Combo_tipmaqcod_Selectedvalue_get ;
   private String Gxuitabspanel_tabs_Activepagecontrolname ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV17EmprCod ;
   private String GXKey ;
   private String AV46maqcodto ;
   private String AV45maqcodfrom ;
   private String Combo_tipmaqcod_Cls ;
   private String Combo_tipmaqcod_Selectedvalue_set ;
   private String Combo_poper_Cls ;
   private String Combo_poper_Selectedvalue_set ;
   private String Combo_uoper_Cls ;
   private String Combo_uoper_Selectedvalue_set ;
   private String Combo_maqcod1_Cls ;
   private String Combo_maqcod1_Selectedvalue_set ;
   private String Combo_maqcod1_Emptyitemtext ;
   private String Combo_maqcod2_Cls ;
   private String Combo_maqcod2_Selectedvalue_set ;
   private String Combo_maqcod2_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvpanel_panelresultadomaquina_Width ;
   private String Dvpanel_panelresultadomaquina_Cls ;
   private String Dvpanel_panelresultadomaquina_Title ;
   private String Dvpanel_panelresultadomaquina_Iconposition ;
   private String Dvpanel_panelresultadotipoarticulo_Width ;
   private String Dvpanel_panelresultadotipoarticulo_Cls ;
   private String Dvpanel_panelresultadotipoarticulo_Title ;
   private String Dvpanel_panelresultadotipoarticulo_Iconposition ;
   private String Dvpanel_panelresultadooperario_Width ;
   private String Dvpanel_panelresultadooperario_Cls ;
   private String Dvpanel_panelresultadooperario_Title ;
   private String Dvpanel_panelresultadooperario_Iconposition ;
   private String Dvpanel_panelresultadotipocolor_Width ;
   private String Dvpanel_panelresultadotipocolor_Cls ;
   private String Dvpanel_panelresultadotipocolor_Title ;
   private String Dvpanel_panelresultadotipocolor_Iconposition ;
   private String Dvpanel_panelresultadofase_Width ;
   private String Dvpanel_panelresultadofase_Cls ;
   private String Dvpanel_panelresultadofase_Title ;
   private String Dvpanel_panelresultadofase_Iconposition ;
   private String Dvpanel_panelresultadoturno_Width ;
   private String Dvpanel_panelresultadoturno_Cls ;
   private String Dvpanel_panelresultadoturno_Title ;
   private String Dvpanel_panelresultadoturno_Iconposition ;
   private String Dvpanel_panelresultadohdr_Width ;
   private String Dvpanel_panelresultadohdr_Cls ;
   private String Dvpanel_panelresultadohdr_Title ;
   private String Dvpanel_panelresultadohdr_Iconposition ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String divTablesplittedtipmaqcod_Internalname ;
   private String lblTextblockcombo_tipmaqcod_Internalname ;
   private String lblTextblockcombo_tipmaqcod_Jsonclick ;
   private String Combo_tipmaqcod_Caption ;
   private String Combo_tipmaqcod_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedpoper_Internalname ;
   private String lblTextblockcombo_poper_Internalname ;
   private String lblTextblockcombo_poper_Jsonclick ;
   private String Combo_poper_Caption ;
   private String Combo_poper_Internalname ;
   private String divTablesplitteduoper_Internalname ;
   private String lblTextblockcombo_uoper_Internalname ;
   private String lblTextblockcombo_uoper_Jsonclick ;
   private String Combo_uoper_Caption ;
   private String Combo_uoper_Internalname ;
   private String divTablemaq_Internalname ;
   private String divTablesplittedmaqcod1_Internalname ;
   private String lblTextblockcombo_maqcod1_Internalname ;
   private String lblTextblockcombo_maqcod1_Jsonclick ;
   private String Combo_maqcod1_Caption ;
   private String Combo_maqcod1_Internalname ;
   private String divTablesplittedmaqcod2_Internalname ;
   private String lblTextblockcombo_maqcod2_Internalname ;
   private String lblTextblockcombo_maqcod2_Jsonclick ;
   private String Combo_maqcod2_Caption ;
   private String Combo_maqcod2_Internalname ;
   private String divTabledate_Internalname ;
   private String edtavHisprofec1_Internalname ;
   private String edtavHisprofec1_Jsonclick ;
   private String edtavHorai_Internalname ;
   private String edtavHorai_Jsonclick ;
   private String edtavHisprofec2_Internalname ;
   private String edtavHisprofec2_Jsonclick ;
   private String edtavHoraf_Internalname ;
   private String edtavHoraf_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTableuc_datamon_Internalname ;
   private String Datamon_Internalname ;
   private String divTable_progress_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divTablebarprogress_Internalname ;
   private String Progressbar_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String Dvpanel_panelresultadomaquina_Internalname ;
   private String divPanelresultadomaquina_Internalname ;
   private String WebComp_Wc_informeproduccionresumenmaquina_Component ;
   private String OldWc_informeproduccionresumenmaquina ;
   private String Dvpanel_panelresultadotipoarticulo_Internalname ;
   private String divPanelresultadotipoarticulo_Internalname ;
   private String WebComp_Wc_informeproduccionresumentipoarticulo_Component ;
   private String OldWc_informeproduccionresumentipoarticulo ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String Dvpanel_panelresultadooperario_Internalname ;
   private String divPanelresultadooperario_Internalname ;
   private String WebComp_Wc_informeproduccionresumenoperario_Component ;
   private String OldWc_informeproduccionresumenoperario ;
   private String Dvpanel_panelresultadotipocolor_Internalname ;
   private String divPanelresultadotipocolor_Internalname ;
   private String WebComp_Wc_informeproduccionresumentipocolorante_Component ;
   private String OldWc_informeproduccionresumentipocolorante ;
   private String lblTab03_title_Internalname ;
   private String lblTab03_title_Jsonclick ;
   private String divTableresultado3_Internalname ;
   private String Dvpanel_panelresultadofase_Internalname ;
   private String divPanelresultadofase_Internalname ;
   private String WebComp_Wc_informeproduccionresumenfase_Component ;
   private String OldWc_informeproduccionresumenfase ;
   private String Dvpanel_panelresultadoturno_Internalname ;
   private String divPanelresultadoturno_Internalname ;
   private String WebComp_Wc_informeproduccionresumenturno_Component ;
   private String OldWc_informeproduccionresumenturno ;
   private String lblTab04_title_Internalname ;
   private String lblTab04_title_Jsonclick ;
   private String divTableresultado4_Internalname ;
   private String Dvpanel_panelresultadohdr_Internalname ;
   private String divPanelresultadohdr_Internalname ;
   private String WebComp_Wc_informeproduccionresumenhdr_Component ;
   private String OldWc_informeproduccionresumenhdr ;
   private String edtavPgmname_Internalname ;
   private String AV50Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavTipmaqcod_Internalname ;
   private String AV43TipMaqCod ;
   private String edtavTipmaqcod_Jsonclick ;
   private String edtavPoper_Internalname ;
   private String edtavPoper_Jsonclick ;
   private String edtavUoper_Internalname ;
   private String edtavUoper_Jsonclick ;
   private String edtavMaqcod1_Internalname ;
   private String AV9MaqCod1 ;
   private String edtavMaqcod1_Jsonclick ;
   private String edtavMaqcod2_Internalname ;
   private String AV10MaqCod2 ;
   private String edtavMaqcod2_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV16Station ;
   private String AV18EmprNom ;
   private String AV19UsurCod ;
   private String AV20Hhmmss_i ;
   private String AV21Hhmmss_f ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A607MaqEst ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A8482OpeAct ;
   private String A653OpeNom ;
   private String A1011TipMaqCod ;
   private String A1012TipMaqDsc ;
   private java.util.Date AV34HisProdtFinal ;
   private java.util.Date AV35HisProdtInicial ;
   private java.util.Date AV6HoraI ;
   private java.util.Date AV8HoraF ;
   private java.util.Date AV5HisProFec1 ;
   private java.util.Date AV7HisProFec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_tipmaqcod_Emptyitem ;
   private boolean Combo_poper_Emptyitem ;
   private boolean Combo_uoper_Emptyitem ;
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
   private boolean Dvpanel_panelresultadomaquina_Autowidth ;
   private boolean Dvpanel_panelresultadomaquina_Autoheight ;
   private boolean Dvpanel_panelresultadomaquina_Collapsible ;
   private boolean Dvpanel_panelresultadomaquina_Collapsed ;
   private boolean Dvpanel_panelresultadomaquina_Showcollapseicon ;
   private boolean Dvpanel_panelresultadomaquina_Autoscroll ;
   private boolean Dvpanel_panelresultadotipoarticulo_Autowidth ;
   private boolean Dvpanel_panelresultadotipoarticulo_Autoheight ;
   private boolean Dvpanel_panelresultadotipoarticulo_Collapsible ;
   private boolean Dvpanel_panelresultadotipoarticulo_Collapsed ;
   private boolean Dvpanel_panelresultadotipoarticulo_Showcollapseicon ;
   private boolean Dvpanel_panelresultadotipoarticulo_Autoscroll ;
   private boolean Dvpanel_panelresultadooperario_Autowidth ;
   private boolean Dvpanel_panelresultadooperario_Autoheight ;
   private boolean Dvpanel_panelresultadooperario_Collapsible ;
   private boolean Dvpanel_panelresultadooperario_Collapsed ;
   private boolean Dvpanel_panelresultadooperario_Showcollapseicon ;
   private boolean Dvpanel_panelresultadooperario_Autoscroll ;
   private boolean Dvpanel_panelresultadotipocolor_Autowidth ;
   private boolean Dvpanel_panelresultadotipocolor_Autoheight ;
   private boolean Dvpanel_panelresultadotipocolor_Collapsible ;
   private boolean Dvpanel_panelresultadotipocolor_Collapsed ;
   private boolean Dvpanel_panelresultadotipocolor_Showcollapseicon ;
   private boolean Dvpanel_panelresultadotipocolor_Autoscroll ;
   private boolean Dvpanel_panelresultadofase_Autowidth ;
   private boolean Dvpanel_panelresultadofase_Autoheight ;
   private boolean Dvpanel_panelresultadofase_Collapsible ;
   private boolean Dvpanel_panelresultadofase_Collapsed ;
   private boolean Dvpanel_panelresultadofase_Showcollapseicon ;
   private boolean Dvpanel_panelresultadofase_Autoscroll ;
   private boolean Dvpanel_panelresultadoturno_Autowidth ;
   private boolean Dvpanel_panelresultadoturno_Autoheight ;
   private boolean Dvpanel_panelresultadoturno_Collapsible ;
   private boolean Dvpanel_panelresultadoturno_Collapsed ;
   private boolean Dvpanel_panelresultadoturno_Showcollapseicon ;
   private boolean Dvpanel_panelresultadoturno_Autoscroll ;
   private boolean Dvpanel_panelresultadohdr_Autowidth ;
   private boolean Dvpanel_panelresultadohdr_Autoheight ;
   private boolean Dvpanel_panelresultadohdr_Collapsible ;
   private boolean Dvpanel_panelresultadohdr_Collapsed ;
   private boolean Dvpanel_panelresultadohdr_Showcollapseicon ;
   private boolean Dvpanel_panelresultadohdr_Autoscroll ;
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
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n1012TipMaqDsc ;
   private boolean bDynCreated_Wc_informeproduccionresumenmaquina ;
   private boolean bDynCreated_Wc_informeproduccionresumentipoarticulo ;
   private String AV32Class ;
   private String AV31ShowWithtitle ;
   private String AV36Fecha_hora ;
   private String A13748OpeCNom ;
   private String A13835TipMaqCDsc ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wc_informeproduccionresumenmaquina ;
   private GXWebComponent WebComp_Wc_informeproduccionresumentipoarticulo ;
   private GXWebComponent WebComp_Wc_informeproduccionresumenoperario ;
   private GXWebComponent WebComp_Wc_informeproduccionresumentipocolorante ;
   private GXWebComponent WebComp_Wc_informeproduccionresumenfase ;
   private GXWebComponent WebComp_Wc_informeproduccionresumenturno ;
   private GXWebComponent WebComp_Wc_informeproduccionresumenhdr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipmaqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_poper ;
   private com.genexus.webpanels.GXUserControl ucCombo_uoper ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod2 ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadomaquina ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadotipoarticulo ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadooperario ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadotipocolor ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadofase ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadoturno ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultadohdr ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV25ProgressIndicator ;
   private HTMLChoice cmbavHisestreo ;
   private IDataStoreProvider pr_default ;
   private String[] H01YF2_A607MaqEst ;
   private boolean[] H01YF2_n607MaqEst ;
   private String[] H01YF2_A396EmprCod ;
   private String[] H01YF2_A602MaqCod ;
   private String[] H01YF2_A606MaqDsc ;
   private boolean[] H01YF2_n606MaqDsc ;
   private String[] H01YF3_A607MaqEst ;
   private boolean[] H01YF3_n607MaqEst ;
   private String[] H01YF3_A396EmprCod ;
   private String[] H01YF3_A602MaqCod ;
   private String[] H01YF3_A606MaqDsc ;
   private boolean[] H01YF3_n606MaqDsc ;
   private String[] H01YF4_A396EmprCod ;
   private String[] H01YF4_A8482OpeAct ;
   private boolean[] H01YF4_n8482OpeAct ;
   private String[] H01YF4_A13748OpeCNom ;
   private int[] H01YF4_A652OpeCod ;
   private String[] H01YF4_A653OpeNom ;
   private boolean[] H01YF4_n653OpeNom ;
   private String[] H01YF5_A396EmprCod ;
   private String[] H01YF5_A8482OpeAct ;
   private boolean[] H01YF5_n8482OpeAct ;
   private String[] H01YF5_A13748OpeCNom ;
   private int[] H01YF5_A652OpeCod ;
   private String[] H01YF5_A653OpeNom ;
   private boolean[] H01YF5_n653OpeNom ;
   private String[] H01YF6_A396EmprCod ;
   private String[] H01YF6_A13835TipMaqCDsc ;
   private String[] H01YF6_A1011TipMaqCod ;
   private String[] H01YF6_A1012TipMaqDsc ;
   private boolean[] H01YF6_n1012TipMaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44TipMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41Poper_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV42Uoper_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12MaqCod1_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15MaqCod2_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV14Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV13DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class informeproduccionresumenww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YF2", "SELECT MaqEst, EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YF3", "SELECT MaqEst, EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YF4", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YF5", "SELECT EmprCod, OpeAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, OpeCod, OpeNom FROM TXPOPERAR ORDER BY OpeCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YF6", "SELECT EmprCod, RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) AS TipMaqCDsc, TipMaqCod, TipMaqDsc FROM TXPTIPMAQ ORDER BY TipMaqCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

