package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesquimicosanalisis_wp_impl extends GXDataArea
{
   public costesquimicosanalisis_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public costesquimicosanalisis_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesquimicosanalisis_wp_impl.class ));
   }

   public costesquimicosanalisis_wp_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHreracab = new HTMLChoice();
      chkavConsmanuales = UIFactory.getCheckbox(this);
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
            gxsgvvclicod1FS0( A13735CliCNom) ;
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
            gxsgvvclicod_to1FS0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPCOLCOD") == 0 )
         {
            A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipcolcod1FS0( A13731TipColCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPCOLCOD_TO") == 0 )
         {
            A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipcolcod_to1FS0( A13731TipColCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINTCOD") == 0 )
         {
            A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvintcod1FS0( A13744IntCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINTCOD_TO") == 0 )
         {
            A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvintcod_to1FS0( A13744IntCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPARTCOD") == 0 )
         {
            A13788TipArtCodD = httpContext.GetPar( "TipArtCodD") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipartcod1FS0( A13788TipArtCodD) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPARTCOD_TO") == 0 )
         {
            A13788TipArtCodD = httpContext.GetPar( "TipArtCodD") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipartcod_to1FS0( A13788TipArtCodD) ;
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
            gxsgvvclicod1FS0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD") == 0 )
         {
            hV17CliCod = httpContext.GetPar( "hV17CliCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicod1FS2( hV17CliCod) ;
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
            gxsgvvclicod_to1FS0( A13735CliCNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vCLICOD_TO") == 0 )
         {
            hV18CliCod_to = httpContext.GetPar( "hV18CliCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvclicod_to1FS2( hV18CliCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPCOLCOD") == 0 )
         {
            A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipcolcod1FS0( A13731TipColCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPCOLCOD") == 0 )
         {
            hV9TipColCod = httpContext.GetPar( "hV9TipColCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipcolcod1FS2( hV9TipColCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPCOLCOD_TO") == 0 )
         {
            A13731TipColCDsc = httpContext.GetPar( "TipColCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipcolcod_to1FS0( A13731TipColCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPCOLCOD_TO") == 0 )
         {
            hV10TipColCod_to = httpContext.GetPar( "hV10TipColCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipcolcod_to1FS2( hV10TipColCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINTCOD") == 0 )
         {
            A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvintcod1FS0( A13744IntCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vINTCOD") == 0 )
         {
            hV7IntCod = httpContext.GetPar( "hV7IntCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvintcod1FS2( hV7IntCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vINTCOD_TO") == 0 )
         {
            A13744IntCDsc = httpContext.GetPar( "IntCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvintcod_to1FS0( A13744IntCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vINTCOD_TO") == 0 )
         {
            hV8IntCod_to = httpContext.GetPar( "hV8IntCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvintcod_to1FS2( hV8IntCod_to) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPARTCOD") == 0 )
         {
            A13788TipArtCodD = httpContext.GetPar( "TipArtCodD") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipartcod1FS0( A13788TipArtCodD) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPARTCOD") == 0 )
         {
            hV5TipArtCod = httpContext.GetPar( "hV5TipArtCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipartcod1FS2( hV5TipArtCod) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vTIPARTCOD_TO") == 0 )
         {
            A13788TipArtCodD = httpContext.GetPar( "TipArtCodD") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvtipartcod_to1FS0( A13788TipArtCodD) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vTIPARTCOD_TO") == 0 )
         {
            hV6TipArtCod_to = httpContext.GetPar( "hV6TipArtCod_to") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvtipartcod_to1FS2( hV6TipArtCod_to) ;
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
      pa1FS2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1FS2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.costesquimicosanalisis_wp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV22EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHA_TO2", localUtil.dtoc( AV27Fecha_to2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD_TO2", GXutil.rtrim( AV29ArtCod_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM_TO2", GXutil.rtrim( AV30ForColNom_to2));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM_TO2", GXutil.ltrim( localUtil.ntoc( AV31ForColNum_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_TO2", GXutil.ltrim( localUtil.ntoc( AV32CliCod_to2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV33IntCod_to2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV34TipArtCod_to2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD_TO2", GXutil.ltrim( localUtil.ntoc( AV35TipColCod_to2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD", GXutil.ltrim( localUtil.ntoc( AV17CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV18CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV9TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV10TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvINTCOD", GXutil.ltrim( localUtil.ntoc( AV7IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV8IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV5TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV6TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      if ( ! ( WebComp_Wccostesquimicosanalisis_wc == null ) )
      {
         WebComp_Wccostesquimicosanalisis_wc.componentjscripts();
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
         we1FS2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1FS2( ) ;
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
      return formatLink("app.costesquimicosanalisis_wp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "CostesQuimicosAnalisis_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Quimicos Analisis", "") ;
   }

   public void wb1FS0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHreracab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHreracab.getInternalname(), httpContext.getMessage( "Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHreracab, cmbavHreracab.getInternalname(), GXutil.rtrim( AV19HreRacab), 1, cmbavHreracab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHreracab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_CostesQuimicosAnalisis_WP.htm");
         cmbavHreracab.setValue( GXutil.rtrim( AV19HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFecha_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFecha_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_Internalname, localUtil.format(AV28Fecha, "99/99/99"), localUtil.format( AV28Fecha, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFecha_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFecha_to_Internalname, localUtil.format(AV26Fecha_to, "99/99/99"), localUtil.format( AV26Fecha_to, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFecha_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFecha_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "Fecha", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFecha_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFecha_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, hV17CliCod, GXutil.rtrim( localUtil.format( hV17CliCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_to_Internalname, hV18CliCod_to, GXutil.rtrim( localUtil.format( hV18CliCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_Internalname, GXutil.rtrim( AV15ArtCod), GXutil.rtrim( localUtil.format( AV15ArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod_to_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod_to_Internalname, GXutil.rtrim( AV16ArtCod_to), GXutil.rtrim( localUtil.format( AV16ArtCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod_to_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_Internalname, GXutil.rtrim( AV11ForColNom), GXutil.rtrim( localUtil.format( AV11ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV12ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12ForColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12ForColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnom_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnom_to_Internalname, httpContext.getMessage( "Color final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnom_to_Internalname, GXutil.rtrim( AV13ForColNom_to), GXutil.rtrim( localUtil.format( AV13ForColNom_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnom_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnom_to_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcolnum_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcolnum_to_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcolnum_to_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcolnum_to_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14ForColNum_to), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14ForColNum_to), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcolnum_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcolnum_to_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod_Internalname, httpContext.getMessage( "Tipo Colorante Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_Internalname, hV9TipColCod, GXutil.rtrim( localUtil.format( hV9TipColCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod_to_Internalname, httpContext.getMessage( "Tipo Colorante Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod_to_Internalname, hV10TipColCod_to, GXutil.rtrim( localUtil.format( hV10TipColCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod_to_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod_Internalname, httpContext.getMessage( "Intensidad Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod_Internalname, hV7IntCod, GXutil.rtrim( localUtil.format( hV7IntCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod_to_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod_to_Internalname, httpContext.getMessage( "Intensidad Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod_to_Internalname, hV8IntCod_to, GXutil.rtrim( localUtil.format( hV8IntCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod_to_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod_Internalname, hV5TipArtCod, GXutil.rtrim( localUtil.format( hV5TipArtCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod_Enabled, 0, "text", "", 80, "chr", 3, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod_to_Internalname, hV6TipArtCod_to, GXutil.rtrim( localUtil.format( hV6TipArtCod_to, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod_to_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod_to_Enabled, 0, "text", "", 80, "chr", 3, "row", 200, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº HDR", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV23barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV24barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24barcodreo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV24barcodreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV25barcodpar), GXutil.rtrim( localUtil.format( AV25barcodpar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup2_Internalname, httpContext.getMessage( "Productos", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_CostesQuimicosAnalisis_WP.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformeporproducto_Internalname, "", httpContext.getMessage( "Informe por producto", ""), bttBtninformeporproducto_Jsonclick, 5, httpContext.getMessage( "Informe por producto", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINFORMEPORPRODUCTO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         wb_table1_158_1FS2( true) ;
      }
      else
      {
         wb_table1_158_1FS2( false) ;
      }
      return  ;
   }

   public void wb_table1_158_1FS2e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnresultados_Internalname, "", httpContext.getMessage( "Ver resultados", ""), bttBtnresultados_Jsonclick, 5, httpContext.getMessage( "Ver resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DORESULTADOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportarcsv_Internalname, "", httpContext.getMessage( "Informe CSV", ""), bttBtnexportarcsv_Jsonclick, 5, httpContext.getMessage( "Informe CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTARCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis_WP.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Resultado", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_CostesQuimicosAnalisis_WP.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0192"+"", GXutil.rtrim( WebComp_Wccostesquimicosanalisis_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0192"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWccostesquimicosanalisis_wc), GXutil.lower( WebComp_Wccostesquimicosanalisis_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0192"+"");
               }
               WebComp_Wccostesquimicosanalisis_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWccostesquimicosanalisis_wc), GXutil.lower( WebComp_Wccostesquimicosanalisis_wc_Component)) != 0 )
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

   public void start1FS2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Costes Quimicos Analisis", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1FS0( ) ;
   }

   public void ws1FS2( )
   {
      start1FS2( ) ;
      evt1FS2( ) ;
   }

   public void evt1FS2( )
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
                           e111FS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORESULTADOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoResultados' */
                           e121FS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTARCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportarCSV' */
                           e131FS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141FS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMEPORPRODUCTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInformeporproducto' */
                           e151FS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161FS2 ();
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
                     if ( nCmpId == 192 )
                     {
                        OldWccostesquimicosanalisis_wc = httpContext.cgiGet( "W0192") ;
                        if ( ( GXutil.len( OldWccostesquimicosanalisis_wc) == 0 ) || ( GXutil.strcmp(OldWccostesquimicosanalisis_wc, WebComp_Wccostesquimicosanalisis_wc_Component) != 0 ) )
                        {
                           WebComp_Wccostesquimicosanalisis_wc = WebUtils.getWebComponent(getClass(), "app." + OldWccostesquimicosanalisis_wc + "_impl", remoteHandle, context);
                           WebComp_Wccostesquimicosanalisis_wc_Component = OldWccostesquimicosanalisis_wc ;
                        }
                        if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
                        {
                           WebComp_Wccostesquimicosanalisis_wc.componentprocess("W0192", "", sEvt);
                        }
                        WebComp_Wccostesquimicosanalisis_wc_Component = OldWccostesquimicosanalisis_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1FS2( )
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

   public void pa1FS2( )
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
            GX_FocusControl = cmbavHreracab.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvclicod1FS0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod_data1FS0( A13735CliCNom) ;
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

   protected void gxsgvvclicod_data1FS0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H01FS2 */
      pr_default.execute(0, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS2_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS2_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H01FS2_A13735CliCNom[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvclicod_to1FS0( String A13735CliCNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvclicod_to_data1FS0( A13735CliCNom) ;
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

   protected void gxsgvvclicod_to_data1FS0( String A13735CliCNom )
   {
      l13735CliCNom = GXutil.concat( GXutil.rtrim( A13735CliCNom), "%", "") ;
      /* Using cursor H01FS3 */
      pr_default.execute(1, new Object[] {l13735CliCNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS3_A13735CliCNom[0]) , GXutil.padr( "%" + GXutil.upper( A13735CliCNom) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS3_A13735CliCNom[0]);
            gxdynajaxctrldescr.add(H01FS3_A13735CliCNom[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvtipcolcod1FS0( String A13731TipColCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipcolcod_data1FS0( A13731TipColCDsc) ;
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

   protected void gxsgvvtipcolcod_data1FS0( String A13731TipColCDsc )
   {
      l13731TipColCDsc = GXutil.concat( GXutil.rtrim( A13731TipColCDsc), "%", "") ;
      /* Using cursor H01FS4 */
      pr_default.execute(2, new Object[] {l13731TipColCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS4_A13731TipColCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13731TipColCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS4_A13731TipColCDsc[0]);
            gxdynajaxctrldescr.add(H01FS4_A13731TipColCDsc[0]);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvtipcolcod_to1FS0( String A13731TipColCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipcolcod_to_data1FS0( A13731TipColCDsc) ;
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

   protected void gxsgvvtipcolcod_to_data1FS0( String A13731TipColCDsc )
   {
      l13731TipColCDsc = GXutil.concat( GXutil.rtrim( A13731TipColCDsc), "%", "") ;
      /* Using cursor H01FS5 */
      pr_default.execute(3, new Object[] {l13731TipColCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS5_A13731TipColCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13731TipColCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS5_A13731TipColCDsc[0]);
            gxdynajaxctrldescr.add(H01FS5_A13731TipColCDsc[0]);
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxsgvvintcod1FS0( String A13744IntCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvintcod_data1FS0( A13744IntCDsc) ;
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

   protected void gxsgvvintcod_data1FS0( String A13744IntCDsc )
   {
      l13744IntCDsc = GXutil.concat( GXutil.rtrim( A13744IntCDsc), "%", "") ;
      /* Using cursor H01FS6 */
      pr_default.execute(4, new Object[] {l13744IntCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS6_A13744IntCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13744IntCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS6_A13744IntCDsc[0]);
            gxdynajaxctrldescr.add(H01FS6_A13744IntCDsc[0]);
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void gxsgvvintcod_to1FS0( String A13744IntCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvintcod_to_data1FS0( A13744IntCDsc) ;
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

   protected void gxsgvvintcod_to_data1FS0( String A13744IntCDsc )
   {
      l13744IntCDsc = GXutil.concat( GXutil.rtrim( A13744IntCDsc), "%", "") ;
      /* Using cursor H01FS7 */
      pr_default.execute(5, new Object[] {l13744IntCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS7_A13744IntCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13744IntCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS7_A13744IntCDsc[0]);
            gxdynajaxctrldescr.add(H01FS7_A13744IntCDsc[0]);
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void gxsgvvtipartcod1FS0( String A13788TipArtCodD )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipartcod_data1FS0( A13788TipArtCodD) ;
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

   protected void gxsgvvtipartcod_data1FS0( String A13788TipArtCodD )
   {
      l13788TipArtCodD = GXutil.concat( GXutil.rtrim( A13788TipArtCodD), "%", "") ;
      /* Using cursor H01FS8 */
      pr_default.execute(6, new Object[] {l13788TipArtCodD});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(6) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS8_A13788TipArtCodD[0]) , GXutil.padr( "%" + GXutil.upper( A13788TipArtCodD) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS8_A13788TipArtCodD[0]);
            gxdynajaxctrldescr.add(H01FS8_A13788TipArtCodD[0]);
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
   }

   public void gxsgvvtipartcod_to1FS0( String A13788TipArtCodD )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvtipartcod_to_data1FS0( A13788TipArtCodD) ;
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

   protected void gxsgvvtipartcod_to_data1FS0( String A13788TipArtCodD )
   {
      l13788TipArtCodD = GXutil.concat( GXutil.rtrim( A13788TipArtCodD), "%", "") ;
      /* Using cursor H01FS9 */
      pr_default.execute(7, new Object[] {l13788TipArtCodD});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(7) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01FS9_A13788TipArtCodD[0]) , GXutil.padr( "%" + GXutil.upper( A13788TipArtCodD) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01FS9_A13788TipArtCodD[0]);
            gxdynajaxctrldescr.add(H01FS9_A13788TipArtCodD[0]);
         }
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void gxhcvvclicod1FS2( String A13735CliCNom )
   {
      /* Using cursor H01FS10 */
      pr_default.execute(8, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(8) != 101) )
      {
         if ( GXutil.strcmp(H01FS10_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H01FS10_A13735CliCNom[0] ;
            A396EmprCod = H01FS10_A396EmprCod[0] ;
            A252CliCod = H01FS10_A252CliCod[0] ;
         }
         pr_default.readNext(8);
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
      pr_default.close(8);
   }

   public void gxhcvvclicod_to1FS2( String A13735CliCNom )
   {
      /* Using cursor H01FS11 */
      pr_default.execute(9, new Object[] {A13735CliCNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(9) != 101) )
      {
         if ( GXutil.strcmp(H01FS11_A13735CliCNom[0], A13735CliCNom) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13735CliCNom = H01FS11_A13735CliCNom[0] ;
            A396EmprCod = H01FS11_A396EmprCod[0] ;
            A252CliCod = H01FS11_A252CliCod[0] ;
         }
         pr_default.readNext(9);
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
      pr_default.close(9);
   }

   public void gxhcvvtipcolcod1FS2( String A13731TipColCDsc )
   {
      /* Using cursor H01FS12 */
      pr_default.execute(10, new Object[] {A13731TipColCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(10) != 101) )
      {
         if ( GXutil.strcmp(H01FS12_A13731TipColCDsc[0], A13731TipColCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13731TipColCDsc = H01FS12_A13731TipColCDsc[0] ;
            A396EmprCod = H01FS12_A396EmprCod[0] ;
            A831TipColCod = H01FS12_A831TipColCod[0] ;
         }
         pr_default.readNext(10);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcvvtipcolcod_to1FS2( String A13731TipColCDsc )
   {
      /* Using cursor H01FS13 */
      pr_default.execute(11, new Object[] {A13731TipColCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(11) != 101) )
      {
         if ( GXutil.strcmp(H01FS13_A13731TipColCDsc[0], A13731TipColCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13731TipColCDsc = H01FS13_A13731TipColCDsc[0] ;
            A396EmprCod = H01FS13_A396EmprCod[0] ;
            A831TipColCod = H01FS13_A831TipColCod[0] ;
         }
         pr_default.readNext(11);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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

   public void gxhcvvintcod1FS2( String A13744IntCDsc )
   {
      /* Using cursor H01FS14 */
      pr_default.execute(12, new Object[] {A13744IntCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(12) != 101) )
      {
         if ( GXutil.strcmp(H01FS14_A13744IntCDsc[0], A13744IntCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13744IntCDsc = H01FS14_A13744IntCDsc[0] ;
            A396EmprCod = H01FS14_A396EmprCod[0] ;
            A583IntCod = H01FS14_A583IntCod[0] ;
         }
         pr_default.readNext(12);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(12);
   }

   public void gxhcvvintcod_to1FS2( String A13744IntCDsc )
   {
      /* Using cursor H01FS15 */
      pr_default.execute(13, new Object[] {A13744IntCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(13) != 101) )
      {
         if ( GXutil.strcmp(H01FS15_A13744IntCDsc[0], A13744IntCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13744IntCDsc = H01FS15_A13744IntCDsc[0] ;
            A396EmprCod = H01FS15_A396EmprCod[0] ;
            A583IntCod = H01FS15_A583IntCod[0] ;
         }
         pr_default.readNext(13);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(13);
   }

   public void gxhcvvtipartcod1FS2( String A13788TipArtCodD )
   {
      /* Using cursor H01FS16 */
      pr_default.execute(14, new Object[] {A13788TipArtCodD});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(14) != 101) )
      {
         if ( GXutil.strcmp(H01FS16_A13788TipArtCodD[0], A13788TipArtCodD) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13788TipArtCodD = H01FS16_A13788TipArtCodD[0] ;
            A396EmprCod = H01FS16_A396EmprCod[0] ;
            A829TipArtCod = H01FS16_A829TipArtCod[0] ;
         }
         pr_default.readNext(14);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(14);
   }

   public void gxhcvvtipartcod_to1FS2( String A13788TipArtCodD )
   {
      /* Using cursor H01FS17 */
      pr_default.execute(15, new Object[] {A13788TipArtCodD});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(15) != 101) )
      {
         if ( GXutil.strcmp(H01FS17_A13788TipArtCodD[0], A13788TipArtCodD) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13788TipArtCodD = H01FS17_A13788TipArtCodD[0] ;
            A396EmprCod = H01FS17_A396EmprCod[0] ;
            A829TipArtCod = H01FS17_A829TipArtCod[0] ;
         }
         pr_default.readNext(15);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(15);
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
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV19HreRacab = cmbavHreracab.getValidValue(AV19HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19HreRacab", AV19HreRacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHreracab.setValue( GXutil.rtrim( AV19HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      }
      AV36ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV36ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ConsManuales", GXutil.str( AV36ConsManuales, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1FS2( ) ;
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

   public void rf1FS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
            {
               WebComp_Wccostesquimicosanalisis_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e161FS2 ();
         wb1FS0( ) ;
      }
   }

   public void send_integrity_lvl_hashes1FS2( )
   {
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1FS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111FS2 ();
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
         cmbavHreracab.setValue( httpContext.cgiGet( cmbavHreracab.getInternalname()) );
         AV19HreRacab = httpContext.cgiGet( cmbavHreracab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19HreRacab", AV19HreRacab);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA");
            GX_FocusControl = edtavFecha_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28Fecha = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
         }
         else
         {
            AV28Fecha = localUtil.ctod( httpContext.cgiGet( edtavFecha_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFecha_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFECHA_TO");
            GX_FocusControl = edtavFecha_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26Fecha_to = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Fecha_to", localUtil.format(AV26Fecha_to, "99/99/99"));
         }
         else
         {
            AV26Fecha_to = localUtil.ctod( httpContext.cgiGet( edtavFecha_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Fecha_to", localUtil.format(AV26Fecha_to, "99/99/99"));
         }
         hV17CliCod = httpContext.cgiGet( edtavClicod_Internalname) ;
         if ( (GXutil.strcmp("", hV17CliCod)==0) )
         {
            AV17CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
         }
         else
         {
            A13735CliCNom = hV17CliCod ;
            /* Using cursor H01FS18 */
            pr_default.execute(16, new Object[] {A13735CliCNom});
            AV17CliCod = H01FS18_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               pr_default.readNext(16);
               if ( ! ( (pr_default.getStatus(16) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD");
                  GX_FocusControl = edtavClicod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(16);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV17CliCod", hV17CliCod);
         hV18CliCod_to = httpContext.cgiGet( edtavClicod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV18CliCod_to)==0) )
         {
            AV18CliCod_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliCod_to), 6, 0));
         }
         else
         {
            A13735CliCNom = hV18CliCod_to ;
            /* Using cursor H01FS19 */
            pr_default.execute(17, new Object[] {A13735CliCNom});
            AV18CliCod_to = H01FS19_A252CliCod[0] ;
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               pr_default.readNext(17);
               if ( ! ( (pr_default.getStatus(17) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD_TO");
                  GX_FocusControl = edtavClicod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(17);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV18CliCod_to", hV18CliCod_to);
         AV15ArtCod = httpContext.cgiGet( edtavArtcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ArtCod", AV15ArtCod);
         AV16ArtCod_to = httpContext.cgiGet( edtavArtcod_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16ArtCod_to", AV16ArtCod_to);
         AV11ForColNom = httpContext.cgiGet( edtavForcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11ForColNom", AV11ForColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUM");
            GX_FocusControl = edtavForcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12ForColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12ForColNum), 6, 0));
         }
         else
         {
            AV12ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12ForColNum), 6, 0));
         }
         AV13ForColNom_to = httpContext.cgiGet( edtavForcolnom_to_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13ForColNom_to", AV13ForColNom_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCOLNUM_TO");
            GX_FocusControl = edtavForcolnum_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14ForColNum_to = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNum_to), 6, 0));
         }
         else
         {
            AV14ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( edtavForcolnum_to_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForColNum_to), 6, 0));
         }
         hV9TipColCod = httpContext.cgiGet( edtavTipcolcod_Internalname) ;
         if ( (GXutil.strcmp("", hV9TipColCod)==0) )
         {
            AV9TipColCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9TipColCod), 2, 0));
         }
         else
         {
            A13731TipColCDsc = hV9TipColCod ;
            /* Using cursor H01FS20 */
            pr_default.execute(18, new Object[] {A13731TipColCDsc});
            AV9TipColCod = H01FS20_A831TipColCod[0] ;
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               pr_default.readNext(18);
               if ( ! ( (pr_default.getStatus(18) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Tipo Colorante", "")}), 1, "vTIPCOLCOD");
                  GX_FocusControl = edtavTipcolcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(18);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV9TipColCod", hV9TipColCod);
         hV10TipColCod_to = httpContext.cgiGet( edtavTipcolcod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV10TipColCod_to)==0) )
         {
            AV10TipColCod_to = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10TipColCod_to), 2, 0));
         }
         else
         {
            A13731TipColCDsc = hV10TipColCod_to ;
            /* Using cursor H01FS21 */
            pr_default.execute(19, new Object[] {A13731TipColCDsc});
            AV10TipColCod_to = H01FS21_A831TipColCod[0] ;
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               pr_default.readNext(19);
               if ( ! ( (pr_default.getStatus(19) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Tipo Colorante", "")}), 1, "vTIPCOLCOD_TO");
                  GX_FocusControl = edtavTipcolcod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(19);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV10TipColCod_to", hV10TipColCod_to);
         hV7IntCod = httpContext.cgiGet( edtavIntcod_Internalname) ;
         if ( (GXutil.strcmp("", hV7IntCod)==0) )
         {
            AV7IntCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7IntCod), 2, 0));
         }
         else
         {
            A13744IntCDsc = hV7IntCod ;
            /* Using cursor H01FS22 */
            pr_default.execute(20, new Object[] {A13744IntCDsc});
            AV7IntCod = H01FS22_A583IntCod[0] ;
            if ( ! ( (pr_default.getStatus(20) == 101) ) )
            {
               pr_default.readNext(20);
               if ( ! ( (pr_default.getStatus(20) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vINTCOD");
                  GX_FocusControl = edtavIntcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(20);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV7IntCod", hV7IntCod);
         hV8IntCod_to = httpContext.cgiGet( edtavIntcod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV8IntCod_to)==0) )
         {
            AV8IntCod_to = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8IntCod_to), 2, 0));
         }
         else
         {
            A13744IntCDsc = hV8IntCod_to ;
            /* Using cursor H01FS23 */
            pr_default.execute(21, new Object[] {A13744IntCDsc});
            AV8IntCod_to = H01FS23_A583IntCod[0] ;
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               pr_default.readNext(21);
               if ( ! ( (pr_default.getStatus(21) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vINTCOD_TO");
                  GX_FocusControl = edtavIntcod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(21);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV8IntCod_to", hV8IntCod_to);
         hV5TipArtCod = httpContext.cgiGet( edtavTipartcod_Internalname) ;
         if ( (GXutil.strcmp("", hV5TipArtCod)==0) )
         {
            AV5TipArtCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5TipArtCod), 4, 0));
         }
         else
         {
            A13788TipArtCodD = hV5TipArtCod ;
            /* Using cursor H01FS24 */
            pr_default.execute(22, new Object[] {A13788TipArtCodD});
            AV5TipArtCod = H01FS24_A829TipArtCod[0] ;
            if ( ! ( (pr_default.getStatus(22) == 101) ) )
            {
               pr_default.readNext(22);
               if ( ! ( (pr_default.getStatus(22) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vTIPARTCOD");
                  GX_FocusControl = edtavTipartcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(22);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV5TipArtCod", hV5TipArtCod);
         hV6TipArtCod_to = httpContext.cgiGet( edtavTipartcod_to_Internalname) ;
         if ( (GXutil.strcmp("", hV6TipArtCod_to)==0) )
         {
            AV6TipArtCod_to = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6TipArtCod_to), 4, 0));
         }
         else
         {
            A13788TipArtCodD = hV6TipArtCod_to ;
            /* Using cursor H01FS25 */
            pr_default.execute(23, new Object[] {A13788TipArtCodD});
            AV6TipArtCod_to = H01FS25_A829TipArtCod[0] ;
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vTIPARTCOD_TO");
                  GX_FocusControl = edtavTipartcod_to_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV6TipArtCod_to", hV6TipArtCod_to);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23barcod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23barcod), 8, 0));
         }
         else
         {
            AV23barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23barcod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24barcodreo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24barcodreo", GXutil.str( AV24barcodreo, 1, 0));
         }
         else
         {
            AV24barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24barcodreo", GXutil.str( AV24barcodreo, 1, 0));
         }
         AV25barcodpar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25barcodpar", AV25barcodpar);
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONSMANUALES");
            GX_FocusControl = chkavConsmanuales.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36ConsManuales = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ConsManuales", GXutil.str( AV36ConsManuales, 1, 0));
         }
         else
         {
            AV36ConsManuales = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36ConsManuales", GXutil.str( AV36ConsManuales, 1, 0));
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
      e111FS2 ();
      if (returnInSub) return;
   }

   public void e111FS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesquimicosanalisis_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV22EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesquimicosanalisis_wp_impl.this.AV22EmprCod = GXv_char2[0] ;
      costesquimicosanalisis_wp_impl.this.AV38EmprNom = GXv_char3[0] ;
      costesquimicosanalisis_wp_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      AV28Fecha = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      AV26Fecha_to = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Fecha_to", localUtil.format(AV26Fecha_to, "99/99/99"));
      AV19HreRacab = httpContext.getMessage( "T", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19HreRacab", AV19HreRacab);
      GXt_char1 = AV37Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      costesquimicosanalisis_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV37Station = GXt_char1 ;
      GXv_char4[0] = AV22EmprCod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char2[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char4, GXv_char3, GXv_char2) ;
      costesquimicosanalisis_wp_impl.this.AV22EmprCod = GXv_char4[0] ;
      costesquimicosanalisis_wp_impl.this.AV38EmprNom = GXv_char3[0] ;
      costesquimicosanalisis_wp_impl.this.AV39UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wccostesquimicosanalisis_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wccostesquimicosanalisis_wc_Component), GXutil.lower( "CostesQuimicosAnalisis_WC")) != 0 )
      {
         WebComp_Wccostesquimicosanalisis_wc = WebUtils.getWebComponent(getClass(), "app.costesquimicosanalisis_wc_impl", remoteHandle, context);
         WebComp_Wccostesquimicosanalisis_wc_Component = "CostesQuimicosAnalisis_WC" ;
      }
      if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
      {
         WebComp_Wccostesquimicosanalisis_wc.setjustcreated();
         WebComp_Wccostesquimicosanalisis_wc.componentprepare(new Object[] {"W0192","",AV22EmprCod,AV19HreRacab,AV28Fecha,AV26Fecha_to,Integer.valueOf(0),Integer.valueOf(AV23barcod),Byte.valueOf(AV24barcodreo),AV25barcodpar,AV15ArtCod,AV16ArtCod_to,AV11ForColNom,AV13ForColNom_to,Integer.valueOf(AV12ForColNum),Integer.valueOf(AV14ForColNum_to),Integer.valueOf(AV17CliCod),Integer.valueOf(AV18CliCod_to),Byte.valueOf(AV7IntCod),Byte.valueOf(AV8IntCod_to),Short.valueOf(AV5TipArtCod),Short.valueOf(AV6TipArtCod_to),Byte.valueOf(AV9TipColCod),Byte.valueOf(AV10TipColCod_to)});
         WebComp_Wccostesquimicosanalisis_wc.componentbind(new Object[] {"","vHRERACAB","vFECHA","vFECHA_TO","","vBARCOD","vBARCODREO","vBARCODPAR","vARTCOD","vARTCOD_TO","vFORCOLNOM","vFORCOLNOM_TO","vFORCOLNUM","vFORCOLNUM_TO","vCLICOD","vCLICOD_TO","vINTCOD","vINTCOD_TO","vTIPARTCOD","vTIPARTCOD_TO","vTIPCOLCOD","vTIPCOLCOD_TO"});
      }
   }

   public void e121FS2( )
   {
      /* 'DoResultados' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S112 ();
      if (returnInSub) return;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wccostesquimicosanalisis_wc = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wccostesquimicosanalisis_wc_Component), GXutil.lower( "CostesQuimicosAnalisis_WC")) != 0 )
      {
         WebComp_Wccostesquimicosanalisis_wc = WebUtils.getWebComponent(getClass(), "app.costesquimicosanalisis_wc_impl", remoteHandle, context);
         WebComp_Wccostesquimicosanalisis_wc_Component = "CostesQuimicosAnalisis_WC" ;
      }
      if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
      {
         WebComp_Wccostesquimicosanalisis_wc.setjustcreated();
         WebComp_Wccostesquimicosanalisis_wc.componentprepare(new Object[] {"W0192","",AV22EmprCod,AV19HreRacab,AV28Fecha,AV27Fecha_to2,Integer.valueOf(0),Integer.valueOf(AV23barcod),Byte.valueOf(AV24barcodreo),AV25barcodpar,AV15ArtCod,AV29ArtCod_to2,AV11ForColNom,AV30ForColNom_to2,Integer.valueOf(AV12ForColNum),Integer.valueOf(AV31ForColNum_to2),Integer.valueOf(AV17CliCod),Integer.valueOf(AV32CliCod_to2),Byte.valueOf(AV7IntCod),Byte.valueOf(AV33IntCod_to2),Short.valueOf(AV5TipArtCod),Short.valueOf(AV34TipArtCod_to2),Byte.valueOf(AV9TipColCod),Byte.valueOf(AV35TipColCod_to2)});
         WebComp_Wccostesquimicosanalisis_wc.componentbind(new Object[] {"","vHRERACAB","vFECHA","","","vBARCOD","vBARCODREO","vBARCODPAR","vARTCOD","","vFORCOLNOM","","vFORCOLNUM","","vCLICOD","","vINTCOD","","vTIPARTCOD","","vTIPCOLCOD",""});
      }
      if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wccostesquimicosanalisis_wc )
      {
         httpContext.ajax_rspStartCmp("gxHTMLWrpW0192"+"");
         WebComp_Wccostesquimicosanalisis_wc.componentdraw();
         httpContext.ajax_rspEndCmp();
      }
      /*  Sending Event outputs  */
   }

   public void e131FS2( )
   {
      /* 'DoExportarCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S112 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.costesquimicosanalisisdetalleexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV22EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV19HreRacab)),GXutil.URLEncode(GXutil.formatDateParm(AV28Fecha)),GXutil.URLEncode(GXutil.formatDateParm(AV27Fecha_to2)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV23barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV25barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV15ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV29ArtCod_to2)),GXutil.URLEncode(GXutil.rtrim(AV11ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV30ForColNom_to2)),GXutil.URLEncode(GXutil.ltrimstr(AV12ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31ForColNum_to2,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV17CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV32CliCod_to2,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7IntCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33IntCod_to2,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV5TipArtCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV34TipArtCod_to2,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35TipColCod_to2,2,0))}, new String[] {"Emprcod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","ARtcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","TipArtCod3","Tipcolcod1","Tipcolcod3"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void e141FS2( )
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

   public void e151FS2( )
   {
      /* 'DoInformeporproducto' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGARVARIABLES' */
      S112 ();
      if (returnInSub) return;
      GXv_char4[0] = AV22EmprCod ;
      GXv_char3[0] = AV19HreRacab ;
      GXv_date5[0] = AV28Fecha ;
      GXv_date6[0] = AV27Fecha_to2 ;
      GXv_char2[0] = AV15ArtCod ;
      GXv_char7[0] = AV29ArtCod_to2 ;
      GXv_char8[0] = AV11ForColNom ;
      GXv_char9[0] = AV30ForColNom_to2 ;
      GXv_int10[0] = AV12ForColNum ;
      GXv_int11[0] = AV31ForColNum_to2 ;
      GXv_int12[0] = AV17CliCod ;
      GXv_int13[0] = AV32CliCod_to2 ;
      GXv_int14[0] = AV7IntCod ;
      GXv_int15[0] = AV33IntCod_to2 ;
      GXv_int16[0] = AV5TipArtCod ;
      GXv_int17[0] = AV34TipArtCod_to2 ;
      GXv_int18[0] = AV9TipColCod ;
      GXv_int19[0] = AV35TipColCod_to2 ;
      GXv_int20[0] = AV23barcod ;
      GXv_int21[0] = AV24barcodreo ;
      GXv_char22[0] = AV25barcodpar ;
      GXv_int23[0] = AV36ConsManuales ;
      GXv_char24[0] = AV20ExcelFilename ;
      GXv_char25[0] = AV21ErrorMessage ;
      new app.informeproductosconsumos(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5, GXv_date6, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_char22, GXv_int23, GXv_char24, GXv_char25) ;
      costesquimicosanalisis_wp_impl.this.AV22EmprCod = GXv_char4[0] ;
      costesquimicosanalisis_wp_impl.this.AV19HreRacab = GXv_char3[0] ;
      costesquimicosanalisis_wp_impl.this.AV28Fecha = GXv_date5[0] ;
      costesquimicosanalisis_wp_impl.this.AV27Fecha_to2 = GXv_date6[0] ;
      costesquimicosanalisis_wp_impl.this.AV15ArtCod = GXv_char2[0] ;
      costesquimicosanalisis_wp_impl.this.AV29ArtCod_to2 = GXv_char7[0] ;
      costesquimicosanalisis_wp_impl.this.AV11ForColNom = GXv_char8[0] ;
      costesquimicosanalisis_wp_impl.this.AV30ForColNom_to2 = GXv_char9[0] ;
      costesquimicosanalisis_wp_impl.this.AV12ForColNum = GXv_int10[0] ;
      costesquimicosanalisis_wp_impl.this.AV31ForColNum_to2 = GXv_int11[0] ;
      costesquimicosanalisis_wp_impl.this.AV17CliCod = GXv_int12[0] ;
      costesquimicosanalisis_wp_impl.this.AV32CliCod_to2 = GXv_int13[0] ;
      costesquimicosanalisis_wp_impl.this.AV7IntCod = GXv_int14[0] ;
      costesquimicosanalisis_wp_impl.this.AV33IntCod_to2 = GXv_int15[0] ;
      costesquimicosanalisis_wp_impl.this.AV5TipArtCod = GXv_int16[0] ;
      costesquimicosanalisis_wp_impl.this.AV34TipArtCod_to2 = GXv_int17[0] ;
      costesquimicosanalisis_wp_impl.this.AV9TipColCod = GXv_int18[0] ;
      costesquimicosanalisis_wp_impl.this.AV35TipColCod_to2 = GXv_int19[0] ;
      costesquimicosanalisis_wp_impl.this.AV23barcod = GXv_int20[0] ;
      costesquimicosanalisis_wp_impl.this.AV24barcodreo = GXv_int21[0] ;
      costesquimicosanalisis_wp_impl.this.AV25barcodpar = GXv_char22[0] ;
      costesquimicosanalisis_wp_impl.this.AV36ConsManuales = GXv_int23[0] ;
      costesquimicosanalisis_wp_impl.this.AV20ExcelFilename = GXv_char24[0] ;
      costesquimicosanalisis_wp_impl.this.AV21ErrorMessage = GXv_char25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22EmprCod", AV22EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV19HreRacab", AV19HreRacab);
      httpContext.ajax_rsp_assign_attri("", false, "AV28Fecha", localUtil.format(AV28Fecha, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Fecha_to2", localUtil.format(AV27Fecha_to2, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV15ArtCod", AV15ArtCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29ArtCod_to2", AV29ArtCod_to2);
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForColNom", AV11ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForColNom_to2", AV30ForColNom_to2);
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV31ForColNum_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ForColNum_to2), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod_to2), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7IntCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV33IntCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33IntCod_to2), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5TipArtCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV34TipArtCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod_to2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV35TipColCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipColCod_to2), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV23barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV24barcodreo", GXutil.str( AV24barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV25barcodpar", AV25barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV36ConsManuales", GXutil.str( AV36ConsManuales, 1, 0));
      if ( GXutil.strcmp(AV20ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV20ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV21ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavHreracab.setValue( GXutil.rtrim( AV19HreRacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
   }

   public void S112( )
   {
      /* 'CARGARVARIABLES' Routine */
      returnInSub = false ;
      AV27Fecha_to2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV26Fecha_to)) ? GXutil.serverDate( context, remoteHandle, pr_default) : AV26Fecha_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Fecha_to2", localUtil.format(AV27Fecha_to2, "99/99/99"));
      AV29ArtCod_to2 = ((GXutil.strcmp("", AV16ArtCod_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV16ArtCod_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ArtCod_to2", AV29ArtCod_to2);
      AV30ForColNom_to2 = ((GXutil.strcmp("", AV13ForColNom_to)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV13ForColNom_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForColNom_to2", AV30ForColNom_to2);
      AV31ForColNum_to2 = ((GXutil.strcmp("", AV13ForColNom_to)==0) ? 999999 : AV14ForColNum_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ForColNum_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31ForColNum_to2), 6, 0));
      AV32CliCod_to2 = ((0==AV18CliCod_to) ? 999999 : AV18CliCod_to) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod_to2), 6, 0));
      AV33IntCod_to2 = (byte)(((0==AV8IntCod_to) ? 99 : AV8IntCod_to)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33IntCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33IntCod_to2), 2, 0));
      AV34TipArtCod_to2 = (short)(((0==AV6TipArtCod_to) ? 9999 : AV6TipArtCod_to)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TipArtCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TipArtCod_to2), 4, 0));
      AV35TipColCod_to2 = (byte)(((0==AV10TipColCod_to) ? 99 : AV10TipColCod_to)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TipColCod_to2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TipColCod_to2), 2, 0));
   }

   protected void nextLoad( )
   {
   }

   protected void e161FS2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_158_1FS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedconsmanuales_Internalname, tblTablemergedconsmanuales_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavConsmanuales.getInternalname(), httpContext.getMessage( "Cons Manuales", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavConsmanuales.getInternalname(), GXutil.str( AV36ConsManuales, 1, 0), "", httpContext.getMessage( "Cons Manuales", ""), 1, chkavConsmanuales.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(162, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,162);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblConsmanuales_righttext_Internalname, httpContext.getMessage( "Incluir Consumos Manuales?", ""), "", "", lblConsmanuales_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_CostesQuimicosAnalisis_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_158_1FS2e( true) ;
      }
      else
      {
         wb_table1_158_1FS2e( false) ;
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
      pa1FS2( ) ;
      ws1FS2( ) ;
      we1FS2( ) ;
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
      if ( ! ( WebComp_Wccostesquimicosanalisis_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wccostesquimicosanalisis_wc_Component) != 0 )
         {
            WebComp_Wccostesquimicosanalisis_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016431646", true, true);
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
      httpContext.AddJavascriptSource("costesquimicosanalisis_wp.js", "?202661016431646", false, true);
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
      cmbavHreracab.setInternalname( "vHRERACAB" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavFecha_Internalname = "vFECHA" ;
      edtavFecha_to_Internalname = "vFECHA_TO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClicod_to_Internalname = "vCLICOD_TO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavArtcod_Internalname = "vARTCOD" ;
      edtavArtcod_to_Internalname = "vARTCOD_TO" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavForcolnom_Internalname = "vFORCOLNOM" ;
      edtavForcolnum_Internalname = "vFORCOLNUM" ;
      edtavForcolnom_to_Internalname = "vFORCOLNOM_TO" ;
      edtavForcolnum_to_Internalname = "vFORCOLNUM_TO" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavTipcolcod_Internalname = "vTIPCOLCOD" ;
      edtavTipcolcod_to_Internalname = "vTIPCOLCOD_TO" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtavIntcod_Internalname = "vINTCOD" ;
      edtavIntcod_to_Internalname = "vINTCOD_TO" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavTipartcod_Internalname = "vTIPARTCOD" ;
      edtavTipartcod_to_Internalname = "vTIPARTCOD_TO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtninformeporproducto_Internalname = "BTNINFORMEPORPRODUCTO" ;
      chkavConsmanuales.setInternalname( "vCONSMANUALES" );
      lblConsmanuales_righttext_Internalname = "CONSMANUALES_RIGHTTEXT" ;
      tblTablemergedconsmanuales_Internalname = "TABLEMERGEDCONSMANUALES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      grpUnnamedgroup2_Internalname = "UNNAMEDGROUP2" ;
      divTable_masopciones_Internalname = "TABLE_MASOPCIONES" ;
      divPanel_filtrosmas_Internalname = "PANEL_FILTROSMAS" ;
      Dvpanel_panel_filtrosmas_Internalname = "DVPANEL_PANEL_FILTROSMAS" ;
      bttBtnresultados_Internalname = "BTNRESULTADOS" ;
      bttBtnexportarcsv_Internalname = "BTNEXPORTARCSV" ;
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
      chkavConsmanuales.setEnabled( 1 );
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavTipartcod_to_Jsonclick = "" ;
      edtavTipartcod_to_Enabled = 1 ;
      edtavTipartcod_Jsonclick = "" ;
      edtavTipartcod_Enabled = 1 ;
      edtavIntcod_to_Jsonclick = "" ;
      edtavIntcod_to_Enabled = 1 ;
      edtavIntcod_Jsonclick = "" ;
      edtavIntcod_Enabled = 1 ;
      edtavTipcolcod_to_Jsonclick = "" ;
      edtavTipcolcod_to_Enabled = 1 ;
      edtavTipcolcod_Jsonclick = "" ;
      edtavTipcolcod_Enabled = 1 ;
      edtavForcolnum_to_Jsonclick = "" ;
      edtavForcolnum_to_Enabled = 1 ;
      edtavForcolnom_to_Jsonclick = "" ;
      edtavForcolnom_to_Enabled = 1 ;
      edtavForcolnum_Jsonclick = "" ;
      edtavForcolnum_Enabled = 1 ;
      edtavForcolnom_Jsonclick = "" ;
      edtavForcolnom_Enabled = 1 ;
      edtavArtcod_to_Jsonclick = "" ;
      edtavArtcod_to_Enabled = 1 ;
      edtavArtcod_Jsonclick = "" ;
      edtavArtcod_Enabled = 1 ;
      edtavClicod_to_Jsonclick = "" ;
      edtavClicod_to_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavFecha_to_Jsonclick = "" ;
      edtavFecha_to_Enabled = 1 ;
      edtavFecha_Jsonclick = "" ;
      edtavFecha_Enabled = 1 ;
      cmbavHreracab.setJsonclick( "" );
      cmbavHreracab.setEnabled( 1 );
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
      Form.setCaption( httpContext.getMessage( "Costes Quimicos Analisis", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHreracab.setName( "vHRERACAB" );
      cmbavHreracab.setWebtags( "" );
      cmbavHreracab.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavHreracab.addItem("", httpContext.getMessage( "Tinte", ""), (short)(0));
      cmbavHreracab.addItem("S", httpContext.getMessage( "Acabados", ""), (short)(0));
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV19HreRacab = cmbavHreracab.getValidValue(AV19HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19HreRacab", AV19HreRacab);
      }
      chkavConsmanuales.setName( "vCONSMANUALES" );
      chkavConsmanuales.setWebtags( "" );
      chkavConsmanuales.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavConsmanuales.getInternalname(), "TitleCaption", chkavConsmanuales.getCaption(), true);
      chkavConsmanuales.setCheckedValue( "0" );
      AV36ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV36ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36ConsManuales", GXutil.str( AV36ConsManuales, 1, 0));
      /* End function init_web_controls */
   }

   public void validv_Clicod( )
   {
      if ( (GXutil.strcmp("", hV17CliCod)==0) )
      {
         AV17CliCod = 0 ;
      }
      else
      {
         A13735CliCNom = hV17CliCod ;
         /* Using cursor H01FS26 */
         pr_default.execute(24, new Object[] {A13735CliCNom});
         AV17CliCod = H01FS26_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(24) == 101) ) )
         {
            pr_default.readNext(24);
            if ( ! ( (pr_default.getStatus(24) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(24);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV17CliCod", hV17CliCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV17CliCod", GXutil.ltrim( localUtil.ntoc( AV17CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV17CliCod", hV17CliCod);
   }

   public void validv_Clicod_to( )
   {
      if ( (GXutil.strcmp("", hV18CliCod_to)==0) )
      {
         AV18CliCod_to = 0 ;
      }
      else
      {
         A13735CliCNom = hV18CliCod_to ;
         /* Using cursor H01FS27 */
         pr_default.execute(25, new Object[] {A13735CliCNom});
         AV18CliCod_to = H01FS27_A252CliCod[0] ;
         if ( ! ( (pr_default.getStatus(25) == 101) ) )
         {
            pr_default.readNext(25);
            if ( ! ( (pr_default.getStatus(25) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Cliente-Nombre", "")}), 1, "vCLICOD_TO");
               GX_FocusControl = edtavClicod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(25);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV18CliCod_to", hV18CliCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod_to", GXutil.ltrim( localUtil.ntoc( AV18CliCod_to, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV18CliCod_to", hV18CliCod_to);
   }

   public void validv_Tipcolcod( )
   {
      if ( (GXutil.strcmp("", hV9TipColCod)==0) )
      {
         AV9TipColCod = (byte)(0) ;
      }
      else
      {
         A13731TipColCDsc = hV9TipColCod ;
         /* Using cursor H01FS28 */
         pr_default.execute(26, new Object[] {A13731TipColCDsc});
         AV9TipColCod = H01FS28_A831TipColCod[0] ;
         if ( ! ( (pr_default.getStatus(26) == 101) ) )
         {
            pr_default.readNext(26);
            if ( ! ( (pr_default.getStatus(26) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Tipo Colorante", "")}), 1, "vTIPCOLCOD");
               GX_FocusControl = edtavTipcolcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(26);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV9TipColCod", hV9TipColCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9TipColCod", GXutil.ltrim( localUtil.ntoc( AV9TipColCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV9TipColCod", hV9TipColCod);
   }

   public void validv_Tipcolcod_to( )
   {
      if ( (GXutil.strcmp("", hV10TipColCod_to)==0) )
      {
         AV10TipColCod_to = (byte)(0) ;
      }
      else
      {
         A13731TipColCDsc = hV10TipColCod_to ;
         /* Using cursor H01FS29 */
         pr_default.execute(27, new Object[] {A13731TipColCDsc});
         AV10TipColCod_to = H01FS29_A831TipColCod[0] ;
         if ( ! ( (pr_default.getStatus(27) == 101) ) )
         {
            pr_default.readNext(27);
            if ( ! ( (pr_default.getStatus(27) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Tipo Colorante", "")}), 1, "vTIPCOLCOD_TO");
               GX_FocusControl = edtavTipcolcod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(27);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV10TipColCod_to", hV10TipColCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV10TipColCod_to", GXutil.ltrim( localUtil.ntoc( AV10TipColCod_to, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV10TipColCod_to", hV10TipColCod_to);
   }

   public void validv_Intcod( )
   {
      if ( (GXutil.strcmp("", hV7IntCod)==0) )
      {
         AV7IntCod = (byte)(0) ;
      }
      else
      {
         A13744IntCDsc = hV7IntCod ;
         /* Using cursor H01FS30 */
         pr_default.execute(28, new Object[] {A13744IntCDsc});
         AV7IntCod = H01FS30_A583IntCod[0] ;
         if ( ! ( (pr_default.getStatus(28) == 101) ) )
         {
            pr_default.readNext(28);
            if ( ! ( (pr_default.getStatus(28) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vINTCOD");
               GX_FocusControl = edtavIntcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(28);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV7IntCod", hV7IntCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV7IntCod", GXutil.ltrim( localUtil.ntoc( AV7IntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV7IntCod", hV7IntCod);
   }

   public void validv_Intcod_to( )
   {
      if ( (GXutil.strcmp("", hV8IntCod_to)==0) )
      {
         AV8IntCod_to = (byte)(0) ;
      }
      else
      {
         A13744IntCDsc = hV8IntCod_to ;
         /* Using cursor H01FS31 */
         pr_default.execute(29, new Object[] {A13744IntCDsc});
         AV8IntCod_to = H01FS31_A583IntCod[0] ;
         if ( ! ( (pr_default.getStatus(29) == 101) ) )
         {
            pr_default.readNext(29);
            if ( ! ( (pr_default.getStatus(29) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "vINTCOD_TO");
               GX_FocusControl = edtavIntcod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(29);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV8IntCod_to", hV8IntCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV8IntCod_to", GXutil.ltrim( localUtil.ntoc( AV8IntCod_to, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV8IntCod_to", hV8IntCod_to);
   }

   public void validv_Tipartcod( )
   {
      if ( (GXutil.strcmp("", hV5TipArtCod)==0) )
      {
         AV5TipArtCod = (short)(0) ;
      }
      else
      {
         A13788TipArtCodD = hV5TipArtCod ;
         /* Using cursor H01FS32 */
         pr_default.execute(30, new Object[] {A13788TipArtCodD});
         AV5TipArtCod = H01FS32_A829TipArtCod[0] ;
         if ( ! ( (pr_default.getStatus(30) == 101) ) )
         {
            pr_default.readNext(30);
            if ( ! ( (pr_default.getStatus(30) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vTIPARTCOD");
               GX_FocusControl = edtavTipartcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(30);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV5TipArtCod", hV5TipArtCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV5TipArtCod", GXutil.ltrim( localUtil.ntoc( AV5TipArtCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV5TipArtCod", hV5TipArtCod);
   }

   public void validv_Tipartcod_to( )
   {
      if ( (GXutil.strcmp("", hV6TipArtCod_to)==0) )
      {
         AV6TipArtCod_to = (short)(0) ;
      }
      else
      {
         A13788TipArtCodD = hV6TipArtCod_to ;
         /* Using cursor H01FS33 */
         pr_default.execute(31, new Object[] {A13788TipArtCodD});
         AV6TipArtCod_to = H01FS33_A829TipArtCod[0] ;
         if ( ! ( (pr_default.getStatus(31) == 101) ) )
         {
            pr_default.readNext(31);
            if ( ! ( (pr_default.getStatus(31) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vTIPARTCOD_TO");
               GX_FocusControl = edtavTipartcod_to_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(31);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV6TipArtCod_to", hV6TipArtCod_to);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV6TipArtCod_to", GXutil.ltrim( localUtil.ntoc( AV6TipArtCod_to, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV6TipArtCod_to", hV6TipArtCod_to);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV36ConsManuales',fld:'vCONSMANUALES',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DORESULTADOS'","{handler:'e121FS2',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV19HreRacab',fld:'vHRERACAB',pic:''},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV23barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV25barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV15ArtCod',fld:'vARTCOD',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV11ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV12ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'},{av:'AV26Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV16ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV13ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV14ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV18CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV6TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV10TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DORESULTADOS'",",oparms:[{ctrl:'WCCOSTESQUIMICOSANALISIS_WC'},{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'}]}");
      setEventMetadata("'DOEXPORTARCSV'","{handler:'e131FS2',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV19HreRacab',fld:'vHRERACAB',pic:''},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV23barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV25barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV15ArtCod',fld:'vARTCOD',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV11ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV12ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'},{av:'AV26Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV16ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV13ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV14ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV18CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV6TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV10TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DOEXPORTARCSV'",",oparms:[{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141FS2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOINFORMEPORPRODUCTO'","{handler:'e151FS2',iparms:[{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV19HreRacab',fld:'vHRERACAB',pic:''},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV15ArtCod',fld:'vARTCOD',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV11ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV12ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'},{av:'AV23barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV25barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV36ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV26Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV16ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV13ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV14ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV18CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV8IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV6TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV10TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'}]");
      setEventMetadata("'DOINFORMEPORPRODUCTO'",",oparms:[{av:'AV36ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV25barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV24barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV23barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV35TipColCod_to2',fld:'vTIPCOLCOD_TO2',pic:'Z9'},{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV34TipArtCod_to2',fld:'vTIPARTCOD_TO2',pic:'ZZZ9'},{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV33IntCod_to2',fld:'vINTCOD_TO2',pic:'Z9'},{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV32CliCod_to2',fld:'vCLICOD_TO2',pic:'ZZZZZ9'},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV31ForColNum_to2',fld:'vFORCOLNUM_TO2',pic:'ZZZZZ9'},{av:'AV12ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV30ForColNom_to2',fld:'vFORCOLNOM_TO2',pic:''},{av:'AV11ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV29ArtCod_to2',fld:'vARTCOD_TO2',pic:''},{av:'AV15ArtCod',fld:'vARTCOD',pic:''},{av:'AV27Fecha_to2',fld:'vFECHA_TO2',pic:''},{av:'AV28Fecha',fld:'vFECHA',pic:''},{av:'cmbavHreracab'},{av:'AV19HreRacab',fld:'vHRERACAB',pic:''},{av:'AV22EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[{av:'hV17CliCod'},{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[{av:'AV17CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'hV17CliCod'}]}");
      setEventMetadata("VALIDV_CLICOD_TO","{handler:'validv_Clicod_to',iparms:[{av:'hV18CliCod_to'},{av:'AV18CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_CLICOD_TO",",oparms:[{av:'AV18CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'hV18CliCod_to'}]}");
      setEventMetadata("VALIDV_TIPCOLCOD","{handler:'validv_Tipcolcod',iparms:[{av:'hV9TipColCod'},{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'}]");
      setEventMetadata("VALIDV_TIPCOLCOD",",oparms:[{av:'AV9TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'hV9TipColCod'}]}");
      setEventMetadata("VALIDV_TIPCOLCOD_TO","{handler:'validv_Tipcolcod_to',iparms:[{av:'hV10TipColCod_to'},{av:'AV10TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'}]");
      setEventMetadata("VALIDV_TIPCOLCOD_TO",",oparms:[{av:'AV10TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'hV10TipColCod_to'}]}");
      setEventMetadata("VALIDV_INTCOD","{handler:'validv_Intcod',iparms:[{av:'hV7IntCod'},{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'}]");
      setEventMetadata("VALIDV_INTCOD",",oparms:[{av:'AV7IntCod',fld:'vINTCOD',pic:'Z9'},{av:'hV7IntCod'}]}");
      setEventMetadata("VALIDV_INTCOD_TO","{handler:'validv_Intcod_to',iparms:[{av:'hV8IntCod_to'},{av:'AV8IntCod_to',fld:'vINTCOD_TO',pic:'Z9'}]");
      setEventMetadata("VALIDV_INTCOD_TO",",oparms:[{av:'AV8IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'hV8IntCod_to'}]}");
      setEventMetadata("VALIDV_TIPARTCOD","{handler:'validv_Tipartcod',iparms:[{av:'hV5TipArtCod'},{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_TIPARTCOD",",oparms:[{av:'AV5TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'hV5TipArtCod'}]}");
      setEventMetadata("VALIDV_TIPARTCOD_TO","{handler:'validv_Tipartcod_to',iparms:[{av:'hV6TipArtCod_to'},{av:'AV6TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'}]");
      setEventMetadata("VALIDV_TIPARTCOD_TO",",oparms:[{av:'AV6TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'hV6TipArtCod_to'}]}");
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
      A13731TipColCDsc = "" ;
      A13744IntCDsc = "" ;
      A13788TipArtCodD = "" ;
      hV17CliCod = "" ;
      hV18CliCod_to = "" ;
      hV9TipColCod = "" ;
      hV10TipColCod_to = "" ;
      hV7IntCod = "" ;
      hV8IntCod_to = "" ;
      hV5TipArtCod = "" ;
      hV6TipArtCod_to = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV22EmprCod = "" ;
      AV27Fecha_to2 = GXutil.nullDate() ;
      AV29ArtCod_to2 = "" ;
      AV30ForColNom_to2 = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV19HreRacab = "" ;
      AV28Fecha = GXutil.nullDate() ;
      AV26Fecha_to = GXutil.nullDate() ;
      AV15ArtCod = "" ;
      AV16ArtCod_to = "" ;
      AV11ForColNom = "" ;
      AV13ForColNom_to = "" ;
      AV25barcodpar = "" ;
      ucDvpanel_panel_filtrosmas = new com.genexus.webpanels.GXUserControl();
      bttBtninformeporproducto_Jsonclick = "" ;
      bttBtnresultados_Jsonclick = "" ;
      bttBtnexportarcsv_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wccostesquimicosanalisis_wc_Component = "" ;
      OldWccostesquimicosanalisis_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13735CliCNom = "" ;
      H01FS2_A13735CliCNom = new String[] {""} ;
      H01FS3_A13735CliCNom = new String[] {""} ;
      l13731TipColCDsc = "" ;
      H01FS4_A13731TipColCDsc = new String[] {""} ;
      H01FS5_A13731TipColCDsc = new String[] {""} ;
      l13744IntCDsc = "" ;
      H01FS6_A13744IntCDsc = new String[] {""} ;
      H01FS7_A13744IntCDsc = new String[] {""} ;
      l13788TipArtCodD = "" ;
      H01FS8_A13788TipArtCodD = new String[] {""} ;
      H01FS9_A13788TipArtCodD = new String[] {""} ;
      H01FS10_A13735CliCNom = new String[] {""} ;
      H01FS10_A396EmprCod = new String[] {""} ;
      H01FS10_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      H01FS11_A13735CliCNom = new String[] {""} ;
      H01FS11_A396EmprCod = new String[] {""} ;
      H01FS11_A252CliCod = new int[1] ;
      H01FS12_A13731TipColCDsc = new String[] {""} ;
      H01FS12_A396EmprCod = new String[] {""} ;
      H01FS12_A831TipColCod = new byte[1] ;
      H01FS13_A13731TipColCDsc = new String[] {""} ;
      H01FS13_A396EmprCod = new String[] {""} ;
      H01FS13_A831TipColCod = new byte[1] ;
      H01FS14_A13744IntCDsc = new String[] {""} ;
      H01FS14_A396EmprCod = new String[] {""} ;
      H01FS14_A583IntCod = new byte[1] ;
      H01FS15_A13744IntCDsc = new String[] {""} ;
      H01FS15_A396EmprCod = new String[] {""} ;
      H01FS15_A583IntCod = new byte[1] ;
      H01FS16_A13788TipArtCodD = new String[] {""} ;
      H01FS16_A396EmprCod = new String[] {""} ;
      H01FS16_A829TipArtCod = new short[1] ;
      H01FS17_A13788TipArtCodD = new String[] {""} ;
      H01FS17_A396EmprCod = new String[] {""} ;
      H01FS17_A829TipArtCod = new short[1] ;
      H01FS18_A13735CliCNom = new String[] {""} ;
      H01FS18_A396EmprCod = new String[] {""} ;
      H01FS18_A252CliCod = new int[1] ;
      H01FS19_A13735CliCNom = new String[] {""} ;
      H01FS19_A396EmprCod = new String[] {""} ;
      H01FS19_A252CliCod = new int[1] ;
      H01FS20_A13731TipColCDsc = new String[] {""} ;
      H01FS20_A396EmprCod = new String[] {""} ;
      H01FS20_A831TipColCod = new byte[1] ;
      H01FS21_A13731TipColCDsc = new String[] {""} ;
      H01FS21_A396EmprCod = new String[] {""} ;
      H01FS21_A831TipColCod = new byte[1] ;
      H01FS22_A13744IntCDsc = new String[] {""} ;
      H01FS22_A396EmprCod = new String[] {""} ;
      H01FS22_A583IntCod = new byte[1] ;
      H01FS23_A13744IntCDsc = new String[] {""} ;
      H01FS23_A396EmprCod = new String[] {""} ;
      H01FS23_A583IntCod = new byte[1] ;
      H01FS24_A13788TipArtCodD = new String[] {""} ;
      H01FS24_A396EmprCod = new String[] {""} ;
      H01FS24_A829TipArtCod = new short[1] ;
      H01FS25_A13788TipArtCodD = new String[] {""} ;
      H01FS25_A396EmprCod = new String[] {""} ;
      H01FS25_A829TipArtCod = new short[1] ;
      AV37Station = "" ;
      AV38EmprNom = "" ;
      AV39UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int20 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new byte[1] ;
      AV20ExcelFilename = "" ;
      GXv_char24 = new String[1] ;
      AV21ErrorMessage = "" ;
      GXv_char25 = new String[1] ;
      sStyleString = "" ;
      lblConsmanuales_righttext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01FS26_A13735CliCNom = new String[] {""} ;
      H01FS26_A396EmprCod = new String[] {""} ;
      H01FS26_A252CliCod = new int[1] ;
      ZhV17CliCod = "" ;
      H01FS27_A13735CliCNom = new String[] {""} ;
      H01FS27_A396EmprCod = new String[] {""} ;
      H01FS27_A252CliCod = new int[1] ;
      ZhV18CliCod_to = "" ;
      H01FS28_A13731TipColCDsc = new String[] {""} ;
      H01FS28_A396EmprCod = new String[] {""} ;
      H01FS28_A831TipColCod = new byte[1] ;
      ZhV9TipColCod = "" ;
      H01FS29_A13731TipColCDsc = new String[] {""} ;
      H01FS29_A396EmprCod = new String[] {""} ;
      H01FS29_A831TipColCod = new byte[1] ;
      ZhV10TipColCod_to = "" ;
      H01FS30_A13744IntCDsc = new String[] {""} ;
      H01FS30_A396EmprCod = new String[] {""} ;
      H01FS30_A583IntCod = new byte[1] ;
      ZhV7IntCod = "" ;
      H01FS31_A13744IntCDsc = new String[] {""} ;
      H01FS31_A396EmprCod = new String[] {""} ;
      H01FS31_A583IntCod = new byte[1] ;
      ZhV8IntCod_to = "" ;
      H01FS32_A13788TipArtCodD = new String[] {""} ;
      H01FS32_A396EmprCod = new String[] {""} ;
      H01FS32_A829TipArtCod = new short[1] ;
      ZhV5TipArtCod = "" ;
      H01FS33_A13788TipArtCodD = new String[] {""} ;
      H01FS33_A396EmprCod = new String[] {""} ;
      H01FS33_A829TipArtCod = new short[1] ;
      ZhV6TipArtCod_to = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesquimicosanalisis_wp__default(),
         new Object[] {
             new Object[] {
            H01FS2_A13735CliCNom
            }
            , new Object[] {
            H01FS3_A13735CliCNom
            }
            , new Object[] {
            H01FS4_A13731TipColCDsc
            }
            , new Object[] {
            H01FS5_A13731TipColCDsc
            }
            , new Object[] {
            H01FS6_A13744IntCDsc
            }
            , new Object[] {
            H01FS7_A13744IntCDsc
            }
            , new Object[] {
            H01FS8_A13788TipArtCodD
            }
            , new Object[] {
            H01FS9_A13788TipArtCodD
            }
            , new Object[] {
            H01FS10_A13735CliCNom, H01FS10_A396EmprCod, H01FS10_A252CliCod
            }
            , new Object[] {
            H01FS11_A13735CliCNom, H01FS11_A396EmprCod, H01FS11_A252CliCod
            }
            , new Object[] {
            H01FS12_A13731TipColCDsc, H01FS12_A396EmprCod, H01FS12_A831TipColCod
            }
            , new Object[] {
            H01FS13_A13731TipColCDsc, H01FS13_A396EmprCod, H01FS13_A831TipColCod
            }
            , new Object[] {
            H01FS14_A13744IntCDsc, H01FS14_A396EmprCod, H01FS14_A583IntCod
            }
            , new Object[] {
            H01FS15_A13744IntCDsc, H01FS15_A396EmprCod, H01FS15_A583IntCod
            }
            , new Object[] {
            H01FS16_A13788TipArtCodD, H01FS16_A396EmprCod, H01FS16_A829TipArtCod
            }
            , new Object[] {
            H01FS17_A13788TipArtCodD, H01FS17_A396EmprCod, H01FS17_A829TipArtCod
            }
            , new Object[] {
            H01FS18_A13735CliCNom, H01FS18_A396EmprCod, H01FS18_A252CliCod
            }
            , new Object[] {
            H01FS19_A13735CliCNom, H01FS19_A396EmprCod, H01FS19_A252CliCod
            }
            , new Object[] {
            H01FS20_A13731TipColCDsc, H01FS20_A396EmprCod, H01FS20_A831TipColCod
            }
            , new Object[] {
            H01FS21_A13731TipColCDsc, H01FS21_A396EmprCod, H01FS21_A831TipColCod
            }
            , new Object[] {
            H01FS22_A13744IntCDsc, H01FS22_A396EmprCod, H01FS22_A583IntCod
            }
            , new Object[] {
            H01FS23_A13744IntCDsc, H01FS23_A396EmprCod, H01FS23_A583IntCod
            }
            , new Object[] {
            H01FS24_A13788TipArtCodD, H01FS24_A396EmprCod, H01FS24_A829TipArtCod
            }
            , new Object[] {
            H01FS25_A13788TipArtCodD, H01FS25_A396EmprCod, H01FS25_A829TipArtCod
            }
            , new Object[] {
            H01FS26_A13735CliCNom, H01FS26_A396EmprCod, H01FS26_A252CliCod
            }
            , new Object[] {
            H01FS27_A13735CliCNom, H01FS27_A396EmprCod, H01FS27_A252CliCod
            }
            , new Object[] {
            H01FS28_A13731TipColCDsc, H01FS28_A396EmprCod, H01FS28_A831TipColCod
            }
            , new Object[] {
            H01FS29_A13731TipColCDsc, H01FS29_A396EmprCod, H01FS29_A831TipColCod
            }
            , new Object[] {
            H01FS30_A13744IntCDsc, H01FS30_A396EmprCod, H01FS30_A583IntCod
            }
            , new Object[] {
            H01FS31_A13744IntCDsc, H01FS31_A396EmprCod, H01FS31_A583IntCod
            }
            , new Object[] {
            H01FS32_A13788TipArtCodD, H01FS32_A396EmprCod, H01FS32_A829TipArtCod
            }
            , new Object[] {
            H01FS33_A13788TipArtCodD, H01FS33_A396EmprCod, H01FS33_A829TipArtCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wccostesquimicosanalisis_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV33IntCod_to2 ;
   private byte AV35TipColCod_to2 ;
   private byte AV9TipColCod ;
   private byte AV10TipColCod_to ;
   private byte AV7IntCod ;
   private byte AV8IntCod_to ;
   private byte AV24barcodreo ;
   private byte nDonePA ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private byte AV36ConsManuales ;
   private byte GXv_int14[] ;
   private byte GXv_int15[] ;
   private byte GXv_int18[] ;
   private byte GXv_int19[] ;
   private byte GXv_int21[] ;
   private byte GXv_int23[] ;
   private byte nGXWrapped ;
   private byte ZV9TipColCod ;
   private byte ZV10TipColCod_to ;
   private byte ZV7IntCod ;
   private byte ZV8IntCod_to ;
   private short AV34TipArtCod_to2 ;
   private short AV5TipArtCod ;
   private short AV6TipArtCod_to ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short A829TipArtCod ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private short ZV5TipArtCod ;
   private short ZV6TipArtCod_to ;
   private int AV31ForColNum_to2 ;
   private int AV32CliCod_to2 ;
   private int AV17CliCod ;
   private int AV18CliCod_to ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int edtavFecha_Enabled ;
   private int edtavFecha_to_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClicod_to_Enabled ;
   private int edtavArtcod_Enabled ;
   private int edtavArtcod_to_Enabled ;
   private int edtavForcolnom_Enabled ;
   private int AV12ForColNum ;
   private int edtavForcolnum_Enabled ;
   private int edtavForcolnom_to_Enabled ;
   private int AV14ForColNum_to ;
   private int edtavForcolnum_to_Enabled ;
   private int edtavTipcolcod_Enabled ;
   private int edtavTipcolcod_to_Enabled ;
   private int edtavIntcod_Enabled ;
   private int edtavIntcod_to_Enabled ;
   private int edtavTipartcod_Enabled ;
   private int edtavTipartcod_to_Enabled ;
   private int AV23barcod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int gxdynajaxindex ;
   private int A252CliCod ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int GXv_int20[] ;
   private int idxLst ;
   private int ZV17CliCod ;
   private int ZV18CliCod_to ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV22EmprCod ;
   private String AV29ArtCod_to2 ;
   private String AV30ForColNom_to2 ;
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
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String AV19HreRacab ;
   private String divUnnamedtable5_Internalname ;
   private String edtavFecha_Internalname ;
   private String edtavFecha_Jsonclick ;
   private String edtavFecha_to_Internalname ;
   private String edtavFecha_to_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicod_to_Internalname ;
   private String edtavClicod_to_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavArtcod_Internalname ;
   private String AV15ArtCod ;
   private String edtavArtcod_Jsonclick ;
   private String edtavArtcod_to_Internalname ;
   private String AV16ArtCod_to ;
   private String edtavArtcod_to_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavForcolnom_Internalname ;
   private String AV11ForColNom ;
   private String edtavForcolnom_Jsonclick ;
   private String edtavForcolnum_Internalname ;
   private String edtavForcolnum_Jsonclick ;
   private String edtavForcolnom_to_Internalname ;
   private String AV13ForColNom_to ;
   private String edtavForcolnom_to_Jsonclick ;
   private String edtavForcolnum_to_Internalname ;
   private String edtavForcolnum_to_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavTipcolcod_Internalname ;
   private String edtavTipcolcod_Jsonclick ;
   private String edtavTipcolcod_to_Internalname ;
   private String edtavTipcolcod_to_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtavIntcod_Internalname ;
   private String edtavIntcod_Jsonclick ;
   private String edtavIntcod_to_Internalname ;
   private String edtavIntcod_to_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavTipartcod_Internalname ;
   private String edtavTipartcod_Jsonclick ;
   private String edtavTipartcod_to_Internalname ;
   private String edtavTipartcod_to_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV25barcodpar ;
   private String edtavBarcodpar_Jsonclick ;
   private String Dvpanel_panel_filtrosmas_Internalname ;
   private String divPanel_filtrosmas_Internalname ;
   private String divTable_masopciones_Internalname ;
   private String grpUnnamedgroup2_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtninformeporproducto_Internalname ;
   private String bttBtninformeporproducto_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String bttBtnresultados_Internalname ;
   private String bttBtnresultados_Jsonclick ;
   private String bttBtnexportarcsv_Internalname ;
   private String bttBtnexportarcsv_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wccostesquimicosanalisis_wc_Component ;
   private String OldWccostesquimicosanalisis_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV37Station ;
   private String AV38EmprNom ;
   private String AV39UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char22[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String sStyleString ;
   private String tblTablemergedconsmanuales_Internalname ;
   private String lblConsmanuales_righttext_Internalname ;
   private String lblConsmanuales_righttext_Jsonclick ;
   private java.util.Date AV27Fecha_to2 ;
   private java.util.Date AV28Fecha ;
   private java.util.Date AV26Fecha_to ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date GXv_date6[] ;
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
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wccostesquimicosanalisis_wc ;
   private String A13735CliCNom ;
   private String A13731TipColCDsc ;
   private String A13744IntCDsc ;
   private String A13788TipArtCodD ;
   private String hV17CliCod ;
   private String hV18CliCod_to ;
   private String hV9TipColCod ;
   private String hV10TipColCod_to ;
   private String hV7IntCod ;
   private String hV8IntCod_to ;
   private String hV5TipArtCod ;
   private String hV6TipArtCod_to ;
   private String l13735CliCNom ;
   private String l13731TipColCDsc ;
   private String l13744IntCDsc ;
   private String l13788TipArtCodD ;
   private String AV20ExcelFilename ;
   private String AV21ErrorMessage ;
   private String ZhV17CliCod ;
   private String ZhV18CliCod_to ;
   private String ZhV9TipColCod ;
   private String ZhV10TipColCod_to ;
   private String ZhV7IntCod ;
   private String ZhV8IntCod_to ;
   private String ZhV5TipArtCod ;
   private String ZhV6TipArtCod_to ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wccostesquimicosanalisis_wc ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosmas ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private HTMLChoice cmbavHreracab ;
   private ICheckbox chkavConsmanuales ;
   private IDataStoreProvider pr_default ;
   private String[] H01FS2_A13735CliCNom ;
   private String[] H01FS3_A13735CliCNom ;
   private String[] H01FS4_A13731TipColCDsc ;
   private String[] H01FS5_A13731TipColCDsc ;
   private String[] H01FS6_A13744IntCDsc ;
   private String[] H01FS7_A13744IntCDsc ;
   private String[] H01FS8_A13788TipArtCodD ;
   private String[] H01FS9_A13788TipArtCodD ;
   private String[] H01FS10_A13735CliCNom ;
   private String[] H01FS10_A396EmprCod ;
   private int[] H01FS10_A252CliCod ;
   private String[] H01FS11_A13735CliCNom ;
   private String[] H01FS11_A396EmprCod ;
   private int[] H01FS11_A252CliCod ;
   private String[] H01FS12_A13731TipColCDsc ;
   private String[] H01FS12_A396EmprCod ;
   private byte[] H01FS12_A831TipColCod ;
   private String[] H01FS13_A13731TipColCDsc ;
   private String[] H01FS13_A396EmprCod ;
   private byte[] H01FS13_A831TipColCod ;
   private String[] H01FS14_A13744IntCDsc ;
   private String[] H01FS14_A396EmprCod ;
   private byte[] H01FS14_A583IntCod ;
   private String[] H01FS15_A13744IntCDsc ;
   private String[] H01FS15_A396EmprCod ;
   private byte[] H01FS15_A583IntCod ;
   private String[] H01FS16_A13788TipArtCodD ;
   private String[] H01FS16_A396EmprCod ;
   private short[] H01FS16_A829TipArtCod ;
   private String[] H01FS17_A13788TipArtCodD ;
   private String[] H01FS17_A396EmprCod ;
   private short[] H01FS17_A829TipArtCod ;
   private String[] H01FS18_A13735CliCNom ;
   private String[] H01FS18_A396EmprCod ;
   private int[] H01FS18_A252CliCod ;
   private String[] H01FS19_A13735CliCNom ;
   private String[] H01FS19_A396EmprCod ;
   private int[] H01FS19_A252CliCod ;
   private String[] H01FS20_A13731TipColCDsc ;
   private String[] H01FS20_A396EmprCod ;
   private byte[] H01FS20_A831TipColCod ;
   private String[] H01FS21_A13731TipColCDsc ;
   private String[] H01FS21_A396EmprCod ;
   private byte[] H01FS21_A831TipColCod ;
   private String[] H01FS22_A13744IntCDsc ;
   private String[] H01FS22_A396EmprCod ;
   private byte[] H01FS22_A583IntCod ;
   private String[] H01FS23_A13744IntCDsc ;
   private String[] H01FS23_A396EmprCod ;
   private byte[] H01FS23_A583IntCod ;
   private String[] H01FS24_A13788TipArtCodD ;
   private String[] H01FS24_A396EmprCod ;
   private short[] H01FS24_A829TipArtCod ;
   private String[] H01FS25_A13788TipArtCodD ;
   private String[] H01FS25_A396EmprCod ;
   private short[] H01FS25_A829TipArtCod ;
   private String[] H01FS26_A13735CliCNom ;
   private String[] H01FS26_A396EmprCod ;
   private int[] H01FS26_A252CliCod ;
   private String[] H01FS27_A13735CliCNom ;
   private String[] H01FS27_A396EmprCod ;
   private int[] H01FS27_A252CliCod ;
   private String[] H01FS28_A13731TipColCDsc ;
   private String[] H01FS28_A396EmprCod ;
   private byte[] H01FS28_A831TipColCod ;
   private String[] H01FS29_A13731TipColCDsc ;
   private String[] H01FS29_A396EmprCod ;
   private byte[] H01FS29_A831TipColCod ;
   private String[] H01FS30_A13744IntCDsc ;
   private String[] H01FS30_A396EmprCod ;
   private byte[] H01FS30_A583IntCod ;
   private String[] H01FS31_A13744IntCDsc ;
   private String[] H01FS31_A396EmprCod ;
   private byte[] H01FS31_A583IntCod ;
   private String[] H01FS32_A13788TipArtCodD ;
   private String[] H01FS32_A396EmprCod ;
   private short[] H01FS32_A829TipArtCod ;
   private String[] H01FS33_A13788TipArtCodD ;
   private String[] H01FS33_A396EmprCod ;
   private short[] H01FS33_A829TipArtCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class costesquimicosanalisis_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FS2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS3", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom FROM TXPCLIENT WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS4", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc FROM TXPTIPCOL WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS5", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc FROM TXPTIPCOL WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS6", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc FROM TXPINTENS WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS7", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc FROM TXPINTENS WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS8", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD FROM TXPTIPART WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, '')))) like '%' || UPPER(?) ORDER BY TipArtCodD) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS9", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD FROM TXPTIPART WHERE UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, '')))) like '%' || UPPER(?) ORDER BY TipArtCodD) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS10", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS11", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS12", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS13", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS14", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS15", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS16", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS17", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS18", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS19", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS20", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS21", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS22", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS23", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS24", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS25", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS26", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS27", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, EmprCod, CliCod FROM TXPCLIENT WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS28", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS29", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) AS TipColCDsc, EmprCod, TipColCod FROM TXPTIPCOL WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipColCod,'90'), 2))) || ' - ' || RTRIM(LTRIM(COALESCE( TipColDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS30", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS31", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) AS IntCDsc, EmprCod, IntCod FROM TXPINTENS WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(IntCod,'90'), 2))) || '-' || RTRIM(LTRIM(COALESCE( IntDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS32", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FS33", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, EmprCod, TipArtCod FROM TXPTIPART WHERE RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
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
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 22 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 24 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 26 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 27 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 28 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 29 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 200);
               return;
      }
   }

}

