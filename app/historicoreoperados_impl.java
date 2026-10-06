package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoreoperados_impl extends GXDataArea
{
   public historicoreoperados_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoreoperados_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoreoperados_impl.class ));
   }

   public historicoreoperados_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod15R0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD_TO") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod_to15R0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD") == 0 )
         {
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcod15R0( A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD_TO") == 0 )
         {
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcod_to15R0( A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod15R0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD_TO") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod_to15R0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod15R0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD") == 0 )
         {
            hV19CliCod = httpContext.GetPar( "hV19CliCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicod15R2( hV19CliCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vCLICOD_TO") == 0 )
         {
            A13735CliCNom = httpContext.GetPar( "CliCNom") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvclicod_to15R0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD_TO") == 0 )
         {
            hV20CliCod_to = httpContext.GetPar( "hV20CliCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicod_to15R2( hV20CliCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD") == 0 )
         {
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcod15R0( A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPDEFCOD") == 0 )
         {
            hV23TipDefCod = httpContext.GetPar( "hV23TipDefCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipdefcod15R2( hV23TipDefCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPDEFCOD_TO") == 0 )
         {
            A13819TipdefDscI = httpContext.GetPar( "TipdefDscI") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipdefcod_to15R0( A13819TipdefDscI) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPDEFCOD_TO") == 0 )
         {
            hV24TipDefCod_to = httpContext.GetPar( "hV24TipDefCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipdefcod_to15R2( hV24TipDefCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod15R0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            hV26MaqCod = httpContext.GetPar( "hV26MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod15R2( hV26MaqCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD_TO") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod_to15R0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD_TO") == 0 )
         {
            hV27MaqCod_to = httpContext.GetPar( "hV27MaqCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod_to15R2( hV27MaqCod_to) ;
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
      pa15R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start15R2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoreoperados", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Emprcod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV38TipArtCod_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD_TO2", GXutil.rtrim( AV31Maqcod_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPDEFCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV30TipDefCod_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISREOFEC_TO2", localUtil.dtoc( AV29HisReoFec_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_TO2", GXutil.ltrim( localUtil.ntoc( AV28Clicod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD", GXutil.ltrim( localUtil.ntoc( AV19CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV20CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPDEFCOD", GXutil.ltrim( localUtil.ntoc( AV23TipDefCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPDEFCOD_TO", GXutil.ltrim( localUtil.ntoc( AV24TipDefCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV26MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD_TO", GXutil.rtrim( AV27MaqCod_to));
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
      if ( ! ( WebComp_Wchistoricoreoperadosclientes == null ) )
      {
         WebComp_Wchistoricoreoperadosclientes.componentjscripts();
      }
      if ( ! ( WebComp_Wchistoricoreoperadosmaquinas == null ) )
      {
         WebComp_Wchistoricoreoperadosmaquinas.componentjscripts();
      }
      if ( ! ( WebComp_Wchistoricoreoperadostipodefecto == null ) )
      {
         WebComp_Wchistoricoreoperadostipodefecto.componentjscripts();
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
         we15R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt15R2( ) ;
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
      return formatLink("app.historicoreoperados", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "HistoricoReoperados" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico Reoperados", "") ;
   }

   public void wb15R0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, hV19CliCod, GXutil.rtrim( localUtil.format( hV19CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_to_Internalname, httpContext.getMessage( "Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, hV20CliCod_to, GXutil.rtrim( localUtil.format( hV20CliCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisreofec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisreofec_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisreofec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisreofec_Internalname, localUtil.format(AV21HisReoFec, "99/99/99"), localUtil.format( AV21HisReoFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisreofec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisreofec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisreofec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisreofec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_HistoricoReoperados.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisreofec_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisreofec_to_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisreofec_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisreofec_to_Internalname, localUtil.format(AV22HisReoFec_to, "99/99/99"), localUtil.format( AV22HisReoFec_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisreofec_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisreofec_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisreofec_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisreofec_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_HistoricoReoperados.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdefcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipdefcod_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_Internalname, hV23TipDefCod, GXutil.rtrim( localUtil.format( hV23TipDefCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipdefcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipdefcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipdefcod_to_Internalname, httpContext.getMessage( "Defecto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipdefcod_to_Internalname, hV24TipDefCod_to, GXutil.rtrim( localUtil.format( hV24TipDefCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipdefcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipdefcod_to_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maquina Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV26MaqCod, GXutil.rtrim( localUtil.format( hV26MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_to_Internalname, httpContext.getMessage( "Maquina Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_to_Internalname, hV27MaqCod_to, GXutil.rtrim( localUtil.format( hV27MaqCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_to_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcod_Internalname, httpContext.getMessage( "Tipo Artículo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV36TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36TipArtCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36TipArtCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcod_to_Internalname, httpContext.getMessage( "Tipo Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV37TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37TipArtCod_to), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV37TipArtCod_to), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod_to_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisestreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisestreo.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisestreo, cmbavHisestreo.getInternalname(), GXutil.trim( GXutil.str( AV25HisEstReo, 1, 0)), 1, cmbavHisestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "", true, (byte)(0), "HLP_HistoricoReoperados.htm");
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV25HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 7, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1115r1_client"+"'", TempTags, "", 2, "HLP_HistoricoReoperados.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricoReoperados.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Clientes", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_HistoricoReoperados.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab01") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado1_Internalname, 1, 0, "px", divTableresultado1_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0101"+"", GXutil.rtrim( WebComp_Wchistoricoreoperadosclientes_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0101"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wchistoricoreoperadosclientes_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadosclientes), GXutil.lower( WebComp_Wchistoricoreoperadosclientes_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0101"+"");
               }
               WebComp_Wchistoricoreoperadosclientes.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadosclientes), GXutil.lower( WebComp_Wchistoricoreoperadosclientes_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab02_title_Internalname, httpContext.getMessage( "Maquinas", ""), "", "", lblTab02_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_HistoricoReoperados.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab02") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado2_Internalname, 1, 0, "px", divTableresultado2_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0109"+"", GXutil.rtrim( WebComp_Wchistoricoreoperadosmaquinas_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0109"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadosmaquinas), GXutil.lower( WebComp_Wchistoricoreoperadosmaquinas_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0109"+"");
               }
               WebComp_Wchistoricoreoperadosmaquinas.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadosmaquinas), GXutil.lower( WebComp_Wchistoricoreoperadosmaquinas_Component)) != 0 )
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab03_title_Internalname, httpContext.getMessage( "Defectos", ""), "", "", lblTab03_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_HistoricoReoperados.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab03") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABSContainer"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableresultado3_Internalname, 1, 0, "px", divTableresultado3_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0117"+"", GXutil.rtrim( WebComp_Wchistoricoreoperadostipodefecto_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0117"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadostipodefecto), GXutil.lower( WebComp_Wchistoricoreoperadostipodefecto_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0117"+"");
               }
               WebComp_Wchistoricoreoperadostipodefecto.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWchistoricoreoperadostipodefecto), GXutil.lower( WebComp_Wchistoricoreoperadostipodefecto_Component)) != 0 )
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

   public void start15R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Historico Reoperados", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup15R0( ) ;
   }

   public void ws15R2( )
   {
      start15R2( ) ;
      evt15R2( ) ;
   }

   public void evt15R2( )
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
                           e1215R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1315R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1415R2 ();
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
                     if ( nCmpId == 101 )
                     {
                        OldWchistoricoreoperadosclientes = httpContext.cgiGet( "W0101") ;
                        if ( ( GXutil.len( OldWchistoricoreoperadosclientes) == 0 ) || ( GXutil.strcmp(OldWchistoricoreoperadosclientes, WebComp_Wchistoricoreoperadosclientes_Component) != 0 ) )
                        {
                           WebComp_Wchistoricoreoperadosclientes = WebUtils.getWebComponent(getClass(), "app." + OldWchistoricoreoperadosclientes + "_impl", remoteHandle, context);
                           WebComp_Wchistoricoreoperadosclientes_Component = OldWchistoricoreoperadosclientes ;
                        }
                        if ( GXutil.len( WebComp_Wchistoricoreoperadosclientes_Component) != 0 )
                        {
                           WebComp_Wchistoricoreoperadosclientes.componentprocess("W0101", "", sEvt);
                        }
                        WebComp_Wchistoricoreoperadosclientes_Component = OldWchistoricoreoperadosclientes ;
                     }
                     else if ( nCmpId == 109 )
                     {
                        OldWchistoricoreoperadosmaquinas = httpContext.cgiGet( "W0109") ;
                        if ( ( GXutil.len( OldWchistoricoreoperadosmaquinas) == 0 ) || ( GXutil.strcmp(OldWchistoricoreoperadosmaquinas, WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 ) )
                        {
                           WebComp_Wchistoricoreoperadosmaquinas = WebUtils.getWebComponent(getClass(), "app." + OldWchistoricoreoperadosmaquinas + "_impl", remoteHandle, context);
                           WebComp_Wchistoricoreoperadosmaquinas_Component = OldWchistoricoreoperadosmaquinas ;
                        }
                        if ( GXutil.len( WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 )
                        {
                           WebComp_Wchistoricoreoperadosmaquinas.componentprocess("W0109", "", sEvt);
                        }
                        WebComp_Wchistoricoreoperadosmaquinas_Component = OldWchistoricoreoperadosmaquinas ;
                     }
                     else if ( nCmpId == 117 )
                     {
                        OldWchistoricoreoperadostipodefecto = httpContext.cgiGet( "W0117") ;
                        if ( ( GXutil.len( OldWchistoricoreoperadostipodefecto) == 0 ) || ( GXutil.strcmp(OldWchistoricoreoperadostipodefecto, WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 ) )
                        {
                           WebComp_Wchistoricoreoperadostipodefecto = WebUtils.getWebComponent(getClass(), "app." + OldWchistoricoreoperadostipodefecto + "_impl", remoteHandle, context);
                           WebComp_Wchistoricoreoperadostipodefecto_Component = OldWchistoricoreoperadostipodefecto ;
                        }
                        if ( GXutil.len( WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 )
                        {
                           WebComp_Wchistoricoreoperadostipodefecto.componentprocess("W0117", "", sEvt);
                        }
                        WebComp_Wchistoricoreoperadostipodefecto_Component = OldWchistoricoreoperadostipodefecto ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we15R2( )
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

   public void pa15R2( )
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
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvclicod15R0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod_data15R0( A13735CliCNom) ;
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

   protected void gxsgvvclicod_data15R0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H015R2 */
      pr_default.execute(0, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R2_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R2_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H015R2_A13735CliCNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvclicod_to15R0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod_to_data15R0( A13735CliCNom) ;
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

   protected void gxsgvvclicod_to_data15R0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H015R3 */
      pr_default.execute(1, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R3_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R3_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H015R3_A13735CliCNom[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvtipdefcod15R0( String A13819TipdefDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipdefcod_data15R0( A13819TipdefDscI) ;
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

   protected void gxsgvvtipdefcod_data15R0( String A13819TipdefDscI )
   {
      l13819TipdefDscI = GXutil.concat( GXutil.rtrim( A13819TipdefDscI), "%", "") ;
      /* Using cursor H015R4 */
      pr_default.execute(2, new Object[] {l13819TipdefDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R4_A13819TipdefDscI[0]) , GXutil.padr( "%" + GXutil.upper( A13819TipdefDscI) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R4_A13819TipdefDscI[0]);
            gxdynajaxctrldescr.add(H015R4_A13819TipdefDscI[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvtipdefcod_to15R0( String A13819TipdefDscI )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipdefcod_to_data15R0( A13819TipdefDscI) ;
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

   protected void gxsgvvtipdefcod_to_data15R0( String A13819TipdefDscI )
   {
      l13819TipdefDscI = GXutil.concat( GXutil.rtrim( A13819TipdefDscI), "%", "") ;
      /* Using cursor H015R5 */
      pr_default.execute(3, new Object[] {l13819TipdefDscI});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R5_A13819TipdefDscI[0]) , GXutil.padr( "%" + GXutil.upper( A13819TipdefDscI) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R5_A13819TipdefDscI[0]);
            gxdynajaxctrldescr.add(H015R5_A13819TipdefDscI[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgvvmaqcod15R0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_data15R0( A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_data15R0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H015R6 */
      pr_default.execute(4, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R6_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R6_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H015R6_A13734MaqCDsc[0]);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxsgvvmaqcod_to15R0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_to_data15R0( A13734MaqCDsc) ;
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

   protected void gxsgvvmaqcod_to_data15R0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H015R7 */
      pr_default.execute(5, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H015R7_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H015R7_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H015R7_A13734MaqCDsc[0]);
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxhcvvclicod15R2( String A13735CliCNom )
   {
      /* Using cursor H015R8 */
      pr_default.execute(6, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.strcmp(H015R8_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H015R8_A13735CliCNom[0] ;
            A396EmprCod = H015R8_A396EmprCod[0] ;
            A252CliCod = H015R8_A252CliCod[0] ;
         }
         pr_default.readNext(6);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcvvclicod_to15R2( String A13735CliCNom )
   {
      /* Using cursor H015R9 */
      pr_default.execute(7, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.strcmp(H015R9_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H015R9_A13735CliCNom[0] ;
            A396EmprCod = H015R9_A396EmprCod[0] ;
            A252CliCod = H015R9_A252CliCod[0] ;
         }
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcvvtipdefcod15R2( String A13819TipdefDscI )
   {
      /* Using cursor H015R10 */
      pr_default.execute(8, new Object[] {A13819TipdefDscI});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         if ( GXutil.strcmp(H015R10_A13819TipdefDscI[0], A13819TipdefDscI) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13819TipdefDscI = H015R10_A13819TipdefDscI[0] ;
            A396EmprCod = H015R10_A396EmprCod[0] ;
            A833TipDefCod = H015R10_A833TipDefCod[0] ;
         }
         pr_default.readNext(8);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(8);
   }

   public void gxhcvvtipdefcod_to15R2( String A13819TipdefDscI )
   {
      /* Using cursor H015R11 */
      pr_default.execute(9, new Object[] {A13819TipdefDscI});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         if ( GXutil.strcmp(H015R11_A13819TipdefDscI[0], A13819TipdefDscI) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13819TipdefDscI = H015R11_A13819TipdefDscI[0] ;
            A396EmprCod = H015R11_A396EmprCod[0] ;
            A833TipDefCod = H015R11_A833TipDefCod[0] ;
         }
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A833TipDefCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(9);
   }

   public void gxhcvvmaqcod15R2( String A13734MaqCDsc )
   {
      /* Using cursor H015R12 */
      pr_default.execute(10, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(10) != 101) )
      {
         if ( GXutil.strcmp(H015R12_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H015R12_A13734MaqCDsc[0] ;
            A396EmprCod = H015R12_A396EmprCod[0] ;
            A602MaqCod = H015R12_A602MaqCod[0] ;
         }
         pr_default.readNext(10);
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
      pr_default.close(10);
   }

   public void gxhcvvmaqcod_to15R2( String A13734MaqCDsc )
   {
      /* Using cursor H015R13 */
      pr_default.execute(11, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         if ( GXutil.strcmp(H015R13_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H015R13_A13734MaqCDsc[0] ;
            A396EmprCod = H015R13_A396EmprCod[0] ;
            A602MaqCod = H015R13_A602MaqCod[0] ;
         }
         pr_default.readNext(11);
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
      pr_default.close(11);
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
         AV25HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV25HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisestreo.setValue( GXutil.trim( GXutil.str( AV25HisEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisestreo.getInternalname(), "Values", cmbavHisestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf15R2( ) ;
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

   public void rf15R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wchistoricoreoperadosclientes_Component) != 0 )
            {
               WebComp_Wchistoricoreoperadosclientes.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 )
            {
               WebComp_Wchistoricoreoperadosmaquinas.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 )
            {
               WebComp_Wchistoricoreoperadostipodefecto.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1415R2 ();
         wb15R0( ) ;
      }
   }

   public void send_integrity_lvl_hashes15R2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Emprcod, "@!"))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup15R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1215R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV32Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
         AV38TipArtCod_to2 = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPARTCOD_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31Maqcod_to2 = httpContext.cgiGet( "vMAQCOD_TO2") ;
         AV30TipDefCod_to2 = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPDEFCOD_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29HisReoFec_to2 = localUtil.ctod( httpContext.cgiGet( "vHISREOFEC_TO2"), 0) ;
         AV28Clicod_to2 = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD_TO2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         hV19CliCod = httpContext.cgiGet( edtavClicod_Internalname) ;
         if ( (GXutil.strcmp("", hV19CliCod)==0) )
         {
            AV19CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = hV19CliCod ;
            /* Using cursor H015R14 */
            pr_default.execute(12, new Object[] {A13735CliCNom});
            AV19CliCod = H015R14_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               pr_default.readNext(12);
               if ( ! ( (pr_default.getStatus(12) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD");
                  GX_FocusControl = edtavClicod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(12);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV19CliCod", hV19CliCod);
         hV20CliCod_to = httpContext.cgiGet( edtavClicod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV20CliCod_to)==0) )
         {
            AV20CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod_to), 6, 0));
         }
         else
         {
            A13735CliCNom = hV20CliCod_to ;
            /* Using cursor H015R15 */
            pr_default.execute(13, new Object[] {A13735CliCNom});
            AV20CliCod_to = H015R15_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               pr_default.readNext(13);
               if ( ! ( (pr_default.getStatus(13) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD_TO");
                  GX_FocusControl = edtavClicod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(13);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV20CliCod_to", hV20CliCod_to);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisreofec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISREOFEC");
            GX_FocusControl = edtavHisreofec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21HisReoFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21HisReoFec", localUtil.format(AV21HisReoFec, "99/99/99"));
         }
         else
         {
            AV21HisReoFec = localUtil.ctod( httpContext.cgiGet( edtavHisreofec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21HisReoFec", localUtil.format(AV21HisReoFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavHisreofec_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHISREOFEC_TO");
            GX_FocusControl = edtavHisreofec_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22HisReoFec_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22HisReoFec_to", localUtil.format(AV22HisReoFec_to, "99/99/99"));
         }
         else
         {
            AV22HisReoFec_to = localUtil.ctod( httpContext.cgiGet( edtavHisreofec_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22HisReoFec_to", localUtil.format(AV22HisReoFec_to, "99/99/99"));
         }
         hV23TipDefCod = httpContext.cgiGet( edtavTipdefcod_Internalname) ;
         if ( (GXutil.strcmp("", hV23TipDefCod)==0) )
         {
            AV23TipDefCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TipDefCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TipDefCod), 4, 0));
         }
         else
         {
            A13819TipdefDscI = hV23TipDefCod ;
            /* Using cursor H015R16 */
            pr_default.execute(14, new Object[] {A13819TipdefDscI});
            AV23TipDefCod = H015R16_A833TipDefCod[0] ;
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD");
                  GX_FocusControl = edtavTipdefcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV23TipDefCod", hV23TipDefCod);
         hV24TipDefCod_to = httpContext.cgiGet( edtavTipdefcod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV24TipDefCod_to)==0) )
         {
            AV24TipDefCod_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TipDefCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TipDefCod_to), 4, 0));
         }
         else
         {
            A13819TipdefDscI = hV24TipDefCod_to ;
            /* Using cursor H015R17 */
            pr_default.execute(15, new Object[] {A13819TipdefDscI});
            AV24TipDefCod_to = H015R17_A833TipDefCod[0] ;
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               pr_default.readNext(15);
               if ( ! ( (pr_default.getStatus(15) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD_TO");
                  GX_FocusControl = edtavTipdefcod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(15);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV24TipDefCod_to", hV24TipDefCod_to);
         hV26MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV26MaqCod)==0) )
         {
            AV26MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26MaqCod", AV26MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV26MaqCod ;
            /* Using cursor H015R18 */
            pr_default.execute(16, new Object[] {A13734MaqCDsc});
            AV26MaqCod = H015R18_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV26MaqCod", hV26MaqCod);
         hV27MaqCod_to = httpContext.cgiGet( edtavMaqcod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV27MaqCod_to)==0) )
         {
            AV27MaqCod_to = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27MaqCod_to", AV27MaqCod_to);
         }
         else
         {
            A13734MaqCDsc = hV27MaqCod_to ;
            /* Using cursor H015R19 */
            pr_default.execute(17, new Object[] {A13734MaqCDsc});
            AV27MaqCod_to = H015R19_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               pr_default.readNext(17);
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD_TO");
                  GX_FocusControl = edtavMaqcod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(17);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV27MaqCod_to", hV27MaqCod_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD");
            GX_FocusControl = edtavTipartcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36TipArtCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TipArtCod), 4, 0));
         }
         else
         {
            AV36TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TipArtCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD_TO");
            GX_FocusControl = edtavTipartcod_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37TipArtCod_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TipArtCod_to), 4, 0));
         }
         else
         {
            AV37TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TipArtCod_to), 4, 0));
         }
         cmbavHisestreo.setValue( httpContext.cgiGet( cmbavHisestreo.getInternalname()) );
         AV25HisEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
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
      e1215R2 ();
      if (returnInSub) return;
   }

   public void e1215R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      historicoreoperados_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      GXv_char2[0] = AV32Emprcod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char4[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      historicoreoperados_impl.this.AV32Emprcod = GXv_char2[0] ;
      historicoreoperados_impl.this.AV34EmprNom = GXv_char3[0] ;
      historicoreoperados_impl.this.AV35UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Emprcod", AV32Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Emprcod, "@!"))));
      GXt_char1 = AV33Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      historicoreoperados_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Station = GXt_char1 ;
      GXv_char4[0] = AV32Emprcod ;
      GXv_char3[0] = AV34EmprNom ;
      GXv_char2[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char4, GXv_char3, GXv_char2) ;
      historicoreoperados_impl.this.AV32Emprcod = GXv_char4[0] ;
      historicoreoperados_impl.this.AV34EmprNom = GXv_char3[0] ;
      historicoreoperados_impl.this.AV35UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Emprcod", AV32Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32Emprcod, "@!"))));
      divTableresultado3_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableresultado3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado3_Height), 9, 0), true);
      divTableresultado2_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableresultado2_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado2_Height), 9, 0), true);
      divTableresultado1_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableresultado1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado1_Height), 9, 0), true);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchistoricoreoperadostipodefecto = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchistoricoreoperadostipodefecto_Component), GXutil.lower( "HistoricoReoperadosTipoDefecto")) != 0 )
      {
         WebComp_Wchistoricoreoperadostipodefecto = WebUtils.getWebComponent(getClass(), "app.historicoreoperadostipodefecto_impl", remoteHandle, context);
         WebComp_Wchistoricoreoperadostipodefecto_Component = "HistoricoReoperadosTipoDefecto" ;
      }
      if ( GXutil.len( WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 )
      {
         WebComp_Wchistoricoreoperadostipodefecto.setjustcreated();
         WebComp_Wchistoricoreoperadostipodefecto.componentprepare(new Object[] {"W0117","",AV32Emprcod,Integer.valueOf(AV19CliCod),Integer.valueOf(AV20CliCod_to),AV21HisReoFec,AV22HisReoFec_to,Short.valueOf(AV23TipDefCod),Short.valueOf(AV24TipDefCod_to),AV26MaqCod,AV27MaqCod_to,Short.valueOf(AV36TipArtCod),Short.valueOf(AV37TipArtCod_to),Byte.valueOf(AV25HisEstReo)});
         WebComp_Wchistoricoreoperadostipodefecto.componentbind(new Object[] {"","vCLICOD","vCLICOD_TO","vHISREOFEC","vHISREOFEC_TO","vTIPDEFCOD","vTIPDEFCOD_TO","vMAQCOD","vMAQCOD_TO","vTIPARTCOD","vTIPARTCOD_TO","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchistoricoreoperadosmaquinas = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchistoricoreoperadosmaquinas_Component), GXutil.lower( "HistoricoReoperadosMaquinas")) != 0 )
      {
         WebComp_Wchistoricoreoperadosmaquinas = WebUtils.getWebComponent(getClass(), "app.historicoreoperadosmaquinas_impl", remoteHandle, context);
         WebComp_Wchistoricoreoperadosmaquinas_Component = "HistoricoReoperadosMaquinas" ;
      }
      if ( GXutil.len( WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 )
      {
         WebComp_Wchistoricoreoperadosmaquinas.setjustcreated();
         WebComp_Wchistoricoreoperadosmaquinas.componentprepare(new Object[] {"W0109","",AV32Emprcod,Integer.valueOf(AV19CliCod),Integer.valueOf(AV20CliCod_to),AV21HisReoFec,AV22HisReoFec_to,Short.valueOf(AV23TipDefCod),Short.valueOf(AV24TipDefCod_to),AV26MaqCod,AV27MaqCod_to,Short.valueOf(AV36TipArtCod),Short.valueOf(AV37TipArtCod_to),Byte.valueOf(AV25HisEstReo)});
         WebComp_Wchistoricoreoperadosmaquinas.componentbind(new Object[] {"","vCLICOD","vCLICOD_TO","vHISREOFEC","vHISREOFEC_TO","vTIPDEFCOD","vTIPDEFCOD_TO","vMAQCOD","vMAQCOD_TO","vTIPARTCOD","vTIPARTCOD_TO","vHISESTREO"});
      }
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wchistoricoreoperadosclientes = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wchistoricoreoperadosclientes_Component), GXutil.lower( "HistoricoReoperadosClientes")) != 0 )
      {
         WebComp_Wchistoricoreoperadosclientes = WebUtils.getWebComponent(getClass(), "app.historicoreoperadosclientes_impl", remoteHandle, context);
         WebComp_Wchistoricoreoperadosclientes_Component = "HistoricoReoperadosClientes" ;
      }
      if ( GXutil.len( WebComp_Wchistoricoreoperadosclientes_Component) != 0 )
      {
         WebComp_Wchistoricoreoperadosclientes.setjustcreated();
         WebComp_Wchistoricoreoperadosclientes.componentprepare(new Object[] {"W0101","",AV32Emprcod,Integer.valueOf(AV19CliCod),Integer.valueOf(AV20CliCod_to),AV21HisReoFec,AV22HisReoFec_to,Short.valueOf(AV23TipDefCod),Short.valueOf(AV24TipDefCod_to),AV26MaqCod,AV27MaqCod_to,Short.valueOf(AV36TipArtCod),Short.valueOf(AV37TipArtCod_to),Byte.valueOf(AV25HisEstReo)});
         WebComp_Wchistoricoreoperadosclientes.componentbind(new Object[] {"","vCLICOD","vCLICOD_TO","vHISREOFEC","vHISREOFEC_TO","vTIPDEFCOD","vTIPDEFCOD_TO","vMAQCOD","vMAQCOD_TO","vTIPARTCOD","vTIPARTCOD_TO","vHISESTREO"});
      }
   }

   public void e1315R2( )
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

   protected void e1415R2( )
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
      pa15R2( ) ;
      ws15R2( ) ;
      we15R2( ) ;
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
      if ( ! ( WebComp_Wchistoricoreoperadosclientes == null ) )
      {
         if ( GXutil.len( WebComp_Wchistoricoreoperadosclientes_Component) != 0 )
         {
            WebComp_Wchistoricoreoperadosclientes.componentthemes();
         }
      }
      if ( ! ( WebComp_Wchistoricoreoperadosmaquinas == null ) )
      {
         if ( GXutil.len( WebComp_Wchistoricoreoperadosmaquinas_Component) != 0 )
         {
            WebComp_Wchistoricoreoperadosmaquinas.componentthemes();
         }
      }
      if ( ! ( WebComp_Wchistoricoreoperadostipodefecto == null ) )
      {
         if ( GXutil.len( WebComp_Wchistoricoreoperadostipodefecto_Component) != 0 )
         {
            WebComp_Wchistoricoreoperadostipodefecto.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016425148", true, true);
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
      httpContext.AddJavascriptSource("historicoreoperados.js", "?202661016425148", false, true);
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
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      edtavHisreofec_Internalname = "vHISREOFEC" ;
      edtavHisreofec_to_Internalname = "vHISREOFEC_TO" ;
      edtavTipdefcod_Internalname = "vTIPDEFCOD" ;
      edtavTipdefcod_to_Internalname = "vTIPDEFCOD_TO" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      edtavMaqcod_to_Internalname = "vMAQCOD_TO" ;
      edtavTipartcod_Internalname = "vTIPARTCOD" ;
      edtavTipartcod_to_Internalname = "vTIPARTCOD_TO" ;
      cmbavHisestreo.setInternalname( "vHISESTREO" );
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      lblTab02_title_Internalname = "TAB02_TITLE" ;
      divTableresultado2_Internalname = "TABLERESULTADO2" ;
      lblTab03_title_Internalname = "TAB03_TITLE" ;
      divTableresultado3_Internalname = "TABLERESULTADO3" ;
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
      divTableresultado3_Height = 0 ;
      divTableresultado2_Height = 0 ;
      divTableresultado1_Height = 0 ;
      cmbavHisestreo.setJsonclick( "" );
      cmbavHisestreo.setEnabled( 1 );
      edtavTipartcod_to_Jsonclick = "" ;
      edtavTipartcod_to_Enabled = 1 ;
      edtavTipartcod_Jsonclick = "" ;
      edtavTipartcod_Enabled = 1 ;
      edtavMaqcod_to_Jsonclick = "" ;
      edtavMaqcod_to_Enabled = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavTipdefcod_to_Jsonclick = "" ;
      edtavTipdefcod_to_Enabled = 1 ;
      edtavTipdefcod_Jsonclick = "" ;
      edtavTipdefcod_Enabled = 1 ;
      edtavHisreofec_to_Jsonclick = "" ;
      edtavHisreofec_to_Enabled = 1 ;
      edtavHisreofec_Jsonclick = "" ;
      edtavHisreofec_Enabled = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
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
      Gxuitabspanel_tabs_Pagecount = 3 ;
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
      Form.setCaption( httpContext.getMessage( "Historico Reoperados", "") );
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
      cmbavHisestreo.addItem("1", httpContext.getMessage( "Reoperados Internos (NC)", ""), (short)(0));
      cmbavHisestreo.addItem("2", httpContext.getMessage( "Reoperados Externos (RC)", ""), (short)(0));
      if ( cmbavHisestreo.getItemCount() > 0 )
      {
         AV25HisEstReo = (byte)(GXutil.lval( cmbavHisestreo.getValidValue(GXutil.trim( GXutil.str( AV25HisEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void validv_Clicod( )
   {
      if ( (GXutil.strcmp("", hV19CliCod)==0) )
      {
         AV19CliCod = 0 ;
      }
      else
      {
         A13735CliCNom = hV19CliCod ;
         /* Using cursor H015R20 */
         pr_default.execute(18, new Object[] {A13735CliCNom});
         AV19CliCod = H015R20_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV19CliCod", hV19CliCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliCod", GXutil.ltrim( localUtil.ntoc( AV19CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV19CliCod", hV19CliCod);
   }

   public void validv_Clicod_to( )
   {
      if ( (GXutil.strcmp("", hV20CliCod_to)==0) )
      {
         AV20CliCod_to = 0 ;
      }
      else
      {
         A13735CliCNom = hV20CliCod_to ;
         /* Using cursor H015R21 */
         pr_default.execute(19, new Object[] {A13735CliCNom});
         AV20CliCod_to = H015R21_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD_TO");
               GX_FocusControl = edtavClicod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV20CliCod_to", hV20CliCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod_to", GXutil.ltrim( localUtil.ntoc( AV20CliCod_to, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV20CliCod_to", hV20CliCod_to);
   }

   public void validv_Tipdefcod( )
   {
      if ( (GXutil.strcmp("", hV23TipDefCod)==0) )
      {
         AV23TipDefCod = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = hV23TipDefCod ;
         /* Using cursor H015R22 */
         pr_default.execute(20, new Object[] {A13819TipdefDscI});
         AV23TipDefCod = H015R22_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(20) == 101) ) )
         {
            pr_default.readNext(20);
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD");
               GX_FocusControl = edtavTipdefcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(20);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV23TipDefCod", hV23TipDefCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV23TipDefCod", GXutil.ltrim( localUtil.ntoc( AV23TipDefCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV23TipDefCod", hV23TipDefCod);
   }

   public void validv_Tipdefcod_to( )
   {
      if ( (GXutil.strcmp("", hV24TipDefCod_to)==0) )
      {
         AV24TipDefCod_to = (short)(0) ;
      }
      else
      {
         A13819TipdefDscI = hV24TipDefCod_to ;
         /* Using cursor H015R23 */
         pr_default.execute(21, new Object[] {A13819TipdefDscI});
         AV24TipDefCod_to = H015R23_A833TipDefCod[0] ;
         if ( ! ( (pr_default.getStatus(21) == 101) ) )
         {
            pr_default.readNext(21);
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vTIPDEFCOD_TO");
               GX_FocusControl = edtavTipdefcod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(21);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV24TipDefCod_to", hV24TipDefCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV24TipDefCod_to", GXutil.ltrim( localUtil.ntoc( AV24TipDefCod_to, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV24TipDefCod_to", hV24TipDefCod_to);
   }

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV26MaqCod)==0) )
      {
         AV26MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV26MaqCod ;
         /* Using cursor H015R24 */
         pr_default.execute(22, new Object[] {A13734MaqCDsc});
         AV26MaqCod = H015R24_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(22) == 101) ) )
         {
            pr_default.readNext(22);
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(22);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV26MaqCod", hV26MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV26MaqCod", GXutil.rtrim( AV26MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV26MaqCod", hV26MaqCod);
   }

   public void validv_Maqcod_to( )
   {
      if ( (GXutil.strcmp("", hV27MaqCod_to)==0) )
      {
         AV27MaqCod_to = "" ;
      }
      else
      {
         A13734MaqCDsc = hV27MaqCod_to ;
         /* Using cursor H015R25 */
         pr_default.execute(23, new Object[] {A13734MaqCDsc});
         AV27MaqCod_to = H015R25_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(23) == 101) ) )
         {
            pr_default.readNext(23);
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD_TO");
               GX_FocusControl = edtavMaqcod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(23);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV27MaqCod_to", hV27MaqCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV27MaqCod_to", GXutil.rtrim( AV27MaqCod_to));
      httpContext.ajax_rsp_assign_attri("", false, "hV27MaqCod_to", hV27MaqCod_to);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e1115R1',iparms:[{av:'AV20CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV22HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV24TipDefCod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'},{av:'AV27MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'AV37TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV32Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV21HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV23TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV36TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'cmbavHisestreo'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCHISTORICOREOPERADOSCLIENTES'},{ctrl:'WCHISTORICOREOPERADOSMAQUINAS'},{ctrl:'WCHISTORICOREOPERADOSTIPODEFECTO'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1315R2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[{av:'hV19CliCod'},{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[{av:'AV19CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'hV19CliCod'}]}");
      setEventMetadata("VALIDV_CLICOD_TO","{handler:'validv_Clicod_to',iparms:[{av:'hV20CliCod_to'},{av:'AV20CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICOD_TO",",oparms:[{av:'AV20CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'hV20CliCod_to'}]}");
      setEventMetadata("VALIDV_TIPDEFCOD","{handler:'validv_Tipdefcod',iparms:[{av:'hV23TipDefCod'},{av:'AV23TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_TIPDEFCOD",",oparms:[{av:'AV23TipDefCod',fld:'vTIPDEFCOD',pic:'ZZZ9'},{av:'hV23TipDefCod'}]}");
      setEventMetadata("VALIDV_TIPDEFCOD_TO","{handler:'validv_Tipdefcod_to',iparms:[{av:'hV24TipDefCod_to'},{av:'AV24TipDefCod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_TIPDEFCOD_TO",",oparms:[{av:'AV24TipDefCod_to',fld:'vTIPDEFCOD_TO',pic:'ZZZ9'},{av:'hV24TipDefCod_to'}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV26MaqCod'},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'hV26MaqCod'}]}");
      setEventMetadata("VALIDV_MAQCOD_TO","{handler:'validv_Maqcod_to',iparms:[{av:'hV27MaqCod_to'},{av:'AV27MaqCod_to',fld:'vMAQCOD_TO',pic:''}]");
      setEventMetadata("VALIDV_MAQCOD_TO",",oparms:[{av:'AV27MaqCod_to',fld:'vMAQCOD_TO',pic:''},{av:'hV27MaqCod_to'}]}");
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
      A13735CliCNom = "" ;
      A13819TipdefDscI = "" ;
      A13734MaqCDsc = "" ;
      hV19CliCod = "" ;
      hV20CliCod_to = "" ;
      hV23TipDefCod = "" ;
      hV24TipDefCod_to = "" ;
      hV26MaqCod = "" ;
      hV27MaqCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV32Emprcod = "" ;
      GXKey = "" ;
      AV31Maqcod_to2 = "" ;
      AV29HisReoFec_to2 = GXutil.nullDate() ;
      AV26MaqCod = "" ;
      AV27MaqCod_to = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV21HisReoFec = GXutil.nullDate() ;
      AV22HisReoFec_to = GXutil.nullDate() ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wchistoricoreoperadosclientes_Component = "" ;
      OldWchistoricoreoperadosclientes = "" ;
      lblTab02_title_Jsonclick = "" ;
      WebComp_Wchistoricoreoperadosmaquinas_Component = "" ;
      OldWchistoricoreoperadosmaquinas = "" ;
      lblTab03_title_Jsonclick = "" ;
      WebComp_Wchistoricoreoperadostipodefecto_Component = "" ;
      OldWchistoricoreoperadostipodefecto = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13735CliCNom = "" ;
      H015R2_A13735CliCNom = new String[] {""} ;
      H015R3_A13735CliCNom = new String[] {""} ;
      l13819TipdefDscI = "" ;
      H015R4_A13819TipdefDscI = new String[] {""} ;
      H015R5_A13819TipdefDscI = new String[] {""} ;
      l13734MaqCDsc = "" ;
      H015R6_A13734MaqCDsc = new String[] {""} ;
      H015R7_A13734MaqCDsc = new String[] {""} ;
      H015R8_A13735CliCNom = new String[] {""} ;
      H015R8_A396EmprCod = new String[] {""} ;
      H015R8_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      H015R9_A13735CliCNom = new String[] {""} ;
      H015R9_A396EmprCod = new String[] {""} ;
      H015R9_A252CliCod = new int[1] ;
      H015R10_A13819TipdefDscI = new String[] {""} ;
      H015R10_A396EmprCod = new String[] {""} ;
      H015R10_A833TipDefCod = new short[1] ;
      H015R11_A13819TipdefDscI = new String[] {""} ;
      H015R11_A396EmprCod = new String[] {""} ;
      H015R11_A833TipDefCod = new short[1] ;
      H015R12_A13734MaqCDsc = new String[] {""} ;
      H015R12_A396EmprCod = new String[] {""} ;
      H015R12_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      H015R13_A13734MaqCDsc = new String[] {""} ;
      H015R13_A396EmprCod = new String[] {""} ;
      H015R13_A602MaqCod = new String[] {""} ;
      H015R14_A13735CliCNom = new String[] {""} ;
      H015R14_A396EmprCod = new String[] {""} ;
      H015R14_A252CliCod = new int[1] ;
      H015R15_A13735CliCNom = new String[] {""} ;
      H015R15_A396EmprCod = new String[] {""} ;
      H015R15_A252CliCod = new int[1] ;
      H015R16_A13819TipdefDscI = new String[] {""} ;
      H015R16_A396EmprCod = new String[] {""} ;
      H015R16_A833TipDefCod = new short[1] ;
      H015R17_A13819TipdefDscI = new String[] {""} ;
      H015R17_A396EmprCod = new String[] {""} ;
      H015R17_A833TipDefCod = new short[1] ;
      H015R18_A13734MaqCDsc = new String[] {""} ;
      H015R18_A396EmprCod = new String[] {""} ;
      H015R18_A602MaqCod = new String[] {""} ;
      H015R19_A13734MaqCDsc = new String[] {""} ;
      H015R19_A396EmprCod = new String[] {""} ;
      H015R19_A602MaqCod = new String[] {""} ;
      AV33Station = "" ;
      AV34EmprNom = "" ;
      AV35UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H015R20_A13735CliCNom = new String[] {""} ;
      H015R20_A396EmprCod = new String[] {""} ;
      H015R20_A252CliCod = new int[1] ;
      ZhV19CliCod = "" ;
      H015R21_A13735CliCNom = new String[] {""} ;
      H015R21_A396EmprCod = new String[] {""} ;
      H015R21_A252CliCod = new int[1] ;
      ZhV20CliCod_to = "" ;
      H015R22_A13819TipdefDscI = new String[] {""} ;
      H015R22_A396EmprCod = new String[] {""} ;
      H015R22_A833TipDefCod = new short[1] ;
      ZhV23TipDefCod = "" ;
      H015R23_A13819TipdefDscI = new String[] {""} ;
      H015R23_A396EmprCod = new String[] {""} ;
      H015R23_A833TipDefCod = new short[1] ;
      ZhV24TipDefCod_to = "" ;
      H015R24_A13734MaqCDsc = new String[] {""} ;
      H015R24_A396EmprCod = new String[] {""} ;
      H015R24_A602MaqCod = new String[] {""} ;
      ZV26MaqCod = "" ;
      ZhV26MaqCod = "" ;
      H015R25_A13734MaqCDsc = new String[] {""} ;
      H015R25_A396EmprCod = new String[] {""} ;
      H015R25_A602MaqCod = new String[] {""} ;
      ZV27MaqCod_to = "" ;
      ZhV27MaqCod_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoreoperados__default(),
         new Object[] {
             new Object[] {
            H015R2_A13735CliCNom
            }
            , new Object[] {
            H015R3_A13735CliCNom
            }
            , new Object[] {
            H015R4_A13819TipdefDscI
            }
            , new Object[] {
            H015R5_A13819TipdefDscI
            }
            , new Object[] {
            H015R6_A13734MaqCDsc
            }
            , new Object[] {
            H015R7_A13734MaqCDsc
            }
            , new Object[] {
            H015R8_A13735CliCNom, H015R8_A396EmprCod, H015R8_A252CliCod
            }
            , new Object[] {
            H015R9_A13735CliCNom, H015R9_A396EmprCod, H015R9_A252CliCod
            }
            , new Object[] {
            H015R10_A13819TipdefDscI, H015R10_A396EmprCod, H015R10_A833TipDefCod
            }
            , new Object[] {
            H015R11_A13819TipdefDscI, H015R11_A396EmprCod, H015R11_A833TipDefCod
            }
            , new Object[] {
            H015R12_A13734MaqCDsc, H015R12_A396EmprCod, H015R12_A602MaqCod
            }
            , new Object[] {
            H015R13_A13734MaqCDsc, H015R13_A396EmprCod, H015R13_A602MaqCod
            }
            , new Object[] {
            H015R14_A13735CliCNom, H015R14_A396EmprCod, H015R14_A252CliCod
            }
            , new Object[] {
            H015R15_A13735CliCNom, H015R15_A396EmprCod, H015R15_A252CliCod
            }
            , new Object[] {
            H015R16_A13819TipdefDscI, H015R16_A396EmprCod, H015R16_A833TipDefCod
            }
            , new Object[] {
            H015R17_A13819TipdefDscI, H015R17_A396EmprCod, H015R17_A833TipDefCod
            }
            , new Object[] {
            H015R18_A13734MaqCDsc, H015R18_A396EmprCod, H015R18_A602MaqCod
            }
            , new Object[] {
            H015R19_A13734MaqCDsc, H015R19_A396EmprCod, H015R19_A602MaqCod
            }
            , new Object[] {
            H015R20_A13735CliCNom, H015R20_A396EmprCod, H015R20_A252CliCod
            }
            , new Object[] {
            H015R21_A13735CliCNom, H015R21_A396EmprCod, H015R21_A252CliCod
            }
            , new Object[] {
            H015R22_A13819TipdefDscI, H015R22_A396EmprCod, H015R22_A833TipDefCod
            }
            , new Object[] {
            H015R23_A13819TipdefDscI, H015R23_A396EmprCod, H015R23_A833TipDefCod
            }
            , new Object[] {
            H015R24_A13734MaqCDsc, H015R24_A396EmprCod, H015R24_A602MaqCod
            }
            , new Object[] {
            H015R25_A13734MaqCDsc, H015R25_A396EmprCod, H015R25_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wchistoricoreoperadosclientes = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wchistoricoreoperadosmaquinas = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wchistoricoreoperadostipodefecto = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV25HisEstReo ;
   private byte nDonePA ;
   private byte nGXWrapped ;
   private short AV38TipArtCod_to2 ;
   private short AV30TipDefCod_to2 ;
   private short AV23TipDefCod ;
   private short AV24TipDefCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36TipArtCod ;
   private short AV37TipArtCod_to ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short A833TipDefCod ;
   private short Gx_err ;
   private short ZV23TipDefCod ;
   private short ZV24TipDefCod_to ;
   private int AV28Clicod_to2 ;
   private int AV19CliCod ;
   private int AV20CliCod_to ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavClicod_Enabled ;
   private int edtavClicod_to_Enabled ;
   private int edtavHisreofec_Enabled ;
   private int edtavHisreofec_to_Enabled ;
   private int edtavTipdefcod_Enabled ;
   private int edtavTipdefcod_to_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqcod_to_Enabled ;
   private int edtavTipartcod_Enabled ;
   private int edtavTipartcod_to_Enabled ;
   private int divTableresultado1_Height ;
   private int divTableresultado2_Height ;
   private int divTableresultado3_Height ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int idxLst ;
   private int ZV19CliCod ;
   private int ZV20CliCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV32Emprcod ;
   private String GXKey ;
   private String AV31Maqcod_to2 ;
   private String AV26MaqCod ;
   private String AV27MaqCod_to ;
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
   private String edtavClicod_Internalname ;
   private String TempTags ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String edtavHisreofec_Internalname ;
   private String edtavHisreofec_Jsonclick ;
   private String edtavHisreofec_to_Internalname ;
   private String edtavHisreofec_to_Jsonclick ;
   private String edtavTipdefcod_Internalname ;
   private String edtavTipdefcod_Jsonclick ;
   private String edtavTipdefcod_to_Internalname ;
   private String edtavTipdefcod_to_Jsonclick ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqcod_to_Internalname ;
   private String edtavMaqcod_to_Jsonclick ;
   private String edtavTipartcod_Internalname ;
   private String edtavTipartcod_Jsonclick ;
   private String edtavTipartcod_to_Internalname ;
   private String edtavTipartcod_to_Jsonclick ;
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
   private String WebComp_Wchistoricoreoperadosclientes_Component ;
   private String OldWchistoricoreoperadosclientes ;
   private String lblTab02_title_Internalname ;
   private String lblTab02_title_Jsonclick ;
   private String divTableresultado2_Internalname ;
   private String WebComp_Wchistoricoreoperadosmaquinas_Component ;
   private String OldWchistoricoreoperadosmaquinas ;
   private String lblTab03_title_Internalname ;
   private String lblTab03_title_Jsonclick ;
   private String divTableresultado3_Internalname ;
   private String WebComp_Wchistoricoreoperadostipodefecto_Component ;
   private String OldWchistoricoreoperadostipodefecto ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV33Station ;
   private String AV34EmprNom ;
   private String AV35UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV26MaqCod ;
   private String ZV27MaqCod_to ;
   private java.util.Date AV29HisReoFec_to2 ;
   private java.util.Date AV21HisReoFec ;
   private java.util.Date AV22HisReoFec_to ;
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
   private boolean bDynCreated_Wchistoricoreoperadostipodefecto ;
   private boolean bDynCreated_Wchistoricoreoperadosmaquinas ;
   private boolean bDynCreated_Wchistoricoreoperadosclientes ;
   private String A13735CliCNom ;
   private String A13819TipdefDscI ;
   private String A13734MaqCDsc ;
   private String hV19CliCod ;
   private String hV20CliCod_to ;
   private String hV23TipDefCod ;
   private String hV24TipDefCod_to ;
   private String hV26MaqCod ;
   private String hV27MaqCod_to ;
   private String l13735CliCNom ;
   private String l13819TipdefDscI ;
   private String l13734MaqCDsc ;
   private String ZhV19CliCod ;
   private String ZhV20CliCod_to ;
   private String ZhV23TipDefCod ;
   private String ZhV24TipDefCod_to ;
   private String ZhV26MaqCod ;
   private String ZhV27MaqCod_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wchistoricoreoperadosclientes ;
   private GXWebComponent WebComp_Wchistoricoreoperadosmaquinas ;
   private GXWebComponent WebComp_Wchistoricoreoperadostipodefecto ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private HTMLChoice cmbavHisestreo ;
   private IDataStoreProvider pr_default ;
   private String[] H015R2_A13735CliCNom ;
   private String[] H015R3_A13735CliCNom ;
   private String[] H015R4_A13819TipdefDscI ;
   private String[] H015R5_A13819TipdefDscI ;
   private String[] H015R6_A13734MaqCDsc ;
   private String[] H015R7_A13734MaqCDsc ;
   private String[] H015R8_A13735CliCNom ;
   private String[] H015R8_A396EmprCod ;
   private int[] H015R8_A252CliCod ;
   private String[] H015R9_A13735CliCNom ;
   private String[] H015R9_A396EmprCod ;
   private int[] H015R9_A252CliCod ;
   private String[] H015R10_A13819TipdefDscI ;
   private String[] H015R10_A396EmprCod ;
   private short[] H015R10_A833TipDefCod ;
   private String[] H015R11_A13819TipdefDscI ;
   private String[] H015R11_A396EmprCod ;
   private short[] H015R11_A833TipDefCod ;
   private String[] H015R12_A13734MaqCDsc ;
   private String[] H015R12_A396EmprCod ;
   private String[] H015R12_A602MaqCod ;
   private String[] H015R13_A13734MaqCDsc ;
   private String[] H015R13_A396EmprCod ;
   private String[] H015R13_A602MaqCod ;
   private String[] H015R14_A13735CliCNom ;
   private String[] H015R14_A396EmprCod ;
   private int[] H015R14_A252CliCod ;
   private String[] H015R15_A13735CliCNom ;
   private String[] H015R15_A396EmprCod ;
   private int[] H015R15_A252CliCod ;
   private String[] H015R16_A13819TipdefDscI ;
   private String[] H015R16_A396EmprCod ;
   private short[] H015R16_A833TipDefCod ;
   private String[] H015R17_A13819TipdefDscI ;
   private String[] H015R17_A396EmprCod ;
   private short[] H015R17_A833TipDefCod ;
   private String[] H015R18_A13734MaqCDsc ;
   private String[] H015R18_A396EmprCod ;
   private String[] H015R18_A602MaqCod ;
   private String[] H015R19_A13734MaqCDsc ;
   private String[] H015R19_A396EmprCod ;
   private String[] H015R19_A602MaqCod ;
   private String[] H015R20_A13735CliCNom ;
   private String[] H015R20_A396EmprCod ;
   private int[] H015R20_A252CliCod ;
   private String[] H015R21_A13735CliCNom ;
   private String[] H015R21_A396EmprCod ;
   private int[] H015R21_A252CliCod ;
   private String[] H015R22_A13819TipdefDscI ;
   private String[] H015R22_A396EmprCod ;
   private short[] H015R22_A833TipDefCod ;
   private String[] H015R23_A13819TipdefDscI ;
   private String[] H015R23_A396EmprCod ;
   private short[] H015R23_A833TipDefCod ;
   private String[] H015R24_A13734MaqCDsc ;
   private String[] H015R24_A396EmprCod ;
   private String[] H015R24_A602MaqCod ;
   private String[] H015R25_A13734MaqCDsc ;
   private String[] H015R25_A396EmprCod ;
   private String[] H015R25_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class historicoreoperados__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015R2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?) ORDER BY CliCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?) ORDER BY CliCNom) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI FROM TXPTIPDEF WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, '')))) like '%' || UPPER(?) ORDER BY TipdefDscI) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI FROM TXPTIPDEF WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, '')))) like '%' || UPPER(?) ORDER BY TipdefDscI) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R6", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?) ORDER BY MaqCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R7", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?) ORDER BY MaqCDsc) WHERE rownum <= 20 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R8", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R9", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R12", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R13", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R16", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R18", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R19", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R20", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R21", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R23", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) AS TipdefDscI, EmprCod, TipDefCod FROM TXPTIPDEF WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipDefCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipDefDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R24", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015R25", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 40);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
      }
   }

}

