package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwuti118_sdt_impl extends GXDataArea
{
   public webwuti118_sdt_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwuti118_sdt_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwuti118_sdt_impl.class ));
   }

   public webwuti118_sdt_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavCalstkini = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUMIN") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumin14M0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUMIN_TO") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumin_to14M0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUMIN") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumin14M0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUMIN") == 0 )
         {
            hV12PrdNumIN = httpContext.GetPar( "hV12PrdNumIN") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnumin14M2( hV12PrdNumIN) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPRDNUMIN_TO") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvprdnumin_to14M0( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPRDNUMIN_TO") == 0 )
         {
            hV13PrdNumIN_to = httpContext.GetPar( "hV13PrdNumIN_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvprdnumin_to14M2( hV13PrdNumIN_to) ;
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
      pa14M2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start14M2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.webwuti118_sdt", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUMIN", GXutil.rtrim( AV12PrdNumIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPRDNUMIN_TO", GXutil.rtrim( AV13PrdNumIN_to));
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
      if ( ! ( WebComp_Wcwwuti118_sdt_2 == null ) )
      {
         WebComp_Wcwwuti118_sdt_2.componentjscripts();
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
         we14M2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt14M2( ) ;
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
      return formatLink("app.stocksquimicos.webwuti118_sdt", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.WebWUti118_SDT" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Analisis Consumos, Compras, Stock final", "") ;
   }

   public void wb14M0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_Internalname, localUtil.format(AV6FECHA, "99/99/99"), localUtil.format( AV6FECHA, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_to_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_to_Internalname, localUtil.format(AV7FECHA_to, "99/99/99"), localUtil.format( AV7FECHA_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnumin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnumin_Internalname, httpContext.getMessage( "Producto Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnumin_Internalname, hV12PrdNumIN, GXutil.rtrim( localUtil.format( hV12PrdNumIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnumin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnumin_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdnumin_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdnumin_to_Internalname, httpContext.getMessage( "Producto Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnumin_to_Internalname, hV13PrdNumIN_to, GXutil.rtrim( localUtil.format( hV13PrdNumIN_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnumin_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdnumin_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLotebusqueda_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLotebusqueda_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLotebusqueda_Internalname, GXutil.rtrim( AV8LoteBusqueda), GXutil.rtrim( localUtil.format( AV8LoteBusqueda, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLotebusqueda_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLotebusqueda_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavCalstkini.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavCalstkini.getInternalname(), httpContext.getMessage( "Calcular Stock Inicial?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavCalstkini.getInternalname(), GXutil.str( AV5CalStkIni, 1, 0), "", httpContext.getMessage( "Calcular Stock Inicial?", ""), 1, chkavCalstkini.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(52, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultado", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
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
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0084"+"", GXutil.rtrim( WebComp_Wcwwuti118_sdt_2_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0084"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcwwuti118_sdt_2), GXutil.lower( WebComp_Wcwwuti118_sdt_2_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0084"+"");
               }
               WebComp_Wcwwuti118_sdt_2.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcwwuti118_sdt_2), GXutil.lower( WebComp_Wcwwuti118_sdt_2_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV26Pgmname), GXutil.rtrim( localUtil.format( AV26Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\WebWUti118_SDT.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start14M2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Analisis Consumos, Compras, Stock final", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup14M0( ) ;
   }

   public void ws14M2( )
   {
      start14M2( ) ;
      evt14M2( ) ;
   }

   public void evt14M2( )
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
                           e1114M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e1214M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1314M2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1414M2 ();
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
                     if ( nCmpId == 84 )
                     {
                        OldWcwwuti118_sdt_2 = httpContext.cgiGet( "W0084") ;
                        if ( ( GXutil.len( OldWcwwuti118_sdt_2) == 0 ) || ( GXutil.strcmp(OldWcwwuti118_sdt_2, WebComp_Wcwwuti118_sdt_2_Component) != 0 ) )
                        {
                           WebComp_Wcwwuti118_sdt_2 = WebUtils.getWebComponent(getClass(), "app." + OldWcwwuti118_sdt_2 + "_impl", remoteHandle, context);
                           WebComp_Wcwwuti118_sdt_2_Component = OldWcwwuti118_sdt_2 ;
                        }
                        if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
                        {
                           WebComp_Wcwwuti118_sdt_2.componentprocess("W0084", "", sEvt);
                        }
                        WebComp_Wcwwuti118_sdt_2_Component = OldWcwwuti118_sdt_2 ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we14M2( )
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

   public void pa14M2( )
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
            GX_FocusControl = edtavFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvprdnumin14M0( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnumin_data14M0( A13747PrdCDsc) ;
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

   protected void gxsgvvprdnumin_data14M0( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H014M2 */
      pr_default.execute(0, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H014M2_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(H014M2_A13747PrdCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvprdnumin_to14M0( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvprdnumin_to_data14M0( A13747PrdCDsc) ;
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

   protected void gxsgvvprdnumin_to_data14M0( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H014M3 */
      pr_default.execute(1, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H014M3_A13747PrdCDsc[0]);
         gxdynajaxctrldescr.add(H014M3_A13747PrdCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxhcvvprdnumin14M2( String A13747PrdCDsc )
   {
      /* Using cursor H014M4 */
      pr_default.execute(2, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13747PrdCDsc = H014M4_A13747PrdCDsc[0] ;
         A396EmprCod = H014M4_A396EmprCod[0] ;
         A719PrdNum = H014M4_A719PrdNum[0] ;
         pr_default.readNext(2);
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
      pr_default.close(2);
   }

   public void gxhcvvprdnumin_to14M2( String A13747PrdCDsc )
   {
      /* Using cursor H014M5 */
      pr_default.execute(3, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13747PrdCDsc = H014M5_A13747PrdCDsc[0] ;
         A396EmprCod = H014M5_A396EmprCod[0] ;
         A719PrdNum = H014M5_A719PrdNum[0] ;
         pr_default.readNext(3);
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
      pr_default.close(3);
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
      AV5CalStkIni = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV5CalStkIni, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CalStkIni", GXutil.str( AV5CalStkIni, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf14M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV26Pgmname = "StocksQuimicos.WebWUti118_SDT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf14M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
            {
               WebComp_Wcwwuti118_sdt_2.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1414M2 ();
         wb14M0( ) ;
      }
   }

   public void send_integrity_lvl_hashes14M2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV26Pgmname = "StocksQuimicos.WebWUti118_SDT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup14M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1114M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA");
            GX_FocusControl = edtavFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6FECHA = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6FECHA", localUtil.format(AV6FECHA, "99/99/99"));
         }
         else
         {
            AV6FECHA = localUtil.ctod( httpContext.cgiGet( edtavFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6FECHA", localUtil.format(AV6FECHA, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_TO");
            GX_FocusControl = edtavFecha_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7FECHA_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7FECHA_to", localUtil.format(AV7FECHA_to, "99/99/99"));
         }
         else
         {
            AV7FECHA_to = localUtil.ctod( httpContext.cgiGet( edtavFecha_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7FECHA_to", localUtil.format(AV7FECHA_to, "99/99/99"));
         }
         hV12PrdNumIN = httpContext.cgiGet( edtavPrdnumin_Internalname) ;
         if ( (GXutil.strcmp("", hV12PrdNumIN)==0) )
         {
            AV12PrdNumIN = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12PrdNumIN", AV12PrdNumIN);
         }
         else
         {
            A13747PrdCDsc = hV12PrdNumIN ;
            /* Using cursor H014M6 */
            pr_default.execute(4, new Object[] {A13747PrdCDsc});
            AV12PrdNumIN = H014M6_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUMIN");
                  GX_FocusControl = edtavPrdnumin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV12PrdNumIN", hV12PrdNumIN);
         hV13PrdNumIN_to = httpContext.cgiGet( edtavPrdnumin_to_Internalname) ;
         if ( (GXutil.strcmp("", hV13PrdNumIN_to)==0) )
         {
            AV13PrdNumIN_to = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13PrdNumIN_to", AV13PrdNumIN_to);
         }
         else
         {
            A13747PrdCDsc = hV13PrdNumIN_to ;
            /* Using cursor H014M7 */
            pr_default.execute(5, new Object[] {A13747PrdCDsc});
            AV13PrdNumIN_to = H014M7_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(5) == 101) ) )
            {
               pr_default.readNext(5);
               if ( ! ( (pr_default.getStatus(5) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUMIN_TO");
                  GX_FocusControl = edtavPrdnumin_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(5);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV13PrdNumIN_to", hV13PrdNumIN_to);
         AV8LoteBusqueda = httpContext.cgiGet( edtavLotebusqueda_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8LoteBusqueda", AV8LoteBusqueda);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCalstkini.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavCalstkini.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCALSTKINI");
            GX_FocusControl = chkavCalstkini.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5CalStkIni = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CalStkIni", GXutil.str( AV5CalStkIni, 1, 0));
         }
         else
         {
            AV5CalStkIni = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavCalstkini.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5CalStkIni", GXutil.str( AV5CalStkIni, 1, 0));
         }
         AV26Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Pgmname", AV26Pgmname);
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
      e1114M2 ();
      if (returnInSub) return;
   }

   public void e1114M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwuti118_sdt_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwuti118_sdt_impl.this.AV16EmprCod = GXv_char2[0] ;
      webwuti118_sdt_impl.this.AV20EmprNom = GXv_char3[0] ;
      webwuti118_sdt_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      AV5CalStkIni = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CalStkIni", GXutil.str( AV5CalStkIni, 1, 0));
      AV6FECHA = GXutil.resetTime(GXutil.now( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6FECHA", localUtil.format(AV6FECHA, "99/99/99"));
      AV7FECHA_to = GXutil.resetTime(GXutil.now( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7FECHA_to", localUtil.format(AV7FECHA_to, "99/99/99"));
      if ( 1 == 0 )
      {
         GXt_char1 = AV19Station ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
         webwuti118_sdt_impl.this.GXt_char1 = GXv_char4[0] ;
         AV19Station = GXt_char1 ;
         GXv_char4[0] = AV16EmprCod ;
         GXv_char3[0] = AV20EmprNom ;
         GXv_char2[0] = AV21UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char4, GXv_char3, GXv_char2) ;
         webwuti118_sdt_impl.this.AV16EmprCod = GXv_char4[0] ;
         webwuti118_sdt_impl.this.AV20EmprNom = GXv_char3[0] ;
         webwuti118_sdt_impl.this.AV21UsurCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwwuti118_sdt_2 = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwwuti118_sdt_2_Component), GXutil.lower( "WWUti118_SDT_2")) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2 = WebUtils.getWebComponent(getClass(), "app.wwuti118_sdt_2_impl", remoteHandle, context);
            WebComp_Wcwwuti118_sdt_2_Component = "WWUti118_SDT_2" ;
         }
         if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2.setjustcreated();
            WebComp_Wcwwuti118_sdt_2.componentprepare(new Object[] {"W0084","",AV16EmprCod,AV6FECHA,AV7FECHA_to,AV17InformeInditex});
            WebComp_Wcwwuti118_sdt_2.componentbind(new Object[] {"","vFECHA","vFECHA_TO",""});
         }
      }
   }

   public void e1214M2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      AV15PrdnumIN2 = ((GXutil.strcmp("", AV12PrdNumIN)==0) ? "100000" : AV12PrdNumIN) ;
      AV14PrdNumIN_to2 = ((GXutil.strcmp("", AV13PrdNumIN_to)==0) ? "999999" : AV13PrdNumIN_to) ;
      AV22ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV22ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando el proceso ......", ""));
      AV22ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
      GXv_char4[0] = AV17InformeInditex ;
      new app.cargadatosinformeinditex_sdt(remoteHandle, context).execute( AV16EmprCod, AV6FECHA, AV7FECHA_to, AV15PrdnumIN2, AV14PrdNumIN_to2, AV8LoteBusqueda, AV5CalStkIni, GXv_char4) ;
      webwuti118_sdt_impl.this.AV17InformeInditex = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17InformeInditex", AV17InformeInditex);
      AV23x = GXutil.sleep( 1) ;
      AV22ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso Finalizado.....", ""));
      AV22ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV23x = GXutil.sleep( 2) ;
      AV22ProgressIndicator.hide();
      AV18SdtInformeInditexCollection.fromJSonString(AV17InformeInditex, null);
      if ( AV18SdtInformeInditexCollection.size() > 0 )
      {
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwwuti118_sdt_2 = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwwuti118_sdt_2_Component), GXutil.lower( "WWUti118_SDT_2")) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2 = WebUtils.getWebComponent(getClass(), "app.wwuti118_sdt_2_impl", remoteHandle, context);
            WebComp_Wcwwuti118_sdt_2_Component = "WWUti118_SDT_2" ;
         }
         if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2.setjustcreated();
            WebComp_Wcwwuti118_sdt_2.componentprepare(new Object[] {"W0084","",AV16EmprCod,AV6FECHA,AV7FECHA_to,AV17InformeInditex});
            WebComp_Wcwwuti118_sdt_2.componentbind(new Object[] {"","vFECHA","vFECHA_TO",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwwuti118_sdt_2 )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0084"+"");
            WebComp_Wcwwuti118_sdt_2.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No hay datos", ""));
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcwwuti118_sdt_2 = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcwwuti118_sdt_2_Component), GXutil.lower( "WWUti118_SDT_2")) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2 = WebUtils.getWebComponent(getClass(), "app.wwuti118_sdt_2_impl", remoteHandle, context);
            WebComp_Wcwwuti118_sdt_2_Component = "WWUti118_SDT_2" ;
         }
         if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2.setjustcreated();
            WebComp_Wcwwuti118_sdt_2.componentprepare(new Object[] {"W0084","",AV16EmprCod,AV6FECHA,AV7FECHA_to,AV17InformeInditex});
            WebComp_Wcwwuti118_sdt_2.componentbind(new Object[] {"","vFECHA","vFECHA_TO",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcwwuti118_sdt_2 )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0084"+"");
            WebComp_Wcwwuti118_sdt_2.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV22ProgressIndicator", AV22ProgressIndicator);
   }

   public void e1314M2( )
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

   protected void nextLoad( )
   {
   }

   protected void e1414M2( )
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
      pa14M2( ) ;
      ws14M2( ) ;
      we14M2( ) ;
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
      if ( ! ( WebComp_Wcwwuti118_sdt_2 == null ) )
      {
         if ( GXutil.len( WebComp_Wcwwuti118_sdt_2_Component) != 0 )
         {
            WebComp_Wcwwuti118_sdt_2.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424479", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/webwuti118_sdt.js", "?202661016424479", false, true);
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
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFecha_Internalname = "vFECHA" ;
      edtavFecha_to_Internalname = "vFECHA_TO" ;
      edtavPrdnumin_Internalname = "vPRDNUMIN" ;
      edtavPrdnumin_to_Internalname = "vPRDNUMIN_TO" ;
      edtavLotebusqueda_Internalname = "vLOTEBUSQUEDA" ;
      chkavCalstkini.setInternalname( "vCALSTKINI" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      chkavCalstkini.setEnabled( 1 );
      edtavLotebusqueda_Jsonclick = "" ;
      edtavLotebusqueda_Enabled = 1 ;
      edtavPrdnumin_to_Jsonclick = "" ;
      edtavPrdnumin_to_Enabled = 1 ;
      edtavPrdnumin_Jsonclick = "" ;
      edtavPrdnumin_Enabled = 1 ;
      edtavFecha_to_Jsonclick = "" ;
      edtavFecha_to_Enabled = 1 ;
      edtavFecha_Jsonclick = "" ;
      edtavFecha_Enabled = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Analisis Consumos, Compras, Stock final", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavCalstkini.setName( "vCALSTKINI" );
      chkavCalstkini.setWebtags( "" );
      chkavCalstkini.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavCalstkini.getInternalname(), "TitleCaption", chkavCalstkini.getCaption(), true);
      chkavCalstkini.setCheckedValue( "0" );
      AV5CalStkIni = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV5CalStkIni, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CalStkIni", GXutil.str( AV5CalStkIni, 1, 0));
      /* End function init_web_controls */
   }

   public void validv_Prdnumin( )
   {
      if ( (GXutil.strcmp("", hV12PrdNumIN)==0) )
      {
         AV12PrdNumIN = "" ;
      }
      else
      {
         A13747PrdCDsc = hV12PrdNumIN ;
         /* Using cursor H014M8 */
         pr_default.execute(6, new Object[] {A13747PrdCDsc});
         AV12PrdNumIN = H014M8_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(6) == 101) ) )
         {
            pr_default.readNext(6);
            if ( ! ( (pr_default.getStatus(6) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUMIN");
               GX_FocusControl = edtavPrdnumin_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(6);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV12PrdNumIN", hV12PrdNumIN);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV12PrdNumIN", GXutil.rtrim( AV12PrdNumIN));
      httpContext.ajax_rsp_assign_attri("", false, "hV12PrdNumIN", hV12PrdNumIN);
   }

   public void validv_Prdnumin_to( )
   {
      if ( (GXutil.strcmp("", hV13PrdNumIN_to)==0) )
      {
         AV13PrdNumIN_to = "" ;
      }
      else
      {
         A13747PrdCDsc = hV13PrdNumIN_to ;
         /* Using cursor H014M9 */
         pr_default.execute(7, new Object[] {A13747PrdCDsc});
         AV13PrdNumIN_to = H014M9_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(7) == 101) ) )
         {
            pr_default.readNext(7);
            if ( ! ( (pr_default.getStatus(7) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPRDNUMIN_TO");
               GX_FocusControl = edtavPrdnumin_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(7);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV13PrdNumIN_to", hV13PrdNumIN_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV13PrdNumIN_to", GXutil.rtrim( AV13PrdNumIN_to));
      httpContext.ajax_rsp_assign_attri("", false, "hV13PrdNumIN_to", hV13PrdNumIN_to);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV5CalStkIni',fld:'vCALSTKINI',pic:'9'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1214M2',iparms:[{av:'AV12PrdNumIN',fld:'vPRDNUMIN',pic:''},{av:'AV13PrdNumIN_to',fld:'vPRDNUMIN_TO',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6FECHA',fld:'vFECHA',pic:''},{av:'AV7FECHA_to',fld:'vFECHA_TO',pic:''},{av:'AV8LoteBusqueda',fld:'vLOTEBUSQUEDA',pic:''},{av:'AV5CalStkIni',fld:'vCALSTKINI',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{av:'AV17InformeInditex',fld:'vINFORMEINDITEX',pic:''},{ctrl:'WCWWUTI118_SDT_2'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1314M2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUMIN","{handler:'validv_Prdnumin',iparms:[{av:'hV12PrdNumIN'},{av:'AV12PrdNumIN',fld:'vPRDNUMIN',pic:''}]");
      setEventMetadata("VALIDV_PRDNUMIN",",oparms:[{av:'AV12PrdNumIN',fld:'vPRDNUMIN',pic:''},{av:'hV12PrdNumIN'}]}");
      setEventMetadata("VALIDV_PRDNUMIN_TO","{handler:'validv_Prdnumin_to',iparms:[{av:'hV13PrdNumIN_to'},{av:'AV13PrdNumIN_to',fld:'vPRDNUMIN_TO',pic:''}]");
      setEventMetadata("VALIDV_PRDNUMIN_TO",",oparms:[{av:'AV13PrdNumIN_to',fld:'vPRDNUMIN_TO',pic:''},{av:'hV13PrdNumIN_to'}]}");
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
      A13747PrdCDsc = "" ;
      hV12PrdNumIN = "" ;
      hV13PrdNumIN_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV16EmprCod = "" ;
      GXKey = "" ;
      AV12PrdNumIN = "" ;
      AV13PrdNumIN_to = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV6FECHA = GXutil.nullDate() ;
      AV7FECHA_to = GXutil.nullDate() ;
      AV8LoteBusqueda = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcwwuti118_sdt_2_Component = "" ;
      OldWcwwuti118_sdt_2 = "" ;
      AV26Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13747PrdCDsc = "" ;
      H014M2_A13747PrdCDsc = new String[] {""} ;
      H014M3_A13747PrdCDsc = new String[] {""} ;
      H014M4_A13747PrdCDsc = new String[] {""} ;
      H014M4_A396EmprCod = new String[] {""} ;
      H014M4_A719PrdNum = new String[] {""} ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      H014M5_A13747PrdCDsc = new String[] {""} ;
      H014M5_A396EmprCod = new String[] {""} ;
      H014M5_A719PrdNum = new String[] {""} ;
      H014M6_A13747PrdCDsc = new String[] {""} ;
      H014M6_A396EmprCod = new String[] {""} ;
      H014M6_A719PrdNum = new String[] {""} ;
      H014M7_A13747PrdCDsc = new String[] {""} ;
      H014M7_A396EmprCod = new String[] {""} ;
      H014M7_A719PrdNum = new String[] {""} ;
      AV19Station = "" ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV17InformeInditex = "" ;
      AV15PrdnumIN2 = "" ;
      AV14PrdNumIN_to2 = "" ;
      AV22ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXv_char4 = new String[1] ;
      AV18SdtInformeInditexCollection = new GXBaseCollection<app.SdtSDTInformeInditex>(app.SdtSDTInformeInditex.class, "SDTInformeInditex", "TexplusNET", remoteHandle);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H014M8_A13747PrdCDsc = new String[] {""} ;
      H014M8_A396EmprCod = new String[] {""} ;
      H014M8_A719PrdNum = new String[] {""} ;
      ZV12PrdNumIN = "" ;
      ZhV12PrdNumIN = "" ;
      H014M9_A13747PrdCDsc = new String[] {""} ;
      H014M9_A396EmprCod = new String[] {""} ;
      H014M9_A719PrdNum = new String[] {""} ;
      ZV13PrdNumIN_to = "" ;
      ZhV13PrdNumIN_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.webwuti118_sdt__default(),
         new Object[] {
             new Object[] {
            H014M2_A13747PrdCDsc
            }
            , new Object[] {
            H014M3_A13747PrdCDsc
            }
            , new Object[] {
            H014M4_A13747PrdCDsc, H014M4_A396EmprCod, H014M4_A719PrdNum
            }
            , new Object[] {
            H014M5_A13747PrdCDsc, H014M5_A396EmprCod, H014M5_A719PrdNum
            }
            , new Object[] {
            H014M6_A13747PrdCDsc, H014M6_A396EmprCod, H014M6_A719PrdNum
            }
            , new Object[] {
            H014M7_A13747PrdCDsc, H014M7_A396EmprCod, H014M7_A719PrdNum
            }
            , new Object[] {
            H014M8_A13747PrdCDsc, H014M8_A396EmprCod, H014M8_A719PrdNum
            }
            , new Object[] {
            H014M9_A13747PrdCDsc, H014M9_A396EmprCod, H014M9_A719PrdNum
            }
         }
      );
      AV26Pgmname = "StocksQuimicos.WebWUti118_SDT" ;
      /* GeneXus formulas. */
      AV26Pgmname = "StocksQuimicos.WebWUti118_SDT" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcwwuti118_sdt_2 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV5CalStkIni ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV23x ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavFecha_Enabled ;
   private int edtavFecha_to_Enabled ;
   private int edtavPrdnumin_Enabled ;
   private int edtavPrdnumin_to_Enabled ;
   private int edtavLotebusqueda_Enabled ;
   private int edtavPgmname_Enabled ;
   private int gxdynajaxindex ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV16EmprCod ;
   private String GXKey ;
   private String AV12PrdNumIN ;
   private String AV13PrdNumIN_to ;
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
   private String edtavFecha_Internalname ;
   private String TempTags ;
   private String edtavFecha_Jsonclick ;
   private String edtavFecha_to_Internalname ;
   private String edtavFecha_to_Jsonclick ;
   private String edtavPrdnumin_Internalname ;
   private String edtavPrdnumin_Jsonclick ;
   private String edtavPrdnumin_to_Internalname ;
   private String edtavPrdnumin_to_Jsonclick ;
   private String edtavLotebusqueda_Internalname ;
   private String AV8LoteBusqueda ;
   private String edtavLotebusqueda_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcwwuti118_sdt_2_Component ;
   private String OldWcwwuti118_sdt_2 ;
   private String edtavPgmname_Internalname ;
   private String AV26Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV19Station ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV15PrdnumIN2 ;
   private String AV14PrdNumIN_to2 ;
   private String GXv_char4[] ;
   private String ZV12PrdNumIN ;
   private String ZV13PrdNumIN_to ;
   private java.util.Date AV6FECHA ;
   private java.util.Date AV7FECHA_to ;
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
   private boolean bDynCreated_Wcwwuti118_sdt_2 ;
   private String A13747PrdCDsc ;
   private String hV12PrdNumIN ;
   private String hV13PrdNumIN_to ;
   private String l13747PrdCDsc ;
   private String AV17InformeInditex ;
   private String ZhV12PrdNumIN ;
   private String ZhV13PrdNumIN_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcwwuti118_sdt_2 ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV22ProgressIndicator ;
   private ICheckbox chkavCalstkini ;
   private IDataStoreProvider pr_default ;
   private String[] H014M2_A13747PrdCDsc ;
   private String[] H014M3_A13747PrdCDsc ;
   private String[] H014M4_A13747PrdCDsc ;
   private String[] H014M4_A396EmprCod ;
   private String[] H014M4_A719PrdNum ;
   private String[] H014M5_A13747PrdCDsc ;
   private String[] H014M5_A396EmprCod ;
   private String[] H014M5_A719PrdNum ;
   private String[] H014M6_A13747PrdCDsc ;
   private String[] H014M6_A396EmprCod ;
   private String[] H014M6_A719PrdNum ;
   private String[] H014M7_A13747PrdCDsc ;
   private String[] H014M7_A396EmprCod ;
   private String[] H014M7_A719PrdNum ;
   private String[] H014M8_A13747PrdCDsc ;
   private String[] H014M8_A396EmprCod ;
   private String[] H014M8_A719PrdNum ;
   private String[] H014M9_A13747PrdCDsc ;
   private String[] H014M9_A396EmprCod ;
   private String[] H014M9_A719PrdNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSDTInformeInditex> AV18SdtInformeInditexCollection ;
}

final  class webwuti118_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H014M2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (PrdNum >= '100000' and PrdNum <= '999999') ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE (UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?)) AND (PrdNum >= '100000' and PrdNum <= '999999') ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M4", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M5", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M6", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M7", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M8", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014M9", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE (RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ?) AND (PrdNum >= '100000' and PrdNum <= '999999') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
   }

}

