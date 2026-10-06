package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproducciondiariaww_impl extends GXDataArea
{
   public informeproducciondiariaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproducciondiariaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproducciondiariaww_impl.class ));
   }

   public informeproducciondiariaww_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavResumen = UIFactory.getCheckbox(this);
      cmbavOpcion = new HTMLChoice();
      chkavSidia = UIFactory.getCheckbox(this);
      chkavSimaquina = UIFactory.getCheckbox(this);
      chkavImprimirparos = UIFactory.getCheckbox(this);
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
      pa1WV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WV2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproducciondiariaww", new String[] {}, new String[] {}) +"\">") ;
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV17MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV17MaqCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_TO_DATA", AV19MaqCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_TO_DATA", AV19MaqCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV6CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV6CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_TO_DATA", AV8CliCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_TO_DATA", AV8CliCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASE_DATA", AV50Fase_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASE_DATA", AV50Fase_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASE_TO_DATA", AV51Fase_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASE_TO_DATA", AV51Fase_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPECOD_DATA", AV49OpeCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPECOD_DATA", AV49OpeCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOPECOD_TO_DATA", AV55OpeCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOPECOD_TO_DATA", AV55OpeCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCODFROM_DATA", AV47IntCodFrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCODFROM_DATA", AV47IntCodFrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCODTO_DATA", AV48IntCodTo_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCODTO_DATA", AV48IntCodTo_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV36EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXCELFILENAME", AV56ExcelFilename);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRORMESSAGE", AV57ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitemtext", GXutil.rtrim( Combo_maqcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_TO_Cls", GXutil.rtrim( Combo_maqcod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_TO_Emptyitemtext", GXutil.rtrim( Combo_maqcod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Cls", GXutil.rtrim( Combo_clicod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_clicod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Emptyitemtext", GXutil.rtrim( Combo_clicod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Cls", GXutil.rtrim( Combo_fase_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Selectedvalue_set", GXutil.rtrim( Combo_fase_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Emptyitemtext", GXutil.rtrim( Combo_fase_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_TO_Cls", GXutil.rtrim( Combo_fase_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_TO_Selectedvalue_set", GXutil.rtrim( Combo_fase_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_TO_Emptyitemtext", GXutil.rtrim( Combo_fase_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Cls", GXutil.rtrim( Combo_opecod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_set", GXutil.rtrim( Combo_opecod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Emptyitemtext", GXutil.rtrim( Combo_opecod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_TO_Cls", GXutil.rtrim( Combo_opecod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_opecod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_TO_Emptyitemtext", GXutil.rtrim( Combo_opecod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODFROM_Cls", GXutil.rtrim( Combo_intcodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODFROM_Selectedvalue_set", GXutil.rtrim( Combo_intcodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODFROM_Emptyitemtext", GXutil.rtrim( Combo_intcodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODTO_Cls", GXutil.rtrim( Combo_intcodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODTO_Selectedvalue_set", GXutil.rtrim( Combo_intcodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODTO_Emptyitemtext", GXutil.rtrim( Combo_intcodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Width", GXutil.rtrim( Dvpanel_panel_filtrosmas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autowidth", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoheight", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Cls", GXutil.rtrim( Dvpanel_panel_filtrosmas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Title", GXutil.rtrim( Dvpanel_panel_filtrosmas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsible", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Collapsed", GXutil.booltostr( Dvpanel_panel_filtrosmas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_filtrosmas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Iconposition", GXutil.rtrim( Dvpanel_panel_filtrosmas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_FILTROSMAS_Autoscroll", GXutil.booltostr( Dvpanel_panel_filtrosmas_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODTO_Selectedvalue_get", GXutil.rtrim( Combo_intcodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCODFROM_Selectedvalue_get", GXutil.rtrim( Combo_intcodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_opecod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_OPECOD_Selectedvalue_get", GXutil.rtrim( Combo_opecod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_TO_Selectedvalue_get", GXutil.rtrim( Combo_fase_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASE_Selectedvalue_get", GXutil.rtrim( Combo_fase_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_clicod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
         we1WV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WV2( ) ;
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
      return formatLink("app.produccion.informeproducciondiariaww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.InformeProduccionDiariaWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe de Producción Diaria", "") ;
   }

   public void wb1WV0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemaq_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Máquina desde", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItemText", Combo_maqcod_Emptyitemtext);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV17MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_to_Internalname, httpContext.getMessage( "hasta ", ""), "", "", lblTextblockcombo_maqcod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod_to.setProperty("Caption", Combo_maqcod_to_Caption);
         ucCombo_maqcod_to.setProperty("Cls", Combo_maqcod_to_Cls);
         ucCombo_maqcod_to.setProperty("EmptyItemText", Combo_maqcod_to_Emptyitemtext);
         ucCombo_maqcod_to.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_maqcod_to.setProperty("DropDownOptionsData", AV19MaqCod_to_Data);
         ucCombo_maqcod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_to_Internalname, "COMBO_MAQCOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodf_Internalname, httpContext.getMessage( "Periodo desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodf_Internalname, localUtil.format(AV11HisProDf, "99/99/99"), localUtil.format( AV11HisProDf, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprohf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprohf_Internalname, httpContext.getMessage( "hora desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprohf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprohf_Internalname, localUtil.ttoc( AV13HisProHf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV13HisProHf, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprohf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprohf_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprohf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprohf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodf_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodf_to_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodf_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodf_to_Internalname, localUtil.format(AV12HisProDf_to, "99/99/99"), localUtil.format( AV12HisProDf_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodf_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodf_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodf_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodf_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprohf_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprohf_to_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprohf_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprohf_to_Internalname, localUtil.ttoc( AV14HisProHf_to, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV14HisProHf_to, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprohf_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprohf_to_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprohf_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprohf_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableclient_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Cliente desde", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
         ucCombo_clicod.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV6CliCod_Data);
         ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_to_Internalname, httpContext.getMessage( "hasta", ""), "", "", lblTextblockcombo_clicod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod_to.setProperty("Caption", Combo_clicod_to_Caption);
         ucCombo_clicod_to.setProperty("Cls", Combo_clicod_to_Cls);
         ucCombo_clicod_to.setProperty("EmptyItemText", Combo_clicod_to_Emptyitemtext);
         ucCombo_clicod_to.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_clicod_to.setProperty("DropDownOptionsData", AV8CliCod_to_Data);
         ucCombo_clicod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_to_Internalname, "COMBO_CLICOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablefases_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfase_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fase_Internalname, httpContext.getMessage( "Fase desde", ""), "", "", lblTextblockcombo_fase_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fase.setProperty("Caption", Combo_fase_Caption);
         ucCombo_fase.setProperty("Cls", Combo_fase_Cls);
         ucCombo_fase.setProperty("EmptyItemText", Combo_fase_Emptyitemtext);
         ucCombo_fase.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_fase.setProperty("DropDownOptionsData", AV50Fase_Data);
         ucCombo_fase.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fase_Internalname, "COMBO_FASEContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfase_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_fase_to_Internalname, httpContext.getMessage( "hasta", ""), "", "", lblTextblockcombo_fase_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_fase_to.setProperty("Caption", Combo_fase_to_Caption);
         ucCombo_fase_to.setProperty("Cls", Combo_fase_to_Cls);
         ucCombo_fase_to.setProperty("EmptyItemText", Combo_fase_to_Emptyitemtext);
         ucCombo_fase_to.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_fase_to.setProperty("DropDownOptionsData", AV51Fase_to_Data);
         ucCombo_fase_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fase_to_Internalname, "COMBO_FASE_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablearticulos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Artículos desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV32BarSer), GXutil.rtrim( localUtil.format( AV32BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_to_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_to_Internalname, GXutil.rtrim( AV33BarSer_to), GXutil.rtrim( localUtil.format( AV33BarSer_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablecolores_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Colores desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV30BarColNom), GXutil.rtrim( localUtil.format( AV30BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_to_Internalname, httpContext.getMessage( "hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_to_Internalname, GXutil.rtrim( AV31BarColNom_to), GXutil.rtrim( localUtil.format( AV31BarColNom_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,123);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTableoperarios_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedopecod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_opecod_Internalname, httpContext.getMessage( "Operario desde", ""), "", "", lblTextblockcombo_opecod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_opecod.setProperty("Caption", Combo_opecod_Caption);
         ucCombo_opecod.setProperty("Cls", Combo_opecod_Cls);
         ucCombo_opecod.setProperty("EmptyItemText", Combo_opecod_Emptyitemtext);
         ucCombo_opecod.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_opecod.setProperty("DropDownOptionsData", AV49OpeCod_Data);
         ucCombo_opecod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opecod_Internalname, "COMBO_OPECODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedopecod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_opecod_to_Internalname, httpContext.getMessage( "hasta", ""), "", "", lblTextblockcombo_opecod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_opecod_to.setProperty("Caption", Combo_opecod_to_Caption);
         ucCombo_opecod_to.setProperty("Cls", Combo_opecod_to_Cls);
         ucCombo_opecod_to.setProperty("EmptyItemText", Combo_opecod_to_Emptyitemtext);
         ucCombo_opecod_to.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_opecod_to.setProperty("DropDownOptionsData", AV55OpeCod_to_Data);
         ucCombo_opecod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_opecod_to_Internalname, "COMBO_OPECOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTableintensidad_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcodfrom_Internalname, httpContext.getMessage( "Intensidad desde", ""), "", "", lblTextblockcombo_intcodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcodfrom.setProperty("Caption", Combo_intcodfrom_Caption);
         ucCombo_intcodfrom.setProperty("Cls", Combo_intcodfrom_Cls);
         ucCombo_intcodfrom.setProperty("EmptyItemText", Combo_intcodfrom_Emptyitemtext);
         ucCombo_intcodfrom.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_intcodfrom.setProperty("DropDownOptionsData", AV47IntCodFrom_Data);
         ucCombo_intcodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcodfrom_Internalname, "COMBO_INTCODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcodto_Internalname, httpContext.getMessage( "hasta", ""), "", "", lblTextblockcombo_intcodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcodto.setProperty("Caption", Combo_intcodto_Caption);
         ucCombo_intcodto.setProperty("Cls", Combo_intcodto_Cls);
         ucCombo_intcodto.setProperty("EmptyItemText", Combo_intcodto_Emptyitemtext);
         ucCombo_intcodto.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_intcodto.setProperty("DropDownOptionsData", AV48IntCodTo_Data);
         ucCombo_intcodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcodto_Internalname, "COMBO_INTCODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panel_filtrosmas.setProperty("Width", Dvpanel_panel_filtrosmas_Width);
         ucDvpanel_panel_filtrosmas.setProperty("AutoWidth", Dvpanel_panel_filtrosmas_Autowidth);
         ucDvpanel_panel_filtrosmas.setProperty("AutoHeight", Dvpanel_panel_filtrosmas_Autoheight);
         ucDvpanel_panel_filtrosmas.setProperty("Cls", Dvpanel_panel_filtrosmas_Cls);
         ucDvpanel_panel_filtrosmas.setProperty("Title", Dvpanel_panel_filtrosmas_Title);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsible", Dvpanel_panel_filtrosmas_Collapsible);
         ucDvpanel_panel_filtrosmas.setProperty("Collapsed", Dvpanel_panel_filtrosmas_Collapsed);
         ucDvpanel_panel_filtrosmas.setProperty("ShowCollapseIcon", Dvpanel_panel_filtrosmas_Showcollapseicon);
         ucDvpanel_panel_filtrosmas.setProperty("IconPosition", Dvpanel_panel_filtrosmas_Iconposition);
         ucDvpanel_panel_filtrosmas.setProperty("AutoScroll", Dvpanel_panel_filtrosmas_Autoscroll);
         ucDvpanel_panel_filtrosmas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_filtrosmas_Internalname, "DVPANEL_PANEL_FILTROSMASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_FILTROSMASContainer"+"Panel_FiltrosMas"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_filtrosmas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_masopciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Informe Resumen", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGroupinformeresumen_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_174_1WV2( true) ;
      }
      else
      {
         wb_table1_174_1WV2( false) ;
      }
      return  ;
   }

   public void wb_table1_174_1WV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOpcion.getInternalname(), httpContext.getMessage( "Opcion", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpcion, cmbavOpcion.getInternalname(), GXutil.trim( GXutil.str( AV20Opcion, 1, 0)), 1, cmbavOpcion.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOpcion.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "", true, (byte)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV20Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup3_Internalname, httpContext.getMessage( "Informe Detalle", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGroupinformedetalle_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         wb_table2_190_1WV2( true) ;
      }
      else
      {
         wb_table2_190_1WV2( false) ;
      }
      return  ;
   }

   public void wb_table2_190_1WV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         wb_table3_198_1WV2( true) ;
      }
      else
      {
         wb_table3_198_1WV2( false) ;
      }
      return  ;
   }

   public void wb_table3_198_1WV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table4_207_1WV2( true) ;
      }
      else
      {
         wb_table4_207_1WV2( false) ;
      }
      return  ;
   }

   public void wb_table4_207_1WV2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV16MaqCod), GXutil.rtrim( localUtil.format( AV16MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 238,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_to_Internalname, GXutil.rtrim( AV18MaqCod_to), GXutil.rtrim( localUtil.format( AV18MaqCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,238);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_to_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 240,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7CliCod_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,240);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFase_Internalname, GXutil.rtrim( AV34Fase), GXutil.rtrim( localUtil.format( AV34Fase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFase_Jsonclick, 0, "Attribute", "", "", "", "", edtavFase_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 242,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFase_to_Internalname, GXutil.rtrim( AV35Fase_to), GXutil.rtrim( localUtil.format( AV35Fase_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,242);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFase_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavFase_to_Visible, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, GXutil.ltrim( localUtil.ntoc( AV28OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV28OpeCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,243);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpecod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV29OpeCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29OpeCod_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavOpecod_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV26IntCodFrom, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV26IntCodFrom), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcodfrom_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV27IntCodTo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV27IntCodTo), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcodto_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1WV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informe de Producción Diaria", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WV0( ) ;
   }

   public void ws1WV2( )
   {
      start1WV2( ) ;
      evt1WV2( ) ;
   }

   public void evt1WV2( )
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
                           e111WV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e121WV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e131WV2 ();
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
                                 e141WV2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151WV2 ();
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

   public void we1WV2( )
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

   public void pa1WV2( )
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
            GX_FocusControl = edtavHisprodf_Internalname ;
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
      AV21Resumen = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV21Resumen, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Resumen", GXutil.str( AV21Resumen, 1, 0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV20Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV20Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Opcion", GXutil.str( AV20Opcion, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpcion.setValue( GXutil.trim( GXutil.str( AV20Opcion, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpcion.getInternalname(), "Values", cmbavOpcion.ToJavascriptSource(), true);
      }
      AV22SiDia = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV22SiDia, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
      AV23SiMaquina = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV23SiMaquina, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
      AV15ImprimirParos = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV15ImprimirParos, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1WV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "Produccion.InformeProduccionDiariaWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151WV2 ();
         wb1WV0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1WV2( )
   {
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "Produccion.InformeProduccionDiariaWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111WV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV10DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV17MaqCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_TO_DATA"), AV19MaqCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV6CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_TO_DATA"), AV8CliCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASE_DATA"), AV50Fase_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASE_TO_DATA"), AV51Fase_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPECOD_DATA"), AV49OpeCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vOPECOD_TO_DATA"), AV55OpeCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCODFROM_DATA"), AV47IntCodFrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCODTO_DATA"), AV48IntCodTo_Data);
         /* Read saved values. */
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_Emptyitemtext") ;
         Combo_maqcod_to_Cls = httpContext.cgiGet( "COMBO_MAQCOD_TO_Cls") ;
         Combo_maqcod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_TO_Selectedvalue_set") ;
         Combo_maqcod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQCOD_TO_Emptyitemtext") ;
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
         Combo_clicod_to_Cls = httpContext.cgiGet( "COMBO_CLICOD_TO_Cls") ;
         Combo_clicod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_TO_Selectedvalue_set") ;
         Combo_clicod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_TO_Emptyitemtext") ;
         Combo_fase_Cls = httpContext.cgiGet( "COMBO_FASE_Cls") ;
         Combo_fase_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASE_Selectedvalue_set") ;
         Combo_fase_Emptyitemtext = httpContext.cgiGet( "COMBO_FASE_Emptyitemtext") ;
         Combo_fase_to_Cls = httpContext.cgiGet( "COMBO_FASE_TO_Cls") ;
         Combo_fase_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASE_TO_Selectedvalue_set") ;
         Combo_fase_to_Emptyitemtext = httpContext.cgiGet( "COMBO_FASE_TO_Emptyitemtext") ;
         Combo_opecod_Cls = httpContext.cgiGet( "COMBO_OPECOD_Cls") ;
         Combo_opecod_Selectedvalue_set = httpContext.cgiGet( "COMBO_OPECOD_Selectedvalue_set") ;
         Combo_opecod_Emptyitemtext = httpContext.cgiGet( "COMBO_OPECOD_Emptyitemtext") ;
         Combo_opecod_to_Cls = httpContext.cgiGet( "COMBO_OPECOD_TO_Cls") ;
         Combo_opecod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_OPECOD_TO_Selectedvalue_set") ;
         Combo_opecod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_OPECOD_TO_Emptyitemtext") ;
         Combo_intcodfrom_Cls = httpContext.cgiGet( "COMBO_INTCODFROM_Cls") ;
         Combo_intcodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCODFROM_Selectedvalue_set") ;
         Combo_intcodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCODFROM_Emptyitemtext") ;
         Combo_intcodto_Cls = httpContext.cgiGet( "COMBO_INTCODTO_Cls") ;
         Combo_intcodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCODTO_Selectedvalue_set") ;
         Combo_intcodto_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCODTO_Emptyitemtext") ;
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
         Dvpanel_panel_filtrosmas_Width = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Width") ;
         Dvpanel_panel_filtrosmas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autowidth")) ;
         Dvpanel_panel_filtrosmas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoheight")) ;
         Dvpanel_panel_filtrosmas_Cls = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Cls") ;
         Dvpanel_panel_filtrosmas_Title = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Title") ;
         Dvpanel_panel_filtrosmas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsible")) ;
         Dvpanel_panel_filtrosmas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Collapsed")) ;
         Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Showcollapseicon")) ;
         Dvpanel_panel_filtrosmas_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Iconposition") ;
         Dvpanel_panel_filtrosmas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_FILTROSMAS_Autoscroll")) ;
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprodf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISPRODF");
            GX_FocusControl = edtavHisprodf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11HisProDf = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDf", localUtil.format(AV11HisProDf, "99/99/99"));
         }
         else
         {
            AV11HisProDf = localUtil.ctod( httpContext.cgiGet( edtavHisprodf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDf", localUtil.format(AV11HisProDf, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprohf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "vHISPROHF");
            GX_FocusControl = edtavHisprohf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13HisProHf = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV13HisProHf", localUtil.ttoc( AV13HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV13HisProHf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtavHisprohf_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13HisProHf", localUtil.ttoc( AV13HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprodf_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISPRODF_TO");
            GX_FocusControl = edtavHisprodf_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12HisProDf_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12HisProDf_to", localUtil.format(AV12HisProDf_to, "99/99/99"));
         }
         else
         {
            AV12HisProDf_to = localUtil.ctod( httpContext.cgiGet( edtavHisprodf_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12HisProDf_to", localUtil.format(AV12HisProDf_to, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisprohf_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "vHISPROHF_TO");
            GX_FocusControl = edtavHisprohf_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14HisProHf_to = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProHf_to", localUtil.ttoc( AV14HisProHf_to, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV14HisProHf_to = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtavHisprohf_to_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14HisProHf_to", localUtil.ttoc( AV14HisProHf_to, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV32BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32BarSer", AV32BarSer);
         AV33BarSer_to = httpContext.cgiGet( edtavBarser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarSer_to", AV33BarSer_to);
         AV30BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNom", AV30BarColNom);
         AV31BarColNom_to = httpContext.cgiGet( edtavBarcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31BarColNom_to", AV31BarColNom_to);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavResumen.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavResumen.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRESUMEN");
            GX_FocusControl = chkavResumen.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Resumen = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Resumen", GXutil.str( AV21Resumen, 1, 0));
         }
         else
         {
            AV21Resumen = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavResumen.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Resumen", GXutil.str( AV21Resumen, 1, 0));
         }
         cmbavOpcion.setValue( httpContext.cgiGet( cmbavOpcion.getInternalname()) );
         AV20Opcion = (byte)(GXutil.lval( httpContext.cgiGet( cmbavOpcion.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Opcion", GXutil.str( AV20Opcion, 1, 0));
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavSidia.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavSidia.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSIDIA");
            GX_FocusControl = chkavSidia.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22SiDia = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
         }
         else
         {
            AV22SiDia = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavSidia.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavSimaquina.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavSimaquina.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSIMAQUINA");
            GX_FocusControl = chkavSimaquina.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23SiMaquina = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
         }
         else
         {
            AV23SiMaquina = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavSimaquina.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavImprimirparos.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavImprimirparos.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vIMPRIMIRPAROS");
            GX_FocusControl = chkavImprimirparos.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15ImprimirParos = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
         }
         else
         {
            AV15ImprimirParos = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavImprimirparos.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
         }
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         AV16MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16MaqCod", AV16MaqCod);
         AV18MaqCod_to = httpContext.cgiGet( edtavMaqcod_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18MaqCod_to", AV18MaqCod_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
         }
         else
         {
            AV5CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_TO");
            GX_FocusControl = edtavClicod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod_to), 6, 0));
         }
         else
         {
            AV7CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod_to), 6, 0));
         }
         AV34Fase = httpContext.cgiGet( edtavFase_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34Fase", AV34Fase);
         AV35Fase_to = httpContext.cgiGet( edtavFase_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Fase_to", AV35Fase_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOPECOD");
            GX_FocusControl = edtavOpecod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28OpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
         }
         else
         {
            AV28OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOpecod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOPECOD_TO");
            GX_FocusControl = edtavOpecod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29OpeCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29OpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OpeCod_to), 6, 0));
         }
         else
         {
            AV29OpeCod_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavOpecod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29OpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OpeCod_to), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCODFROM");
            GX_FocusControl = edtavIntcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26IntCodFrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
         }
         else
         {
            AV26IntCodFrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCODTO");
            GX_FocusControl = edtavIntcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27IntCodTo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27IntCodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27IntCodTo), 2, 0));
         }
         else
         {
            AV27IntCodTo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27IntCodTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27IntCodTo), 2, 0));
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
      e111WV2 ();
      if (returnInSub) return;
   }

   public void e111WV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV39UsurCod = " " ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproducciondiariaww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV36EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char2[0] ;
      informeproducciondiariaww_impl.this.AV38EmprNom = GXv_char3[0] ;
      informeproducciondiariaww_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      GXt_char1 = AV40Horainicial ;
      GXv_char4[0] = AV36EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTI", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char4[0] ;
      informeproducciondiariaww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      AV40Horainicial = GXt_char1 ;
      AV40Horainicial = ((GXutil.strcmp("", AV40Horainicial)==0) ? "06:00:00" : AV40Horainicial) ;
      GXt_char1 = AV41Horafinal ;
      GXv_char4[0] = AV36EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTF", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char4[0] ;
      informeproducciondiariaww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      AV41Horafinal = GXt_char1 ;
      AV41Horafinal = ((GXutil.strcmp("", AV41Horafinal)==0) ? "05:59:00" : AV41Horafinal) ;
      AV13HisProHf = GXutil.resetDate(localUtil.ctot( AV40Horainicial, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13HisProHf", localUtil.ttoc( AV13HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV14HisProHf_to = GXutil.resetDate(localUtil.ctot( AV41Horafinal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14HisProHf_to", localUtil.ttoc( AV14HisProHf_to, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV11HisProDf = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11HisProDf", localUtil.format(AV11HisProDf, "99/99/99"));
      AV12HisProDf_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12HisProDf_to", localUtil.format(AV12HisProDf_to, "99/99/99"));
      AV43Fechahoraalfa = localUtil.dtoc( AV11HisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV13HisProHf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV42HisProdtf = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV44HisProdf_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12HisProDf_to)) ? GXutil.serverDate( context, remoteHandle, pr_default) : AV11HisProDf) ;
      AV43Fechahoraalfa = localUtil.dtoc( AV44HisProdf_to2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV14HisProHf_to, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV45HisProdtf_to2 = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV22SiDia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
      AV23SiMaquina = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
      AV15ImprimirParos = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
      AV21Resumen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Resumen", GXutil.str( AV21Resumen, 1, 0));
      AV20Opcion = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Opcion", GXutil.str( AV20Opcion, 1, 0));
      GXt_char1 = AV37Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      informeproducciondiariaww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Station = GXt_char1 ;
      GXv_char4[0] = AV36EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char2[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char3, GXv_char2) ;
      informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char4[0] ;
      informeproducciondiariaww_impl.this.AV38EmprNom = GXv_char3[0] ;
      informeproducciondiariaww_impl.this.AV39UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavIntcodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcodto_Visible), 5, 0), true);
      edtavIntcodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcodfrom_Visible), 5, 0), true);
      edtavOpecod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpecod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_to_Visible), 5, 0), true);
      edtavOpecod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOpecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOpecod_Visible), 5, 0), true);
      edtavFase_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_to_Visible), 5, 0), true);
      edtavFase_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFase_Visible), 5, 0), true);
      edtavClicod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_to_Visible), 5, 0), true);
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      edtavMaqcod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_to_Visible), 5, 0), true);
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMAQCOD_TO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD_TO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOFASE_TO' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOOPECOD' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOOPECOD_TO' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCODFROM' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCODTO' */
      S202 ();
      if (returnInSub) return;
   }

   public void e121WV2( )
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

   public void S202( )
   {
      /* 'LOADCOMBOINTCODTO' Routine */
      returnInSub = false ;
      AV48IntCodTo_Data.clear();
      /* Using cursor H01WV2 */
      pr_default.execute(0, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A14255IntAct = H01WV2_A14255IntAct[0] ;
         A396EmprCod = H01WV2_A396EmprCod[0] ;
         A583IntCod = H01WV2_A583IntCod[0] ;
         A584IntDsc = H01WV2_A584IntDsc[0] ;
         n584IntDsc = H01WV2_n584IntDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A583IntCod, 2, 0)), A584IntDsc, "", "", "", "", "", "", "") );
         AV48IntCodTo_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV48IntCodTo_Data.sort("Title");
      Combo_intcodto_Selectedvalue_set = ((0==AV27IntCodTo) ? "" : GXutil.trim( GXutil.str( AV27IntCodTo, 2, 0))) ;
      ucCombo_intcodto.sendProperty(context, "", false, Combo_intcodto_Internalname, "SelectedValue_set", Combo_intcodto_Selectedvalue_set);
   }

   public void S192( )
   {
      /* 'LOADCOMBOINTCODFROM' Routine */
      returnInSub = false ;
      AV47IntCodFrom_Data.clear();
      /* Using cursor H01WV3 */
      pr_default.execute(1, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A14255IntAct = H01WV3_A14255IntAct[0] ;
         A396EmprCod = H01WV3_A396EmprCod[0] ;
         A583IntCod = H01WV3_A583IntCod[0] ;
         A584IntDsc = H01WV3_A584IntDsc[0] ;
         n584IntDsc = H01WV3_n584IntDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A583IntCod, 2, 0)), A584IntDsc, "", "", "", "", "", "", "") );
         AV47IntCodFrom_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV47IntCodFrom_Data.sort("Title");
      Combo_intcodfrom_Selectedvalue_set = ((0==AV26IntCodFrom) ? "" : GXutil.trim( GXutil.str( AV26IntCodFrom, 2, 0))) ;
      ucCombo_intcodfrom.sendProperty(context, "", false, Combo_intcodfrom_Internalname, "SelectedValue_set", Combo_intcodfrom_Selectedvalue_set);
   }

   public void S182( )
   {
      /* 'LOADCOMBOOPECOD_TO' Routine */
      returnInSub = false ;
      AV55OpeCod_to_Data.clear();
      /* Using cursor H01WV4 */
      pr_default.execute(2, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8482OpeAct = H01WV4_A8482OpeAct[0] ;
         n8482OpeAct = H01WV4_n8482OpeAct[0] ;
         A396EmprCod = H01WV4_A396EmprCod[0] ;
         A652OpeCod = H01WV4_A652OpeCod[0] ;
         A653OpeNom = H01WV4_A653OpeNom[0] ;
         n653OpeNom = H01WV4_n653OpeNom[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A652OpeCod, 6, 0)), A653OpeNom, "", "", "", "", "", "", "") );
         AV55OpeCod_to_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV55OpeCod_to_Data.sort("Title");
      Combo_opecod_to_Selectedvalue_set = ((0==AV29OpeCod_to) ? "" : GXutil.trim( GXutil.str( AV29OpeCod_to, 6, 0))) ;
      ucCombo_opecod_to.sendProperty(context, "", false, Combo_opecod_to_Internalname, "SelectedValue_set", Combo_opecod_to_Selectedvalue_set);
   }

   public void S172( )
   {
      /* 'LOADCOMBOOPECOD' Routine */
      returnInSub = false ;
      AV49OpeCod_Data.clear();
      /* Using cursor H01WV5 */
      pr_default.execute(3, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8482OpeAct = H01WV5_A8482OpeAct[0] ;
         n8482OpeAct = H01WV5_n8482OpeAct[0] ;
         A396EmprCod = H01WV5_A396EmprCod[0] ;
         A652OpeCod = H01WV5_A652OpeCod[0] ;
         A653OpeNom = H01WV5_A653OpeNom[0] ;
         n653OpeNom = H01WV5_n653OpeNom[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A652OpeCod, 6, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A652OpeCod, 6, 0)), A653OpeNom, "", "", "", "", "", "", "") );
         AV49OpeCod_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV49OpeCod_Data.sort("Title");
      Combo_opecod_Selectedvalue_set = ((0==AV28OpeCod) ? "" : GXutil.trim( GXutil.str( AV28OpeCod, 6, 0))) ;
      ucCombo_opecod.sendProperty(context, "", false, Combo_opecod_Internalname, "SelectedValue_set", Combo_opecod_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LOADCOMBOFASE_TO' Routine */
      returnInSub = false ;
      AV51Fase_to_Data.clear();
      /* Using cursor H01WV6 */
      pr_default.execute(4, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14042FasActiva = H01WV6_A14042FasActiva[0] ;
         A396EmprCod = H01WV6_A396EmprCod[0] ;
         A457FasCod = H01WV6_A457FasCod[0] ;
         A460FasDsc = H01WV6_A460FasDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A457FasCod) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A457FasCod), A460FasDsc, "", "", "", "", "", "", "") );
         AV51Fase_to_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      AV51Fase_to_Data.sort("Title");
      Combo_fase_to_Selectedvalue_set = AV35Fase_to ;
      ucCombo_fase_to.sendProperty(context, "", false, Combo_fase_to_Internalname, "SelectedValue_set", Combo_fase_to_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOFASE' Routine */
      returnInSub = false ;
      AV50Fase_Data.clear();
      /* Using cursor H01WV7 */
      pr_default.execute(5, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A14042FasActiva = H01WV7_A14042FasActiva[0] ;
         A396EmprCod = H01WV7_A396EmprCod[0] ;
         A457FasCod = H01WV7_A457FasCod[0] ;
         A460FasDsc = H01WV7_A460FasDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A457FasCod) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A457FasCod), A460FasDsc, "", "", "", "", "", "", "") );
         AV50Fase_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      AV50Fase_Data.sort("Title");
      Combo_fase_Selectedvalue_set = AV34Fase ;
      ucCombo_fase.sendProperty(context, "", false, Combo_fase_Internalname, "SelectedValue_set", Combo_fase_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOCLICOD_TO' Routine */
      returnInSub = false ;
      AV8CliCod_to_Data.clear();
      /* Using cursor H01WV8 */
      pr_default.execute(6, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H01WV8_A10045CliAct[0] ;
         A396EmprCod = H01WV8_A396EmprCod[0] ;
         A252CliCod = H01WV8_A252CliCod[0] ;
         A279CliNom = H01WV8_A279CliNom[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
         AV8CliCod_to_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      AV8CliCod_to_Data.sort("Title");
      Combo_clicod_to_Selectedvalue_set = ((0==AV7CliCod_to) ? "" : GXutil.trim( GXutil.str( AV7CliCod_to, 6, 0))) ;
      ucCombo_clicod_to.sendProperty(context, "", false, Combo_clicod_to_Internalname, "SelectedValue_set", Combo_clicod_to_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      AV6CliCod_Data.clear();
      /* Using cursor H01WV9 */
      pr_default.execute(7, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10045CliAct = H01WV9_A10045CliAct[0] ;
         A396EmprCod = H01WV9_A396EmprCod[0] ;
         A252CliCod = H01WV9_A252CliCod[0] ;
         A279CliNom = H01WV9_A279CliNom[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A252CliCod, 6, 0)), A279CliNom, "", "", "", "", "", "", "") );
         AV6CliCod_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV6CliCod_Data.sort("Title");
      Combo_clicod_Selectedvalue_set = ((0==AV5CliCod) ? "" : GXutil.trim( GXutil.str( AV5CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOMAQCOD_TO' Routine */
      returnInSub = false ;
      AV19MaqCod_to_Data.clear();
      /* Using cursor H01WV10 */
      pr_default.execute(8, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A607MaqEst = H01WV10_A607MaqEst[0] ;
         n607MaqEst = H01WV10_n607MaqEst[0] ;
         A396EmprCod = H01WV10_A396EmprCod[0] ;
         A602MaqCod = H01WV10_A602MaqCod[0] ;
         A606MaqDsc = H01WV10_A606MaqDsc[0] ;
         n606MaqDsc = H01WV10_n606MaqDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV19MaqCod_to_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      AV19MaqCod_to_Data.sort("Title");
      Combo_maqcod_to_Selectedvalue_set = AV18MaqCod_to ;
      ucCombo_maqcod_to.sendProperty(context, "", false, Combo_maqcod_to_Internalname, "SelectedValue_set", Combo_maqcod_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV17MaqCod_Data.clear();
      /* Using cursor H01WV11 */
      pr_default.execute(9, new Object[] {AV36EmprCod});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A607MaqEst = H01WV11_A607MaqEst[0] ;
         n607MaqEst = H01WV11_n607MaqEst[0] ;
         A396EmprCod = H01WV11_A396EmprCod[0] ;
         A602MaqCod = H01WV11_A602MaqCod[0] ;
         A606MaqDsc = H01WV11_A606MaqDsc[0] ;
         n606MaqDsc = H01WV11_n606MaqDsc[0] ;
         AV9Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( A602MaqCod) );
         AV9Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.format( "%1-%2", GXutil.trim( A602MaqCod), A606MaqDsc, "", "", "", "", "", "", "") );
         AV17MaqCod_Data.add(AV9Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      AV17MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV16MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e131WV2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV44HisProdf_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12HisProDf_to)) ? GXutil.serverDate( context, remoteHandle, pr_default) : AV12HisProDf_to) ;
      AV64MaqCodfrom = ((GXutil.strcmp("", AV16MaqCod)==0) ? httpContext.getMessage( "AAZZ99", "") : AV16MaqCod) ;
      AV58MaqCod_to2 = ((GXutil.strcmp("", AV18MaqCod_to)==0) ? httpContext.getMessage( "ZZZZ99", "") : AV18MaqCod_to) ;
      AV43Fechahoraalfa = localUtil.dtoc( AV11HisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV13HisProHf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV42HisProdtf = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV43Fechahoraalfa = localUtil.dtoc( AV44HisProdf_to2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV14HisProHf_to, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV45HisProdtf_to2 = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV59Clicod_to2 = ((0==AV7CliCod_to) ? 999999 : AV7CliCod_to) ;
      AV52Barcolnom_to2 = ((GXutil.strcmp("", AV31BarColNom_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV31BarColNom_to) ;
      AV53Fase_to2 = ((GXutil.strcmp("", AV35Fase_to)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV35Fase_to) ;
      AV60Opecod_to2 = ((0==AV29OpeCod_to) ? 999999 : AV29OpeCod_to) ;
      AV54Barser_to2 = ((GXutil.strcmp("", AV33BarSer_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV33BarSer_to) ;
      AV61intcodto2 = (byte)(((0==AV27IntCodTo) ? 99 : AV27IntCodTo)) ;
      AV62WebSession.setValue("InformeProduccionDiariaWW", httpContext.getMessage( "FINALIZADO", ""));
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV63ProgressIndicator.show();
      if ( (0==AV21Resumen) )
      {
         GXv_char4[0] = AV56ExcelFilename ;
         GXv_char3[0] = AV57ErrorMessage ;
         new app.produccion.prddia00_usuwcexport(remoteHandle, context).execute( AV36EmprCod, AV64MaqCodfrom, AV58MaqCod_to2, AV42HisProdtf, AV45HisProdtf_to2, AV5CliCod, AV59Clicod_to2, AV30BarColNom, AV52Barcolnom_to2, AV34Fase, AV53Fase_to2, AV28OpeCod, AV60Opecod_to2, AV32BarSer, AV54Barser_to2, AV22SiDia, AV23SiMaquina, AV15ImprimirParos, AV26IntCodFrom, AV61intcodto2, GXv_char4, GXv_char3) ;
         informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char4[0] ;
         informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
         httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
         /* Execute user subroutine: 'FINBARRAPROGRESO' */
         S212 ();
         if (returnInSub) return;
      }
      else
      {
         if ( AV20Opcion == 1 )
         {
            GXv_char4[0] = AV36EmprCod ;
            GXv_char3[0] = AV64MaqCodfrom ;
            GXv_char2[0] = AV58MaqCod_to2 ;
            GXv_dtime7[0] = AV42HisProdtf ;
            GXv_dtime8[0] = AV45HisProdtf_to2 ;
            GXv_int9[0] = AV5CliCod ;
            GXv_int10[0] = AV59Clicod_to2 ;
            GXv_char11[0] = AV30BarColNom ;
            GXv_char12[0] = AV52Barcolnom_to2 ;
            GXv_char13[0] = AV34Fase ;
            GXv_char14[0] = AV53Fase_to2 ;
            GXv_int15[0] = AV28OpeCod ;
            GXv_int16[0] = AV60Opecod_to2 ;
            GXv_char17[0] = AV32BarSer ;
            GXv_char18[0] = AV54Barser_to2 ;
            GXv_int19[0] = AV22SiDia ;
            GXv_int20[0] = AV23SiMaquina ;
            GXv_int21[0] = AV15ImprimirParos ;
            GXv_int22[0] = AV26IntCodFrom ;
            GXv_int23[0] = AV61intcodto2 ;
            GXv_char24[0] = AV56ExcelFilename ;
            GXv_char25[0] = AV57ErrorMessage ;
            new app.produccion.prddia1_usuwcexport(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_dtime7, GXv_dtime8, GXv_int9, GXv_int10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_int20, GXv_int21, GXv_int22, GXv_int23, GXv_char24, GXv_char25) ;
            informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char4[0] ;
            informeproducciondiariaww_impl.this.AV64MaqCodfrom = GXv_char3[0] ;
            informeproducciondiariaww_impl.this.AV58MaqCod_to2 = GXv_char2[0] ;
            informeproducciondiariaww_impl.this.AV42HisProdtf = GXv_dtime7[0] ;
            informeproducciondiariaww_impl.this.AV45HisProdtf_to2 = GXv_dtime8[0] ;
            informeproducciondiariaww_impl.this.AV5CliCod = GXv_int9[0] ;
            informeproducciondiariaww_impl.this.AV59Clicod_to2 = GXv_int10[0] ;
            informeproducciondiariaww_impl.this.AV30BarColNom = GXv_char11[0] ;
            informeproducciondiariaww_impl.this.AV52Barcolnom_to2 = GXv_char12[0] ;
            informeproducciondiariaww_impl.this.AV34Fase = GXv_char13[0] ;
            informeproducciondiariaww_impl.this.AV53Fase_to2 = GXv_char14[0] ;
            informeproducciondiariaww_impl.this.AV28OpeCod = GXv_int15[0] ;
            informeproducciondiariaww_impl.this.AV60Opecod_to2 = GXv_int16[0] ;
            informeproducciondiariaww_impl.this.AV32BarSer = GXv_char17[0] ;
            informeproducciondiariaww_impl.this.AV54Barser_to2 = GXv_char18[0] ;
            informeproducciondiariaww_impl.this.AV22SiDia = GXv_int19[0] ;
            informeproducciondiariaww_impl.this.AV23SiMaquina = GXv_int20[0] ;
            informeproducciondiariaww_impl.this.AV15ImprimirParos = GXv_int21[0] ;
            informeproducciondiariaww_impl.this.AV26IntCodFrom = GXv_int22[0] ;
            informeproducciondiariaww_impl.this.AV61intcodto2 = GXv_int23[0] ;
            informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char24[0] ;
            informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char25[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNom", AV30BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Fase", AV34Fase);
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSer", AV32BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
            httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
            /* Execute user subroutine: 'FINBARRAPROGRESO' */
            S212 ();
            if (returnInSub) return;
         }
         else
         {
            GXv_char25[0] = AV36EmprCod ;
            GXv_char24[0] = AV64MaqCodfrom ;
            GXv_char18[0] = AV58MaqCod_to2 ;
            GXv_dtime8[0] = AV42HisProdtf ;
            GXv_dtime7[0] = AV45HisProdtf_to2 ;
            GXv_int16[0] = AV5CliCod ;
            GXv_int15[0] = AV59Clicod_to2 ;
            GXv_char17[0] = AV30BarColNom ;
            GXv_char14[0] = AV52Barcolnom_to2 ;
            GXv_char13[0] = AV34Fase ;
            GXv_char12[0] = AV53Fase_to2 ;
            GXv_int10[0] = AV28OpeCod ;
            GXv_int9[0] = AV60Opecod_to2 ;
            GXv_char11[0] = AV32BarSer ;
            GXv_char4[0] = AV54Barser_to2 ;
            GXv_int23[0] = AV22SiDia ;
            GXv_int22[0] = AV23SiMaquina ;
            GXv_int21[0] = AV15ImprimirParos ;
            GXv_int20[0] = AV26IntCodFrom ;
            GXv_int19[0] = AV61intcodto2 ;
            GXv_char3[0] = AV56ExcelFilename ;
            GXv_char2[0] = AV57ErrorMessage ;
            new app.produccion.prddia2_usuwcexport(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_char18, GXv_dtime8, GXv_dtime7, GXv_int16, GXv_int15, GXv_char17, GXv_char14, GXv_char13, GXv_char12, GXv_int10, GXv_int9, GXv_char11, GXv_char4, GXv_int23, GXv_int22, GXv_int21, GXv_int20, GXv_int19, GXv_char3, GXv_char2) ;
            informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char25[0] ;
            informeproducciondiariaww_impl.this.AV64MaqCodfrom = GXv_char24[0] ;
            informeproducciondiariaww_impl.this.AV58MaqCod_to2 = GXv_char18[0] ;
            informeproducciondiariaww_impl.this.AV42HisProdtf = GXv_dtime8[0] ;
            informeproducciondiariaww_impl.this.AV45HisProdtf_to2 = GXv_dtime7[0] ;
            informeproducciondiariaww_impl.this.AV5CliCod = GXv_int16[0] ;
            informeproducciondiariaww_impl.this.AV59Clicod_to2 = GXv_int15[0] ;
            informeproducciondiariaww_impl.this.AV30BarColNom = GXv_char17[0] ;
            informeproducciondiariaww_impl.this.AV52Barcolnom_to2 = GXv_char14[0] ;
            informeproducciondiariaww_impl.this.AV34Fase = GXv_char13[0] ;
            informeproducciondiariaww_impl.this.AV53Fase_to2 = GXv_char12[0] ;
            informeproducciondiariaww_impl.this.AV28OpeCod = GXv_int10[0] ;
            informeproducciondiariaww_impl.this.AV60Opecod_to2 = GXv_int9[0] ;
            informeproducciondiariaww_impl.this.AV32BarSer = GXv_char11[0] ;
            informeproducciondiariaww_impl.this.AV54Barser_to2 = GXv_char4[0] ;
            informeproducciondiariaww_impl.this.AV22SiDia = GXv_int23[0] ;
            informeproducciondiariaww_impl.this.AV23SiMaquina = GXv_int22[0] ;
            informeproducciondiariaww_impl.this.AV15ImprimirParos = GXv_int21[0] ;
            informeproducciondiariaww_impl.this.AV26IntCodFrom = GXv_int20[0] ;
            informeproducciondiariaww_impl.this.AV61intcodto2 = GXv_int19[0] ;
            informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char3[0] ;
            informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNom", AV30BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Fase", AV34Fase);
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSer", AV32BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
            httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
            /* Execute user subroutine: 'FINBARRAPROGRESO' */
            S212 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(AV56ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV56ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV57ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ProgressIndicator", AV63ProgressIndicator);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e141WV2 ();
      if (returnInSub) return;
   }

   public void e141WV2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV44HisProdf_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12HisProDf_to)) ? GXutil.serverDate( context, remoteHandle, pr_default) : AV12HisProDf_to) ;
      AV64MaqCodfrom = ((GXutil.strcmp("", AV16MaqCod)==0) ? httpContext.getMessage( "AAZZ99", "") : AV16MaqCod) ;
      AV58MaqCod_to2 = ((GXutil.strcmp("", AV18MaqCod_to)==0) ? httpContext.getMessage( "ZZZZ99", "") : AV18MaqCod_to) ;
      AV43Fechahoraalfa = localUtil.dtoc( AV11HisProDf, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV13HisProHf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV42HisProdtf = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV43Fechahoraalfa = localUtil.dtoc( AV44HisProdf_to2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV14HisProHf_to, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV45HisProdtf_to2 = localUtil.ctot( AV43Fechahoraalfa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV59Clicod_to2 = ((0==AV7CliCod_to) ? 999999 : AV7CliCod_to) ;
      AV52Barcolnom_to2 = ((GXutil.strcmp("", AV31BarColNom_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV31BarColNom_to) ;
      AV53Fase_to2 = ((GXutil.strcmp("", AV35Fase_to)==0) ? httpContext.getMessage( "zzzzzzzz", "") : AV35Fase_to) ;
      AV60Opecod_to2 = ((0==AV29OpeCod_to) ? 999999 : AV29OpeCod_to) ;
      AV54Barser_to2 = ((GXutil.strcmp("", AV33BarSer_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV33BarSer_to) ;
      AV61intcodto2 = (byte)(((0==AV27IntCodTo) ? 99 : AV27IntCodTo)) ;
      AV62WebSession.setValue("InformeProduccionDiariaWW", httpContext.getMessage( "FINALIZADO", ""));
      AV63ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV63ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV63ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV63ProgressIndicator.show();
      if ( (0==AV21Resumen) )
      {
         GXv_char25[0] = AV56ExcelFilename ;
         GXv_char24[0] = AV57ErrorMessage ;
         new app.produccion.prddia00_usuwcexport(remoteHandle, context).execute( AV36EmprCod, AV64MaqCodfrom, AV58MaqCod_to2, AV42HisProdtf, AV45HisProdtf_to2, AV5CliCod, AV59Clicod_to2, AV30BarColNom, AV52Barcolnom_to2, AV34Fase, AV53Fase_to2, AV28OpeCod, AV60Opecod_to2, AV32BarSer, AV54Barser_to2, AV22SiDia, AV23SiMaquina, AV15ImprimirParos, AV26IntCodFrom, AV61intcodto2, GXv_char25, GXv_char24) ;
         informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char25[0] ;
         informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
         httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
         /* Execute user subroutine: 'FINBARRAPROGRESO' */
         S212 ();
         if (returnInSub) return;
      }
      else
      {
         if ( AV20Opcion == 1 )
         {
            GXv_char25[0] = AV36EmprCod ;
            GXv_char24[0] = AV64MaqCodfrom ;
            GXv_char18[0] = AV58MaqCod_to2 ;
            GXv_dtime8[0] = AV42HisProdtf ;
            GXv_dtime7[0] = AV45HisProdtf_to2 ;
            GXv_int16[0] = AV5CliCod ;
            GXv_int15[0] = AV59Clicod_to2 ;
            GXv_char17[0] = AV30BarColNom ;
            GXv_char14[0] = AV52Barcolnom_to2 ;
            GXv_char13[0] = AV34Fase ;
            GXv_char12[0] = AV53Fase_to2 ;
            GXv_int10[0] = AV28OpeCod ;
            GXv_int9[0] = AV60Opecod_to2 ;
            GXv_char11[0] = AV32BarSer ;
            GXv_char4[0] = AV54Barser_to2 ;
            GXv_int23[0] = AV22SiDia ;
            GXv_int22[0] = AV23SiMaquina ;
            GXv_int21[0] = AV15ImprimirParos ;
            GXv_int20[0] = AV26IntCodFrom ;
            GXv_int19[0] = AV61intcodto2 ;
            GXv_char3[0] = AV56ExcelFilename ;
            GXv_char2[0] = AV57ErrorMessage ;
            new app.produccion.prddia1_usuwcexport(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_char18, GXv_dtime8, GXv_dtime7, GXv_int16, GXv_int15, GXv_char17, GXv_char14, GXv_char13, GXv_char12, GXv_int10, GXv_int9, GXv_char11, GXv_char4, GXv_int23, GXv_int22, GXv_int21, GXv_int20, GXv_int19, GXv_char3, GXv_char2) ;
            informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char25[0] ;
            informeproducciondiariaww_impl.this.AV64MaqCodfrom = GXv_char24[0] ;
            informeproducciondiariaww_impl.this.AV58MaqCod_to2 = GXv_char18[0] ;
            informeproducciondiariaww_impl.this.AV42HisProdtf = GXv_dtime8[0] ;
            informeproducciondiariaww_impl.this.AV45HisProdtf_to2 = GXv_dtime7[0] ;
            informeproducciondiariaww_impl.this.AV5CliCod = GXv_int16[0] ;
            informeproducciondiariaww_impl.this.AV59Clicod_to2 = GXv_int15[0] ;
            informeproducciondiariaww_impl.this.AV30BarColNom = GXv_char17[0] ;
            informeproducciondiariaww_impl.this.AV52Barcolnom_to2 = GXv_char14[0] ;
            informeproducciondiariaww_impl.this.AV34Fase = GXv_char13[0] ;
            informeproducciondiariaww_impl.this.AV53Fase_to2 = GXv_char12[0] ;
            informeproducciondiariaww_impl.this.AV28OpeCod = GXv_int10[0] ;
            informeproducciondiariaww_impl.this.AV60Opecod_to2 = GXv_int9[0] ;
            informeproducciondiariaww_impl.this.AV32BarSer = GXv_char11[0] ;
            informeproducciondiariaww_impl.this.AV54Barser_to2 = GXv_char4[0] ;
            informeproducciondiariaww_impl.this.AV22SiDia = GXv_int23[0] ;
            informeproducciondiariaww_impl.this.AV23SiMaquina = GXv_int22[0] ;
            informeproducciondiariaww_impl.this.AV15ImprimirParos = GXv_int21[0] ;
            informeproducciondiariaww_impl.this.AV26IntCodFrom = GXv_int20[0] ;
            informeproducciondiariaww_impl.this.AV61intcodto2 = GXv_int19[0] ;
            informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char3[0] ;
            informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNom", AV30BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Fase", AV34Fase);
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSer", AV32BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
            httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
            /* Execute user subroutine: 'FINBARRAPROGRESO' */
            S212 ();
            if (returnInSub) return;
         }
         else
         {
            GXv_char25[0] = AV36EmprCod ;
            GXv_char24[0] = AV64MaqCodfrom ;
            GXv_char18[0] = AV58MaqCod_to2 ;
            GXv_dtime8[0] = AV42HisProdtf ;
            GXv_dtime7[0] = AV45HisProdtf_to2 ;
            GXv_int16[0] = AV5CliCod ;
            GXv_int15[0] = AV59Clicod_to2 ;
            GXv_char17[0] = AV30BarColNom ;
            GXv_char14[0] = AV52Barcolnom_to2 ;
            GXv_char13[0] = AV34Fase ;
            GXv_char12[0] = AV53Fase_to2 ;
            GXv_int10[0] = AV28OpeCod ;
            GXv_int9[0] = AV60Opecod_to2 ;
            GXv_char11[0] = AV32BarSer ;
            GXv_char4[0] = AV54Barser_to2 ;
            GXv_int23[0] = AV22SiDia ;
            GXv_int22[0] = AV23SiMaquina ;
            GXv_int21[0] = AV15ImprimirParos ;
            GXv_int20[0] = AV26IntCodFrom ;
            GXv_int19[0] = AV61intcodto2 ;
            GXv_char3[0] = AV56ExcelFilename ;
            GXv_char2[0] = AV57ErrorMessage ;
            new app.produccion.prddia2_usuwcexport(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_char18, GXv_dtime8, GXv_dtime7, GXv_int16, GXv_int15, GXv_char17, GXv_char14, GXv_char13, GXv_char12, GXv_int10, GXv_int9, GXv_char11, GXv_char4, GXv_int23, GXv_int22, GXv_int21, GXv_int20, GXv_int19, GXv_char3, GXv_char2) ;
            informeproducciondiariaww_impl.this.AV36EmprCod = GXv_char25[0] ;
            informeproducciondiariaww_impl.this.AV64MaqCodfrom = GXv_char24[0] ;
            informeproducciondiariaww_impl.this.AV58MaqCod_to2 = GXv_char18[0] ;
            informeproducciondiariaww_impl.this.AV42HisProdtf = GXv_dtime8[0] ;
            informeproducciondiariaww_impl.this.AV45HisProdtf_to2 = GXv_dtime7[0] ;
            informeproducciondiariaww_impl.this.AV5CliCod = GXv_int16[0] ;
            informeproducciondiariaww_impl.this.AV59Clicod_to2 = GXv_int15[0] ;
            informeproducciondiariaww_impl.this.AV30BarColNom = GXv_char17[0] ;
            informeproducciondiariaww_impl.this.AV52Barcolnom_to2 = GXv_char14[0] ;
            informeproducciondiariaww_impl.this.AV34Fase = GXv_char13[0] ;
            informeproducciondiariaww_impl.this.AV53Fase_to2 = GXv_char12[0] ;
            informeproducciondiariaww_impl.this.AV28OpeCod = GXv_int10[0] ;
            informeproducciondiariaww_impl.this.AV60Opecod_to2 = GXv_int9[0] ;
            informeproducciondiariaww_impl.this.AV32BarSer = GXv_char11[0] ;
            informeproducciondiariaww_impl.this.AV54Barser_to2 = GXv_char4[0] ;
            informeproducciondiariaww_impl.this.AV22SiDia = GXv_int23[0] ;
            informeproducciondiariaww_impl.this.AV23SiMaquina = GXv_int22[0] ;
            informeproducciondiariaww_impl.this.AV15ImprimirParos = GXv_int21[0] ;
            informeproducciondiariaww_impl.this.AV26IntCodFrom = GXv_int20[0] ;
            informeproducciondiariaww_impl.this.AV61intcodto2 = GXv_int19[0] ;
            informeproducciondiariaww_impl.this.AV56ExcelFilename = GXv_char3[0] ;
            informeproducciondiariaww_impl.this.AV57ErrorMessage = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36EmprCod", AV36EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV5CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarColNom", AV30BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV34Fase", AV34Fase);
            httpContext.ajax_rsp_assign_attri("", false, "AV28OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28OpeCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarSer", AV32BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV26IntCodFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26IntCodFrom), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV56ExcelFilename", AV56ExcelFilename);
            httpContext.ajax_rsp_assign_attri("", false, "AV57ErrorMessage", AV57ErrorMessage);
            /* Execute user subroutine: 'FINBARRAPROGRESO' */
            S212 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(AV56ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV56ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV57ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ProgressIndicator", AV63ProgressIndicator);
   }

   public void S212( )
   {
      /* 'FINBARRAPROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV62WebSession.getValue("InformeProduccionDiariaWW"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV62WebSession.remove("InformeProduccionDiariaWW");
         AV63ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV63ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV63ProgressIndicator.hide();
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e151WV2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table4_207_1WV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedimprimirparos_Internalname, tblTablemergedimprimirparos_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavImprimirparos.getInternalname(), httpContext.getMessage( "Imprimir Paros?", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavImprimirparos.getInternalname(), GXutil.str( AV15ImprimirParos, 1, 0), "", httpContext.getMessage( "Imprimir Paros?", ""), 1, chkavImprimirparos.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(211, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImprimirparos_righttext_Internalname, httpContext.getMessage( "Imprimir Paros?", ""), "", "", lblImprimirparos_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_207_1WV2e( true) ;
      }
      else
      {
         wb_table4_207_1WV2e( false) ;
      }
   }

   public void wb_table3_198_1WV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedsimaquina_Internalname, tblTablemergedsimaquina_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavSimaquina.getInternalname(), httpContext.getMessage( "Total por Maquina?", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSimaquina.getInternalname(), GXutil.str( AV23SiMaquina, 1, 0), "", httpContext.getMessage( "Total por Maquina?", ""), 1, chkavSimaquina.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(202, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,202);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSimaquina_righttext_Internalname, httpContext.getMessage( "Total por Maquina?", ""), "", "", lblSimaquina_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_198_1WV2e( true) ;
      }
      else
      {
         wb_table3_198_1WV2e( false) ;
      }
   }

   public void wb_table2_190_1WV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedsidia_Internalname, tblTablemergedsidia_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavSidia.getInternalname(), httpContext.getMessage( "Total por Dia?", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSidia.getInternalname(), GXutil.str( AV22SiDia, 1, 0), "", httpContext.getMessage( "Total por Dia?", ""), 1, chkavSidia.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(194, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblSidia_righttext_Internalname, httpContext.getMessage( "Total por Dia?", ""), "", "", lblSidia_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_190_1WV2e( true) ;
      }
      else
      {
         wb_table2_190_1WV2e( false) ;
      }
   }

   public void wb_table1_174_1WV2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedresumen_Internalname, tblTablemergedresumen_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavResumen.getInternalname(), httpContext.getMessage( "Informe Resumen", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavResumen.getInternalname(), GXutil.str( AV21Resumen, 1, 0), "", httpContext.getMessage( "Informe Resumen", ""), 1, chkavResumen.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(178, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblResumen_righttext_Internalname, httpContext.getMessage( "Informe Resumen", ""), "", "", lblResumen_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionDiariaWW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_174_1WV2e( true) ;
      }
      else
      {
         wb_table1_174_1WV2e( false) ;
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
      pa1WV2( ) ;
      ws1WV2( ) ;
      we1WV2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714195643", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproducciondiariaww.js", "?202681714195643", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      lblTextblockcombo_maqcod_to_Internalname = "TEXTBLOCKCOMBO_MAQCOD_TO" ;
      Combo_maqcod_to_Internalname = "COMBO_MAQCOD_TO" ;
      divTablesplittedmaqcod_to_Internalname = "TABLESPLITTEDMAQCOD_TO" ;
      divTablemaq_Internalname = "TABLEMAQ" ;
      edtavHisprodf_Internalname = "vHISPRODF" ;
      edtavHisprohf_Internalname = "vHISPROHF" ;
      edtavHisprodf_to_Internalname = "vHISPRODF_TO" ;
      edtavHisprohf_to_Internalname = "vHISPROHF_TO" ;
      divTabledate_Internalname = "TABLEDATE" ;
      lblTextblockcombo_clicod_Internalname = "TEXTBLOCKCOMBO_CLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockcombo_clicod_to_Internalname = "TEXTBLOCKCOMBO_CLICOD_TO" ;
      Combo_clicod_to_Internalname = "COMBO_CLICOD_TO" ;
      divTablesplittedclicod_to_Internalname = "TABLESPLITTEDCLICOD_TO" ;
      divTableclient_Internalname = "TABLECLIENT" ;
      lblTextblockcombo_fase_Internalname = "TEXTBLOCKCOMBO_FASE" ;
      Combo_fase_Internalname = "COMBO_FASE" ;
      divTablesplittedfase_Internalname = "TABLESPLITTEDFASE" ;
      lblTextblockcombo_fase_to_Internalname = "TEXTBLOCKCOMBO_FASE_TO" ;
      Combo_fase_to_Internalname = "COMBO_FASE_TO" ;
      divTablesplittedfase_to_Internalname = "TABLESPLITTEDFASE_TO" ;
      divTablefases_Internalname = "TABLEFASES" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarser_to_Internalname = "vBARSER_TO" ;
      divTablearticulos_Internalname = "TABLEARTICULOS" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnom_to_Internalname = "vBARCOLNOM_TO" ;
      divTablecolores_Internalname = "TABLECOLORES" ;
      lblTextblockcombo_opecod_Internalname = "TEXTBLOCKCOMBO_OPECOD" ;
      Combo_opecod_Internalname = "COMBO_OPECOD" ;
      divTablesplittedopecod_Internalname = "TABLESPLITTEDOPECOD" ;
      lblTextblockcombo_opecod_to_Internalname = "TEXTBLOCKCOMBO_OPECOD_TO" ;
      Combo_opecod_to_Internalname = "COMBO_OPECOD_TO" ;
      divTablesplittedopecod_to_Internalname = "TABLESPLITTEDOPECOD_TO" ;
      divTableoperarios_Internalname = "TABLEOPERARIOS" ;
      lblTextblockcombo_intcodfrom_Internalname = "TEXTBLOCKCOMBO_INTCODFROM" ;
      Combo_intcodfrom_Internalname = "COMBO_INTCODFROM" ;
      divTablesplittedintcodfrom_Internalname = "TABLESPLITTEDINTCODFROM" ;
      lblTextblockcombo_intcodto_Internalname = "TEXTBLOCKCOMBO_INTCODTO" ;
      Combo_intcodto_Internalname = "COMBO_INTCODTO" ;
      divTablesplittedintcodto_Internalname = "TABLESPLITTEDINTCODTO" ;
      divTableintensidad_Internalname = "TABLEINTENSIDAD" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      chkavResumen.setInternalname( "vRESUMEN" );
      lblResumen_righttext_Internalname = "RESUMEN_RIGHTTEXT" ;
      tblTablemergedresumen_Internalname = "TABLEMERGEDRESUMEN" ;
      cmbavOpcion.setInternalname( "vOPCION" );
      divGroupinformeresumen_Internalname = "GROUPINFORMERESUMEN" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      chkavSidia.setInternalname( "vSIDIA" );
      lblSidia_righttext_Internalname = "SIDIA_RIGHTTEXT" ;
      tblTablemergedsidia_Internalname = "TABLEMERGEDSIDIA" ;
      chkavSimaquina.setInternalname( "vSIMAQUINA" );
      lblSimaquina_righttext_Internalname = "SIMAQUINA_RIGHTTEXT" ;
      tblTablemergedsimaquina_Internalname = "TABLEMERGEDSIMAQUINA" ;
      chkavImprimirparos.setInternalname( "vIMPRIMIRPAROS" );
      lblImprimirparos_righttext_Internalname = "IMPRIMIRPAROS_RIGHTTEXT" ;
      tblTablemergedimprimirparos_Internalname = "TABLEMERGEDIMPRIMIRPAROS" ;
      divGroupinformedetalle_Internalname = "GROUPINFORMEDETALLE" ;
      grpUnnamedgroup3_Internalname = "UNNAMEDGROUP3" ;
      divTable_masopciones_Internalname = "TABLE_MASOPCIONES" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqcod_to_Internalname = "vMAQCOD_TO" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      edtavFase_Internalname = "vFASE" ;
      edtavFase_to_Internalname = "vFASE_TO" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavOpecod_to_Internalname = "vOPECOD_TO" ;
      edtavIntcodfrom_Internalname = "vINTCODFROM" ;
      edtavIntcodto_Internalname = "vINTCODTO" ;
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
      chkavResumen.setEnabled( 1 );
      chkavSidia.setEnabled( 1 );
      chkavSimaquina.setEnabled( 1 );
      chkavImprimirparos.setEnabled( 1 );
      edtavIntcodto_Jsonclick = "" ;
      edtavIntcodto_Visible = 1 ;
      edtavIntcodfrom_Jsonclick = "" ;
      edtavIntcodfrom_Visible = 1 ;
      edtavOpecod_to_Jsonclick = "" ;
      edtavOpecod_to_Visible = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Visible = 1 ;
      edtavFase_to_Jsonclick = "" ;
      edtavFase_to_Visible = 1 ;
      edtavFase_Jsonclick = "" ;
      edtavFase_Visible = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Visible = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavMaqcod_to_Jsonclick = "" ;
      edtavMaqcod_to_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavOpcion.setJsonclick( "" );
      cmbavOpcion.setEnabled( 1 );
      Combo_intcodto_Caption = "" ;
      Combo_intcodfrom_Caption = "" ;
      Combo_opecod_to_Caption = "" ;
      Combo_opecod_Caption = "" ;
      edtavBarcolnom_to_Jsonclick = "" ;
      edtavBarcolnom_to_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_to_Jsonclick = "" ;
      edtavBarser_to_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      Combo_fase_to_Caption = "" ;
      Combo_fase_Caption = "" ;
      Combo_clicod_to_Caption = "" ;
      Combo_clicod_Caption = "" ;
      edtavHisprohf_to_Jsonclick = "" ;
      edtavHisprohf_to_Enabled = 1 ;
      edtavHisprodf_to_Jsonclick = "" ;
      edtavHisprodf_to_Enabled = 1 ;
      edtavHisprohf_Jsonclick = "" ;
      edtavHisprohf_Enabled = 1 ;
      edtavHisprodf_Jsonclick = "" ;
      edtavHisprodf_Enabled = 1 ;
      Combo_maqcod_to_Caption = "" ;
      Combo_maqcod_Caption = "" ;
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
      Dvpanel_panel_filtrosmas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Iconposition = "Right" ;
      Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Title = httpContext.getMessage( "Opciones", "") ;
      Dvpanel_panel_filtrosmas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosmas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Width = "100%" ;
      Dvpanel_panel_filtrosgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Iconposition = "Right" ;
      Dvpanel_panel_filtrosgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panel_filtrosgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosgenerales_Width = "100%" ;
      Combo_intcodto_Emptyitemtext = "Todas" ;
      Combo_intcodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_intcodfrom_Emptyitemtext = "Todas" ;
      Combo_intcodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Combo_opecod_to_Emptyitemtext = "Todos" ;
      Combo_opecod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_opecod_Emptyitemtext = "Todos" ;
      Combo_opecod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fase_to_Emptyitemtext = "Todas" ;
      Combo_fase_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fase_Emptyitemtext = "Todas" ;
      Combo_fase_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_to_Emptyitemtext = "Todos" ;
      Combo_clicod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitemtext = "Todos" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_to_Emptyitemtext = "Todas" ;
      Combo_maqcod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_maqcod_Emptyitemtext = "Todas" ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informe de Producción Diaria", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavResumen.setName( "vRESUMEN" );
      chkavResumen.setWebtags( "" );
      chkavResumen.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavResumen.getInternalname(), "TitleCaption", chkavResumen.getCaption(), true);
      chkavResumen.setCheckedValue( "0" );
      AV21Resumen = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV21Resumen, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Resumen", GXutil.str( AV21Resumen, 1, 0));
      cmbavOpcion.setName( "vOPCION" );
      cmbavOpcion.setWebtags( "" );
      cmbavOpcion.addItem("1", httpContext.getMessage( "Resumen Maquina-Dia", ""), (short)(0));
      cmbavOpcion.addItem("2", httpContext.getMessage( "Resumen Dia-Maquina", ""), (short)(0));
      if ( cmbavOpcion.getItemCount() > 0 )
      {
         AV20Opcion = (byte)(GXutil.lval( cmbavOpcion.getValidValue(GXutil.trim( GXutil.str( AV20Opcion, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Opcion", GXutil.str( AV20Opcion, 1, 0));
      }
      chkavSidia.setName( "vSIDIA" );
      chkavSidia.setWebtags( "" );
      chkavSidia.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSidia.getInternalname(), "TitleCaption", chkavSidia.getCaption(), true);
      chkavSidia.setCheckedValue( "0" );
      AV22SiDia = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV22SiDia, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22SiDia", GXutil.str( AV22SiDia, 1, 0));
      chkavSimaquina.setName( "vSIMAQUINA" );
      chkavSimaquina.setWebtags( "" );
      chkavSimaquina.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSimaquina.getInternalname(), "TitleCaption", chkavSimaquina.getCaption(), true);
      chkavSimaquina.setCheckedValue( "0" );
      AV23SiMaquina = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV23SiMaquina, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23SiMaquina", GXutil.str( AV23SiMaquina, 1, 0));
      chkavImprimirparos.setName( "vIMPRIMIRPAROS" );
      chkavImprimirparos.setWebtags( "" );
      chkavImprimirparos.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavImprimirparos.getInternalname(), "TitleCaption", chkavImprimirparos.getCaption(), true);
      chkavImprimirparos.setCheckedValue( "0" );
      AV15ImprimirParos = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV15ImprimirParos, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ImprimirParos", GXutil.str( AV15ImprimirParos, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV21Resumen',fld:'vRESUMEN',pic:'9'},{av:'AV22SiDia',fld:'vSIDIA',pic:'9'},{av:'AV23SiMaquina',fld:'vSIMAQUINA',pic:'9'},{av:'AV15ImprimirParos',fld:'vIMPRIMIRPAROS',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e121WV2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e131WV2',iparms:[{av:'AV12HisProDf_to',fld:'vHISPRODF_TO',pic:''},{av:'AV16MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV11HisProDf',fld:'vHISPRODF',pic:''},{av:'AV13HisProHf',fld:'vHISPROHF',pic:'99:99'},{av:'AV14HisProHf_to',fld:'vHISPROHF_TO',pic:'99:99'},{av:'AV7CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV35Fase_to',fld:'vFASE_TO',pic:''},{av:'AV29OpeCod_to',fld:'vOPECOD_TO',pic:'ZZZZZ9'},{av:'AV33BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV27IntCodTo',fld:'vINTCODTO',pic:'Z9'},{av:'AV21Resumen',fld:'vRESUMEN',pic:'9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV30BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV34Fase',fld:'vFASE',pic:''},{av:'AV28OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV32BarSer',fld:'vBARSER',pic:''},{av:'AV22SiDia',fld:'vSIDIA',pic:'9'},{av:'AV23SiMaquina',fld:'vSIMAQUINA',pic:'9'},{av:'AV15ImprimirParos',fld:'vIMPRIMIRPAROS',pic:'9'},{av:'AV26IntCodFrom',fld:'vINTCODFROM',pic:'Z9'},{av:'cmbavOpcion'},{av:'AV20Opcion',fld:'vOPCION',pic:'9'},{av:'AV56ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV57ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV26IntCodFrom',fld:'vINTCODFROM',pic:'Z9'},{av:'AV15ImprimirParos',fld:'vIMPRIMIRPAROS',pic:'9'},{av:'AV23SiMaquina',fld:'vSIMAQUINA',pic:'9'},{av:'AV22SiDia',fld:'vSIDIA',pic:'9'},{av:'AV32BarSer',fld:'vBARSER',pic:''},{av:'AV28OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV34Fase',fld:'vFASE',pic:''},{av:'AV30BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV56ExcelFilename',fld:'vEXCELFILENAME',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e141WV2',iparms:[{av:'AV12HisProDf_to',fld:'vHISPRODF_TO',pic:''},{av:'AV16MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV11HisProDf',fld:'vHISPRODF',pic:''},{av:'AV13HisProHf',fld:'vHISPROHF',pic:'99:99'},{av:'AV14HisProHf_to',fld:'vHISPROHF_TO',pic:'99:99'},{av:'AV7CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31BarColNom_to',fld:'vBARCOLNOM_TO',pic:''},{av:'AV35Fase_to',fld:'vFASE_TO',pic:''},{av:'AV29OpeCod_to',fld:'vOPECOD_TO',pic:'ZZZZZ9'},{av:'AV33BarSer_to',fld:'vBARSER_TO',pic:''},{av:'AV27IntCodTo',fld:'vINTCODTO',pic:'Z9'},{av:'AV21Resumen',fld:'vRESUMEN',pic:'9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV30BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV34Fase',fld:'vFASE',pic:''},{av:'AV28OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV32BarSer',fld:'vBARSER',pic:''},{av:'AV22SiDia',fld:'vSIDIA',pic:'9'},{av:'AV23SiMaquina',fld:'vSIMAQUINA',pic:'9'},{av:'AV15ImprimirParos',fld:'vIMPRIMIRPAROS',pic:'9'},{av:'AV26IntCodFrom',fld:'vINTCODFROM',pic:'Z9'},{av:'cmbavOpcion'},{av:'AV20Opcion',fld:'vOPCION',pic:'9'},{av:'AV56ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV57ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV26IntCodFrom',fld:'vINTCODFROM',pic:'Z9'},{av:'AV15ImprimirParos',fld:'vIMPRIMIRPAROS',pic:'9'},{av:'AV23SiMaquina',fld:'vSIMAQUINA',pic:'9'},{av:'AV22SiDia',fld:'vSIDIA',pic:'9'},{av:'AV32BarSer',fld:'vBARSER',pic:''},{av:'AV28OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV34Fase',fld:'vFASE',pic:''},{av:'AV30BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV5CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV36EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV57ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV56ExcelFilename',fld:'vEXCELFILENAME',pic:''}]}");
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
      Combo_intcodto_Selectedvalue_get = "" ;
      Combo_intcodfrom_Selectedvalue_get = "" ;
      Combo_opecod_to_Selectedvalue_get = "" ;
      Combo_opecod_Selectedvalue_get = "" ;
      Combo_fase_to_Selectedvalue_get = "" ;
      Combo_fase_Selectedvalue_get = "" ;
      Combo_clicod_to_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      Combo_maqcod_to_Selectedvalue_get = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV10DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV17MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV19MaqCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV6CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV8CliCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV50Fase_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV51Fase_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV49OpeCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV55OpeCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV47IntCodFrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48IntCodTo_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36EmprCod = "" ;
      AV56ExcelFilename = "" ;
      AV57ErrorMessage = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Combo_maqcod_to_Selectedvalue_set = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_to_Selectedvalue_set = "" ;
      Combo_fase_Selectedvalue_set = "" ;
      Combo_fase_to_Selectedvalue_set = "" ;
      Combo_opecod_Selectedvalue_set = "" ;
      Combo_opecod_to_Selectedvalue_set = "" ;
      Combo_intcodfrom_Selectedvalue_set = "" ;
      Combo_intcodto_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_to_Jsonclick = "" ;
      ucCombo_maqcod_to = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV11HisProDf = GXutil.nullDate() ;
      AV13HisProHf = GXutil.resetTime( GXutil.nullDate() );
      AV12HisProDf_to = GXutil.nullDate() ;
      AV14HisProHf_to = GXutil.resetTime( GXutil.nullDate() );
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_to_Jsonclick = "" ;
      ucCombo_clicod_to = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fase_Jsonclick = "" ;
      ucCombo_fase = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_fase_to_Jsonclick = "" ;
      ucCombo_fase_to = new com.genexus.webpanels.GXUserControl();
      AV32BarSer = "" ;
      AV33BarSer_to = "" ;
      AV30BarColNom = "" ;
      AV31BarColNom_to = "" ;
      lblTextblockcombo_opecod_Jsonclick = "" ;
      ucCombo_opecod = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_opecod_to_Jsonclick = "" ;
      ucCombo_opecod_to = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_intcodfrom_Jsonclick = "" ;
      ucCombo_intcodfrom = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_intcodto_Jsonclick = "" ;
      ucCombo_intcodto = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV67Pgmname = "" ;
      AV16MaqCod = "" ;
      AV18MaqCod_to = "" ;
      AV34Fase = "" ;
      AV35Fase_to = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV39UsurCod = "" ;
      AV37Station = "" ;
      AV38EmprNom = "" ;
      AV40Horainicial = "" ;
      AV41Horafinal = "" ;
      AV43Fechahoraalfa = "" ;
      AV42HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      AV44HisProdf_to2 = GXutil.nullDate() ;
      AV45HisProdtf_to2 = GXutil.resetTime( GXutil.nullDate() );
      GXt_char1 = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      scmdbuf = "" ;
      H01WV2_A14255IntAct = new String[] {""} ;
      H01WV2_A396EmprCod = new String[] {""} ;
      H01WV2_A583IntCod = new byte[1] ;
      H01WV2_A584IntDsc = new String[] {""} ;
      H01WV2_n584IntDsc = new boolean[] {false} ;
      A14255IntAct = "" ;
      A396EmprCod = "" ;
      A584IntDsc = "" ;
      AV9Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01WV3_A14255IntAct = new String[] {""} ;
      H01WV3_A396EmprCod = new String[] {""} ;
      H01WV3_A583IntCod = new byte[1] ;
      H01WV3_A584IntDsc = new String[] {""} ;
      H01WV3_n584IntDsc = new boolean[] {false} ;
      H01WV4_A8482OpeAct = new String[] {""} ;
      H01WV4_n8482OpeAct = new boolean[] {false} ;
      H01WV4_A396EmprCod = new String[] {""} ;
      H01WV4_A652OpeCod = new int[1] ;
      H01WV4_A653OpeNom = new String[] {""} ;
      H01WV4_n653OpeNom = new boolean[] {false} ;
      A8482OpeAct = "" ;
      A653OpeNom = "" ;
      H01WV5_A8482OpeAct = new String[] {""} ;
      H01WV5_n8482OpeAct = new boolean[] {false} ;
      H01WV5_A396EmprCod = new String[] {""} ;
      H01WV5_A652OpeCod = new int[1] ;
      H01WV5_A653OpeNom = new String[] {""} ;
      H01WV5_n653OpeNom = new boolean[] {false} ;
      H01WV6_A14042FasActiva = new String[] {""} ;
      H01WV6_A396EmprCod = new String[] {""} ;
      H01WV6_A457FasCod = new String[] {""} ;
      H01WV6_A460FasDsc = new String[] {""} ;
      A14042FasActiva = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      H01WV7_A14042FasActiva = new String[] {""} ;
      H01WV7_A396EmprCod = new String[] {""} ;
      H01WV7_A457FasCod = new String[] {""} ;
      H01WV7_A460FasDsc = new String[] {""} ;
      H01WV8_A10045CliAct = new String[] {""} ;
      H01WV8_A396EmprCod = new String[] {""} ;
      H01WV8_A252CliCod = new int[1] ;
      H01WV8_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      H01WV9_A10045CliAct = new String[] {""} ;
      H01WV9_A396EmprCod = new String[] {""} ;
      H01WV9_A252CliCod = new int[1] ;
      H01WV9_A279CliNom = new String[] {""} ;
      H01WV10_A607MaqEst = new String[] {""} ;
      H01WV10_n607MaqEst = new boolean[] {false} ;
      H01WV10_A396EmprCod = new String[] {""} ;
      H01WV10_A602MaqCod = new String[] {""} ;
      H01WV10_A606MaqDsc = new String[] {""} ;
      H01WV10_n606MaqDsc = new boolean[] {false} ;
      A607MaqEst = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      H01WV11_A607MaqEst = new String[] {""} ;
      H01WV11_n607MaqEst = new boolean[] {false} ;
      H01WV11_A396EmprCod = new String[] {""} ;
      H01WV11_A602MaqCod = new String[] {""} ;
      H01WV11_A606MaqDsc = new String[] {""} ;
      H01WV11_n606MaqDsc = new boolean[] {false} ;
      AV64MaqCodfrom = "" ;
      AV58MaqCod_to2 = "" ;
      AV52Barcolnom_to2 = "" ;
      AV53Fase_to2 = "" ;
      AV54Barser_to2 = "" ;
      AV62WebSession = httpContext.getWebSession();
      AV63ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char25 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      GXv_int16 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_char17 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int23 = new byte[1] ;
      GXv_int22 = new byte[1] ;
      GXv_int21 = new byte[1] ;
      GXv_int20 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      sStyleString = "" ;
      lblImprimirparos_righttext_Jsonclick = "" ;
      lblSimaquina_righttext_Jsonclick = "" ;
      lblSidia_righttext_Jsonclick = "" ;
      lblResumen_righttext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproducciondiariaww__default(),
         new Object[] {
             new Object[] {
            H01WV2_A14255IntAct, H01WV2_A396EmprCod, H01WV2_A583IntCod, H01WV2_A584IntDsc, H01WV2_n584IntDsc
            }
            , new Object[] {
            H01WV3_A14255IntAct, H01WV3_A396EmprCod, H01WV3_A583IntCod, H01WV3_A584IntDsc, H01WV3_n584IntDsc
            }
            , new Object[] {
            H01WV4_A8482OpeAct, H01WV4_n8482OpeAct, H01WV4_A396EmprCod, H01WV4_A652OpeCod, H01WV4_A653OpeNom, H01WV4_n653OpeNom
            }
            , new Object[] {
            H01WV5_A8482OpeAct, H01WV5_n8482OpeAct, H01WV5_A396EmprCod, H01WV5_A652OpeCod, H01WV5_A653OpeNom, H01WV5_n653OpeNom
            }
            , new Object[] {
            H01WV6_A14042FasActiva, H01WV6_A396EmprCod, H01WV6_A457FasCod, H01WV6_A460FasDsc
            }
            , new Object[] {
            H01WV7_A14042FasActiva, H01WV7_A396EmprCod, H01WV7_A457FasCod, H01WV7_A460FasDsc
            }
            , new Object[] {
            H01WV8_A10045CliAct, H01WV8_A396EmprCod, H01WV8_A252CliCod, H01WV8_A279CliNom
            }
            , new Object[] {
            H01WV9_A10045CliAct, H01WV9_A396EmprCod, H01WV9_A252CliCod, H01WV9_A279CliNom
            }
            , new Object[] {
            H01WV10_A607MaqEst, H01WV10_n607MaqEst, H01WV10_A396EmprCod, H01WV10_A602MaqCod, H01WV10_A606MaqDsc, H01WV10_n606MaqDsc
            }
            , new Object[] {
            H01WV11_A607MaqEst, H01WV11_n607MaqEst, H01WV11_A396EmprCod, H01WV11_A602MaqCod, H01WV11_A606MaqDsc, H01WV11_n606MaqDsc
            }
         }
      );
      AV67Pgmname = "Produccion.InformeProduccionDiariaWW" ;
      /* GeneXus formulas. */
      AV67Pgmname = "Produccion.InformeProduccionDiariaWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV20Opcion ;
   private byte AV26IntCodFrom ;
   private byte AV27IntCodTo ;
   private byte nDonePA ;
   private byte AV21Resumen ;
   private byte AV22SiDia ;
   private byte AV23SiMaquina ;
   private byte AV15ImprimirParos ;
   private byte A583IntCod ;
   private byte AV61intcodto2 ;
   private byte GXv_int23[] ;
   private byte GXv_int22[] ;
   private byte GXv_int21[] ;
   private byte GXv_int20[] ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private short nRcdExists_12 ;
   private short nIsMod_12 ;
   private short nRcdExists_11 ;
   private short nIsMod_11 ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
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
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavHisprodf_Enabled ;
   private int edtavHisprohf_Enabled ;
   private int edtavHisprodf_to_Enabled ;
   private int edtavHisprohf_to_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarser_to_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnom_to_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcod_Visible ;
   private int edtavMaqcod_to_Visible ;
   private int AV5CliCod ;
   private int edtavClicod_Visible ;
   private int AV7CliCod_to ;
   private int edtavClicod_to_Visible ;
   private int edtavFase_Visible ;
   private int edtavFase_to_Visible ;
   private int AV28OpeCod ;
   private int edtavOpecod_Visible ;
   private int AV29OpeCod_to ;
   private int edtavOpecod_to_Visible ;
   private int edtavIntcodfrom_Visible ;
   private int edtavIntcodto_Visible ;
   private int A652OpeCod ;
   private int A252CliCod ;
   private int AV59Clicod_to2 ;
   private int AV60Opecod_to2 ;
   private int GXv_int16[] ;
   private int GXv_int15[] ;
   private int GXv_int10[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private String Combo_intcodto_Selectedvalue_get ;
   private String Combo_intcodfrom_Selectedvalue_get ;
   private String Combo_opecod_to_Selectedvalue_get ;
   private String Combo_opecod_Selectedvalue_get ;
   private String Combo_fase_to_Selectedvalue_get ;
   private String Combo_fase_Selectedvalue_get ;
   private String Combo_clicod_to_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String Combo_maqcod_to_Selectedvalue_get ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV36EmprCod ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Combo_maqcod_Emptyitemtext ;
   private String Combo_maqcod_to_Cls ;
   private String Combo_maqcod_to_Selectedvalue_set ;
   private String Combo_maqcod_to_Emptyitemtext ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_to_Cls ;
   private String Combo_clicod_to_Selectedvalue_set ;
   private String Combo_clicod_to_Emptyitemtext ;
   private String Combo_fase_Cls ;
   private String Combo_fase_Selectedvalue_set ;
   private String Combo_fase_Emptyitemtext ;
   private String Combo_fase_to_Cls ;
   private String Combo_fase_to_Selectedvalue_set ;
   private String Combo_fase_to_Emptyitemtext ;
   private String Combo_opecod_Cls ;
   private String Combo_opecod_Selectedvalue_set ;
   private String Combo_opecod_Emptyitemtext ;
   private String Combo_opecod_to_Cls ;
   private String Combo_opecod_to_Selectedvalue_set ;
   private String Combo_opecod_to_Emptyitemtext ;
   private String Combo_intcodfrom_Cls ;
   private String Combo_intcodfrom_Selectedvalue_set ;
   private String Combo_intcodfrom_Emptyitemtext ;
   private String Combo_intcodto_Cls ;
   private String Combo_intcodto_Selectedvalue_set ;
   private String Combo_intcodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtrosmas_Width ;
   private String Dvpanel_panel_filtrosmas_Cls ;
   private String Dvpanel_panel_filtrosmas_Title ;
   private String Dvpanel_panel_filtrosmas_Iconposition ;
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
   private String divTablemaq_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String divTablesplittedmaqcod_to_Internalname ;
   private String lblTextblockcombo_maqcod_to_Internalname ;
   private String lblTextblockcombo_maqcod_to_Jsonclick ;
   private String Combo_maqcod_to_Caption ;
   private String Combo_maqcod_to_Internalname ;
   private String divTabledate_Internalname ;
   private String edtavHisprodf_Internalname ;
   private String TempTags ;
   private String edtavHisprodf_Jsonclick ;
   private String edtavHisprohf_Internalname ;
   private String edtavHisprohf_Jsonclick ;
   private String edtavHisprodf_to_Internalname ;
   private String edtavHisprodf_to_Jsonclick ;
   private String edtavHisprohf_to_Internalname ;
   private String edtavHisprohf_to_Jsonclick ;
   private String divTableclient_Internalname ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockcombo_clicod_Internalname ;
   private String lblTextblockcombo_clicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Internalname ;
   private String divTablesplittedclicod_to_Internalname ;
   private String lblTextblockcombo_clicod_to_Internalname ;
   private String lblTextblockcombo_clicod_to_Jsonclick ;
   private String Combo_clicod_to_Caption ;
   private String Combo_clicod_to_Internalname ;
   private String divTablefases_Internalname ;
   private String divTablesplittedfase_Internalname ;
   private String lblTextblockcombo_fase_Internalname ;
   private String lblTextblockcombo_fase_Jsonclick ;
   private String Combo_fase_Caption ;
   private String Combo_fase_Internalname ;
   private String divTablesplittedfase_to_Internalname ;
   private String lblTextblockcombo_fase_to_Internalname ;
   private String lblTextblockcombo_fase_to_Jsonclick ;
   private String Combo_fase_to_Caption ;
   private String Combo_fase_to_Internalname ;
   private String divTablearticulos_Internalname ;
   private String edtavBarser_Internalname ;
   private String AV32BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarser_to_Internalname ;
   private String AV33BarSer_to ;
   private String edtavBarser_to_Jsonclick ;
   private String divTablecolores_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String AV30BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnom_to_Internalname ;
   private String AV31BarColNom_to ;
   private String edtavBarcolnom_to_Jsonclick ;
   private String divTableoperarios_Internalname ;
   private String divTablesplittedopecod_Internalname ;
   private String lblTextblockcombo_opecod_Internalname ;
   private String lblTextblockcombo_opecod_Jsonclick ;
   private String Combo_opecod_Caption ;
   private String Combo_opecod_Internalname ;
   private String divTablesplittedopecod_to_Internalname ;
   private String lblTextblockcombo_opecod_to_Internalname ;
   private String lblTextblockcombo_opecod_to_Jsonclick ;
   private String Combo_opecod_to_Caption ;
   private String Combo_opecod_to_Internalname ;
   private String divTableintensidad_Internalname ;
   private String divTablesplittedintcodfrom_Internalname ;
   private String lblTextblockcombo_intcodfrom_Internalname ;
   private String lblTextblockcombo_intcodfrom_Jsonclick ;
   private String Combo_intcodfrom_Caption ;
   private String Combo_intcodfrom_Internalname ;
   private String divTablesplittedintcodto_Internalname ;
   private String lblTextblockcombo_intcodto_Internalname ;
   private String lblTextblockcombo_intcodto_Jsonclick ;
   private String Combo_intcodto_Caption ;
   private String Combo_intcodto_Internalname ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divTable_masopciones_Internalname ;
   private String grpUnnamedgroup2_Internalname ;
   private String divGroupinformeresumen_Internalname ;
   private String grpUnnamedgroup3_Internalname ;
   private String divGroupinformedetalle_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV67Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV16MaqCod ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqcod_to_Internalname ;
   private String AV18MaqCod_to ;
   private String edtavMaqcod_to_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String edtavFase_Internalname ;
   private String AV34Fase ;
   private String edtavFase_Jsonclick ;
   private String edtavFase_to_Internalname ;
   private String AV35Fase_to ;
   private String edtavFase_to_Jsonclick ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String edtavOpecod_to_Internalname ;
   private String edtavOpecod_to_Jsonclick ;
   private String edtavIntcodfrom_Internalname ;
   private String edtavIntcodfrom_Jsonclick ;
   private String edtavIntcodto_Internalname ;
   private String edtavIntcodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV39UsurCod ;
   private String AV37Station ;
   private String AV38EmprNom ;
   private String AV40Horainicial ;
   private String AV41Horafinal ;
   private String AV43Fechahoraalfa ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String A14255IntAct ;
   private String A396EmprCod ;
   private String A584IntDsc ;
   private String A8482OpeAct ;
   private String A653OpeNom ;
   private String A14042FasActiva ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String A607MaqEst ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String AV64MaqCodfrom ;
   private String AV58MaqCod_to2 ;
   private String AV52Barcolnom_to2 ;
   private String AV53Fase_to2 ;
   private String AV54Barser_to2 ;
   private String GXv_char25[] ;
   private String GXv_char24[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sStyleString ;
   private String tblTablemergedimprimirparos_Internalname ;
   private String lblImprimirparos_righttext_Internalname ;
   private String lblImprimirparos_righttext_Jsonclick ;
   private String tblTablemergedsimaquina_Internalname ;
   private String lblSimaquina_righttext_Internalname ;
   private String lblSimaquina_righttext_Jsonclick ;
   private String tblTablemergedsidia_Internalname ;
   private String lblSidia_righttext_Internalname ;
   private String lblSidia_righttext_Jsonclick ;
   private String tblTablemergedresumen_Internalname ;
   private String lblResumen_righttext_Internalname ;
   private String lblResumen_righttext_Jsonclick ;
   private java.util.Date AV13HisProHf ;
   private java.util.Date AV14HisProHf_to ;
   private java.util.Date AV42HisProdtf ;
   private java.util.Date AV45HisProdtf_to2 ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date GXv_dtime7[] ;
   private java.util.Date AV11HisProDf ;
   private java.util.Date AV12HisProDf_to ;
   private java.util.Date AV44HisProdf_to2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Dvpanel_panel_filtrosmas_Autowidth ;
   private boolean Dvpanel_panel_filtrosmas_Autoheight ;
   private boolean Dvpanel_panel_filtrosmas_Collapsible ;
   private boolean Dvpanel_panel_filtrosmas_Collapsed ;
   private boolean Dvpanel_panel_filtrosmas_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosmas_Autoscroll ;
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
   private boolean n584IntDsc ;
   private boolean n8482OpeAct ;
   private boolean n653OpeNom ;
   private boolean n607MaqEst ;
   private boolean n606MaqDsc ;
   private String AV56ExcelFilename ;
   private String AV57ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_fase ;
   private com.genexus.webpanels.GXUserControl ucCombo_fase_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_opecod ;
   private com.genexus.webpanels.GXUserControl ucCombo_opecod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcodto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV63ProgressIndicator ;
   private ICheckbox chkavResumen ;
   private HTMLChoice cmbavOpcion ;
   private ICheckbox chkavSidia ;
   private ICheckbox chkavSimaquina ;
   private ICheckbox chkavImprimirparos ;
   private IDataStoreProvider pr_default ;
   private String[] H01WV2_A14255IntAct ;
   private String[] H01WV2_A396EmprCod ;
   private byte[] H01WV2_A583IntCod ;
   private String[] H01WV2_A584IntDsc ;
   private boolean[] H01WV2_n584IntDsc ;
   private String[] H01WV3_A14255IntAct ;
   private String[] H01WV3_A396EmprCod ;
   private byte[] H01WV3_A583IntCod ;
   private String[] H01WV3_A584IntDsc ;
   private boolean[] H01WV3_n584IntDsc ;
   private String[] H01WV4_A8482OpeAct ;
   private boolean[] H01WV4_n8482OpeAct ;
   private String[] H01WV4_A396EmprCod ;
   private int[] H01WV4_A652OpeCod ;
   private String[] H01WV4_A653OpeNom ;
   private boolean[] H01WV4_n653OpeNom ;
   private String[] H01WV5_A8482OpeAct ;
   private boolean[] H01WV5_n8482OpeAct ;
   private String[] H01WV5_A396EmprCod ;
   private int[] H01WV5_A652OpeCod ;
   private String[] H01WV5_A653OpeNom ;
   private boolean[] H01WV5_n653OpeNom ;
   private String[] H01WV6_A14042FasActiva ;
   private String[] H01WV6_A396EmprCod ;
   private String[] H01WV6_A457FasCod ;
   private String[] H01WV6_A460FasDsc ;
   private String[] H01WV7_A14042FasActiva ;
   private String[] H01WV7_A396EmprCod ;
   private String[] H01WV7_A457FasCod ;
   private String[] H01WV7_A460FasDsc ;
   private String[] H01WV8_A10045CliAct ;
   private String[] H01WV8_A396EmprCod ;
   private int[] H01WV8_A252CliCod ;
   private String[] H01WV8_A279CliNom ;
   private String[] H01WV9_A10045CliAct ;
   private String[] H01WV9_A396EmprCod ;
   private int[] H01WV9_A252CliCod ;
   private String[] H01WV9_A279CliNom ;
   private String[] H01WV10_A607MaqEst ;
   private boolean[] H01WV10_n607MaqEst ;
   private String[] H01WV10_A396EmprCod ;
   private String[] H01WV10_A602MaqCod ;
   private String[] H01WV10_A606MaqDsc ;
   private boolean[] H01WV10_n606MaqDsc ;
   private String[] H01WV11_A607MaqEst ;
   private boolean[] H01WV11_n607MaqEst ;
   private String[] H01WV11_A396EmprCod ;
   private String[] H01WV11_A602MaqCod ;
   private String[] H01WV11_A606MaqDsc ;
   private boolean[] H01WV11_n606MaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV62WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV17MaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19MaqCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV6CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV8CliCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV50Fase_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV51Fase_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV49OpeCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV55OpeCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47IntCodFrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48IntCodTo_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV9Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV10DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class informeproducciondiariaww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WV2", "SELECT IntAct, EmprCod, IntCod, IntDsc FROM TXPINTENS WHERE (EmprCod = ?) AND (IntAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV3", "SELECT IntAct, EmprCod, IntCod, IntDsc FROM TXPINTENS WHERE (EmprCod = ?) AND (IntAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV4", "SELECT OpeAct, EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV5", "SELECT OpeAct, EmprCod, OpeCod, OpeNom FROM TXPOPERAR WHERE (EmprCod = ?) AND (OpeAct = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV6", "SELECT FasActiva, EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE (EmprCod = ?) AND (FasActiva = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV7", "SELECT FasActiva, EmprCod, FasCod, FasDsc FROM TXPFASPRO WHERE (EmprCod = ?) AND (FasActiva = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV8", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV9", "SELECT CliAct, EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV10", "SELECT MaqEst, EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WV11", "SELECT MaqEst, EmprCod, MaqCod, MaqDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqEst = 'A') ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

