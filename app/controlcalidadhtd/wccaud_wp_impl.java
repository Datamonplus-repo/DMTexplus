package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wccaud_wp_impl extends GXDataArea
{
   public wccaud_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wccaud_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wccaud_wp_impl.class ));
   }

   public wccaud_wp_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavRea = new HTMLChoice();
      chkavDet = UIFactory.getCheckbox(this);
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
      pa2BQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2BQ2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wccaud_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarSer, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIINI_DATA", AV18CliIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIINI_DATA", AV18CliIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIFIN_DATA", AV16CliFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIFIN_DATA", AV16CliFin_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCCTINI_DATA", AV14CCTIni_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCCTINI_DATA", AV14CCTIni_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCCTFIN_DATA", AV12CCTFin_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCCTFIN_DATA", AV12CCTFin_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV5BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarSer, ""))));
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
      if ( ! ( WebComp_Wcwccaud_wc == null ) )
      {
         WebComp_Wcwccaud_wc.componentjscripts();
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
         we2BQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2BQ2( ) ;
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
      return formatLink("app.controlcalidadhtd.wccaud_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.Wccaud_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Auditoria de los CC", "") ;
   }

   public void wb2BQ0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarini_Internalname, httpContext.getMessage( "Nº Hdr Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarini_Internalname, GXutil.ltrim( localUtil.ntoc( AV10BarIni, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10BarIni), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10BarIni), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarini_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReoini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReoini_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReoini_Internalname, GXutil.ltrim( localUtil.ntoc( AV29ReoIni, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReoini_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV29ReoIni), "9") : localUtil.format( DecimalUtil.doubleToDec(AV29ReoIni), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "R", ""), edtavReoini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReoini_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParini_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParini_Internalname, GXutil.rtrim( AV26ParIni), GXutil.rtrim( localUtil.format( AV26ParIni, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "P", ""), edtavParini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavParini_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfin_Internalname, httpContext.getMessage( "Nº Hdr Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV9BarFin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarfin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9BarFin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9BarFin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReofin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReofin_Internalname, httpContext.getMessage( "R", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReofin_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ReoFin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReofin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28ReoFin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV28ReoFin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "R", ""), edtavReofin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReofin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParfin_Internalname, httpContext.getMessage( "P", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParfin_Internalname, GXutil.rtrim( AV25ParFin), GXutil.rtrim( localUtil.format( AV25ParFin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "P", ""), edtavParfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavParfin_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedcliini_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cliini_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_cliini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cliini.setProperty("Caption", Combo_cliini_Caption);
         ucCombo_cliini.setProperty("Cls", Combo_cliini_Cls);
         ucCombo_cliini.setProperty("EmptyItemText", Combo_cliini_Emptyitemtext);
         ucCombo_cliini.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_cliini.setProperty("DropDownOptionsData", AV18CliIni_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clifin_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clifin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clifin.setProperty("Caption", Combo_clifin_Caption);
         ucCombo_clifin.setProperty("Cls", Combo_clifin_Cls);
         ucCombo_clifin.setProperty("EmptyItemText", Combo_clifin_Emptyitemtext);
         ucCombo_clifin.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_clifin.setProperty("DropDownOptionsData", AV16CliFin_Data);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cctini_Internalname, httpContext.getMessage( "C.C Inicial", ""), "", "", lblTextblockcombo_cctini_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cctini.setProperty("Caption", Combo_cctini_Caption);
         ucCombo_cctini.setProperty("Cls", Combo_cctini_Cls);
         ucCombo_cctini.setProperty("EmptyItemText", Combo_cctini_Emptyitemtext);
         ucCombo_cctini.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_cctini.setProperty("DropDownOptionsData", AV14CCTIni_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cctfin_Internalname, httpContext.getMessage( "C.C Final", ""), "", "", lblTextblockcombo_cctfin_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cctfin.setProperty("Caption", Combo_cctfin_Caption);
         ucCombo_cctfin.setProperty("Cls", Combo_cctfin_Cls);
         ucCombo_cctfin.setProperty("EmptyItemText", Combo_cctfin_Emptyitemtext);
         ucCombo_cctfin.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucCombo_cctfin.setProperty("DropDownOptionsData", AV12CCTFin_Data);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchini_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchini_Internalname, httpContext.getMessage( "Fecha Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchini_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchini_Internalname, localUtil.format(AV24FchIni, "99/99/99"), localUtil.format( AV24FchIni, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchini_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchini_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchini_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchini_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFchfin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFchfin_Internalname, httpContext.getMessage( "Fecha Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFchfin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFchfin_Internalname, localUtil.format(AV23FchFin, "99/99/99"), localUtil.format( AV23FchFin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFchfin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFchfin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFchfin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFchfin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavRea.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavRea, cmbavRea.getInternalname(), GXutil.trim( GXutil.str( AV27Rea, 1, 0)), 1, cmbavRea.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavRea.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         cmbavRea.setValue( GXutil.trim( GXutil.str( AV27Rea, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRea.getInternalname(), "Values", cmbavRea.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavDet.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavDet.getInternalname(), httpContext.getMessage( "Detalhe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavDet.getInternalname(), AV21Det, "", httpContext.getMessage( "Detalhe", ""), 1, chkavDet.getEnabled(), "S", httpContext.getMessage( "Detalhe", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(113, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,113);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112bq1_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnpdf_Internalname, "", httpContext.getMessage( "PDF (win)", ""), bttBtnpdf_Jsonclick, 5, httpContext.getMessage( "PDF (win)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPDF\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0147"+"", GXutil.rtrim( WebComp_Wcwccaud_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0147"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwccaud_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwccaud_wc), GXutil.lower( WebComp_Wcwccaud_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0147"+"");
               }
               WebComp_Wcwccaud_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwccaud_wc), GXutil.lower( WebComp_Wcwccaud_wc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCliini_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CliIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV17CliIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCliini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCliini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClifin_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CliFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15CliFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClifin_Jsonclick, 0, "Attribute", "", "", "", "", edtavClifin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctini_Internalname, GXutil.ltrim( localUtil.ntoc( AV13CCTIni, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13CCTIni), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctini_Jsonclick, 0, "Attribute", "", "", "", "", edtavCctini_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctfin_Internalname, GXutil.ltrim( localUtil.ntoc( AV11CCTFin, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11CCTFin), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctfin_Jsonclick, 0, "Attribute", "", "", "", "", edtavCctfin_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\Wccaud_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2BQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Auditoria de los CC", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2BQ0( ) ;
   }

   public void ws2BQ2( )
   {
      start2BQ2( ) ;
      evt2BQ2( ) ;
   }

   public void evt2BQ2( )
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
                           e122BQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPDF'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoPDF' */
                           e132BQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e142BQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e152BQ2 ();
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
                     if ( nCmpId == 147 )
                     {
                        OldWcwccaud_wc = httpContext.cgiGet( "W0147") ;
                        if ( ( GXutil.len( OldWcwccaud_wc) == 0 ) || ( GXutil.strcmp(OldWcwccaud_wc, WebComp_Wcwccaud_wc_Component) != 0 ) )
                        {
                           WebComp_Wcwccaud_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcwccaud_wc + "_impl", remoteHandle, context);
                           WebComp_Wcwccaud_wc_Component = OldWcwccaud_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcwccaud_wc_Component) != 0 )
                        {
                           WebComp_Wcwccaud_wc.componentprocess("W0147", "", sEvt);
                        }
                        WebComp_Wcwccaud_wc_Component = OldWcwccaud_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2BQ2( )
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

   public void pa2BQ2( )
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
            GX_FocusControl = edtavBarini_Internalname ;
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
      if ( cmbavRea.getItemCount() > 0 )
      {
         AV27Rea = (byte)(GXutil.lval( cmbavRea.getValidValue(GXutil.trim( GXutil.str( AV27Rea, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Rea", GXutil.str( AV27Rea, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavRea.setValue( GXutil.trim( GXutil.str( AV27Rea, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavRea.getInternalname(), "Values", cmbavRea.ToJavascriptSource(), true);
      }
      AV21Det = ((GXutil.strcmp(GXutil.rtrim( AV21Det), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Det", AV21Det);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2BQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV32Pgmname = "ControlCalidadHTD.Wccaud_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2BQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwccaud_wc_Component) != 0 )
            {
               WebComp_Wcwccaud_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e152BQ2 ();
         wb2BQ0( ) ;
      }
   }

   public void send_integrity_lvl_hashes2BQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV5BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5BarSer, ""))));
   }

   public void before_start_formulas( )
   {
      AV32Pgmname = "ControlCalidadHTD.Wccaud_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2BQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e122BQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIINI_DATA"), AV18CliIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIFIN_DATA"), AV16CliFin_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCCTINI_DATA"), AV14CCTIni_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCCTFIN_DATA"), AV12CCTFin_Data);
         /* Read saved values. */
         AV5BarSer = httpContext.cgiGet( "vBARSER") ;
         AV22EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARINI");
            GX_FocusControl = edtavBarini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarIni), 8, 0));
         }
         else
         {
            AV10BarIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10BarIni), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREOINI");
            GX_FocusControl = edtavReoini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29ReoIni = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ReoIni", GXutil.str( AV29ReoIni, 1, 0));
         }
         else
         {
            AV29ReoIni = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReoini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ReoIni", GXutil.str( AV29ReoIni, 1, 0));
         }
         AV26ParIni = httpContext.cgiGet( edtavParini_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ParIni", AV26ParIni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARFIN");
            GX_FocusControl = edtavBarfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9BarFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarFin), 8, 0));
         }
         else
         {
            AV9BarFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarFin), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREOFIN");
            GX_FocusControl = edtavReofin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28ReoFin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ReoFin", GXutil.str( AV28ReoFin, 1, 0));
         }
         else
         {
            AV28ReoFin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReofin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ReoFin", GXutil.str( AV28ReoFin, 1, 0));
         }
         AV25ParFin = httpContext.cgiGet( edtavParfin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ParFin", AV25ParFin);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchini_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHINI");
            GX_FocusControl = edtavFchini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24FchIni = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FchIni", localUtil.format(AV24FchIni, "99/99/99"));
         }
         else
         {
            AV24FchIni = localUtil.ctod( httpContext.cgiGet( edtavFchini_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24FchIni", localUtil.format(AV24FchIni, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFchfin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFCHFIN");
            GX_FocusControl = edtavFchfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23FchFin = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FchFin", localUtil.format(AV23FchFin, "99/99/99"));
         }
         else
         {
            AV23FchFin = localUtil.ctod( httpContext.cgiGet( edtavFchfin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23FchFin", localUtil.format(AV23FchFin, "99/99/99"));
         }
         cmbavRea.setValue( httpContext.cgiGet( cmbavRea.getInternalname()) );
         AV27Rea = (byte)(GXutil.lval( httpContext.cgiGet( cmbavRea.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Rea", GXutil.str( AV27Rea, 1, 0));
         AV21Det = ((GXutil.strcmp(httpContext.cgiGet( chkavDet.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21Det", AV21Det);
         AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIINI");
            GX_FocusControl = edtavCliini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CliIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliIni), 6, 0));
         }
         else
         {
            AV17CliIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCliini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLIFIN");
            GX_FocusControl = edtavClifin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15CliFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliFin), 6, 0));
         }
         else
         {
            AV15CliFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavClifin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliFin), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTINI");
            GX_FocusControl = edtavCctini_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13CCTIni = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCTIni), 6, 0));
         }
         else
         {
            AV13CCTIni = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctini_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTIni", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CCTIni), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCCTFIN");
            GX_FocusControl = edtavCctfin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11CCTFin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CCTFin), 6, 0));
         }
         else
         {
            AV11CCTFin = (int)(localUtil.ctol( httpContext.cgiGet( edtavCctfin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11CCTFin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CCTFin), 6, 0));
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
      e122BQ2 ();
      if (returnInSub) return;
   }

   public void e122BQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wccaud_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char2, GXv_char3, GXv_char4) ;
      wccaud_wp_impl.this.AV22EmprCod = GXv_char2[0] ;
      wccaud_wp_impl.this.AV6EmprNom = GXv_char3[0] ;
      wccaud_wp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
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
   }

   public void e132BQ2( )
   {
      /* 'DoPDF' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.controlcalidadhtd.arccaud", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarIni,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarFin,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29ReoIni,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28ReoFin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV26ParIni)),GXutil.URLEncode(GXutil.rtrim(AV25ParFin)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV15CliFin,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13CCTIni,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11CCTFin,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV24FchIni)),GXutil.URLEncode(GXutil.formatDateParm(AV23FchFin)),GXutil.URLEncode(GXutil.rtrim(AV21Det)),GXutil.URLEncode(GXutil.ltrimstr(AV27Rea,1,0))}, new String[] {"EmprCod","BarIni","BarFin","ReoIni","ReoFin","ParIni","ParFin","CliIni","CliFin","CCTIni","CCTFin","FchIni","FchFin","Det","Real"}) , new Object[] {"AV22EmprCod","AV10BarIni","AV9BarFin","AV29ReoIni","AV28ReoFin","AV26ParIni","AV25ParFin","AV17CliIni","AV15CliFin","AV13CCTIni","AV11CCTFin","AV24FchIni","AV23FchFin","AV21Det","AV27Rea"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavRea.setValue( GXutil.trim( GXutil.str( AV27Rea, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavRea.getInternalname(), "Values", cmbavRea.ToJavascriptSource(), true);
   }

   public void e142BQ2( )
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
      AV12CCTFin_Data.clear();
      /* Using cursor H02BQ2 */
      pr_default.execute(0, new Object[] {AV22EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = H02BQ2_A396EmprCod[0] ;
         A4036CCTDsc = H02BQ2_A4036CCTDsc[0] ;
         A4031CCTCod = H02BQ2_A4031CCTCod[0] ;
         AV19Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0)) );
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0))+"-"+GXutil.trim( A4036CCTDsc) );
         AV12CCTFin_Data.add(AV19Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV12CCTFin_Data.sort("Title");
      Combo_cctfin_Selectedvalue_set = ((0==AV11CCTFin) ? "" : GXutil.trim( GXutil.str( AV11CCTFin, 6, 0))) ;
      ucCombo_cctfin.sendProperty(context, "", false, Combo_cctfin_Internalname, "SelectedValue_set", Combo_cctfin_Selectedvalue_set);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCCTINI' Routine */
      returnInSub = false ;
      AV14CCTIni_Data.clear();
      /* Using cursor H02BQ3 */
      pr_default.execute(1, new Object[] {AV22EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H02BQ3_A396EmprCod[0] ;
         A4036CCTDsc = H02BQ3_A4036CCTDsc[0] ;
         A4031CCTCod = H02BQ3_A4031CCTCod[0] ;
         AV19Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0)) );
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( GXutil.str( A4031CCTCod, 6, 0))+"-"+GXutil.trim( A4036CCTDsc) );
         AV14CCTIni_Data.add(AV19Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV14CCTIni_Data.sort("Title");
      Combo_cctini_Selectedvalue_set = ((0==AV13CCTIni) ? "" : GXutil.trim( GXutil.str( AV13CCTIni, 6, 0))) ;
      ucCombo_cctini.sendProperty(context, "", false, Combo_cctini_Internalname, "SelectedValue_set", Combo_cctini_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLIFIN' Routine */
      returnInSub = false ;
      AV16CliFin_Data.clear();
      /* Using cursor H02BQ4 */
      pr_default.execute(2, new Object[] {AV22EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H02BQ4_A10045CliAct[0] ;
         A396EmprCod = H02BQ4_A396EmprCod[0] ;
         A279CliNom = H02BQ4_A279CliNom[0] ;
         A252CliCod = H02BQ4_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV19Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV16CliFin_Data.add(AV19Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV16CliFin_Data.sort("Title");
      Combo_clifin_Selectedvalue_set = ((0==AV15CliFin) ? "" : GXutil.trim( GXutil.str( AV15CliFin, 6, 0))) ;
      ucCombo_clifin.sendProperty(context, "", false, Combo_clifin_Internalname, "SelectedValue_set", Combo_clifin_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIINI' Routine */
      returnInSub = false ;
      AV18CliIni_Data.clear();
      /* Using cursor H02BQ5 */
      pr_default.execute(3, new Object[] {AV22EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A10045CliAct = H02BQ5_A10045CliAct[0] ;
         A396EmprCod = H02BQ5_A396EmprCod[0] ;
         A279CliNom = H02BQ5_A279CliNom[0] ;
         A252CliCod = H02BQ5_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV19Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV19Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV18CliIni_Data.add(AV19Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV18CliIni_Data.sort("Title");
      Combo_cliini_Selectedvalue_set = ((0==AV17CliIni) ? "" : GXutil.trim( GXutil.str( AV17CliIni, 6, 0))) ;
      ucCombo_cliini.sendProperty(context, "", false, Combo_cliini_Internalname, "SelectedValue_set", Combo_cliini_Selectedvalue_set);
   }

   protected void nextLoad( )
   {
   }

   protected void e152BQ2( )
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
      pa2BQ2( ) ;
      ws2BQ2( ) ;
      we2BQ2( ) ;
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
      if ( ! ( WebComp_Wcwccaud_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcwccaud_wc_Component) != 0 )
         {
            WebComp_Wcwccaud_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714352176", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/wccaud_wp.js", "?202681714352176", false, true);
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
      edtavBarini_Internalname = "vBARINI" ;
      edtavReoini_Internalname = "vREOINI" ;
      edtavParini_Internalname = "vPARINI" ;
      edtavBarfin_Internalname = "vBARFIN" ;
      edtavReofin_Internalname = "vREOFIN" ;
      edtavParfin_Internalname = "vPARFIN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockcombo_cliini_Internalname = "TEXTBLOCKCOMBO_CLIINI" ;
      Combo_cliini_Internalname = "COMBO_CLIINI" ;
      divTablesplittedcliini_Internalname = "TABLESPLITTEDCLIINI" ;
      lblTextblockcombo_clifin_Internalname = "TEXTBLOCKCOMBO_CLIFIN" ;
      Combo_clifin_Internalname = "COMBO_CLIFIN" ;
      divTablesplittedclifin_Internalname = "TABLESPLITTEDCLIFIN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockcombo_cctini_Internalname = "TEXTBLOCKCOMBO_CCTINI" ;
      Combo_cctini_Internalname = "COMBO_CCTINI" ;
      divTablesplittedcctini_Internalname = "TABLESPLITTEDCCTINI" ;
      lblTextblockcombo_cctfin_Internalname = "TEXTBLOCKCOMBO_CCTFIN" ;
      Combo_cctfin_Internalname = "COMBO_CCTFIN" ;
      divTablesplittedcctfin_Internalname = "TABLESPLITTEDCCTFIN" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavFchini_Internalname = "vFCHINI" ;
      edtavFchfin_Internalname = "vFCHFIN" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbavRea.setInternalname( "vREA" );
      chkavDet.setInternalname( "vDET" );
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnpdf_Internalname = "BTNPDF" ;
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
      chkavDet.setEnabled( 1 );
      cmbavRea.setJsonclick( "" );
      cmbavRea.setEnabled( 1 );
      edtavFchfin_Jsonclick = "" ;
      edtavFchfin_Enabled = 1 ;
      edtavFchini_Jsonclick = "" ;
      edtavFchini_Enabled = 1 ;
      Combo_cctfin_Caption = "" ;
      Combo_cctini_Caption = "" ;
      Combo_clifin_Caption = "" ;
      Combo_cliini_Caption = "" ;
      edtavParfin_Jsonclick = "" ;
      edtavParfin_Enabled = 1 ;
      edtavReofin_Jsonclick = "" ;
      edtavReofin_Enabled = 1 ;
      edtavBarfin_Jsonclick = "" ;
      edtavBarfin_Enabled = 1 ;
      edtavParini_Jsonclick = "" ;
      edtavParini_Enabled = 1 ;
      edtavReoini_Jsonclick = "" ;
      edtavReoini_Enabled = 1 ;
      edtavBarini_Jsonclick = "" ;
      edtavBarini_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Auditoria de los CC", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavRea.setName( "vREA" );
      cmbavRea.setWebtags( "" );
      cmbavRea.addItem("1", httpContext.getMessage( "Realizado", ""), (short)(0));
      cmbavRea.addItem("2", httpContext.getMessage( "No Realizado", ""), (short)(0));
      cmbavRea.addItem("0", httpContext.getMessage( "Ambos", ""), (short)(0));
      if ( cmbavRea.getItemCount() > 0 )
      {
         AV27Rea = (byte)(GXutil.lval( cmbavRea.getValidValue(GXutil.trim( GXutil.str( AV27Rea, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Rea", GXutil.str( AV27Rea, 1, 0));
      }
      chkavDet.setName( "vDET" );
      chkavDet.setWebtags( "" );
      chkavDet.setCaption( httpContext.getMessage( "Detalhe", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavDet.getInternalname(), "TitleCaption", chkavDet.getCaption(), true);
      chkavDet.setCheckedValue( "N" );
      AV21Det = ((GXutil.strcmp(GXutil.rtrim( AV21Det), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Det", AV21Det);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV21Det',fld:'vDET',pic:''},{av:'AV5BarSer',fld:'vBARSER',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e112BQ1',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV10BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV5BarSer',fld:'vBARSER',pic:'',hsh:true},{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV21Det',fld:'vDET',pic:''},{av:'AV23FchFin',fld:'vFCHFIN',pic:''},{av:'AV24FchIni',fld:'vFCHINI',pic:''},{av:'AV25ParFin',fld:'vPARFIN',pic:''},{av:'AV26ParIni',fld:'vPARINI',pic:''},{av:'cmbavRea'},{av:'AV27Rea',fld:'vREA',pic:'9'},{av:'AV28ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV29ReoIni',fld:'vREOINI',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCWCCAUD_WC'}]}");
      setEventMetadata("'DOPDF'","{handler:'e132BQ2',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV10BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV9BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV29ReoIni',fld:'vREOINI',pic:'9'},{av:'AV28ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV26ParIni',fld:'vPARINI',pic:''},{av:'AV25ParFin',fld:'vPARFIN',pic:''},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV15CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV24FchIni',fld:'vFCHINI',pic:''},{av:'AV23FchFin',fld:'vFCHFIN',pic:''},{av:'AV21Det',fld:'vDET',pic:''},{av:'cmbavRea'},{av:'AV27Rea',fld:'vREA',pic:'9'}]");
      setEventMetadata("'DOPDF'",",oparms:[{av:'cmbavRea'},{av:'AV27Rea',fld:'vREA',pic:'9'},{av:'AV21Det',fld:'vDET',pic:''},{av:'AV23FchFin',fld:'vFCHFIN',pic:''},{av:'AV24FchIni',fld:'vFCHINI',pic:''},{av:'AV11CCTFin',fld:'vCCTFIN',pic:'ZZZZZ9'},{av:'AV13CCTIni',fld:'vCCTINI',pic:'ZZZZZ9'},{av:'AV15CliFin',fld:'vCLIFIN',pic:'ZZZZZ9'},{av:'AV17CliIni',fld:'vCLIINI',pic:'ZZZZZ9'},{av:'AV25ParFin',fld:'vPARFIN',pic:''},{av:'AV26ParIni',fld:'vPARINI',pic:''},{av:'AV28ReoFin',fld:'vREOFIN',pic:'9'},{av:'AV29ReoIni',fld:'vREOINI',pic:'9'},{av:'AV9BarFin',fld:'vBARFIN',pic:'ZZZZZZZ9'},{av:'AV10BarIni',fld:'vBARINI',pic:'ZZZZZZZ9'},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e142BQ2',iparms:[]");
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
      AV5BarSer = "" ;
      GXKey = "" ;
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV18CliIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16CliFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV14CCTIni_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV12CCTFin_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV22EmprCod = "" ;
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
      AV26ParIni = "" ;
      AV25ParFin = "" ;
      lblTextblockcombo_cliini_Jsonclick = "" ;
      ucCombo_cliini = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clifin_Jsonclick = "" ;
      ucCombo_clifin = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cctini_Jsonclick = "" ;
      ucCombo_cctini = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cctfin_Jsonclick = "" ;
      ucCombo_cctfin = new com.genexus.webpanels.GXUserControl();
      AV24FchIni = GXutil.nullDate() ;
      AV23FchFin = GXutil.nullDate() ;
      AV21Det = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnpdf_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcwccaud_wc_Component = "" ;
      OldWcwccaud_wc = "" ;
      AV32Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV6EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      scmdbuf = "" ;
      H02BQ2_A396EmprCod = new String[] {""} ;
      H02BQ2_A4036CCTDsc = new String[] {""} ;
      H02BQ2_A4031CCTCod = new int[1] ;
      A396EmprCod = "" ;
      A4036CCTDsc = "" ;
      AV19Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02BQ3_A396EmprCod = new String[] {""} ;
      H02BQ3_A4036CCTDsc = new String[] {""} ;
      H02BQ3_A4031CCTCod = new int[1] ;
      H02BQ4_A10045CliAct = new String[] {""} ;
      H02BQ4_A396EmprCod = new String[] {""} ;
      H02BQ4_A279CliNom = new String[] {""} ;
      H02BQ4_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      H02BQ5_A10045CliAct = new String[] {""} ;
      H02BQ5_A396EmprCod = new String[] {""} ;
      H02BQ5_A279CliNom = new String[] {""} ;
      H02BQ5_A252CliCod = new int[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wccaud_wp__default(),
         new Object[] {
             new Object[] {
            H02BQ2_A396EmprCod, H02BQ2_A4036CCTDsc, H02BQ2_A4031CCTCod
            }
            , new Object[] {
            H02BQ3_A396EmprCod, H02BQ3_A4036CCTDsc, H02BQ3_A4031CCTCod
            }
            , new Object[] {
            H02BQ4_A10045CliAct, H02BQ4_A396EmprCod, H02BQ4_A279CliNom, H02BQ4_A252CliCod
            }
            , new Object[] {
            H02BQ5_A10045CliAct, H02BQ5_A396EmprCod, H02BQ5_A279CliNom, H02BQ5_A252CliCod
            }
         }
      );
      AV32Pgmname = "ControlCalidadHTD.Wccaud_WP" ;
      /* GeneXus formulas. */
      AV32Pgmname = "ControlCalidadHTD.Wccaud_WP" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcwccaud_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV29ReoIni ;
   private byte AV28ReoFin ;
   private byte AV27Rea ;
   private byte nDonePA ;
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
   private int AV10BarIni ;
   private int edtavBarini_Enabled ;
   private int edtavReoini_Enabled ;
   private int edtavParini_Enabled ;
   private int AV9BarFin ;
   private int edtavBarfin_Enabled ;
   private int edtavReofin_Enabled ;
   private int edtavParfin_Enabled ;
   private int edtavFchini_Enabled ;
   private int edtavFchfin_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV17CliIni ;
   private int edtavCliini_Visible ;
   private int AV15CliFin ;
   private int edtavClifin_Visible ;
   private int AV13CCTIni ;
   private int edtavCctini_Visible ;
   private int AV11CCTFin ;
   private int edtavCctfin_Visible ;
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
   private String AV5BarSer ;
   private String GXKey ;
   private String AV22EmprCod ;
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
   private String edtavBarini_Internalname ;
   private String TempTags ;
   private String edtavBarini_Jsonclick ;
   private String edtavReoini_Internalname ;
   private String edtavReoini_Jsonclick ;
   private String edtavParini_Internalname ;
   private String AV26ParIni ;
   private String edtavParini_Jsonclick ;
   private String edtavBarfin_Internalname ;
   private String edtavBarfin_Jsonclick ;
   private String edtavReofin_Internalname ;
   private String edtavReofin_Jsonclick ;
   private String edtavParfin_Internalname ;
   private String AV25ParFin ;
   private String edtavParfin_Jsonclick ;
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
   private String divUnnamedtable3_Internalname ;
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
   private String divUnnamedtable4_Internalname ;
   private String edtavFchini_Internalname ;
   private String edtavFchini_Jsonclick ;
   private String edtavFchfin_Internalname ;
   private String edtavFchfin_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String AV21Det ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnpdf_Internalname ;
   private String bttBtnpdf_Jsonclick ;
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
   private String WebComp_Wcwccaud_wc_Component ;
   private String OldWcwccaud_wc ;
   private String edtavPgmname_Internalname ;
   private String AV32Pgmname ;
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
   private String AV7Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV6EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A4036CCTDsc ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private java.util.Date AV24FchIni ;
   private java.util.Date AV23FchFin ;
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
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwccaud_wc ;
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
   private HTMLChoice cmbavRea ;
   private ICheckbox chkavDet ;
   private IDataStoreProvider pr_default ;
   private String[] H02BQ2_A396EmprCod ;
   private String[] H02BQ2_A4036CCTDsc ;
   private int[] H02BQ2_A4031CCTCod ;
   private String[] H02BQ3_A396EmprCod ;
   private String[] H02BQ3_A4036CCTDsc ;
   private int[] H02BQ3_A4031CCTCod ;
   private String[] H02BQ4_A10045CliAct ;
   private String[] H02BQ4_A396EmprCod ;
   private String[] H02BQ4_A279CliNom ;
   private int[] H02BQ4_A252CliCod ;
   private String[] H02BQ5_A10045CliAct ;
   private String[] H02BQ5_A396EmprCod ;
   private String[] H02BQ5_A279CliNom ;
   private int[] H02BQ5_A252CliCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV18CliIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16CliFin_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV14CCTIni_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12CCTFin_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV19Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wccaud_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02BQ2", "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BQ3", "SELECT EmprCod, CCTDsc, CCTCod FROM TXPCCDef WHERE EmprCod = ? ORDER BY EmprCod, CCTCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BQ4", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02BQ5", "SELECT CliAct, EmprCod, CliNom, CliCod FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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

