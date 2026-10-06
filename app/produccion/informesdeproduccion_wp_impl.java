package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informesdeproduccion_wp_impl extends GXDataArea
{
   public informesdeproduccion_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informesdeproduccion_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informesdeproduccion_wp_impl.class ));
   }

   public informesdeproduccion_wp_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINICIAL") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodinicial1FR0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFINAL") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinal1FR0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod1FR0( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD_TO") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod_to1FR0( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODINICIAL") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodinicial1FR0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCODINICIAL") == 0 )
         {
            hV11MaqCodInicial = httpContext.GetPar( "hV11MaqCodInicial") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodinicial1FR2( hV11MaqCodInicial) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCODFINAL") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodfinal1FR0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCODFINAL") == 0 )
         {
            hV12MaqCodFinal = httpContext.GetPar( "hV12MaqCodFinal") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodfinal1FR2( hV12MaqCodFinal) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod1FR0( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOPECOD") == 0 )
         {
            hV13OpeCod = httpContext.GetPar( "hV13OpeCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvopecod1FR2( hV13OpeCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vOPECOD_TO") == 0 )
         {
            A13748OpeCNom = httpContext.GetPar( "OpeCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvopecod_to1FR0( A13748OpeCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vOPECOD_TO") == 0 )
         {
            hV17OpeCod_to = httpContext.GetPar( "hV17OpeCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvopecod_to1FR2( hV17OpeCod_to) ;
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
      pa1FR2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FR2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informesdeproduccion_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXCELFILENAME", AV14ExcelFilename);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRORMESSAGE", AV15ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCODINICIAL", GXutil.rtrim( AV11MaqCodInicial));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCODFINAL", GXutil.rtrim( AV12MaqCodFinal));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOPECOD", GXutil.ltrim( localUtil.ntoc( AV13OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvOPECOD_TO", GXutil.ltrim( localUtil.ntoc( AV17OpeCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      if ( ! ( WebComp_Wcwcinformesproduccion_tabs == null ) )
      {
         WebComp_Wcwcinformesproduccion_tabs.componentjscripts();
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
         we1FR2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FR2( ) ;
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
      return formatLink("app.produccion.informesdeproduccion_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.InformesdeProduccion_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informes de Produccion", "") ;
   }

   public void wb1FR0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcodinicial_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodinicial_Internalname, httpContext.getMessage( "Maquina Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodinicial_Internalname, hV11MaqCodInicial, GXutil.rtrim( localUtil.format( hV11MaqCodInicial, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodinicial_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodinicial_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcodfinal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcodfinal_Internalname, httpContext.getMessage( "Maquina Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcodfinal_Internalname, hV12MaqCodFinal, GXutil.rtrim( localUtil.format( hV12MaqCodFinal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcodfinal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcodfinal_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Fecha-Hora Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV9HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV9HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fecha-Hora Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV10HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV10HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpecod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpecod_Internalname, httpContext.getMessage( "Operario Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_Internalname, hV13OpeCod, GXutil.rtrim( localUtil.format( hV13OpeCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpecod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOpecod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOpecod_to_Internalname, httpContext.getMessage( "Operario Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOpecod_to_Internalname, hV17OpeCod_to, GXutil.rtrim( localUtil.format( hV17OpeCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOpecod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOpecod_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformetinteresumen_Internalname, "", httpContext.getMessage( "Informe Tinte (Resumen)", ""), bttBtninformetinteresumen_Jsonclick, 5, httpContext.getMessage( "Informe Tinte (Resumen)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINFORMETINTERESUMEN\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformetintedetalle_Internalname, "", httpContext.getMessage( "Informe Tinte (Detalle)", ""), bttBtninformetintedetalle_Jsonclick, 5, httpContext.getMessage( "Informe Tinte (Detalle)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINFORMETINTEDETALLE\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformeporoperario_Internalname, "", httpContext.getMessage( "Informe por Operario (XLS)", ""), bttBtninformeporoperario_Jsonclick, 5, httpContext.getMessage( "Informe por Operario (XLS)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINFORMEPOROPERARIO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformesdeProduccion_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111fr1_client"+"'", TempTags, "", 2, "HLP_Produccion\\InformesdeProduccion_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformesdeProduccion_WP.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformesdeProduccion_WP.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0095"+"", GXutil.rtrim( WebComp_Wcwcinformesproduccion_tabs_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0095"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwcinformesproduccion_tabs), GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0095"+"");
               }
               WebComp_Wcwcinformesproduccion_tabs.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwcinformesproduccion_tabs), GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component)) != 0 )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1FR2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Informes de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FR0( ) ;
   }

   public void ws1FR2( )
   {
      start1FR2( ) ;
      evt1FR2( ) ;
   }

   public void evt1FR2( )
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
                           e121FR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131FR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMETINTERESUMEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInformeTinteResumen' */
                           e141FR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMETINTEDETALLE'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInformeTinteDetalle' */
                           e151FR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMEPOROPERARIO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInformeporOperario' */
                           e161FR2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e171FR2 ();
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
                     if ( nCmpId == 95 )
                     {
                        OldWcwcinformesproduccion_tabs = httpContext.cgiGet( "W0095") ;
                        if ( ( GXutil.len( OldWcwcinformesproduccion_tabs) == 0 ) || ( GXutil.strcmp(OldWcwcinformesproduccion_tabs, WebComp_Wcwcinformesproduccion_tabs_Component) != 0 ) )
                        {
                           WebComp_Wcwcinformesproduccion_tabs = WebUtils.getWebComponent(getClass(), "app." + OldWcwcinformesproduccion_tabs + "_impl", remoteHandle, context);
                           WebComp_Wcwcinformesproduccion_tabs_Component = OldWcwcinformesproduccion_tabs ;
                        }
                        if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
                        {
                           WebComp_Wcwcinformesproduccion_tabs.componentprocess("W0095", "", sEvt);
                        }
                        WebComp_Wcwcinformesproduccion_tabs_Component = OldWcwcinformesproduccion_tabs ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1FR2( )
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

   public void pa1FR2( )
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
            GX_FocusControl = edtavMaqcodinicial_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcodinicial1FR0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodinicial_data1FR0( A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcodinicial_data1FR0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01FR2 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01FR2_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01FR2_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvmaqcodfinal1FR0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcodfinal_data1FR0( A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcodfinal_data1FR0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01FR3 */
      pr_default.execute(1, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H01FR3_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01FR3_A13734MaqCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvopecod1FR0( String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvopecod_data1FR0( A13748OpeCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvopecod_data1FR0( String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor H01FR4 */
      pr_default.execute(2, new Object[] {l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FR4_A13748OpeCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13748OpeCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FR4_A13748OpeCNom[0]);
            gxdynajaxctrldescr.add(H01FR4_A13748OpeCNom[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvopecod_to1FR0( String A13748OpeCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvopecod_to_data1FR0( A13748OpeCNom) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvopecod_to_data1FR0( String A13748OpeCNom )
   {
      l13748OpeCNom = GXutil.concat( GXutil.rtrim( A13748OpeCNom), "%", "") ;
      /* Using cursor H01FR5 */
      pr_default.execute(3, new Object[] {l13748OpeCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FR5_A13748OpeCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13748OpeCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FR5_A13748OpeCNom[0]);
            gxdynajaxctrldescr.add(H01FR5_A13748OpeCNom[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxhcvvmaqcodinicial1FR2( String A13734MaqCDsc )
   {
      /* Using cursor H01FR6 */
      pr_default.execute(4, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A606MaqDsc = H01FR6_A606MaqDsc[0] ;
         n606MaqDsc = H01FR6_n606MaqDsc[0] ;
         A13734MaqCDsc = H01FR6_A13734MaqCDsc[0] ;
         A396EmprCod = H01FR6_A396EmprCod[0] ;
         A602MaqCod = H01FR6_A602MaqCod[0] ;
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void gxhcvvmaqcodfinal1FR2( String A13734MaqCDsc )
   {
      /* Using cursor H01FR7 */
      pr_default.execute(5, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A606MaqDsc = H01FR7_A606MaqDsc[0] ;
         n606MaqDsc = H01FR7_n606MaqDsc[0] ;
         A13734MaqCDsc = H01FR7_A13734MaqCDsc[0] ;
         A396EmprCod = H01FR7_A396EmprCod[0] ;
         A602MaqCod = H01FR7_A602MaqCod[0] ;
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxhcvvopecod1FR2( String A13748OpeCNom )
   {
      /* Using cursor H01FR8 */
      pr_default.execute(6, new Object[] {A13748OpeCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.strcmp(H01FR8_A13748OpeCNom[0], A13748OpeCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13748OpeCNom = H01FR8_A13748OpeCNom[0] ;
            A396EmprCod = H01FR8_A396EmprCod[0] ;
            A652OpeCod = H01FR8_A652OpeCod[0] ;
         }
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxhcvvopecod_to1FR2( String A13748OpeCNom )
   {
      /* Using cursor H01FR9 */
      pr_default.execute(7, new Object[] {A13748OpeCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.strcmp(H01FR9_A13748OpeCNom[0], A13748OpeCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13748OpeCNom = H01FR9_A13748OpeCNom[0] ;
            A396EmprCod = H01FR9_A396EmprCod[0] ;
            A652OpeCod = H01FR9_A652OpeCod[0] ;
         }
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
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
      rf1FR2( ) ;
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

   public void rf1FR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
            {
               WebComp_Wcwcinformesproduccion_tabs.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e171FR2 ();
         wb1FR0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1FR2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1FR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121FR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV6EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         hV11MaqCodInicial = httpContext.cgiGet( edtavMaqcodinicial_Internalname) ;
         if ( (GXutil.strcmp("", hV11MaqCodInicial)==0) )
         {
            AV11MaqCodInicial = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodInicial", AV11MaqCodInicial);
         }
         else
         {
            A13734MaqCDsc = hV11MaqCodInicial ;
            /* Using cursor H01FR10 */
            pr_default.execute(8, new Object[] {A13734MaqCDsc});
            AV11MaqCodInicial = H01FR10_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODINICIAL");
                  GX_FocusControl = edtavMaqcodinicial_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodInicial", hV11MaqCodInicial);
         hV12MaqCodFinal = httpContext.cgiGet( edtavMaqcodfinal_Internalname) ;
         if ( (GXutil.strcmp("", hV12MaqCodFinal)==0) )
         {
            AV12MaqCodFinal = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodFinal", AV12MaqCodFinal);
         }
         else
         {
            A13734MaqCDsc = hV12MaqCodFinal ;
            /* Using cursor H01FR11 */
            pr_default.execute(9, new Object[] {A13734MaqCDsc});
            AV12MaqCodFinal = H01FR11_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODFINAL");
                  GX_FocusControl = edtavMaqcodfinal_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodFinal", hV12MaqCodFinal);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV9HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV10HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         hV13OpeCod = httpContext.cgiGet( edtavOpecod_Internalname) ;
         if ( (GXutil.strcmp("", hV13OpeCod)==0) )
         {
            AV13OpeCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0));
         }
         else
         {
            A13748OpeCNom = hV13OpeCod ;
            /* Using cursor H01FR12 */
            pr_default.execute(10, new Object[] {A13748OpeCNom});
            AV13OpeCod = H01FR12_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD");
                  GX_FocusControl = edtavOpecod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
         hV17OpeCod_to = httpContext.cgiGet( edtavOpecod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV17OpeCod_to)==0) )
         {
            AV17OpeCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17OpeCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OpeCod_to), 6, 0));
         }
         else
         {
            A13748OpeCNom = hV17OpeCod_to ;
            /* Using cursor H01FR13 */
            pr_default.execute(11, new Object[] {A13748OpeCNom});
            AV17OpeCod_to = H01FR13_A652OpeCod[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD_TO");
                  GX_FocusControl = edtavOpecod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV17OpeCod_to", hV17OpeCod_to);
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
      e121FR2 ();
      if (returnInSub) return;
   }

   public void e121FR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV5Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informesdeproduccion_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV5Station = GXt_char1 ;
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV5Station, GXv_char2, GXv_char3, GXv_char4) ;
      informesdeproduccion_wp_impl.this.AV6EmprCod = GXv_char2[0] ;
      informesdeproduccion_wp_impl.this.AV7EmprNom = GXv_char3[0] ;
      informesdeproduccion_wp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      AV9HisProDTI = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV10HisProDTF = GXutil.now( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcwcinformesproduccion_tabs = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwcinformesproduccion_tabs_Component), GXutil.lower( "WCInformesProduccion_tabs")) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs = WebUtils.getWebComponent(getClass(), "app.wcinformesproduccion_tabs_impl", remoteHandle, context);
         WebComp_Wcwcinformesproduccion_tabs_Component = "WCInformesProduccion_tabs" ;
      }
      if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
      {
         WebComp_Wcwcinformesproduccion_tabs.setjustcreated();
         WebComp_Wcwcinformesproduccion_tabs.componentprepare(new Object[] {"W0095","",AV6EmprCod,AV11MaqCodInicial,AV12MaqCodFinal,AV9HisProDTI,AV10HisProDTF});
         WebComp_Wcwcinformesproduccion_tabs.componentbind(new Object[] {"","vMAQCODINICIAL","vMAQCODFINAL","vHISPRODTI","vHISPRODTF"});
      }
   }

   public void e131FR2( )
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

   public void e141FR2( )
   {
      /* 'DoInformeTinteResumen' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rprdt11df", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV11MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV12MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10HisProDTF)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""))),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzzzzzzz", ""))),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(999999,9,0))}, new String[] {"EmprCod","PMaqCod","UMaqCod","Hisprodti","Hisprodtf","TipMaqCod","ArtCodi","ArtCodf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf"}) , new Object[] {"AV6EmprCod","AV11MaqCodInicial","AV12MaqCodFinal","AV9HisProDTI","AV10HisProDTF","","","","","","",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e151FR2( )
   {
      /* 'DoInformeTinteDetalle' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.rprdt10", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV11MaqCodInicial)),GXutil.URLEncode(GXutil.rtrim(AV12MaqCodFinal)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV9HisProDTI)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV10HisProDTF)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzzzzzzzzzz", ""))),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "zzzzzzzzzzzzz", ""))),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(999999,9,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"EmprCod","PMaqCod","UMaqCod","hISPRODTI","hISPRODTF","TipMaqCod","Artcodi","Artcodf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf","Diahorafin"}) , new Object[] {"AV6EmprCod","AV11MaqCodInicial","AV12MaqCodFinal","AV9HisProDTI","AV10HisProDTF","","","","","","","",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e161FR2( )
   {
      /* 'DoInformeporOperario' Routine */
      returnInSub = false ;
      AV16Opecod_to2 = ((0==AV17OpeCod_to) ? 999999 : AV17OpeCod_to) ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_dtime5[0] = AV9HisProDTI ;
      GXv_char3[0] = AV11MaqCodInicial ;
      GXv_int6[0] = AV13OpeCod ;
      GXv_dtime7[0] = AV10HisProDTF ;
      GXv_char2[0] = AV12MaqCodFinal ;
      GXv_int8[0] = AV16Opecod_to2 ;
      GXv_char9[0] = "" ;
      GXv_char10[0] = "" ;
      GXv_char11[0] = httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") ;
      GXv_char12[0] = "" ;
      GXv_char13[0] = httpContext.getMessage( "zzzzzzzzzzzzz", "") ;
      GXv_int14[0] = 0 ;
      GXv_int15[0] = 999999 ;
      GXv_char16[0] = AV14ExcelFilename ;
      GXv_char17[0] = AV15ErrorMessage ;
      new app.produccion.informeproduccionporoperario(remoteHandle, context).execute( GXv_char4, GXv_dtime5, GXv_char3, GXv_int6, GXv_dtime7, GXv_char2, GXv_int8, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_int14, GXv_int15, GXv_char16, GXv_char17) ;
      informesdeproduccion_wp_impl.this.AV6EmprCod = GXv_char4[0] ;
      informesdeproduccion_wp_impl.this.AV9HisProDTI = GXv_dtime5[0] ;
      informesdeproduccion_wp_impl.this.AV11MaqCodInicial = GXv_char3[0] ;
      informesdeproduccion_wp_impl.this.AV13OpeCod = GXv_int6[0] ;
      informesdeproduccion_wp_impl.this.AV10HisProDTF = GXv_dtime7[0] ;
      informesdeproduccion_wp_impl.this.AV12MaqCodFinal = GXv_char2[0] ;
      informesdeproduccion_wp_impl.this.AV16Opecod_to2 = GXv_int8[0] ;
      informesdeproduccion_wp_impl.this.AV14ExcelFilename = GXv_char16[0] ;
      informesdeproduccion_wp_impl.this.AV15ErrorMessage = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9HisProDTI", localUtil.ttoc( AV9HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodInicial", AV11MaqCodInicial);
      httpContext.ajax_rsp_assign_attri("", false, "AV13OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OpeCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10HisProDTF", localUtil.ttoc( AV10HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodFinal", AV12MaqCodFinal);
      httpContext.ajax_rsp_assign_attri("", false, "AV14ExcelFilename", AV14ExcelFilename);
      httpContext.ajax_rsp_assign_attri("", false, "AV15ErrorMessage", AV15ErrorMessage);
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e171FR2( )
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
      pa1FR2( ) ;
      ws1FR2( ) ;
      we1FR2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcwcinformesproduccion_tabs == null ) )
      {
         if ( GXutil.len( WebComp_Wcwcinformesproduccion_tabs_Component) != 0 )
         {
            WebComp_Wcwcinformesproduccion_tabs.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016431327", true, true);
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
      httpContext.AddJavascriptSource("produccion/informesdeproduccion_wp.js", "?202661016431327", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavMaqcodinicial_Internalname = "vMAQCODINICIAL" ;
      edtavMaqcodfinal_Internalname = "vMAQCODFINAL" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      edtavOpecod_Internalname = "vOPECOD" ;
      edtavOpecod_to_Internalname = "vOPECOD_TO" ;
      bttBtninformetinteresumen_Internalname = "BTNINFORMETINTERESUMEN" ;
      bttBtninformetintedetalle_Internalname = "BTNINFORMETINTEDETALLE" ;
      bttBtninformeporoperario_Internalname = "BTNINFORMEPOROPERARIO" ;
      divTable_masopciones_Internalname = "TABLE_MASOPCIONES" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      edtavOpecod_to_Jsonclick = "" ;
      edtavOpecod_to_Enabled = 1 ;
      edtavOpecod_Jsonclick = "" ;
      edtavOpecod_Enabled = 1 ;
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavMaqcodfinal_Jsonclick = "" ;
      edtavMaqcodfinal_Enabled = 1 ;
      edtavMaqcodinicial_Jsonclick = "" ;
      edtavMaqcodinicial_Enabled = 1 ;
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
      Dvpanel_panel_filtrosmas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Iconposition = "Right" ;
      Dvpanel_panel_filtrosmas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panel_filtrosmas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Title = httpContext.getMessage( "Otros informes", "") ;
      Dvpanel_panel_filtrosmas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtrosmas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtrosmas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtrosmas_Width = "100%" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Informes de Produccion", "") );
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

   public void validv_Maqcodinicial( )
   {
      if ( (GXutil.strcmp("", hV11MaqCodInicial)==0) )
      {
         AV11MaqCodInicial = "" ;
      }
      else
      {
         A13734MaqCDsc = hV11MaqCodInicial ;
         /* Using cursor H01FR14 */
         pr_default.execute(12, new Object[] {A13734MaqCDsc});
         AV11MaqCodInicial = H01FR14_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(12) == 101) ) )
         {
            pr_default.readNext(12);
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODINICIAL");
               GX_FocusControl = edtavMaqcodinicial_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(12);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodInicial", hV11MaqCodInicial);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV11MaqCodInicial", GXutil.rtrim( AV11MaqCodInicial));
      httpContext.ajax_rsp_assign_attri("", false, "hV11MaqCodInicial", hV11MaqCodInicial);
   }

   public void validv_Maqcodfinal( )
   {
      if ( (GXutil.strcmp("", hV12MaqCodFinal)==0) )
      {
         AV12MaqCodFinal = "" ;
      }
      else
      {
         A13734MaqCDsc = hV12MaqCodFinal ;
         /* Using cursor H01FR15 */
         pr_default.execute(13, new Object[] {A13734MaqCDsc});
         AV12MaqCodFinal = H01FR15_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(13) == 101) ) )
         {
            pr_default.readNext(13);
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCODFINAL");
               GX_FocusControl = edtavMaqcodfinal_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(13);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodFinal", hV12MaqCodFinal);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaqCodFinal", GXutil.rtrim( AV12MaqCodFinal));
      httpContext.ajax_rsp_assign_attri("", false, "hV12MaqCodFinal", hV12MaqCodFinal);
   }

   public void validv_Opecod( )
   {
      if ( (GXutil.strcmp("", hV13OpeCod)==0) )
      {
         AV13OpeCod = 0 ;
      }
      else
      {
         A13748OpeCNom = hV13OpeCod ;
         /* Using cursor H01FR16 */
         pr_default.execute(14, new Object[] {A13748OpeCNom});
         AV13OpeCod = H01FR16_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD");
               GX_FocusControl = edtavOpecod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV13OpeCod", GXutil.ltrim( localUtil.ntoc( AV13OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV13OpeCod", hV13OpeCod);
   }

   public void validv_Opecod_to( )
   {
      if ( (GXutil.strcmp("", hV17OpeCod_to)==0) )
      {
         AV17OpeCod_to = 0 ;
      }
      else
      {
         A13748OpeCNom = hV17OpeCod_to ;
         /* Using cursor H01FR17 */
         pr_default.execute(15, new Object[] {A13748OpeCNom});
         AV17OpeCod_to = H01FR17_A652OpeCod[0] ;
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo + Nombre", "")}), 1, "vOPECOD_TO");
               GX_FocusControl = edtavOpecod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV17OpeCod_to", hV17OpeCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV17OpeCod_to", GXutil.ltrim( localUtil.ntoc( AV17OpeCod_to, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV17OpeCod_to", hV17OpeCod_to);
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
      setEventMetadata("'DORESULTADOS'","{handler:'e111FR1',iparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCWCINFORMESPRODUCCION_TABS'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131FR2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOINFORMETINTERESUMEN'","{handler:'e141FR2',iparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("'DOINFORMETINTERESUMEN'",",oparms:[{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOINFORMETINTEDETALLE'","{handler:'e151FR2',iparms:[{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'}]");
      setEventMetadata("'DOINFORMETINTEDETALLE'",",oparms:[{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOINFORMEPOROPERARIO'","{handler:'e161FR2',iparms:[{av:'AV17OpeCod_to',fld:'vOPECOD_TO',pic:'ZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV14ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV15ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("'DOINFORMEPOROPERARIO'",",oparms:[{av:'AV15ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV14ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'AV10HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'AV9HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_MAQCODINICIAL","{handler:'validv_Maqcodinicial',iparms:[{av:'hV11MaqCodInicial'},{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''}]");
      setEventMetadata("VALIDV_MAQCODINICIAL",",oparms:[{av:'AV11MaqCodInicial',fld:'vMAQCODINICIAL',pic:''},{av:'hV11MaqCodInicial'}]}");
      setEventMetadata("VALIDV_MAQCODFINAL","{handler:'validv_Maqcodfinal',iparms:[{av:'hV12MaqCodFinal'},{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''}]");
      setEventMetadata("VALIDV_MAQCODFINAL",",oparms:[{av:'AV12MaqCodFinal',fld:'vMAQCODFINAL',pic:''},{av:'hV12MaqCodFinal'}]}");
      setEventMetadata("VALIDV_OPECOD","{handler:'validv_Opecod',iparms:[{av:'hV13OpeCod'},{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_OPECOD",",oparms:[{av:'AV13OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'hV13OpeCod'}]}");
      setEventMetadata("VALIDV_OPECOD_TO","{handler:'validv_Opecod_to',iparms:[{av:'hV17OpeCod_to'},{av:'AV17OpeCod_to',fld:'vOPECOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_OPECOD_TO",",oparms:[{av:'AV17OpeCod_to',fld:'vOPECOD_TO',pic:'ZZZZZ9'},{av:'hV17OpeCod_to'}]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13734MaqCDsc = "" ;
      A13748OpeCNom = "" ;
      hV11MaqCodInicial = "" ;
      hV12MaqCodFinal = "" ;
      hV13OpeCod = "" ;
      hV17OpeCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV6EmprCod = "" ;
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      AV11MaqCodInicial = "" ;
      AV12MaqCodFinal = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV9HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV10HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      bttBtninformetinteresumen_Jsonclick = "" ;
      bttBtninformetintedetalle_Jsonclick = "" ;
      bttBtninformeporoperario_Jsonclick = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcwcinformesproduccion_tabs_Component = "" ;
      OldWcwcinformesproduccion_tabs = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H01FR2_A13734MaqCDsc = new String[] {""} ;
      H01FR3_A13734MaqCDsc = new String[] {""} ;
      l13748OpeCNom = "" ;
      H01FR4_A13748OpeCNom = new String[] {""} ;
      H01FR5_A13748OpeCNom = new String[] {""} ;
      H01FR6_A606MaqDsc = new String[] {""} ;
      H01FR6_n606MaqDsc = new boolean[] {false} ;
      H01FR6_A13734MaqCDsc = new String[] {""} ;
      H01FR6_A396EmprCod = new String[] {""} ;
      H01FR6_A602MaqCod = new String[] {""} ;
      A606MaqDsc = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      H01FR7_A606MaqDsc = new String[] {""} ;
      H01FR7_n606MaqDsc = new boolean[] {false} ;
      H01FR7_A13734MaqCDsc = new String[] {""} ;
      H01FR7_A396EmprCod = new String[] {""} ;
      H01FR7_A602MaqCod = new String[] {""} ;
      H01FR8_A13748OpeCNom = new String[] {""} ;
      H01FR8_A396EmprCod = new String[] {""} ;
      H01FR8_A652OpeCod = new int[1] ;
      H01FR9_A13748OpeCNom = new String[] {""} ;
      H01FR9_A396EmprCod = new String[] {""} ;
      H01FR9_A652OpeCod = new int[1] ;
      H01FR10_A606MaqDsc = new String[] {""} ;
      H01FR10_n606MaqDsc = new boolean[] {false} ;
      H01FR10_A13734MaqCDsc = new String[] {""} ;
      H01FR10_A396EmprCod = new String[] {""} ;
      H01FR10_A602MaqCod = new String[] {""} ;
      H01FR11_A606MaqDsc = new String[] {""} ;
      H01FR11_n606MaqDsc = new boolean[] {false} ;
      H01FR11_A13734MaqCDsc = new String[] {""} ;
      H01FR11_A396EmprCod = new String[] {""} ;
      H01FR11_A602MaqCod = new String[] {""} ;
      H01FR12_A13748OpeCNom = new String[] {""} ;
      H01FR12_A396EmprCod = new String[] {""} ;
      H01FR12_A652OpeCod = new int[1] ;
      H01FR13_A13748OpeCNom = new String[] {""} ;
      H01FR13_A396EmprCod = new String[] {""} ;
      H01FR13_A652OpeCod = new int[1] ;
      AV5Station = "" ;
      GXt_char1 = "" ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_dtime5 = new java.util.Date[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01FR14_A606MaqDsc = new String[] {""} ;
      H01FR14_n606MaqDsc = new boolean[] {false} ;
      H01FR14_A13734MaqCDsc = new String[] {""} ;
      H01FR14_A396EmprCod = new String[] {""} ;
      H01FR14_A602MaqCod = new String[] {""} ;
      ZV11MaqCodInicial = "" ;
      ZhV11MaqCodInicial = "" ;
      H01FR15_A606MaqDsc = new String[] {""} ;
      H01FR15_n606MaqDsc = new boolean[] {false} ;
      H01FR15_A13734MaqCDsc = new String[] {""} ;
      H01FR15_A396EmprCod = new String[] {""} ;
      H01FR15_A602MaqCod = new String[] {""} ;
      ZV12MaqCodFinal = "" ;
      ZhV12MaqCodFinal = "" ;
      H01FR16_A13748OpeCNom = new String[] {""} ;
      H01FR16_A396EmprCod = new String[] {""} ;
      H01FR16_A652OpeCod = new int[1] ;
      ZhV13OpeCod = "" ;
      H01FR17_A13748OpeCNom = new String[] {""} ;
      H01FR17_A396EmprCod = new String[] {""} ;
      H01FR17_A652OpeCod = new int[1] ;
      ZhV17OpeCod_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informesdeproduccion_wp__default(),
         new Object[] {
             new Object[] {
            H01FR2_A13734MaqCDsc
            }
            , new Object[] {
            H01FR3_A13734MaqCDsc
            }
            , new Object[] {
            H01FR4_A13748OpeCNom
            }
            , new Object[] {
            H01FR5_A13748OpeCNom
            }
            , new Object[] {
            H01FR6_A606MaqDsc, H01FR6_n606MaqDsc, H01FR6_A13734MaqCDsc, H01FR6_A396EmprCod, H01FR6_A602MaqCod
            }
            , new Object[] {
            H01FR7_A606MaqDsc, H01FR7_n606MaqDsc, H01FR7_A13734MaqCDsc, H01FR7_A396EmprCod, H01FR7_A602MaqCod
            }
            , new Object[] {
            H01FR8_A13748OpeCNom, H01FR8_A396EmprCod, H01FR8_A652OpeCod
            }
            , new Object[] {
            H01FR9_A13748OpeCNom, H01FR9_A396EmprCod, H01FR9_A652OpeCod
            }
            , new Object[] {
            H01FR10_A606MaqDsc, H01FR10_n606MaqDsc, H01FR10_A13734MaqCDsc, H01FR10_A396EmprCod, H01FR10_A602MaqCod
            }
            , new Object[] {
            H01FR11_A606MaqDsc, H01FR11_n606MaqDsc, H01FR11_A13734MaqCDsc, H01FR11_A396EmprCod, H01FR11_A602MaqCod
            }
            , new Object[] {
            H01FR12_A13748OpeCNom, H01FR12_A396EmprCod, H01FR12_A652OpeCod
            }
            , new Object[] {
            H01FR13_A13748OpeCNom, H01FR13_A396EmprCod, H01FR13_A652OpeCod
            }
            , new Object[] {
            H01FR14_A606MaqDsc, H01FR14_n606MaqDsc, H01FR14_A13734MaqCDsc, H01FR14_A396EmprCod, H01FR14_A602MaqCod
            }
            , new Object[] {
            H01FR15_A606MaqDsc, H01FR15_n606MaqDsc, H01FR15_A13734MaqCDsc, H01FR15_A396EmprCod, H01FR15_A602MaqCod
            }
            , new Object[] {
            H01FR16_A13748OpeCNom, H01FR16_A396EmprCod, H01FR16_A652OpeCod
            }
            , new Object[] {
            H01FR17_A13748OpeCNom, H01FR17_A396EmprCod, H01FR17_A652OpeCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcwcinformesproduccion_tabs = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV13OpeCod ;
   private int AV17OpeCod_to ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavMaqcodinicial_Enabled ;
   private int edtavMaqcodfinal_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int edtavOpecod_Enabled ;
   private int edtavOpecod_to_Enabled ;
   private int gxdynajaxindex ;
   private int A652OpeCod ;
   private int AV16Opecod_to2 ;
   private int GXv_int6[] ;
   private int GXv_int8[] ;
   private int GXv_int14[] ;
   private int GXv_int15[] ;
   private int idxLst ;
   private int ZV13OpeCod ;
   private int ZV17OpeCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV6EmprCod ;
   private String AV11MaqCodInicial ;
   private String AV12MaqCodFinal ;
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
   private String edtavMaqcodinicial_Internalname ;
   private String TempTags ;
   private String edtavMaqcodinicial_Jsonclick ;
   private String edtavMaqcodfinal_Internalname ;
   private String edtavMaqcodfinal_Jsonclick ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divTable_masopciones_Internalname ;
   private String edtavOpecod_Internalname ;
   private String edtavOpecod_Jsonclick ;
   private String edtavOpecod_to_Internalname ;
   private String edtavOpecod_to_Jsonclick ;
   private String bttBtninformetinteresumen_Internalname ;
   private String bttBtninformetinteresumen_Jsonclick ;
   private String bttBtninformetintedetalle_Internalname ;
   private String bttBtninformetintedetalle_Jsonclick ;
   private String bttBtninformeporoperario_Internalname ;
   private String bttBtninformeporoperario_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcwcinformesproduccion_tabs_Component ;
   private String OldWcwcinformesproduccion_tabs ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A606MaqDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV5Station ;
   private String GXt_char1 ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String ZV11MaqCodInicial ;
   private String ZV12MaqCodFinal ;
   private java.util.Date AV9HisProDTI ;
   private java.util.Date AV10HisProDTF ;
   private java.util.Date GXv_dtime5[] ;
   private java.util.Date GXv_dtime7[] ;
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
   private boolean n606MaqDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcwcinformesproduccion_tabs ;
   private String A13734MaqCDsc ;
   private String A13748OpeCNom ;
   private String hV11MaqCodInicial ;
   private String hV12MaqCodFinal ;
   private String hV13OpeCod ;
   private String hV17OpeCod_to ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private String l13734MaqCDsc ;
   private String l13748OpeCNom ;
   private String ZhV11MaqCodInicial ;
   private String ZhV12MaqCodFinal ;
   private String ZhV13OpeCod ;
   private String ZhV17OpeCod_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwcinformesproduccion_tabs ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private IDataStoreProvider pr_default ;
   private String[] H01FR2_A13734MaqCDsc ;
   private String[] H01FR3_A13734MaqCDsc ;
   private String[] H01FR4_A13748OpeCNom ;
   private String[] H01FR5_A13748OpeCNom ;
   private String[] H01FR6_A606MaqDsc ;
   private boolean[] H01FR6_n606MaqDsc ;
   private String[] H01FR6_A13734MaqCDsc ;
   private String[] H01FR6_A396EmprCod ;
   private String[] H01FR6_A602MaqCod ;
   private String[] H01FR7_A606MaqDsc ;
   private boolean[] H01FR7_n606MaqDsc ;
   private String[] H01FR7_A13734MaqCDsc ;
   private String[] H01FR7_A396EmprCod ;
   private String[] H01FR7_A602MaqCod ;
   private String[] H01FR8_A13748OpeCNom ;
   private String[] H01FR8_A396EmprCod ;
   private int[] H01FR8_A652OpeCod ;
   private String[] H01FR9_A13748OpeCNom ;
   private String[] H01FR9_A396EmprCod ;
   private int[] H01FR9_A652OpeCod ;
   private String[] H01FR10_A606MaqDsc ;
   private boolean[] H01FR10_n606MaqDsc ;
   private String[] H01FR10_A13734MaqCDsc ;
   private String[] H01FR10_A396EmprCod ;
   private String[] H01FR10_A602MaqCod ;
   private String[] H01FR11_A606MaqDsc ;
   private boolean[] H01FR11_n606MaqDsc ;
   private String[] H01FR11_A13734MaqCDsc ;
   private String[] H01FR11_A396EmprCod ;
   private String[] H01FR11_A602MaqCod ;
   private String[] H01FR12_A13748OpeCNom ;
   private String[] H01FR12_A396EmprCod ;
   private int[] H01FR12_A652OpeCod ;
   private String[] H01FR13_A13748OpeCNom ;
   private String[] H01FR13_A396EmprCod ;
   private int[] H01FR13_A652OpeCod ;
   private String[] H01FR14_A606MaqDsc ;
   private boolean[] H01FR14_n606MaqDsc ;
   private String[] H01FR14_A13734MaqCDsc ;
   private String[] H01FR14_A396EmprCod ;
   private String[] H01FR14_A602MaqCod ;
   private String[] H01FR15_A606MaqDsc ;
   private boolean[] H01FR15_n606MaqDsc ;
   private String[] H01FR15_A13734MaqCDsc ;
   private String[] H01FR15_A396EmprCod ;
   private String[] H01FR15_A602MaqCod ;
   private String[] H01FR16_A13748OpeCNom ;
   private String[] H01FR16_A396EmprCod ;
   private int[] H01FR16_A652OpeCod ;
   private String[] H01FR17_A13748OpeCNom ;
   private String[] H01FR17_A396EmprCod ;
   private int[] H01FR17_A652OpeCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class informesdeproduccion_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FR2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL)))) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL)))) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom FROM TXPOPERAR WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR6", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR7", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR10", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR11", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR14", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR15", "SELECT MaqDsc, RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (Not (rtrim(MaqDsc) IS NULL AND NOT(MaqDsc IS NULL))) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR16", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FR17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) AS OpeCNom, EmprCod, OpeCod FROM TXPOPERAR WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(OpeCod,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( OpeNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

