package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwprdt10_impl extends GXDataArea
{
   public webwprdt10_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwprdt10_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwprdt10_impl.class ));
   }

   public webwprdt10_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHisproreo = new HTMLChoice();
      cmbavTipinf = new HTMLChoice();
      chkavExcel = UIFactory.getCheckbox(this);
      cmbavOpi = new HTMLChoice();
      chkavDiahorafin = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPMAQ") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpmaq14D0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUMAQ") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvumaq14D0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCODI") == 0 )
         {
            A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodi14D0( A13751ArtCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCODF") == 0 )
         {
            A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodf14D0( A13751ArtCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPMAQCOD") == 0 )
         {
            A13835TipMaqCDsc = httpContext.GetPar( "TipMaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipmaqcod14D0( A13835TipMaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPMAQ") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpmaq14D0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPMAQ") == 0 )
         {
            hV59Pmaq = httpContext.GetPar( "hV59Pmaq") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvpmaq14D2( hV59Pmaq) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUMAQ") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvumaq14D0( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vUMAQ") == 0 )
         {
            hV74Umaq = httpContext.GetPar( "hV74Umaq") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvumaq14D2( hV74Umaq) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCODI") == 0 )
         {
            A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodi14D0( A13751ArtCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vARTCODI") == 0 )
         {
            hV6ArtCodi = httpContext.GetPar( "hV6ArtCodi") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvartcodi14D2( hV6ArtCodi) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vARTCODF") == 0 )
         {
            A13751ArtCDsc = httpContext.GetPar( "ArtCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvartcodf14D0( A13751ArtCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vARTCODF") == 0 )
         {
            hV5Artcodf = httpContext.GetPar( "hV5Artcodf") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvartcodf14D2( hV5Artcodf) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPMAQCOD") == 0 )
         {
            A13835TipMaqCDsc = httpContext.GetPar( "TipMaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipmaqcod14D0( A13835TipMaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPMAQCOD") == 0 )
         {
            hV68TipMaqCod = httpContext.GetPar( "hV68TipMaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipmaqcod14D2( hV68TipMaqCod) ;
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
      pa14D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start14D2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwprdt10", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101Pgmdesc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETALLEDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Detalledefectos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTURAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Tinturas), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vGENERARINFORME", AV94GenerarInforme);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV101Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101Pgmdesc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV79UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV21EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUMAQ2", GXutil.rtrim( AV75Umaq2));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILENAME", GXutil.rtrim( AV25Filename));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANOM", GXutil.rtrim( AV58PlaNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETALLEDEFECTOS", GXutil.ltrim( localUtil.ntoc( AV17Detalledefectos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETALLEDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Detalledefectos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTURAS", GXutil.ltrim( localUtil.ntoc( AV65Tinturas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTURAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Tinturas), "9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vABRIRVENTANA", AV85AbrirVentana);
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPMAQ", GXutil.rtrim( AV59Pmaq));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvUMAQ", GXutil.rtrim( AV74Umaq));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvARTCODI", GXutil.rtrim( AV6ArtCodi));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvARTCODF", GXutil.rtrim( AV5Artcodf));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPMAQCOD", GXutil.rtrim( AV68TipMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Width", GXutil.rtrim( Dvpanel_panelgenerales_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Autowidth", GXutil.booltostr( Dvpanel_panelgenerales_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Autoheight", GXutil.booltostr( Dvpanel_panelgenerales_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Cls", GXutil.rtrim( Dvpanel_panelgenerales_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Title", GXutil.rtrim( Dvpanel_panelgenerales_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Collapsible", GXutil.booltostr( Dvpanel_panelgenerales_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Collapsed", GXutil.booltostr( Dvpanel_panelgenerales_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelgenerales_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Iconposition", GXutil.rtrim( Dvpanel_panelgenerales_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELGENERALES_Autoscroll", GXutil.booltostr( Dvpanel_panelgenerales_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Width", GXutil.rtrim( Dvpanel_panelmasopciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Autowidth", GXutil.booltostr( Dvpanel_panelmasopciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Autoheight", GXutil.booltostr( Dvpanel_panelmasopciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Cls", GXutil.rtrim( Dvpanel_panelmasopciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Title", GXutil.rtrim( Dvpanel_panelmasopciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Collapsible", GXutil.booltostr( Dvpanel_panelmasopciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Collapsed", GXutil.booltostr( Dvpanel_panelmasopciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelmasopciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Iconposition", GXutil.rtrim( Dvpanel_panelmasopciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELMASOPCIONES_Autoscroll", GXutil.booltostr( Dvpanel_panelmasopciones_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Width", GXutil.rtrim( Dvpanel_panelacciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autowidth", GXutil.booltostr( Dvpanel_panelacciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autoheight", GXutil.booltostr( Dvpanel_panelacciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Cls", GXutil.rtrim( Dvpanel_panelacciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Title", GXutil.rtrim( Dvpanel_panelacciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Collapsible", GXutil.booltostr( Dvpanel_panelacciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Collapsed", GXutil.booltostr( Dvpanel_panelacciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_panelacciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Iconposition", GXutil.rtrim( Dvpanel_panelacciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELACCIONES_Autoscroll", GXutil.booltostr( Dvpanel_panelacciones_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Width", GXutil.rtrim( Dvpanel_pnl1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autowidth", GXutil.booltostr( Dvpanel_pnl1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoheight", GXutil.booltostr( Dvpanel_pnl1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Cls", GXutil.rtrim( Dvpanel_pnl1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Title", GXutil.rtrim( Dvpanel_pnl1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsible", GXutil.booltostr( Dvpanel_pnl1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Collapsed", GXutil.booltostr( Dvpanel_pnl1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Showcollapseicon", GXutil.booltostr( Dvpanel_pnl1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Iconposition", GXutil.rtrim( Dvpanel_pnl1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNL1_Autoscroll", GXutil.booltostr( Dvpanel_pnl1_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Width", GXutil.rtrim( Dvpanel_tipoinforme_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Autowidth", GXutil.booltostr( Dvpanel_tipoinforme_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Autoheight", GXutil.booltostr( Dvpanel_tipoinforme_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Cls", GXutil.rtrim( Dvpanel_tipoinforme_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Title", GXutil.rtrim( Dvpanel_tipoinforme_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Collapsible", GXutil.booltostr( Dvpanel_tipoinforme_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Collapsed", GXutil.booltostr( Dvpanel_tipoinforme_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Showcollapseicon", GXutil.booltostr( Dvpanel_tipoinforme_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Iconposition", GXutil.rtrim( Dvpanel_tipoinforme_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TIPOINFORME_Autoscroll", GXutil.booltostr( Dvpanel_tipoinforme_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Width", GXutil.rtrim( Dvpanel_panelresultados_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Autowidth", GXutil.booltostr( Dvpanel_panelresultados_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Autoheight", GXutil.booltostr( Dvpanel_panelresultados_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Cls", GXutil.rtrim( Dvpanel_panelresultados_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Title", GXutil.rtrim( Dvpanel_panelresultados_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Collapsible", GXutil.booltostr( Dvpanel_panelresultados_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Collapsed", GXutil.booltostr( Dvpanel_panelresultados_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Showcollapseicon", GXutil.booltostr( Dvpanel_panelresultados_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Iconposition", GXutil.rtrim( Dvpanel_panelresultados_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELRESULTADOS_Autoscroll", GXutil.booltostr( Dvpanel_panelresultados_Autoscroll));
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
         we14D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt14D2( ) ;
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
      return formatLink("app.webwprdt10", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWPRDT10" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") ;
   }

   public void wb14D0( )
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
         ucDvpanel_pnl1.setProperty("Width", Dvpanel_pnl1_Width);
         ucDvpanel_pnl1.setProperty("AutoWidth", Dvpanel_pnl1_Autowidth);
         ucDvpanel_pnl1.setProperty("AutoHeight", Dvpanel_pnl1_Autoheight);
         ucDvpanel_pnl1.setProperty("Cls", Dvpanel_pnl1_Cls);
         ucDvpanel_pnl1.setProperty("Title", Dvpanel_pnl1_Title);
         ucDvpanel_pnl1.setProperty("Collapsible", Dvpanel_pnl1_Collapsible);
         ucDvpanel_pnl1.setProperty("Collapsed", Dvpanel_pnl1_Collapsed);
         ucDvpanel_pnl1.setProperty("ShowCollapseIcon", Dvpanel_pnl1_Showcollapseicon);
         ucDvpanel_pnl1.setProperty("IconPosition", Dvpanel_pnl1_Iconposition);
         ucDvpanel_pnl1.setProperty("AutoScroll", Dvpanel_pnl1_Autoscroll);
         ucDvpanel_pnl1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnl1_Internalname, "DVPANEL_PNL1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNL1Container"+"pnl1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPnl1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelgenerales.setProperty("Width", Dvpanel_panelgenerales_Width);
         ucDvpanel_panelgenerales.setProperty("AutoWidth", Dvpanel_panelgenerales_Autowidth);
         ucDvpanel_panelgenerales.setProperty("AutoHeight", Dvpanel_panelgenerales_Autoheight);
         ucDvpanel_panelgenerales.setProperty("Cls", Dvpanel_panelgenerales_Cls);
         ucDvpanel_panelgenerales.setProperty("Title", Dvpanel_panelgenerales_Title);
         ucDvpanel_panelgenerales.setProperty("Collapsible", Dvpanel_panelgenerales_Collapsible);
         ucDvpanel_panelgenerales.setProperty("Collapsed", Dvpanel_panelgenerales_Collapsed);
         ucDvpanel_panelgenerales.setProperty("ShowCollapseIcon", Dvpanel_panelgenerales_Showcollapseicon);
         ucDvpanel_panelgenerales.setProperty("IconPosition", Dvpanel_panelgenerales_Iconposition);
         ucDvpanel_panelgenerales.setProperty("AutoScroll", Dvpanel_panelgenerales_Autoscroll);
         ucDvpanel_panelgenerales.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelgenerales_Internalname, "DVPANEL_PANELGENERALESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELGENERALESContainer"+"PanelGenerales"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelgenerales_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divRangomaquina_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmaq_Internalname, httpContext.getMessage( "Primera Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmaq_Internalname, hV59Pmaq, GXutil.rtrim( localUtil.format( hV59Pmaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmaq_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUmaq_Internalname, httpContext.getMessage( "Última Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUmaq_Internalname, hV74Umaq, GXutil.rtrim( localUtil.format( hV74Umaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUmaq_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divRangofecha_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablahorainicialfinal_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodti_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV32Hisprodti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV32Hisprodti, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWPRDT10.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_Internalname, httpContext.getMessage( "Fecha Final", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV31HisProDtF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV31HisProDtF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHisprodtf_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavHisprodtf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWPRDT10.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHisproreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHisproreo.getInternalname(), httpContext.getMessage( "Tipo Reoperado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHisproreo, cmbavHisproreo.getInternalname(), GXutil.trim( GXutil.str( AV95HisProReo, 1, 0)), 1, cmbavHisproreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavHisproreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "", true, (byte)(0), "HLP_WebWPRDT10.htm");
         cmbavHisproreo.setValue( GXutil.trim( GXutil.str( AV95HisProReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisproreo.getInternalname(), "Values", cmbavHisproreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabladiahorafin_Internalname, divTabladiahorafin_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_panelmasopciones_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_panelmasopciones_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelmasopciones.setProperty("Width", Dvpanel_panelmasopciones_Width);
         ucDvpanel_panelmasopciones.setProperty("AutoWidth", Dvpanel_panelmasopciones_Autowidth);
         ucDvpanel_panelmasopciones.setProperty("AutoHeight", Dvpanel_panelmasopciones_Autoheight);
         ucDvpanel_panelmasopciones.setProperty("Cls", Dvpanel_panelmasopciones_Cls);
         ucDvpanel_panelmasopciones.setProperty("Title", Dvpanel_panelmasopciones_Title);
         ucDvpanel_panelmasopciones.setProperty("Collapsible", Dvpanel_panelmasopciones_Collapsible);
         ucDvpanel_panelmasopciones.setProperty("Collapsed", Dvpanel_panelmasopciones_Collapsed);
         ucDvpanel_panelmasopciones.setProperty("ShowCollapseIcon", Dvpanel_panelmasopciones_Showcollapseicon);
         ucDvpanel_panelmasopciones.setProperty("IconPosition", Dvpanel_panelmasopciones_Iconposition);
         ucDvpanel_panelmasopciones.setProperty("AutoScroll", Dvpanel_panelmasopciones_Autoscroll);
         ucDvpanel_panelmasopciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelmasopciones_Internalname, "DVPANEL_PANELMASOPCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELMASOPCIONESContainer"+"PanelMasOpciones"+"\" style=\"display:none;\">") ;
         wb_table1_61_14D2( true) ;
      }
      else
      {
         wb_table1_61_14D2( false) ;
      }
      return  ;
   }

   public void wb_table1_61_14D2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelacciones.setProperty("Width", Dvpanel_panelacciones_Width);
         ucDvpanel_panelacciones.setProperty("AutoWidth", Dvpanel_panelacciones_Autowidth);
         ucDvpanel_panelacciones.setProperty("AutoHeight", Dvpanel_panelacciones_Autoheight);
         ucDvpanel_panelacciones.setProperty("Cls", Dvpanel_panelacciones_Cls);
         ucDvpanel_panelacciones.setProperty("Title", Dvpanel_panelacciones_Title);
         ucDvpanel_panelacciones.setProperty("Collapsible", Dvpanel_panelacciones_Collapsible);
         ucDvpanel_panelacciones.setProperty("Collapsed", Dvpanel_panelacciones_Collapsed);
         ucDvpanel_panelacciones.setProperty("ShowCollapseIcon", Dvpanel_panelacciones_Showcollapseicon);
         ucDvpanel_panelacciones.setProperty("IconPosition", Dvpanel_panelacciones_Iconposition);
         ucDvpanel_panelacciones.setProperty("AutoScroll", Dvpanel_panelacciones_Autoscroll);
         ucDvpanel_panelacciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelacciones_Internalname, "DVPANEL_PANELACCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELACCIONESContainer"+"PanelAcciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelacciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom15", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 7, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1114d1_client"+"'", TempTags, "", 2, "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelresultados.setProperty("Width", Dvpanel_panelresultados_Width);
         ucDvpanel_panelresultados.setProperty("AutoWidth", Dvpanel_panelresultados_Autowidth);
         ucDvpanel_panelresultados.setProperty("AutoHeight", Dvpanel_panelresultados_Autoheight);
         ucDvpanel_panelresultados.setProperty("Cls", Dvpanel_panelresultados_Cls);
         ucDvpanel_panelresultados.setProperty("Title", Dvpanel_panelresultados_Title);
         ucDvpanel_panelresultados.setProperty("Collapsible", Dvpanel_panelresultados_Collapsible);
         ucDvpanel_panelresultados.setProperty("Collapsed", Dvpanel_panelresultados_Collapsed);
         ucDvpanel_panelresultados.setProperty("ShowCollapseIcon", Dvpanel_panelresultados_Showcollapseicon);
         ucDvpanel_panelresultados.setProperty("IconPosition", Dvpanel_panelresultados_Iconposition);
         ucDvpanel_panelresultados.setProperty("AutoScroll", Dvpanel_panelresultados_Autoscroll);
         ucDvpanel_panelresultados.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelresultados_Internalname, "DVPANEL_PANELRESULTADOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELRESULTADOSContainer"+"PanelResultados"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelresultados_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tipoinforme.setProperty("Width", Dvpanel_tipoinforme_Width);
         ucDvpanel_tipoinforme.setProperty("AutoWidth", Dvpanel_tipoinforme_Autowidth);
         ucDvpanel_tipoinforme.setProperty("AutoHeight", Dvpanel_tipoinforme_Autoheight);
         ucDvpanel_tipoinforme.setProperty("Cls", Dvpanel_tipoinforme_Cls);
         ucDvpanel_tipoinforme.setProperty("Title", Dvpanel_tipoinforme_Title);
         ucDvpanel_tipoinforme.setProperty("Collapsible", Dvpanel_tipoinforme_Collapsible);
         ucDvpanel_tipoinforme.setProperty("Collapsed", Dvpanel_tipoinforme_Collapsed);
         ucDvpanel_tipoinforme.setProperty("ShowCollapseIcon", Dvpanel_tipoinforme_Showcollapseicon);
         ucDvpanel_tipoinforme.setProperty("IconPosition", Dvpanel_tipoinforme_Iconposition);
         ucDvpanel_tipoinforme.setProperty("AutoScroll", Dvpanel_tipoinforme_Autoscroll);
         ucDvpanel_tipoinforme.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tipoinforme_Internalname, "DVPANEL_TIPOINFORMEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TIPOINFORMEContainer"+"TipoInforme"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTipoinforme_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipinf.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipinf.getInternalname(), httpContext.getMessage( "Tipo Informe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipinf, cmbavTipinf.getInternalname(), GXutil.trim( GXutil.str( AV66TipInf, 1, 0)), 1, cmbavTipinf.getJsonclick(), 7, "'"+""+"'"+",false,"+"'"+"e1214d1_client"+"'", "int", "", 1, cmbavTipinf.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,127);\"", "", true, (byte)(0), "HLP_WebWPRDT10.htm");
         cmbavTipinf.setValue( GXutil.trim( GXutil.str( AV66TipInf, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipinf.getInternalname(), "Values", cmbavTipinf.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipmaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipmaqcod_Internalname, httpContext.getMessage( "Tipo Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmaqcod_Internalname, hV68TipMaqCod, GXutil.rtrim( localUtil.format( hV68TipMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipmaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipmaqcod_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkavExcel.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavExcel.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavExcel.getInternalname(), " ", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavExcel.getInternalname(), AV23Excel, "", " ", chkavExcel.getVisible(), chkavExcel.getEnabled(), "S", httpContext.getMessage( "Excel", ""), StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,136);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOpi.getInternalname(), httpContext.getMessage( "Opi", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOpi, cmbavOpi.getInternalname(), GXutil.rtrim( AV55Opi), 1, cmbavOpi.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavOpi.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,140);\"", "", true, (byte)(0), "HLP_WebWPRDT10.htm");
         cmbavOpi.setValue( GXutil.rtrim( AV55Opi) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpi.getInternalname(), "Values", cmbavOpi.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportarcsv_Internalname, "", httpContext.getMessage( "Exportat CSV", ""), bttBtnexportarcsv_Jsonclick, 5, httpContext.getMessage( "Exportat CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTARCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgrressbar.render(context, "gxprogressindicator", Progrressbar_Internalname, "PROGRRESSBARContainer");
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
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavDiahorafin.getInternalname(), GXutil.str( AV18DiaHoraFin, 1, 0), "", "", chkavDiahorafin.getVisible(), 1, "1", httpContext.getMessage( "Intervalo Dia-Hora se basara en Dia-Hora Fin de la Produccion", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(155, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,155);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start14D2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Listado Produccion Tinte DataTime", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup14D0( ) ;
   }

   public void ws14D2( )
   {
      start14D2( ) ;
      evt14D2( ) ;
   }

   public void evt14D2( )
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
                           e1314D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTARCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportarCSV' */
                           e1414D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e1514D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1614D2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we14D2( )
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

   public void pa14D2( )
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
            GX_FocusControl = edtavPmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvpmaq14D0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvpmaq_data14D0( A13734MaqCDsc) ;
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

   protected void gxsgvvpmaq_data14D0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H014D2 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H014D2_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H014D2_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvumaq14D0( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvumaq_data14D0( A13734MaqCDsc) ;
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

   protected void gxsgvvumaq_data14D0( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H014D3 */
      pr_default.execute(1, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxdynajaxctrlcodr.add(H014D3_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H014D3_A13734MaqCDsc[0]);
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvartcodi14D0( String A13751ArtCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvartcodi_data14D0( A13751ArtCDsc) ;
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

   protected void gxsgvvartcodi_data14D0( String A13751ArtCDsc )
   {
      l13751ArtCDsc = GXutil.concat( GXutil.rtrim( A13751ArtCDsc), "%", "") ;
      /* Using cursor H014D4 */
      pr_default.execute(2, new Object[] {l13751ArtCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(H014D4_A13751ArtCDsc[0]);
         gxdynajaxctrldescr.add(H014D4_A13751ArtCDsc[0]);
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvartcodf14D0( String A13751ArtCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvartcodf_data14D0( A13751ArtCDsc) ;
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

   protected void gxsgvvartcodf_data14D0( String A13751ArtCDsc )
   {
      l13751ArtCDsc = GXutil.concat( GXutil.rtrim( A13751ArtCDsc), "%", "") ;
      /* Using cursor H014D5 */
      pr_default.execute(3, new Object[] {l13751ArtCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(H014D5_A13751ArtCDsc[0]);
         gxdynajaxctrldescr.add(H014D5_A13751ArtCDsc[0]);
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgvvtipmaqcod14D0( String A13835TipMaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipmaqcod_data14D0( A13835TipMaqCDsc) ;
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

   protected void gxsgvvtipmaqcod_data14D0( String A13835TipMaqCDsc )
   {
      l13835TipMaqCDsc = GXutil.concat( GXutil.rtrim( A13835TipMaqCDsc), "%", "") ;
      /* Using cursor H014D6 */
      pr_default.execute(4, new Object[] {l13835TipMaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         gxdynajaxctrlcodr.add(H014D6_A13835TipMaqCDsc[0]);
         gxdynajaxctrldescr.add(H014D6_A13835TipMaqCDsc[0]);
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxhcvvpmaq14D2( String A13734MaqCDsc )
   {
      /* Using cursor H014D7 */
      pr_default.execute(5, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H014D7_A13734MaqCDsc[0] ;
         A396EmprCod = H014D7_A396EmprCod[0] ;
         A602MaqCod = H014D7_A602MaqCod[0] ;
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

   public void gxhcvvumaq14D2( String A13734MaqCDsc )
   {
      /* Using cursor H014D8 */
      pr_default.execute(6, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H014D8_A13734MaqCDsc[0] ;
         A396EmprCod = H014D8_A396EmprCod[0] ;
         A602MaqCod = H014D8_A602MaqCod[0] ;
         pr_default.readNext(6);
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
      pr_default.close(6);
   }

   public void gxhcvvartcodi14D2( String A13751ArtCDsc )
   {
      /* Using cursor H014D9 */
      pr_default.execute(7, new Object[] {A13751ArtCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13751ArtCDsc = H014D9_A13751ArtCDsc[0] ;
         A396EmprCod = H014D9_A396EmprCod[0] ;
         A252CliCod = H014D9_A252CliCod[0] ;
         A65ArtCod = H014D9_A65ArtCod[0] ;
         pr_default.readNext(7);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
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

   public void gxhcvvartcodf14D2( String A13751ArtCDsc )
   {
      /* Using cursor H014D10 */
      pr_default.execute(8, new Object[] {A13751ArtCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13751ArtCDsc = H014D10_A13751ArtCDsc[0] ;
         A396EmprCod = H014D10_A396EmprCod[0] ;
         A252CliCod = H014D10_A252CliCod[0] ;
         A65ArtCod = H014D10_A65ArtCod[0] ;
         pr_default.readNext(8);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A65ArtCod))+"\"") ;
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

   public void gxhcvvtipmaqcod14D2( String A13835TipMaqCDsc )
   {
      /* Using cursor H014D11 */
      pr_default.execute(9, new Object[] {A13835TipMaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13835TipMaqCDsc = H014D11_A13835TipMaqCDsc[0] ;
         A396EmprCod = H014D11_A396EmprCod[0] ;
         A1011TipMaqCod = H014D11_A1011TipMaqCod[0] ;
         pr_default.readNext(9);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1011TipMaqCod))+"\"") ;
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
      if ( cmbavHisproreo.getItemCount() > 0 )
      {
         AV95HisProReo = (byte)(GXutil.lval( cmbavHisproreo.getValidValue(GXutil.trim( GXutil.str( AV95HisProReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95HisProReo", GXutil.str( AV95HisProReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHisproreo.setValue( GXutil.trim( GXutil.str( AV95HisProReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHisproreo.getInternalname(), "Values", cmbavHisproreo.ToJavascriptSource(), true);
      }
      if ( cmbavTipinf.getItemCount() > 0 )
      {
         AV66TipInf = (byte)(GXutil.lval( cmbavTipinf.getValidValue(GXutil.trim( GXutil.str( AV66TipInf, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TipInf", GXutil.str( AV66TipInf, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipinf.setValue( GXutil.trim( GXutil.str( AV66TipInf, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipinf.getInternalname(), "Values", cmbavTipinf.ToJavascriptSource(), true);
      }
      AV23Excel = ((GXutil.strcmp(GXutil.rtrim( AV23Excel), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Excel", AV23Excel);
      if ( cmbavOpi.getItemCount() > 0 )
      {
         AV55Opi = cmbavOpi.getValidValue(AV55Opi) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Opi", AV55Opi);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOpi.setValue( GXutil.rtrim( AV55Opi) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOpi.getInternalname(), "Values", cmbavOpi.ToJavascriptSource(), true);
      }
      AV18DiaHoraFin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV18DiaHoraFin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18DiaHoraFin", GXutil.str( AV18DiaHoraFin, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf14D2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV101Pgmdesc = httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") ;
      AV100Pgmname = "WebWPRDT10" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   public void rf14D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1614D2 ();
         wb14D0( ) ;
      }
   }

   public void send_integrity_lvl_hashes14D2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV101Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101Pgmdesc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV79UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDETALLEDEFECTOS", GXutil.ltrim( localUtil.ntoc( AV17Detalledefectos, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDETALLEDEFECTOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Detalledefectos), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTINTURAS", GXutil.ltrim( localUtil.ntoc( AV65Tinturas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTURAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Tinturas), "9")));
   }

   public void before_start_formulas( )
   {
      AV101Pgmdesc = httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") ;
      AV100Pgmname = "WebWPRDT10" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup14D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1314D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Dvpanel_panelgenerales_Width = httpContext.cgiGet( "DVPANEL_PANELGENERALES_Width") ;
         Dvpanel_panelgenerales_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Autowidth")) ;
         Dvpanel_panelgenerales_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Autoheight")) ;
         Dvpanel_panelgenerales_Cls = httpContext.cgiGet( "DVPANEL_PANELGENERALES_Cls") ;
         Dvpanel_panelgenerales_Title = httpContext.cgiGet( "DVPANEL_PANELGENERALES_Title") ;
         Dvpanel_panelgenerales_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Collapsible")) ;
         Dvpanel_panelgenerales_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Collapsed")) ;
         Dvpanel_panelgenerales_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Showcollapseicon")) ;
         Dvpanel_panelgenerales_Iconposition = httpContext.cgiGet( "DVPANEL_PANELGENERALES_Iconposition") ;
         Dvpanel_panelgenerales_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELGENERALES_Autoscroll")) ;
         Dvpanel_panelmasopciones_Width = httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Width") ;
         Dvpanel_panelmasopciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Autowidth")) ;
         Dvpanel_panelmasopciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Autoheight")) ;
         Dvpanel_panelmasopciones_Cls = httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Cls") ;
         Dvpanel_panelmasopciones_Title = httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Title") ;
         Dvpanel_panelmasopciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Collapsible")) ;
         Dvpanel_panelmasopciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Collapsed")) ;
         Dvpanel_panelmasopciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Showcollapseicon")) ;
         Dvpanel_panelmasopciones_Iconposition = httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Iconposition") ;
         Dvpanel_panelmasopciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELMASOPCIONES_Autoscroll")) ;
         Dvpanel_panelacciones_Width = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Width") ;
         Dvpanel_panelacciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autowidth")) ;
         Dvpanel_panelacciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autoheight")) ;
         Dvpanel_panelacciones_Cls = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Cls") ;
         Dvpanel_panelacciones_Title = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Title") ;
         Dvpanel_panelacciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Collapsible")) ;
         Dvpanel_panelacciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Collapsed")) ;
         Dvpanel_panelacciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Showcollapseicon")) ;
         Dvpanel_panelacciones_Iconposition = httpContext.cgiGet( "DVPANEL_PANELACCIONES_Iconposition") ;
         Dvpanel_panelacciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELACCIONES_Autoscroll")) ;
         Dvpanel_pnl1_Width = httpContext.cgiGet( "DVPANEL_PNL1_Width") ;
         Dvpanel_pnl1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autowidth")) ;
         Dvpanel_pnl1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoheight")) ;
         Dvpanel_pnl1_Cls = httpContext.cgiGet( "DVPANEL_PNL1_Cls") ;
         Dvpanel_pnl1_Title = httpContext.cgiGet( "DVPANEL_PNL1_Title") ;
         Dvpanel_pnl1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsible")) ;
         Dvpanel_pnl1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Collapsed")) ;
         Dvpanel_pnl1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Showcollapseicon")) ;
         Dvpanel_pnl1_Iconposition = httpContext.cgiGet( "DVPANEL_PNL1_Iconposition") ;
         Dvpanel_pnl1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNL1_Autoscroll")) ;
         Dvpanel_tipoinforme_Width = httpContext.cgiGet( "DVPANEL_TIPOINFORME_Width") ;
         Dvpanel_tipoinforme_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Autowidth")) ;
         Dvpanel_tipoinforme_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Autoheight")) ;
         Dvpanel_tipoinforme_Cls = httpContext.cgiGet( "DVPANEL_TIPOINFORME_Cls") ;
         Dvpanel_tipoinforme_Title = httpContext.cgiGet( "DVPANEL_TIPOINFORME_Title") ;
         Dvpanel_tipoinforme_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Collapsible")) ;
         Dvpanel_tipoinforme_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Collapsed")) ;
         Dvpanel_tipoinforme_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Showcollapseicon")) ;
         Dvpanel_tipoinforme_Iconposition = httpContext.cgiGet( "DVPANEL_TIPOINFORME_Iconposition") ;
         Dvpanel_tipoinforme_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TIPOINFORME_Autoscroll")) ;
         Dvpanel_panelresultados_Width = httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Width") ;
         Dvpanel_panelresultados_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Autowidth")) ;
         Dvpanel_panelresultados_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Autoheight")) ;
         Dvpanel_panelresultados_Cls = httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Cls") ;
         Dvpanel_panelresultados_Title = httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Title") ;
         Dvpanel_panelresultados_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Collapsible")) ;
         Dvpanel_panelresultados_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Collapsed")) ;
         Dvpanel_panelresultados_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Showcollapseicon")) ;
         Dvpanel_panelresultados_Iconposition = httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Iconposition") ;
         Dvpanel_panelresultados_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELRESULTADOS_Autoscroll")) ;
         /* Read variables values. */
         hV59Pmaq = httpContext.cgiGet( edtavPmaq_Internalname) ;
         if ( (GXutil.strcmp("", hV59Pmaq)==0) )
         {
            AV59Pmaq = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
         }
         else
         {
            A13734MaqCDsc = hV59Pmaq ;
            /* Using cursor H014D12 */
            pr_default.execute(10, new Object[] {A13734MaqCDsc});
            AV59Pmaq = H014D12_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vPMAQ");
                  GX_FocusControl = edtavPmaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV59Pmaq", hV59Pmaq);
         hV74Umaq = httpContext.cgiGet( edtavUmaq_Internalname) ;
         if ( (GXutil.strcmp("", hV74Umaq)==0) )
         {
            AV74Umaq = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74Umaq", AV74Umaq);
         }
         else
         {
            A13734MaqCDsc = hV74Umaq ;
            /* Using cursor H014D13 */
            pr_default.execute(11, new Object[] {A13734MaqCDsc});
            AV74Umaq = H014D13_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vUMAQ");
                  GX_FocusControl = edtavUmaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV74Umaq", hV74Umaq);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32Hisprodti = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV32Hisprodti = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31HisProDtF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV31HisProDtF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbavHisproreo.setValue( httpContext.cgiGet( cmbavHisproreo.getInternalname()) );
         AV95HisProReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavHisproreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95HisProReo", GXutil.str( AV95HisProReo, 1, 0));
         hV6ArtCodi = httpContext.cgiGet( edtavArtcodi_Internalname) ;
         if ( (GXutil.strcmp("", hV6ArtCodi)==0) )
         {
            AV6ArtCodi = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
         }
         else
         {
            A13751ArtCDsc = hV6ArtCodi ;
            /* Using cursor H014D14 */
            pr_default.execute(12, new Object[] {A13751ArtCDsc});
            AV6ArtCodi = H014D14_A65ArtCod[0] ;
            if ( ! ( (pr_default.getStatus(12) == 101) ) )
            {
               pr_default.readNext(12);
               if ( ! ( (pr_default.getStatus(12) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vARTCODI");
                  GX_FocusControl = edtavArtcodi_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(12);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6ArtCodi", hV6ArtCodi);
         hV5Artcodf = httpContext.cgiGet( edtavArtcodf_Internalname) ;
         if ( (GXutil.strcmp("", hV5Artcodf)==0) )
         {
            AV5Artcodf = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
         }
         else
         {
            A13751ArtCDsc = hV5Artcodf ;
            /* Using cursor H014D15 */
            pr_default.execute(13, new Object[] {A13751ArtCDsc});
            AV5Artcodf = H014D15_A65ArtCod[0] ;
            if ( ! ( (pr_default.getStatus(13) == 101) ) )
            {
               pr_default.readNext(13);
               if ( ! ( (pr_default.getStatus(13) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vARTCODF");
                  GX_FocusControl = edtavArtcodf_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(13);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5Artcodf", hV5Artcodf);
         AV9Barcolnomi = httpContext.cgiGet( edtavBarcolnomi_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
         AV8barcolnomf = httpContext.cgiGet( edtavBarcolnomf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMI");
            GX_FocusControl = edtavBarcolnumi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11Barcolnumi = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
         }
         else
         {
            AV11Barcolnumi = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMF");
            GX_FocusControl = edtavBarcolnumf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10Barcolnumf = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
         }
         else
         {
            AV10Barcolnumf = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
         }
         cmbavTipinf.setValue( httpContext.cgiGet( cmbavTipinf.getInternalname()) );
         AV66TipInf = (byte)(GXutil.lval( httpContext.cgiGet( cmbavTipinf.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TipInf", GXutil.str( AV66TipInf, 1, 0));
         hV68TipMaqCod = httpContext.cgiGet( edtavTipmaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV68TipMaqCod)==0) )
         {
            AV68TipMaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
         }
         else
         {
            A13835TipMaqCDsc = hV68TipMaqCod ;
            /* Using cursor H014D16 */
            pr_default.execute(14, new Object[] {A13835TipMaqCDsc});
            AV68TipMaqCod = H014D16_A1011TipMaqCod[0] ;
            if ( ! ( (pr_default.getStatus(14) == 101) ) )
            {
               pr_default.readNext(14);
               if ( ! ( (pr_default.getStatus(14) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cód. - Tipo Máquina", "")}), 1, "vTIPMAQCOD");
                  GX_FocusControl = edtavTipmaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(14);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV68TipMaqCod", hV68TipMaqCod);
         AV23Excel = ((GXutil.strcmp(httpContext.cgiGet( chkavExcel.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23Excel", AV23Excel);
         cmbavOpi.setValue( httpContext.cgiGet( cmbavOpi.getInternalname()) );
         AV55Opi = httpContext.cgiGet( cmbavOpi.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Opi", AV55Opi);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavDiahorafin.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavDiahorafin.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIAHORAFIN");
            GX_FocusControl = chkavDiahorafin.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DiaHoraFin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DiaHoraFin", GXutil.str( AV18DiaHoraFin, 1, 0));
         }
         else
         {
            AV18DiaHoraFin = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavDiahorafin.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DiaHoraFin", GXutil.str( AV18DiaHoraFin, 1, 0));
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
      e1314D2 ();
      if (returnInSub) return;
   }

   public void e1314D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV64Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
      AV64Station = GXt_char1 ;
      GXv_char2[0] = AV21EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV79UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV64Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwprdt10_impl.this.AV21EmprCod = GXv_char2[0] ;
      webwprdt10_impl.this.AV22EmprNom = GXv_char3[0] ;
      webwprdt10_impl.this.AV79UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV79UsurCod", AV79UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79UsurCod, "@!"))));
      if ( (GXutil.strcmp("", AV21EmprCod)==0) )
      {
         GXt_char1 = AV21EmprCod ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerempresa(remoteHandle, context).execute( GXv_char4) ;
         webwprdt10_impl.this.GXt_char1 = GXv_char4[0] ;
         AV21EmprCod = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      }
      AV26FlagTexk = (byte)(0) ;
      GXv_int5[0] = AV26FlagTexk ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "TEXKNI", ""), GXv_int5) ;
      webwprdt10_impl.this.AV26FlagTexk = GXv_int5[0] ;
      AV62Rontaltex = (byte)(0) ;
      GXv_int5[0] = AV62Rontaltex ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "RONTAL", ""), GXv_int5) ;
      webwprdt10_impl.this.AV62Rontaltex = GXv_int5[0] ;
      if ( AV62Rontaltex == 1 )
      {
         cmbavTipinf.addItem("3", httpContext.getMessage( "Rontaltex", ""), (short)(0));
      }
      GXv_int5[0] = (byte)(DecimalUtil.decToDouble(AV14Cladd)) ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "CLADD", ""), GXv_int5) ;
      webwprdt10_impl.this.AV14Cladd = DecimalUtil.doubleToDec(GXv_int5[0]) ;
      GXv_int5[0] = AV63Staack ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "STAACK", ""), GXv_int5) ;
      webwprdt10_impl.this.AV63Staack = GXv_int5[0] ;
      GXv_int5[0] = AV36Indutexma ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int5) ;
      webwprdt10_impl.this.AV36Indutexma = GXv_int5[0] ;
      GXt_int6 = AV67Tipmaq ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "TIPMQX", ""), GXv_int5) ;
      webwprdt10_impl.this.GXt_int6 = GXv_int5[0] ;
      AV67Tipmaq = GXt_int6 ;
      AV23Excel = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Excel", AV23Excel);
      AV55Opi = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Opi", AV55Opi);
      AV72Ufec = Gx_date ;
      AV57Pfec = GXutil.dadd(Gx_date,-(1)) ;
      AV30Hhmmss_i = "22:00:00" ;
      GXt_char1 = AV30Hhmmss_i ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTI", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webwprdt10_impl.this.AV21EmprCod = GXv_char4[0] ;
      webwprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV30Hhmmss_i = GXt_char1 ;
      AV29Hhmmss_f = "22:00:00" ;
      GXt_char1 = AV29Hhmmss_f ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "HMSDTF", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      webwprdt10_impl.this.AV21EmprCod = GXv_char4[0] ;
      webwprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      AV29Hhmmss_f = GXt_char1 ;
      AV35Horai = GXutil.resetDate(localUtil.ctot( AV30Hhmmss_i, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV34HoraF = GXutil.resetDate(localUtil.ctot( AV29Hhmmss_f, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
      AV32Hisprodti = localUtil.ymdhmsToT( (short)(GXutil.year( AV57Pfec)), (byte)(GXutil.month( AV57Pfec)), (byte)(GXutil.day( AV57Pfec)), (byte)(GXutil.hour( AV35Horai)), (byte)(GXutil.minute( AV35Horai)), (byte)(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV31HisProDtF = localUtil.ymdhmsToT( (short)(GXutil.year( AV72Ufec)), (byte)(GXutil.month( AV72Ufec)), (byte)(GXutil.day( AV72Ufec)), (byte)(GXutil.hour( AV34HoraF)), (byte)(GXutil.minute( AV34HoraF)), (byte)(0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXt_int6 = AV20eLIOT ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "P5042F", ""), GXv_int5) ;
      webwprdt10_impl.this.GXt_int6 = GXv_int5[0] ;
      AV20eLIOT = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20eLIOT", GXutil.str( AV20eLIOT, 1, 0));
      edtavArtcodf_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcodf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcodf_Visible), 5, 0), true);
      edtavArtcodi_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavArtcodi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavArtcodi_Visible), 5, 0), true);
      divRangoarticulo_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, divRangoarticulo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divRangoarticulo_Visible), 5, 0), true);
      edtavBarcolnomf_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomf_Visible), 5, 0), true);
      edtavBarcolnomi_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomi_Visible), 5, 0), true);
      divRangocolor_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, divRangocolor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divRangocolor_Visible), 5, 0), true);
      edtavBarcolnumi_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnumi_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnumi_Visible), 5, 0), true);
      edtavBarcolnumf_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnumf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnumf_Visible), 5, 0), true);
      divRangonumero_Visible = AV20eLIOT ;
      httpContext.ajax_rsp_assign_prop("", false, divRangonumero_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divRangonumero_Visible), 5, 0), true);
      GXt_char1 = AV16defpath ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "PTHCSV", ""), GXv_char4) ;
      webwprdt10_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16defpath = GXt_char1 ;
      AV54NonTxt = AV100Pgmname ;
      GXt_char1 = AV13Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      webwprdt10_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Carpeta = GXt_char1 ;
      AV53NomInf = AV101Pgmdesc ;
      GXt_int6 = AV15DateFin ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "DATEFN", ""), GXv_int5) ;
      webwprdt10_impl.this.GXt_int6 = GXv_int5[0] ;
      AV15DateFin = GXt_int6 ;
      GXt_int6 = AV65Tinturas ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "TYT", ""), GXv_int5) ;
      webwprdt10_impl.this.GXt_int6 = GXv_int5[0] ;
      AV65Tinturas = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Tinturas", GXutil.str( AV65Tinturas, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTINTURAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Tinturas), "9")));
      GXt_int6 = AV27Flg ;
      GXv_int5[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "IEXCEL", ""), GXv_int5) ;
      webwprdt10_impl.this.GXt_int6 = GXv_int5[0] ;
      AV27Flg = GXt_int6 ;
      AV18DiaHoraFin = AV27Flg ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18DiaHoraFin", GXutil.str( AV18DiaHoraFin, 1, 0));
      GXt_char1 = AV64Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwprdt10_impl.this.GXt_char1 = GXv_char4[0] ;
      AV64Station = GXt_char1 ;
      GXv_char4[0] = AV21EmprCod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char2[0] = AV79UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV64Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwprdt10_impl.this.AV21EmprCod = GXv_char4[0] ;
      webwprdt10_impl.this.AV22EmprNom = GXv_char3[0] ;
      webwprdt10_impl.this.AV79UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV79UsurCod", AV79UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV79UsurCod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      chkavDiahorafin.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavDiahorafin.getInternalname(), "Visible", GXutil.ltrimstr( chkavDiahorafin.getVisible(), 5, 0), true);
      AV66TipInf = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TipInf", GXutil.str( AV66TipInf, 1, 0));
      chkavExcel.setVisible( (((AV66TipInf==2)) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkavExcel.getInternalname(), "Visible", GXutil.ltrimstr( chkavExcel.getVisible(), 5, 0), true);
   }

   public void e1414D2( )
   {
      /* 'DoExportarCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDAR RANGOS' */
      S122 ();
      if (returnInSub) return;
      if ( AV94GenerarInforme )
      {
         AV25Filename = GXutil.trim( AV101Pgmdesc) + "_" + AV55Opi + "_" + GXutil.trim( AV79UsurCod) + ".csv" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         /* Execute user subroutine: 'ALISTAR ARCHIVO' */
         S132 ();
         if (returnInSub) return;
         AV58PlaNom = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58PlaNom", AV58PlaNom);
         /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
         S142 ();
         if (returnInSub) return;
         if ( ( GXutil.strcmp(AV55Opi, "1") == 0 ) || (GXutil.strcmp("", AV55Opi)==0) )
         {
            GXt_char1 = AV58PlaNom ;
            GXv_char4[0] = AV21EmprCod ;
            GXv_char3[0] = AV59Pmaq ;
            GXv_char2[0] = AV75Umaq2 ;
            GXv_dtime7[0] = AV32Hisprodti ;
            GXv_dtime8[0] = AV31HisProDtF ;
            GXv_char9[0] = AV68TipMaqCod ;
            GXv_char10[0] = AV25Filename ;
            GXv_char11[0] = AV6ArtCodi ;
            GXv_char12[0] = AV5Artcodf ;
            GXv_char13[0] = AV9Barcolnomi ;
            GXv_char14[0] = AV8barcolnomf ;
            GXv_int15[0] = AV11Barcolnumi ;
            GXv_int16[0] = AV10Barcolnumf ;
            GXv_char17[0] = GXt_char1 ;
            new app.rprdt10tgenerafile(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_dtime7, GXv_dtime8, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_int15, GXv_int16, GXv_char17) ;
            webwprdt10_impl.this.AV21EmprCod = GXv_char4[0] ;
            webwprdt10_impl.this.AV59Pmaq = GXv_char3[0] ;
            webwprdt10_impl.this.AV75Umaq2 = GXv_char2[0] ;
            webwprdt10_impl.this.AV32Hisprodti = GXv_dtime7[0] ;
            webwprdt10_impl.this.AV31HisProDtF = GXv_dtime8[0] ;
            webwprdt10_impl.this.AV68TipMaqCod = GXv_char9[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char10[0] ;
            webwprdt10_impl.this.AV6ArtCodi = GXv_char11[0] ;
            webwprdt10_impl.this.AV5Artcodf = GXv_char12[0] ;
            webwprdt10_impl.this.AV9Barcolnomi = GXv_char13[0] ;
            webwprdt10_impl.this.AV8barcolnomf = GXv_char14[0] ;
            webwprdt10_impl.this.AV11Barcolnumi = GXv_int15[0] ;
            webwprdt10_impl.this.AV10Barcolnumf = GXv_int16[0] ;
            webwprdt10_impl.this.GXt_char1 = GXv_char17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
            httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            AV58PlaNom = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58PlaNom", AV58PlaNom);
            /* Execute user subroutine: 'DESCARGA &PLANOM' */
            S152 ();
            if (returnInSub) return;
         }
         else if ( GXutil.strcmp(AV55Opi, "2") == 0 )
         {
            GXt_char1 = AV58PlaNom ;
            GXv_char17[0] = AV21EmprCod ;
            GXv_char14[0] = AV59Pmaq ;
            GXv_char13[0] = AV75Umaq2 ;
            GXv_dtime8[0] = AV32Hisprodti ;
            GXv_dtime7[0] = AV31HisProDtF ;
            GXv_char12[0] = AV68TipMaqCod ;
            GXv_char11[0] = AV25Filename ;
            GXv_char10[0] = AV6ArtCodi ;
            GXv_char9[0] = AV5Artcodf ;
            GXv_char4[0] = AV9Barcolnomi ;
            GXv_char3[0] = AV8barcolnomf ;
            GXv_int16[0] = AV11Barcolnumi ;
            GXv_int15[0] = AV10Barcolnumf ;
            GXv_char2[0] = GXt_char1 ;
            new app.rprdt11tgenerafile(remoteHandle, context).execute( GXv_char17, GXv_char14, GXv_char13, GXv_dtime8, GXv_dtime7, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_char4, GXv_char3, GXv_int16, GXv_int15, GXv_char2) ;
            webwprdt10_impl.this.AV21EmprCod = GXv_char17[0] ;
            webwprdt10_impl.this.AV59Pmaq = GXv_char14[0] ;
            webwprdt10_impl.this.AV75Umaq2 = GXv_char13[0] ;
            webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
            webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
            webwprdt10_impl.this.AV68TipMaqCod = GXv_char12[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char11[0] ;
            webwprdt10_impl.this.AV6ArtCodi = GXv_char10[0] ;
            webwprdt10_impl.this.AV5Artcodf = GXv_char9[0] ;
            webwprdt10_impl.this.AV9Barcolnomi = GXv_char4[0] ;
            webwprdt10_impl.this.AV8barcolnomf = GXv_char3[0] ;
            webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
            webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
            webwprdt10_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
            httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            AV58PlaNom = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58PlaNom", AV58PlaNom);
            /* Execute user subroutine: 'DESCARGA &PLANOM' */
            S152 ();
            if (returnInSub) return;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV89ProgressIndicator", AV89ProgressIndicator);
   }

   public void e1514D2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'VALIDAR RANGOS' */
      S122 ();
      if (returnInSub) return;
      if ( ! AV94GenerarInforme )
      {
      }
      else if ( AV66TipInf == 1 )
      {
         if ( (0==AV18DiaHoraFin) && (0==AV17Detalledefectos) )
         {
            AV25Filename = GXutil.trim( AV101Pgmdesc) + ".pdf" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            /* Execute user subroutine: 'ALISTAR ARCHIVO' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
            S142 ();
            if (returnInSub) return;
            GXv_char17[0] = AV59Pmaq ;
            GXv_char14[0] = AV75Umaq2 ;
            GXv_dtime8[0] = AV32Hisprodti ;
            GXv_dtime7[0] = AV31HisProDtF ;
            GXv_char13[0] = AV68TipMaqCod ;
            GXv_char12[0] = AV6ArtCodi ;
            GXv_char11[0] = AV5Artcodf ;
            GXv_char10[0] = AV9Barcolnomi ;
            GXv_char9[0] = AV8barcolnomf ;
            GXv_int16[0] = AV11Barcolnumi ;
            GXv_int15[0] = AV10Barcolnumf ;
            GXv_char4[0] = AV25Filename ;
            new app.rprdt11(remoteHandle, context).execute( AV21EmprCod, GXv_char17, GXv_char14, GXv_dtime8, GXv_dtime7, GXv_char13, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_int16, GXv_int15, GXv_char4) ;
            webwprdt10_impl.this.AV59Pmaq = GXv_char17[0] ;
            webwprdt10_impl.this.AV75Umaq2 = GXv_char14[0] ;
            webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
            webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
            webwprdt10_impl.this.AV68TipMaqCod = GXv_char13[0] ;
            webwprdt10_impl.this.AV6ArtCodi = GXv_char12[0] ;
            webwprdt10_impl.this.AV5Artcodf = GXv_char11[0] ;
            webwprdt10_impl.this.AV9Barcolnomi = GXv_char10[0] ;
            webwprdt10_impl.this.AV8barcolnomf = GXv_char9[0] ;
            webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
            webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
            httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV85AbrirVentana = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AbrirVentana", AV85AbrirVentana);
            /* Execute user subroutine: 'VISOR ARCHIVO' */
            S162 ();
            if (returnInSub) return;
         }
         else if ( ( AV18DiaHoraFin == 1 ) && ( AV17Detalledefectos == 0 ) )
         {
            AV25Filename = GXutil.trim( AV101Pgmdesc) + httpContext.getMessage( "_HoraFinProduccion", "") + ".pdf" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            /* Execute user subroutine: 'ALISTAR ARCHIVO' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
            S142 ();
            if (returnInSub) return;
            callWebObject(formatLink("app.rprdt11df", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV59Pmaq)),GXutil.URLEncode(GXutil.rtrim(AV75Umaq2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31HisProDtF)),GXutil.URLEncode(GXutil.rtrim(AV68TipMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtCodi)),GXutil.URLEncode(GXutil.rtrim(AV5Artcodf)),GXutil.URLEncode(GXutil.rtrim(AV9Barcolnomi)),GXutil.URLEncode(GXutil.rtrim(AV8barcolnomf)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcolnumi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Barcolnumf,6,0)),GXutil.URLEncode(GXutil.rtrim(AV25Filename))}, new String[] {"EmprCod","PMaqCod","UMaqCod","Hisprodti","Hisprodtf","TipMaqCod","ArtCodi","ArtCodf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf"}) );
            httpContext.wjLocDisableFrm = (byte)(2) ;
            AV85AbrirVentana = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AbrirVentana", AV85AbrirVentana);
            /* Execute user subroutine: 'VISOR ARCHIVO' */
            S162 ();
            if (returnInSub) return;
         }
         else if ( ( AV18DiaHoraFin == 1 ) && ( AV17Detalledefectos == 1 ) )
         {
            AV25Filename = GXutil.trim( AV101Pgmdesc) + httpContext.getMessage( "_DetalleDefectos", "") + ".xlsx" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV84ExcelFilename = "" ;
            /* Execute user subroutine: 'ALISTAR ARCHIVO' */
            S132 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
            S142 ();
            if (returnInSub) return;
            GXv_char17[0] = AV21EmprCod ;
            GXv_char14[0] = AV59Pmaq ;
            GXv_char13[0] = AV75Umaq2 ;
            GXv_dtime8[0] = AV32Hisprodti ;
            GXv_dtime7[0] = AV31HisProDtF ;
            GXv_char12[0] = AV68TipMaqCod ;
            GXv_char11[0] = AV6ArtCodi ;
            GXv_char10[0] = AV5Artcodf ;
            GXv_char9[0] = AV9Barcolnomi ;
            GXv_char4[0] = AV8barcolnomf ;
            GXv_int16[0] = AV11Barcolnumi ;
            GXv_int15[0] = AV10Barcolnumf ;
            GXv_char3[0] = AV25Filename ;
            GXv_char2[0] = AV84ExcelFilename ;
            GXv_char18[0] = AV83ErrorMessage ;
            new app.pxml108toexcel(remoteHandle, context).execute( GXv_char17, GXv_char14, GXv_char13, GXv_dtime8, GXv_dtime7, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_char4, GXv_int16, GXv_int15, GXv_char3, GXv_char2, GXv_char18) ;
            webwprdt10_impl.this.AV21EmprCod = GXv_char17[0] ;
            webwprdt10_impl.this.AV59Pmaq = GXv_char14[0] ;
            webwprdt10_impl.this.AV75Umaq2 = GXv_char13[0] ;
            webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
            webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
            webwprdt10_impl.this.AV68TipMaqCod = GXv_char12[0] ;
            webwprdt10_impl.this.AV6ArtCodi = GXv_char11[0] ;
            webwprdt10_impl.this.AV5Artcodf = GXv_char10[0] ;
            webwprdt10_impl.this.AV9Barcolnomi = GXv_char9[0] ;
            webwprdt10_impl.this.AV8barcolnomf = GXv_char4[0] ;
            webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
            webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char3[0] ;
            webwprdt10_impl.this.AV84ExcelFilename = GXv_char2[0] ;
            webwprdt10_impl.this.AV83ErrorMessage = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
            httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            AV85AbrirVentana = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AbrirVentana", AV85AbrirVentana);
            if ( GXutil.strcmp(AV84ExcelFilename, "") != 0 )
            {
               /* Execute user subroutine: 'VISOR ARCHIVO' */
               S162 ();
               if (returnInSub) return;
               callWebObject(formatLink(AV84ExcelFilename, new String[] {}, new String[] {}) );
               httpContext.wjLocDisableFrm = (byte)(0) ;
            }
            else
            {
               /* Execute user subroutine: 'VISOR ARCHIVO' */
               S162 ();
               if (returnInSub) return;
               httpContext.GX_msglist.addItem(AV83ErrorMessage);
            }
         }
      }
      else if ( ( AV66TipInf == 2 ) && ( GXutil.strcmp(AV23Excel, httpContext.getMessage( "N", "")) == 0 ) )
      {
         AV25Filename = GXutil.trim( AV101Pgmdesc) + httpContext.getMessage( "_Detalle_Informe", "") + ((GXutil.strcmp(AV55Opi, "1")==0) ? httpContext.getMessage( "I", "") : httpContext.getMessage( "II", "")) + ".pdf" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         /* Execute user subroutine: 'ALISTAR ARCHIVO' */
         S132 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
         S142 ();
         if (returnInSub) return;
         callWebObject(formatLink("app.rprdt10", new String[] {GXutil.URLEncode(GXutil.rtrim(AV21EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV59Pmaq)),GXutil.URLEncode(GXutil.rtrim(AV75Umaq2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32Hisprodti)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31HisProDtF)),GXutil.URLEncode(GXutil.rtrim(AV68TipMaqCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtCodi)),GXutil.URLEncode(GXutil.rtrim(AV5Artcodf)),GXutil.URLEncode(GXutil.rtrim(AV9Barcolnomi)),GXutil.URLEncode(GXutil.rtrim(AV8barcolnomf)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcolnumi,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Barcolnumf,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV18DiaHoraFin,1,0)),GXutil.URLEncode(GXutil.rtrim(AV25Filename))}, new String[] {"EmprCod","PMaqCod","UMaqCod","hISPRODTI","hISPRODTF","TipMaqCod","Artcodi","Artcodf","Barcolnomi","Barcolnomf","Barcolnumi","Barcolnumf","Diahorafin"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         AV85AbrirVentana = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AbrirVentana", AV85AbrirVentana);
         /* Execute user subroutine: 'VISOR ARCHIVO' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( ( AV66TipInf == 2 ) && ( GXutil.strcmp(AV23Excel, httpContext.getMessage( "S", "")) == 0 ) )
      {
         AV25Filename = GXutil.trim( AV101Pgmdesc) + httpContext.getMessage( "_Detalle_Informe", "") + ((GXutil.strcmp(AV55Opi, "1")==0) ? httpContext.getMessage( "I", "") : httpContext.getMessage( "II", "")) + ".xlsx" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         AV25Filename = GXutil.strReplace( AV25Filename, " ", "_") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
         AV84ExcelFilename = "" ;
         /* Execute user subroutine: 'ALISTAR ARCHIVO' */
         S132 ();
         if (returnInSub) return;
         AV85AbrirVentana = false ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AbrirVentana", AV85AbrirVentana);
         if ( GXutil.strcmp(AV55Opi, "1") == 0 )
         {
            /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
            S142 ();
            if (returnInSub) return;
            GXv_char18[0] = AV21EmprCod ;
            GXv_char17[0] = AV59Pmaq ;
            GXv_char14[0] = AV75Umaq2 ;
            GXv_dtime8[0] = AV32Hisprodti ;
            GXv_dtime7[0] = AV31HisProDtF ;
            GXv_char13[0] = AV68TipMaqCod ;
            GXv_char12[0] = AV25Filename ;
            GXv_char11[0] = AV6ArtCodi ;
            GXv_char10[0] = AV5Artcodf ;
            GXv_char9[0] = AV9Barcolnomi ;
            GXv_char4[0] = AV8barcolnomf ;
            GXv_int16[0] = AV11Barcolnumi ;
            GXv_int15[0] = AV10Barcolnumf ;
            GXv_char3[0] = AV25Filename ;
            GXv_char2[0] = AV84ExcelFilename ;
            GXv_char19[0] = AV83ErrorMessage ;
            new app.pxprdt10etoexcel(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_char14, GXv_dtime8, GXv_dtime7, GXv_char13, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_char4, GXv_int16, GXv_int15, GXv_char3, GXv_char2, GXv_char19) ;
            webwprdt10_impl.this.AV21EmprCod = GXv_char18[0] ;
            webwprdt10_impl.this.AV59Pmaq = GXv_char17[0] ;
            webwprdt10_impl.this.AV75Umaq2 = GXv_char14[0] ;
            webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
            webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
            webwprdt10_impl.this.AV68TipMaqCod = GXv_char13[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char12[0] ;
            webwprdt10_impl.this.AV6ArtCodi = GXv_char11[0] ;
            webwprdt10_impl.this.AV5Artcodf = GXv_char10[0] ;
            webwprdt10_impl.this.AV9Barcolnomi = GXv_char9[0] ;
            webwprdt10_impl.this.AV8barcolnomf = GXv_char4[0] ;
            webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
            webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
            webwprdt10_impl.this.AV25Filename = GXv_char3[0] ;
            webwprdt10_impl.this.AV84ExcelFilename = GXv_char2[0] ;
            webwprdt10_impl.this.AV83ErrorMessage = GXv_char19[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
            httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
            httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
            if ( GXutil.strcmp(AV84ExcelFilename, "") != 0 )
            {
               /* Execute user subroutine: 'VISOR ARCHIVO' */
               S162 ();
               if (returnInSub) return;
               callWebObject(formatLink(AV84ExcelFilename, new String[] {}, new String[] {}) );
               httpContext.wjLocDisableFrm = (byte)(0) ;
            }
            else
            {
               httpContext.GX_msglist.addItem(AV83ErrorMessage);
               AV89ProgressIndicator.hide();
            }
         }
         else if ( GXutil.strcmp(AV55Opi, "2") == 0 )
         {
            /* Execute user subroutine: 'INICIALIZAR BARRA DE PROGRESO' */
            S142 ();
            if (returnInSub) return;
            if ( AV65Tinturas == 0 )
            {
               GXv_char19[0] = AV21EmprCod ;
               GXv_char18[0] = AV59Pmaq ;
               GXv_char17[0] = AV75Umaq2 ;
               GXv_dtime8[0] = AV32Hisprodti ;
               GXv_dtime7[0] = AV31HisProDtF ;
               GXv_char14[0] = AV68TipMaqCod ;
               GXv_char13[0] = AV25Filename ;
               GXv_char12[0] = AV6ArtCodi ;
               GXv_char11[0] = AV5Artcodf ;
               GXv_char10[0] = AV9Barcolnomi ;
               GXv_char9[0] = AV8barcolnomf ;
               GXv_int16[0] = AV11Barcolnumi ;
               GXv_int15[0] = AV10Barcolnumf ;
               GXv_char4[0] = AV84ExcelFilename ;
               GXv_char3[0] = AV83ErrorMessage ;
               new app.pxprdt11etoexcel(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_char17, GXv_dtime8, GXv_dtime7, GXv_char14, GXv_char13, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_int16, GXv_int15, GXv_char4, GXv_char3) ;
               webwprdt10_impl.this.AV21EmprCod = GXv_char19[0] ;
               webwprdt10_impl.this.AV59Pmaq = GXv_char18[0] ;
               webwprdt10_impl.this.AV75Umaq2 = GXv_char17[0] ;
               webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
               webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
               webwprdt10_impl.this.AV68TipMaqCod = GXv_char14[0] ;
               webwprdt10_impl.this.AV25Filename = GXv_char13[0] ;
               webwprdt10_impl.this.AV6ArtCodi = GXv_char12[0] ;
               webwprdt10_impl.this.AV5Artcodf = GXv_char11[0] ;
               webwprdt10_impl.this.AV9Barcolnomi = GXv_char10[0] ;
               webwprdt10_impl.this.AV8barcolnomf = GXv_char9[0] ;
               webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
               webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
               webwprdt10_impl.this.AV84ExcelFilename = GXv_char4[0] ;
               webwprdt10_impl.this.AV83ErrorMessage = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
               httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
               httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
               httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
               httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            }
            else
            {
               GXv_char19[0] = AV21EmprCod ;
               GXv_char18[0] = AV59Pmaq ;
               GXv_char17[0] = AV75Umaq2 ;
               GXv_dtime8[0] = AV32Hisprodti ;
               GXv_dtime7[0] = AV31HisProDtF ;
               GXv_char14[0] = AV68TipMaqCod ;
               GXv_char13[0] = AV25Filename ;
               GXv_char12[0] = AV6ArtCodi ;
               GXv_char11[0] = AV5Artcodf ;
               GXv_char10[0] = AV9Barcolnomi ;
               GXv_char9[0] = AV8barcolnomf ;
               GXv_int16[0] = AV11Barcolnumi ;
               GXv_int15[0] = AV10Barcolnumf ;
               GXv_char4[0] = AV84ExcelFilename ;
               GXv_char3[0] = AV83ErrorMessage ;
               new app.pxmlpt11toexcel(remoteHandle, context).execute( GXv_char19, GXv_char18, GXv_char17, GXv_dtime8, GXv_dtime7, GXv_char14, GXv_char13, GXv_char12, GXv_char11, GXv_char10, GXv_char9, GXv_int16, GXv_int15, GXv_char4, GXv_char3) ;
               webwprdt10_impl.this.AV21EmprCod = GXv_char19[0] ;
               webwprdt10_impl.this.AV59Pmaq = GXv_char18[0] ;
               webwprdt10_impl.this.AV75Umaq2 = GXv_char17[0] ;
               webwprdt10_impl.this.AV32Hisprodti = GXv_dtime8[0] ;
               webwprdt10_impl.this.AV31HisProDtF = GXv_dtime7[0] ;
               webwprdt10_impl.this.AV68TipMaqCod = GXv_char14[0] ;
               webwprdt10_impl.this.AV25Filename = GXv_char13[0] ;
               webwprdt10_impl.this.AV6ArtCodi = GXv_char12[0] ;
               webwprdt10_impl.this.AV5Artcodf = GXv_char11[0] ;
               webwprdt10_impl.this.AV9Barcolnomi = GXv_char10[0] ;
               webwprdt10_impl.this.AV8barcolnomf = GXv_char9[0] ;
               webwprdt10_impl.this.AV11Barcolnumi = GXv_int16[0] ;
               webwprdt10_impl.this.AV10Barcolnumf = GXv_int15[0] ;
               webwprdt10_impl.this.AV84ExcelFilename = GXv_char4[0] ;
               webwprdt10_impl.this.AV83ErrorMessage = GXv_char3[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21EmprCod", AV21EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", AV59Pmaq);
               httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
               httpContext.ajax_rsp_assign_attri("", false, "AV32Hisprodti", localUtil.ttoc( AV32Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", AV68TipMaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV25Filename", AV25Filename);
               httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", AV6ArtCodi);
               httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcolnomi", AV9Barcolnomi);
               httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcolnumi", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Barcolnumi), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
            }
            if ( GXutil.strcmp(AV84ExcelFilename, "") != 0 )
            {
               /* Execute user subroutine: 'VISOR ARCHIVO' */
               S162 ();
               if (returnInSub) return;
               callWebObject(formatLink(AV84ExcelFilename, new String[] {}, new String[] {}) );
               httpContext.wjLocDisableFrm = (byte)(0) ;
            }
            else
            {
               httpContext.GX_msglist.addItem(AV83ErrorMessage);
               AV89ProgressIndicator.hide();
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV89ProgressIndicator", AV89ProgressIndicator);
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ! (0==AV20eLIOT) ) )
      {
         divDvpanel_panelmasopciones_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_panelmasopciones_cell_Internalname, "Class", divDvpanel_panelmasopciones_cell_Class, true);
      }
      else
      {
         divDvpanel_panelmasopciones_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_panelmasopciones_cell_Internalname, "Class", divDvpanel_panelmasopciones_cell_Class, true);
      }
      divTabladiahorafin_Visible = (((0>1)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTabladiahorafin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTabladiahorafin_Visible), 5, 0), true);
   }

   public void S162( )
   {
      /* 'VISOR ARCHIVO' Routine */
      returnInSub = false ;
      AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizando reporte ... ", "")+AV25Filename);
      AV89ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-warning", "") );
      AV87K = GXutil.sleep( 1) ;
      if ( AV85AbrirVentana )
      {
         new app.visor(remoteHandle, context).execute( AV25Filename) ;
      }
      AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado reporte ... ", "")+AV25Filename);
      AV89ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "progress-bar-sucess", "") );
      AV87K = GXutil.sleep( 2) ;
      AV89ProgressIndicator.hide();
   }

   public void S122( )
   {
      /* 'VALIDAR RANGOS' Routine */
      returnInSub = false ;
      AV94GenerarInforme = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94GenerarInforme", AV94GenerarInforme);
      if ( AV32Hisprodti.after( AV31HisProDtF ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Primera Fecha mayor Ultima Fecha", ""));
      }
      else if ( GXutil.strcmp(AV59Pmaq, AV74Umaq) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Primera maquina mayor Ultima Maquina", ""));
      }
      else
      {
         AV31HisProDtF = (GXutil.dateCompare(GXutil.nullDate(), AV31HisProDtF) ? GXutil.serverNow( context, remoteHandle, pr_default) : AV31HisProDtF) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31HisProDtF", localUtil.ttoc( AV31HisProDtF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV75Umaq2 = ((GXutil.strcmp("", AV74Umaq)==0) ? "ZZZZZZ" : AV74Umaq) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Umaq2", AV75Umaq2);
         if ( (GXutil.strcmp("", AV8barcolnomf)==0) )
         {
            AV8barcolnomf = "zzzzzzzzzzzzz" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8barcolnomf", AV8barcolnomf);
         }
         if ( (0==AV10Barcolnumf) )
         {
            AV10Barcolnumf = 999999 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcolnumf", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcolnumf), 6, 0));
         }
         if ( (GXutil.strcmp("", AV5Artcodf)==0) )
         {
            AV5Artcodf = "zzzzzzzzzzzzzzzz" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", AV5Artcodf);
            /* Using cursor H014D17 */
            pr_default.execute(15, new Object[] {AV5Artcodf});
            hV5Artcodf = "" ;
            while ( (pr_default.getStatus(15) != 101) )
            {
               hV5Artcodf = H014D17_A13751ArtCDsc[0] ;
               if (true) break;
            }
            pr_default.close(15);
            httpContext.ajax_rsp_assign_attri("", false, "hV5Artcodf", hV5Artcodf);
         }
         AV94GenerarInforme = true ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94GenerarInforme", AV94GenerarInforme);
      }
   }

   public void S132( )
   {
      /* 'ALISTAR ARCHIVO' Routine */
      returnInSub = false ;
      AV93DepurarFile.setSource( AV25Filename );
      if ( AV93DepurarFile.exists() )
      {
         AV93DepurarFile.delete();
      }
   }

   public void S152( )
   {
      /* 'DESCARGA &PLANOM' Routine */
      returnInSub = false ;
      AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizando reporte ... ", "")+AV25Filename);
      AV87K = GXutil.sleep( 1) ;
      if ( ! (GXutil.strcmp("", AV58PlaNom)==0) )
      {
         callWebObject(formatLink("app.descargarplano", new String[] {GXutil.URLEncode(GXutil.rtrim(AV58PlaNom))}, new String[] {"Planom"}) );
         httpContext.wjLocDisableFrm = (byte)(2) ;
         AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado reporte ... ", "")+AV25Filename);
         AV87K = GXutil.sleep( 2) ;
         AV89ProgressIndicator.hide();
      }
      else
      {
         AV89ProgressIndicator.hide();
      }
   }

   public void S142( )
   {
      /* 'INICIALIZAR BARRA DE PROGRESO' Routine */
      returnInSub = false ;
      AV89ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(0) );
      AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "Generando Reporte ... ", "")+AV25Filename);
      AV89ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV87K = GXutil.sleep( 2) ;
      AV89ProgressIndicator.showwithtitle(httpContext.getMessage( "actualizando reporte ... ", "")+AV25Filename);
      AV87K = GXutil.sleep( 2) ;
   }

   protected void nextLoad( )
   {
   }

   protected void e1614D2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_61_14D2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelmasopciones_Internalname, tblPanelmasopciones_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divRangoarticulo_Internalname, divRangoarticulo_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavArtcodi_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcodi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcodi_Internalname, httpContext.getMessage( "Artículo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcodi_Internalname, hV6ArtCodi, GXutil.rtrim( localUtil.format( hV6ArtCodi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcodi_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavArtcodi_Visible, edtavArtcodi_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavArtcodf_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcodf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcodf_Internalname, httpContext.getMessage( "Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcodf_Internalname, hV5Artcodf, GXutil.rtrim( localUtil.format( hV5Artcodf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcodf_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavArtcodf_Visible, edtavArtcodf_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(1), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divRangocolor_Internalname, divRangocolor_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarcolnomi_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomi_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomi_Internalname, GXutil.rtrim( AV9Barcolnomi), GXutil.rtrim( localUtil.format( AV9Barcolnomi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomi_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarcolnomi_Visible, edtavBarcolnomi_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarcolnomf_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnomf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnomf_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomf_Internalname, GXutil.rtrim( AV8barcolnomf), GXutil.rtrim( localUtil.format( AV8barcolnomf, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomf_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarcolnomf_Visible, edtavBarcolnomf_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divRangonumero_Internalname, divRangonumero_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarcolnumi_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumi_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumi_Internalname, httpContext.getMessage( "Número Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumi_Internalname, GXutil.ltrim( localUtil.ntoc( AV11Barcolnumi, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11Barcolnumi), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11Barcolnumi), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumi_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarcolnumi_Visible, edtavBarcolnumi_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBarcolnumf_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnumf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnumf_Internalname, httpContext.getMessage( "Número Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumf_Internalname, GXutil.ltrim( localUtil.ntoc( AV10Barcolnumf, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10Barcolnumf), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10Barcolnumf), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumf_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBarcolnumf_Visible, edtavBarcolnumf_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWPRDT10.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_61_14D2e( true) ;
      }
      else
      {
         wb_table1_61_14D2e( false) ;
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
      pa14D2( ) ;
      ws14D2( ) ;
      we14D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424793", true, true);
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
      httpContext.AddJavascriptSource("webwprdt10.js", "?202661016424793", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPmaq_Internalname = "vPMAQ" ;
      edtavUmaq_Internalname = "vUMAQ" ;
      divRangomaquina_Internalname = "RANGOMAQUINA" ;
      edtavHisprodti_Internalname = "vHISPRODTI" ;
      edtavHisprodtf_Internalname = "vHISPRODTF" ;
      divTablahorainicialfinal_Internalname = "TABLAHORAINICIALFINAL" ;
      divRangofecha_Internalname = "RANGOFECHA" ;
      cmbavHisproreo.setInternalname( "vHISPROREO" );
      divTabladiahorafin_Internalname = "TABLADIAHORAFIN" ;
      divPanelgenerales_Internalname = "PANELGENERALES" ;
      Dvpanel_panelgenerales_Internalname = "DVPANEL_PANELGENERALES" ;
      edtavArtcodi_Internalname = "vARTCODI" ;
      edtavArtcodf_Internalname = "vARTCODF" ;
      divRangoarticulo_Internalname = "RANGOARTICULO" ;
      edtavBarcolnomi_Internalname = "vBARCOLNOMI" ;
      edtavBarcolnomf_Internalname = "vBARCOLNOMF" ;
      divRangocolor_Internalname = "RANGOCOLOR" ;
      edtavBarcolnumi_Internalname = "vBARCOLNUMI" ;
      edtavBarcolnumf_Internalname = "vBARCOLNUMF" ;
      divRangonumero_Internalname = "RANGONUMERO" ;
      tblPanelmasopciones_Internalname = "PANELMASOPCIONES" ;
      Dvpanel_panelmasopciones_Internalname = "DVPANEL_PANELMASOPCIONES" ;
      divDvpanel_panelmasopciones_cell_Internalname = "DVPANEL_PANELMASOPCIONES_CELL" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divPanelacciones_Internalname = "PANELACCIONES" ;
      Dvpanel_panelacciones_Internalname = "DVPANEL_PANELACCIONES" ;
      divPnl1_Internalname = "PNL1" ;
      Dvpanel_pnl1_Internalname = "DVPANEL_PNL1" ;
      cmbavTipinf.setInternalname( "vTIPINF" );
      edtavTipmaqcod_Internalname = "vTIPMAQCOD" ;
      chkavExcel.setInternalname( "vEXCEL" );
      cmbavOpi.setInternalname( "vOPI" );
      bttBtnexportarcsv_Internalname = "BTNEXPORTARCSV" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTipoinforme_Internalname = "TIPOINFORME" ;
      Dvpanel_tipoinforme_Internalname = "DVPANEL_TIPOINFORME" ;
      Progrressbar_Internalname = "PROGRRESSBAR" ;
      divPanelresultados_Internalname = "PANELRESULTADOS" ;
      Dvpanel_panelresultados_Internalname = "DVPANEL_PANELRESULTADOS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      chkavDiahorafin.setInternalname( "vDIAHORAFIN" );
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
      edtavBarcolnumf_Jsonclick = "" ;
      edtavBarcolnumf_Enabled = 1 ;
      edtavBarcolnumi_Jsonclick = "" ;
      edtavBarcolnumi_Enabled = 1 ;
      divRangonumero_Visible = 1 ;
      edtavBarcolnomf_Jsonclick = "" ;
      edtavBarcolnomf_Enabled = 1 ;
      edtavBarcolnomi_Jsonclick = "" ;
      edtavBarcolnomi_Enabled = 1 ;
      divRangocolor_Visible = 1 ;
      edtavArtcodf_Jsonclick = "" ;
      edtavArtcodf_Enabled = 1 ;
      edtavArtcodi_Jsonclick = "" ;
      edtavArtcodi_Enabled = 1 ;
      divRangoarticulo_Visible = 1 ;
      edtavBarcolnumf_Visible = 1 ;
      edtavBarcolnumi_Visible = 1 ;
      edtavBarcolnomi_Visible = 1 ;
      edtavBarcolnomf_Visible = 1 ;
      edtavArtcodi_Visible = 1 ;
      edtavArtcodf_Visible = 1 ;
      chkavDiahorafin.setVisible( 1 );
      cmbavOpi.setJsonclick( "" );
      cmbavOpi.setEnabled( 1 );
      chkavExcel.setEnabled( 1 );
      chkavExcel.setVisible( 1 );
      edtavTipmaqcod_Jsonclick = "" ;
      edtavTipmaqcod_Enabled = 1 ;
      cmbavTipinf.setJsonclick( "" );
      cmbavTipinf.setEnabled( 1 );
      divDvpanel_panelmasopciones_cell_Class = "col-xs-12" ;
      divTabladiahorafin_Visible = 1 ;
      cmbavHisproreo.setJsonclick( "" );
      cmbavHisproreo.setEnabled( 1 );
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Enabled = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Enabled = 1 ;
      edtavUmaq_Jsonclick = "" ;
      edtavUmaq_Enabled = 1 ;
      edtavPmaq_Jsonclick = "" ;
      edtavPmaq_Enabled = 1 ;
      Dvpanel_panelresultados_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultados_Iconposition = "Right" ;
      Dvpanel_panelresultados_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultados_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultados_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultados_Title = httpContext.getMessage( "Resultado", "") ;
      Dvpanel_panelresultados_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelresultados_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelresultados_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelresultados_Width = "100%" ;
      Dvpanel_tipoinforme_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tipoinforme_Iconposition = "Right" ;
      Dvpanel_tipoinforme_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tipoinforme_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tipoinforme_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tipoinforme_Title = httpContext.getMessage( "Tipo Informe Excel/Plano", "") ;
      Dvpanel_tipoinforme_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tipoinforme_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tipoinforme_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tipoinforme_Width = "100%" ;
      Dvpanel_pnl1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Iconposition = "Right" ;
      Dvpanel_pnl1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_pnl1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnl1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnl1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnl1_Width = "100%" ;
      Dvpanel_panelacciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Iconposition = "Right" ;
      Dvpanel_panelacciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Title = "" ;
      Dvpanel_panelacciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelacciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelacciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelacciones_Width = "100%" ;
      Dvpanel_panelmasopciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasopciones_Iconposition = "Right" ;
      Dvpanel_panelmasopciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasopciones_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panelmasopciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelmasopciones_Title = httpContext.getMessage( "Más opciones", "") ;
      Dvpanel_panelmasopciones_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelmasopciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelmasopciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelmasopciones_Width = "100%" ;
      Dvpanel_panelgenerales_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelgenerales_Iconposition = "Right" ;
      Dvpanel_panelgenerales_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelgenerales_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelgenerales_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelgenerales_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_panelgenerales_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelgenerales_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelgenerales_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelgenerales_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHisproreo.setName( "vHISPROREO" );
      cmbavHisproreo.setWebtags( "" );
      cmbavHisproreo.addItem("0", httpContext.getMessage( "Produccion Normal", ""), (short)(0));
      cmbavHisproreo.addItem("1", httpContext.getMessage( "Reoperado I", ""), (short)(0));
      cmbavHisproreo.addItem("2", httpContext.getMessage( "Reoperado E", ""), (short)(0));
      cmbavHisproreo.addItem("9", httpContext.getMessage( "Todos", ""), (short)(0));
      if ( cmbavHisproreo.getItemCount() > 0 )
      {
         AV95HisProReo = (byte)(GXutil.lval( cmbavHisproreo.getValidValue(GXutil.trim( GXutil.str( AV95HisProReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95HisProReo", GXutil.str( AV95HisProReo, 1, 0));
      }
      cmbavTipinf.setName( "vTIPINF" );
      cmbavTipinf.setWebtags( "" );
      cmbavTipinf.addItem("1", httpContext.getMessage( "Resumen", ""), (short)(0));
      cmbavTipinf.addItem("2", httpContext.getMessage( "Detalle", ""), (short)(0));
      if ( cmbavTipinf.getItemCount() > 0 )
      {
         AV66TipInf = (byte)(GXutil.lval( cmbavTipinf.getValidValue(GXutil.trim( GXutil.str( AV66TipInf, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TipInf", GXutil.str( AV66TipInf, 1, 0));
      }
      chkavExcel.setName( "vEXCEL" );
      chkavExcel.setWebtags( "" );
      chkavExcel.setCaption( httpContext.getMessage( "Excel", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavExcel.getInternalname(), "TitleCaption", chkavExcel.getCaption(), true);
      chkavExcel.setCheckedValue( "N" );
      AV23Excel = ((GXutil.strcmp(GXutil.rtrim( AV23Excel), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Excel", AV23Excel);
      cmbavOpi.setName( "vOPI" );
      cmbavOpi.setWebtags( "" );
      cmbavOpi.addItem("1", httpContext.getMessage( "Informe I", ""), (short)(0));
      cmbavOpi.addItem("2", httpContext.getMessage( "Informe II", ""), (short)(0));
      if ( cmbavOpi.getItemCount() > 0 )
      {
         AV55Opi = cmbavOpi.getValidValue(AV55Opi) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55Opi", AV55Opi);
      }
      chkavDiahorafin.setName( "vDIAHORAFIN" );
      chkavDiahorafin.setWebtags( "" );
      chkavDiahorafin.setCaption( httpContext.getMessage( "Intervalo Dia-Hora se basara en Dia-Hora Fin de la Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavDiahorafin.getInternalname(), "TitleCaption", chkavDiahorafin.getCaption(), true);
      chkavDiahorafin.setCheckedValue( "0" );
      AV18DiaHoraFin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV18DiaHoraFin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18DiaHoraFin", GXutil.str( AV18DiaHoraFin, 1, 0));
      /* End function init_web_controls */
   }

   public void validv_Pmaq( )
   {
      if ( (GXutil.strcmp("", hV59Pmaq)==0) )
      {
         AV59Pmaq = "" ;
      }
      else
      {
         A13734MaqCDsc = hV59Pmaq ;
         /* Using cursor H014D18 */
         pr_default.execute(16, new Object[] {A13734MaqCDsc});
         AV59Pmaq = H014D18_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vPMAQ");
               GX_FocusControl = edtavPmaq_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV59Pmaq", hV59Pmaq);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV59Pmaq", GXutil.rtrim( AV59Pmaq));
      httpContext.ajax_rsp_assign_attri("", false, "hV59Pmaq", hV59Pmaq);
   }

   public void validv_Umaq( )
   {
      if ( (GXutil.strcmp("", hV74Umaq)==0) )
      {
         AV74Umaq = "" ;
      }
      else
      {
         A13734MaqCDsc = hV74Umaq ;
         /* Using cursor H014D19 */
         pr_default.execute(17, new Object[] {A13734MaqCDsc});
         AV74Umaq = H014D19_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vUMAQ");
               GX_FocusControl = edtavUmaq_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV74Umaq", hV74Umaq);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV74Umaq", GXutil.rtrim( AV74Umaq));
      httpContext.ajax_rsp_assign_attri("", false, "hV74Umaq", hV74Umaq);
   }

   public void validv_Artcodi( )
   {
      if ( (GXutil.strcmp("", hV6ArtCodi)==0) )
      {
         AV6ArtCodi = "" ;
      }
      else
      {
         A13751ArtCDsc = hV6ArtCodi ;
         /* Using cursor H014D20 */
         pr_default.execute(18, new Object[] {A13751ArtCDsc});
         AV6ArtCodi = H014D20_A65ArtCod[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vARTCODI");
               GX_FocusControl = edtavArtcodi_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6ArtCodi", hV6ArtCodi);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6ArtCodi", GXutil.rtrim( AV6ArtCodi));
      httpContext.ajax_rsp_assign_attri("", false, "hV6ArtCodi", hV6ArtCodi);
   }

   public void validv_Artcodf( )
   {
      if ( (GXutil.strcmp("", hV5Artcodf)==0) )
      {
         AV5Artcodf = "" ;
      }
      else
      {
         A13751ArtCDsc = hV5Artcodf ;
         /* Using cursor H014D21 */
         pr_default.execute(19, new Object[] {A13751ArtCDsc});
         AV5Artcodf = H014D21_A65ArtCod[0] ;
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vARTCODF");
               GX_FocusControl = edtavArtcodf_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5Artcodf", hV5Artcodf);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5Artcodf", GXutil.rtrim( AV5Artcodf));
      httpContext.ajax_rsp_assign_attri("", false, "hV5Artcodf", hV5Artcodf);
   }

   public void validv_Tipmaqcod( )
   {
      if ( (GXutil.strcmp("", hV68TipMaqCod)==0) )
      {
         AV68TipMaqCod = "" ;
      }
      else
      {
         A13835TipMaqCDsc = hV68TipMaqCod ;
         /* Using cursor H014D22 */
         pr_default.execute(20, new Object[] {A13835TipMaqCDsc});
         AV68TipMaqCod = H014D22_A1011TipMaqCod[0] ;
         if ( ! ( (pr_default.getStatus(20) == 101) ) )
         {
            pr_default.readNext(20);
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cód. - Tipo Máquina", "")}), 1, "vTIPMAQCOD");
               GX_FocusControl = edtavTipmaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(20);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV68TipMaqCod", hV68TipMaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV68TipMaqCod", GXutil.rtrim( AV68TipMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV68TipMaqCod", hV68TipMaqCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV23Excel',fld:'vEXCEL',pic:''},{av:'AV18DiaHoraFin',fld:'vDIAHORAFIN',pic:'9'},{av:'AV101Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'AV79UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV17Detalledefectos',fld:'vDETALLEDEFECTOS',pic:'9',hsh:true},{av:'AV65Tinturas',fld:'vTINTURAS',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOEXPORTARCSV'","{handler:'e1414D2',iparms:[{av:'AV94GenerarInforme',fld:'vGENERARINFORME',pic:''},{av:'AV101Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'cmbavOpi'},{av:'AV55Opi',fld:'vOPI',pic:'!'},{av:'AV79UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59Pmaq',fld:'vPMAQ',pic:''},{av:'AV75Umaq2',fld:'vUMAQ2',pic:''},{av:'AV32Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV31HisProDtF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV6ArtCodi',fld:'vARTCODI',pic:''},{av:'AV5Artcodf',fld:'vARTCODF',pic:''},{av:'AV9Barcolnomi',fld:'vBARCOLNOMI',pic:''},{av:'AV8barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV11Barcolnumi',fld:'vBARCOLNUMI',pic:'ZZZZZ9'},{av:'AV10Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV74Umaq',fld:'vUMAQ',pic:''},{av:'AV25Filename',fld:'vFILENAME',pic:''},{av:'AV58PlaNom',fld:'vPLANOM',pic:''}]");
      setEventMetadata("'DOEXPORTARCSV'",",oparms:[{av:'AV25Filename',fld:'vFILENAME',pic:''},{av:'AV58PlaNom',fld:'vPLANOM',pic:''},{av:'AV10Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV11Barcolnumi',fld:'vBARCOLNUMI',pic:'ZZZZZ9'},{av:'AV8barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV9Barcolnomi',fld:'vBARCOLNOMI',pic:''},{av:'AV5Artcodf',fld:'vARTCODF',pic:''},{av:'AV6ArtCodi',fld:'vARTCODI',pic:''},{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV31HisProDtF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV32Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV75Umaq2',fld:'vUMAQ2',pic:''},{av:'AV59Pmaq',fld:'vPMAQ',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV94GenerarInforme',fld:'vGENERARINFORME',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1514D2',iparms:[{av:'AV94GenerarInforme',fld:'vGENERARINFORME',pic:''},{av:'cmbavTipinf'},{av:'AV66TipInf',fld:'vTIPINF',pic:'9'},{av:'AV18DiaHoraFin',fld:'vDIAHORAFIN',pic:'9'},{av:'AV17Detalledefectos',fld:'vDETALLEDEFECTOS',pic:'9',hsh:true},{av:'AV101Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV59Pmaq',fld:'vPMAQ',pic:''},{av:'AV75Umaq2',fld:'vUMAQ2',pic:''},{av:'AV32Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV31HisProDtF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV6ArtCodi',fld:'vARTCODI',pic:''},{av:'AV5Artcodf',fld:'vARTCODF',pic:''},{av:'AV9Barcolnomi',fld:'vBARCOLNOMI',pic:''},{av:'AV8barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV11Barcolnumi',fld:'vBARCOLNUMI',pic:'ZZZZZ9'},{av:'AV10Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV23Excel',fld:'vEXCEL',pic:''},{av:'cmbavOpi'},{av:'AV55Opi',fld:'vOPI',pic:'!'},{av:'AV65Tinturas',fld:'vTINTURAS',pic:'9',hsh:true},{av:'AV74Umaq',fld:'vUMAQ',pic:''},{av:'AV25Filename',fld:'vFILENAME',pic:''},{av:'AV85AbrirVentana',fld:'vABRIRVENTANA',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV25Filename',fld:'vFILENAME',pic:''},{av:'AV10Barcolnumf',fld:'vBARCOLNUMF',pic:'ZZZZZ9'},{av:'AV11Barcolnumi',fld:'vBARCOLNUMI',pic:'ZZZZZ9'},{av:'AV8barcolnomf',fld:'vBARCOLNOMF',pic:''},{av:'AV9Barcolnomi',fld:'vBARCOLNOMI',pic:''},{av:'AV5Artcodf',fld:'vARTCODF',pic:''},{av:'AV6ArtCodi',fld:'vARTCODI',pic:''},{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'AV31HisProDtF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV32Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV75Umaq2',fld:'vUMAQ2',pic:''},{av:'AV59Pmaq',fld:'vPMAQ',pic:''},{av:'AV85AbrirVentana',fld:'vABRIRVENTANA',pic:''},{av:'AV21EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV18DiaHoraFin',fld:'vDIAHORAFIN',pic:'9'},{av:'AV94GenerarInforme',fld:'vGENERARINFORME',pic:''}]}");
      setEventMetadata("'DOSALIR'","{handler:'e1114D1',iparms:[]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("VTIPINF.CLICK","{handler:'e1214D1',iparms:[{av:'cmbavTipinf'},{av:'AV66TipInf',fld:'vTIPINF',pic:'9'},{av:'AV23Excel',fld:'vEXCEL',pic:''}]");
      setEventMetadata("VTIPINF.CLICK",",oparms:[{av:'AV23Excel',fld:'vEXCEL',pic:''},{av:'chkavExcel.getVisible()',ctrl:'vEXCEL',prop:'Visible'}]}");
      setEventMetadata("VALIDV_PMAQ","{handler:'validv_Pmaq',iparms:[{av:'hV59Pmaq'},{av:'AV59Pmaq',fld:'vPMAQ',pic:''}]");
      setEventMetadata("VALIDV_PMAQ",",oparms:[{av:'AV59Pmaq',fld:'vPMAQ',pic:''},{av:'hV59Pmaq'}]}");
      setEventMetadata("VALIDV_UMAQ","{handler:'validv_Umaq',iparms:[{av:'hV74Umaq'},{av:'AV74Umaq',fld:'vUMAQ',pic:''}]");
      setEventMetadata("VALIDV_UMAQ",",oparms:[{av:'AV74Umaq',fld:'vUMAQ',pic:''},{av:'hV74Umaq'}]}");
      setEventMetadata("VALIDV_ARTCODI","{handler:'validv_Artcodi',iparms:[{av:'hV6ArtCodi'},{av:'AV6ArtCodi',fld:'vARTCODI',pic:''}]");
      setEventMetadata("VALIDV_ARTCODI",",oparms:[{av:'AV6ArtCodi',fld:'vARTCODI',pic:''},{av:'hV6ArtCodi'}]}");
      setEventMetadata("VALIDV_ARTCODF","{handler:'validv_Artcodf',iparms:[{av:'hV5Artcodf'},{av:'AV5Artcodf',fld:'vARTCODF',pic:''}]");
      setEventMetadata("VALIDV_ARTCODF",",oparms:[{av:'AV5Artcodf',fld:'vARTCODF',pic:''},{av:'hV5Artcodf'}]}");
      setEventMetadata("VALIDV_TIPMAQCOD","{handler:'validv_Tipmaqcod',iparms:[{av:'hV68TipMaqCod'},{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_TIPMAQCOD",",oparms:[{av:'AV68TipMaqCod',fld:'vTIPMAQCOD',pic:''},{av:'hV68TipMaqCod'}]}");
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
      A13751ArtCDsc = "" ;
      A13835TipMaqCDsc = "" ;
      hV59Pmaq = "" ;
      hV74Umaq = "" ;
      hV6ArtCodi = "" ;
      hV5Artcodf = "" ;
      hV68TipMaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV101Pgmdesc = "" ;
      AV79UsurCod = "" ;
      GXKey = "" ;
      AV21EmprCod = "" ;
      AV75Umaq2 = "" ;
      AV25Filename = "" ;
      AV58PlaNom = "" ;
      AV59Pmaq = "" ;
      AV74Umaq = "" ;
      AV6ArtCodi = "" ;
      AV5Artcodf = "" ;
      AV68TipMaqCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnl1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV32Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV31HisProDtF = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_panelmasopciones = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panelacciones = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_panelresultados = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tipoinforme = new com.genexus.webpanels.GXUserControl();
      AV23Excel = "" ;
      AV55Opi = "" ;
      bttBtnexportarcsv_Jsonclick = "" ;
      ucProgrressbar = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H014D2_A13734MaqCDsc = new String[] {""} ;
      H014D3_A13734MaqCDsc = new String[] {""} ;
      l13751ArtCDsc = "" ;
      H014D4_A13751ArtCDsc = new String[] {""} ;
      H014D5_A13751ArtCDsc = new String[] {""} ;
      l13835TipMaqCDsc = "" ;
      H014D6_A13835TipMaqCDsc = new String[] {""} ;
      H014D7_A13734MaqCDsc = new String[] {""} ;
      H014D7_A396EmprCod = new String[] {""} ;
      H014D7_A602MaqCod = new String[] {""} ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      H014D8_A13734MaqCDsc = new String[] {""} ;
      H014D8_A396EmprCod = new String[] {""} ;
      H014D8_A602MaqCod = new String[] {""} ;
      H014D9_A13751ArtCDsc = new String[] {""} ;
      H014D9_A396EmprCod = new String[] {""} ;
      H014D9_A252CliCod = new int[1] ;
      H014D9_A65ArtCod = new String[] {""} ;
      A65ArtCod = "" ;
      H014D10_A13751ArtCDsc = new String[] {""} ;
      H014D10_A396EmprCod = new String[] {""} ;
      H014D10_A252CliCod = new int[1] ;
      H014D10_A65ArtCod = new String[] {""} ;
      H014D11_A13835TipMaqCDsc = new String[] {""} ;
      H014D11_A396EmprCod = new String[] {""} ;
      H014D11_A1011TipMaqCod = new String[] {""} ;
      A1011TipMaqCod = "" ;
      AV100Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      H014D12_A13734MaqCDsc = new String[] {""} ;
      H014D12_A396EmprCod = new String[] {""} ;
      H014D12_A602MaqCod = new String[] {""} ;
      H014D13_A13734MaqCDsc = new String[] {""} ;
      H014D13_A396EmprCod = new String[] {""} ;
      H014D13_A602MaqCod = new String[] {""} ;
      H014D14_A13751ArtCDsc = new String[] {""} ;
      H014D14_A396EmprCod = new String[] {""} ;
      H014D14_A252CliCod = new int[1] ;
      H014D14_A65ArtCod = new String[] {""} ;
      H014D15_A13751ArtCDsc = new String[] {""} ;
      H014D15_A396EmprCod = new String[] {""} ;
      H014D15_A252CliCod = new int[1] ;
      H014D15_A65ArtCod = new String[] {""} ;
      AV9Barcolnomi = "" ;
      AV8barcolnomf = "" ;
      H014D16_A13835TipMaqCDsc = new String[] {""} ;
      H014D16_A396EmprCod = new String[] {""} ;
      H014D16_A1011TipMaqCod = new String[] {""} ;
      AV64Station = "" ;
      AV22EmprNom = "" ;
      AV14Cladd = DecimalUtil.ZERO ;
      AV72Ufec = GXutil.nullDate() ;
      AV57Pfec = GXutil.nullDate() ;
      AV30Hhmmss_i = "" ;
      AV29Hhmmss_f = "" ;
      AV35Horai = GXutil.resetTime( GXutil.nullDate() );
      AV34HoraF = GXutil.resetTime( GXutil.nullDate() );
      AV16defpath = "" ;
      AV54NonTxt = "" ;
      AV13Carpeta = "" ;
      AV53NomInf = "" ;
      GXv_int5 = new byte[1] ;
      GXt_char1 = "" ;
      AV89ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV84ExcelFilename = "" ;
      AV83ErrorMessage = "" ;
      GXv_char2 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_dtime8 = new java.util.Date[1] ;
      GXv_dtime7 = new java.util.Date[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int15 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      H014D17_A13751ArtCDsc = new String[] {""} ;
      H014D17_A396EmprCod = new String[] {""} ;
      H014D17_A252CliCod = new int[1] ;
      H014D17_A65ArtCod = new String[] {""} ;
      AV93DepurarFile = new com.genexus.util.GXFile();
      sStyleString = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H014D18_A13734MaqCDsc = new String[] {""} ;
      H014D18_A396EmprCod = new String[] {""} ;
      H014D18_A602MaqCod = new String[] {""} ;
      ZV59Pmaq = "" ;
      ZhV59Pmaq = "" ;
      H014D19_A13734MaqCDsc = new String[] {""} ;
      H014D19_A396EmprCod = new String[] {""} ;
      H014D19_A602MaqCod = new String[] {""} ;
      ZV74Umaq = "" ;
      ZhV74Umaq = "" ;
      H014D20_A13751ArtCDsc = new String[] {""} ;
      H014D20_A396EmprCod = new String[] {""} ;
      H014D20_A252CliCod = new int[1] ;
      H014D20_A65ArtCod = new String[] {""} ;
      ZV6ArtCodi = "" ;
      ZhV6ArtCodi = "" ;
      H014D21_A13751ArtCDsc = new String[] {""} ;
      H014D21_A396EmprCod = new String[] {""} ;
      H014D21_A252CliCod = new int[1] ;
      H014D21_A65ArtCod = new String[] {""} ;
      ZV5Artcodf = "" ;
      ZhV5Artcodf = "" ;
      H014D22_A13835TipMaqCDsc = new String[] {""} ;
      H014D22_A396EmprCod = new String[] {""} ;
      H014D22_A1011TipMaqCod = new String[] {""} ;
      ZV68TipMaqCod = "" ;
      ZhV68TipMaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwprdt10__default(),
         new Object[] {
             new Object[] {
            H014D2_A13734MaqCDsc
            }
            , new Object[] {
            H014D3_A13734MaqCDsc
            }
            , new Object[] {
            H014D4_A13751ArtCDsc
            }
            , new Object[] {
            H014D5_A13751ArtCDsc
            }
            , new Object[] {
            H014D6_A13835TipMaqCDsc
            }
            , new Object[] {
            H014D7_A13734MaqCDsc, H014D7_A396EmprCod, H014D7_A602MaqCod
            }
            , new Object[] {
            H014D8_A13734MaqCDsc, H014D8_A396EmprCod, H014D8_A602MaqCod
            }
            , new Object[] {
            H014D9_A13751ArtCDsc, H014D9_A396EmprCod, H014D9_A252CliCod, H014D9_A65ArtCod
            }
            , new Object[] {
            H014D10_A13751ArtCDsc, H014D10_A396EmprCod, H014D10_A252CliCod, H014D10_A65ArtCod
            }
            , new Object[] {
            H014D11_A13835TipMaqCDsc, H014D11_A396EmprCod, H014D11_A1011TipMaqCod
            }
            , new Object[] {
            H014D12_A13734MaqCDsc, H014D12_A396EmprCod, H014D12_A602MaqCod
            }
            , new Object[] {
            H014D13_A13734MaqCDsc, H014D13_A396EmprCod, H014D13_A602MaqCod
            }
            , new Object[] {
            H014D14_A13751ArtCDsc, H014D14_A396EmprCod, H014D14_A252CliCod, H014D14_A65ArtCod
            }
            , new Object[] {
            H014D15_A13751ArtCDsc, H014D15_A396EmprCod, H014D15_A252CliCod, H014D15_A65ArtCod
            }
            , new Object[] {
            H014D16_A13835TipMaqCDsc, H014D16_A396EmprCod, H014D16_A1011TipMaqCod
            }
            , new Object[] {
            H014D17_A13751ArtCDsc, H014D17_A396EmprCod, H014D17_A252CliCod, H014D17_A65ArtCod
            }
            , new Object[] {
            H014D18_A13734MaqCDsc, H014D18_A396EmprCod, H014D18_A602MaqCod
            }
            , new Object[] {
            H014D19_A13734MaqCDsc, H014D19_A396EmprCod, H014D19_A602MaqCod
            }
            , new Object[] {
            H014D20_A13751ArtCDsc, H014D20_A396EmprCod, H014D20_A252CliCod, H014D20_A65ArtCod
            }
            , new Object[] {
            H014D21_A13751ArtCDsc, H014D21_A396EmprCod, H014D21_A252CliCod, H014D21_A65ArtCod
            }
            , new Object[] {
            H014D22_A13835TipMaqCDsc, H014D22_A396EmprCod, H014D22_A1011TipMaqCod
            }
         }
      );
      AV101Pgmdesc = httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") ;
      AV100Pgmname = "WebWPRDT10" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV101Pgmdesc = httpContext.getMessage( "Web Listado Produccion Tinte DataTime", "") ;
      AV100Pgmname = "WebWPRDT10" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV17Detalledefectos ;
   private byte AV65Tinturas ;
   private byte AV95HisProReo ;
   private byte AV66TipInf ;
   private byte AV18DiaHoraFin ;
   private byte nDonePA ;
   private byte AV26FlagTexk ;
   private byte AV62Rontaltex ;
   private byte AV63Staack ;
   private byte AV36Indutexma ;
   private byte AV67Tipmaq ;
   private byte AV20eLIOT ;
   private byte AV15DateFin ;
   private byte AV27Flg ;
   private byte GXt_int6 ;
   private byte GXv_int5[] ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV87K ;
   private int edtavPmaq_Enabled ;
   private int edtavUmaq_Enabled ;
   private int edtavHisprodti_Enabled ;
   private int edtavHisprodtf_Enabled ;
   private int divTabladiahorafin_Visible ;
   private int edtavTipmaqcod_Enabled ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int AV11Barcolnumi ;
   private int AV10Barcolnumf ;
   private int edtavArtcodf_Visible ;
   private int edtavArtcodi_Visible ;
   private int divRangoarticulo_Visible ;
   private int edtavBarcolnomf_Visible ;
   private int edtavBarcolnomi_Visible ;
   private int divRangocolor_Visible ;
   private int edtavBarcolnumi_Visible ;
   private int edtavBarcolnumf_Visible ;
   private int divRangonumero_Visible ;
   private int GXv_int16[] ;
   private int GXv_int15[] ;
   private int edtavArtcodi_Enabled ;
   private int edtavArtcodf_Enabled ;
   private int edtavBarcolnomi_Enabled ;
   private int edtavBarcolnomf_Enabled ;
   private int edtavBarcolnumi_Enabled ;
   private int edtavBarcolnumf_Enabled ;
   private int idxLst ;
   private java.math.BigDecimal AV14Cladd ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV101Pgmdesc ;
   private String AV79UsurCod ;
   private String GXKey ;
   private String AV21EmprCod ;
   private String AV75Umaq2 ;
   private String AV25Filename ;
   private String AV58PlaNom ;
   private String AV59Pmaq ;
   private String AV74Umaq ;
   private String AV6ArtCodi ;
   private String AV5Artcodf ;
   private String AV68TipMaqCod ;
   private String Dvpanel_panelgenerales_Width ;
   private String Dvpanel_panelgenerales_Cls ;
   private String Dvpanel_panelgenerales_Title ;
   private String Dvpanel_panelgenerales_Iconposition ;
   private String Dvpanel_panelmasopciones_Width ;
   private String Dvpanel_panelmasopciones_Cls ;
   private String Dvpanel_panelmasopciones_Title ;
   private String Dvpanel_panelmasopciones_Iconposition ;
   private String Dvpanel_panelacciones_Width ;
   private String Dvpanel_panelacciones_Cls ;
   private String Dvpanel_panelacciones_Title ;
   private String Dvpanel_panelacciones_Iconposition ;
   private String Dvpanel_pnl1_Width ;
   private String Dvpanel_pnl1_Cls ;
   private String Dvpanel_pnl1_Title ;
   private String Dvpanel_pnl1_Iconposition ;
   private String Dvpanel_tipoinforme_Width ;
   private String Dvpanel_tipoinforme_Cls ;
   private String Dvpanel_tipoinforme_Title ;
   private String Dvpanel_tipoinforme_Iconposition ;
   private String Dvpanel_panelresultados_Width ;
   private String Dvpanel_panelresultados_Cls ;
   private String Dvpanel_panelresultados_Title ;
   private String Dvpanel_panelresultados_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pnl1_Internalname ;
   private String divPnl1_Internalname ;
   private String Dvpanel_panelgenerales_Internalname ;
   private String divPanelgenerales_Internalname ;
   private String divRangomaquina_Internalname ;
   private String edtavPmaq_Internalname ;
   private String TempTags ;
   private String edtavPmaq_Jsonclick ;
   private String edtavUmaq_Internalname ;
   private String edtavUmaq_Jsonclick ;
   private String divRangofecha_Internalname ;
   private String divTablahorainicialfinal_Internalname ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String divTabladiahorafin_Internalname ;
   private String divDvpanel_panelmasopciones_cell_Internalname ;
   private String divDvpanel_panelmasopciones_cell_Class ;
   private String Dvpanel_panelmasopciones_Internalname ;
   private String Dvpanel_panelacciones_Internalname ;
   private String divPanelacciones_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_panelresultados_Internalname ;
   private String divPanelresultados_Internalname ;
   private String Dvpanel_tipoinforme_Internalname ;
   private String divTipoinforme_Internalname ;
   private String edtavTipmaqcod_Internalname ;
   private String edtavTipmaqcod_Jsonclick ;
   private String AV23Excel ;
   private String AV55Opi ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnexportarcsv_Internalname ;
   private String bttBtnexportarcsv_Jsonclick ;
   private String Progrressbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A65ArtCod ;
   private String A1011TipMaqCod ;
   private String AV100Pgmname ;
   private String edtavArtcodi_Internalname ;
   private String edtavArtcodf_Internalname ;
   private String AV9Barcolnomi ;
   private String edtavBarcolnomi_Internalname ;
   private String AV8barcolnomf ;
   private String edtavBarcolnomf_Internalname ;
   private String edtavBarcolnumi_Internalname ;
   private String edtavBarcolnumf_Internalname ;
   private String AV64Station ;
   private String AV22EmprNom ;
   private String AV30Hhmmss_i ;
   private String AV29Hhmmss_f ;
   private String divRangoarticulo_Internalname ;
   private String divRangocolor_Internalname ;
   private String divRangonumero_Internalname ;
   private String AV16defpath ;
   private String AV54NonTxt ;
   private String AV13Carpeta ;
   private String AV53NomInf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblPanelmasopciones_Internalname ;
   private String edtavArtcodi_Jsonclick ;
   private String edtavArtcodf_Jsonclick ;
   private String edtavBarcolnomi_Jsonclick ;
   private String edtavBarcolnomf_Jsonclick ;
   private String edtavBarcolnumi_Jsonclick ;
   private String edtavBarcolnumf_Jsonclick ;
   private String ZV59Pmaq ;
   private String ZV74Umaq ;
   private String ZV6ArtCodi ;
   private String ZV5Artcodf ;
   private String ZV68TipMaqCod ;
   private java.util.Date AV32Hisprodti ;
   private java.util.Date AV31HisProDtF ;
   private java.util.Date AV35Horai ;
   private java.util.Date AV34HoraF ;
   private java.util.Date GXv_dtime8[] ;
   private java.util.Date GXv_dtime7[] ;
   private java.util.Date Gx_date ;
   private java.util.Date AV72Ufec ;
   private java.util.Date AV57Pfec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV94GenerarInforme ;
   private boolean AV85AbrirVentana ;
   private boolean Dvpanel_panelgenerales_Autowidth ;
   private boolean Dvpanel_panelgenerales_Autoheight ;
   private boolean Dvpanel_panelgenerales_Collapsible ;
   private boolean Dvpanel_panelgenerales_Collapsed ;
   private boolean Dvpanel_panelgenerales_Showcollapseicon ;
   private boolean Dvpanel_panelgenerales_Autoscroll ;
   private boolean Dvpanel_panelmasopciones_Autowidth ;
   private boolean Dvpanel_panelmasopciones_Autoheight ;
   private boolean Dvpanel_panelmasopciones_Collapsible ;
   private boolean Dvpanel_panelmasopciones_Collapsed ;
   private boolean Dvpanel_panelmasopciones_Showcollapseicon ;
   private boolean Dvpanel_panelmasopciones_Autoscroll ;
   private boolean Dvpanel_panelacciones_Autowidth ;
   private boolean Dvpanel_panelacciones_Autoheight ;
   private boolean Dvpanel_panelacciones_Collapsible ;
   private boolean Dvpanel_panelacciones_Collapsed ;
   private boolean Dvpanel_panelacciones_Showcollapseicon ;
   private boolean Dvpanel_panelacciones_Autoscroll ;
   private boolean Dvpanel_pnl1_Autowidth ;
   private boolean Dvpanel_pnl1_Autoheight ;
   private boolean Dvpanel_pnl1_Collapsible ;
   private boolean Dvpanel_pnl1_Collapsed ;
   private boolean Dvpanel_pnl1_Showcollapseicon ;
   private boolean Dvpanel_pnl1_Autoscroll ;
   private boolean Dvpanel_tipoinforme_Autowidth ;
   private boolean Dvpanel_tipoinforme_Autoheight ;
   private boolean Dvpanel_tipoinforme_Collapsible ;
   private boolean Dvpanel_tipoinforme_Collapsed ;
   private boolean Dvpanel_tipoinforme_Showcollapseicon ;
   private boolean Dvpanel_tipoinforme_Autoscroll ;
   private boolean Dvpanel_panelresultados_Autowidth ;
   private boolean Dvpanel_panelresultados_Autoheight ;
   private boolean Dvpanel_panelresultados_Collapsible ;
   private boolean Dvpanel_panelresultados_Collapsed ;
   private boolean Dvpanel_panelresultados_Showcollapseicon ;
   private boolean Dvpanel_panelresultados_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String A13734MaqCDsc ;
   private String A13751ArtCDsc ;
   private String A13835TipMaqCDsc ;
   private String hV59Pmaq ;
   private String hV74Umaq ;
   private String hV6ArtCodi ;
   private String hV5Artcodf ;
   private String hV68TipMaqCod ;
   private String l13734MaqCDsc ;
   private String l13751ArtCDsc ;
   private String l13835TipMaqCDsc ;
   private String AV84ExcelFilename ;
   private String AV83ErrorMessage ;
   private String ZhV59Pmaq ;
   private String ZhV74Umaq ;
   private String ZhV6ArtCodi ;
   private String ZhV5Artcodf ;
   private String ZhV68TipMaqCod ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnl1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelmasopciones ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelacciones ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelresultados ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tipoinforme ;
   private com.genexus.webpanels.GXUserControl ucProgrressbar ;
   private com.genexus.util.GXFile AV93DepurarFile ;
   private HTMLChoice cmbavHisproreo ;
   private HTMLChoice cmbavTipinf ;
   private ICheckbox chkavExcel ;
   private HTMLChoice cmbavOpi ;
   private ICheckbox chkavDiahorafin ;
   private IDataStoreProvider pr_default ;
   private String[] H014D2_A13734MaqCDsc ;
   private String[] H014D3_A13734MaqCDsc ;
   private String[] H014D4_A13751ArtCDsc ;
   private String[] H014D5_A13751ArtCDsc ;
   private String[] H014D6_A13835TipMaqCDsc ;
   private String[] H014D7_A13734MaqCDsc ;
   private String[] H014D7_A396EmprCod ;
   private String[] H014D7_A602MaqCod ;
   private String[] H014D8_A13734MaqCDsc ;
   private String[] H014D8_A396EmprCod ;
   private String[] H014D8_A602MaqCod ;
   private String[] H014D9_A13751ArtCDsc ;
   private String[] H014D9_A396EmprCod ;
   private int[] H014D9_A252CliCod ;
   private String[] H014D9_A65ArtCod ;
   private String[] H014D10_A13751ArtCDsc ;
   private String[] H014D10_A396EmprCod ;
   private int[] H014D10_A252CliCod ;
   private String[] H014D10_A65ArtCod ;
   private String[] H014D11_A13835TipMaqCDsc ;
   private String[] H014D11_A396EmprCod ;
   private String[] H014D11_A1011TipMaqCod ;
   private String[] H014D12_A13734MaqCDsc ;
   private String[] H014D12_A396EmprCod ;
   private String[] H014D12_A602MaqCod ;
   private String[] H014D13_A13734MaqCDsc ;
   private String[] H014D13_A396EmprCod ;
   private String[] H014D13_A602MaqCod ;
   private String[] H014D14_A13751ArtCDsc ;
   private String[] H014D14_A396EmprCod ;
   private int[] H014D14_A252CliCod ;
   private String[] H014D14_A65ArtCod ;
   private String[] H014D15_A13751ArtCDsc ;
   private String[] H014D15_A396EmprCod ;
   private int[] H014D15_A252CliCod ;
   private String[] H014D15_A65ArtCod ;
   private String[] H014D16_A13835TipMaqCDsc ;
   private String[] H014D16_A396EmprCod ;
   private String[] H014D16_A1011TipMaqCod ;
   private String[] H014D17_A13751ArtCDsc ;
   private String[] H014D17_A396EmprCod ;
   private int[] H014D17_A252CliCod ;
   private String[] H014D17_A65ArtCod ;
   private String[] H014D18_A13734MaqCDsc ;
   private String[] H014D18_A396EmprCod ;
   private String[] H014D18_A602MaqCod ;
   private String[] H014D19_A13734MaqCDsc ;
   private String[] H014D19_A396EmprCod ;
   private String[] H014D19_A602MaqCod ;
   private String[] H014D20_A13751ArtCDsc ;
   private String[] H014D20_A396EmprCod ;
   private int[] H014D20_A252CliCod ;
   private String[] H014D20_A65ArtCod ;
   private String[] H014D21_A13751ArtCDsc ;
   private String[] H014D21_A396EmprCod ;
   private int[] H014D21_A252CliCod ;
   private String[] H014D21_A65ArtCod ;
   private String[] H014D22_A13835TipMaqCDsc ;
   private String[] H014D22_A396EmprCod ;
   private String[] H014D22_A1011TipMaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV89ProgressIndicator ;
}

final  class webwprdt10__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H014D2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc FROM TXPARTICU WHERE UPPER(RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc FROM TXPARTICU WHERE UPPER(RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D6", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) AS TipMaqCDsc FROM TXPTIPMAQ WHERE UPPER(RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D7", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D8", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D9", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D10", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D11", "SELECT RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) AS TipMaqCDsc, EmprCod, TipMaqCod FROM TXPTIPMAQ WHERE RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D12", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D13", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D14", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D15", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D16", "SELECT RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) AS TipMaqCDsc, EmprCod, TipMaqCod FROM TXPTIPMAQ WHERE RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D17", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE ArtCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D18", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D19", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D20", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D21", "SELECT RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) AS ArtCDsc, EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE RTRIM(LTRIM(ArtCod)) || '-' || RTRIM(LTRIM(COALESCE( ArtDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H014D22", "SELECT RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) AS TipMaqCDsc, EmprCod, TipMaqCod FROM TXPTIPMAQ WHERE RTRIM(LTRIM(TipMaqCod)) || ' - ' || RTRIM(LTRIM(COALESCE( TipMaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
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
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
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
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 35);
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
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 16);
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
               stmt.setVarchar(1, (String)parms[0], 35);
               return;
      }
   }

}

