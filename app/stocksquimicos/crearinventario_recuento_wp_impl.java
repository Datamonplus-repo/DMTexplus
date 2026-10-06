package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class crearinventario_recuento_wp_impl extends GXDataArea
{
   public crearinventario_recuento_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public crearinventario_recuento_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( crearinventario_recuento_wp_impl.class ));
   }

   public crearinventario_recuento_wp_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum1A30( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM_TO") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum_to1A30( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnum1A30( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM_TO") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnum_to1A30( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum1A30( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUM") == 0 )
         {
            hV21PrdNum = httpContext.GetPar( "hV21PrdNum") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnum1A32( hV21PrdNum) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUM_TO") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnum_to1A30( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUM_TO") == 0 )
         {
            hV22PrdNum_to = httpContext.GetPar( "hV22PrdNum_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnum_to1A32( hV22PrdNum_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnum1A30( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRVNUM") == 0 )
         {
            hV19PrvNum = httpContext.GetPar( "hV19PrvNum") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprvnum1A32( hV19PrvNum) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRVNUM_TO") == 0 )
         {
            A13719PrvNNom = httpContext.GetPar( "PrvNNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprvnum_to1A30( A13719PrvNNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRVNUM_TO") == 0 )
         {
            hV20PrvNum_to = httpContext.GetPar( "hV20PrvNum_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprvnum_to1A32( hV20PrvNum_to) ;
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
      pa1A32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1A32( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.crearinventario_recuento_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECREC", localUtil.dtoc( AV11FecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV6EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFORME", GXutil.ltrim( localUtil.ntoc( AV7Informe, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV18UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV16Station));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUM", GXutil.rtrim( AV21PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUM_TO", GXutil.rtrim( AV22PrdNum_to));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRVNUM", GXutil.ltrim( localUtil.ntoc( AV19PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV20PrvNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Title", GXutil.rtrim( Dvelop_confirmpanel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_resultado_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultado_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultado_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_resultado_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_resultado_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_resultado_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Result", GXutil.rtrim( Dvelop_confirmpanel_resultado_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_RESULTADO_Result", GXutil.rtrim( Dvelop_confirmpanel_resultado_Result));
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
      if ( ! ( WebComp_Wccrearinventario_recuento_wc == null ) )
      {
         WebComp_Wccrearinventario_recuento_wc.componentjscripts();
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
         we1A32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1A32( ) ;
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
      return formatLink("app.stocksquimicos.crearinventario_recuento_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.CrearInventario_recuento_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Crear Inventario (recuento)", "") ;
   }

   public void wb1A30( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_Internalname, httpContext.getMessage( "Producto Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, hV21PrdNum, GXutil.rtrim( localUtil.format( hV21PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnum_to_Internalname, httpContext.getMessage( "Producto Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_to_Internalname, hV22PrdNum_to, GXutil.rtrim( localUtil.format( hV22PrdNum_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnum_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_Internalname, httpContext.getMessage( "Proveedor Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, hV19PrvNum, GXutil.rtrim( localUtil.format( hV19PrvNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrvnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_to_Internalname, httpContext.getMessage( "Proveedor Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_to_Internalname, hV20PrvNum_to, GXutil.rtrim( localUtil.format( hV20PrvNum_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_to_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfechr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfechr_Internalname, httpContext.getMessage( "Fecha-Hora Recuento", ""), "col-sm-5 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-7 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfechr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfechr_Internalname, localUtil.ttoc( AV15Recfechr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV15Recfechr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfechr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfechr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfechr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfechr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultado_Internalname, "", httpContext.getMessage( "Crear Inventario", ""), bttBtnresultado_Jsonclick, 7, httpContext.getMessage( "Crear Inventario", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111a31_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBp.render(context, "gxprogressindicator", Bp_Internalname, "BPContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTexto1_Internalname, lblTexto1_Caption, "", "", lblTexto1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-size:"+GXutil.str( lblTexto1_Fontsize, 3, 0)+"pt;", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Crear Inventario", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\CrearInventario_recuento_WP.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0089"+"", GXutil.rtrim( WebComp_Wccrearinventario_recuento_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0089"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWccrearinventario_recuento_wc), GXutil.lower( WebComp_Wccrearinventario_recuento_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
               }
               WebComp_Wccrearinventario_recuento_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWccrearinventario_recuento_wc), GXutil.lower( WebComp_Wccrearinventario_recuento_wc_Component)) != 0 )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         wb_table1_93_1A32( true) ;
      }
      else
      {
         wb_table1_93_1A32( false) ;
      }
      return  ;
   }

   public void wb_table1_93_1A32e( boolean wbgen )
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

   public void start1A32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Crear Inventario (recuento)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1A30( ) ;
   }

   public void ws1A32( )
   {
      start1A32( ) ;
      evt1A32( ) ;
   }

   public void evt1A32( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_RESULTADO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141A32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151A32 ();
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
                     if ( nCmpId == 89 )
                     {
                        OldWccrearinventario_recuento_wc = httpContext.cgiGet( "W0089") ;
                        if ( ( GXutil.len( OldWccrearinventario_recuento_wc) == 0 ) || ( GXutil.strcmp(OldWccrearinventario_recuento_wc, WebComp_Wccrearinventario_recuento_wc_Component) != 0 ) )
                        {
                           WebComp_Wccrearinventario_recuento_wc = WebUtils.getWebComponent(getClass(), "app." + OldWccrearinventario_recuento_wc + "_impl", remoteHandle, context);
                           WebComp_Wccrearinventario_recuento_wc_Component = OldWccrearinventario_recuento_wc ;
                        }
                        if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
                        {
                           WebComp_Wccrearinventario_recuento_wc.componentprocess("W0089", "", sEvt);
                        }
                        WebComp_Wccrearinventario_recuento_wc_Component = OldWccrearinventario_recuento_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1A32( )
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

   public void pa1A32( )
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
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvprdnum1A30( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnum_data1A30( A13747PrdCDsc) ;
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

   protected void gxsgvvprdnum_data1A30( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01A32 */
      pr_default.execute(0, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01A32_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01A32_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H01A32_A13747PrdCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvprdnum_to1A30( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnum_to_data1A30( A13747PrdCDsc) ;
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

   protected void gxsgvvprdnum_to_data1A30( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01A33 */
      pr_default.execute(1, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01A33_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01A33_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H01A33_A13747PrdCDsc[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvprvnum1A30( String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprvnum_data1A30( A13719PrvNNom) ;
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

   protected void gxsgvvprvnum_data1A30( String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H01A34 */
      pr_default.execute(2, new Object[] {l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01A34_A13719PrvNNom[0]) , GXutil.padr( "%" + GXutil.upper( A13719PrvNNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01A34_A13719PrvNNom[0]);
            gxdynajaxctrldescr.add(H01A34_A13719PrvNNom[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvprvnum_to1A30( String A13719PrvNNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprvnum_to_data1A30( A13719PrvNNom) ;
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

   protected void gxsgvvprvnum_to_data1A30( String A13719PrvNNom )
   {
      l13719PrvNNom = GXutil.concat( GXutil.rtrim( A13719PrvNNom), "%", "") ;
      /* Using cursor H01A35 */
      pr_default.execute(3, new Object[] {l13719PrvNNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01A35_A13719PrvNNom[0]) , GXutil.padr( "%" + GXutil.upper( A13719PrvNNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01A35_A13719PrvNNom[0]);
            gxdynajaxctrldescr.add(H01A35_A13719PrvNNom[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxhcvvprdnum1A32( String A13747PrdCDsc )
   {
      /* Using cursor H01A36 */
      pr_default.execute(4, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.strcmp(H01A36_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H01A36_A13747PrdCDsc[0] ;
            A396EmprCod = H01A36_A396EmprCod[0] ;
            A719PrdNum = H01A36_A719PrdNum[0] ;
         }
         pr_default.readNext(4);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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

   public void gxhcvvprdnum_to1A32( String A13747PrdCDsc )
   {
      /* Using cursor H01A37 */
      pr_default.execute(5, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.strcmp(H01A37_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H01A37_A13747PrdCDsc[0] ;
            A396EmprCod = H01A37_A396EmprCod[0] ;
            A719PrdNum = H01A37_A719PrdNum[0] ;
         }
         pr_default.readNext(5);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A719PrdNum))+"\"") ;
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

   public void gxhcvvprvnum1A32( String A13719PrvNNom )
   {
      /* Using cursor H01A38 */
      pr_default.execute(6, new Object[] {A13719PrvNNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.strcmp(H01A38_A13719PrvNNom[0], A13719PrvNNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13719PrvNNom = H01A38_A13719PrvNNom[0] ;
            A396EmprCod = H01A38_A396EmprCod[0] ;
            A795PrvNum = H01A38_A795PrvNum[0] ;
         }
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcvvprvnum_to1A32( String A13719PrvNNom )
   {
      /* Using cursor H01A39 */
      pr_default.execute(7, new Object[] {A13719PrvNNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.strcmp(H01A39_A13719PrvNNom[0], A13719PrvNNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13719PrvNNom = H01A39_A13719PrvNNom[0] ;
            A396EmprCod = H01A39_A396EmprCod[0] ;
            A795PrvNum = H01A39_A795PrvNum[0] ;
         }
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      rf1A32( ) ;
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
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
   }

   public void rf1A32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
            {
               WebComp_Wccrearinventario_recuento_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151A32 ();
         wb1A30( ) ;
      }
   }

   public void send_integrity_lvl_hashes1A32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1A30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131A32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV10Texto = httpContext.cgiGet( "vTEXTO") ;
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
         Dvelop_confirmpanel_resultado_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Title") ;
         Dvelop_confirmpanel_resultado_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Confirmationtext") ;
         Dvelop_confirmpanel_resultado_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_resultado_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Nobuttoncaption") ;
         Dvelop_confirmpanel_resultado_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_resultado_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Yesbuttonposition") ;
         Dvelop_confirmpanel_resultado_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Confirmtype") ;
         Dvelop_confirmpanel_resultado_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_RESULTADO_Result") ;
         /* Read variables values. */
         hV21PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         if ( (GXutil.strcmp("", hV21PrdNum)==0) )
         {
            AV21PrdNum = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", AV21PrdNum);
         }
         else
         {
            A13747PrdCDsc = hV21PrdNum ;
            /* Using cursor H01A310 */
            pr_default.execute(8, new Object[] {A13747PrdCDsc});
            AV21PrdNum = H01A310_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
                  GX_FocusControl = edtavPrdnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV21PrdNum", hV21PrdNum);
         hV22PrdNum_to = httpContext.cgiGet( edtavPrdnum_to_Internalname) ;
         if ( (GXutil.strcmp("", hV22PrdNum_to)==0) )
         {
            AV22PrdNum_to = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22PrdNum_to", AV22PrdNum_to);
         }
         else
         {
            A13747PrdCDsc = hV22PrdNum_to ;
            /* Using cursor H01A311 */
            pr_default.execute(9, new Object[] {A13747PrdCDsc});
            AV22PrdNum_to = H01A311_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM_TO");
                  GX_FocusControl = edtavPrdnum_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV22PrdNum_to", hV22PrdNum_to);
         hV19PrvNum = httpContext.cgiGet( edtavPrvnum_Internalname) ;
         if ( (GXutil.strcmp("", hV19PrvNum)==0) )
         {
            AV19PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19PrvNum), 6, 0));
         }
         else
         {
            A13719PrvNNom = hV19PrvNum ;
            /* Using cursor H01A312 */
            pr_default.execute(10, new Object[] {A13719PrvNNom});
            AV19PrvNum = H01A312_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM");
                  GX_FocusControl = edtavPrvnum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV19PrvNum", hV19PrvNum);
         hV20PrvNum_to = httpContext.cgiGet( edtavPrvnum_to_Internalname) ;
         if ( (GXutil.strcmp("", hV20PrvNum_to)==0) )
         {
            AV20PrvNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20PrvNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20PrvNum_to), 6, 0));
         }
         else
         {
            A13719PrvNNom = hV20PrvNum_to ;
            /* Using cursor H01A313 */
            pr_default.execute(11, new Object[] {A13719PrvNNom});
            AV20PrvNum_to = H01A313_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM_TO");
                  GX_FocusControl = edtavPrvnum_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV20PrvNum_to", hV20PrvNum_to);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavRecfechr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vRECFECHR");
            GX_FocusControl = edtavRecfechr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Recfechr = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV15Recfechr = localUtil.ctot( httpContext.cgiGet( edtavRecfechr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      e131A32 ();
      if (returnInSub) return;
   }

   public void e131A32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV16Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      crearinventario_recuento_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char2[0] = AV6EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char2, GXv_char3, GXv_char4) ;
      crearinventario_recuento_wp_impl.this.AV6EmprCod = GXv_char2[0] ;
      crearinventario_recuento_wp_impl.this.AV17EmprNom = GXv_char3[0] ;
      crearinventario_recuento_wp_impl.this.AV18UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18UsurCod", AV18UsurCod);
      GXt_int5 = (byte)(AV8DelRec) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "DELREC", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8DelRec = GXt_int5 ;
      GXt_int5 = (byte)(AV34ExiCont) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV34ExiCont = GXt_int5 ;
      GXt_int7 = AV33ContrasenaValidar ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int8) ;
      crearinventario_recuento_wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV33ContrasenaValidar = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV42infec) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "INFEHH", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42infec = GXt_int5 ;
      GXt_int5 = (byte)(AV32tintutex) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32tintutex = GXt_int5 ;
      GXt_int5 = (byte)(AV31Cotexsur) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Cotexsur = GXt_int5 ;
      AV30Siacumular = ((AV31Cotexsur==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      GXt_int5 = (byte)(AV35SiAuditoria) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV6EmprCod, httpContext.getMessage( "SIAUPQ", ""), GXv_int6) ;
      crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV35SiAuditoria = GXt_int5 ;
      AV11FecRec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11FecRec", localUtil.format(AV11FecRec, "99/99/99"));
      AV12VarAux0 = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV13HhMm = localUtil.ttoc( AV12VarAux0, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV14HhMmchar = localUtil.dtoc( AV11FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + AV13HhMm ;
      AV15Recfechr = localUtil.ctot( AV14HhMmchar, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV10Texto = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      if ( AV7Informe == 1 )
      {
         AV10Texto += httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV11FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
         AV10Texto += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV11FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
         AV10Texto += " " + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      }
      if ( GXutil.strcmp(AV10Texto, " ") == 0 )
      {
         AV10Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      }
      else
      {
         AV10Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      }
      AV10Texto += httpContext.getMessage( "Compras de Quimicos, Recetas de Tinte, Recetas Acabado", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      AV10Texto += httpContext.getMessage( "Recetas estampación, Recetas Lavados, Consumos Manuales", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      AV10Texto += httpContext.getMessage( "Cierre de Recetas de Tinte, Acabados, Estampación, Lavados ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      AV10Texto += httpContext.getMessage( "Porque si fuera que sí, esto afectaría al inventario que deseamos realizar.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      AV10Texto += httpContext.getMessage( "Confirma, entonces, la creación del INVENTARIO, con fecha ", "") + localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " ?" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Texto", AV10Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10Texto, ""))));
      /* Execute user subroutine: 'LASTRECUEN' */
      S112 ();
      if (returnInSub) return;
      if ( AV8DelRec == 1 )
      {
         GXt_int5 = (byte)(AV9FlagM) ;
         GXv_char4[0] = AV6EmprCod ;
         GXv_int6[0] = GXt_int5 ;
         new app.pctrrec(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
         crearinventario_recuento_wp_impl.this.AV6EmprCod = GXv_char4[0] ;
         crearinventario_recuento_wp_impl.this.GXt_int5 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
         AV9FlagM = GXt_int5 ;
      }
      GXt_char1 = AV16Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      crearinventario_recuento_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char2[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV16Station, GXv_char4, GXv_char3, GXv_char2) ;
      crearinventario_recuento_wp_impl.this.AV6EmprCod = GXv_char4[0] ;
      crearinventario_recuento_wp_impl.this.AV17EmprNom = GXv_char3[0] ;
      crearinventario_recuento_wp_impl.this.AV18UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV18UsurCod", AV18UsurCod);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wccrearinventario_recuento_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wccrearinventario_recuento_wc_Component), GXutil.lower( "CrearInventario_recuento_WC")) != 0 )
      {
         WebComp_Wccrearinventario_recuento_wc = WebUtils.getWebComponent(getClass(), "app.crearinventario_recuento_wc_impl", remoteHandle, context);
         WebComp_Wccrearinventario_recuento_wc_Component = "CrearInventario_recuento_WC" ;
      }
      if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
      {
         WebComp_Wccrearinventario_recuento_wc.setjustcreated();
         WebComp_Wccrearinventario_recuento_wc.componentprepare(new Object[] {"W0089","",AV6EmprCod,AV11FecRec,AV15Recfechr});
         WebComp_Wccrearinventario_recuento_wc.componentbind(new Object[] {"","","vRECFECHR"});
      }
   }

   public void e121A32( )
   {
      /* Dvelop_confirmpanel_resultado_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_resultado_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION RESULTADO' */
         S122 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e141A32( )
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

   public void S122( )
   {
      /* 'DO ACTION RESULTADO' Routine */
      returnInSub = false ;
      AV39PrdNum_inicial = ((GXutil.strcmp("", AV21PrdNum)==0) ? "100000" : AV21PrdNum) ;
      AV24PrdNum_to2 = ((GXutil.strcmp("", AV22PrdNum_to)==0) ? "999999" : AV22PrdNum_to) ;
      AV25PrvNum_to2 = ((0==AV20PrvNum_to) ? 999999 : AV20PrvNum_to) ;
      AV43FecRec2 = AV11FecRec ;
      AV44Recfechr2 = AV15Recfechr ;
      GXv_char4[0] = AV6EmprCod ;
      GXv_char3[0] = AV39PrdNum_inicial ;
      GXv_char2[0] = AV24PrdNum_to2 ;
      GXv_int8[0] = AV19PrvNum ;
      GXv_int9[0] = AV25PrvNum_to2 ;
      GXv_int6[0] = (byte)(AV7Informe) ;
      GXv_date10[0] = AV11FecRec ;
      GXv_dtime11[0] = AV15Recfechr ;
      GXv_char12[0] = AV18UsurCod ;
      GXv_char13[0] = AV16Station ;
      GXv_int14[0] = AV41NumeroPases ;
      new app.core.crearinventario_recuento(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_int8, GXv_int9, GXv_int6, GXv_date10, GXv_dtime11, GXv_char12, GXv_char13, GXv_int14) ;
      crearinventario_recuento_wp_impl.this.AV6EmprCod = GXv_char4[0] ;
      crearinventario_recuento_wp_impl.this.AV39PrdNum_inicial = GXv_char3[0] ;
      crearinventario_recuento_wp_impl.this.AV24PrdNum_to2 = GXv_char2[0] ;
      crearinventario_recuento_wp_impl.this.AV19PrvNum = GXv_int8[0] ;
      crearinventario_recuento_wp_impl.this.AV25PrvNum_to2 = GXv_int9[0] ;
      crearinventario_recuento_wp_impl.this.AV7Informe = GXv_int6[0] ;
      crearinventario_recuento_wp_impl.this.AV11FecRec = GXv_date10[0] ;
      crearinventario_recuento_wp_impl.this.AV15Recfechr = GXv_dtime11[0] ;
      crearinventario_recuento_wp_impl.this.AV18UsurCod = GXv_char12[0] ;
      crearinventario_recuento_wp_impl.this.AV16Station = GXv_char13[0] ;
      crearinventario_recuento_wp_impl.this.AV41NumeroPases = GXv_int14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6EmprCod", AV6EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19PrvNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Informe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Informe), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11FecRec", localUtil.format(AV11FecRec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV18UsurCod", AV18UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Station", AV16Station);
      lblTexto1_Fontsize = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTexto1_Fontsize), 9, 0), true);
      lblTexto1_Caption = httpContext.getMessage( "Numero de procesos aplicados ", "")+GXutil.trim( GXutil.str( AV41NumeroPases, 4, 0))+" "+GXutil.trim( localUtil.dtoc( AV11FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+" "+GXutil.trim( localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
      httpContext.doAjaxRefresh();
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wccrearinventario_recuento_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wccrearinventario_recuento_wc_Component), GXutil.lower( "CrearInventario_recuento_WC")) != 0 )
      {
         WebComp_Wccrearinventario_recuento_wc = WebUtils.getWebComponent(getClass(), "app.crearinventario_recuento_wc_impl", remoteHandle, context);
         WebComp_Wccrearinventario_recuento_wc_Component = "CrearInventario_recuento_WC" ;
      }
      if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
      {
         WebComp_Wccrearinventario_recuento_wc.setjustcreated();
         WebComp_Wccrearinventario_recuento_wc.componentprepare(new Object[] {"W0089","",AV6EmprCod,AV43FecRec2,AV44Recfechr2});
         WebComp_Wccrearinventario_recuento_wc.componentbind(new Object[] {"","",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wccrearinventario_recuento_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0089"+"");
         WebComp_Wccrearinventario_recuento_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
   }

   public void S112( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV5Recfec = GXutil.nullDate() ;
      /* Using cursor H01A314 */
      pr_default.execute(12, new Object[] {AV6EmprCod});
      while ( (pr_default.getStatus(12) != 101) )
      {
         A396EmprCod = H01A314_A396EmprCod[0] ;
         A810RecFec = H01A314_A810RecFec[0] ;
         AV5Recfec = A810RecFec ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(12);
      }
      pr_default.close(12);
      AV7Informe = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Informe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Informe), 4, 0));
      /* Using cursor H01A315 */
      pr_default.execute(13, new Object[] {AV6EmprCod, AV11FecRec});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A13416RecEstInv = H01A315_A13416RecEstInv[0] ;
         A810RecFec = H01A315_A810RecFec[0] ;
         A396EmprCod = H01A315_A396EmprCod[0] ;
         AV7Informe = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Informe", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Informe), 4, 0));
         pr_default.readNext(13);
      }
      pr_default.close(13);
   }

   protected void nextLoad( )
   {
   }

   protected void e151A32( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_93_1A32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_resultado_Internalname, tblTabledvelop_confirmpanel_resultado_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_resultado.setProperty("Title", Dvelop_confirmpanel_resultado_Title);
         ucDvelop_confirmpanel_resultado.setProperty("ConfirmationText", Dvelop_confirmpanel_resultado_Confirmationtext);
         ucDvelop_confirmpanel_resultado.setProperty("YesButtonCaption", Dvelop_confirmpanel_resultado_Yesbuttoncaption);
         ucDvelop_confirmpanel_resultado.setProperty("NoButtonCaption", Dvelop_confirmpanel_resultado_Nobuttoncaption);
         ucDvelop_confirmpanel_resultado.setProperty("CancelButtonCaption", Dvelop_confirmpanel_resultado_Cancelbuttoncaption);
         ucDvelop_confirmpanel_resultado.setProperty("YesButtonPosition", Dvelop_confirmpanel_resultado_Yesbuttonposition);
         ucDvelop_confirmpanel_resultado.setProperty("ConfirmType", Dvelop_confirmpanel_resultado_Confirmtype);
         ucDvelop_confirmpanel_resultado.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_resultado_Internalname, "DVELOP_CONFIRMPANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_RESULTADOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_93_1A32e( true) ;
      }
      else
      {
         wb_table1_93_1A32e( false) ;
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
      pa1A32( ) ;
      ws1A32( ) ;
      we1A32( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wccrearinventario_recuento_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wccrearinventario_recuento_wc_Component) != 0 )
         {
            WebComp_Wccrearinventario_recuento_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643259", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/crearinventario_recuento_wp.js", "?20266101643259", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPrdnum_Internalname = "vPRDNUM" ;
      edtavPrdnum_to_Internalname = "vPRDNUM_TO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPrvnum_Internalname = "vPRVNUM" ;
      edtavPrvnum_to_Internalname = "vPRVNUM_TO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavRecfechr_Internalname = "vRECFECHR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultado_Internalname = "BTNRESULTADO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Bp_Internalname = "BP" ;
      lblTexto1_Internalname = "TEXTO1" ;
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
      Dvelop_confirmpanel_resultado_Internalname = "DVELOP_CONFIRMPANEL_RESULTADO" ;
      tblTabledvelop_confirmpanel_resultado_Internalname = "TABLEDVELOP_CONFIRMPANEL_RESULTADO" ;
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
      lblTexto1_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      lblTexto1_Caption = httpContext.getMessage( "Texto", "") ;
      edtavRecfechr_Jsonclick = "" ;
      edtavRecfechr_Enabled = 1 ;
      edtavPrvnum_to_Jsonclick = "" ;
      edtavPrvnum_to_Enabled = 1 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 1 ;
      edtavPrdnum_to_Jsonclick = "" ;
      edtavPrdnum_to_Enabled = 1 ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Enabled = 1 ;
      Dvelop_confirmpanel_resultado_Confirmtype = "1" ;
      Dvelop_confirmpanel_resultado_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_resultado_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_resultado_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_resultado_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_resultado_Confirmationtext = "¿Desea crear Inventario (recuento)?" ;
      Dvelop_confirmpanel_resultado_Title = "" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Crear Inventario (recuento)", "") );
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

   public void validv_Prdnum( )
   {
      if ( (GXutil.strcmp("", hV21PrdNum)==0) )
      {
         AV21PrdNum = "" ;
      }
      else
      {
         A13747PrdCDsc = hV21PrdNum ;
         /* Using cursor H01A316 */
         pr_default.execute(14, new Object[] {A13747PrdCDsc});
         AV21PrdNum = H01A316_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(14) == 101) ) )
         {
            pr_default.readNext(14);
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM");
               GX_FocusControl = edtavPrdnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(14);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV21PrdNum", hV21PrdNum);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV21PrdNum", GXutil.rtrim( AV21PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "hV21PrdNum", hV21PrdNum);
   }

   public void validv_Prdnum_to( )
   {
      if ( (GXutil.strcmp("", hV22PrdNum_to)==0) )
      {
         AV22PrdNum_to = "" ;
      }
      else
      {
         A13747PrdCDsc = hV22PrdNum_to ;
         /* Using cursor H01A317 */
         pr_default.execute(15, new Object[] {A13747PrdCDsc});
         AV22PrdNum_to = H01A317_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUM_TO");
               GX_FocusControl = edtavPrdnum_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV22PrdNum_to", hV22PrdNum_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV22PrdNum_to", GXutil.rtrim( AV22PrdNum_to));
      httpContext.ajax_rsp_assign_attri("", false, "hV22PrdNum_to", hV22PrdNum_to);
   }

   public void validv_Prvnum( )
   {
      if ( (GXutil.strcmp("", hV19PrvNum)==0) )
      {
         AV19PrvNum = 0 ;
      }
      else
      {
         A13719PrvNNom = hV19PrvNum ;
         /* Using cursor H01A318 */
         pr_default.execute(16, new Object[] {A13719PrvNNom});
         AV19PrvNum = H01A318_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM");
               GX_FocusControl = edtavPrvnum_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV19PrvNum", hV19PrvNum);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19PrvNum", GXutil.ltrim( localUtil.ntoc( AV19PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV19PrvNum", hV19PrvNum);
   }

   public void validv_Prvnum_to( )
   {
      if ( (GXutil.strcmp("", hV20PrvNum_to)==0) )
      {
         AV20PrvNum_to = 0 ;
      }
      else
      {
         A13719PrvNNom = hV20PrvNum_to ;
         /* Using cursor H01A319 */
         pr_default.execute(17, new Object[] {A13719PrvNNom});
         AV20PrvNum_to = H01A319_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Numero y Nombre", "")}), 1, "vPRVNUM_TO");
               GX_FocusControl = edtavPrvnum_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV20PrvNum_to", hV20PrvNum_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV20PrvNum_to", GXutil.ltrim( localUtil.ntoc( AV20PrvNum_to, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV20PrvNum_to", hV20PrvNum_to);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV10Texto',fld:'vTEXTO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADO'","{handler:'e111A31',iparms:[{av:'AV10Texto',fld:'vTEXTO',pic:'',hsh:true}]");
      setEventMetadata("'DORESULTADO'",",oparms:[{av:'Dvelop_confirmpanel_resultado_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_RESULTADO',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADO.CLOSE","{handler:'e121A32',iparms:[{av:'Dvelop_confirmpanel_resultado_Result',ctrl:'DVELOP_CONFIRMPANEL_RESULTADO',prop:'Result'},{av:'AV21PrdNum',fld:'vPRDNUM',pic:''},{av:'AV22PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV20PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV11FecRec',fld:'vFECREC',pic:''},{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV7Informe',fld:'vINFORME',pic:'ZZZ9'},{av:'AV18UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV16Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_RESULTADO.CLOSE",",oparms:[{av:'AV16Station',fld:'vSTATION',pic:''},{av:'AV18UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV11FecRec',fld:'vFECREC',pic:''},{av:'AV7Informe',fld:'vINFORME',pic:'ZZZ9'},{av:'AV19PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV6EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'lblTexto1_Fontsize',ctrl:'TEXTO1',prop:'Fontsize'},{av:'lblTexto1_Caption',ctrl:'TEXTO1',prop:'Caption'},{ctrl:'WCCREARINVENTARIO_RECUENTO_WC'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141A32',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[{av:'hV21PrdNum'},{av:'AV21PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[{av:'AV21PrdNum',fld:'vPRDNUM',pic:''},{av:'hV21PrdNum'}]}");
      setEventMetadata("VALIDV_PRDNUM_TO","{handler:'validv_Prdnum_to',iparms:[{av:'hV22PrdNum_to'},{av:'AV22PrdNum_to',fld:'vPRDNUM_TO',pic:''}]");
      setEventMetadata("VALIDV_PRDNUM_TO",",oparms:[{av:'AV22PrdNum_to',fld:'vPRDNUM_TO',pic:''},{av:'hV22PrdNum_to'}]}");
      setEventMetadata("VALIDV_PRVNUM","{handler:'validv_Prvnum',iparms:[{av:'hV19PrvNum'},{av:'AV19PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_PRVNUM",",oparms:[{av:'AV19PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'hV19PrvNum'}]}");
      setEventMetadata("VALIDV_PRVNUM_TO","{handler:'validv_Prvnum_to',iparms:[{av:'hV20PrvNum_to'},{av:'AV20PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_PRVNUM_TO",",oparms:[{av:'AV20PrvNum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'hV20PrvNum_to'}]}");
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
      Dvelop_confirmpanel_resultado_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13747PrdCDsc = "" ;
      A13719PrvNNom = "" ;
      hV21PrdNum = "" ;
      hV22PrdNum_to = "" ;
      hV19PrvNum = "" ;
      hV20PrvNum_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV10Texto = "" ;
      GXKey = "" ;
      AV11FecRec = GXutil.nullDate() ;
      AV6EmprCod = "" ;
      AV18UsurCod = "" ;
      AV16Station = "" ;
      AV21PrdNum = "" ;
      AV22PrdNum_to = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV15Recfechr = GXutil.resetTime( GXutil.nullDate() );
      bttBtnresultado_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucBp = new com.genexus.webpanels.GXUserControl();
      lblTexto1_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wccrearinventario_recuento_wc_Component = "" ;
      OldWccrearinventario_recuento_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13747PrdCDsc = "" ;
      H01A32_A13747PrdCDsc = new String[] {""} ;
      H01A33_A13747PrdCDsc = new String[] {""} ;
      l13719PrvNNom = "" ;
      H01A34_A13719PrvNNom = new String[] {""} ;
      H01A35_A13719PrvNNom = new String[] {""} ;
      H01A36_A13747PrdCDsc = new String[] {""} ;
      H01A36_A396EmprCod = new String[] {""} ;
      H01A36_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      H01A37_A13747PrdCDsc = new String[] {""} ;
      H01A37_A396EmprCod = new String[] {""} ;
      H01A37_A719PrdNum = new String[] {""} ;
      H01A38_A13719PrvNNom = new String[] {""} ;
      H01A38_A396EmprCod = new String[] {""} ;
      H01A38_A795PrvNum = new int[1] ;
      H01A39_A13719PrvNNom = new String[] {""} ;
      H01A39_A396EmprCod = new String[] {""} ;
      H01A39_A795PrvNum = new int[1] ;
      H01A310_A13747PrdCDsc = new String[] {""} ;
      H01A310_A396EmprCod = new String[] {""} ;
      H01A310_A719PrdNum = new String[] {""} ;
      H01A311_A13747PrdCDsc = new String[] {""} ;
      H01A311_A396EmprCod = new String[] {""} ;
      H01A311_A719PrdNum = new String[] {""} ;
      H01A312_A13719PrvNNom = new String[] {""} ;
      H01A312_A396EmprCod = new String[] {""} ;
      H01A312_A795PrvNum = new int[1] ;
      H01A313_A13719PrvNNom = new String[] {""} ;
      H01A313_A396EmprCod = new String[] {""} ;
      H01A313_A795PrvNum = new int[1] ;
      AV17EmprNom = "" ;
      AV30Siacumular = "" ;
      AV12VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV13HhMm = "" ;
      AV14HhMmchar = "" ;
      GXt_char1 = "" ;
      AV39PrdNum_inicial = "" ;
      AV24PrdNum_to2 = "" ;
      AV43FecRec2 = GXutil.nullDate() ;
      AV44Recfechr2 = GXutil.resetTime( GXutil.nullDate() );
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int9 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_int14 = new short[1] ;
      AV5Recfec = GXutil.nullDate() ;
      H01A314_A719PrdNum = new String[] {""} ;
      H01A314_A396EmprCod = new String[] {""} ;
      H01A314_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A810RecFec = GXutil.nullDate() ;
      H01A315_A719PrdNum = new String[] {""} ;
      H01A315_A13416RecEstInv = new byte[1] ;
      H01A315_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01A315_A396EmprCod = new String[] {""} ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_resultado = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01A316_A13747PrdCDsc = new String[] {""} ;
      H01A316_A396EmprCod = new String[] {""} ;
      H01A316_A719PrdNum = new String[] {""} ;
      ZV21PrdNum = "" ;
      ZhV21PrdNum = "" ;
      H01A317_A13747PrdCDsc = new String[] {""} ;
      H01A317_A396EmprCod = new String[] {""} ;
      H01A317_A719PrdNum = new String[] {""} ;
      ZV22PrdNum_to = "" ;
      ZhV22PrdNum_to = "" ;
      H01A318_A13719PrvNNom = new String[] {""} ;
      H01A318_A396EmprCod = new String[] {""} ;
      H01A318_A795PrvNum = new int[1] ;
      ZhV19PrvNum = "" ;
      H01A319_A13719PrvNNom = new String[] {""} ;
      H01A319_A396EmprCod = new String[] {""} ;
      H01A319_A795PrvNum = new int[1] ;
      ZhV20PrvNum_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.crearinventario_recuento_wp__default(),
         new Object[] {
             new Object[] {
            H01A32_A13747PrdCDsc
            }
            , new Object[] {
            H01A33_A13747PrdCDsc
            }
            , new Object[] {
            H01A34_A13719PrvNNom
            }
            , new Object[] {
            H01A35_A13719PrvNNom
            }
            , new Object[] {
            H01A36_A13747PrdCDsc, H01A36_A396EmprCod, H01A36_A719PrdNum
            }
            , new Object[] {
            H01A37_A13747PrdCDsc, H01A37_A396EmprCod, H01A37_A719PrdNum
            }
            , new Object[] {
            H01A38_A13719PrvNNom, H01A38_A396EmprCod, H01A38_A795PrvNum
            }
            , new Object[] {
            H01A39_A13719PrvNNom, H01A39_A396EmprCod, H01A39_A795PrvNum
            }
            , new Object[] {
            H01A310_A13747PrdCDsc, H01A310_A396EmprCod, H01A310_A719PrdNum
            }
            , new Object[] {
            H01A311_A13747PrdCDsc, H01A311_A396EmprCod, H01A311_A719PrdNum
            }
            , new Object[] {
            H01A312_A13719PrvNNom, H01A312_A396EmprCod, H01A312_A795PrvNum
            }
            , new Object[] {
            H01A313_A13719PrvNNom, H01A313_A396EmprCod, H01A313_A795PrvNum
            }
            , new Object[] {
            H01A314_A719PrdNum, H01A314_A396EmprCod, H01A314_A810RecFec
            }
            , new Object[] {
            H01A315_A719PrdNum, H01A315_A13416RecEstInv, H01A315_A810RecFec, H01A315_A396EmprCod
            }
            , new Object[] {
            H01A316_A13747PrdCDsc, H01A316_A396EmprCod, H01A316_A719PrdNum
            }
            , new Object[] {
            H01A317_A13747PrdCDsc, H01A317_A396EmprCod, H01A317_A719PrdNum
            }
            , new Object[] {
            H01A318_A13719PrvNNom, H01A318_A396EmprCod, H01A318_A795PrvNum
            }
            , new Object[] {
            H01A319_A13719PrvNNom, H01A319_A396EmprCod, H01A319_A795PrvNum
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      WebComp_Wccrearinventario_recuento_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A13416RecEstInv ;
   private byte nGXWrapped ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV7Informe ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV8DelRec ;
   private short AV34ExiCont ;
   private short AV33ContrasenaValidar ;
   private short AV42infec ;
   private short AV32tintutex ;
   private short AV31Cotexsur ;
   private short AV35SiAuditoria ;
   private short AV9FlagM ;
   private short AV41NumeroPases ;
   private short GXv_int14[] ;
   private int AV19PrvNum ;
   private int AV20PrvNum_to ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavPrdnum_Enabled ;
   private int edtavPrdnum_to_Enabled ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrvnum_to_Enabled ;
   private int edtavRecfechr_Enabled ;
   private int lblTexto1_Fontsize ;
   private int gxdynajaxindex ;
   private int A795PrvNum ;
   private int GXt_int7 ;
   private int AV25PrvNum_to2 ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int idxLst ;
   private int ZV19PrvNum ;
   private int ZV20PrvNum_to ;
   private String Dvelop_confirmpanel_resultado_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV6EmprCod ;
   private String AV18UsurCod ;
   private String AV16Station ;
   private String AV21PrdNum ;
   private String AV22PrdNum_to ;
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
   private String Dvelop_confirmpanel_resultado_Title ;
   private String Dvelop_confirmpanel_resultado_Confirmationtext ;
   private String Dvelop_confirmpanel_resultado_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_resultado_Nobuttoncaption ;
   private String Dvelop_confirmpanel_resultado_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_resultado_Yesbuttonposition ;
   private String Dvelop_confirmpanel_resultado_Confirmtype ;
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
   private String edtavPrdnum_Internalname ;
   private String TempTags ;
   private String edtavPrdnum_Jsonclick ;
   private String edtavPrdnum_to_Internalname ;
   private String edtavPrdnum_to_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrvnum_to_Internalname ;
   private String edtavPrvnum_to_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavRecfechr_Internalname ;
   private String edtavRecfechr_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultado_Internalname ;
   private String bttBtnresultado_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Bp_Internalname ;
   private String lblTexto1_Internalname ;
   private String lblTexto1_Caption ;
   private String lblTexto1_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wccrearinventario_recuento_wc_Component ;
   private String OldWccrearinventario_recuento_wc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV17EmprNom ;
   private String AV30Siacumular ;
   private String AV13HhMm ;
   private String AV14HhMmchar ;
   private String GXt_char1 ;
   private String AV39PrdNum_inicial ;
   private String AV24PrdNum_to2 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_resultado_Internalname ;
   private String Dvelop_confirmpanel_resultado_Internalname ;
   private String ZV21PrdNum ;
   private String ZV22PrdNum_to ;
   private java.util.Date AV15Recfechr ;
   private java.util.Date AV12VarAux0 ;
   private java.util.Date AV44Recfechr2 ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date AV11FecRec ;
   private java.util.Date AV43FecRec2 ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date AV5Recfec ;
   private java.util.Date A810RecFec ;
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
   private boolean bDynCreated_Wccrearinventario_recuento_wc ;
   private String A13747PrdCDsc ;
   private String A13719PrvNNom ;
   private String hV21PrdNum ;
   private String hV22PrdNum_to ;
   private String hV19PrvNum ;
   private String hV20PrvNum_to ;
   private String AV10Texto ;
   private String l13747PrdCDsc ;
   private String l13719PrvNNom ;
   private String ZhV21PrdNum ;
   private String ZhV22PrdNum_to ;
   private String ZhV19PrvNum ;
   private String ZhV20PrvNum_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wccrearinventario_recuento_wc ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucBp ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_resultado ;
   private IDataStoreProvider pr_default ;
   private String[] H01A32_A13747PrdCDsc ;
   private String[] H01A33_A13747PrdCDsc ;
   private String[] H01A34_A13719PrvNNom ;
   private String[] H01A35_A13719PrvNNom ;
   private String[] H01A36_A13747PrdCDsc ;
   private String[] H01A36_A396EmprCod ;
   private String[] H01A36_A719PrdNum ;
   private String[] H01A37_A13747PrdCDsc ;
   private String[] H01A37_A396EmprCod ;
   private String[] H01A37_A719PrdNum ;
   private String[] H01A38_A13719PrvNNom ;
   private String[] H01A38_A396EmprCod ;
   private int[] H01A38_A795PrvNum ;
   private String[] H01A39_A13719PrvNNom ;
   private String[] H01A39_A396EmprCod ;
   private int[] H01A39_A795PrvNum ;
   private String[] H01A310_A13747PrdCDsc ;
   private String[] H01A310_A396EmprCod ;
   private String[] H01A310_A719PrdNum ;
   private String[] H01A311_A13747PrdCDsc ;
   private String[] H01A311_A396EmprCod ;
   private String[] H01A311_A719PrdNum ;
   private String[] H01A312_A13719PrvNNom ;
   private String[] H01A312_A396EmprCod ;
   private int[] H01A312_A795PrvNum ;
   private String[] H01A313_A13719PrvNNom ;
   private String[] H01A313_A396EmprCod ;
   private int[] H01A313_A795PrvNum ;
   private String[] H01A314_A719PrdNum ;
   private String[] H01A314_A396EmprCod ;
   private java.util.Date[] H01A314_A810RecFec ;
   private String[] H01A315_A719PrdNum ;
   private byte[] H01A315_A13416RecEstInv ;
   private java.util.Date[] H01A315_A810RecFec ;
   private String[] H01A315_A396EmprCod ;
   private String[] H01A316_A13747PrdCDsc ;
   private String[] H01A316_A396EmprCod ;
   private String[] H01A316_A719PrdNum ;
   private String[] H01A317_A13747PrdCDsc ;
   private String[] H01A317_A396EmprCod ;
   private String[] H01A317_A719PrdNum ;
   private String[] H01A318_A13719PrvNNom ;
   private String[] H01A318_A396EmprCod ;
   private int[] H01A318_A795PrvNum ;
   private String[] H01A319_A13719PrvNNom ;
   private String[] H01A319_A396EmprCod ;
   private int[] H01A319_A795PrvNum ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class crearinventario_recuento_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01A32", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A33", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A34", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?) ORDER BY PrvNNom) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A35", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom FROM TXPPRVGEN WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, '')))) like '%' || UPPER(?) ORDER BY PrvNNom) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A36", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A37", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A38", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A39", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A310", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A311", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A312", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A313", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A314", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFec FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01A315", "SELECT PrdNum, RecEstInv, RecFec, EmprCod FROM TXPRECUEN WHERE (EmprCod = ? and RecFec = ?) AND (RecEstInv = 1) ORDER BY EmprCod, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A316", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A317", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A318", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01A319", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) AS PrvNNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(PrvNum,'999990'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( PrvNom, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
      }
   }

}

