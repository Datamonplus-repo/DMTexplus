package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class penalizaciones_impl extends GXDataArea
{
   public penalizaciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public penalizaciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( penalizaciones_impl.class ));
   }

   public penalizaciones_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavNoverpen = UIFactory.getCheckbox(this);
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
      pa23I2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start23I2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.penalizaciones", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV50Metros, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV13CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV13CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV16CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV16CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBEXT", GXutil.ltrim( localUtil.ntoc( A2395BarAlbExt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMANCOD1", GXutil.ltrim( localUtil.ntoc( A3311BarManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACC", GXutil.rtrim( A5253BarAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREKGM", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRGM2", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRANC", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARGRAACA", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARANCACA1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV50Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV50Metros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDPREUNI", GXutil.ltrim( localUtil.ntoc( AV39PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBKGME", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARALBMTRE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "FASE_618", A14267Fase_618);
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcpenalizaciones_wc == null ) )
      {
         WebComp_Wcpenalizaciones_wc.componentjscripts();
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
         we23I2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt23I2( ) ;
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
      return formatLink("app.facturacion.penalizaciones", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.Penalizaciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Penalizaciones", "") ;
   }

   public void wb23I0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV13CliCodfrom_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV16CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Data Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV17AlbProfchfrom, "99/99/99"), localUtil.format( AV17AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\Penalizaciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Data Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV18AlbProfchto, "99/99/99"), localUtil.format( AV18AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\Penalizaciones.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarmancod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmancod1_Internalname, httpContext.getMessage( "Nº Programa", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmancod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarManCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarmancod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarManCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarManCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmancod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmancod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV21BarColNom), GXutil.rtrim( localUtil.format( AV21BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavNoverpen.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavNoverpen.getInternalname(), httpContext.getMessage( "Assumir penalizações sem visualizar", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavNoverpen.getInternalname(), GXutil.str( AV19NoVerPen, 1, 0), "", httpContext.getMessage( "Assumir penalizações sem visualizar", ""), 1, chkavNoverpen.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncargarsdt_Internalname, "", httpContext.getMessage( "Cargar SDT", ""), bttBtncargarsdt_Jsonclick, 5, httpContext.getMessage( "Cargar SDT", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCARGARSDT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamon.render(context, "datamonjs", Datamon_Internalname, "DATAMONContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavVar_json_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVar_json_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVar_json_Internalname, httpContext.getMessage( "SDT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavVar_json_Internalname, AV24Var_Json, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", (short)(0), edtavVar_json_Visible, edtavVar_json_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavVar_json2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVar_json2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVar_json2_Internalname, httpContext.getMessage( "SDT 2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavVar_json2_Internalname, AV29Var_Json2, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", (short)(0), edtavVar_json2_Visible, edtavVar_json2_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_Facturacion\\Penalizaciones.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\Penalizaciones.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0113"+"", GXutil.rtrim( WebComp_Wcpenalizaciones_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0113"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcpenalizaciones_wc), GXutil.lower( WebComp_Wcpenalizaciones_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0113"+"");
               }
               WebComp_Wcpenalizaciones_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcpenalizaciones_wc), GXutil.lower( WebComp_Wcpenalizaciones_wc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV53Pgmname), GXutil.rtrim( localUtil.format( AV53Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\Penalizaciones.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV12CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV12CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Penalizaciones.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\Penalizaciones.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start23I2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Penalizaciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup23I0( ) ;
   }

   public void ws23I2( )
   {
      start23I2( ) ;
      evt23I2( ) ;
   }

   public void evt23I2( )
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
                           e1123I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1223I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1323I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCARGARSDT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCargarSdt' */
                           e1423I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1523I2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1623I2 ();
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
                                 e1723I2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1823I2 ();
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
                     if ( nCmpId == 113 )
                     {
                        OldWcpenalizaciones_wc = httpContext.cgiGet( "W0113") ;
                        if ( ( GXutil.len( OldWcpenalizaciones_wc) == 0 ) || ( GXutil.strcmp(OldWcpenalizaciones_wc, WebComp_Wcpenalizaciones_wc_Component) != 0 ) )
                        {
                           WebComp_Wcpenalizaciones_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcpenalizaciones_wc + "_impl", remoteHandle, context);
                           WebComp_Wcpenalizaciones_wc_Component = OldWcpenalizaciones_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
                        {
                           WebComp_Wcpenalizaciones_wc.componentprocess("W0113", "", sEvt);
                        }
                        WebComp_Wcpenalizaciones_wc_Component = OldWcpenalizaciones_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we23I2( )
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

   public void pa23I2( )
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
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
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
      AV19NoVerPen = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV19NoVerPen, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19NoVerPen", GXutil.str( AV19NoVerPen, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf23I2( ) ;
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
      AV53Pgmname = "Facturacion.Penalizaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavVar_json_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json_Enabled), 5, 0), true);
      edtavVar_json2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json2_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf23I2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
            {
               WebComp_Wcpenalizaciones_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H023I2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e1823I2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wb23I0( ) ;
      }
   }

   public void send_integrity_lvl_hashes23I2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV50Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETROS", getSecureSignedToken( "", localUtil.format( AV50Metros, "ZZZZZ9.99")));
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV53Pgmname = "Facturacion.Penalizaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
      Gx_err = (short)(0) ;
      edtavVar_json_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json_Enabled), 5, 0), true);
      edtavVar_json2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json2_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup23I0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1323I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV13CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV16CliCodto_Data);
         /* Read saved values. */
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
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
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProfchfrom", localUtil.format(AV17AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV17AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17AlbProfchfrom", localUtil.format(AV17AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProfchto", localUtil.format(AV18AlbProfchto, "99/99/99"));
         }
         else
         {
            AV18AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProfchto", localUtil.format(AV18AlbProfchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMANCOD1");
            GX_FocusControl = edtavBarmancod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarManCod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarManCod1), 4, 0));
         }
         else
         {
            AV20BarManCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarmancod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarManCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarManCod1), 4, 0));
         }
         AV21BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarColNom", AV21BarColNom);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavNoverpen.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavNoverpen.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNOVERPEN");
            GX_FocusControl = chkavNoverpen.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19NoVerPen = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19NoVerPen", GXutil.str( AV19NoVerPen, 1, 0));
         }
         else
         {
            AV19NoVerPen = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavNoverpen.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19NoVerPen", GXutil.str( AV19NoVerPen, 1, 0));
         }
         AV24Var_Json = httpContext.cgiGet( edtavVar_json_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Var_Json", AV24Var_Json);
         AV29Var_Json2 = httpContext.cgiGet( edtavVar_json2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Var_Json2", AV29Var_Json2);
         AV53Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pgmname", AV53Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
         }
         else
         {
            AV12CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodto), 6, 0));
         }
         else
         {
            AV15CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodto), 6, 0));
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
      e1323I2 ();
      if (returnInSub) return;
   }

   public void e1323I2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      penalizaciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      penalizaciones_impl.this.A396EmprCod = GXv_char2[0] ;
      penalizaciones_impl.this.AV10EmprNom = GXv_char3[0] ;
      penalizaciones_impl.this.AV11UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV19NoVerPen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19NoVerPen", GXutil.str( AV19NoVerPen, 1, 0));
      AV18AlbProfchto = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbProfchto", localUtil.format(AV18AlbProfchto, "99/99/99"));
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      penalizaciones_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      GXv_char4[0] = AV44Emprcod ;
      GXv_char3[0] = AV10EmprNom ;
      GXv_char2[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      penalizaciones_impl.this.AV44Emprcod = GXv_char4[0] ;
      penalizaciones_impl.this.AV10EmprNom = GXv_char3[0] ;
      penalizaciones_impl.this.AV11UsurCod = GXv_char2[0] ;
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
      edtavVar_json_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json_Visible), 5, 0), true);
      edtavVar_json2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVar_json2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVar_json2_Visible), 5, 0), true);
   }

   public void e1423I2( )
   {
      /* 'DoCargarSdt' Routine */
      returnInSub = false ;
      AV24Var_Json = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Var_Json", AV24Var_Json);
      GXv_char4[0] = AV24Var_Json ;
      GXv_objcol_SdtPenalizaciones_SDT_Item5[0] = AV23Penalizaciones_SDT ;
      new app.facturacion.penalizaciones_cargar_sdt(remoteHandle, context).execute( A396EmprCod, AV12CliCodfrom, AV15CliCodto, AV17AlbProfchfrom, AV18AlbProfchto, AV20BarManCod1, AV21BarColNom, AV19NoVerPen, GXv_char4, GXv_objcol_SdtPenalizaciones_SDT_Item5) ;
      penalizaciones_impl.this.AV24Var_Json = GXv_char4[0] ;
      AV23Penalizaciones_SDT = GXv_objcol_SdtPenalizaciones_SDT_Item5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Var_Json", AV24Var_Json);
      AV29Var_Json2 = AV23Penalizaciones_SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Var_Json2", AV29Var_Json2);
      /*  Sending Event outputs  */
   }

   public void e1523I2( )
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

   public void e1223I2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV15CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e1123I2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV12CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H023I3 */
      pr_default.execute(1, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A10045CliAct = H023I3_A10045CliAct[0] ;
         A13735CliCNom = H023I3_A13735CliCNom[0] ;
         A252CliCod = H023I3_A252CliCod[0] ;
         A279CliNom = H023I3_A279CliNom[0] ;
         AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV16CliCodto_Data.add(AV14Combo_DataItem, 0);
         pr_default.readNext(1);
      }
      pr_default.close(1);
      Combo_clicodto_Selectedvalue_set = ((0==AV15CliCodto) ? "" : GXutil.trim( GXutil.str( AV15CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H023I4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A10045CliAct = H023I4_A10045CliAct[0] ;
         A13735CliCNom = H023I4_A13735CliCNom[0] ;
         A252CliCod = H023I4_A252CliCod[0] ;
         A279CliNom = H023I4_A279CliNom[0] ;
         AV14Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV14Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV13CliCodfrom_Data.add(AV14Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV12CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV12CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e1623I2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV25ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV25ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV25ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV25ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV25ProgressIndicator.show();
      AV41CantidadRegistrosAProcesar = 0 ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           Integer.valueOf(AV12CliCodfrom) ,
                                           Integer.valueOf(AV15CliCodto) ,
                                           AV17AlbProfchfrom ,
                                           AV18AlbProfchto ,
                                           AV21BarColNom ,
                                           Short.valueOf(AV20BarManCod1) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A135BarColNom ,
                                           Short.valueOf(A3311BarManCod1) ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           A5253BarAcc ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A2395BarAlbExt) ,
                                           Boolean.valueOf(A14267Fase_618) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor H023I5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCodfrom), Integer.valueOf(AV15CliCodto), AV17AlbProfchfrom, AV18AlbProfchto, AV21BarColNom, Short.valueOf(AV20BarManCod1)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A33AlbProEst = H023I5_A33AlbProEst[0] ;
         A39AlbProPri = H023I5_A39AlbProPri[0] ;
         A2395BarAlbExt = H023I5_A2395BarAlbExt[0] ;
         n2395BarAlbExt = H023I5_n2395BarAlbExt[0] ;
         A5253BarAcc = H023I5_A5253BarAcc[0] ;
         A3311BarManCod1 = H023I5_A3311BarManCod1[0] ;
         A135BarColNom = H023I5_A135BarColNom[0] ;
         A32AlbProEsp = H023I5_A32AlbProEsp[0] ;
         A34AlbProfch = H023I5_A34AlbProfch[0] ;
         A1243GuiRemCli = H023I5_A1243GuiRemCli[0] ;
         A1262BarPreKgm = H023I5_A1262BarPreKgm[0] ;
         A5019AlbHdrgm2 = H023I5_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = H023I5_A3271AlbHdrAnc[0] ;
         A1909BarGraAca = H023I5_A1909BarGraAca[0] ;
         A125BarAncAca1 = H023I5_A125BarAncAca1[0] ;
         A30AlbProCod = H023I5_A30AlbProCod[0] ;
         A396EmprCod = H023I5_A396EmprCod[0] ;
         A130BarCodPar = H023I5_A130BarCodPar[0] ;
         A132BarCodReo = H023I5_A132BarCodReo[0] ;
         A129BarCod = H023I5_A129BarCod[0] ;
         A33AlbProEst = H023I5_A33AlbProEst[0] ;
         A39AlbProPri = H023I5_A39AlbProPri[0] ;
         A34AlbProfch = H023I5_A34AlbProfch[0] ;
         A1243GuiRemCli = H023I5_A1243GuiRemCli[0] ;
         A5253BarAcc = H023I5_A5253BarAcc[0] ;
         A3311BarManCod1 = H023I5_A3311BarManCod1[0] ;
         A135BarColNom = H023I5_A135BarColNom[0] ;
         A1909BarGraAca = H023I5_A1909BarGraAca[0] ;
         A125BarAncAca1 = H023I5_A125BarAncAca1[0] ;
         GXt_boolean6 = A14267Fase_618 ;
         GXv_boolean7[0] = GXt_boolean6 ;
         new app.pedidosclientesindetalle.fase_618(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_boolean7) ;
         penalizaciones_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
         A14267Fase_618 = GXt_boolean6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14267Fase_618", A14267Fase_618);
         if ( ! A14267Fase_618 )
         {
            GXv_decimal8[0] = AV33Precio ;
            GXv_decimal9[0] = AV34Kilos ;
            GXv_char4[0] = AV35PMDDsc ;
            GXv_decimal10[0] = AV36PMDDtoTin ;
            GXv_decimal11[0] = AV37PMDDtoAca ;
            GXv_decimal12[0] = AV38PMDTinPrc ;
            GXv_decimal13[0] = AV30PMDAcaPrc ;
            GXv_decimal14[0] = AV31PMDKgmMinS ;
            GXv_int15[0] = AV32OkKgMin ;
            GXv_decimal16[0] = AV39PMDPreUni ;
            new app.pppmd21(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal8, GXv_decimal9, "T", GXv_char4, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_int15, GXv_decimal16, A1262BarPreKgm) ;
            penalizaciones_impl.this.AV33Precio = GXv_decimal8[0] ;
            penalizaciones_impl.this.AV34Kilos = GXv_decimal9[0] ;
            penalizaciones_impl.this.AV35PMDDsc = GXv_char4[0] ;
            penalizaciones_impl.this.AV36PMDDtoTin = GXv_decimal10[0] ;
            penalizaciones_impl.this.AV37PMDDtoAca = GXv_decimal11[0] ;
            penalizaciones_impl.this.AV38PMDTinPrc = GXv_decimal12[0] ;
            penalizaciones_impl.this.AV30PMDAcaPrc = GXv_decimal13[0] ;
            penalizaciones_impl.this.AV31PMDKgmMinS = GXv_decimal14[0] ;
            penalizaciones_impl.this.AV32OkKgMin = GXv_int15[0] ;
            penalizaciones_impl.this.AV39PMDPreUni = GXv_decimal16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39PMDPreUni", GXutil.ltrimstr( AV39PMDPreUni, 14, 5));
            AV48BarGraAca = A5019AlbHdrgm2 ;
            AV47BarAncAca1 = A3271AlbHdrAnc ;
            if ( (0==AV48BarGraAca) )
            {
               AV48BarGraAca = A1909BarGraAca ;
            }
            if ( (0==AV47BarAncAca1) )
            {
               AV47BarAncAca1 = A125BarAncAca1 ;
            }
            AV49BarAlbKgmE = AV34Kilos ;
            if ( ( ( A3311BarManCod1 > 0 ) ) || ( ( DecimalUtil.compareTo(AV33Precio, A1262BarPreKgm) != 0 ) ) || ( ( AV38PMDTinPrc.doubleValue() != 0 ) ) || ( ( AV30PMDAcaPrc.doubleValue() != 0 ) ) || ( ( AV31PMDKgmMinS.doubleValue() != 0 ) ) || ( ( AV32OkKgMin == 1 ) ) )
            {
               if ( ( DecimalUtil.compareTo(AV31PMDKgmMinS, AV49BarAlbKgmE) == 0 ) && ( AV32OkKgMin == 1 ) )
               {
                  AV46Ancho = DecimalUtil.doubleToDec(AV47BarAncAca1/ (double) (100)) ;
                  if ( (DecimalUtil.doubleToDec(AV48BarGraAca).multiply(AV46Ancho)).doubleValue() > 0 )
                  {
                     AV40MtsMinS = (AV49BarAlbKgmE.divide((DecimalUtil.doubleToDec(AV48BarGraAca).multiply(AV46Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
                  }
                  else
                  {
                     AV40MtsMinS = AV50Metros ;
                  }
               }
               if ( ( A3311BarManCod1 == 0 ) && ( AV19NoVerPen == 1 ) )
               {
               }
               else
               {
                  AV41CantidadRegistrosAProcesar = (long)(AV41CantidadRegistrosAProcesar+1) ;
               }
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      if ( AV41CantidadRegistrosAProcesar == 0 )
      {
         AV41CantidadRegistrosAProcesar = 1 ;
      }
      AV42CantidadRegistrosProcesados = 0 ;
      AV26i = 1 ;
      while ( AV26i <= AV41CantidadRegistrosAProcesar )
      {
         AV42CantidadRegistrosProcesados = (long)(AV42CantidadRegistrosProcesados+1) ;
         AV43Porcentaje = (short)((AV42CantidadRegistrosProcesados/ (double) (AV41CantidadRegistrosAProcesar))*100) ;
         AV25ProgressIndicator.setgxTv_SdtProgress_Value( AV43Porcentaje );
         AV25ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2.", ""), GXutil.trim( GXutil.str( AV42CantidadRegistrosProcesados, 10, 0)), GXutil.trim( GXutil.str( AV41CantidadRegistrosAProcesar, 10, 0)), "", "", "", "", "", "", ""));
         AV26i = (long)(AV26i+1) ;
         AV26i = (long)(AV26i+1) ;
      }
      GXv_char4[0] = AV24Var_Json ;
      GXv_objcol_SdtPenalizaciones_SDT_Item5[0] = AV23Penalizaciones_SDT ;
      new app.facturacion.penalizaciones_cargar_sdt(remoteHandle, context).execute( A396EmprCod, AV12CliCodfrom, AV15CliCodto, AV17AlbProfchfrom, AV18AlbProfchto, AV20BarManCod1, AV21BarColNom, AV19NoVerPen, GXv_char4, GXv_objcol_SdtPenalizaciones_SDT_Item5) ;
      penalizaciones_impl.this.AV24Var_Json = GXv_char4[0] ;
      AV23Penalizaciones_SDT = GXv_objcol_SdtPenalizaciones_SDT_Item5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Var_Json", AV24Var_Json);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcpenalizaciones_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcpenalizaciones_wc_Component), GXutil.lower( "Facturacion.Penalizaciones_WC")) != 0 )
      {
         WebComp_Wcpenalizaciones_wc = WebUtils.getWebComponent(getClass(), "app.facturacion.penalizaciones_wc_impl", remoteHandle, context);
         WebComp_Wcpenalizaciones_wc_Component = "Facturacion.Penalizaciones_WC" ;
      }
      if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
      {
         WebComp_Wcpenalizaciones_wc.setjustcreated();
         WebComp_Wcpenalizaciones_wc.componentprepare(new Object[] {"W0113","",A396EmprCod,Integer.valueOf(AV12CliCodfrom),Integer.valueOf(AV15CliCodto),AV17AlbProfchfrom,AV18AlbProfchto,Short.valueOf(AV20BarManCod1),AV21BarColNom,Byte.valueOf(AV19NoVerPen),AV24Var_Json});
         WebComp_Wcpenalizaciones_wc.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vALBPROFCHFROM","vALBPROFCHTO","vBARMANCOD1","vBARCOLNOM","vNOVERPEN","vVAR_JSON"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcpenalizaciones_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0113"+"");
         WebComp_Wcpenalizaciones_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV25ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV25ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV26i = GXutil.sleep( 1) ;
      AV25ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ProgressIndicator", AV25ProgressIndicator);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1723I2 ();
      if (returnInSub) return;
   }

   public void e1723I2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV25ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV25ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV25ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV25ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV25ProgressIndicator.show();
      AV41CantidadRegistrosAProcesar = 0 ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Integer.valueOf(AV12CliCodfrom) ,
                                           Integer.valueOf(AV15CliCodto) ,
                                           AV17AlbProfchfrom ,
                                           AV18AlbProfchto ,
                                           AV21BarColNom ,
                                           Short.valueOf(AV20BarManCod1) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A34AlbProfch ,
                                           A135BarColNom ,
                                           Short.valueOf(A3311BarManCod1) ,
                                           Byte.valueOf(A32AlbProEsp) ,
                                           A5253BarAcc ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A2395BarAlbExt) ,
                                           Boolean.valueOf(A14267Fase_618) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor H023I6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCodfrom), Integer.valueOf(AV15CliCodto), AV17AlbProfchfrom, AV18AlbProfchto, AV21BarColNom, Short.valueOf(AV20BarManCod1)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A33AlbProEst = H023I6_A33AlbProEst[0] ;
         A39AlbProPri = H023I6_A39AlbProPri[0] ;
         A2395BarAlbExt = H023I6_A2395BarAlbExt[0] ;
         n2395BarAlbExt = H023I6_n2395BarAlbExt[0] ;
         A5253BarAcc = H023I6_A5253BarAcc[0] ;
         A3311BarManCod1 = H023I6_A3311BarManCod1[0] ;
         A135BarColNom = H023I6_A135BarColNom[0] ;
         A32AlbProEsp = H023I6_A32AlbProEsp[0] ;
         A34AlbProfch = H023I6_A34AlbProfch[0] ;
         A1243GuiRemCli = H023I6_A1243GuiRemCli[0] ;
         A1262BarPreKgm = H023I6_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = H023I6_A1261BarAlbKgmE[0] ;
         A125BarAncAca1 = H023I6_A125BarAncAca1[0] ;
         A1263BarAlbMtrE = H023I6_A1263BarAlbMtrE[0] ;
         A30AlbProCod = H023I6_A30AlbProCod[0] ;
         A396EmprCod = H023I6_A396EmprCod[0] ;
         A130BarCodPar = H023I6_A130BarCodPar[0] ;
         A132BarCodReo = H023I6_A132BarCodReo[0] ;
         A129BarCod = H023I6_A129BarCod[0] ;
         A33AlbProEst = H023I6_A33AlbProEst[0] ;
         A39AlbProPri = H023I6_A39AlbProPri[0] ;
         A34AlbProfch = H023I6_A34AlbProfch[0] ;
         A1243GuiRemCli = H023I6_A1243GuiRemCli[0] ;
         A5253BarAcc = H023I6_A5253BarAcc[0] ;
         A3311BarManCod1 = H023I6_A3311BarManCod1[0] ;
         A135BarColNom = H023I6_A135BarColNom[0] ;
         A125BarAncAca1 = H023I6_A125BarAncAca1[0] ;
         GXt_boolean6 = A14267Fase_618 ;
         GXv_boolean7[0] = GXt_boolean6 ;
         new app.pedidosclientesindetalle.fase_618(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_boolean7) ;
         penalizaciones_impl.this.GXt_boolean6 = GXv_boolean7[0] ;
         A14267Fase_618 = GXt_boolean6 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14267Fase_618", A14267Fase_618);
         if ( ! A14267Fase_618 )
         {
            GXv_decimal16[0] = AV33Precio ;
            GXv_decimal14[0] = AV34Kilos ;
            GXv_char4[0] = AV35PMDDsc ;
            GXv_decimal13[0] = AV36PMDDtoTin ;
            GXv_decimal12[0] = AV37PMDDtoAca ;
            GXv_decimal11[0] = AV38PMDTinPrc ;
            GXv_decimal10[0] = AV30PMDAcaPrc ;
            GXv_decimal9[0] = AV31PMDKgmMinS ;
            GXv_int15[0] = AV32OkKgMin ;
            GXv_decimal8[0] = A1262BarPreKgm ;
            new app.pppmd21(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal16, GXv_decimal14, "T", GXv_char4, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_int15, GXv_decimal8, AV39PMDPreUni) ;
            penalizaciones_impl.this.AV33Precio = GXv_decimal16[0] ;
            penalizaciones_impl.this.AV34Kilos = GXv_decimal14[0] ;
            penalizaciones_impl.this.AV35PMDDsc = GXv_char4[0] ;
            penalizaciones_impl.this.AV36PMDDtoTin = GXv_decimal13[0] ;
            penalizaciones_impl.this.AV37PMDDtoAca = GXv_decimal12[0] ;
            penalizaciones_impl.this.AV38PMDTinPrc = GXv_decimal11[0] ;
            penalizaciones_impl.this.AV30PMDAcaPrc = GXv_decimal10[0] ;
            penalizaciones_impl.this.AV31PMDKgmMinS = GXv_decimal9[0] ;
            penalizaciones_impl.this.AV32OkKgMin = GXv_int15[0] ;
            penalizaciones_impl.this.A1262BarPreKgm = GXv_decimal8[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
            GXv_decimal16[0] = AV40MtsMinS ;
            new app.facturacion.pmtsmins(remoteHandle, context).execute( AV31PMDKgmMinS, A1261BarAlbKgmE, AV32OkKgMin, A125BarAncAca1, A1263BarAlbMtrE, GXv_decimal16) ;
            penalizaciones_impl.this.AV40MtsMinS = GXv_decimal16[0] ;
            if ( ( ( A3311BarManCod1 > 0 ) ) || ( ( DecimalUtil.compareTo(AV33Precio, A1262BarPreKgm) != 0 ) ) || ( ( AV38PMDTinPrc.doubleValue() != 0 ) ) || ( ( AV30PMDAcaPrc.doubleValue() != 0 ) ) || ( ( AV31PMDKgmMinS.doubleValue() != 0 ) ) || ( ( AV32OkKgMin == 1 ) ) )
            {
               if ( ( A3311BarManCod1 == 0 ) && ( AV19NoVerPen == 1 ) )
               {
               }
               else
               {
                  AV41CantidadRegistrosAProcesar = (long)(AV41CantidadRegistrosAProcesar+1) ;
               }
            }
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV41CantidadRegistrosAProcesar == 0 )
      {
         AV41CantidadRegistrosAProcesar = 1 ;
      }
      AV42CantidadRegistrosProcesados = 0 ;
      AV26i = 1 ;
      while ( AV26i <= AV41CantidadRegistrosAProcesar )
      {
         AV42CantidadRegistrosProcesados = (long)(AV42CantidadRegistrosProcesados+1) ;
         AV43Porcentaje = (short)((AV42CantidadRegistrosProcesados/ (double) (AV41CantidadRegistrosAProcesar))*100) ;
         AV25ProgressIndicator.setgxTv_SdtProgress_Value( AV43Porcentaje );
         AV25ProgressIndicator.showwithtitle(GXutil.format( httpContext.getMessage( "Procesando %1 de %2.", ""), GXutil.trim( GXutil.str( AV42CantidadRegistrosProcesados, 10, 0)), GXutil.trim( GXutil.str( AV41CantidadRegistrosAProcesar, 10, 0)), "", "", "", "", "", "", ""));
         AV26i = (long)(AV26i+1) ;
         AV26i = (long)(AV26i+1) ;
      }
      GXv_char4[0] = AV24Var_Json ;
      GXv_objcol_SdtPenalizaciones_SDT_Item5[0] = AV23Penalizaciones_SDT ;
      new app.facturacion.penalizaciones_cargar_sdt(remoteHandle, context).execute( A396EmprCod, AV12CliCodfrom, AV15CliCodto, AV17AlbProfchfrom, AV18AlbProfchto, AV20BarManCod1, AV21BarColNom, AV19NoVerPen, GXv_char4, GXv_objcol_SdtPenalizaciones_SDT_Item5) ;
      penalizaciones_impl.this.AV24Var_Json = GXv_char4[0] ;
      AV23Penalizaciones_SDT = GXv_objcol_SdtPenalizaciones_SDT_Item5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Var_Json", AV24Var_Json);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcpenalizaciones_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcpenalizaciones_wc_Component), GXutil.lower( "Facturacion.Penalizaciones_WC")) != 0 )
      {
         WebComp_Wcpenalizaciones_wc = WebUtils.getWebComponent(getClass(), "app.facturacion.penalizaciones_wc_impl", remoteHandle, context);
         WebComp_Wcpenalizaciones_wc_Component = "Facturacion.Penalizaciones_WC" ;
      }
      if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
      {
         WebComp_Wcpenalizaciones_wc.setjustcreated();
         WebComp_Wcpenalizaciones_wc.componentprepare(new Object[] {"W0113","",A396EmprCod,Integer.valueOf(AV12CliCodfrom),Integer.valueOf(AV15CliCodto),AV17AlbProfchfrom,AV18AlbProfchto,Short.valueOf(AV20BarManCod1),AV21BarColNom,Byte.valueOf(AV19NoVerPen),AV24Var_Json});
         WebComp_Wcpenalizaciones_wc.componentbind(new Object[] {"","vCLICODFROM","vCLICODTO","vALBPROFCHFROM","vALBPROFCHTO","vBARMANCOD1","vBARCOLNOM","vNOVERPEN","vVAR_JSON"});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcpenalizaciones_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0113"+"");
         WebComp_Wcpenalizaciones_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      this.executeUsercontrolMethod("", false, "DATAMONContainer", "CollapsePanel", "", new Object[] {httpContext.getMessage( "Title_DVPANEL_PANEL_FILTROSContainer", "")});
      AV25ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV25ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
      AV26i = GXutil.sleep( 1) ;
      AV25ProgressIndicator.hide();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV25ProgressIndicator", AV25ProgressIndicator);
   }

   protected void nextLoad( )
   {
   }

   protected void e1823I2( )
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
      pa23I2( ) ;
      ws23I2( ) ;
      we23I2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcpenalizaciones_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcpenalizaciones_wc_Component) != 0 )
         {
            WebComp_Wcpenalizaciones_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513266", true, true);
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
      httpContext.AddJavascriptSource("facturacion/penalizaciones.js", "?20268241513266", false, true);
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      lblTextblockcombo_clicodfrom_Internalname = "TEXTBLOCKCOMBO_CLICODFROM" ;
      Combo_clicodfrom_Internalname = "COMBO_CLICODFROM" ;
      divTablesplittedclicodfrom_Internalname = "TABLESPLITTEDCLICODFROM" ;
      lblTextblockcombo_clicodto_Internalname = "TEXTBLOCKCOMBO_CLICODTO" ;
      Combo_clicodto_Internalname = "COMBO_CLICODTO" ;
      divTablesplittedclicodto_Internalname = "TABLESPLITTEDCLICODTO" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      edtavBarmancod1_Internalname = "vBARMANCOD1" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      chkavNoverpen.setInternalname( "vNOVERPEN" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncargarsdt_Internalname = "BTNCARGARSDT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Datamon_Internalname = "DATAMON" ;
      edtavVar_json_Internalname = "vVAR_JSON" ;
      edtavVar_json2_Internalname = "vVAR_JSON2" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
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
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
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
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavVar_json2_Enabled = 1 ;
      edtavVar_json2_Visible = 1 ;
      edtavVar_json_Enabled = 1 ;
      edtavVar_json_Visible = 1 ;
      chkavNoverpen.setEnabled( 1 );
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarmancod1_Jsonclick = "" ;
      edtavBarmancod1_Enabled = 1 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
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
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Penalizaciones", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavNoverpen.setName( "vNOVERPEN" );
      chkavNoverpen.setWebtags( "" );
      chkavNoverpen.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavNoverpen.getInternalname(), "TitleCaption", chkavNoverpen.getCaption(), true);
      chkavNoverpen.setCheckedValue( "0" );
      AV19NoVerPen = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV19NoVerPen, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19NoVerPen", GXutil.str( AV19NoVerPen, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19NoVerPen',fld:'vNOVERPEN',pic:'9'},{av:'AV50Metros',fld:'vMETROS',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCARGARSDT'","{handler:'e1423I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV17AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV18AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV20BarManCod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'AV21BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV19NoVerPen',fld:'vNOVERPEN',pic:'9'}]");
      setEventMetadata("'DOCARGARSDT'",",oparms:[{av:'AV24Var_Json',fld:'vVAR_JSON',pic:''},{av:'AV29Var_Json2',fld:'vVAR_JSON2',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1523I2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e1223I2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e1123I2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1623I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV17AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV18AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'A2395BarAlbExt',fld:'BARALBEXT',pic:'ZZZZZZZ9'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV21BarColNom',fld:'vBARCOLNOM',pic:''},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV20BarManCod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A14267Fase_618',fld:'FASE_618',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'AV50Metros',fld:'vMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV19NoVerPen',fld:'vNOVERPEN',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV39PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV24Var_Json',fld:'vVAR_JSON',pic:''},{ctrl:'WCPENALIZACIONES_WC'}]}");
      setEventMetadata("ENTER","{handler:'e1723I2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'AV12CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV17AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV18AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'A2395BarAlbExt',fld:'BARALBEXT',pic:'ZZZZZZZ9'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV21BarColNom',fld:'vBARCOLNOM',pic:''},{av:'A3311BarManCod1',fld:'BARMANCOD1',pic:'ZZZ9'},{av:'AV20BarManCod1',fld:'vBARMANCOD1',pic:'ZZZ9'},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A14267Fase_618',fld:'FASE_618',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV39PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV19NoVerPen',fld:'vNOVERPEN',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'AV24Var_Json',fld:'vVAR_JSON',pic:''},{ctrl:'WCPENALIZACIONES_WC'}]}");
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
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV50Metros = DecimalUtil.ZERO ;
      GXKey = "" ;
      AV13CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A135BarColNom = "" ;
      A5253BarAcc = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      AV39PMDPreUni = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
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
      AV17AlbProfchfrom = GXutil.nullDate() ;
      AV18AlbProfchto = GXutil.nullDate() ;
      AV21BarColNom = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncargarsdt_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDatamon = new com.genexus.webpanels.GXUserControl();
      AV24Var_Json = "" ;
      AV29Var_Json2 = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcpenalizaciones_wc_Component = "" ;
      OldWcpenalizaciones_wc = "" ;
      AV53Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H023I2_A396EmprCod = new String[] {""} ;
      AV9Station = "" ;
      AV10EmprNom = "" ;
      AV11UsurCod = "" ;
      GXt_char1 = "" ;
      AV44Emprcod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV23Penalizaciones_SDT = new GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item>(app.facturacion.SdtPenalizaciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      H023I3_A396EmprCod = new String[] {""} ;
      H023I3_A10045CliAct = new String[] {""} ;
      H023I3_A13735CliCNom = new String[] {""} ;
      H023I3_A252CliCod = new int[1] ;
      H023I3_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV14Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H023I4_A396EmprCod = new String[] {""} ;
      H023I4_A10045CliAct = new String[] {""} ;
      H023I4_A13735CliCNom = new String[] {""} ;
      H023I4_A252CliCod = new int[1] ;
      H023I4_A279CliNom = new String[] {""} ;
      AV25ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      H023I5_A33AlbProEst = new byte[1] ;
      H023I5_A39AlbProPri = new String[] {""} ;
      H023I5_A2395BarAlbExt = new int[1] ;
      H023I5_n2395BarAlbExt = new boolean[] {false} ;
      H023I5_A5253BarAcc = new String[] {""} ;
      H023I5_A3311BarManCod1 = new short[1] ;
      H023I5_A135BarColNom = new String[] {""} ;
      H023I5_A32AlbProEsp = new byte[1] ;
      H023I5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H023I5_A1243GuiRemCli = new int[1] ;
      H023I5_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023I5_A5019AlbHdrgm2 = new short[1] ;
      H023I5_A3271AlbHdrAnc = new short[1] ;
      H023I5_A1909BarGraAca = new short[1] ;
      H023I5_A125BarAncAca1 = new short[1] ;
      H023I5_A30AlbProCod = new long[1] ;
      H023I5_A396EmprCod = new String[] {""} ;
      H023I5_A130BarCodPar = new String[] {""} ;
      H023I5_A132BarCodReo = new byte[1] ;
      H023I5_A129BarCod = new int[1] ;
      AV33Precio = DecimalUtil.ZERO ;
      AV34Kilos = DecimalUtil.ZERO ;
      AV35PMDDsc = "" ;
      AV36PMDDtoTin = DecimalUtil.ZERO ;
      AV37PMDDtoAca = DecimalUtil.ZERO ;
      AV38PMDTinPrc = DecimalUtil.ZERO ;
      AV30PMDAcaPrc = DecimalUtil.ZERO ;
      AV31PMDKgmMinS = DecimalUtil.ZERO ;
      AV49BarAlbKgmE = DecimalUtil.ZERO ;
      AV46Ancho = DecimalUtil.ZERO ;
      AV40MtsMinS = DecimalUtil.ZERO ;
      H023I6_A33AlbProEst = new byte[1] ;
      H023I6_A39AlbProPri = new String[] {""} ;
      H023I6_A2395BarAlbExt = new int[1] ;
      H023I6_n2395BarAlbExt = new boolean[] {false} ;
      H023I6_A5253BarAcc = new String[] {""} ;
      H023I6_A3311BarManCod1 = new short[1] ;
      H023I6_A135BarColNom = new String[] {""} ;
      H023I6_A32AlbProEsp = new byte[1] ;
      H023I6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H023I6_A1243GuiRemCli = new int[1] ;
      H023I6_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023I6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023I6_A125BarAncAca1 = new short[1] ;
      H023I6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H023I6_A30AlbProCod = new long[1] ;
      H023I6_A396EmprCod = new String[] {""} ;
      H023I6_A130BarCodPar = new String[] {""} ;
      H023I6_A132BarCodReo = new byte[1] ;
      H023I6_A129BarCod = new int[1] ;
      GXv_boolean7 = new boolean[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int15 = new byte[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtPenalizaciones_SDT_Item5 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.penalizaciones__default(),
         new Object[] {
             new Object[] {
            H023I2_A396EmprCod
            }
            , new Object[] {
            H023I3_A396EmprCod, H023I3_A10045CliAct, H023I3_A13735CliCNom, H023I3_A252CliCod, H023I3_A279CliNom
            }
            , new Object[] {
            H023I4_A396EmprCod, H023I4_A10045CliAct, H023I4_A13735CliCNom, H023I4_A252CliCod, H023I4_A279CliNom
            }
            , new Object[] {
            H023I5_A33AlbProEst, H023I5_A39AlbProPri, H023I5_A2395BarAlbExt, H023I5_n2395BarAlbExt, H023I5_A5253BarAcc, H023I5_A3311BarManCod1, H023I5_A135BarColNom, H023I5_A32AlbProEsp, H023I5_A34AlbProfch, H023I5_A1243GuiRemCli,
            H023I5_A1262BarPreKgm, H023I5_A5019AlbHdrgm2, H023I5_A3271AlbHdrAnc, H023I5_A1909BarGraAca, H023I5_A125BarAncAca1, H023I5_A30AlbProCod, H023I5_A396EmprCod, H023I5_A130BarCodPar, H023I5_A132BarCodReo, H023I5_A129BarCod
            }
            , new Object[] {
            H023I6_A33AlbProEst, H023I6_A39AlbProPri, H023I6_A2395BarAlbExt, H023I6_n2395BarAlbExt, H023I6_A5253BarAcc, H023I6_A3311BarManCod1, H023I6_A135BarColNom, H023I6_A32AlbProEsp, H023I6_A34AlbProfch, H023I6_A1243GuiRemCli,
            H023I6_A1262BarPreKgm, H023I6_A1261BarAlbKgmE, H023I6_A125BarAncAca1, H023I6_A1263BarAlbMtrE, H023I6_A30AlbProCod, H023I6_A396EmprCod, H023I6_A130BarCodPar, H023I6_A132BarCodReo, H023I6_A129BarCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV53Pgmname = "Facturacion.Penalizaciones" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV53Pgmname = "Facturacion.Penalizaciones" ;
      Gx_err = (short)(0) ;
      edtavVar_json_Enabled = 0 ;
      edtavVar_json2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcpenalizaciones_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte A32AlbProEsp ;
   private byte A132BarCodReo ;
   private byte AV19NoVerPen ;
   private byte nDonePA ;
   private byte AV32OkKgMin ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A3311BarManCod1 ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV20BarManCod1 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV48BarGraAca ;
   private short AV47BarAncAca1 ;
   private short AV43Porcentaje ;
   private int A1243GuiRemCli ;
   private int A2395BarAlbExt ;
   private int A129BarCod ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavBarmancod1_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavVar_json_Visible ;
   private int edtavVar_json_Enabled ;
   private int edtavVar_json2_Visible ;
   private int edtavVar_json2_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV12CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV15CliCodto ;
   private int edtavClicodto_Visible ;
   private int A252CliCod ;
   private int idxLst ;
   private long A30AlbProCod ;
   private long AV41CantidadRegistrosAProcesar ;
   private long AV42CantidadRegistrosProcesados ;
   private long AV26i ;
   private java.math.BigDecimal AV50Metros ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal AV39PMDPreUni ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal AV33Precio ;
   private java.math.BigDecimal AV34Kilos ;
   private java.math.BigDecimal AV36PMDDtoTin ;
   private java.math.BigDecimal AV37PMDDtoAca ;
   private java.math.BigDecimal AV38PMDTinPrc ;
   private java.math.BigDecimal AV30PMDAcaPrc ;
   private java.math.BigDecimal AV31PMDKgmMinS ;
   private java.math.BigDecimal AV49BarAlbKgmE ;
   private java.math.BigDecimal AV46Ancho ;
   private java.math.BigDecimal AV40MtsMinS ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A39AlbProPri ;
   private String A135BarColNom ;
   private String A5253BarAcc ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
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
   private String edtavAlbprofchfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
   private String edtavBarmancod1_Internalname ;
   private String edtavBarmancod1_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV21BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncargarsdt_Internalname ;
   private String bttBtncargarsdt_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Datamon_Internalname ;
   private String edtavVar_json_Internalname ;
   private String edtavVar_json2_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcpenalizaciones_wc_Component ;
   private String OldWcpenalizaciones_wc ;
   private String edtavPgmname_Internalname ;
   private String AV53Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String scmdbuf ;
   private String AV9Station ;
   private String AV10EmprNom ;
   private String AV11UsurCod ;
   private String GXt_char1 ;
   private String AV44Emprcod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String AV35PMDDsc ;
   private String GXv_char4[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV17AlbProfchfrom ;
   private java.util.Date AV18AlbProfchto ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean A14267Fase_618 ;
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
   private boolean n2395BarAlbExt ;
   private boolean bDynCreated_Wcpenalizaciones_wc ;
   private boolean GXt_boolean6 ;
   private boolean GXv_boolean7[] ;
   private String AV24Var_Json ;
   private String AV29Var_Json2 ;
   private String A13735CliCNom ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcpenalizaciones_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucDatamon ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV25ProgressIndicator ;
   private ICheckbox chkavNoverpen ;
   private IDataStoreProvider pr_default ;
   private String[] H023I2_A396EmprCod ;
   private String[] H023I3_A396EmprCod ;
   private String[] H023I3_A10045CliAct ;
   private String[] H023I3_A13735CliCNom ;
   private int[] H023I3_A252CliCod ;
   private String[] H023I3_A279CliNom ;
   private String[] H023I4_A396EmprCod ;
   private String[] H023I4_A10045CliAct ;
   private String[] H023I4_A13735CliCNom ;
   private int[] H023I4_A252CliCod ;
   private String[] H023I4_A279CliNom ;
   private byte[] H023I5_A33AlbProEst ;
   private String[] H023I5_A39AlbProPri ;
   private int[] H023I5_A2395BarAlbExt ;
   private boolean[] H023I5_n2395BarAlbExt ;
   private String[] H023I5_A5253BarAcc ;
   private short[] H023I5_A3311BarManCod1 ;
   private String[] H023I5_A135BarColNom ;
   private byte[] H023I5_A32AlbProEsp ;
   private java.util.Date[] H023I5_A34AlbProfch ;
   private int[] H023I5_A1243GuiRemCli ;
   private java.math.BigDecimal[] H023I5_A1262BarPreKgm ;
   private short[] H023I5_A5019AlbHdrgm2 ;
   private short[] H023I5_A3271AlbHdrAnc ;
   private short[] H023I5_A1909BarGraAca ;
   private short[] H023I5_A125BarAncAca1 ;
   private long[] H023I5_A30AlbProCod ;
   private String[] H023I5_A396EmprCod ;
   private String[] H023I5_A130BarCodPar ;
   private byte[] H023I5_A132BarCodReo ;
   private int[] H023I5_A129BarCod ;
   private byte[] H023I6_A33AlbProEst ;
   private String[] H023I6_A39AlbProPri ;
   private int[] H023I6_A2395BarAlbExt ;
   private boolean[] H023I6_n2395BarAlbExt ;
   private String[] H023I6_A5253BarAcc ;
   private short[] H023I6_A3311BarManCod1 ;
   private String[] H023I6_A135BarColNom ;
   private byte[] H023I6_A32AlbProEsp ;
   private java.util.Date[] H023I6_A34AlbProfch ;
   private int[] H023I6_A1243GuiRemCli ;
   private java.math.BigDecimal[] H023I6_A1262BarPreKgm ;
   private java.math.BigDecimal[] H023I6_A1261BarAlbKgmE ;
   private short[] H023I6_A125BarAncAca1 ;
   private java.math.BigDecimal[] H023I6_A1263BarAlbMtrE ;
   private long[] H023I6_A30AlbProCod ;
   private String[] H023I6_A396EmprCod ;
   private String[] H023I6_A130BarCodPar ;
   private byte[] H023I6_A132BarCodReo ;
   private int[] H023I6_A129BarCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV16CliCodto_Data ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> AV23Penalizaciones_SDT ;
   private GXBaseCollection<app.facturacion.SdtPenalizaciones_SDT_Item> GXv_objcol_SdtPenalizaciones_SDT_Item5[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV14Combo_DataItem ;
}

final  class penalizaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H023I5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12CliCodfrom ,
                                          int AV15CliCodto ,
                                          java.util.Date AV17AlbProfchfrom ,
                                          java.util.Date AV18AlbProfchto ,
                                          String AV21BarColNom ,
                                          short AV20BarManCod1 ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A135BarColNom ,
                                          short A3311BarManCod1 ,
                                          byte A32AlbProEsp ,
                                          String A5253BarAcc ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          int A2395BarAlbExt ,
                                          boolean A14267Fase_618 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[7];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T2.AlbProEst, T2.AlbProPri, T1.BarAlbExt, T3.BarAcc, T3.BarManCod1, T3.BarColNom, T1.AlbProEsp, T2.AlbProfch, T2.GuiRemCli, T1.BarPreKgm, T1.AlbHdrgm2, T1.AlbHdrAnc," ;
      scmdbuf += " T3.BarGraAca, T3.BarAncAca1, T1.AlbProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbProCod = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEsp = 0 or T1.AlbProEsp > 9)");
      addWhere(sWhereString, "(T3.BarAcc <> 'S')");
      addWhere(sWhereString, "(T2.AlbProEst = 1)");
      addWhere(sWhereString, "(T2.AlbProPri = '1')");
      addWhere(sWhereString, "(T1.BarAlbExt = 0)");
      if ( ! (0==AV12CliCodfrom) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodto) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18AlbProfchto)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch <= ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21BarColNom)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV20BarManCod1) )
      {
         addWhere(sWhereString, "(T3.BarManCod1 = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.GuiRemCli, T2.AlbProEst, T1.AlbProCod" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H023I6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV12CliCodfrom ,
                                          int AV15CliCodto ,
                                          java.util.Date AV17AlbProfchfrom ,
                                          java.util.Date AV18AlbProfchto ,
                                          String AV21BarColNom ,
                                          short AV20BarManCod1 ,
                                          int A1243GuiRemCli ,
                                          java.util.Date A34AlbProfch ,
                                          String A135BarColNom ,
                                          short A3311BarManCod1 ,
                                          byte A32AlbProEsp ,
                                          String A5253BarAcc ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          int A2395BarAlbExt ,
                                          boolean A14267Fase_618 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[7];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T2.AlbProEst, T2.AlbProPri, T1.BarAlbExt, T3.BarAcc, T3.BarManCod1, T3.BarColNom, T1.AlbProEsp, T2.AlbProfch, T2.GuiRemCli, T1.BarPreKgm, T1.BarAlbKgmE, T3.BarAncAca1," ;
      scmdbuf += " T1.BarAlbMtrE, T1.AlbProCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod" ;
      scmdbuf += " = T1.AlbProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProEsp = 0 or T1.AlbProEsp > 9)");
      addWhere(sWhereString, "(T3.BarAcc <> 'S')");
      addWhere(sWhereString, "(T2.AlbProEst = 1)");
      addWhere(sWhereString, "(T2.AlbProPri = '1')");
      addWhere(sWhereString, "(T1.BarAlbExt = 0)");
      if ( ! (0==AV12CliCodfrom) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodto) )
      {
         addWhere(sWhereString, "(T2.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18AlbProfchto)) )
      {
         addWhere(sWhereString, "(T2.AlbProfch <= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21BarColNom)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV20BarManCod1) )
      {
         addWhere(sWhereString, "(T3.BarManCod1 = ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T2.GuiRemCli, T2.AlbProEst, T1.AlbProCod" ;
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
            case 3 :
                  return conditional_H023I5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] );
            case 4 :
                  return conditional_H023I6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , ((Number) dynConstraints[5]).shortValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Boolean) dynConstraints[15]).booleanValue() , (String)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H023I2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H023I3", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023I4", "SELECT EmprCod, CliAct, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ?) AND (CliAct = 'S') ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023I5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H023I6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((long[]) buf[15])[0] = rslt.getLong(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((byte[]) buf[18])[0] = rslt.getByte(18);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,2);
               ((long[]) buf[14])[0] = rslt.getLong(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 3);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(17);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[9]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

