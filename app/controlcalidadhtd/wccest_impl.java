package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccest_impl extends GXDataArea
{
   public wccest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccest_impl.class ));
   }

   public wccest_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipo = new HTMLChoice();
      cmbavNivfinfrom = new HTMLChoice();
      cmbavNivfinto = new HTMLChoice();
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
      pa2BN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BN2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wccest", new String[] {}, new String[] {}) +"\">") ;
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIINI_DATA", AV11CliIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIINI_DATA", AV11CliIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIFIN_DATA", AV13CliFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIFIN_DATA", AV13CliFin_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCCTINI_DATA", AV22CCTIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCCTINI_DATA", AV22CCTIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCCTFIN_DATA", AV24CCTFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCCTFIN_DATA", AV24CCTFin_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Cls", GXutil.rtrim( Combo_cliini_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_set", GXutil.rtrim( Combo_cliini_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Emptyitemtext", GXutil.rtrim( Combo_cliini_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Cls", GXutil.rtrim( Combo_clifin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_set", GXutil.rtrim( Combo_clifin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Emptyitemtext", GXutil.rtrim( Combo_clifin_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTINI_Cls", GXutil.rtrim( Combo_cctini_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTINI_Selectedvalue_set", GXutil.rtrim( Combo_cctini_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTINI_Emptyitemtext", GXutil.rtrim( Combo_cctini_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTFIN_Cls", GXutil.rtrim( Combo_cctfin_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTFIN_Selectedvalue_set", GXutil.rtrim( Combo_cctfin_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTFIN_Emptyitemtext", GXutil.rtrim( Combo_cctfin_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTFIN_Selectedvalue_get", GXutil.rtrim( Combo_cctfin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CCTINI_Selectedvalue_get", GXutil.rtrim( Combo_cctini_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIFIN_Selectedvalue_get", GXutil.rtrim( Combo_clifin_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIINI_Selectedvalue_get", GXutil.rtrim( Combo_cliini_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcwccest_wc == null ) )
      {
         WebComp_Wcwccest_wc.componentjscripts();
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
         we2BN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BN2( ) ;
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
      return formatLink("app.controlcalidadhtd.wccest", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.wCCEst" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Est. Controles HTD", "") ;
   }

   public void wb2BN0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodfrom_Internalname, httpContext.getMessage( "Nº HDR Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV34BarCodfrom, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34BarCodfrom), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34BarCodfrom), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodfrom_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreofrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreofrom_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreofrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV35BarCodReofrom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreofrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35BarCodReofrom), "9") : localUtil.format( DecimalUtil.doubleToDec(AV35BarCodReofrom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreofrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreofrom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparfrom_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparfrom_Internalname, GXutil.rtrim( AV36BarCodParfrom), GXutil.rtrim( localUtil.format( AV36BarCodParfrom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparfrom_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodto_Internalname, httpContext.getMessage( "Nº HDR Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV37BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreoto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreoto_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV38BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV38BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodparto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodparto_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV39BarCodParto), GXutil.rtrim( localUtil.format( AV39BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcliini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cliini_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_cliini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cliini.setProperty("Caption", Combo_cliini_Caption);
         ucCombo_cliini.setProperty("Cls", Combo_cliini_Cls);
         ucCombo_cliini.setProperty("EmptyItemText", Combo_cliini_Emptyitemtext);
         ucCombo_cliini.setProperty("DropDownOptionsData", AV11CliIni_Data);
         ucCombo_cliini.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cliini_Internalname, "COMBO_CLIINIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclifin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clifin_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clifin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clifin.setProperty("Caption", Combo_clifin_Caption);
         ucCombo_clifin.setProperty("Cls", Combo_clifin_Cls);
         ucCombo_clifin.setProperty("EmptyItemText", Combo_clifin_Emptyitemtext);
         ucCombo_clifin.setProperty("DropDownOptionsData", AV13CliFin_Data);
         ucCombo_clifin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clifin_Internalname, "COMBO_CLIFINContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablearticle_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtini_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtini_Internalname, GXutil.rtrim( AV20ArtIni), GXutil.rtrim( localUtil.format( AV20ArtIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtini_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtfin_Internalname, httpContext.getMessage( "Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtfin_Internalname, GXutil.rtrim( AV21ArtFin), GXutil.rtrim( localUtil.format( AV21ArtFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtfin_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnomini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnomini_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnomini_Internalname, GXutil.rtrim( AV16ColNomIni), GXutil.rtrim( localUtil.format( AV16ColNomIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnomini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnomini_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumini_Internalname, httpContext.getMessage( "Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumini_Internalname, GXutil.ltrim( localUtil.ntoc( AV17ColNumIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17ColNumIni), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17ColNumIni), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumini_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnomfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnomfin_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnomfin_Internalname, GXutil.rtrim( AV18ColNomFin), GXutil.rtrim( localUtil.format( AV18ColNomFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnomfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnomfin_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavColnumfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavColnumfin_Internalname, httpContext.getMessage( "Número", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavColnumfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ColNumFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavColnumfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ColNumFin), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ColNumFin), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavColnumfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavColnumfin_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcctini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cctini_Internalname, httpContext.getMessage( "C.C Inicial", ""), "", "", lblTextblockcombo_cctini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cctini.setProperty("Caption", Combo_cctini_Caption);
         ucCombo_cctini.setProperty("Cls", Combo_cctini_Cls);
         ucCombo_cctini.setProperty("EmptyItemText", Combo_cctini_Emptyitemtext);
         ucCombo_cctini.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_cctini.setProperty("DropDownOptionsData", AV22CCTIni_Data);
         ucCombo_cctini.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cctini_Internalname, "COMBO_CCTINIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcctfin_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cctfin_Internalname, httpContext.getMessage( "C.C Final", ""), "", "", lblTextblockcombo_cctfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cctfin.setProperty("Caption", Combo_cctfin_Caption);
         ucCombo_cctfin.setProperty("Cls", Combo_cctfin_Cls);
         ucCombo_cctfin.setProperty("EmptyItemText", Combo_cctfin_Emptyitemtext);
         ucCombo_cctfin.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucCombo_cctfin.setProperty("DropDownOptionsData", AV24CCTFin_Data);
         ucCombo_cctfin.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_cctfin_Internalname, "COMBO_CCTFINContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcfchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcfchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCcfchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcfchfrom_Internalname, localUtil.format(AV30CCFchfrom, "99/99/99"), localUtil.format( AV30CCFchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcfchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCcfchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCcfchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcfchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcfchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCcfchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcfchto_Internalname, localUtil.format(AV31CCFchto, "99/99/99"), localUtil.format( AV31CCFchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcfchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcfchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCcfchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCcfchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipo.getInternalname(), httpContext.getMessage( "Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipo, cmbavTipo.getInternalname(), GXutil.rtrim( AV29Tipo), 1, cmbavTipo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavTipo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         cmbavTipo.setValue( GXutil.rtrim( AV29Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavNivfinfrom.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavNivfinfrom.getInternalname(), httpContext.getMessage( "Nivel Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavNivfinfrom, cmbavNivfinfrom.getInternalname(), GXutil.rtrim( AV32NivFinfrom), 1, cmbavNivfinfrom.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavNivfinfrom.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         cmbavNivfinfrom.setValue( GXutil.rtrim( AV32NivFinfrom) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinfrom.getInternalname(), "Values", cmbavNivfinfrom.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavNivfinto.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavNivfinto.getInternalname(), httpContext.getMessage( "Nivel Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavNivfinto, cmbavNivfinto.getInternalname(), GXutil.rtrim( AV33NivFinto), 1, cmbavNivfinto.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavNivfinto.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
         cmbavNivfinto.setValue( GXutil.rtrim( AV33NivFinto) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinto.getInternalname(), "Values", cmbavNivfinto.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "Pdf (Win)", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "Pdf (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "", httpContext.getMessage( "Exportar (Win)", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Exportar (Win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultado_Internalname, "", httpContext.getMessage( "Resultado", ""), bttBtnresultado_Jsonclick, 7, httpContext.getMessage( "Resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112bn1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\wCCEst.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0189"+"", GXutil.rtrim( WebComp_Wcwccest_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0189"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwccest_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwccest_wc), GXutil.lower( WebComp_Wcwccest_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0189"+"");
               }
               WebComp_Wcwccest_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwccest_wc), GXutil.lower( WebComp_Wcwccest_wc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV46Pgmname), GXutil.rtrim( localUtil.format( AV46Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliini_Internalname, GXutil.ltrim( localUtil.ntoc( AV9CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9CliIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,200);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCliini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifin_Internalname, GXutil.ltrim( localUtil.ntoc( AV10CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10CliFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifin_Jsonclick, 0, "Attribute", "", "", "", "", edtavClifin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctini_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14CCTIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,202);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCctini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15CCTFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,203);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctfin_Jsonclick, 0, "Attribute", "", "", "", "", edtavCctfin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\wCCEst.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2BN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Est. Controles HTD", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BN0( ) ;
   }

   public void ws2BN2( )
   {
      start2BN2( ) ;
      evt2BN2( ) ;
   }

   public void evt2BN2( )
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
                           e122BN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportar' */
                           e132BN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e142BN2 ();
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
                                 e152BN2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e162BN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPdf' */
                           e172BN2 ();
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
                     if ( nCmpId == 189 )
                     {
                        OldWcwccest_wc = httpContext.cgiGet( "W0189") ;
                        if ( ( GXutil.len( OldWcwccest_wc) == 0 ) || ( GXutil.strcmp(OldWcwccest_wc, WebComp_Wcwccest_wc_Component) != 0 ) )
                        {
                           WebComp_Wcwccest_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcwccest_wc + "_impl", remoteHandle, context);
                           WebComp_Wcwccest_wc_Component = OldWcwccest_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcwccest_wc_Component) != 0 )
                        {
                           WebComp_Wcwccest_wc.componentprocess("W0189", "", sEvt);
                        }
                        WebComp_Wcwccest_wc_Component = OldWcwccest_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2BN2( )
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

   public void pa2BN2( )
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
            GX_FocusControl = edtavBarcodfrom_Internalname ;
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
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV29Tipo = cmbavTipo.getValidValue(AV29Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo", AV29Tipo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipo.setValue( GXutil.rtrim( AV29Tipo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      }
      if ( cmbavNivfinfrom.getItemCount() > 0 )
      {
         AV32NivFinfrom = cmbavNivfinfrom.getValidValue(AV32NivFinfrom) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32NivFinfrom", AV32NivFinfrom);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavNivfinfrom.setValue( GXutil.rtrim( AV32NivFinfrom) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinfrom.getInternalname(), "Values", cmbavNivfinfrom.ToJavascriptSource(), true);
      }
      if ( cmbavNivfinto.getItemCount() > 0 )
      {
         AV33NivFinto = cmbavNivfinto.getValidValue(AV33NivFinto) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33NivFinto", AV33NivFinto);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavNivfinto.setValue( GXutil.rtrim( AV33NivFinto) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinto.getInternalname(), "Values", cmbavNivfinto.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2BN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV46Pgmname = "ControlCalidadHTD.wCCEst" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccest_wc_Component) != 0 )
            {
               WebComp_Wcwccest_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e162BN2 ();
         wb2BN0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2BN2( )
   {
   }

   public void before_start_formulas( )
   {
      AV46Pgmname = "ControlCalidadHTD.wCCEst" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e122BN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIINI_DATA"), AV11CliIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIFIN_DATA"), AV13CliFin_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCCTINI_DATA"), AV22CCTIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCCTFIN_DATA"), AV24CCTFin_Data);
         /* Read saved values. */
         AV26EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         Combo_cliini_Cls = httpContext.cgiGet( "COMBO_CLIINI_Cls") ;
         Combo_cliini_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIINI_Selectedvalue_set") ;
         Combo_cliini_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIINI_Emptyitemtext") ;
         Combo_clifin_Cls = httpContext.cgiGet( "COMBO_CLIFIN_Cls") ;
         Combo_clifin_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIFIN_Selectedvalue_set") ;
         Combo_clifin_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIFIN_Emptyitemtext") ;
         Combo_cctini_Cls = httpContext.cgiGet( "COMBO_CCTINI_Cls") ;
         Combo_cctini_Selectedvalue_set = httpContext.cgiGet( "COMBO_CCTINI_Selectedvalue_set") ;
         Combo_cctini_Emptyitemtext = httpContext.cgiGet( "COMBO_CCTINI_Emptyitemtext") ;
         Combo_cctfin_Cls = httpContext.cgiGet( "COMBO_CCTFIN_Cls") ;
         Combo_cctfin_Selectedvalue_set = httpContext.cgiGet( "COMBO_CCTFIN_Selectedvalue_set") ;
         Combo_cctfin_Emptyitemtext = httpContext.cgiGet( "COMBO_CCTFIN_Emptyitemtext") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODFROM");
            GX_FocusControl = edtavBarcodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34BarCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarCodfrom), 8, 0));
         }
         else
         {
            AV34BarCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarCodfrom), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOFROM");
            GX_FocusControl = edtavBarcodreofrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35BarCodReofrom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodReofrom", GXutil.str( AV35BarCodReofrom, 1, 0));
         }
         else
         {
            AV35BarCodReofrom = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreofrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodReofrom", GXutil.str( AV35BarCodReofrom, 1, 0));
         }
         AV36BarCodParfrom = httpContext.cgiGet( edtavBarcodparfrom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarCodParfrom", AV36BarCodParfrom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCodto), 8, 0));
         }
         else
         {
            AV37BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReoto", GXutil.str( AV38BarCodReoto, 1, 0));
         }
         else
         {
            AV38BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReoto", GXutil.str( AV38BarCodReoto, 1, 0));
         }
         AV39BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodParto", AV39BarCodParto);
         AV20ArtIni = httpContext.cgiGet( edtavArtini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20ArtIni", AV20ArtIni);
         AV21ArtFin = httpContext.cgiGet( edtavArtfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ArtFin", AV21ArtFin);
         AV16ColNomIni = httpContext.cgiGet( edtavColnomini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16ColNomIni", AV16ColNomIni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLNUMINI");
            GX_FocusControl = edtavColnumini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17ColNumIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ColNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ColNumIni), 6, 0));
         }
         else
         {
            AV17ColNumIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ColNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ColNumIni), 6, 0));
         }
         AV18ColNomFin = httpContext.cgiGet( edtavColnomfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ColNomFin", AV18ColNomFin);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLNUMFIN");
            GX_FocusControl = edtavColnumfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19ColNumFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ColNumFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ColNumFin), 6, 0));
         }
         else
         {
            AV19ColNumFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavColnumfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ColNumFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ColNumFin), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCcfchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCFCHFROM");
            GX_FocusControl = edtavCcfchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30CCFchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30CCFchfrom", localUtil.format(AV30CCFchfrom, "99/99/99"));
         }
         else
         {
            AV30CCFchfrom = localUtil.ctod( httpContext.cgiGet( edtavCcfchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30CCFchfrom", localUtil.format(AV30CCFchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCcfchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCCFCHTO");
            GX_FocusControl = edtavCcfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31CCFchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31CCFchto", localUtil.format(AV31CCFchto, "99/99/99"));
         }
         else
         {
            AV31CCFchto = localUtil.ctod( httpContext.cgiGet( edtavCcfchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31CCFchto", localUtil.format(AV31CCFchto, "99/99/99"));
         }
         cmbavTipo.setValue( httpContext.cgiGet( cmbavTipo.getInternalname()) );
         AV29Tipo = httpContext.cgiGet( cmbavTipo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo", AV29Tipo);
         cmbavNivfinfrom.setValue( httpContext.cgiGet( cmbavNivfinfrom.getInternalname()) );
         AV32NivFinfrom = httpContext.cgiGet( cmbavNivfinfrom.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32NivFinfrom", AV32NivFinfrom);
         cmbavNivfinto.setValue( httpContext.cgiGet( cmbavNivfinto.getInternalname()) );
         AV33NivFinto = httpContext.cgiGet( cmbavNivfinto.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33NivFinto", AV33NivFinto);
         AV46Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46Pgmname", AV46Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIINI");
            GX_FocusControl = edtavCliini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9CliIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliIni), 6, 0));
         }
         else
         {
            AV9CliIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIFIN");
            GX_FocusControl = edtavClifin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10CliFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliFin), 6, 0));
         }
         else
         {
            AV10CliFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliFin), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTINI");
            GX_FocusControl = edtavCctini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14CCTIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTIni), 6, 0));
         }
         else
         {
            AV14CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTFIN");
            GX_FocusControl = edtavCctfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15CCTFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTFin), 6, 0));
         }
         else
         {
            AV15CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTFin), 6, 0));
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
      e122BN2 ();
      if (returnInSub) return;
   }

   public void e122BN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccest_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      GXv_char2[0] = AV26EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccest_impl.this.AV26EmprCod = GXv_char2[0] ;
      wccest_impl.this.AV27EmprNom = GXv_char3[0] ;
      wccest_impl.this.AV28UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavCctfin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctfin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctfin_Visible), 5, 0), true);
      edtavCctini_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctini_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctini_Visible), 5, 0), true);
      edtavClifin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClifin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClifin_Visible), 5, 0), true);
      edtavCliini_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCliini_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCliini_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLIINI' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLIFIN' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCCTINI' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCCTFIN' */
      S142 ();
      if (returnInSub) return;
      AV30CCFchfrom = GXutil.dadd(GXutil.today( ),-(7)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30CCFchfrom", localUtil.format(AV30CCFchfrom, "99/99/99"));
      AV31CCFchto = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31CCFchto", localUtil.format(AV31CCFchto, "99/99/99"));
   }

   public void e172BN2( )
   {
      /* 'DoPdf' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.rccestdet", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodParto)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCTFin,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30CCFchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV31CCFchto)),GXutil.URLEncode(GXutil.rtrim(AV32NivFinfrom)),GXutil.URLEncode(GXutil.rtrim(AV33NivFinto)),GXutil.URLEncode(GXutil.rtrim(AV29Tipo)),GXutil.URLEncode(GXutil.rtrim(AV20ArtIni)),GXutil.URLEncode(GXutil.rtrim(AV21ArtFin)),GXutil.URLEncode(GXutil.rtrim(AV16ColNomIni)),GXutil.URLEncode(GXutil.rtrim(AV18ColNomFin)),GXutil.URLEncode(GXutil.ltrimstr(AV17ColNumIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19ColNumFin,6,0))}, new String[] {"EmprCod","BarIni","BarFin","ReoIni","ReoFin","ParIni","ParFin","CliIni","CliFin","CCTIni","CCTFin","FchIni","FchFin","NivIni","NivFin","TipoCtr","Barseri","barserf","Barcolnom","Barcolnomf","Barcolnum","Barcolnumf"}) , new Object[] {"AV26EmprCod","AV34BarCodfrom","AV37BarCodto","AV35BarCodReofrom","AV38BarCodReoto","AV36BarCodParfrom","AV39BarCodParto","AV9CliIni","AV10CliFin","AV14CCTIni","AV15CCTFin","AV30CCFchfrom","AV31CCFchto","AV32NivFinfrom","AV33NivFinto","AV29Tipo","AV20ArtIni","AV21ArtFin","AV16ColNomIni","AV18ColNomFin","AV17ColNumIni","AV19ColNumFin"});
      /*  Sending Event outputs  */
      cmbavTipo.setValue( GXutil.rtrim( AV29Tipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      cmbavNivfinto.setValue( GXutil.rtrim( AV33NivFinto) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinto.getInternalname(), "Values", cmbavNivfinto.ToJavascriptSource(), true);
      cmbavNivfinfrom.setValue( GXutil.rtrim( AV32NivFinfrom) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinfrom.getInternalname(), "Values", cmbavNivfinfrom.ToJavascriptSource(), true);
   }

   public void e132BN2( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV26EmprCod ;
      GXv_int7[0] = AV34BarCodfrom ;
      GXv_int8[0] = AV37BarCodto ;
      GXv_int9[0] = AV35BarCodReofrom ;
      GXv_int10[0] = AV38BarCodReoto ;
      GXv_char3[0] = AV36BarCodParfrom ;
      GXv_char2[0] = AV39BarCodParto ;
      GXv_int11[0] = AV9CliIni ;
      GXv_int12[0] = AV10CliFin ;
      GXv_int13[0] = AV14CCTIni ;
      GXv_int14[0] = AV15CCTFin ;
      GXv_date15[0] = AV30CCFchfrom ;
      GXv_date16[0] = AV31CCFchto ;
      GXv_char17[0] = AV32NivFinfrom ;
      GXv_char18[0] = AV33NivFinto ;
      GXv_char19[0] = AV29Tipo ;
      GXv_char20[0] = AV20ArtIni ;
      GXv_char21[0] = AV21ArtFin ;
      GXv_char22[0] = AV16ColNomIni ;
      GXv_char23[0] = AV18ColNomFin ;
      GXv_int24[0] = AV17ColNumIni ;
      GXv_int25[0] = AV19ColNumFin ;
      GXv_char26[0] = AV40ExcelFilename ;
      GXv_char27[0] = AV41ErrorMessage ;
      new app.controlcalidadhtd.rccestdet_export(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_char3, GXv_char2, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_date15, GXv_date16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_char22, GXv_char23, GXv_int24, GXv_int25, GXv_char26, GXv_char27) ;
      wccest_impl.this.AV26EmprCod = GXv_char4[0] ;
      wccest_impl.this.AV34BarCodfrom = GXv_int7[0] ;
      wccest_impl.this.AV37BarCodto = GXv_int8[0] ;
      wccest_impl.this.AV35BarCodReofrom = GXv_int9[0] ;
      wccest_impl.this.AV38BarCodReoto = GXv_int10[0] ;
      wccest_impl.this.AV36BarCodParfrom = GXv_char3[0] ;
      wccest_impl.this.AV39BarCodParto = GXv_char2[0] ;
      wccest_impl.this.AV9CliIni = GXv_int11[0] ;
      wccest_impl.this.AV10CliFin = GXv_int12[0] ;
      wccest_impl.this.AV14CCTIni = GXv_int13[0] ;
      wccest_impl.this.AV15CCTFin = GXv_int14[0] ;
      wccest_impl.this.AV30CCFchfrom = GXv_date15[0] ;
      wccest_impl.this.AV31CCFchto = GXv_date16[0] ;
      wccest_impl.this.AV32NivFinfrom = GXv_char17[0] ;
      wccest_impl.this.AV33NivFinto = GXv_char18[0] ;
      wccest_impl.this.AV29Tipo = GXv_char19[0] ;
      wccest_impl.this.AV20ArtIni = GXv_char20[0] ;
      wccest_impl.this.AV21ArtFin = GXv_char21[0] ;
      wccest_impl.this.AV16ColNomIni = GXv_char22[0] ;
      wccest_impl.this.AV18ColNomFin = GXv_char23[0] ;
      wccest_impl.this.AV17ColNumIni = GXv_int24[0] ;
      wccest_impl.this.AV19ColNumFin = GXv_int25[0] ;
      wccest_impl.this.AV40ExcelFilename = GXv_char26[0] ;
      wccest_impl.this.AV41ErrorMessage = GXv_char27[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV34BarCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34BarCodfrom), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37BarCodto), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35BarCodReofrom", GXutil.str( AV35BarCodReofrom, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarCodReoto", GXutil.str( AV38BarCodReoto, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV36BarCodParfrom", AV36BarCodParfrom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarCodParto", AV39BarCodParto);
      httpContext.ajax_rsp_assign_attri("", false, "AV9CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliIni), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CliFin), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTIni), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV15CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CCTFin), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30CCFchfrom", localUtil.format(AV30CCFchfrom, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV31CCFchto", localUtil.format(AV31CCFchto, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV32NivFinfrom", AV32NivFinfrom);
      httpContext.ajax_rsp_assign_attri("", false, "AV33NivFinto", AV33NivFinto);
      httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo", AV29Tipo);
      httpContext.ajax_rsp_assign_attri("", false, "AV20ArtIni", AV20ArtIni);
      httpContext.ajax_rsp_assign_attri("", false, "AV21ArtFin", AV21ArtFin);
      httpContext.ajax_rsp_assign_attri("", false, "AV16ColNomIni", AV16ColNomIni);
      httpContext.ajax_rsp_assign_attri("", false, "AV18ColNomFin", AV18ColNomFin);
      httpContext.ajax_rsp_assign_attri("", false, "AV17ColNumIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17ColNumIni), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV19ColNumFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ColNumFin), 6, 0));
      if ( GXutil.strcmp(AV40ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV40ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV41ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavTipo.setValue( GXutil.rtrim( AV29Tipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      cmbavNivfinto.setValue( GXutil.rtrim( AV33NivFinto) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinto.getInternalname(), "Values", cmbavNivfinto.ToJavascriptSource(), true);
      cmbavNivfinfrom.setValue( GXutil.rtrim( AV32NivFinfrom) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinfrom.getInternalname(), "Values", cmbavNivfinfrom.ToJavascriptSource(), true);
   }

   public void e142BN2( )
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

   public void S142( )
   {
      /* 'LOADCOMBOCCTFIN' Routine */
      returnInSub = false ;
      AV24CCTFin_Data.clear();
      /* Using cursor H02BN2 */
      pr_default.execute(0, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H02BN2_A396EmprCod[0] ;
         A4036CCTDsc = H02BN2_A4036CCTDsc[0] ;
         A4031CCTCod = H02BN2_A4031CCTCod[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0))+"-"+GXutil.trim( A4036CCTDsc) );
         AV24CCTFin_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV24CCTFin_Data.sort("Title");
      Combo_cctfin_Selectedvalue_set = ((0==AV15CCTFin) ? "" : GXutil.trim( GXutil.str( AV15CCTFin, 6, 0))) ;
      ucCombo_cctfin.sendProperty(context, "", false, Combo_cctfin_Internalname, "SelectedValue_set", Combo_cctfin_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCCTINI' Routine */
      returnInSub = false ;
      AV22CCTIni_Data.clear();
      /* Using cursor H02BN3 */
      pr_default.execute(1, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H02BN3_A396EmprCod[0] ;
         A4036CCTDsc = H02BN3_A4036CCTDsc[0] ;
         A4031CCTCod = H02BN3_A4031CCTCod[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0))+"-"+GXutil.trim( A4036CCTDsc) );
         AV22CCTIni_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV22CCTIni_Data.sort("Title");
      Combo_cctini_Selectedvalue_set = ((0==AV14CCTIni) ? "" : GXutil.trim( GXutil.str( AV14CCTIni, 6, 0))) ;
      ucCombo_cctini.sendProperty(context, "", false, Combo_cctini_Internalname, "SelectedValue_set", Combo_cctini_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLIFIN' Routine */
      returnInSub = false ;
      /* Using cursor H02BN4 */
      pr_default.execute(2, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H02BN4_A396EmprCod[0] ;
         A10045CliAct = H02BN4_A10045CliAct[0] ;
         A13735CliCNom = H02BN4_A13735CliCNom[0] ;
         A252CliCod = H02BN4_A252CliCod[0] ;
         A279CliNom = H02BN4_A279CliNom[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV13CliFin_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clifin_Selectedvalue_set = ((0==AV10CliFin) ? "" : GXutil.trim( GXutil.str( AV10CliFin, 6, 0))) ;
      ucCombo_clifin.sendProperty(context, "", false, Combo_clifin_Internalname, "SelectedValue_set", Combo_clifin_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIINI' Routine */
      returnInSub = false ;
      /* Using cursor H02BN5 */
      pr_default.execute(3, new Object[] {AV26EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H02BN5_A396EmprCod[0] ;
         A10045CliAct = H02BN5_A10045CliAct[0] ;
         A13735CliCNom = H02BN5_A13735CliCNom[0] ;
         A252CliCod = H02BN5_A252CliCod[0] ;
         A279CliNom = H02BN5_A279CliNom[0] ;
         AV12Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV12Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV11CliIni_Data.add(AV12Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_cliini_Selectedvalue_set = ((0==AV9CliIni) ? "" : GXutil.trim( GXutil.str( AV9CliIni, 6, 0))) ;
      ucCombo_cliini.sendProperty(context, "", false, Combo_cliini_Internalname, "SelectedValue_set", Combo_cliini_Selectedvalue_set);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152BN2 ();
      if (returnInSub) return;
   }

   public void e152BN2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.rccestdet", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV34BarCodfrom,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCodto,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCodReofrom,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV38BarCodReoto,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36BarCodParfrom)),GXutil.URLEncode(GXutil.rtrim(AV39BarCodParto)),GXutil.URLEncode(GXutil.ltrimstr(AV9CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CCTFin,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30CCFchfrom)),GXutil.URLEncode(GXutil.formatDateParm(AV31CCFchto)),GXutil.URLEncode(GXutil.rtrim(AV32NivFinfrom)),GXutil.URLEncode(GXutil.rtrim(AV33NivFinto)),GXutil.URLEncode(GXutil.rtrim(AV29Tipo)),GXutil.URLEncode(GXutil.rtrim(AV20ArtIni)),GXutil.URLEncode(GXutil.rtrim(AV21ArtFin)),GXutil.URLEncode(GXutil.rtrim(AV16ColNomIni)),GXutil.URLEncode(GXutil.rtrim(AV18ColNomFin)),GXutil.URLEncode(GXutil.ltrimstr(AV17ColNumIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19ColNumFin,6,0))}, new String[] {"EmprCod","BarIni","BarFin","ReoIni","ReoFin","ParIni","ParFin","CliIni","CliFin","CCTIni","CCTFin","FchIni","FchFin","NivIni","NivFin","TipoCtr","Barseri","barserf","Barcolnom","Barcolnomf","Barcolnum","Barcolnumf"}) , new Object[] {"AV26EmprCod","AV34BarCodfrom","AV37BarCodto","AV35BarCodReofrom","AV38BarCodReoto","AV36BarCodParfrom","AV39BarCodParto","AV9CliIni","AV10CliFin","AV14CCTIni","AV15CCTFin","AV30CCFchfrom","AV31CCFchto","AV32NivFinfrom","AV33NivFinto","AV29Tipo","AV20ArtIni","AV21ArtFin","AV16ColNomIni","AV18ColNomFin","AV17ColNumIni","AV19ColNumFin"});
      /*  Sending Event outputs  */
      cmbavTipo.setValue( GXutil.rtrim( AV29Tipo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipo.getInternalname(), "Values", cmbavTipo.ToJavascriptSource(), true);
      cmbavNivfinto.setValue( GXutil.rtrim( AV33NivFinto) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinto.getInternalname(), "Values", cmbavNivfinto.ToJavascriptSource(), true);
      cmbavNivfinfrom.setValue( GXutil.rtrim( AV32NivFinfrom) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavNivfinfrom.getInternalname(), "Values", cmbavNivfinfrom.ToJavascriptSource(), true);
   }

   protected void nextLoad( )
   {
   }

   protected void e162BN2( )
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
      pa2BN2( ) ;
      ws2BN2( ) ;
      we2BN2( ) ;
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
      if ( ! ( WebComp_Wcwccest_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccest_wc_Component) != 0 )
         {
            WebComp_Wcwccest_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714352528", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wccest.js", "?202681714352528", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavBarcodfrom_Internalname = "vBARCODFROM" ;
      edtavBarcodreofrom_Internalname = "vBARCODREOFROM" ;
      edtavBarcodparfrom_Internalname = "vBARCODPARFROM" ;
      edtavBarcodto_Internalname = "vBARCODTO" ;
      edtavBarcodreoto_Internalname = "vBARCODREOTO" ;
      edtavBarcodparto_Internalname = "vBARCODPARTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockcombo_cliini_Internalname = "TEXTBLOCKCOMBO_CLIINI" ;
      Combo_cliini_Internalname = "COMBO_CLIINI" ;
      divTablesplittedcliini_Internalname = "TABLESPLITTEDCLIINI" ;
      lblTextblockcombo_clifin_Internalname = "TEXTBLOCKCOMBO_CLIFIN" ;
      Combo_clifin_Internalname = "COMBO_CLIFIN" ;
      divTablesplittedclifin_Internalname = "TABLESPLITTEDCLIFIN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavArtini_Internalname = "vARTINI" ;
      edtavArtfin_Internalname = "vARTFIN" ;
      divTablearticle_Internalname = "TABLEARTICLE" ;
      edtavColnomini_Internalname = "vCOLNOMINI" ;
      edtavColnumini_Internalname = "vCOLNUMINI" ;
      edtavColnomfin_Internalname = "vCOLNOMFIN" ;
      edtavColnumfin_Internalname = "vCOLNUMFIN" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockcombo_cctini_Internalname = "TEXTBLOCKCOMBO_CCTINI" ;
      Combo_cctini_Internalname = "COMBO_CCTINI" ;
      divTablesplittedcctini_Internalname = "TABLESPLITTEDCCTINI" ;
      lblTextblockcombo_cctfin_Internalname = "TEXTBLOCKCOMBO_CCTFIN" ;
      Combo_cctfin_Internalname = "COMBO_CCTFIN" ;
      divTablesplittedcctfin_Internalname = "TABLESPLITTEDCCTFIN" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavCcfchfrom_Internalname = "vCCFCHFROM" ;
      edtavCcfchto_Internalname = "vCCFCHTO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      cmbavTipo.setInternalname( "vTIPO" );
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      cmbavNivfinfrom.setInternalname( "vNIVFINFROM" );
      cmbavNivfinto.setInternalname( "vNIVFINTO" );
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
      bttBtnexportar_Internalname = "BTNEXPORTAR" ;
      bttBtnresultado_Internalname = "BTNRESULTADO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCliini_Internalname = "vCLIINI" ;
      edtavClifin_Internalname = "vCLIFIN" ;
      edtavCctini_Internalname = "vCCTINI" ;
      edtavCctfin_Internalname = "vCCTFIN" ;
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
      edtavCctfin_Jsonclick = "" ;
      edtavCctfin_Visible = 1 ;
      edtavCctini_Jsonclick = "" ;
      edtavCctini_Visible = 1 ;
      edtavClifin_Jsonclick = "" ;
      edtavClifin_Visible = 1 ;
      edtavCliini_Jsonclick = "" ;
      edtavCliini_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavNivfinto.setJsonclick( "" );
      cmbavNivfinto.setEnabled( 1 );
      cmbavNivfinfrom.setJsonclick( "" );
      cmbavNivfinfrom.setEnabled( 1 );
      cmbavTipo.setJsonclick( "" );
      cmbavTipo.setEnabled( 1 );
      edtavCcfchto_Jsonclick = "" ;
      edtavCcfchto_Enabled = 1 ;
      edtavCcfchfrom_Jsonclick = "" ;
      edtavCcfchfrom_Enabled = 1 ;
      Combo_cctfin_Caption = "" ;
      Combo_cctini_Caption = "" ;
      edtavColnumfin_Jsonclick = "" ;
      edtavColnumfin_Enabled = 1 ;
      edtavColnomfin_Jsonclick = "" ;
      edtavColnomfin_Enabled = 1 ;
      edtavColnumini_Jsonclick = "" ;
      edtavColnumini_Enabled = 1 ;
      edtavColnomini_Jsonclick = "" ;
      edtavColnomini_Enabled = 1 ;
      edtavArtfin_Jsonclick = "" ;
      edtavArtfin_Enabled = 1 ;
      edtavArtini_Jsonclick = "" ;
      edtavArtini_Enabled = 1 ;
      edtavBarcodparto_Jsonclick = "" ;
      edtavBarcodparto_Enabled = 1 ;
      edtavBarcodreoto_Jsonclick = "" ;
      edtavBarcodreoto_Enabled = 1 ;
      edtavBarcodto_Jsonclick = "" ;
      edtavBarcodto_Enabled = 1 ;
      edtavBarcodparfrom_Jsonclick = "" ;
      edtavBarcodparfrom_Enabled = 1 ;
      edtavBarcodreofrom_Jsonclick = "" ;
      edtavBarcodreofrom_Enabled = 1 ;
      edtavBarcodfrom_Jsonclick = "" ;
      edtavBarcodfrom_Enabled = 1 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultado", "") ;
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
      Combo_cctfin_Emptyitemtext = "Todos" ;
      Combo_cctfin_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cctini_Emptyitemtext = "Todos" ;
      Combo_cctini_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clifin_Emptyitemtext = "Todos" ;
      Combo_clifin_Cls = "ExtendedCombo AttributeFL" ;
      Combo_cliini_Emptyitemtext = "Todos" ;
      Combo_cliini_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Est. Controles HTD", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipo.setName( "vTIPO" );
      cmbavTipo.setWebtags( "" );
      cmbavTipo.addItem("E", httpContext.getMessage( "Externo", ""), (short)(0));
      cmbavTipo.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      if ( cmbavTipo.getItemCount() > 0 )
      {
         AV29Tipo = cmbavTipo.getValidValue(AV29Tipo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Tipo", AV29Tipo);
      }
      cmbavNivfinfrom.setName( "vNIVFINFROM" );
      cmbavNivfinfrom.setWebtags( "" );
      cmbavNivfinfrom.addItem("", httpContext.getMessage( "* - Todos", ""), (short)(0));
      cmbavNivfinfrom.addItem("0", httpContext.getMessage( "Excelente", ""), (short)(0));
      cmbavNivfinfrom.addItem("1", httpContext.getMessage( "Correcto", ""), (short)(0));
      cmbavNivfinfrom.addItem("2", httpContext.getMessage( "Pasado Control", ""), (short)(0));
      cmbavNivfinfrom.addItem("3", httpContext.getMessage( "Límite de calidad", ""), (short)(0));
      cmbavNivfinfrom.addItem("4", httpContext.getMessage( "Incorrecto", ""), (short)(0));
      cmbavNivfinfrom.addItem("5", httpContext.getMessage( "Retrocedido en el control", ""), (short)(0));
      if ( cmbavNivfinfrom.getItemCount() > 0 )
      {
         AV32NivFinfrom = cmbavNivfinfrom.getValidValue(AV32NivFinfrom) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32NivFinfrom", AV32NivFinfrom);
      }
      cmbavNivfinto.setName( "vNIVFINTO" );
      cmbavNivfinto.setWebtags( "" );
      cmbavNivfinto.addItem("", httpContext.getMessage( "* - Todos", ""), (short)(0));
      cmbavNivfinto.addItem("0", httpContext.getMessage( "Excelente", ""), (short)(0));
      cmbavNivfinto.addItem("1", httpContext.getMessage( "Correcto", ""), (short)(0));
      cmbavNivfinto.addItem("2", httpContext.getMessage( "Pasado Control", ""), (short)(0));
      cmbavNivfinto.addItem("3", httpContext.getMessage( "Límite de calidad", ""), (short)(0));
      cmbavNivfinto.addItem("4", httpContext.getMessage( "Incorrecto", ""), (short)(0));
      cmbavNivfinto.addItem("5", httpContext.getMessage( "Retrocedido en el control", ""), (short)(0));
      if ( cmbavNivfinto.getItemCount() > 0 )
      {
         AV33NivFinto = cmbavNivfinto.getValidValue(AV33NivFinto) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33NivFinto", AV33NivFinto);
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
      setEventMetadata("'DOPDF'","{handler:'e172BN2',iparms:[{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e132BN2',iparms:[{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORESULTADO'","{handler:'e112BN1',iparms:[{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("'DORESULTADO'",",oparms:[{ctrl:'WCWCCEST_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e142BN2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e152BN2',iparms:[{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV19ColNumFin',fld:'vCOLNUMFIN',pic:'ZZZZZ9'},{av:'AV17ColNumIni',fld:'vCOLNUMINI',pic:'ZZZZZ9'},{av:'AV18ColNomFin',fld:'vCOLNOMFIN',pic:''},{av:'AV16ColNomIni',fld:'vCOLNOMINI',pic:''},{av:'AV21ArtFin',fld:'vARTFIN',pic:''},{av:'AV20ArtIni',fld:'vARTINI',pic:''},{av:'cmbavTipo'},{av:'AV29Tipo',fld:'vTIPO',pic:''},{av:'cmbavNivfinto'},{av:'AV33NivFinto',fld:'vNIVFINTO',pic:''},{av:'cmbavNivfinfrom'},{av:'AV32NivFinfrom',fld:'vNIVFINFROM',pic:''},{av:'AV31CCFchto',fld:'vCCFCHTO',pic:''},{av:'AV30CCFchfrom',fld:'vCCFCHFROM',pic:''},{av:'AV15CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV14CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV10CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV9CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV39BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV36BarCodParfrom',fld:'vBARCODPARFROM',pic:''},{av:'AV38BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV35BarCodReofrom',fld:'vBARCODREOFROM',pic:'9'},{av:'AV37BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV34BarCodfrom',fld:'vBARCODFROM',pic:'ZZZZZZZ9'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
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
      Combo_cctfin_Selectedvalue_get = "" ;
      Combo_cctini_Selectedvalue_get = "" ;
      Combo_clifin_Selectedvalue_get = "" ;
      Combo_cliini_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV11CliIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV13CliFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV22CCTIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV24CCTFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV26EmprCod = "" ;
      Combo_cliini_Selectedvalue_set = "" ;
      Combo_clifin_Selectedvalue_set = "" ;
      Combo_cctini_Selectedvalue_set = "" ;
      Combo_cctfin_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV36BarCodParfrom = "" ;
      AV39BarCodParto = "" ;
      lblTextblockcombo_cliini_Jsonclick = "" ;
      ucCombo_cliini = new com.genexus.webpanels.GXUserControl();
      Combo_cliini_Caption = "" ;
      lblTextblockcombo_clifin_Jsonclick = "" ;
      ucCombo_clifin = new com.genexus.webpanels.GXUserControl();
      Combo_clifin_Caption = "" ;
      AV20ArtIni = "" ;
      AV21ArtFin = "" ;
      AV16ColNomIni = "" ;
      AV18ColNomFin = "" ;
      lblTextblockcombo_cctini_Jsonclick = "" ;
      ucCombo_cctini = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cctfin_Jsonclick = "" ;
      ucCombo_cctfin = new com.genexus.webpanels.GXUserControl();
      AV30CCFchfrom = GXutil.nullDate() ;
      AV31CCFchto = GXutil.nullDate() ;
      AV29Tipo = "" ;
      AV32NivFinfrom = "" ;
      AV33NivFinto = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtnexportar_Jsonclick = "" ;
      bttBtnresultado_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcwccest_wc_Component = "" ;
      OldWcwccest_wc = "" ;
      AV46Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25Station = "" ;
      GXt_char1 = "" ;
      AV27EmprNom = "" ;
      AV28UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new int[1] ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_int24 = new int[1] ;
      GXv_int25 = new int[1] ;
      AV40ExcelFilename = "" ;
      GXv_char26 = new String[1] ;
      AV41ErrorMessage = "" ;
      GXv_char27 = new String[1] ;
      scmdbuf = "" ;
      H02BN2_A396EmprCod = new String[] {""} ;
      H02BN2_A4036CCTDsc = new String[] {""} ;
      H02BN2_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      A4036CCTDsc = "" ;
      AV12Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02BN3_A396EmprCod = new String[] {""} ;
      H02BN3_A4036CCTDsc = new String[] {""} ;
      H02BN3_A4031CCTCod = new int[1] ;
      H02BN4_A396EmprCod = new String[] {""} ;
      H02BN4_A10045CliAct = new String[] {""} ;
      H02BN4_A13735CliCNom = new String[] {""} ;
      H02BN4_A252CliCod = new int[1] ;
      H02BN4_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      H02BN5_A396EmprCod = new String[] {""} ;
      H02BN5_A10045CliAct = new String[] {""} ;
      H02BN5_A13735CliCNom = new String[] {""} ;
      H02BN5_A252CliCod = new int[1] ;
      H02BN5_A279CliNom = new String[] {""} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccest__default(),
         new Object[] {
             new Object[] {
            H02BN2_A396EmprCod, H02BN2_A4036CCTDsc, H02BN2_A4031CCTCod
            }
            , new Object[] {
            H02BN3_A396EmprCod, H02BN3_A4036CCTDsc, H02BN3_A4031CCTCod
            }
            , new Object[] {
            H02BN4_A396EmprCod, H02BN4_A10045CliAct, H02BN4_A13735CliCNom, H02BN4_A252CliCod, H02BN4_A279CliNom
            }
            , new Object[] {
            H02BN5_A396EmprCod, H02BN5_A10045CliAct, H02BN5_A13735CliCNom, H02BN5_A252CliCod, H02BN5_A279CliNom
            }
         }
      );
      AV46Pgmname = "ControlCalidadHTD.wCCEst" ;
      /* GeneXus formulas. */
      AV46Pgmname = "ControlCalidadHTD.wCCEst" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcwccest_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV35BarCodReofrom ;
   private byte AV38BarCodReoto ;
   private byte nDonePA ;
   private byte GXv_int9[] ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
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
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int AV34BarCodfrom ;
   private int edtavBarcodfrom_Enabled ;
   private int edtavBarcodreofrom_Enabled ;
   private int edtavBarcodparfrom_Enabled ;
   private int AV37BarCodto ;
   private int edtavBarcodto_Enabled ;
   private int edtavBarcodreoto_Enabled ;
   private int edtavBarcodparto_Enabled ;
   private int edtavArtini_Enabled ;
   private int edtavArtfin_Enabled ;
   private int edtavColnomini_Enabled ;
   private int AV17ColNumIni ;
   private int edtavColnumini_Enabled ;
   private int edtavColnomfin_Enabled ;
   private int AV19ColNumFin ;
   private int edtavColnumfin_Enabled ;
   private int edtavCcfchfrom_Enabled ;
   private int edtavCcfchto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV9CliIni ;
   private int edtavCliini_Visible ;
   private int AV10CliFin ;
   private int edtavClifin_Visible ;
   private int AV14CCTIni ;
   private int edtavCctini_Visible ;
   private int AV15CCTFin ;
   private int edtavCctfin_Visible ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int GXv_int14[] ;
   private int GXv_int24[] ;
   private int GXv_int25[] ;
   private int A4031CCTCod ;
   private int A252CliCod ;
   private int idxLst ;
   private String Combo_cctfin_Selectedvalue_get ;
   private String Combo_cctini_Selectedvalue_get ;
   private String Combo_clifin_Selectedvalue_get ;
   private String Combo_cliini_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV26EmprCod ;
   private String Combo_cliini_Cls ;
   private String Combo_cliini_Selectedvalue_set ;
   private String Combo_cliini_Emptyitemtext ;
   private String Combo_clifin_Cls ;
   private String Combo_clifin_Selectedvalue_set ;
   private String Combo_clifin_Emptyitemtext ;
   private String Combo_cctini_Cls ;
   private String Combo_cctini_Selectedvalue_set ;
   private String Combo_cctini_Emptyitemtext ;
   private String Combo_cctfin_Cls ;
   private String Combo_cctfin_Selectedvalue_set ;
   private String Combo_cctfin_Emptyitemtext ;
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
   private String divUnnamedtable1_Internalname ;
   private String edtavBarcodfrom_Internalname ;
   private String TempTags ;
   private String edtavBarcodfrom_Jsonclick ;
   private String edtavBarcodreofrom_Internalname ;
   private String edtavBarcodreofrom_Jsonclick ;
   private String edtavBarcodparfrom_Internalname ;
   private String AV36BarCodParfrom ;
   private String edtavBarcodparfrom_Jsonclick ;
   private String edtavBarcodto_Internalname ;
   private String edtavBarcodto_Jsonclick ;
   private String edtavBarcodreoto_Internalname ;
   private String edtavBarcodreoto_Jsonclick ;
   private String edtavBarcodparto_Internalname ;
   private String AV39BarCodParto ;
   private String edtavBarcodparto_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedcliini_Internalname ;
   private String lblTextblockcombo_cliini_Internalname ;
   private String lblTextblockcombo_cliini_Jsonclick ;
   private String Combo_cliini_Caption ;
   private String Combo_cliini_Internalname ;
   private String divTablesplittedclifin_Internalname ;
   private String lblTextblockcombo_clifin_Internalname ;
   private String lblTextblockcombo_clifin_Jsonclick ;
   private String Combo_clifin_Caption ;
   private String Combo_clifin_Internalname ;
   private String divTablearticle_Internalname ;
   private String edtavArtini_Internalname ;
   private String AV20ArtIni ;
   private String edtavArtini_Jsonclick ;
   private String edtavArtfin_Internalname ;
   private String AV21ArtFin ;
   private String edtavArtfin_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavColnomini_Internalname ;
   private String AV16ColNomIni ;
   private String edtavColnomini_Jsonclick ;
   private String edtavColnumini_Internalname ;
   private String edtavColnumini_Jsonclick ;
   private String edtavColnomfin_Internalname ;
   private String AV18ColNomFin ;
   private String edtavColnomfin_Jsonclick ;
   private String edtavColnumfin_Internalname ;
   private String edtavColnumfin_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedcctini_Internalname ;
   private String lblTextblockcombo_cctini_Internalname ;
   private String lblTextblockcombo_cctini_Jsonclick ;
   private String Combo_cctini_Caption ;
   private String Combo_cctini_Internalname ;
   private String divTablesplittedcctfin_Internalname ;
   private String lblTextblockcombo_cctfin_Internalname ;
   private String lblTextblockcombo_cctfin_Jsonclick ;
   private String Combo_cctfin_Caption ;
   private String Combo_cctfin_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavCcfchfrom_Internalname ;
   private String edtavCcfchfrom_Jsonclick ;
   private String edtavCcfchto_Internalname ;
   private String edtavCcfchto_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String AV29Tipo ;
   private String divUnnamedtable7_Internalname ;
   private String AV32NivFinfrom ;
   private String AV33NivFinto ;
   private String divTable_acciones_Internalname ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String bttBtnresultado_Internalname ;
   private String bttBtnresultado_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcwccest_wc_Component ;
   private String OldWcwccest_wc ;
   private String edtavPgmname_Internalname ;
   private String AV46Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavCliini_Internalname ;
   private String edtavCliini_Jsonclick ;
   private String edtavClifin_Internalname ;
   private String edtavClifin_Jsonclick ;
   private String edtavCctini_Internalname ;
   private String edtavCctini_Jsonclick ;
   private String edtavCctfin_Internalname ;
   private String edtavCctfin_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV25Station ;
   private String GXt_char1 ;
   private String AV27EmprNom ;
   private String AV28UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char26[] ;
   private String GXv_char27[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4036CCTDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private java.util.Date AV30CCFchfrom ;
   private java.util.Date AV31CCFchto ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date16[] ;
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
   private String AV40ExcelFilename ;
   private String AV41ErrorMessage ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwccest_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_cliini ;
   private com.genexus.webpanels.GXUserControl ucCombo_clifin ;
   private com.genexus.webpanels.GXUserControl ucCombo_cctini ;
   private com.genexus.webpanels.GXUserControl ucCombo_cctfin ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private HTMLChoice cmbavTipo ;
   private HTMLChoice cmbavNivfinfrom ;
   private HTMLChoice cmbavNivfinto ;
   private IDataStoreProvider pr_default ;
   private String[] H02BN2_A396EmprCod ;
   private String[] H02BN2_A4036CCTDsc ;
   private int[] H02BN2_A4031CCTCod ;
   private String[] H02BN3_A396EmprCod ;
   private String[] H02BN3_A4036CCTDsc ;
   private int[] H02BN3_A4031CCTCod ;
   private String[] H02BN4_A396EmprCod ;
   private String[] H02BN4_A10045CliAct ;
   private String[] H02BN4_A13735CliCNom ;
   private int[] H02BN4_A252CliCod ;
   private String[] H02BN4_A279CliNom ;
   private String[] H02BN5_A396EmprCod ;
   private String[] H02BN5_A10045CliAct ;
   private String[] H02BN5_A13735CliCNom ;
   private int[] H02BN5_A252CliCod ;
   private String[] H02BN5_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV11CliIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13CliFin_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22CCTIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24CCTFin_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV12Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wccest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BN2", "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BN3", "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BN4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BN5", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 3 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

