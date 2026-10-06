package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recuentoinventario_impl extends GXDataArea
{
   public recuentoinventario_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recuentoinventario_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recuentoinventario_impl.class ));
   }

   public recuentoinventario_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavValact = UIFactory.getCheckbox(this);
      cmbavFlagstk = new HTMLChoice();
      cmbavOrder = new HTMLChoice();
      chkavPasswordverificadoboolean = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPPRODUC") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpproduc1M40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUPRODUC") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvuproduc1M40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPPROV") == 0 )
         {
            A794PrvNom = httpContext.GetPar( "PrvNom") ;
            n794PrvNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpprov1M40( A794PrvNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUPROV") == 0 )
         {
            A794PrvNom = httpContext.GetPar( "PrvNom") ;
            n794PrvNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvuprov1M40( A794PrvNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPPRODUC") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpproduc1M40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPPRODUC") == 0 )
         {
            hV85PProduc = httpContext.GetPar( "hV85PProduc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvpproduc1M42( hV85PProduc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUPRODUC") == 0 )
         {
            A13747PrdCDsc = httpContext.GetPar( "PrdCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvuproduc1M40( A13747PrdCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vUPRODUC") == 0 )
         {
            hV115UProduc = httpContext.GetPar( "hV115UProduc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvuproduc1M42( hV115UProduc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vPPROV") == 0 )
         {
            A794PrvNom = httpContext.GetPar( "PrvNom") ;
            n794PrvNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvpprov1M40( A794PrvNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vPPROV") == 0 )
         {
            hV88PProv = httpContext.GetPar( "hV88PProv") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvpprov1M42( hV88PProv) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vUPROV") == 0 )
         {
            A794PrvNom = httpContext.GetPar( "PrvNom") ;
            n794PrvNom = false ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvuprov1M40( A794PrvNom) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vUPROV") == 0 )
         {
            hV117UProv = httpContext.GetPar( "hV117UProv") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvuprov1M42( hV117UProv) ;
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
      pa1M42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1M42( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recuentoinventario", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV95Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57Informe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PasswordVerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5PasswordContexto, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", GXutil.rtrim( AV8Texto));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECREC", localUtil.dtoc( AV34FecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV95Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV95Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV42FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIAUDITORIA", GXutil.ltrim( localUtil.ntoc( AV101SiAuditoria, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV137Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV121UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV103Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIACUMULAR", GXutil.rtrim( AV99Siacumular));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFORME", GXutil.ltrim( localUtil.ntoc( AV57Informe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57Informe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLVER", AV132volver);
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSWORDVERIFICADOCONTEXTO", AV7PasswordVerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PasswordVerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSWORDCONTEXTO", AV5PasswordContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5PasswordContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPPRODUC", GXutil.rtrim( AV85PProduc));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvUPRODUC", GXutil.rtrim( AV115UProduc));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvPPROV", GXutil.ltrim( localUtil.ntoc( AV88PProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvUPROV", GXutil.ltrim( localUtil.ntoc( AV117UProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Width", GXutil.rtrim( Dvpanel_textos_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Autowidth", GXutil.booltostr( Dvpanel_textos_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Autoheight", GXutil.booltostr( Dvpanel_textos_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Cls", GXutil.rtrim( Dvpanel_textos_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Title", GXutil.rtrim( Dvpanel_textos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Collapsible", GXutil.booltostr( Dvpanel_textos_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Collapsed", GXutil.booltostr( Dvpanel_textos_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Showcollapseicon", GXutil.booltostr( Dvpanel_textos_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Iconposition", GXutil.rtrim( Dvpanel_textos_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TEXTOS_Autoscroll", GXutil.booltostr( Dvpanel_textos_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFORME_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconforme_Result));
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
      if ( ! ( WebComp_Wcrecuentoinven_wc == null ) )
      {
         WebComp_Wcrecuentoinven_wc.componentjscripts();
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
         we1M42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1M42( ) ;
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
      return formatLink("app.recuentoinventario", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "RecuentoInventario" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recuento Inventario", "") ;
   }

   public void wb1M40( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, divTablecontent_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavValact.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavValact.getInternalname(), httpContext.getMessage( "Imprimir Valores Actuales (S/N)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavValact.getInternalname(), AV122ValAct, "", httpContext.getMessage( "Imprimir Valores Actuales (S/N)", ""), 1, chkavValact.getEnabled(), "S", httpContext.getMessage( "Imprimir Valores Actuales", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(30, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,30);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFlagstk.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavFlagstk.getInternalname(), httpContext.getMessage( "FlagStk", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFlagstk, cmbavFlagstk.getInternalname(), GXutil.trim( GXutil.str( AV46FlagStk, 1, 0)), 1, cmbavFlagstk.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavFlagstk.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "", true, (byte)(0), "HLP_RecuentoInventario.htm");
         cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV46FlagStk, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPproduc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPproduc_Internalname, httpContext.getMessage( "Producto Desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPproduc_Internalname, hV85PProduc, GXutil.rtrim( localUtil.format( hV85PProduc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPproduc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPproduc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUproduc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUproduc_Internalname, httpContext.getMessage( "Producto Hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUproduc_Internalname, hV115UProduc, GXutil.rtrim( localUtil.format( hV115UProduc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUproduc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUproduc_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPprov_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPprov_Internalname, httpContext.getMessage( "Proveedor Desde", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPprov_Internalname, GXutil.rtrim( hV88PProv), GXutil.rtrim( localUtil.format( hV88PProv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPprov_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPprov_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUprov_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUprov_Internalname, httpContext.getMessage( "Proveedor Hasta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUprov_Internalname, GXutil.rtrim( hV117UProv), GXutil.rtrim( localUtil.format( hV117UProv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUprov_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUprov_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavOrder.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOrder.getInternalname(), httpContext.getMessage( "Orden Informe", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOrder, cmbavOrder.getInternalname(), GXutil.trim( GXutil.str( AV80Order, 4, 0)), 1, cmbavOrder.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavOrder.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "", true, (byte)(0), "HLP_RecuentoInventario.htm");
         cmbavOrder.setValue( GXutil.trim( GXutil.str( AV80Order, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOrder.getInternalname(), "Values", cmbavOrder.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfechr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfechr_Internalname, httpContext.getMessage( "Fecha-Hora Recuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfechr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfechr_Internalname, localUtil.ttoc( AV97Recfechr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV97Recfechr, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfechr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfechr_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfechr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfechr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_RecuentoInventario.htm");
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconforme_Internalname, "", httpContext.getMessage( "Conforme", ""), bttBtnconforme_Jsonclick, 7, httpContext.getMessage( "Conforme", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111m41_client"+"'", TempTags, "", 2, "HLP_RecuentoInventario.htm");
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
         /* User Defined Control */
         ucDvpanel_textos.setProperty("Width", Dvpanel_textos_Width);
         ucDvpanel_textos.setProperty("AutoWidth", Dvpanel_textos_Autowidth);
         ucDvpanel_textos.setProperty("AutoHeight", Dvpanel_textos_Autoheight);
         ucDvpanel_textos.setProperty("Cls", Dvpanel_textos_Cls);
         ucDvpanel_textos.setProperty("Title", Dvpanel_textos_Title);
         ucDvpanel_textos.setProperty("Collapsible", Dvpanel_textos_Collapsible);
         ucDvpanel_textos.setProperty("Collapsed", Dvpanel_textos_Collapsed);
         ucDvpanel_textos.setProperty("ShowCollapseIcon", Dvpanel_textos_Showcollapseicon);
         ucDvpanel_textos.setProperty("IconPosition", Dvpanel_textos_Iconposition);
         ucDvpanel_textos.setProperty("AutoScroll", Dvpanel_textos_Autoscroll);
         ucDvpanel_textos.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_textos_Internalname, "DVPANEL_TEXTOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TEXTOSContainer"+"Textos"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTextos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTexto1_Internalname, lblTexto1_Caption, "", "", lblTexto1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-size:"+GXutil.str( lblTexto1_Fontsize, 3, 0)+"pt;", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_RecuentoInventario.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab01_title_Internalname, httpContext.getMessage( "Reesultado1", ""), "", "", lblTab01_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_RecuentoInventario.htm");
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0096"+"", GXutil.rtrim( WebComp_Wcrecuentoinven_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0096"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcrecuentoinven_wc_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcrecuentoinven_wc), GXutil.lower( WebComp_Wcrecuentoinven_wc_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0096"+"");
               }
               WebComp_Wcrecuentoinven_wc.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcrecuentoinven_wc), GXutil.lower( WebComp_Wcrecuentoinven_wc_Component)) != 0 )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", chkavPasswordverificadoboolean.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavPasswordverificadoboolean.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavPasswordverificadoboolean.getInternalname(), httpContext.getMessage( "Password Verificado Boolean", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavPasswordverificadoboolean.getInternalname(), GXutil.booltostr( AV6PasswordVerificadoBoolean), "", httpContext.getMessage( "Password Verificado Boolean", ""), chkavPasswordverificadoboolean.getVisible(), chkavPasswordverificadoboolean.getEnabled(), "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(101, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,101);\"");
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
         wb_table1_105_1M42( true) ;
      }
      else
      {
         wb_table1_105_1M42( false) ;
      }
      return  ;
   }

   public void wb_table1_105_1M42e( boolean wbgen )
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

   public void start1M42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recuento Inventario", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1M40( ) ;
   }

   public void ws1M42( )
   {
      start1M42( ) ;
      evt1M42( ) ;
   }

   public void evt1M42( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFORME.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121M42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e131M42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPASSWORDVERIFICADOBOOLEAN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141M42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e151M42 ();
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
                     if ( nCmpId == 96 )
                     {
                        OldWcrecuentoinven_wc = httpContext.cgiGet( "W0096") ;
                        if ( ( GXutil.len( OldWcrecuentoinven_wc) == 0 ) || ( GXutil.strcmp(OldWcrecuentoinven_wc, WebComp_Wcrecuentoinven_wc_Component) != 0 ) )
                        {
                           WebComp_Wcrecuentoinven_wc = WebUtils.getWebComponent(getClass(), "app." + OldWcrecuentoinven_wc + "_impl", remoteHandle, context);
                           WebComp_Wcrecuentoinven_wc_Component = OldWcrecuentoinven_wc ;
                        }
                        if ( GXutil.len( WebComp_Wcrecuentoinven_wc_Component) != 0 )
                        {
                           WebComp_Wcrecuentoinven_wc.componentprocess("W0096", "", sEvt);
                        }
                        WebComp_Wcrecuentoinven_wc_Component = OldWcrecuentoinven_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1M42( )
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

   public void pa1M42( )
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
            GX_FocusControl = chkavValact.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvpproduc1M40( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvpproduc_data1M40( A13747PrdCDsc) ;
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

   protected void gxsgvvpproduc_data1M40( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01M42 */
      pr_default.execute(0, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01M42_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01M42_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H01M42_A13747PrdCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxsgvvuproduc1M40( String A13747PrdCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvuproduc_data1M40( A13747PrdCDsc) ;
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

   protected void gxsgvvuproduc_data1M40( String A13747PrdCDsc )
   {
      l13747PrdCDsc = GXutil.concat( GXutil.rtrim( A13747PrdCDsc), "%", "") ;
      /* Using cursor H01M43 */
      pr_default.execute(1, new Object[] {l13747PrdCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H01M43_A13747PrdCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13747PrdCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H01M43_A13747PrdCDsc[0]);
            gxdynajaxctrldescr.add(H01M43_A13747PrdCDsc[0]);
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void gxsgvvpprov1M40( String A794PrvNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvpprov_data1M40( A794PrvNom) ;
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

   protected void gxsgvvpprov_data1M40( String A794PrvNom )
   {
      l794PrvNom = GXutil.padr( GXutil.rtrim( A794PrvNom), 30, "%") ;
      n794PrvNom = false ;
      /* Using cursor H01M44 */
      pr_default.execute(2, new Object[] {l794PrvNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(2) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01M44_A794PrvNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01M44_A794PrvNom[0]));
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void gxsgvvuprov1M40( String A794PrvNom )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvuprov_data1M40( A794PrvNom) ;
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

   protected void gxsgvvuprov_data1M40( String A794PrvNom )
   {
      l794PrvNom = GXutil.padr( GXutil.rtrim( A794PrvNom), 30, "%") ;
      n794PrvNom = false ;
      /* Using cursor H01M45 */
      pr_default.execute(3, new Object[] {l794PrvNom});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(3) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( H01M45_A794PrvNom[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( H01M45_A794PrvNom[0]));
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void gxhcvvpproduc1M42( String A13747PrdCDsc )
   {
      /* Using cursor H01M46 */
      pr_default.execute(4, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(4) != 101) )
      {
         if ( GXutil.strcmp(H01M46_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H01M46_A13747PrdCDsc[0] ;
            A396EmprCod = H01M46_A396EmprCod[0] ;
            A719PrdNum = H01M46_A719PrdNum[0] ;
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

   public void gxhcvvuproduc1M42( String A13747PrdCDsc )
   {
      /* Using cursor H01M47 */
      pr_default.execute(5, new Object[] {A13747PrdCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         if ( GXutil.strcmp(H01M47_A13747PrdCDsc[0], A13747PrdCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13747PrdCDsc = H01M47_A13747PrdCDsc[0] ;
            A396EmprCod = H01M47_A396EmprCod[0] ;
            A719PrdNum = H01M47_A719PrdNum[0] ;
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

   public void gxhcvvpprov1M42( String A794PrvNom )
   {
      /* Using cursor H01M48 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(6) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A794PrvNom = H01M48_A794PrvNom[0] ;
         n794PrvNom = H01M48_n794PrvNom[0] ;
         A396EmprCod = H01M48_A396EmprCod[0] ;
         A795PrvNum = H01M48_A795PrvNum[0] ;
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

   public void gxhcvvuprov1M42( String A794PrvNom )
   {
      /* Using cursor H01M49 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(7) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A794PrvNom = H01M49_A794PrvNom[0] ;
         n794PrvNom = H01M49_n794PrvNom[0] ;
         A396EmprCod = H01M49_A396EmprCod[0] ;
         A795PrvNum = H01M49_A795PrvNum[0] ;
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
      AV122ValAct = ((GXutil.strcmp(GXutil.rtrim( AV122ValAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122ValAct", AV122ValAct);
      if ( cmbavFlagstk.getItemCount() > 0 )
      {
         AV46FlagStk = (byte)(GXutil.lval( cmbavFlagstk.getValidValue(GXutil.trim( GXutil.str( AV46FlagStk, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagStk", GXutil.str( AV46FlagStk, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV46FlagStk, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
      }
      if ( cmbavOrder.getItemCount() > 0 )
      {
         AV80Order = (short)(GXutil.lval( cmbavOrder.getValidValue(GXutil.trim( GXutil.str( AV80Order, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Order", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Order), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOrder.setValue( GXutil.trim( GXutil.str( AV80Order, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOrder.getInternalname(), "Values", cmbavOrder.ToJavascriptSource(), true);
      }
      AV6PasswordVerificadoBoolean = GXutil.strtobool( GXutil.booltostr( AV6PasswordVerificadoBoolean)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PasswordVerificadoBoolean", AV6PasswordVerificadoBoolean);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1M42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV137Pgmname = "RecuentoInventario" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137Pgmname", AV137Pgmname);
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
   }

   public void rf1M42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcrecuentoinven_wc_Component) != 0 )
            {
               WebComp_Wcrecuentoinven_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e151M42 ();
         wb1M40( ) ;
      }
   }

   public void send_integrity_lvl_hashes1M42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", GXutil.rtrim( AV8Texto));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV95Recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV95Recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV42FlagM, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42FlagM), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSIAUDITORIA", GXutil.ltrim( localUtil.ntoc( AV101SiAuditoria, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101SiAuditoria), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV121UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV103Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINFORME", GXutil.ltrim( localUtil.ntoc( AV57Informe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57Informe), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSWORDVERIFICADOCONTEXTO", AV7PasswordVerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PasswordVerificadoContexto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPASSWORDCONTEXTO", AV5PasswordContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5PasswordContexto, ""))));
   }

   public void before_start_formulas( )
   {
      AV137Pgmname = "RecuentoInventario" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137Pgmname", AV137Pgmname);
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfechr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfechr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1M40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131M42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV8Texto = httpContext.cgiGet( "vTEXTO") ;
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
         Dvpanel_textos_Width = httpContext.cgiGet( "DVPANEL_TEXTOS_Width") ;
         Dvpanel_textos_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Autowidth")) ;
         Dvpanel_textos_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Autoheight")) ;
         Dvpanel_textos_Cls = httpContext.cgiGet( "DVPANEL_TEXTOS_Cls") ;
         Dvpanel_textos_Title = httpContext.cgiGet( "DVPANEL_TEXTOS_Title") ;
         Dvpanel_textos_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Collapsible")) ;
         Dvpanel_textos_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Collapsed")) ;
         Dvpanel_textos_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Showcollapseicon")) ;
         Dvpanel_textos_Iconposition = httpContext.cgiGet( "DVPANEL_TEXTOS_Iconposition") ;
         Dvpanel_textos_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TEXTOS_Autoscroll")) ;
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
         Dvelop_confirmpanel_btnconforme_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Title") ;
         Dvelop_confirmpanel_btnconforme_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Confirmationtext") ;
         Dvelop_confirmpanel_btnconforme_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconforme_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconforme_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconforme_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconforme_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Confirmtype") ;
         Dvelop_confirmpanel_btnconforme_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFORME_Result") ;
         /* Read variables values. */
         AV122ValAct = ((GXutil.strcmp(httpContext.cgiGet( chkavValact.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV122ValAct", AV122ValAct);
         cmbavFlagstk.setValue( httpContext.cgiGet( cmbavFlagstk.getInternalname()) );
         AV46FlagStk = (byte)(GXutil.lval( httpContext.cgiGet( cmbavFlagstk.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagStk", GXutil.str( AV46FlagStk, 1, 0));
         hV85PProduc = httpContext.cgiGet( edtavPproduc_Internalname) ;
         if ( (GXutil.strcmp("", hV85PProduc)==0) )
         {
            AV85PProduc = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", AV85PProduc);
         }
         else
         {
            A13747PrdCDsc = hV85PProduc ;
            /* Using cursor H01M410 */
            pr_default.execute(8, new Object[] {A13747PrdCDsc});
            AV85PProduc = H01M410_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               pr_default.readNext(8);
               if ( ! ( (pr_default.getStatus(8) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPPRODUC");
                  GX_FocusControl = edtavPproduc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(8);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV85PProduc", hV85PProduc);
         hV115UProduc = httpContext.cgiGet( edtavUproduc_Internalname) ;
         if ( (GXutil.strcmp("", hV115UProduc)==0) )
         {
            AV115UProduc = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115UProduc", AV115UProduc);
         }
         else
         {
            A13747PrdCDsc = hV115UProduc ;
            /* Using cursor H01M411 */
            pr_default.execute(9, new Object[] {A13747PrdCDsc});
            AV115UProduc = H01M411_A719PrdNum[0] ;
            if ( ! ( (pr_default.getStatus(9) == 101) ) )
            {
               pr_default.readNext(9);
               if ( ! ( (pr_default.getStatus(9) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vUPRODUC");
                  GX_FocusControl = edtavUproduc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(9);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV115UProduc", hV115UProduc);
         hV88PProv = httpContext.cgiGet( edtavPprov_Internalname) ;
         if ( (GXutil.strcmp("", hV88PProv)==0) )
         {
            AV88PProv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88PProv), 6, 0));
         }
         else
         {
            A794PrvNom = hV88PProv ;
            n794PrvNom = false ;
            /* Using cursor H01M412 */
            pr_default.execute(10, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
            AV88PProv = H01M412_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               pr_default.readNext(10);
               if ( ! ( (pr_default.getStatus(10) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Proveedor", "")}), 1, "vPPROV");
                  GX_FocusControl = edtavPprov_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(10);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV88PProv", hV88PProv);
         hV117UProv = httpContext.cgiGet( edtavUprov_Internalname) ;
         if ( (GXutil.strcmp("", hV117UProv)==0) )
         {
            AV117UProv = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117UProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV117UProv), 6, 0));
         }
         else
         {
            A794PrvNom = hV117UProv ;
            n794PrvNom = false ;
            /* Using cursor H01M413 */
            pr_default.execute(11, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
            AV117UProv = H01M413_A795PrvNum[0] ;
            if ( ! ( (pr_default.getStatus(11) == 101) ) )
            {
               pr_default.readNext(11);
               if ( ! ( (pr_default.getStatus(11) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Proveedor", "")}), 1, "vUPROV");
                  GX_FocusControl = edtavUprov_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(11);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV117UProv", hV117UProv);
         cmbavOrder.setValue( httpContext.cgiGet( cmbavOrder.getInternalname()) );
         AV80Order = (short)(GXutil.lval( httpContext.cgiGet( cmbavOrder.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Order", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Order), 4, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavRecfechr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vRECFECHR");
            GX_FocusControl = edtavRecfechr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97Recfechr = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV97Recfechr", localUtil.ttoc( AV97Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV97Recfechr = localUtil.ctot( httpContext.cgiGet( edtavRecfechr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97Recfechr", localUtil.ttoc( AV97Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         AV6PasswordVerificadoBoolean = GXutil.strtobool( httpContext.cgiGet( chkavPasswordverificadoboolean.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6PasswordVerificadoBoolean", AV6PasswordVerificadoBoolean);
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
      e131M42 ();
      if (returnInSub) return;
   }

   public void e131M42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV103Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recuentoinventario_impl.this.GXt_char1 = GXv_char2[0] ;
      AV103Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Station", AV103Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Station, ""))));
      GXv_char2[0] = AV27EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV121UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV103Station, GXv_char2, GXv_char3, GXv_char4) ;
      recuentoinventario_impl.this.AV27EmprCod = GXv_char2[0] ;
      recuentoinventario_impl.this.AV29EmprNom = GXv_char3[0] ;
      recuentoinventario_impl.this.AV121UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV121UsurCod", AV121UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121UsurCod, "@!"))));
      GXt_int5 = AV21DelRec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "DELREC", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21DelRec = GXt_int5 ;
      GXt_int5 = AV30ExiCont ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30ExiCont = GXt_int5 ;
      GXt_int7 = AV15ContrasenaValidar ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "PWDREC", ""), GXv_int8) ;
      recuentoinventario_impl.this.GXt_int7 = GXv_int8[0] ;
      AV15ContrasenaValidar = GXt_int7 ;
      GXt_int5 = AV55Infec ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "INFEHH", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV55Infec = GXt_int5 ;
      GXt_int5 = AV111tintutex ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "TINTUT", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV111tintutex = GXt_int5 ;
      GXt_int5 = AV19Cotexsur ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "COTEXS", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Cotexsur = GXt_int5 ;
      AV99Siacumular = ((AV19Cotexsur==0) ? httpContext.getMessage( "N", "") : httpContext.getMessage( "S", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Siacumular", AV99Siacumular);
      GXt_int5 = AV101SiAuditoria ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "SIAUPQ", ""), GXv_int6) ;
      recuentoinventario_impl.this.GXt_int5 = GXv_int6[0] ;
      AV101SiAuditoria = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101SiAuditoria", GXutil.str( AV101SiAuditoria, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSIAUDITORIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101SiAuditoria), "9")));
      GXt_char1 = AV13ContDsc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV27EmprCod, httpContext.getMessage( "VERSEM", ""), GXv_char4) ;
      recuentoinventario_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13ContDsc2 = GXt_char1 ;
      AV126Version = GXutil.substring( AV13ContDsc2, 1, 20) ;
      AV126Version = ((GXutil.strcmp("", AV126Version)==0) ? httpContext.getMessage( "Version 1.0", "") : AV126Version) ;
      AV109TextoVers = httpContext.getMessage( "TEXPLUS ", "") + GXutil.trim( AV126Version) ;
      AV80Order = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Order", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Order), 4, 0));
      if ( AV30ExiCont == 0 )
      {
         Gx_msg = httpContext.getMessage( "En la version, ", "") + GXutil.trim( AV109TextoVers) + httpContext.getMessage( " es necesario", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "tener creado el contador PWDREC", "") + GXutil.newLine( ) ;
         Gx_msg += httpContext.getMessage( "y asignado un PASSWORD", "") + GXutil.newLine( ) ;
         httpContext.GX_msglist.addItem(Gx_msg);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      divTablecontent_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablecontent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecontent_Visible), 5, 0), true);
      AV6PasswordVerificadoBoolean = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PasswordVerificadoBoolean", AV6PasswordVerificadoBoolean);
      AV5PasswordContexto = "ValidarWebWPwdGrl" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5PasswordContexto", AV5PasswordContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5PasswordContexto, ""))));
      AV7PasswordVerificadoContexto = AV5PasswordContexto + "_Verificado" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PasswordVerificadoContexto", AV7PasswordVerificadoContexto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPASSWORDVERIFICADOCONTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PasswordVerificadoContexto, ""))));
      AV9WebSession.setValue(AV5PasswordContexto, GXutil.str( AV15ContrasenaValidar, 8, 0));
      /* Window Datatype Object Property */
      AV10Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV6PasswordVerificadoBoolean))}, new String[] {"PwdBo"})  );
      AV10Window.setReturnParms(new Object[] {"AV6PasswordVerificadoBoolean",});
      httpContext.newWindow(AV10Window);
      AV34FecRec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34FecRec", localUtil.format(AV34FecRec, "99/99/99"));
      AV124VarAux0 = GXutil.serverNow( context, remoteHandle, pr_default) ;
      AV48HhMm = localUtil.ttoc( AV124VarAux0, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV50HhMmchar = localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + AV48HhMm ;
      AV97Recfechr = localUtil.ctot( AV50HhMmchar, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97Recfechr", localUtil.ttoc( AV97Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV8Texto = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      if ( AV57Informe == 1 )
      {
         AV8Texto += httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
         AV8Texto += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
         AV8Texto += " " + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      }
      if ( GXutil.strcmp(AV8Texto, " ") == 0 )
      {
         AV8Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      }
      else
      {
         AV8Texto += httpContext.getMessage( "Importante. Es obligatorio que se compruebe que NO haya nadie, trabajando en: ", "") + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      }
      AV8Texto += httpContext.getMessage( "Compras de Quimicos, Recetas de Tinte, Recetas Acabado", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      AV8Texto += httpContext.getMessage( "Recetas estampación, Recetas Lavados, Consumos Manuales", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      AV8Texto += httpContext.getMessage( "Cierre de Recetas de Tinte, Acabados, Estampación, Lavados ", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      AV8Texto += httpContext.getMessage( "Porque si fuera que sí, esto afectaría al inventario que deseamos realizar.", "") + GXutil.newLine( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      AV8Texto += httpContext.getMessage( "Confirma, entonces, la creación del INVENTARIO, con fecha ", "") + localUtil.ttoc( AV97Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + " ?" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Texto", AV8Texto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8Texto, ""))));
      AV42FlagM = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42FlagM", GXutil.str( AV42FlagM, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42FlagM), "9")));
      /* Execute user subroutine: 'LASTRECUEN' */
      S112 ();
      if (returnInSub) return;
      if ( AV21DelRec == 1 )
      {
         GXv_char4[0] = AV27EmprCod ;
         GXv_int6[0] = AV42FlagM ;
         new app.pctrrec(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
         recuentoinventario_impl.this.AV27EmprCod = GXv_char4[0] ;
         recuentoinventario_impl.this.AV42FlagM = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV42FlagM", GXutil.str( AV42FlagM, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42FlagM), "9")));
      }
      if ( 1 == 0 )
      {
         GXt_char1 = AV103Station ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
         recuentoinventario_impl.this.GXt_char1 = GXv_char4[0] ;
         AV103Station = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103Station", AV103Station);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV103Station, ""))));
         GXv_char4[0] = AV27EmprCod ;
         GXv_char3[0] = AV29EmprNom ;
         GXv_char2[0] = AV121UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV103Station, GXv_char4, GXv_char3, GXv_char2) ;
         recuentoinventario_impl.this.AV27EmprCod = GXv_char4[0] ;
         recuentoinventario_impl.this.AV29EmprNom = GXv_char3[0] ;
         recuentoinventario_impl.this.AV121UsurCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV121UsurCod", AV121UsurCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121UsurCod, "@!"))));
         divTableresultado1_Height = 300 ;
         httpContext.ajax_rsp_assign_prop("", false, divTableresultado1_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableresultado1_Height), 9, 0), true);
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcrecuentoinven_wc = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecuentoinven_wc_Component), GXutil.lower( "RecuentoInven_WC")) != 0 )
         {
            WebComp_Wcrecuentoinven_wc = WebUtils.getWebComponent(getClass(), "app.recuentoinven_wc_impl", remoteHandle, context);
            WebComp_Wcrecuentoinven_wc_Component = "RecuentoInven_WC" ;
         }
         if ( GXutil.len( WebComp_Wcrecuentoinven_wc_Component) != 0 )
         {
            WebComp_Wcrecuentoinven_wc.setjustcreated();
            WebComp_Wcrecuentoinven_wc.componentprepare(new Object[] {"W0096","",AV27EmprCod,AV85PProduc,AV115UProduc,Integer.valueOf(AV88PProv),Integer.valueOf(AV117UProv)});
            WebComp_Wcrecuentoinven_wc.componentbind(new Object[] {"","vPPRODUC","vUPRODUC","vPPROV","vUPROV"});
         }
      }
   }

   public void e121M42( )
   {
      /* Dvelop_confirmpanel_btnconforme_Close Routine */
      returnInSub = false ;
      lblTexto1_Fontsize = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTexto1_Fontsize), 9, 0), true);
      lblTexto1_Caption = httpContext.getMessage( "Iniciar proceso", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconforme_Result, "Yes") == 0 )
      {
         AV113UProd2 = ((GXutil.strcmp("", AV115UProduc)==0) ? "999999" : AV115UProduc) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV113UProd2", AV113UProd2);
         AV119UProv2 = ((0==AV117UProv) ? 999999 : AV117UProv) ;
         if ( GXutil.resetTime(AV34FecRec).before( GXutil.resetTime( AV95Recfec )) )
         {
            Gx_msg = httpContext.getMessage( "Error. Fecha Ultimo recuento ", "") + localUtil.dtoc( AV95Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "es INFERIOR a la Fecha introducida ", "") + localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( AV42FlagM == 1 )
            {
               Gx_msg = httpContext.getMessage( "ATENCION. Falta Terminar Inventario Anterior, Fecha = ", "") + localUtil.dtoc( AV95Recfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( AV101SiAuditoria == 1 )
               {
                  AV106Texto_i = httpContext.getMessage( "Wrecuen. Inicio.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
                  lblTexto1_Caption = httpContext.getMessage( "Wrecuen. Inicio.Ajustes RESERVAS", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
                  new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
                  AV93ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
                  AV93ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
                  AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Reservas Productos...", ""));
                  AV93ProgressIndicator.setgxTv_SdtProgress_Value( 20 );
                  GXv_char4[0] = AV27EmprCod ;
                  GXv_char3[0] = AV85PProduc ;
                  GXv_char2[0] = AV113UProd2 ;
                  new app.preserv1(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
                  recuentoinventario_impl.this.AV27EmprCod = GXv_char4[0] ;
                  recuentoinventario_impl.this.AV85PProduc = GXv_char3[0] ;
                  recuentoinventario_impl.this.AV113UProd2 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", AV85PProduc);
                  httpContext.ajax_rsp_assign_attri("", false, "AV113UProd2", AV113UProd2);
                  new app.pcommit(remoteHandle, context).execute( ) ;
                  GXv_char4[0] = AV27EmprCod ;
                  GXv_char3[0] = AV85PProduc ;
                  GXv_char2[0] = AV113UProd2 ;
                  new app.preserv2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
                  recuentoinventario_impl.this.AV27EmprCod = GXv_char4[0] ;
                  recuentoinventario_impl.this.AV85PProduc = GXv_char3[0] ;
                  recuentoinventario_impl.this.AV113UProd2 = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", AV85PProduc);
                  httpContext.ajax_rsp_assign_attri("", false, "AV113UProd2", AV113UProd2);
                  new app.pcommit(remoteHandle, context).execute( ) ;
                  AV106Texto_i = httpContext.getMessage( "Wrecuen. Fin.Ajustes RESERVAS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
                  lblTexto1_Caption = httpContext.getMessage( "Wrecuen. Fin.Ajustes RESERVAS", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
                  new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
                  AV11ActDatos = httpContext.getMessage( "S", "") ;
                  AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias..........", ""));
                  AV93ProgressIndicator.setgxTv_SdtProgress_Value( 40 );
                  AV36File = "" ;
                  callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV85PProduc)),GXutil.URLEncode(GXutil.rtrim(AV113UProd2)),GXutil.URLEncode(GXutil.rtrim(AV99Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV11ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV36File)),GXutil.URLEncode(GXutil.rtrim(GXutil.substring( AV137Pgmname, 1, 10)))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
                  httpContext.wjLocDisableFrm = (byte)(2) ;
                  AV106Texto_i = httpContext.getMessage( "Wrecuen. Inicio.Auditoria PRODUCTOS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
                  lblTexto1_Caption = httpContext.getMessage( "Wrecuen. Inicio.Auditoria PRODUCTOS", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
                  new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
                  GX_I = 1 ;
                  while ( GX_I <= 10000 )
                  {
                     AV104Tab_upq[GX_I-1] = "" ;
                     GX_I = (int)(GX_I+1) ;
                  }
                  AV52i = 1 ;
                  /* Using cursor H01M414 */
                  pr_default.execute(12, new Object[] {AV27EmprCod, AV85PProduc, AV113UProd2});
                  while ( (pr_default.getStatus(12) != 101) )
                  {
                     A719PrdNum = H01M414_A719PrdNum[0] ;
                     A396EmprCod = H01M414_A396EmprCod[0] ;
                     if ( AV52i > 10000 )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Maximo 10000 productos quimicos", ""));
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     AV104Tab_upq[AV52i-1] = A719PrdNum ;
                     AV52i = (int)(AV52i+1) ;
                     pr_default.readNext(12);
                  }
                  pr_default.close(12);
                  AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias (1)..........", ""));
                  AV93ProgressIndicator.setgxTv_SdtProgress_Value( 60 );
                  AV52i = 1 ;
                  while ( AV52i <= 10000 )
                  {
                     if ( GXutil.strcmp(AV104Tab_upq[AV52i-1], " ") == 0 )
                     {
                        if (true) break;
                     }
                     AV91Prdnum = AV104Tab_upq[AV52i-1] ;
                     GXv_char4[0] = AV27EmprCod ;
                     GXv_char3[0] = AV91Prdnum ;
                     GXv_char2[0] = AV99Siacumular ;
                     GXv_decimal9[0] = AV23Dif ;
                     GXv_decimal10[0] = AV25Dif2 ;
                     GXv_char11[0] = AV76Obs ;
                     new app.pupq003(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_decimal9, GXv_decimal10, GXv_char11) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char4[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char3[0] ;
                     recuentoinventario_impl.this.AV99Siacumular = GXv_char2[0] ;
                     recuentoinventario_impl.this.AV23Dif = GXv_decimal9[0] ;
                     recuentoinventario_impl.this.AV25Dif2 = GXv_decimal10[0] ;
                     recuentoinventario_impl.this.AV76Obs = GXv_char11[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV99Siacumular", AV99Siacumular);
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     GXv_decimal10[0] = AV23Dif ;
                     GXv_decimal9[0] = AV25Dif2 ;
                     GXv_char3[0] = AV76Obs ;
                     new app.pupq002(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_decimal10, GXv_decimal9, GXv_char3) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     recuentoinventario_impl.this.AV23Dif = GXv_decimal10[0] ;
                     recuentoinventario_impl.this.AV25Dif2 = GXv_decimal9[0] ;
                     recuentoinventario_impl.this.AV76Obs = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     new app.pcommit(remoteHandle, context).execute( ) ;
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     new app.core.upq004(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     GXt_char1 = AV90Prdnom ;
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     GXv_char3[0] = GXt_char1 ;
                     new app.pprddsc(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     recuentoinventario_impl.this.GXt_char1 = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     AV90Prdnom = GXt_char1 ;
                     AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(1) Producto ", "")+GXutil.trim( AV91Prdnum)+" "+GXutil.trim( AV90Prdnom) );
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     GXv_char3[0] = AV99Siacumular ;
                     GXv_decimal10[0] = AV23Dif ;
                     GXv_decimal9[0] = AV25Dif2 ;
                     GXv_char2[0] = AV76Obs ;
                     new app.pupq003(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_decimal10, GXv_decimal9, GXv_char2) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     recuentoinventario_impl.this.AV99Siacumular = GXv_char3[0] ;
                     recuentoinventario_impl.this.AV23Dif = GXv_decimal10[0] ;
                     recuentoinventario_impl.this.AV25Dif2 = GXv_decimal9[0] ;
                     recuentoinventario_impl.this.AV76Obs = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV99Siacumular", AV99Siacumular);
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     GXv_decimal10[0] = AV23Dif ;
                     GXv_decimal9[0] = AV25Dif2 ;
                     GXv_char3[0] = AV76Obs ;
                     new app.pupq002(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_decimal10, GXv_decimal9, GXv_char3) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     recuentoinventario_impl.this.AV23Dif = GXv_decimal10[0] ;
                     recuentoinventario_impl.this.AV25Dif2 = GXv_decimal9[0] ;
                     recuentoinventario_impl.this.AV76Obs = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     new app.pcommit(remoteHandle, context).execute( ) ;
                     GXv_char11[0] = AV27EmprCod ;
                     GXv_char4[0] = AV91Prdnum ;
                     new app.core.upq004(remoteHandle, context).execute( GXv_char11, GXv_char4) ;
                     recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
                     recuentoinventario_impl.this.AV91Prdnum = GXv_char4[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
                     AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "(2) Producto ", "")+GXutil.trim( AV91Prdnum)+" "+GXutil.trim( AV90Prdnom) );
                     AV52i = (int)(AV52i+1) ;
                  }
                  AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Auditoria Productos Existencias (2)..........", ""));
                  AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Auditoria Productos Existencias ", "") );
                  AV93ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
                  callWebObject(formatLink("app.apupq001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV85PProduc)),GXutil.URLEncode(GXutil.rtrim(AV113UProd2)),GXutil.URLEncode(GXutil.rtrim(AV99Siacumular)),GXutil.URLEncode(GXutil.rtrim(AV11ActDatos)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV36File)),GXutil.URLEncode(GXutil.rtrim(AV137Pgmname))}, new String[] {"Emprcod","Prdnum1","Prdnum2","Siacumular","ActDatos","CantCierre","File","PgmnameOut"}) );
                  httpContext.wjLocDisableFrm = (byte)(2) ;
                  AV106Texto_i = httpContext.getMessage( "Wrecuen. Fin.Auditoria PRODUCTOS", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
                  lblTexto1_Caption = httpContext.getMessage( "Wrecuen. Fin.Auditoria PRODUCTOS", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
                  new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
               }
               if ( AV57Informe == 1 )
               {
                  AV106Texto_i = httpContext.getMessage( "ATENCION. Informamos que con Fecha ", "") + localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " ,ya se hizo un INVENTARIO.", "") + GXutil.newLine( ) ;
                  AV106Texto_i += httpContext.getMessage( "SI confirma el INVENTARIO, se eliminara la informacion con Fecha ", "") + localUtil.dtoc( AV34FecRec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( ",dentro del intervalo seleccionado.", "") + GXutil.newLine( ) ;
                  AV106Texto_i += httpContext.getMessage( "->Se confirmo el INVENTARIO", "") + GXutil.newLine( ) ;
                  new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
               }
               AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Eliminación Tablas INVPRD, RECALM, INVALM...", ""));
               AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Eliminación/depuración ", "") );
               AV93ProgressIndicator.setgxTv_SdtProgress_Value( 80 );
               GXv_char11[0] = AV27EmprCod ;
               GXv_char4[0] = AV85PProduc ;
               GXv_char3[0] = AV113UProd2 ;
               GXv_int8[0] = AV88PProv ;
               GXv_int12[0] = AV119UProv2 ;
               GXv_int6[0] = AV46FlagStk ;
               new app.pinvprdd(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_int8, GXv_int12, GXv_int6) ;
               recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
               recuentoinventario_impl.this.AV85PProduc = GXv_char4[0] ;
               recuentoinventario_impl.this.AV113UProd2 = GXv_char3[0] ;
               recuentoinventario_impl.this.AV88PProv = GXv_int8[0] ;
               recuentoinventario_impl.this.AV119UProv2 = GXv_int12[0] ;
               recuentoinventario_impl.this.AV46FlagStk = GXv_int6[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", AV85PProduc);
               httpContext.ajax_rsp_assign_attri("", false, "AV113UProd2", AV113UProd2);
               httpContext.ajax_rsp_assign_attri("", false, "AV88PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88PProv), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV46FlagStk", GXutil.str( AV46FlagStk, 1, 0));
               AV106Texto_i = httpContext.getMessage( "WRecuen.Inicio.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
               lblTexto1_Caption = httpContext.getMessage( "WRecuen.Inicio.Actualizo tablas RECUEN,INVPRD", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
               new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
               AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Actualizando Tablas de Inventario:INVPRD, RECALM, INVALM...", ""));
               AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Actualizando de Inventario ", "") );
               AV93ProgressIndicator.setgxTv_SdtProgress_Value( 90 );
               GXv_char11[0] = AV27EmprCod ;
               GXv_char4[0] = AV85PProduc ;
               GXv_char3[0] = AV113UProd2 ;
               GXv_int12[0] = AV88PProv ;
               GXv_int8[0] = AV119UProv2 ;
               GXv_int6[0] = AV46FlagStk ;
               GXv_date13[0] = AV34FecRec ;
               GXv_dtime14[0] = AV97Recfechr ;
               new app.precuen(remoteHandle, context).execute( GXv_char11, GXv_char4, GXv_char3, GXv_int12, GXv_int8, GXv_int6, GXv_date13, GXv_dtime14) ;
               recuentoinventario_impl.this.AV27EmprCod = GXv_char11[0] ;
               recuentoinventario_impl.this.AV85PProduc = GXv_char4[0] ;
               recuentoinventario_impl.this.AV113UProd2 = GXv_char3[0] ;
               recuentoinventario_impl.this.AV88PProv = GXv_int12[0] ;
               recuentoinventario_impl.this.AV119UProv2 = GXv_int8[0] ;
               recuentoinventario_impl.this.AV46FlagStk = GXv_int6[0] ;
               recuentoinventario_impl.this.AV34FecRec = GXv_date13[0] ;
               recuentoinventario_impl.this.AV97Recfechr = GXv_dtime14[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", AV85PProduc);
               httpContext.ajax_rsp_assign_attri("", false, "AV113UProd2", AV113UProd2);
               httpContext.ajax_rsp_assign_attri("", false, "AV88PProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88PProv), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV46FlagStk", GXutil.str( AV46FlagStk, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV34FecRec", localUtil.format(AV34FecRec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, "AV97Recfechr", localUtil.ttoc( AV97Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV106Texto_i = httpContext.getMessage( "WRecuen.Fin.Actualizo tablas RECUEN,INVPRD", "") + httpContext.getMessage( " Intervalo Productos =", "") + AV85PProduc + "-" + AV113UProd2 + httpContext.getMessage( " Intervalo Proveedores=", "") + GXutil.str( AV88PProv, 6, 0) + "-" + GXutil.str( AV119UProv2, 6, 0) ;
               lblTexto1_Caption = httpContext.getMessage( "WRecuen.Fin.Actualizo tablas RECUEN,INVPRD", "")+httpContext.getMessage( " Intervalo Productos =", "")+AV85PProduc+"-"+AV113UProd2+httpContext.getMessage( " Intervalo Proveedores=", "")+GXutil.str( AV88PProv, 6, 0)+"-"+GXutil.str( AV119UProv2, 6, 0) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
               new app.pctrinc(remoteHandle, context).execute( AV27EmprCod, AV137Pgmname, AV121UsurCod, AV103Station, AV106Texto_i, 99999999, (byte)(0), "@") ;
               lblTexto1_Caption = httpContext.getMessage( "Proceso finalizado ¡¡¡¡ ", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
               AV93ProgressIndicator.showwithtitle(httpContext.getMessage( "Finalizado", ""));
               AV93ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Proceso finalizado ", "") );
               AV93ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
               AV93ProgressIndicator.hide();
               if ( AV80Order == 1 )
               {
                  httpContext.popup(formatLink("app.rst0019", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV85PProduc)),GXutil.URLEncode(GXutil.rtrim(AV113UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV88PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV119UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV122ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV46FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FecRec)),GXutil.URLEncode(GXutil.rtrim(AV132volver))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","Recfec"}) , new Object[] {"AV27EmprCod","AV85PProduc","AV113UProd2","AV88PProv","AV119UProv2","AV122ValAct","AV46FlagStk","AV34FecRec","AV132volver"});
               }
               else if ( AV80Order == 2 )
               {
                  httpContext.popup(formatLink("app.rst0019n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV85PProduc)),GXutil.URLEncode(GXutil.rtrim(AV113UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV88PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV119UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV122ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV46FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FecRec))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","recfec"}) , new Object[] {"AV27EmprCod","AV85PProduc","AV113UProd2","AV88PProv","AV119UProv2","AV122ValAct","AV46FlagStk","AV34FecRec"});
               }
               else if ( AV80Order == 3 )
               {
                  httpContext.popup(formatLink("app.rst0019u", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV85PProduc)),GXutil.URLEncode(GXutil.rtrim(AV113UProd2)),GXutil.URLEncode(GXutil.ltrimstr(AV88PProv,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV119UProv2,6,0)),GXutil.URLEncode(GXutil.rtrim(AV122ValAct)),GXutil.URLEncode(GXutil.ltrimstr(AV46FlagStk,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV34FecRec))}, new String[] {"EmprCod","PProduc","UProd2","PProv","UProv2","ValAct","Flag","RECFEC"}) , new Object[] {"AV27EmprCod","AV85PProduc","AV113UProd2","AV88PProv","AV119UProv2","AV122ValAct","AV46FlagStk","AV34FecRec"});
               }
               else
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Orden indicado no corresponde.", ""));
               }
            }
         }
      }
      else
      {
         lblTexto1_Caption = httpContext.getMessage( "Proceso No iniciado", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV93ProgressIndicator", AV93ProgressIndicator);
      cmbavFlagstk.setValue( GXutil.trim( GXutil.str( AV46FlagStk, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavFlagstk.getInternalname(), "Values", cmbavFlagstk.ToJavascriptSource(), true);
   }

   public void e141M42( )
   {
      /* Passwordverificadoboolean_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV6PasswordVerificadoBoolean )
      {
         if ( GXutil.strcmp(AV9WebSession.getValue(AV7PasswordVerificadoContexto), "SI") == 0 )
         {
            divTablecontent_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, divTablecontent_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablecontent_Visible), 5, 0), true);
            chkavPasswordverificadoboolean.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkavPasswordverificadoboolean.getInternalname(), "Visible", GXutil.ltrimstr( chkavPasswordverificadoboolean.getVisible(), 5, 0), true);
            AV9WebSession.remove(AV5PasswordContexto);
         }
         else
         {
            AV6PasswordVerificadoBoolean = false ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6PasswordVerificadoBoolean", AV6PasswordVerificadoBoolean);
         }
         AV9WebSession.remove(AV7PasswordVerificadoContexto);
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV95Recfec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Recfec", localUtil.format(AV95Recfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV95Recfec));
      /* Using cursor H01M415 */
      pr_default.execute(13, new Object[] {AV27EmprCod});
      while ( (pr_default.getStatus(13) != 101) )
      {
         A396EmprCod = H01M415_A396EmprCod[0] ;
         A810RecFec = H01M415_A810RecFec[0] ;
         AV95Recfec = A810RecFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Recfec", localUtil.format(AV95Recfec, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV95Recfec));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(13);
      }
      pr_default.close(13);
      AV57Informe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Informe", GXutil.str( AV57Informe, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57Informe), "9")));
      /* Using cursor H01M416 */
      pr_default.execute(14, new Object[] {AV27EmprCod, AV34FecRec});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A13416RecEstInv = H01M416_A13416RecEstInv[0] ;
         A810RecFec = H01M416_A810RecFec[0] ;
         A396EmprCod = H01M416_A396EmprCod[0] ;
         AV57Informe = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Informe", GXutil.str( AV57Informe, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINFORME", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57Informe), "9")));
         pr_default.readNext(14);
      }
      pr_default.close(14);
   }

   protected void nextLoad( )
   {
   }

   protected void e151M42( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_105_1M42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconforme_Internalname, tblTabledvelop_confirmpanel_btnconforme_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconforme.setProperty("Title", Dvelop_confirmpanel_btnconforme_Title);
         ucDvelop_confirmpanel_btnconforme.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconforme_Confirmationtext);
         ucDvelop_confirmpanel_btnconforme.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconforme_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconforme.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconforme_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconforme.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconforme_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconforme.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconforme_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconforme.setProperty("ConfirmType", Dvelop_confirmpanel_btnconforme_Confirmtype);
         ucDvelop_confirmpanel_btnconforme.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconforme_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFORMEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFORMEContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_105_1M42e( true) ;
      }
      else
      {
         wb_table1_105_1M42e( false) ;
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
      pa1M42( ) ;
      ws1M42( ) ;
      we1M42( ) ;
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
      if ( ! ( WebComp_Wcrecuentoinven_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wcrecuentoinven_wc_Component) != 0 )
         {
            WebComp_Wcrecuentoinven_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016434543", true, true);
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
      httpContext.AddJavascriptSource("recuentoinventario.js", "?202661016434543", false, true);
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
      chkavValact.setInternalname( "vVALACT" );
      cmbavFlagstk.setInternalname( "vFLAGSTK" );
      edtavPproduc_Internalname = "vPPRODUC" ;
      edtavUproduc_Internalname = "vUPRODUC" ;
      edtavPprov_Internalname = "vPPROV" ;
      edtavUprov_Internalname = "vUPROV" ;
      cmbavOrder.setInternalname( "vORDER" );
      edtavRecfechr_Internalname = "vRECFECHR" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      bttBtnconforme_Internalname = "BTNCONFORME" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTexto1_Internalname = "TEXTO1" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTextos_Internalname = "TEXTOS" ;
      Dvpanel_textos_Internalname = "DVPANEL_TEXTOS" ;
      lblTab01_title_Internalname = "TAB01_TITLE" ;
      divTableresultado1_Internalname = "TABLERESULTADO1" ;
      Gxuitabspanel_tabs_Internalname = "GXUITABSPANEL_TABS" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      chkavPasswordverificadoboolean.setInternalname( "vPASSWORDVERIFICADOBOOLEAN" );
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_btnconforme_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFORME" ;
      tblTabledvelop_confirmpanel_btnconforme_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFORME" ;
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
      chkavPasswordverificadoboolean.setEnabled( 1 );
      chkavPasswordverificadoboolean.setVisible( 1 );
      divTableresultado1_Height = 0 ;
      lblTexto1_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      lblTexto1_Caption = httpContext.getMessage( "Texto1", "") ;
      edtavRecfechr_Jsonclick = "" ;
      edtavRecfechr_Enabled = 1 ;
      cmbavOrder.setJsonclick( "" );
      cmbavOrder.setEnabled( 1 );
      edtavUprov_Jsonclick = "" ;
      edtavUprov_Enabled = 1 ;
      edtavPprov_Jsonclick = "" ;
      edtavPprov_Enabled = 1 ;
      edtavUproduc_Jsonclick = "" ;
      edtavUproduc_Enabled = 1 ;
      edtavPproduc_Jsonclick = "" ;
      edtavPproduc_Enabled = 1 ;
      cmbavFlagstk.setJsonclick( "" );
      cmbavFlagstk.setEnabled( 1 );
      chkavValact.setEnabled( 1 );
      divTablecontent_Visible = 1 ;
      Dvelop_confirmpanel_btnconforme_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconforme_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconforme_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconforme_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconforme_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconforme_Confirmationtext = "¿Confirma el Inventario?" ;
      Dvelop_confirmpanel_btnconforme_Title = "" ;
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
      Dvpanel_textos_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_textos_Iconposition = "Right" ;
      Dvpanel_textos_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_textos_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_textos_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_textos_Title = "" ;
      Dvpanel_textos_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_textos_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_textos_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_textos_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Recuento Inventario", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      chkavValact.setName( "vVALACT" );
      chkavValact.setWebtags( "" );
      chkavValact.setCaption( httpContext.getMessage( "Imprimir Valores Actuales", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavValact.getInternalname(), "TitleCaption", chkavValact.getCaption(), true);
      chkavValact.setCheckedValue( "N" );
      AV122ValAct = ((GXutil.strcmp(GXutil.rtrim( AV122ValAct), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122ValAct", AV122ValAct);
      cmbavFlagstk.setName( "vFLAGSTK" );
      cmbavFlagstk.setWebtags( "" );
      cmbavFlagstk.addItem("0", httpContext.getMessage( "Todos", ""), (short)(0));
      cmbavFlagstk.addItem("1", httpContext.getMessage( "Con Stock", ""), (short)(0));
      if ( cmbavFlagstk.getItemCount() > 0 )
      {
         AV46FlagStk = (byte)(GXutil.lval( cmbavFlagstk.getValidValue(GXutil.trim( GXutil.str( AV46FlagStk, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46FlagStk", GXutil.str( AV46FlagStk, 1, 0));
      }
      cmbavOrder.setName( "vORDER" );
      cmbavOrder.setWebtags( "" );
      cmbavOrder.addItem("1", httpContext.getMessage( "Código", ""), (short)(0));
      cmbavOrder.addItem("2", httpContext.getMessage( "Descripción", ""), (short)(0));
      cmbavOrder.addItem("3", httpContext.getMessage( "Ubicación", ""), (short)(0));
      if ( cmbavOrder.getItemCount() > 0 )
      {
         AV80Order = (short)(GXutil.lval( cmbavOrder.getValidValue(GXutil.trim( GXutil.str( AV80Order, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Order", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80Order), 4, 0));
      }
      chkavPasswordverificadoboolean.setName( "vPASSWORDVERIFICADOBOOLEAN" );
      chkavPasswordverificadoboolean.setWebtags( "" );
      chkavPasswordverificadoboolean.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavPasswordverificadoboolean.getInternalname(), "TitleCaption", chkavPasswordverificadoboolean.getCaption(), true);
      chkavPasswordverificadoboolean.setCheckedValue( "false" );
      AV6PasswordVerificadoBoolean = GXutil.strtobool( GXutil.booltostr( AV6PasswordVerificadoBoolean)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6PasswordVerificadoBoolean", AV6PasswordVerificadoBoolean);
      /* End function init_web_controls */
   }

   public void validv_Pproduc( )
   {
      if ( (GXutil.strcmp("", hV85PProduc)==0) )
      {
         AV85PProduc = "" ;
      }
      else
      {
         A13747PrdCDsc = hV85PProduc ;
         /* Using cursor H01M417 */
         pr_default.execute(15, new Object[] {A13747PrdCDsc});
         AV85PProduc = H01M417_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(15) == 101) ) )
         {
            pr_default.readNext(15);
            if ( ! ( (pr_default.getStatus(15) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vPPRODUC");
               GX_FocusControl = edtavPproduc_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(15);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV85PProduc", hV85PProduc);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV85PProduc", GXutil.rtrim( AV85PProduc));
      httpContext.ajax_rsp_assign_attri("", false, "hV85PProduc", hV85PProduc);
   }

   public void validv_Uproduc( )
   {
      if ( (GXutil.strcmp("", hV115UProduc)==0) )
      {
         AV115UProduc = "" ;
      }
      else
      {
         A13747PrdCDsc = hV115UProduc ;
         /* Using cursor H01M418 */
         pr_default.execute(16, new Object[] {A13747PrdCDsc});
         AV115UProduc = H01M418_A719PrdNum[0] ;
         if ( ! ( (pr_default.getStatus(16) == 101) ) )
         {
            pr_default.readNext(16);
            if ( ! ( (pr_default.getStatus(16) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Producto", "")}), 1, "vUPRODUC");
               GX_FocusControl = edtavUproduc_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(16);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV115UProduc", hV115UProduc);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV115UProduc", GXutil.rtrim( AV115UProduc));
      httpContext.ajax_rsp_assign_attri("", false, "hV115UProduc", hV115UProduc);
   }

   public void validv_Pprov( )
   {
      if ( (GXutil.strcmp("", hV88PProv)==0) )
      {
         AV88PProv = 0 ;
      }
      else
      {
         A794PrvNom = hV88PProv ;
         n794PrvNom = false ;
         /* Using cursor H01M419 */
         pr_default.execute(17, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
         AV88PProv = H01M419_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(17) == 101) ) )
         {
            pr_default.readNext(17);
            if ( ! ( (pr_default.getStatus(17) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Proveedor", "")}), 1, "vPPROV");
               GX_FocusControl = edtavPprov_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(17);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV88PProv", hV88PProv);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV88PProv", GXutil.ltrim( localUtil.ntoc( AV88PProv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV88PProv", GXutil.rtrim( hV88PProv));
   }

   public void validv_Uprov( )
   {
      if ( (GXutil.strcmp("", hV117UProv)==0) )
      {
         AV117UProv = 0 ;
      }
      else
      {
         A794PrvNom = hV117UProv ;
         n794PrvNom = false ;
         /* Using cursor H01M420 */
         pr_default.execute(18, new Object[] {Boolean.valueOf(n794PrvNom), A794PrvNom});
         AV117UProv = H01M420_A795PrvNum[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Nombre Proveedor", "")}), 1, "vUPROV");
               GX_FocusControl = edtavUprov_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV117UProv", hV117UProv);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV117UProv", GXutil.ltrim( localUtil.ntoc( AV117UProv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "hV117UProv", GXutil.rtrim( hV117UProv));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV122ValAct',fld:'vVALACT',pic:'@!'},{av:'AV6PasswordVerificadoBoolean',fld:'vPASSWORDVERIFICADOBOOLEAN',pic:''},{av:'AV8Texto',fld:'vTEXTO',pic:'',hsh:true},{av:'AV95Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV42FlagM',fld:'vFLAGM',pic:'9',hsh:true},{av:'AV101SiAuditoria',fld:'vSIAUDITORIA',pic:'9',hsh:true},{av:'AV121UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV103Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV57Informe',fld:'vINFORME',pic:'9',hsh:true},{av:'AV7PasswordVerificadoContexto',fld:'vPASSWORDVERIFICADOCONTEXTO',pic:'',hsh:true},{av:'AV5PasswordContexto',fld:'vPASSWORDCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFORME'","{handler:'e111M41',iparms:[{av:'AV8Texto',fld:'vTEXTO',pic:'',hsh:true}]");
      setEventMetadata("'DOCONFORME'",",oparms:[{av:'Dvelop_confirmpanel_btnconforme_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFORME',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFORME.CLOSE","{handler:'e121M42',iparms:[{av:'Dvelop_confirmpanel_btnconforme_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFORME',prop:'Result'},{av:'AV115UProduc',fld:'vUPRODUC',pic:''},{av:'AV117UProv',fld:'vUPROV',pic:'ZZZZZ9'},{av:'AV34FecRec',fld:'vFECREC',pic:''},{av:'AV95Recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV42FlagM',fld:'vFLAGM',pic:'9',hsh:true},{av:'AV101SiAuditoria',fld:'vSIAUDITORIA',pic:'9',hsh:true},{av:'AV85PProduc',fld:'vPPRODUC',pic:''},{av:'AV88PProv',fld:'vPPROV',pic:'ZZZZZ9'},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV137Pgmname',fld:'vPGMNAME',pic:''},{av:'AV121UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV103Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV99Siacumular',fld:'vSIACUMULAR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV57Informe',fld:'vINFORME',pic:'9',hsh:true},{av:'cmbavFlagstk'},{av:'AV46FlagStk',fld:'vFLAGSTK',pic:'9'},{av:'AV97Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'cmbavOrder'},{av:'AV80Order',fld:'vORDER',pic:'9'},{av:'AV122ValAct',fld:'vVALACT',pic:'@!'},{av:'AV132volver',fld:'vVOLVER',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFORME.CLOSE",",oparms:[{av:'lblTexto1_Fontsize',ctrl:'TEXTO1',prop:'Fontsize'},{av:'lblTexto1_Caption',ctrl:'TEXTO1',prop:'Caption'},{av:'AV113UProd2',fld:'vUPROD2',pic:''},{av:'AV85PProduc',fld:'vPPRODUC',pic:''},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV137Pgmname',fld:'vPGMNAME',pic:''},{av:'AV99Siacumular',fld:'vSIACUMULAR',pic:''},{av:'cmbavFlagstk'},{av:'AV46FlagStk',fld:'vFLAGSTK',pic:'9'},{av:'AV88PProv',fld:'vPPROV',pic:'ZZZZZ9'},{av:'AV97Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV34FecRec',fld:'vFECREC',pic:''},{av:'AV132volver',fld:'vVOLVER',pic:''},{av:'AV122ValAct',fld:'vVALACT',pic:'@!'}]}");
      setEventMetadata("VPASSWORDVERIFICADOBOOLEAN.CONTROLVALUECHANGED","{handler:'e141M42',iparms:[{av:'AV6PasswordVerificadoBoolean',fld:'vPASSWORDVERIFICADOBOOLEAN',pic:''},{av:'AV7PasswordVerificadoContexto',fld:'vPASSWORDVERIFICADOCONTEXTO',pic:'',hsh:true},{av:'AV5PasswordContexto',fld:'vPASSWORDCONTEXTO',pic:'',hsh:true}]");
      setEventMetadata("VPASSWORDVERIFICADOBOOLEAN.CONTROLVALUECHANGED",",oparms:[{av:'divTablecontent_Visible',ctrl:'TABLECONTENT',prop:'Visible'},{av:'chkavPasswordverificadoboolean.getVisible()',ctrl:'vPASSWORDVERIFICADOBOOLEAN',prop:'Visible'},{av:'AV6PasswordVerificadoBoolean',fld:'vPASSWORDVERIFICADOBOOLEAN',pic:''}]}");
      setEventMetadata("VALIDV_PPRODUC","{handler:'validv_Pproduc',iparms:[{av:'hV85PProduc'},{av:'AV85PProduc',fld:'vPPRODUC',pic:''}]");
      setEventMetadata("VALIDV_PPRODUC",",oparms:[{av:'AV85PProduc',fld:'vPPRODUC',pic:''},{av:'hV85PProduc'}]}");
      setEventMetadata("VALIDV_UPRODUC","{handler:'validv_Uproduc',iparms:[{av:'hV115UProduc'},{av:'AV115UProduc',fld:'vUPRODUC',pic:''}]");
      setEventMetadata("VALIDV_UPRODUC",",oparms:[{av:'AV115UProduc',fld:'vUPRODUC',pic:''},{av:'hV115UProduc'}]}");
      setEventMetadata("VALIDV_PPROV","{handler:'validv_Pprov',iparms:[{av:'hV88PProv'},{av:'AV88PProv',fld:'vPPROV',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_PPROV",",oparms:[{av:'AV88PProv',fld:'vPPROV',pic:'ZZZZZ9'},{av:'hV88PProv'}]}");
      setEventMetadata("VALIDV_UPROV","{handler:'validv_Uprov',iparms:[{av:'hV117UProv'},{av:'AV117UProv',fld:'vUPROV',pic:'ZZZZZ9'}]");
      setEventMetadata("VALIDV_UPROV",",oparms:[{av:'AV117UProv',fld:'vUPROV',pic:'ZZZZZ9'},{av:'hV117UProv'}]}");
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
      Dvelop_confirmpanel_btnconforme_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13747PrdCDsc = "" ;
      A794PrvNom = "" ;
      hV85PProduc = "" ;
      hV115UProduc = "" ;
      hV88PProv = "" ;
      hV117UProv = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV8Texto = "" ;
      AV95Recfec = GXutil.nullDate() ;
      AV121UsurCod = "" ;
      AV103Station = "" ;
      AV7PasswordVerificadoContexto = "" ;
      AV5PasswordContexto = "" ;
      GXKey = "" ;
      AV34FecRec = GXutil.nullDate() ;
      AV27EmprCod = "" ;
      AV137Pgmname = "" ;
      AV99Siacumular = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      AV132volver = "" ;
      AV85PProduc = "" ;
      AV115UProduc = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV122ValAct = "" ;
      AV97Recfechr = GXutil.resetTime( GXutil.nullDate() );
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnconforme_Jsonclick = "" ;
      ucDvpanel_textos = new com.genexus.webpanels.GXUserControl();
      lblTexto1_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      ucGxuitabspanel_tabs = new com.genexus.webpanels.GXUserControl();
      lblTab01_title_Jsonclick = "" ;
      WebComp_Wcrecuentoinven_wc_Component = "" ;
      OldWcrecuentoinven_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13747PrdCDsc = "" ;
      H01M42_A13747PrdCDsc = new String[] {""} ;
      H01M43_A13747PrdCDsc = new String[] {""} ;
      l794PrvNom = "" ;
      H01M44_A794PrvNom = new String[] {""} ;
      H01M44_n794PrvNom = new boolean[] {false} ;
      H01M45_A794PrvNom = new String[] {""} ;
      H01M45_n794PrvNom = new boolean[] {false} ;
      H01M46_A13747PrdCDsc = new String[] {""} ;
      H01M46_A396EmprCod = new String[] {""} ;
      H01M46_A719PrdNum = new String[] {""} ;
      H01M47_A13747PrdCDsc = new String[] {""} ;
      H01M47_A396EmprCod = new String[] {""} ;
      H01M47_A719PrdNum = new String[] {""} ;
      H01M48_A794PrvNom = new String[] {""} ;
      H01M48_n794PrvNom = new boolean[] {false} ;
      H01M48_A396EmprCod = new String[] {""} ;
      H01M48_A795PrvNum = new int[1] ;
      H01M49_A794PrvNom = new String[] {""} ;
      H01M49_n794PrvNom = new boolean[] {false} ;
      H01M49_A396EmprCod = new String[] {""} ;
      H01M49_A795PrvNum = new int[1] ;
      H01M410_A13747PrdCDsc = new String[] {""} ;
      H01M410_A396EmprCod = new String[] {""} ;
      H01M410_A719PrdNum = new String[] {""} ;
      H01M411_A13747PrdCDsc = new String[] {""} ;
      H01M411_A396EmprCod = new String[] {""} ;
      H01M411_A719PrdNum = new String[] {""} ;
      H01M412_A794PrvNom = new String[] {""} ;
      H01M412_n794PrvNom = new boolean[] {false} ;
      H01M412_A396EmprCod = new String[] {""} ;
      H01M412_A795PrvNum = new int[1] ;
      H01M413_A794PrvNom = new String[] {""} ;
      H01M413_n794PrvNom = new boolean[] {false} ;
      H01M413_A396EmprCod = new String[] {""} ;
      H01M413_A795PrvNum = new int[1] ;
      AV29EmprNom = "" ;
      AV13ContDsc2 = "" ;
      AV126Version = "" ;
      AV109TextoVers = "" ;
      Gx_msg = "" ;
      AV9WebSession = httpContext.getWebSession();
      AV10Window = new com.genexus.webpanels.GXWindow();
      AV124VarAux0 = GXutil.resetTime( GXutil.nullDate() );
      AV48HhMm = "" ;
      AV50HhMmchar = "" ;
      AV113UProd2 = "" ;
      AV106Texto_i = "" ;
      AV93ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV11ActDatos = "" ;
      AV36File = "" ;
      AV104Tab_upq = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV104Tab_upq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      H01M414_A719PrdNum = new String[] {""} ;
      H01M414_A396EmprCod = new String[] {""} ;
      AV91Prdnum = "" ;
      AV23Dif = DecimalUtil.ZERO ;
      AV25Dif2 = DecimalUtil.ZERO ;
      AV76Obs = "" ;
      AV90Prdnom = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_char11 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_dtime14 = new java.util.Date[1] ;
      H01M415_A719PrdNum = new String[] {""} ;
      H01M415_A396EmprCod = new String[] {""} ;
      H01M415_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      A810RecFec = GXutil.nullDate() ;
      H01M416_A719PrdNum = new String[] {""} ;
      H01M416_A13416RecEstInv = new byte[1] ;
      H01M416_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01M416_A396EmprCod = new String[] {""} ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconforme = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      H01M417_A13747PrdCDsc = new String[] {""} ;
      H01M417_A396EmprCod = new String[] {""} ;
      H01M417_A719PrdNum = new String[] {""} ;
      ZV85PProduc = "" ;
      ZhV85PProduc = "" ;
      H01M418_A13747PrdCDsc = new String[] {""} ;
      H01M418_A396EmprCod = new String[] {""} ;
      H01M418_A719PrdNum = new String[] {""} ;
      ZV115UProduc = "" ;
      ZhV115UProduc = "" ;
      H01M419_A794PrvNom = new String[] {""} ;
      H01M419_n794PrvNom = new boolean[] {false} ;
      H01M419_A396EmprCod = new String[] {""} ;
      H01M419_A795PrvNum = new int[1] ;
      ZhV88PProv = "" ;
      H01M420_A794PrvNom = new String[] {""} ;
      H01M420_n794PrvNom = new boolean[] {false} ;
      H01M420_A396EmprCod = new String[] {""} ;
      H01M420_A795PrvNum = new int[1] ;
      ZhV117UProv = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recuentoinventario__default(),
         new Object[] {
             new Object[] {
            H01M42_A13747PrdCDsc
            }
            , new Object[] {
            H01M43_A13747PrdCDsc
            }
            , new Object[] {
            H01M44_A794PrvNom, H01M44_n794PrvNom
            }
            , new Object[] {
            H01M45_A794PrvNom, H01M45_n794PrvNom
            }
            , new Object[] {
            H01M46_A13747PrdCDsc, H01M46_A396EmprCod, H01M46_A719PrdNum
            }
            , new Object[] {
            H01M47_A13747PrdCDsc, H01M47_A396EmprCod, H01M47_A719PrdNum
            }
            , new Object[] {
            H01M48_A794PrvNom, H01M48_n794PrvNom, H01M48_A396EmprCod, H01M48_A795PrvNum
            }
            , new Object[] {
            H01M49_A794PrvNom, H01M49_n794PrvNom, H01M49_A396EmprCod, H01M49_A795PrvNum
            }
            , new Object[] {
            H01M410_A13747PrdCDsc, H01M410_A396EmprCod, H01M410_A719PrdNum
            }
            , new Object[] {
            H01M411_A13747PrdCDsc, H01M411_A396EmprCod, H01M411_A719PrdNum
            }
            , new Object[] {
            H01M412_A794PrvNom, H01M412_n794PrvNom, H01M412_A396EmprCod, H01M412_A795PrvNum
            }
            , new Object[] {
            H01M413_A794PrvNom, H01M413_n794PrvNom, H01M413_A396EmprCod, H01M413_A795PrvNum
            }
            , new Object[] {
            H01M414_A719PrdNum, H01M414_A396EmprCod
            }
            , new Object[] {
            H01M415_A719PrdNum, H01M415_A396EmprCod, H01M415_A810RecFec
            }
            , new Object[] {
            H01M416_A719PrdNum, H01M416_A13416RecEstInv, H01M416_A810RecFec, H01M416_A396EmprCod
            }
            , new Object[] {
            H01M417_A13747PrdCDsc, H01M417_A396EmprCod, H01M417_A719PrdNum
            }
            , new Object[] {
            H01M418_A13747PrdCDsc, H01M418_A396EmprCod, H01M418_A719PrdNum
            }
            , new Object[] {
            H01M419_A794PrvNom, H01M419_n794PrvNom, H01M419_A396EmprCod, H01M419_A795PrvNum
            }
            , new Object[] {
            H01M420_A794PrvNom, H01M420_n794PrvNom, H01M420_A396EmprCod, H01M420_A795PrvNum
            }
         }
      );
      AV137Pgmname = "RecuentoInventario" ;
      /* GeneXus formulas. */
      AV137Pgmname = "RecuentoInventario" ;
      Gx_err = (short)(0) ;
      edtavRecfechr_Enabled = 0 ;
      WebComp_Wcrecuentoinven_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV42FlagM ;
   private byte AV101SiAuditoria ;
   private byte AV57Informe ;
   private byte AV46FlagStk ;
   private byte nDonePA ;
   private byte AV21DelRec ;
   private byte AV30ExiCont ;
   private byte AV55Infec ;
   private byte AV111tintutex ;
   private byte AV19Cotexsur ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte A13416RecEstInv ;
   private byte nGXWrapped ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV80Order ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private int AV88PProv ;
   private int AV117UProv ;
   private int Gxuitabspanel_tabs_Pagecount ;
   private int divTablecontent_Visible ;
   private int edtavPproduc_Enabled ;
   private int edtavUproduc_Enabled ;
   private int edtavPprov_Enabled ;
   private int edtavUprov_Enabled ;
   private int edtavRecfechr_Enabled ;
   private int lblTexto1_Fontsize ;
   private int divTableresultado1_Height ;
   private int gxdynajaxindex ;
   private int A795PrvNum ;
   private int AV15ContrasenaValidar ;
   private int GXt_int7 ;
   private int AV119UProv2 ;
   private int GX_I ;
   private int AV52i ;
   private int GXv_int12[] ;
   private int GXv_int8[] ;
   private int idxLst ;
   private int ZV88PProv ;
   private int ZV117UProv ;
   private java.math.BigDecimal AV23Dif ;
   private java.math.BigDecimal AV25Dif2 ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String Dvelop_confirmpanel_btnconforme_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A794PrvNom ;
   private String hV88PProv ;
   private String hV117UProv ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV8Texto ;
   private String AV121UsurCod ;
   private String AV103Station ;
   private String GXKey ;
   private String AV27EmprCod ;
   private String AV137Pgmname ;
   private String AV99Siacumular ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String AV85PProduc ;
   private String AV115UProduc ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_textos_Width ;
   private String Dvpanel_textos_Cls ;
   private String Dvpanel_textos_Title ;
   private String Dvpanel_textos_Iconposition ;
   private String Gxuitabspanel_tabs_Class ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Dvelop_confirmpanel_btnconforme_Title ;
   private String Dvelop_confirmpanel_btnconforme_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconforme_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconforme_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconforme_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconforme_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconforme_Confirmtype ;
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
   private String TempTags ;
   private String AV122ValAct ;
   private String edtavPproduc_Internalname ;
   private String edtavPproduc_Jsonclick ;
   private String edtavUproduc_Internalname ;
   private String edtavUproduc_Jsonclick ;
   private String edtavPprov_Internalname ;
   private String edtavPprov_Jsonclick ;
   private String edtavUprov_Internalname ;
   private String edtavUprov_Jsonclick ;
   private String edtavRecfechr_Internalname ;
   private String edtavRecfechr_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconforme_Internalname ;
   private String bttBtnconforme_Jsonclick ;
   private String Dvpanel_textos_Internalname ;
   private String divTextos_Internalname ;
   private String lblTexto1_Internalname ;
   private String lblTexto1_Caption ;
   private String lblTexto1_Jsonclick ;
   private String Progressbar_Internalname ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String Gxuitabspanel_tabs_Internalname ;
   private String lblTab01_title_Internalname ;
   private String lblTab01_title_Jsonclick ;
   private String divTableresultado1_Internalname ;
   private String WebComp_Wcrecuentoinven_wc_Component ;
   private String OldWcrecuentoinven_wc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String l794PrvNom ;
   private String AV29EmprNom ;
   private String AV13ContDsc2 ;
   private String AV126Version ;
   private String AV109TextoVers ;
   private String Gx_msg ;
   private String AV48HhMm ;
   private String AV50HhMmchar ;
   private String AV113UProd2 ;
   private String AV11ActDatos ;
   private String AV104Tab_upq[] ;
   private String AV91Prdnum ;
   private String AV76Obs ;
   private String AV90Prdnom ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconforme_Internalname ;
   private String Dvelop_confirmpanel_btnconforme_Internalname ;
   private String ZV85PProduc ;
   private String ZV115UProduc ;
   private String ZhV88PProv ;
   private String ZhV117UProv ;
   private java.util.Date AV97Recfechr ;
   private java.util.Date AV124VarAux0 ;
   private java.util.Date GXv_dtime14[] ;
   private java.util.Date AV95Recfec ;
   private java.util.Date AV34FecRec ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date A810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n794PrvNom ;
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
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_textos_Autowidth ;
   private boolean Dvpanel_textos_Autoheight ;
   private boolean Dvpanel_textos_Collapsible ;
   private boolean Dvpanel_textos_Collapsed ;
   private boolean Dvpanel_textos_Showcollapseicon ;
   private boolean Dvpanel_textos_Autoscroll ;
   private boolean Gxuitabspanel_tabs_Historymanagement ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV6PasswordVerificadoBoolean ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcrecuentoinven_wc ;
   private String AV106Texto_i ;
   private String A13747PrdCDsc ;
   private String hV85PProduc ;
   private String hV115UProduc ;
   private String AV7PasswordVerificadoContexto ;
   private String AV5PasswordContexto ;
   private String AV132volver ;
   private String l13747PrdCDsc ;
   private String AV36File ;
   private String ZhV85PProduc ;
   private String ZhV115UProduc ;
   private com.genexus.webpanels.GXWindow AV10Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcrecuentoinven_wc ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_textos ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconforme ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV93ProgressIndicator ;
   private ICheckbox chkavValact ;
   private HTMLChoice cmbavFlagstk ;
   private HTMLChoice cmbavOrder ;
   private ICheckbox chkavPasswordverificadoboolean ;
   private IDataStoreProvider pr_default ;
   private String[] H01M42_A13747PrdCDsc ;
   private String[] H01M43_A13747PrdCDsc ;
   private String[] H01M44_A794PrvNom ;
   private boolean[] H01M44_n794PrvNom ;
   private String[] H01M45_A794PrvNom ;
   private boolean[] H01M45_n794PrvNom ;
   private String[] H01M46_A13747PrdCDsc ;
   private String[] H01M46_A396EmprCod ;
   private String[] H01M46_A719PrdNum ;
   private String[] H01M47_A13747PrdCDsc ;
   private String[] H01M47_A396EmprCod ;
   private String[] H01M47_A719PrdNum ;
   private String[] H01M48_A794PrvNom ;
   private boolean[] H01M48_n794PrvNom ;
   private String[] H01M48_A396EmprCod ;
   private int[] H01M48_A795PrvNum ;
   private String[] H01M49_A794PrvNom ;
   private boolean[] H01M49_n794PrvNom ;
   private String[] H01M49_A396EmprCod ;
   private int[] H01M49_A795PrvNum ;
   private String[] H01M410_A13747PrdCDsc ;
   private String[] H01M410_A396EmprCod ;
   private String[] H01M410_A719PrdNum ;
   private String[] H01M411_A13747PrdCDsc ;
   private String[] H01M411_A396EmprCod ;
   private String[] H01M411_A719PrdNum ;
   private String[] H01M412_A794PrvNom ;
   private boolean[] H01M412_n794PrvNom ;
   private String[] H01M412_A396EmprCod ;
   private int[] H01M412_A795PrvNum ;
   private String[] H01M413_A794PrvNom ;
   private boolean[] H01M413_n794PrvNom ;
   private String[] H01M413_A396EmprCod ;
   private int[] H01M413_A795PrvNum ;
   private String[] H01M414_A719PrdNum ;
   private String[] H01M414_A396EmprCod ;
   private String[] H01M415_A719PrdNum ;
   private String[] H01M415_A396EmprCod ;
   private java.util.Date[] H01M415_A810RecFec ;
   private String[] H01M416_A719PrdNum ;
   private byte[] H01M416_A13416RecEstInv ;
   private java.util.Date[] H01M416_A810RecFec ;
   private String[] H01M416_A396EmprCod ;
   private String[] H01M417_A13747PrdCDsc ;
   private String[] H01M417_A396EmprCod ;
   private String[] H01M417_A719PrdNum ;
   private String[] H01M418_A13747PrdCDsc ;
   private String[] H01M418_A396EmprCod ;
   private String[] H01M418_A719PrdNum ;
   private String[] H01M419_A794PrvNom ;
   private boolean[] H01M419_n794PrvNom ;
   private String[] H01M419_A396EmprCod ;
   private int[] H01M419_A795PrvNum ;
   private String[] H01M420_A794PrvNom ;
   private boolean[] H01M420_n794PrvNom ;
   private String[] H01M420_A396EmprCod ;
   private int[] H01M420_A795PrvNum ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV9WebSession ;
}

final  class recuentoinventario__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01M42", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M43", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc FROM TXPPRODUC WHERE UPPER(RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom))) like '%' || UPPER(?) ORDER BY PrdCDsc) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M44", "SELECT * FROM (SELECT DISTINCT PrvNom FROM TXPPRVGEN WHERE UPPER(PrvNom) like '%' || UPPER(?) ORDER BY PrvNom) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M45", "SELECT * FROM (SELECT DISTINCT PrvNom FROM TXPPRVGEN WHERE UPPER(PrvNom) like '%' || UPPER(?) ORDER BY PrvNom) WHERE rownum <= 50 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M46", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M47", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M48", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M49", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M410", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M411", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M412", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M413", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M414", "SELECT PrdNum, EmprCod FROM TXPPRODUC WHERE (EmprCod = ? and PrdNum >= ?) AND (LENGTH(RTRIM(RTRIM(LTRIM(PrdNum)))) >= 5) AND (PrdNum <= ?) ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M415", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFec FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01M416", "SELECT PrdNum, RecEstInv, RecFec, EmprCod FROM TXPRECUEN WHERE (EmprCod = ? and RecFec = ?) AND (RecEstInv = 1) ORDER BY EmprCod, RecFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M417", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M418", "SELECT RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, EmprCod, PrdNum FROM TXPPRODUC WHERE RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M419", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M420", "SELECT PrvNom, EmprCod, PrvNum FROM TXPPRVGEN WHERE PrvNom = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
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
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 30);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 60);
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               return;
      }
   }

}

