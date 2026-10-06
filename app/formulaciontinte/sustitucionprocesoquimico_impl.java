package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class sustitucionprocesoquimico_impl extends GXDataArea
{
   public sustitucionprocesoquimico_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public sustitucionprocesoquimico_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sustitucionprocesoquimico_impl.class ));
   }

   public sustitucionprocesoquimico_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      pa1K62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1K62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.sustitucionprocesoquimico", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV45CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV45CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_TO_DATA", AV46CliCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_TO_DATA", AV46CliCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPCOLCOD_DATA", AV43TipColCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPCOLCOD_DATA", AV43TipColCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPCOLCOD_TO_DATA", AV44TipColCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPCOLCOD_TO_DATA", AV44TipColCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCOD_DATA", AV41IntCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCOD_DATA", AV41IntCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vINTCOD_TO_DATA", AV42IntCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vINTCOD_TO_DATA", AV42IntCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMATCOD_DATA", AV39MatCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMATCOD_DATA", AV39MatCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMATCOD_TO_DATA", AV40MatCod_to_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMATCOD_TO_DATA", AV40MatCod_to_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV38ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV38ProForCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCODDESTINO_DATA", AV36ProForCoddestino_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCODDESTINO_DATA", AV36ProForCoddestino_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG1", GXutil.ltrim( localUtil.ntoc( AV28Flag1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG2", GXutil.ltrim( localUtil.ntoc( AV27Flag2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitemtext", GXutil.rtrim( Combo_clicod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Cls", GXutil.rtrim( Combo_clicod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_clicod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Emptyitemtext", GXutil.rtrim( Combo_clicod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_Cls", GXutil.rtrim( Combo_tipcolcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_Selectedvalue_set", GXutil.rtrim( Combo_tipcolcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_Emptyitemtext", GXutil.rtrim( Combo_tipcolcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_TO_Cls", GXutil.rtrim( Combo_tipcolcod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_tipcolcod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_TO_Emptyitemtext", GXutil.rtrim( Combo_tipcolcod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_Cls", GXutil.rtrim( Combo_intcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_Selectedvalue_set", GXutil.rtrim( Combo_intcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_Emptyitemtext", GXutil.rtrim( Combo_intcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_TO_Cls", GXutil.rtrim( Combo_intcod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_intcod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_TO_Emptyitemtext", GXutil.rtrim( Combo_intcod_to_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_Cls", GXutil.rtrim( Combo_matcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_Selectedvalue_set", GXutil.rtrim( Combo_matcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_Emptyitemtext", GXutil.rtrim( Combo_matcod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_TO_Cls", GXutil.rtrim( Combo_matcod_to_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_TO_Selectedvalue_set", GXutil.rtrim( Combo_matcod_to_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_TO_Emptyitemtext", GXutil.rtrim( Combo_matcod_to_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Selectedvalue_set", GXutil.rtrim( Combo_proforcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Emptyitem", GXutil.booltostr( Combo_proforcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCODDESTINO_Cls", GXutil.rtrim( Combo_proforcoddestino_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCODDESTINO_Selectedvalue_set", GXutil.rtrim( Combo_proforcoddestino_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCODDESTINO_Emptyitem", GXutil.booltostr( Combo_proforcoddestino_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCODDESTINO_Selectedvalue_get", GXutil.rtrim( Combo_proforcoddestino_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Selectedvalue_get", GXutil.rtrim( Combo_proforcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_matcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MATCOD_Selectedvalue_get", GXutil.rtrim( Combo_matcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_intcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_INTCOD_Selectedvalue_get", GXutil.rtrim( Combo_intcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_tipcolcod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPCOLCOD_Selectedvalue_get", GXutil.rtrim( Combo_tipcolcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_TO_Selectedvalue_get", GXutil.rtrim( Combo_clicod_to_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_get", GXutil.rtrim( Combo_clicod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
      if ( ! ( WebComp_Wcsustitucionprocesoquimicoformulas_wc == null ) )
      {
         WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentjscripts();
      }
      if ( ! ( WebComp_Wcwcsustitucionprocesosprogramas == null ) )
      {
         WebComp_Wcwcsustitucionprocesosprogramas.componentjscripts();
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
         we1K62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1K62( ) ;
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
      return formatLink("app.formulaciontinte.sustitucionprocesoquimico", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.SustitucionProcesoQuimico" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Sustitucion Proceso Quimico", "") ;
   }

   public void wb1K60( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
         ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
         ucCombo_clicod.setProperty("EmptyItemText", Combo_clicod_Emptyitemtext);
         ucCombo_clicod.setProperty("DropDownOptionsData", AV45CliCod_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicod_to_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicod_to.setProperty("Caption", Combo_clicod_to_Caption);
         ucCombo_clicod_to.setProperty("Cls", Combo_clicod_to_Cls);
         ucCombo_clicod_to.setProperty("EmptyItemText", Combo_clicod_to_Emptyitemtext);
         ucCombo_clicod_to.setProperty("DropDownOptionsData", AV46CliCod_to_Data);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForser_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForser_Internalname, GXutil.rtrim( AV21ForSer), GXutil.rtrim( localUtil.format( AV21ForSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForser_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForser_to_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForser_to_Internalname, GXutil.rtrim( AV22ForSer_to), GXutil.rtrim( localUtil.format( AV22ForSer_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForser_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForser_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnom_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_Internalname, GXutil.rtrim( AV17ForColNom), GXutil.rtrim( localUtil.format( AV17ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_Internalname, httpContext.getMessage( "Numero Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV18ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnom_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnom_to_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_to_Internalname, GXutil.rtrim( AV19ForColNom_to), GXutil.rtrim( localUtil.format( AV19ForColNom_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_to_Internalname, httpContext.getMessage( "Numero Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV20ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20ForColNum_to), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20ForColNum_to), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipcolcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipcolcod_Internalname, httpContext.getMessage( "TC Inicial", ""), "", "", lblTextblockcombo_tipcolcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipcolcod.setProperty("Caption", Combo_tipcolcod_Caption);
         ucCombo_tipcolcod.setProperty("Cls", Combo_tipcolcod_Cls);
         ucCombo_tipcolcod.setProperty("EmptyItemText", Combo_tipcolcod_Emptyitemtext);
         ucCombo_tipcolcod.setProperty("DropDownOptionsData", AV43TipColCod_Data);
         ucCombo_tipcolcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipcolcod_Internalname, "COMBO_TIPCOLCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedtipcolcod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tipcolcod_to_Internalname, httpContext.getMessage( "TC Final", ""), "", "", lblTextblockcombo_tipcolcod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tipcolcod_to.setProperty("Caption", Combo_tipcolcod_to_Caption);
         ucCombo_tipcolcod_to.setProperty("Cls", Combo_tipcolcod_to_Cls);
         ucCombo_tipcolcod_to.setProperty("EmptyItemText", Combo_tipcolcod_to_Emptyitemtext);
         ucCombo_tipcolcod_to.setProperty("DropDownOptionsData", AV44TipColCod_to_Data);
         ucCombo_tipcolcod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipcolcod_to_Internalname, "COMBO_TIPCOLCOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcod_Internalname, httpContext.getMessage( "Intensidad Inicial", ""), "", "", lblTextblockcombo_intcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcod.setProperty("Caption", Combo_intcod_Caption);
         ucCombo_intcod.setProperty("Cls", Combo_intcod_Cls);
         ucCombo_intcod.setProperty("EmptyItemText", Combo_intcod_Emptyitemtext);
         ucCombo_intcod.setProperty("DropDownOptionsData", AV41IntCod_Data);
         ucCombo_intcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcod_Internalname, "COMBO_INTCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedintcod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_intcod_to_Internalname, httpContext.getMessage( "Intensidad  Final", ""), "", "", lblTextblockcombo_intcod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_intcod_to.setProperty("Caption", Combo_intcod_to_Caption);
         ucCombo_intcod_to.setProperty("Cls", Combo_intcod_to_Cls);
         ucCombo_intcod_to.setProperty("EmptyItemText", Combo_intcod_to_Emptyitemtext);
         ucCombo_intcod_to.setProperty("DropDownOptionsData", AV42IntCod_to_Data);
         ucCombo_intcod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_intcod_to_Internalname, "COMBO_INTCOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmatcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_matcod_Internalname, httpContext.getMessage( "Matiz Inicial", ""), "", "", lblTextblockcombo_matcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_matcod.setProperty("Caption", Combo_matcod_Caption);
         ucCombo_matcod.setProperty("Cls", Combo_matcod_Cls);
         ucCombo_matcod.setProperty("EmptyItemText", Combo_matcod_Emptyitemtext);
         ucCombo_matcod.setProperty("DropDownOptionsData", AV39MatCod_Data);
         ucCombo_matcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_matcod_Internalname, "COMBO_MATCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmatcod_to_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_matcod_to_Internalname, httpContext.getMessage( "Matiz Final", ""), "", "", lblTextblockcombo_matcod_to_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_matcod_to.setProperty("Caption", Combo_matcod_to_Caption);
         ucCombo_matcod_to.setProperty("Cls", Combo_matcod_to_Cls);
         ucCombo_matcod_to.setProperty("EmptyItemText", Combo_matcod_to_Emptyitemtext);
         ucCombo_matcod_to.setProperty("DropDownOptionsData", AV40MatCod_to_Data);
         ucCombo_matcod_to.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_matcod_to_Internalname, "COMBO_MATCOD_TOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_masopciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Proceso a sustituir", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         wb_table1_141_1K62( true) ;
      }
      else
      {
         wb_table1_141_1K62( false) ;
      }
      return  ;
   }

   public void wb_table1_141_1K62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup8_Internalname, httpContext.getMessage( "Proceso sustituto", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         wb_table2_152_1K62( true) ;
      }
      else
      {
         wb_table2_152_1K62( false) ;
      }
      return  ;
   }

   public void wb_table2_152_1K62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver Resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver Resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Relacion de Colores", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
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
         wb_table3_202_1K62( true) ;
      }
      else
      {
         wb_table3_202_1K62( false) ;
      }
      return  ;
   }

   public void wb_table3_202_1K62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Relacion de Programas", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         wb_table4_215_1K62( true) ;
      }
      else
      {
         wb_table4_215_1K62( false) ;
      }
      return  ;
   }

   public void wb_table4_215_1K62e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 222,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV23CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,222);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 223,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV24CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CliCod_to), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,223);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_to_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15TipColCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipcolcod_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV16TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV16TipColCod_to), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipcolcod_to_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV13IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13IntCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcod_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 227,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV14IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14IntCod_to), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,227);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavIntcod_to_Visible, 1, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 228,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMatcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV11MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11MatCod), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,228);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMatcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMatcod_Visible, 1, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMatcod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV12MatCod_to, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12MatCod_to), "ZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMatcod_to_Jsonclick, 0, "Attribute", "", "", "", "", edtavMatcod_to_Visible, 1, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 230,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcod_Internalname, GXutil.rtrim( AV25ProForCod), GXutil.rtrim( localUtil.format( AV25ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,230);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavProforcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcoddestino_Internalname, GXutil.rtrim( AV26ProForCoddestino), GXutil.rtrim( localUtil.format( AV26ProForCoddestino, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcoddestino_Jsonclick, 0, "Attribute", "", "", "", "", edtavProforcoddestino_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         wb_table5_232_1K62( true) ;
      }
      else
      {
         wb_table5_232_1K62( false) ;
      }
      return  ;
   }

   public void wb_table5_232_1K62e( boolean wbgen )
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

   public void start1K62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Sustitucion Proceso Quimico", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1K60( ) ;
   }

   public void ws1K62( )
   {
      start1K62( ) ;
      evt1K62( ) ;
   }

   public void evt1K62( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e111K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e121K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e131K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e151K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161K62 ();
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
                        OldWcsustitucionprocesoquimicoformulas_wc = httpContext.cgiGet( "W0205") ;
                        if ( ( GXutil.len( OldWcsustitucionprocesoquimicoformulas_wc) == 0 ) || ( GXutil.strcmp(OldWcsustitucionprocesoquimicoformulas_wc, WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 ) )
                        {
                           WebComp_Wcsustitucionprocesoquimicoformulas_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcsustitucionprocesoquimicoformulas_wc + "_impl", remoteHandle, context);
                           WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component = OldWcsustitucionprocesoquimicoformulas_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 )
                        {
                           WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentprocess("W0205", "", sEvt);
                        }
                        WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component = OldWcsustitucionprocesoquimicoformulas_wc ;
                     }
                     else if ( nCmpId == 218 )
                     {
                        OldWcwcsustitucionprocesosprogramas = httpContext.cgiGet( "W0218") ;
                        if ( ( GXutil.len( OldWcwcsustitucionprocesosprogramas) == 0 ) || ( GXutil.strcmp(OldWcwcsustitucionprocesosprogramas, WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 ) )
                        {
                           WebComp_Wcwcsustitucionprocesosprogramas = WebUtils.getWebComponent(getClass(), "app." + OldWcwcsustitucionprocesosprogramas + "_impl", remoteHandle, context);
                           WebComp_Wcwcsustitucionprocesosprogramas_Component = OldWcwcsustitucionprocesosprogramas ;
                        }
                        if ( GXutil.len( WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 )
                        {
                           WebComp_Wcwcsustitucionprocesosprogramas.componentprocess("W0218", "", sEvt);
                        }
                        WebComp_Wcwcsustitucionprocesosprogramas_Component = OldWcwcsustitucionprocesosprogramas ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1K62( )
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

   public void pa1K62( )
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
            GX_FocusControl = edtavForser_Internalname ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1K62( ) ;
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

   public void rf1K62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 )
            {
               WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 )
            {
               WebComp_Wcwcsustitucionprocesosprogramas.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e161K62 ();
         wb1K60( ) ;
      }
   }

   public void send_integrity_lvl_hashes1K62( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1K60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121K62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV45CliCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_TO_DATA"), AV46CliCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPCOLCOD_DATA"), AV43TipColCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPCOLCOD_TO_DATA"), AV44TipColCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCOD_DATA"), AV41IntCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vINTCOD_TO_DATA"), AV42IntCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMATCOD_DATA"), AV39MatCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMATCOD_TO_DATA"), AV40MatCod_to_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV38ProForCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCODDESTINO_DATA"), AV36ProForCoddestino_Data);
         /* Read saved values. */
         Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
         Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
         Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
         Combo_clicod_to_Cls = httpContext.cgiGet( "COMBO_CLICOD_TO_Cls") ;
         Combo_clicod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_TO_Selectedvalue_set") ;
         Combo_clicod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_TO_Emptyitemtext") ;
         Combo_tipcolcod_Cls = httpContext.cgiGet( "COMBO_TIPCOLCOD_Cls") ;
         Combo_tipcolcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPCOLCOD_Selectedvalue_set") ;
         Combo_tipcolcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPCOLCOD_Emptyitemtext") ;
         Combo_tipcolcod_to_Cls = httpContext.cgiGet( "COMBO_TIPCOLCOD_TO_Cls") ;
         Combo_tipcolcod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPCOLCOD_TO_Selectedvalue_set") ;
         Combo_tipcolcod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPCOLCOD_TO_Emptyitemtext") ;
         Combo_intcod_Cls = httpContext.cgiGet( "COMBO_INTCOD_Cls") ;
         Combo_intcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCOD_Selectedvalue_set") ;
         Combo_intcod_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCOD_Emptyitemtext") ;
         Combo_intcod_to_Cls = httpContext.cgiGet( "COMBO_INTCOD_TO_Cls") ;
         Combo_intcod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_INTCOD_TO_Selectedvalue_set") ;
         Combo_intcod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_INTCOD_TO_Emptyitemtext") ;
         Combo_matcod_Cls = httpContext.cgiGet( "COMBO_MATCOD_Cls") ;
         Combo_matcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MATCOD_Selectedvalue_set") ;
         Combo_matcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MATCOD_Emptyitemtext") ;
         Combo_matcod_to_Cls = httpContext.cgiGet( "COMBO_MATCOD_TO_Cls") ;
         Combo_matcod_to_Selectedvalue_set = httpContext.cgiGet( "COMBO_MATCOD_TO_Selectedvalue_set") ;
         Combo_matcod_to_Emptyitemtext = httpContext.cgiGet( "COMBO_MATCOD_TO_Emptyitemtext") ;
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
         Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
         Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
         Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
         Combo_proforcoddestino_Cls = httpContext.cgiGet( "COMBO_PROFORCODDESTINO_Cls") ;
         Combo_proforcoddestino_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCODDESTINO_Selectedvalue_set") ;
         Combo_proforcoddestino_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCODDESTINO_Emptyitem")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         AV21ForSer = httpContext.cgiGet( edtavForser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ForSer", AV21ForSer);
         AV22ForSer_to = httpContext.cgiGet( edtavForser_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ForSer_to", AV22ForSer_to);
         AV17ForColNom = httpContext.cgiGet( edtavForcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17ForColNom", AV17ForColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUM");
            GX_FocusControl = edtavForcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18ForColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
         }
         else
         {
            AV18ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
         }
         AV19ForColNom_to = httpContext.cgiGet( edtavForcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19ForColNom_to", AV19ForColNom_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUM_TO");
            GX_FocusControl = edtavForcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20ForColNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum_to), 6, 0));
         }
         else
         {
            AV20ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum_to), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
         }
         else
         {
            AV23CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_TO");
            GX_FocusControl = edtavClicod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
         }
         else
         {
            AV24CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD");
            GX_FocusControl = edtavTipcolcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15TipColCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCod), 2, 0));
         }
         else
         {
            AV15TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCod), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD_TO");
            GX_FocusControl = edtavTipcolcod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16TipColCod_to = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TipColCod_to), 2, 0));
         }
         else
         {
            AV16TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TipColCod_to), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD");
            GX_FocusControl = edtavIntcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13IntCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13IntCod), 2, 0));
         }
         else
         {
            AV13IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13IntCod), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD_TO");
            GX_FocusControl = edtavIntcod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14IntCod_to = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14IntCod_to), 2, 0));
         }
         else
         {
            AV14IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14IntCod_to), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMatcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMatcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMATCOD");
            GX_FocusControl = edtavMatcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11MatCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11MatCod), 3, 0));
         }
         else
         {
            AV11MatCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavMatcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11MatCod), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMatcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMatcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMATCOD_TO");
            GX_FocusControl = edtavMatcod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12MatCod_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12MatCod_to), 3, 0));
         }
         else
         {
            AV12MatCod_to = (short)(localUtil.ctol( httpContext.cgiGet( edtavMatcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12MatCod_to), 3, 0));
         }
         AV25ProForCod = httpContext.cgiGet( edtavProforcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ProForCod", AV25ProForCod);
         AV26ProForCoddestino = httpContext.cgiGet( edtavProforcoddestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ProForCoddestino", AV26ProForCoddestino);
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
      e121K62 ();
      if (returnInSub) return;
   }

   public void e121K62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV30Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      sustitucionprocesoquimico_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Station = GXt_char1 ;
      GXv_char2[0] = AV29EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char2, GXv_char3, GXv_char4) ;
      sustitucionprocesoquimico_impl.this.AV29EmprCod = GXv_char2[0] ;
      sustitucionprocesoquimico_impl.this.AV31EmprNom = GXv_char3[0] ;
      sustitucionprocesoquimico_impl.this.AV32UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      GXt_char1 = AV30Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      sustitucionprocesoquimico_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Station = GXt_char1 ;
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char2[0] = AV32UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV30Station, GXv_char4, GXv_char3, GXv_char2) ;
      sustitucionprocesoquimico_impl.this.AV29EmprCod = GXv_char4[0] ;
      sustitucionprocesoquimico_impl.this.AV31EmprNom = GXv_char3[0] ;
      sustitucionprocesoquimico_impl.this.AV32UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      edtavProforcoddestino_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcoddestino_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcoddestino_Visible), 5, 0), true);
      edtavProforcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Visible), 5, 0), true);
      edtavMatcod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMatcod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_to_Visible), 5, 0), true);
      edtavMatcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMatcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMatcod_Visible), 5, 0), true);
      edtavIntcod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcod_to_Visible), 5, 0), true);
      edtavIntcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavIntcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIntcod_Visible), 5, 0), true);
      edtavTipcolcod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_to_Visible), 5, 0), true);
      edtavTipcolcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipcolcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipcolcod_Visible), 5, 0), true);
      edtavClicod_to_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_to_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_to_Visible), 5, 0), true);
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICOD_TO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPCOLCOD' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOTIPCOLCOD_TO' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCOD' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOINTCOD_TO' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMATCOD' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOMATCOD_TO' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOPROFORCODDESTINO' */
      S202 ();
      if (returnInSub) return;
   }

   public void e131K62( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV25ProForCod)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Proceso Destino", ""));
         GX_FocusControl = edtavProforcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_char4[0] = AV33ProForDsc ;
         new app.pprofordsc(remoteHandle, context).execute( AV29EmprCod, AV25ProForCod, GXv_char4) ;
         sustitucionprocesoquimico_impl.this.AV33ProForDsc = GXv_char4[0] ;
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwcsustitucionprocesosprogramas = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcsustitucionprocesosprogramas_Component), GXutil.lower( "FormulacionTinte.WCSustitucionProcesosProgramas")) != 0 )
         {
            WebComp_Wcwcsustitucionprocesosprogramas = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.wcsustitucionprocesosprogramas_impl", remoteHandle, context);
            WebComp_Wcwcsustitucionprocesosprogramas_Component = "FormulacionTinte.WCSustitucionProcesosProgramas" ;
         }
         if ( GXutil.len( WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 )
         {
            WebComp_Wcwcsustitucionprocesosprogramas.setjustcreated();
            WebComp_Wcwcsustitucionprocesosprogramas.componentprepare(new Object[] {"W0218","",AV29EmprCod,AV25ProForCod,AV33ProForDsc});
            WebComp_Wcwcsustitucionprocesosprogramas.componentbind(new Object[] {"","vPROFORCOD",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwcsustitucionprocesosprogramas )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0218"+"");
            WebComp_Wcwcsustitucionprocesosprogramas.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcsustitucionprocesoquimicoformulas_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component), GXutil.lower( "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC")) != 0 )
         {
            WebComp_Wcsustitucionprocesoquimicoformulas_wc = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.sustitucionprocesoquimicoformulas_wc_impl", remoteHandle, context);
            WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component = "FormulacionTinte.SustitucionProcesoQuimicoFormulas_WC" ;
         }
         if ( GXutil.len( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 )
         {
            WebComp_Wcsustitucionprocesoquimicoformulas_wc.setjustcreated();
            WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentprepare(new Object[] {"W0205","",AV29EmprCod,Integer.valueOf(AV23CliCod),Integer.valueOf(AV24CliCod_to),AV17ForColNom,AV19ForColNom_to,Integer.valueOf(AV18ForColNum),Integer.valueOf(AV20ForColNum_to),AV21ForSer,AV22ForSer_to,Byte.valueOf(AV13IntCod),Byte.valueOf(AV14IntCod_to),Short.valueOf(AV11MatCod),Short.valueOf(AV12MatCod_to),Byte.valueOf(AV15TipColCod),Byte.valueOf(AV16TipColCod_to),AV25ProForCod,AV26ProForCoddestino,AV33ProForDsc});
            WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentbind(new Object[] {"","vCLICOD","vCLICOD_TO","vFORCOLNOM","vFORCOLNOM_TO","vFORCOLNUM","vFORCOLNUM_TO","vFORSER","vFORSER_TO","vINTCOD","vINTCOD_TO","vMATCOD","vMATCOD_TO","vTIPCOLCOD","vTIPCOLCOD_TO","vPROFORCOD","vPROFORCODDESTINO",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcsustitucionprocesoquimicoformulas_wc )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0205"+"");
            WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      }
      /*  Sending Event outputs  */
   }

   public void e141K62( )
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

   public void e151K62( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV25ProForCod ;
      GXv_char2[0] = AV26ProForCoddestino ;
      GXv_int5[0] = (byte)(AV28Flag1) ;
      GXv_int6[0] = (byte)(AV27Flag2) ;
      new app.pbusprc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int5, GXv_int6) ;
      sustitucionprocesoquimico_impl.this.AV29EmprCod = GXv_char4[0] ;
      sustitucionprocesoquimico_impl.this.AV25ProForCod = GXv_char3[0] ;
      sustitucionprocesoquimico_impl.this.AV26ProForCoddestino = GXv_char2[0] ;
      sustitucionprocesoquimico_impl.this.AV28Flag1 = GXv_int5[0] ;
      sustitucionprocesoquimico_impl.this.AV27Flag2 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25ProForCod", AV25ProForCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26ProForCoddestino", AV26ProForCoddestino);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Flag1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Flag1), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Flag2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Flag2), 4, 0));
      if ( AV28Flag1 == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso¡", ""));
         GX_FocusControl = edtavProforcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV27Flag2 == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Proceso¡", ""));
            GX_FocusControl = edtavProforcoddestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( GXutil.strcmp(AV25ProForCod, AV26ProForCoddestino) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Los procesos introducidos, son los mismos¡", ""));
               GX_FocusControl = edtavProforcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               AV34ProgressIndicator.showwithtitle(httpContext.getMessage( "Aplicando proceso......", ""));
               AV34ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
               Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.getMessage( "Consejo.Revisar Informe( informe con los datos que se aplicara el cambio)", "")+GXutil.newLine( ) ;
               ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
               Dvelop_confirmpanel_btnconfirmar_Confirmationtext = Dvelop_confirmpanel_btnconfirmar_Confirmationtext+httpContext.getMessage( "Desea sustituir el Proceso ", "")+GXutil.trim( AV25ProForCod)+httpContext.getMessage( " por el Proceso ", "")+GXutil.trim( AV26ProForCoddestino)+"?" ;
               ucDvelop_confirmpanel_btnconfirmar.sendProperty(context, "", false, Dvelop_confirmpanel_btnconfirmar_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
               AV35i = GXutil.sleep( 1) ;
               AV34ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
               AV34ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
               AV35i = GXutil.sleep( 2) ;
               AV34ProgressIndicator.hide();
               this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34ProgressIndicator", AV34ProgressIndicator);
   }

   public void e111K62( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'CONFIRMARPROCESO' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV34ProgressIndicator", AV34ProgressIndicator);
   }

   public void S202( )
   {
      /* 'LOADCOMBOPROFORCODDESTINO' Routine */
      returnInSub = false ;
      /* Using cursor H01K62 */
      pr_default.execute(0, new Object[] {AV29EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H01K62_A396EmprCod[0] ;
         A13133ProForAct = H01K62_A13133ProForAct[0] ;
         A13740ProFDsc = H01K62_A13740ProFDsc[0] ;
         A764ProForCod = H01K62_A764ProForCod[0] ;
         A766ProForDsc = H01K62_A766ProForDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV36ProForCoddestino_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_proforcoddestino_Selectedvalue_set = AV26ProForCoddestino ;
      ucCombo_proforcoddestino.sendProperty(context, "", false, Combo_proforcoddestino_Internalname, "SelectedValue_set", Combo_proforcoddestino_Selectedvalue_set);
   }

   public void S192( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01K63 */
      pr_default.execute(1, new Object[] {AV29EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H01K63_A396EmprCod[0] ;
         A13133ProForAct = H01K63_A13133ProForAct[0] ;
         A13740ProFDsc = H01K63_A13740ProFDsc[0] ;
         A764ProForCod = H01K63_A764ProForCod[0] ;
         A766ProForDsc = H01K63_A766ProForDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV38ProForCod_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_proforcod_Selectedvalue_set = AV25ProForCod ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
   }

   public void S182( )
   {
      /* 'LOADCOMBOMATCOD_TO' Routine */
      returnInSub = false ;
      /* Using cursor H01K64 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13743MatCDsc = H01K64_A13743MatCDsc[0] ;
         A626MatCod = H01K64_A626MatCod[0] ;
         A627MatDsc = H01K64_A627MatDsc[0] ;
         n627MatDsc = H01K64_n627MatDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A626MatCod, 3, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13743MatCDsc );
         AV40MatCod_to_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_matcod_to_Selectedvalue_set = ((0==AV12MatCod_to) ? "" : GXutil.trim( GXutil.str( AV12MatCod_to, 3, 0))) ;
      ucCombo_matcod_to.sendProperty(context, "", false, Combo_matcod_to_Internalname, "SelectedValue_set", Combo_matcod_to_Selectedvalue_set);
   }

   public void S172( )
   {
      /* 'LOADCOMBOMATCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01K65 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A13743MatCDsc = H01K65_A13743MatCDsc[0] ;
         A626MatCod = H01K65_A626MatCod[0] ;
         A627MatDsc = H01K65_A627MatDsc[0] ;
         n627MatDsc = H01K65_n627MatDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A626MatCod, 3, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13743MatCDsc );
         AV39MatCod_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_matcod_Selectedvalue_set = ((0==AV11MatCod) ? "" : GXutil.trim( GXutil.str( AV11MatCod, 3, 0))) ;
      ucCombo_matcod.sendProperty(context, "", false, Combo_matcod_Internalname, "SelectedValue_set", Combo_matcod_Selectedvalue_set);
   }

   public void S162( )
   {
      /* 'LOADCOMBOINTCOD_TO' Routine */
      returnInSub = false ;
      /* Using cursor H01K66 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A14255IntAct = H01K66_A14255IntAct[0] ;
         A13744IntCDsc = H01K66_A13744IntCDsc[0] ;
         A583IntCod = H01K66_A583IntCod[0] ;
         A584IntDsc = H01K66_A584IntDsc[0] ;
         n584IntDsc = H01K66_n584IntDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV42IntCod_to_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_intcod_to_Selectedvalue_set = ((0==AV14IntCod_to) ? "" : GXutil.trim( GXutil.str( AV14IntCod_to, 2, 0))) ;
      ucCombo_intcod_to.sendProperty(context, "", false, Combo_intcod_to_Internalname, "SelectedValue_set", Combo_intcod_to_Selectedvalue_set);
   }

   public void S152( )
   {
      /* 'LOADCOMBOINTCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01K67 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A14255IntAct = H01K67_A14255IntAct[0] ;
         A13744IntCDsc = H01K67_A13744IntCDsc[0] ;
         A583IntCod = H01K67_A583IntCod[0] ;
         A584IntDsc = H01K67_A584IntDsc[0] ;
         n584IntDsc = H01K67_n584IntDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A583IntCod, 2, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13744IntCDsc );
         AV41IntCod_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_intcod_Selectedvalue_set = ((0==AV13IntCod) ? "" : GXutil.trim( GXutil.str( AV13IntCod, 2, 0))) ;
      ucCombo_intcod.sendProperty(context, "", false, Combo_intcod_Internalname, "SelectedValue_set", Combo_intcod_Selectedvalue_set);
   }

   public void S142( )
   {
      /* 'LOADCOMBOTIPCOLCOD_TO' Routine */
      returnInSub = false ;
      /* Using cursor H01K68 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A13731TipColCDsc = H01K68_A13731TipColCDsc[0] ;
         A831TipColCod = H01K68_A831TipColCod[0] ;
         A832TipColDsc = H01K68_A832TipColDsc[0] ;
         n832TipColDsc = H01K68_n832TipColDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13731TipColCDsc );
         AV44TipColCod_to_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_tipcolcod_to_Selectedvalue_set = ((0==AV16TipColCod_to) ? "" : GXutil.trim( GXutil.str( AV16TipColCod_to, 2, 0))) ;
      ucCombo_tipcolcod_to.sendProperty(context, "", false, Combo_tipcolcod_to_Internalname, "SelectedValue_set", Combo_tipcolcod_to_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOTIPCOLCOD' Routine */
      returnInSub = false ;
      /* Using cursor H01K69 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A13731TipColCDsc = H01K69_A13731TipColCDsc[0] ;
         A831TipColCod = H01K69_A831TipColCod[0] ;
         A832TipColDsc = H01K69_A832TipColDsc[0] ;
         n832TipColDsc = H01K69_n832TipColDsc[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A831TipColCod, 2, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13731TipColCDsc );
         AV43TipColCod_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Combo_tipcolcod_Selectedvalue_set = ((0==AV15TipColCod) ? "" : GXutil.trim( GXutil.str( AV15TipColCod, 2, 0))) ;
      ucCombo_tipcolcod.sendProperty(context, "", false, Combo_tipcolcod_Internalname, "SelectedValue_set", Combo_tipcolcod_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICOD_TO' Routine */
      returnInSub = false ;
      /* Using cursor H01K610 */
      pr_default.execute(8);
      while ( (pr_default.getStatus(8) != 101) )
      {
         A10045CliAct = H01K610_A10045CliAct[0] ;
         A13735CliCNom = H01K610_A13735CliCNom[0] ;
         A252CliCod = H01K610_A252CliCod[0] ;
         A279CliNom = H01K610_A279CliNom[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV46CliCod_to_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(8);
      }
      pr_default.close(8);
      Combo_clicod_to_Selectedvalue_set = ((0==AV24CliCod_to) ? "" : GXutil.trim( GXutil.str( AV24CliCod_to, 6, 0))) ;
      ucCombo_clicod_to.sendProperty(context, "", false, Combo_clicod_to_Internalname, "SelectedValue_set", Combo_clicod_to_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      /* Using cursor H01K611 */
      pr_default.execute(9);
      while ( (pr_default.getStatus(9) != 101) )
      {
         A10045CliAct = H01K611_A10045CliAct[0] ;
         A13735CliCNom = H01K611_A13735CliCNom[0] ;
         A252CliCod = H01K611_A252CliCod[0] ;
         A279CliNom = H01K611_A279CliNom[0] ;
         AV37Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV37Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV45CliCod_Data.add(AV37Combo_DataItem, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
      Combo_clicod_Selectedvalue_set = ((0==AV23CliCod) ? "" : GXutil.trim( GXutil.str( AV23CliCod, 6, 0))) ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
   }

   public void S212( )
   {
      /* 'CONFIRMARPROCESO' Routine */
      returnInSub = false ;
      AV34ProgressIndicator.showwithtitle(httpContext.getMessage( "Aplicando proceso......", ""));
      AV34ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
      GXv_char4[0] = AV29EmprCod ;
      GXv_int7[0] = AV23CliCod ;
      GXv_int8[0] = AV24CliCod_to ;
      GXv_char3[0] = AV21ForSer ;
      GXv_char2[0] = AV22ForSer_to ;
      GXv_int9[0] = AV18ForColNum ;
      GXv_int10[0] = AV20ForColNum_to ;
      GXv_char11[0] = AV17ForColNom ;
      GXv_char12[0] = AV19ForColNom_to ;
      GXv_int6[0] = AV13IntCod ;
      GXv_int5[0] = AV14IntCod_to ;
      GXv_int13[0] = AV11MatCod ;
      GXv_int14[0] = AV12MatCod_to ;
      GXv_int15[0] = AV15TipColCod ;
      GXv_int16[0] = AV16TipColCod_to ;
      GXv_char17[0] = AV25ProForCod ;
      GXv_char18[0] = AV26ProForCoddestino ;
      GXv_int19[0] = (short)(0) ;
      GXv_int20[0] = (short)(9999) ;
      new app.formulaciontinte.psuspro(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_int10, GXv_char11, GXv_char12, GXv_int6, GXv_int5, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_int20) ;
      sustitucionprocesoquimico_impl.this.AV29EmprCod = GXv_char4[0] ;
      sustitucionprocesoquimico_impl.this.AV23CliCod = GXv_int7[0] ;
      sustitucionprocesoquimico_impl.this.AV24CliCod_to = GXv_int8[0] ;
      sustitucionprocesoquimico_impl.this.AV21ForSer = GXv_char3[0] ;
      sustitucionprocesoquimico_impl.this.AV22ForSer_to = GXv_char2[0] ;
      sustitucionprocesoquimico_impl.this.AV18ForColNum = GXv_int9[0] ;
      sustitucionprocesoquimico_impl.this.AV20ForColNum_to = GXv_int10[0] ;
      sustitucionprocesoquimico_impl.this.AV17ForColNom = GXv_char11[0] ;
      sustitucionprocesoquimico_impl.this.AV19ForColNom_to = GXv_char12[0] ;
      sustitucionprocesoquimico_impl.this.AV13IntCod = GXv_int6[0] ;
      sustitucionprocesoquimico_impl.this.AV14IntCod_to = GXv_int5[0] ;
      sustitucionprocesoquimico_impl.this.AV11MatCod = GXv_int13[0] ;
      sustitucionprocesoquimico_impl.this.AV12MatCod_to = GXv_int14[0] ;
      sustitucionprocesoquimico_impl.this.AV15TipColCod = GXv_int15[0] ;
      sustitucionprocesoquimico_impl.this.AV16TipColCod_to = GXv_int16[0] ;
      sustitucionprocesoquimico_impl.this.AV25ProForCod = GXv_char17[0] ;
      sustitucionprocesoquimico_impl.this.AV26ProForCoddestino = GXv_char18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV23CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod_to), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV21ForSer", AV21ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV22ForSer_to", AV22ForSer_to);
      httpContext.ajax_rsp_assign_attri("", false, "AV18ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum_to), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17ForColNom", AV17ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV19ForColNom_to", AV19ForColNom_to);
      httpContext.ajax_rsp_assign_attri("", false, "AV13IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13IntCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14IntCod_to), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11MatCod), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12MatCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12MatCod_to), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TipColCod_to), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV25ProForCod", AV25ProForCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26ProForCoddestino", AV26ProForCoddestino);
      AV35i = GXutil.sleep( 1) ;
      AV34ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
      AV34ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV35i = GXutil.sleep( 2) ;
      AV34ProgressIndicator.hide();
      AV25ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ProForCod", AV25ProForCod);
      AV26ProForCoddestino = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ProForCoddestino", AV26ProForCoddestino);
      httpContext.doAjaxRefresh();
   }

   protected void nextLoad( )
   {
   }

   protected void e161K62( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table5_232_1K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_232_1K62e( true) ;
      }
      else
      {
         wb_table5_232_1K62e( false) ;
      }
   }

   public void wb_table4_215_1K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0218"+"", GXutil.rtrim( WebComp_Wcwcsustitucionprocesosprogramas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0218"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcsustitucionprocesosprogramas), GXutil.lower( WebComp_Wcwcsustitucionprocesosprogramas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0218"+"");
               }
               WebComp_Wcwcsustitucionprocesosprogramas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcsustitucionprocesosprogramas), GXutil.lower( WebComp_Wcwcsustitucionprocesosprogramas_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_215_1K62e( true) ;
      }
      else
      {
         wb_table4_215_1K62e( false) ;
      }
   }

   public void wb_table3_202_1K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0205"+"", GXutil.rtrim( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0205"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcsustitucionprocesoquimicoformulas_wc), GXutil.lower( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0205"+"");
               }
               WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcsustitucionprocesoquimicoformulas_wc), GXutil.lower( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_202_1K62e( true) ;
      }
      else
      {
         wb_table3_202_1K62e( false) ;
      }
   }

   public void wb_table2_152_1K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable7_Internalname, tblUnnamedtable7_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DscTop ExtendedComboCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforcoddestino_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_proforcoddestino_Internalname, httpContext.getMessage( "Proceso Quimico", ""), "", "", lblTextblockcombo_proforcoddestino_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_proforcoddestino.setProperty("Caption", Combo_proforcoddestino_Caption);
         ucCombo_proforcoddestino.setProperty("Cls", Combo_proforcoddestino_Cls);
         ucCombo_proforcoddestino.setProperty("EmptyItem", Combo_proforcoddestino_Emptyitem);
         ucCombo_proforcoddestino.setProperty("DropDownOptionsData", AV36ProForCoddestino_Data);
         ucCombo_proforcoddestino.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcoddestino_Internalname, "COMBO_PROFORCODDESTINOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_152_1K62e( true) ;
      }
      else
      {
         wb_table2_152_1K62e( false) ;
      }
   }

   public void wb_table1_141_1K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable5_Internalname, tblUnnamedtable5_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DscTop ExtendedComboCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_proforcod_Internalname, httpContext.getMessage( "Proceso Quimico", ""), "", "", lblTextblockcombo_proforcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\SustitucionProcesoQuimico.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
         ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
         ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
         ucCombo_proforcod.setProperty("DropDownOptionsData", AV38ProForCod_Data);
         ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_141_1K62e( true) ;
      }
      else
      {
         wb_table1_141_1K62e( false) ;
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
      pa1K62( ) ;
      ws1K62( ) ;
      we1K62( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcsustitucionprocesoquimicoformulas_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component) != 0 )
         {
            WebComp_Wcsustitucionprocesoquimicoformulas_wc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wcwcsustitucionprocesosprogramas == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcsustitucionprocesosprogramas_Component) != 0 )
         {
            WebComp_Wcwcsustitucionprocesosprogramas.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171419334", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/sustitucionprocesoquimico.js", "?20268171419334", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTextblockcombo_clicod_Internalname = "TEXTBLOCKCOMBO_CLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      lblTextblockcombo_clicod_to_Internalname = "TEXTBLOCKCOMBO_CLICOD_TO" ;
      Combo_clicod_to_Internalname = "COMBO_CLICOD_TO" ;
      divTablesplittedclicod_to_Internalname = "TABLESPLITTEDCLICOD_TO" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtavForser_Internalname = "vFORSER" ;
      edtavForser_to_Internalname = "vFORSER_TO" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavForcolnom_Internalname = "vFORCOLNOM" ;
      edtavForcolnum_Internalname = "vFORCOLNUM" ;
      edtavForcolnom_to_Internalname = "vFORCOLNOM_TO" ;
      edtavForcolnum_to_Internalname = "vFORCOLNUM_TO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      lblTextblockcombo_tipcolcod_Internalname = "TEXTBLOCKCOMBO_TIPCOLCOD" ;
      Combo_tipcolcod_Internalname = "COMBO_TIPCOLCOD" ;
      divTablesplittedtipcolcod_Internalname = "TABLESPLITTEDTIPCOLCOD" ;
      lblTextblockcombo_tipcolcod_to_Internalname = "TEXTBLOCKCOMBO_TIPCOLCOD_TO" ;
      Combo_tipcolcod_to_Internalname = "COMBO_TIPCOLCOD_TO" ;
      divTablesplittedtipcolcod_to_Internalname = "TABLESPLITTEDTIPCOLCOD_TO" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      lblTextblockcombo_intcod_Internalname = "TEXTBLOCKCOMBO_INTCOD" ;
      Combo_intcod_Internalname = "COMBO_INTCOD" ;
      divTablesplittedintcod_Internalname = "TABLESPLITTEDINTCOD" ;
      lblTextblockcombo_intcod_to_Internalname = "TEXTBLOCKCOMBO_INTCOD_TO" ;
      Combo_intcod_to_Internalname = "COMBO_INTCOD_TO" ;
      divTablesplittedintcod_to_Internalname = "TABLESPLITTEDINTCOD_TO" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      lblTextblockcombo_matcod_Internalname = "TEXTBLOCKCOMBO_MATCOD" ;
      Combo_matcod_Internalname = "COMBO_MATCOD" ;
      divTablesplittedmatcod_Internalname = "TABLESPLITTEDMATCOD" ;
      lblTextblockcombo_matcod_to_Internalname = "TEXTBLOCKCOMBO_MATCOD_TO" ;
      Combo_matcod_to_Internalname = "COMBO_MATCOD_TO" ;
      divTablesplittedmatcod_to_Internalname = "TABLESPLITTEDMATCOD_TO" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      lblTextblockcombo_proforcod_Internalname = "TEXTBLOCKCOMBO_PROFORCOD" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      divTablesplittedproforcod_Internalname = "TABLESPLITTEDPROFORCOD" ;
      tblUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      lblTextblockcombo_proforcoddestino_Internalname = "TEXTBLOCKCOMBO_PROFORCODDESTINO" ;
      Combo_proforcoddestino_Internalname = "COMBO_PROFORCODDESTINO" ;
      divTablesplittedproforcoddestino_Internalname = "TABLESPLITTEDPROFORCODDESTINO" ;
      tblUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      grpUnnamedgroup8_Internalname = "UNNAMEDGROUP8" ;
      divTable_masopciones_Internalname = "TABLE_MASOPCIONES" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Datamon_Internalname = "DATAMON" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      edtavTipcolcod_to_Internalname = "vTIPCOLCOD_TO" ;
      edtavIntcod_Internalname = "vINTCOD" ;
      edtavIntcod_to_Internalname = "vINTCOD_TO" ;
      edtavMatcod_Internalname = "vMATCOD" ;
      edtavMatcod_to_Internalname = "vMATCOD_TO" ;
      edtavProforcod_Internalname = "vPROFORCOD" ;
      edtavProforcoddestino_Internalname = "vPROFORCODDESTINO" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtavProforcoddestino_Jsonclick = "" ;
      edtavProforcoddestino_Visible = 1 ;
      edtavProforcod_Jsonclick = "" ;
      edtavProforcod_Visible = 1 ;
      edtavMatcod_to_Jsonclick = "" ;
      edtavMatcod_to_Visible = 1 ;
      edtavMatcod_Jsonclick = "" ;
      edtavMatcod_Visible = 1 ;
      edtavIntcod_to_Jsonclick = "" ;
      edtavIntcod_to_Visible = 1 ;
      edtavIntcod_Jsonclick = "" ;
      edtavIntcod_Visible = 1 ;
      edtavTipcolcod_to_Jsonclick = "" ;
      edtavTipcolcod_to_Visible = 1 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Visible = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Visible = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavForcolnum_to_Jsonclick = "" ;
      edtavForcolnum_to_Enabled = 1 ;
      edtavForcolnom_to_Jsonclick = "" ;
      edtavForcolnom_to_Enabled = 1 ;
      edtavForcolnum_Jsonclick = "" ;
      edtavForcolnum_Enabled = 1 ;
      edtavForcolnom_Jsonclick = "" ;
      edtavForcolnom_Enabled = 1 ;
      edtavForser_to_Jsonclick = "" ;
      edtavForser_to_Enabled = 1 ;
      edtavForser_Jsonclick = "" ;
      edtavForser_Enabled = 1 ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Desea cambiar el proceso?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Informe", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gxuitabspanel_tabs_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs_Class = "" ;
      Gxuitabspanel_tabs_Pagecount = 2 ;
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
      Dvpanel_panel_filtrosmas_Title = "" ;
      Dvpanel_panel_filtrosmas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosmas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Width = "100%" ;
      Combo_proforcoddestino_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcoddestino_Cls = "ExtendedCombo AttributeFL" ;
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Cls = "ExtendedCombo AttributeFL" ;
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
      Combo_matcod_to_Emptyitemtext = "Todos" ;
      Combo_matcod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_matcod_Emptyitemtext = "Todos" ;
      Combo_matcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_intcod_to_Emptyitemtext = "Todos" ;
      Combo_intcod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_intcod_Emptyitemtext = "Todos" ;
      Combo_intcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipcolcod_to_Emptyitemtext = "Todos" ;
      Combo_tipcolcod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_tipcolcod_Emptyitemtext = "Todos" ;
      Combo_tipcolcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_to_Emptyitemtext = "Todos" ;
      Combo_clicod_to_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Emptyitemtext = "Todos" ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Sustitucion Proceso Quimico", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("'DORESULTADOS'","{handler:'e131K62',iparms:[{av:'AV25ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV19ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV18ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV20ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV21ForSer',fld:'vFORSER',pic:''},{av:'AV22ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV13IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV14IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV11MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV12MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV15TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV16TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV26ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCWCSUSTITUCIONPROCESOSPROGRAMAS'},{ctrl:'WCSUSTITUCIONPROCESOQUIMICOFORMULAS_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141K62',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e151K62',iparms:[{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV26ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV28Flag1',fld:'vFLAG1',pic:'ZZZ9'},{av:'AV27Flag2',fld:'vFLAG2',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV27Flag2',fld:'vFLAG2',pic:'ZZZ9'},{av:'AV28Flag1',fld:'vFLAG1',pic:'ZZZ9'},{av:'AV26ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV25ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e111K62',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV24CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV21ForSer',fld:'vFORSER',pic:''},{av:'AV22ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV18ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV20ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV19ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV13IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV14IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV11MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV12MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV15TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV16TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV25ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV26ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV26ProForCoddestino',fld:'vPROFORCODDESTINO',pic:''},{av:'AV25ProForCod',fld:'vPROFORCOD',pic:''},{av:'AV16TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV15TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV12MatCod_to',fld:'vMATCOD_TO',pic:'ZZ9'},{av:'AV11MatCod',fld:'vMATCOD',pic:'ZZ9'},{av:'AV14IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV13IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV19ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV20ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV18ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV22ForSer_to',fld:'vFORSER_TO',pic:''},{av:'AV21ForSer',fld:'vFORSER',pic:''},{av:'AV24CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV23CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Combo_proforcoddestino_Selectedvalue_get = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      Combo_matcod_to_Selectedvalue_get = "" ;
      Combo_matcod_Selectedvalue_get = "" ;
      Combo_intcod_to_Selectedvalue_get = "" ;
      Combo_intcod_Selectedvalue_get = "" ;
      Combo_tipcolcod_to_Selectedvalue_get = "" ;
      Combo_tipcolcod_Selectedvalue_get = "" ;
      Combo_clicod_to_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV45CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV46CliCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV43TipColCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44TipColCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41IntCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42IntCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV39MatCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40MatCod_to_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV38ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36ProForCoddestino_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV29EmprCod = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_to_Selectedvalue_set = "" ;
      Combo_tipcolcod_Selectedvalue_set = "" ;
      Combo_tipcolcod_to_Selectedvalue_set = "" ;
      Combo_intcod_Selectedvalue_set = "" ;
      Combo_intcod_to_Selectedvalue_set = "" ;
      Combo_matcod_Selectedvalue_set = "" ;
      Combo_matcod_to_Selectedvalue_set = "" ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Combo_proforcoddestino_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      lblTextblockcombo_clicod_to_Jsonclick = "" ;
      ucCombo_clicod_to = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_to_Caption = "" ;
      TempTags = "" ;
      AV21ForSer = "" ;
      AV22ForSer_to = "" ;
      AV17ForColNom = "" ;
      AV19ForColNom_to = "" ;
      lblTextblockcombo_tipcolcod_Jsonclick = "" ;
      ucCombo_tipcolcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipcolcod_Caption = "" ;
      lblTextblockcombo_tipcolcod_to_Jsonclick = "" ;
      ucCombo_tipcolcod_to = new com.genexus.webpanels.GXUserControl();
      Combo_tipcolcod_to_Caption = "" ;
      lblTextblockcombo_intcod_Jsonclick = "" ;
      ucCombo_intcod = new com.genexus.webpanels.GXUserControl();
      Combo_intcod_Caption = "" ;
      lblTextblockcombo_intcod_to_Jsonclick = "" ;
      ucCombo_intcod_to = new com.genexus.webpanels.GXUserControl();
      Combo_intcod_to_Caption = "" ;
      lblTextblockcombo_matcod_Jsonclick = "" ;
      ucCombo_matcod = new com.genexus.webpanels.GXUserControl();
      Combo_matcod_Caption = "" ;
      lblTextblockcombo_matcod_to_Jsonclick = "" ;
      ucCombo_matcod_to = new com.genexus.webpanels.GXUserControl();
      Combo_matcod_to_Caption = "" ;
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTab02_title_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV25ProForCod = "" ;
      AV26ProForCoddestino = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      OldWcsustitucionprocesoquimicoformulas_wc = "" ;
      WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component = "" ;
      OldWcwcsustitucionprocesosprogramas = "" ;
      WebComp_Wcwcsustitucionprocesosprogramas_Component = "" ;
      AV30Station = "" ;
      AV31EmprNom = "" ;
      AV32UsurCod = "" ;
      GXt_char1 = "" ;
      AV33ProForDsc = "" ;
      AV34ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      scmdbuf = "" ;
      H01K62_A396EmprCod = new String[] {""} ;
      H01K62_A13133ProForAct = new String[] {""} ;
      H01K62_A13740ProFDsc = new String[] {""} ;
      H01K62_A764ProForCod = new String[] {""} ;
      H01K62_A766ProForDsc = new String[] {""} ;
      A396EmprCod = "" ;
      A13133ProForAct = "" ;
      A13740ProFDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV37Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      ucCombo_proforcoddestino = new com.genexus.webpanels.GXUserControl();
      H01K63_A396EmprCod = new String[] {""} ;
      H01K63_A13133ProForAct = new String[] {""} ;
      H01K63_A13740ProFDsc = new String[] {""} ;
      H01K63_A764ProForCod = new String[] {""} ;
      H01K63_A766ProForDsc = new String[] {""} ;
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      H01K64_A396EmprCod = new String[] {""} ;
      H01K64_A13743MatCDsc = new String[] {""} ;
      H01K64_A626MatCod = new short[1] ;
      H01K64_A627MatDsc = new String[] {""} ;
      H01K64_n627MatDsc = new boolean[] {false} ;
      A13743MatCDsc = "" ;
      A627MatDsc = "" ;
      H01K65_A396EmprCod = new String[] {""} ;
      H01K65_A13743MatCDsc = new String[] {""} ;
      H01K65_A626MatCod = new short[1] ;
      H01K65_A627MatDsc = new String[] {""} ;
      H01K65_n627MatDsc = new boolean[] {false} ;
      H01K66_A396EmprCod = new String[] {""} ;
      H01K66_A14255IntAct = new String[] {""} ;
      H01K66_A13744IntCDsc = new String[] {""} ;
      H01K66_A583IntCod = new byte[1] ;
      H01K66_A584IntDsc = new String[] {""} ;
      H01K66_n584IntDsc = new boolean[] {false} ;
      A14255IntAct = "" ;
      A13744IntCDsc = "" ;
      A584IntDsc = "" ;
      H01K67_A396EmprCod = new String[] {""} ;
      H01K67_A14255IntAct = new String[] {""} ;
      H01K67_A13744IntCDsc = new String[] {""} ;
      H01K67_A583IntCod = new byte[1] ;
      H01K67_A584IntDsc = new String[] {""} ;
      H01K67_n584IntDsc = new boolean[] {false} ;
      H01K68_A396EmprCod = new String[] {""} ;
      H01K68_A13731TipColCDsc = new String[] {""} ;
      H01K68_A831TipColCod = new byte[1] ;
      H01K68_A832TipColDsc = new String[] {""} ;
      H01K68_n832TipColDsc = new boolean[] {false} ;
      A13731TipColCDsc = "" ;
      A832TipColDsc = "" ;
      H01K69_A396EmprCod = new String[] {""} ;
      H01K69_A13731TipColCDsc = new String[] {""} ;
      H01K69_A831TipColCod = new byte[1] ;
      H01K69_A832TipColDsc = new String[] {""} ;
      H01K69_n832TipColDsc = new boolean[] {false} ;
      H01K610_A396EmprCod = new String[] {""} ;
      H01K610_A10045CliAct = new String[] {""} ;
      H01K610_A13735CliCNom = new String[] {""} ;
      H01K610_A252CliCod = new int[1] ;
      H01K610_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H01K611_A396EmprCod = new String[] {""} ;
      H01K611_A10045CliAct = new String[] {""} ;
      H01K611_A13735CliCNom = new String[] {""} ;
      H01K611_A252CliCod = new int[1] ;
      H01K611_A279CliNom = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new int[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new byte[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      sStyleString = "" ;
      lblTextblockcombo_proforcoddestino_Jsonclick = "" ;
      Combo_proforcoddestino_Caption = "" ;
      lblTextblockcombo_proforcod_Jsonclick = "" ;
      Combo_proforcod_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.sustitucionprocesoquimico__default(),
         new Object[] {
             new Object[] {
            H01K62_A396EmprCod, H01K62_A13133ProForAct, H01K62_A13740ProFDsc, H01K62_A764ProForCod, H01K62_A766ProForDsc
            }
            , new Object[] {
            H01K63_A396EmprCod, H01K63_A13133ProForAct, H01K63_A13740ProFDsc, H01K63_A764ProForCod, H01K63_A766ProForDsc
            }
            , new Object[] {
            H01K64_A396EmprCod, H01K64_A13743MatCDsc, H01K64_A626MatCod, H01K64_A627MatDsc, H01K64_n627MatDsc
            }
            , new Object[] {
            H01K65_A396EmprCod, H01K65_A13743MatCDsc, H01K65_A626MatCod, H01K65_A627MatDsc, H01K65_n627MatDsc
            }
            , new Object[] {
            H01K66_A396EmprCod, H01K66_A14255IntAct, H01K66_A13744IntCDsc, H01K66_A583IntCod, H01K66_A584IntDsc, H01K66_n584IntDsc
            }
            , new Object[] {
            H01K67_A396EmprCod, H01K67_A14255IntAct, H01K67_A13744IntCDsc, H01K67_A583IntCod, H01K67_A584IntDsc, H01K67_n584IntDsc
            }
            , new Object[] {
            H01K68_A396EmprCod, H01K68_A13731TipColCDsc, H01K68_A831TipColCod, H01K68_A832TipColDsc, H01K68_n832TipColDsc
            }
            , new Object[] {
            H01K69_A396EmprCod, H01K69_A13731TipColCDsc, H01K69_A831TipColCod, H01K69_A832TipColDsc, H01K69_n832TipColDsc
            }
            , new Object[] {
            H01K610_A396EmprCod, H01K610_A10045CliAct, H01K610_A13735CliCNom, H01K610_A252CliCod, H01K610_A279CliNom
            }
            , new Object[] {
            H01K611_A396EmprCod, H01K611_A10045CliAct, H01K611_A13735CliCNom, H01K611_A252CliCod, H01K611_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcsustitucionprocesoquimicoformulas_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wcwcsustitucionprocesosprogramas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV15TipColCod ;
   private byte AV16TipColCod_to ;
   private byte AV13IntCod ;
   private byte AV14IntCod_to ;
   private byte nDonePA ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte GXv_int6[] ;
   private byte GXv_int5[] ;
   private byte GXv_int15[] ;
   private byte GXv_int16[] ;
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
   private short AV28Flag1 ;
   private short AV27Flag2 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV11MatCod ;
   private short AV12MatCod_to ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV35i ;
   private short A626MatCod ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavForser_Enabled ;
   private int edtavForser_to_Enabled ;
   private int edtavForcolnom_Enabled ;
   private int AV18ForColNum ;
   private int edtavForcolnum_Enabled ;
   private int edtavForcolnom_to_Enabled ;
   private int AV20ForColNum_to ;
   private int edtavForcolnum_to_Enabled ;
   private int AV23CliCod ;
   private int edtavClicod_Visible ;
   private int AV24CliCod_to ;
   private int edtavClicod_to_Visible ;
   private int edtavTipcolcod_Visible ;
   private int edtavTipcolcod_to_Visible ;
   private int edtavIntcod_Visible ;
   private int edtavIntcod_to_Visible ;
   private int edtavMatcod_Visible ;
   private int edtavMatcod_to_Visible ;
   private int edtavProforcod_Visible ;
   private int edtavProforcoddestino_Visible ;
   private int A252CliCod ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int GXv_int10[] ;
   private int idxLst ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Combo_proforcoddestino_Selectedvalue_get ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String Combo_matcod_to_Selectedvalue_get ;
   private String Combo_matcod_Selectedvalue_get ;
   private String Combo_intcod_to_Selectedvalue_get ;
   private String Combo_intcod_Selectedvalue_get ;
   private String Combo_tipcolcod_to_Selectedvalue_get ;
   private String Combo_tipcolcod_Selectedvalue_get ;
   private String Combo_clicod_to_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV29EmprCod ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_to_Cls ;
   private String Combo_clicod_to_Selectedvalue_set ;
   private String Combo_clicod_to_Emptyitemtext ;
   private String Combo_tipcolcod_Cls ;
   private String Combo_tipcolcod_Selectedvalue_set ;
   private String Combo_tipcolcod_Emptyitemtext ;
   private String Combo_tipcolcod_to_Cls ;
   private String Combo_tipcolcod_to_Selectedvalue_set ;
   private String Combo_tipcolcod_to_Emptyitemtext ;
   private String Combo_intcod_Cls ;
   private String Combo_intcod_Selectedvalue_set ;
   private String Combo_intcod_Emptyitemtext ;
   private String Combo_intcod_to_Cls ;
   private String Combo_intcod_to_Selectedvalue_set ;
   private String Combo_intcod_to_Emptyitemtext ;
   private String Combo_matcod_Cls ;
   private String Combo_matcod_Selectedvalue_set ;
   private String Combo_matcod_Emptyitemtext ;
   private String Combo_matcod_to_Cls ;
   private String Combo_matcod_to_Selectedvalue_set ;
   private String Combo_matcod_to_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Selectedvalue_set ;
   private String Combo_proforcoddestino_Cls ;
   private String Combo_proforcoddestino_Selectedvalue_set ;
   private String Dvpanel_panel_filtrosmas_Width ;
   private String Dvpanel_panel_filtrosmas_Cls ;
   private String Dvpanel_panel_filtrosmas_Title ;
   private String Dvpanel_panel_filtrosmas_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
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
   private String divUnnamedtable9_Internalname ;
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
   private String divUnnamedtable10_Internalname ;
   private String edtavForser_Internalname ;
   private String TempTags ;
   private String AV21ForSer ;
   private String edtavForser_Jsonclick ;
   private String edtavForser_to_Internalname ;
   private String AV22ForSer_to ;
   private String edtavForser_to_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavForcolnom_Internalname ;
   private String AV17ForColNom ;
   private String edtavForcolnom_Jsonclick ;
   private String edtavForcolnum_Internalname ;
   private String edtavForcolnum_Jsonclick ;
   private String edtavForcolnom_to_Internalname ;
   private String AV19ForColNom_to ;
   private String edtavForcolnom_to_Jsonclick ;
   private String edtavForcolnum_to_Internalname ;
   private String edtavForcolnum_to_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String divTablesplittedtipcolcod_Internalname ;
   private String lblTextblockcombo_tipcolcod_Internalname ;
   private String lblTextblockcombo_tipcolcod_Jsonclick ;
   private String Combo_tipcolcod_Caption ;
   private String Combo_tipcolcod_Internalname ;
   private String divTablesplittedtipcolcod_to_Internalname ;
   private String lblTextblockcombo_tipcolcod_to_Internalname ;
   private String lblTextblockcombo_tipcolcod_to_Jsonclick ;
   private String Combo_tipcolcod_to_Caption ;
   private String Combo_tipcolcod_to_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String divTablesplittedintcod_Internalname ;
   private String lblTextblockcombo_intcod_Internalname ;
   private String lblTextblockcombo_intcod_Jsonclick ;
   private String Combo_intcod_Caption ;
   private String Combo_intcod_Internalname ;
   private String divTablesplittedintcod_to_Internalname ;
   private String lblTextblockcombo_intcod_to_Internalname ;
   private String lblTextblockcombo_intcod_to_Jsonclick ;
   private String Combo_intcod_to_Caption ;
   private String Combo_intcod_to_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divTablesplittedmatcod_Internalname ;
   private String lblTextblockcombo_matcod_Internalname ;
   private String lblTextblockcombo_matcod_Jsonclick ;
   private String Combo_matcod_Caption ;
   private String Combo_matcod_Internalname ;
   private String divTablesplittedmatcod_to_Internalname ;
   private String lblTextblockcombo_matcod_to_Internalname ;
   private String lblTextblockcombo_matcod_to_Jsonclick ;
   private String Combo_matcod_to_Caption ;
   private String Combo_matcod_to_Internalname ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divTable_masopciones_Internalname ;
   private String grpUnnamedgroup6_Internalname ;
   private String grpUnnamedgroup8_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Datamon_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String edtavTipcolcod_Internalname ;
   private String edtavTipcolcod_Jsonclick ;
   private String edtavTipcolcod_to_Internalname ;
   private String edtavTipcolcod_to_Jsonclick ;
   private String edtavIntcod_Internalname ;
   private String edtavIntcod_Jsonclick ;
   private String edtavIntcod_to_Internalname ;
   private String edtavIntcod_to_Jsonclick ;
   private String edtavMatcod_Internalname ;
   private String edtavMatcod_Jsonclick ;
   private String edtavMatcod_to_Internalname ;
   private String edtavMatcod_to_Jsonclick ;
   private String edtavProforcod_Internalname ;
   private String AV25ProForCod ;
   private String edtavProforcod_Jsonclick ;
   private String edtavProforcoddestino_Internalname ;
   private String AV26ProForCoddestino ;
   private String edtavProforcoddestino_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String OldWcsustitucionprocesoquimicoformulas_wc ;
   private String WebComp_Wcsustitucionprocesoquimicoformulas_wc_Component ;
   private String OldWcwcsustitucionprocesosprogramas ;
   private String WebComp_Wcwcsustitucionprocesosprogramas_Component ;
   private String AV30Station ;
   private String AV31EmprNom ;
   private String AV32UsurCod ;
   private String GXt_char1 ;
   private String AV33ProForDsc ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A13133ProForAct ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String Combo_proforcoddestino_Internalname ;
   private String Combo_proforcod_Internalname ;
   private String A627MatDsc ;
   private String A14255IntAct ;
   private String A584IntDsc ;
   private String A832TipColDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String tblUnnamedtable2_Internalname ;
   private String tblUnnamedtable7_Internalname ;
   private String divTablesplittedproforcoddestino_Internalname ;
   private String lblTextblockcombo_proforcoddestino_Internalname ;
   private String lblTextblockcombo_proforcoddestino_Jsonclick ;
   private String Combo_proforcoddestino_Caption ;
   private String tblUnnamedtable5_Internalname ;
   private String divTablesplittedproforcod_Internalname ;
   private String lblTextblockcombo_proforcod_Internalname ;
   private String lblTextblockcombo_proforcod_Jsonclick ;
   private String Combo_proforcod_Caption ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Combo_proforcod_Emptyitem ;
   private boolean Combo_proforcoddestino_Emptyitem ;
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
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean bDynCreated_Wcwcsustitucionprocesosprogramas ;
   private boolean bDynCreated_Wcsustitucionprocesoquimicoformulas_wc ;
   private boolean n627MatDsc ;
   private boolean n584IntDsc ;
   private boolean n832TipColDsc ;
   private String A13740ProFDsc ;
   private String A13743MatCDsc ;
   private String A13744IntCDsc ;
   private String A13731TipColCDsc ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcsustitucionprocesoquimicoformulas_wc ;
   private GXWebComponent WebComp_Wcwcsustitucionprocesosprogramas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipcolcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipcolcod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_intcod_to ;
   private com.genexus.webpanels.GXUserControl ucCombo_matcod ;
   private com.genexus.webpanels.GXUserControl ucCombo_matcod_to ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcoddestino ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private IDataStoreProvider pr_default ;
   private String[] H01K62_A396EmprCod ;
   private String[] H01K62_A13133ProForAct ;
   private String[] H01K62_A13740ProFDsc ;
   private String[] H01K62_A764ProForCod ;
   private String[] H01K62_A766ProForDsc ;
   private String[] H01K63_A396EmprCod ;
   private String[] H01K63_A13133ProForAct ;
   private String[] H01K63_A13740ProFDsc ;
   private String[] H01K63_A764ProForCod ;
   private String[] H01K63_A766ProForDsc ;
   private String[] H01K64_A396EmprCod ;
   private String[] H01K64_A13743MatCDsc ;
   private short[] H01K64_A626MatCod ;
   private String[] H01K64_A627MatDsc ;
   private boolean[] H01K64_n627MatDsc ;
   private String[] H01K65_A396EmprCod ;
   private String[] H01K65_A13743MatCDsc ;
   private short[] H01K65_A626MatCod ;
   private String[] H01K65_A627MatDsc ;
   private boolean[] H01K65_n627MatDsc ;
   private String[] H01K66_A396EmprCod ;
   private String[] H01K66_A14255IntAct ;
   private String[] H01K66_A13744IntCDsc ;
   private byte[] H01K66_A583IntCod ;
   private String[] H01K66_A584IntDsc ;
   private boolean[] H01K66_n584IntDsc ;
   private String[] H01K67_A396EmprCod ;
   private String[] H01K67_A14255IntAct ;
   private String[] H01K67_A13744IntCDsc ;
   private byte[] H01K67_A583IntCod ;
   private String[] H01K67_A584IntDsc ;
   private boolean[] H01K67_n584IntDsc ;
   private String[] H01K68_A396EmprCod ;
   private String[] H01K68_A13731TipColCDsc ;
   private byte[] H01K68_A831TipColCod ;
   private String[] H01K68_A832TipColDsc ;
   private boolean[] H01K68_n832TipColDsc ;
   private String[] H01K69_A396EmprCod ;
   private String[] H01K69_A13731TipColCDsc ;
   private byte[] H01K69_A831TipColCod ;
   private String[] H01K69_A832TipColDsc ;
   private boolean[] H01K69_n832TipColDsc ;
   private String[] H01K610_A396EmprCod ;
   private String[] H01K610_A10045CliAct ;
   private String[] H01K610_A13735CliCNom ;
   private int[] H01K610_A252CliCod ;
   private String[] H01K610_A279CliNom ;
   private String[] H01K611_A396EmprCod ;
   private String[] H01K611_A10045CliAct ;
   private String[] H01K611_A13735CliCNom ;
   private int[] H01K611_A252CliCod ;
   private String[] H01K611_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV45CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46CliCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV43TipColCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV44TipColCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41IntCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV42IntCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV39MatCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40MatCod_to_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36ProForCoddestino_Data ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV34ProgressIndicator ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV37Combo_DataItem ;
}

final  class sustitucionprocesoquimico__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01K62", "SELECT EmprCod, ProForAct, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForAct = 'S') ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K63", "SELECT EmprCod, ProForAct, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForAct = 'S') ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K64", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, MatCod, MatDsc FROM TXPMATICE ORDER BY MatCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K65", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(MatCod,'990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( MatDsc, ''))) AS MatCDsc, MatCod, MatDsc FROM TXPMATICE ORDER BY MatCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K66", "SELECT EmprCod, IntAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, IntCod, IntDsc FROM TXPINTENS WHERE IntAct = 'S' ORDER BY IntCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K67", "SELECT EmprCod, IntAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, IntCod, IntDsc FROM TXPINTENS WHERE IntAct = 'S' ORDER BY IntCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K68", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, TipColCod, TipColDsc FROM TXPTIPCOL ORDER BY TipColCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K69", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, TipColCod, TipColDsc FROM TXPTIPCOL ORDER BY TipColCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K610", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01K611", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 9 :
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

