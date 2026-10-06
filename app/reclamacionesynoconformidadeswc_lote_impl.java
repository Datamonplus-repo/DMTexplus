package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class reclamacionesynoconformidadeswc_lote_impl extends GXWebComponent
{
   public reclamacionesynoconformidadeswc_lote_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public reclamacionesynoconformidadeswc_lote_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( reclamacionesynoconformidadeswc_lote_impl.class ));
   }

   public reclamacionesynoconformidadeswc_lote_impl( int remoteHandle ,
                                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
               AV41Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Clicod_to), 6, 0));
               AV7HisReoFec = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
               AV42HisReoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HisReoFec_to", localUtil.format(AV42HisReoFec_to, "99/99/99"));
               AV8HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisEstReo", GXutil.str( AV8HisEstReo, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6Clicod),Integer.valueOf(AV41Clicod_to),AV7HisReoFec,AV42HisReoFec_to,Byte.valueOf(AV8HisEstReo)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
               return  ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV39ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV34ColumnsSelector);
      AV61Pgmname = httpContext.GetPar( "Pgmname") ;
      AV16FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV41Clicod_to = (int)(GXutil.lval( httpContext.GetPar( "Clicod_to"))) ;
      AV7HisReoFec = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec")) ;
      AV42HisReoFec_to = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec_to")) ;
      AV8HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A13698HisreoLote = httpContext.GetPar( "HisreoLote") ;
      n13698HisreoLote = false ;
      A539HisBarCod = (int)(GXutil.lval( httpContext.GetPar( "HisBarCod"))) ;
      A545HisCodReo = (byte)(GXutil.lval( httpContext.GetPar( "HisCodReo"))) ;
      A544HisCodPar = httpContext.GetPar( "HisCodPar") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      A569HisReoFec = localUtil.parseDateParm( httpContext.GetPar( "HisReoFec")) ;
      n569HisReoFec = false ;
      A548HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      n548HisEstReo = false ;
      AV49TotKilosLote = CommonUtil.decimalVal( httpContext.GetPar( "TotKilosLote"), ".") ;
      A540HisBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "HisBarKgm"), ".") ;
      n540HisBarKgm = false ;
      AV51TotValcostelote = CommonUtil.decimalVal( httpContext.GetPar( "TotValcostelote"), ".") ;
      A13699CostCausa = CommonUtil.decimalVal( httpContext.GetPar( "CostCausa"), ".") ;
      n13699CostCausa = false ;
      AV47lastHisBarcod = (int)(GXutil.lval( httpContext.GetPar( "lastHisBarcod"))) ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A542HisBarSer = httpContext.GetPar( "HisBarSer") ;
      n542HisBarSer = false ;
      A2299HisReoDsc = httpContext.GetPar( "HisReoDsc") ;
      n2299HisReoDsc = false ;
      A546HisColNom = httpContext.GetPar( "HisColNom") ;
      n546HisColNom = false ;
      A8889HisNomCli = httpContext.GetPar( "HisNomCli") ;
      n8889HisNomCli = false ;
      A12950HisOpeTur = (byte)(GXutil.lval( httpContext.GetPar( "HisOpeTur"))) ;
      n12950HisOpeTur = false ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      n602MaqCod = false ;
      A12949HisOpecod = (int)(GXutil.lval( httpContext.GetPar( "HisOpecod"))) ;
      n12949HisOpecod = false ;
      A834TipDefDsc = httpContext.GetPar( "TipDefDsc") ;
      n834TipDefDsc = false ;
      A5086DscCausa = httpContext.GetPar( "DscCausa") ;
      n5086DscCausa = false ;
      A7001Rps_Dsc = httpContext.GetPar( "Rps_Dsc") ;
      n7001Rps_Dsc = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa15M2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Reclamacionesy No Conformidades por Lote", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.reclamacionesynoconformidadeswc_lote", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV7HisReoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV42HisReoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8HisEstReo,1,0))}, new String[] {"Emprcod","Clicod","Clicod_to","HisReoFec","HisReoFec_to","HisEstReo"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSLOTE", getSecureSignedToken( sPrefix, localUtil.format( AV49TotKilosLote, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALCOSTELOTE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTHISBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47lastHisBarcod), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV34ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV34ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Clicod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41Clicod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV41Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7HisReoFec", localUtil.dtoc( wcpOAV7HisReoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42HisReoFec_to", localUtil.dtoc( wcpOAV42HisReoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV8HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV39ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV61Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV41Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISREOFEC_TO", localUtil.dtoc( AV42HisReoFec_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV8HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISREOLOTE", GXutil.rtrim( A13698HisreoLote));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISBARCOD", GXutil.ltrim( localUtil.ntoc( A539HisBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISCODREO", GXutil.ltrim( localUtil.ntoc( A545HisCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISCODPAR", GXutil.rtrim( A544HisCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISREOFEC", localUtil.dtoc( A569HisReoFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISESTREO", GXutil.ltrim( localUtil.ntoc( A548HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSLOTE", GXutil.ltrim( localUtil.ntoc( AV49TotKilosLote, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSLOTE", getSecureSignedToken( sPrefix, localUtil.format( AV49TotKilosLote, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISBARKGM", GXutil.ltrim( localUtil.ntoc( A540HisBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTVALCOSTELOTE", GXutil.ltrim( localUtil.ntoc( AV51TotValcostelote, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALCOSTELOTE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"COSTCAUSA", GXutil.ltrim( localUtil.ntoc( A13699CostCausa, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLASTHISBARCOD", GXutil.ltrim( localUtil.ntoc( AV47lastHisBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTHISBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47lastHisBarcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISBARSER", GXutil.rtrim( A542HisBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISREODSC", GXutil.rtrim( A2299HisReoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISCOLNOM", GXutil.rtrim( A546HisColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISNOMCLI", GXutil.rtrim( A8889HisNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISOPETUR", GXutil.ltrim( localUtil.ntoc( A12950HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISOPECOD", GXutil.ltrim( localUtil.ntoc( A12949HisOpecod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"TIPDEFDSC", GXutil.rtrim( A834TipDefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DSCCAUSA", GXutil.rtrim( A5086DscCausa));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RPS_DSC", GXutil.rtrim( A7001Rps_Dsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm15M2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
         httpContext.SendComponentObjects();
         httpContext.SendServerCommands();
         httpContext.SendState();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "</form>") ;
         }
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         include_jscripts( ) ;
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "ReclamacionesyNoConformidadesWC_lote" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Reclamacionesy No Conformidades por Lote", "") ;
   }

   public void wb15M0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.reclamacionesynoconformidadeswc_lote");
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
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportexcel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnexportexcel_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTEXCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_15M2( true) ;
      }
      else
      {
         wb_table1_23_15M2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_15M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_60_15M2( true) ;
      }
      else
      {
         wb_table2_60_15M2( false) ;
      }
      return  ;
   }

   public void wb_table2_60_15M2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV34ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start15M2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Reclamacionesy No Conformidades por Lote", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup15M0( ) ;
         }
      }
   }

   public void ws15M2( )
   {
      start15M2( ) ;
      evt15M2( ) ;
   }

   public void evt15M2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1115M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1215M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTEXCEL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportExcel' */
                                 e1315M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1415M2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup15M0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV17CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV17CliNom);
                           AV18BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV18BarNHdr);
                           AV19KilosLote = localUtil.ctond( httpContext.cgiGet( edtavKiloslote_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKiloslote_Internalname, GXutil.ltrimstr( AV19KilosLote, 9, 2));
                           AV20Valcostelote = localUtil.ctond( httpContext.cgiGet( edtavValcostelote_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValcostelote_Internalname, GXutil.ltrimstr( AV20Valcostelote, 11, 3));
                           AV21HisreoLote = httpContext.cgiGet( edtavHisreolote_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreolote_Internalname, AV21HisreoLote);
                           AV22HisBarSer = httpContext.cgiGet( edtavHisbarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisbarser_Internalname, AV22HisBarSer);
                           AV23HisReoDsc = httpContext.cgiGet( edtavHisreodsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreodsc_Internalname, AV23HisReoDsc);
                           AV24HisColNom = httpContext.cgiGet( edtavHiscolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHiscolnom_Internalname, AV24HisColNom);
                           AV25HisNomCli = httpContext.cgiGet( edtavHisnomcli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisnomcli_Internalname, AV25HisNomCli);
                           AV26MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV26MaqCod);
                           if ( GXutil.len( sPrefix) == 0 )
                           {
                              AV7HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavHisreofec_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
                           }
                           AV27HisOpeTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHisopetur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisopetur_Internalname, GXutil.str( AV27HisOpeTur, 1, 0));
                           AV28TipDefDsc = httpContext.cgiGet( edtavTipdefdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV28TipDefDsc);
                           AV29DscCausa = httpContext.cgiGet( edtavDsccausa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDsccausa_Internalname, AV29DscCausa);
                           AV30Rps_Dsc = httpContext.cgiGet( edtavRps_dsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRps_dsc_Internalname, AV30Rps_Dsc);
                           AV31Hdrs = httpContext.cgiGet( edtavHdrs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1515M2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1615M2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1715M2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup15M0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we15M2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm15M2( ) ;
         }
      }
   }

   public void pa15M2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV39ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ,
                                 String AV61Pgmname ,
                                 String AV16FilterFullText ,
                                 String AV5Emprcod ,
                                 int AV6Clicod ,
                                 int AV41Clicod_to ,
                                 java.util.Date AV7HisReoFec ,
                                 java.util.Date AV42HisReoFec_to ,
                                 byte AV8HisEstReo ,
                                 String A396EmprCod ,
                                 String A13698HisreoLote ,
                                 int A539HisBarCod ,
                                 byte A545HisCodReo ,
                                 String A544HisCodPar ,
                                 int A252CliCod ,
                                 java.util.Date A569HisReoFec ,
                                 byte A548HisEstReo ,
                                 java.math.BigDecimal AV49TotKilosLote ,
                                 java.math.BigDecimal A540HisBarKgm ,
                                 java.math.BigDecimal AV51TotValcostelote ,
                                 java.math.BigDecimal A13699CostCausa ,
                                 int AV47lastHisBarcod ,
                                 String A279CliNom ,
                                 String A542HisBarSer ,
                                 String A2299HisReoDsc ,
                                 String A546HisColNom ,
                                 String A8889HisNomCli ,
                                 byte A12950HisOpeTur ,
                                 String A602MaqCod ,
                                 int A12949HisOpecod ,
                                 String A834TipDefDsc ,
                                 String A5086DscCausa ,
                                 String A7001Rps_Dsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1615M2 ();
      GRID_nCurrentRecord = 0 ;
      rf15M2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_41_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf15M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV61Pgmname = "ReclamacionesyNoConformidadesWC_lote" ;
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavKiloslote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKiloslote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKiloslote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavValcostelote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValcostelote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcostelote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreolote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreolote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreolote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisbarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisbarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisbarser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHiscolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHiscolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHiscolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreofec_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisopetur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisopetur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisopetur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDsccausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDsccausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDsccausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavRps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_dsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluekiloslote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekiloslote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekiloslote_Enabled), 5, 0), true);
      edtavTotvaluevalcostelote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluevalcostelote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevalcostelote_Enabled), 5, 0), true);
   }

   public void rf15M2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e1615M2 ();
      nGXsfl_41_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_412( ) ;
         e1715M2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_41_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1715M2 ();
         }
         wbEnd = (short)(41) ;
         wb15M0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes15M2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV61Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKILOSLOTE", GXutil.ltrim( localUtil.ntoc( AV49TotKilosLote, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSLOTE", getSecureSignedToken( sPrefix, localUtil.format( AV49TotKilosLote, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTVALCOSTELOTE", GXutil.ltrim( localUtil.ntoc( AV51TotValcostelote, (byte)(18), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALCOSTELOTE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLASTHISBARCOD", GXutil.ltrim( localUtil.ntoc( AV47lastHisBarcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTHISBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47lastHisBarcod), "ZZZZZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39ManageFiltersExecutionStep, AV34ColumnsSelector, AV61Pgmname, AV16FilterFullText, AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, A396EmprCod, A13698HisreoLote, A539HisBarCod, A545HisCodReo, A544HisCodPar, A252CliCod, A569HisReoFec, A548HisEstReo, AV49TotKilosLote, A540HisBarKgm, AV51TotValcostelote, A13699CostCausa, AV47lastHisBarcod, A279CliNom, A542HisBarSer, A2299HisReoDsc, A546HisColNom, A8889HisNomCli, A12950HisOpeTur, A602MaqCod, A12949HisOpecod, A834TipDefDsc, A5086DscCausa, A7001Rps_Dsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV61Pgmname = "ReclamacionesyNoConformidadesWC_lote" ;
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavKiloslote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKiloslote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKiloslote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavValcostelote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValcostelote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcostelote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreolote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreolote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreolote_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisbarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisbarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisbarser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreodsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreodsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreodsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHiscolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHiscolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHiscolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreofec_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisopetur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisopetur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisopetur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTipdefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavDsccausa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDsccausa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDsccausa_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavRps_dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRps_dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_dsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdrs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrs_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavTotvaluekiloslote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekiloslote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekiloslote_Enabled), 5, 0), true);
      edtavTotvaluevalcostelote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluevalcostelote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluevalcostelote_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup15M0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1515M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV37ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV40DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV34ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV41Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7HisReoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7HisReoFec"), 0) ;
         wcpOAV42HisReoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42HisReoFec_to"), 0) ;
         wcpOAV8HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV16FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         AV50TotValueKilosLote = httpContext.cgiGet( edtavTotvaluekiloslote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValueKilosLote", AV50TotValueKilosLote);
         AV52TotValueValcostelote = httpContext.cgiGet( edtavTotvaluevalcostelote_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueValcostelote", AV52TotValueValcostelote);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1515M2 ();
      if (returnInSub) return;
   }

   public void e1515M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      reclamacionesynoconformidadeswc_lote_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV58Emprnom ;
      GXv_char4[0] = AV59Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      reclamacionesynoconformidadeswc_lote_impl.this.AV5Emprcod = GXv_char2[0] ;
      reclamacionesynoconformidadeswc_lote_impl.this.AV58Emprnom = GXv_char3[0] ;
      reclamacionesynoconformidadeswc_lote_impl.this.AV59Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV40DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV40DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e1615M2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV10WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV39ManageFiltersExecutionStep == 1 )
      {
         AV39ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ManageFiltersExecutionStep", GXutil.str( AV39ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV39ManageFiltersExecutionStep == 2 )
      {
         AV39ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ManageFiltersExecutionStep", GXutil.str( AV39ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV36Session.getValue("ReclamacionesyNoConformidadesWC_loteColumnsSelector"), "") != 0 )
      {
         AV32ColumnsSelectorXML = AV36Session.getValue("ReclamacionesyNoConformidadesWC_loteColumnsSelector") ;
         AV34ColumnsSelector.fromxml(AV32ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavBarnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavKiloslote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKiloslote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKiloslote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavValcostelote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValcostelote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValcostelote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreolote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreolote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreolote_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisbarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisbarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisbarser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreodsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreodsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreodsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHiscolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHiscolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHiscolnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisnomcli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavMaqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisreofec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisreofec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisreofec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHisopetur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisopetur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisopetur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavTipdefdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTipdefdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipdefdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavDsccausa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDsccausa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDsccausa_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavRps_dsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRps_dsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRps_dsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavHdrs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV34ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdrs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdrs_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34ColumnsSelector", AV34ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   private void e1715M2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV45LastLote = "" ;
      AV46LastHdr = "" ;
      AV19KilosLote = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKiloslote_Internalname, GXutil.ltrimstr( AV19KilosLote, 9, 2));
      AV20Valcostelote = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValcostelote_Internalname, GXutil.ltrimstr( AV20Valcostelote, 11, 3));
      AV31Hdrs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
      /* Using cursor H015M2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), Integer.valueOf(AV41Clicod_to), AV7HisReoFec, AV42HisReoFec_to, Byte.valueOf(AV8HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A833TipDefCod = H015M2_A833TipDefCod[0] ;
         A5085CodCausa = H015M2_A5085CodCausa[0] ;
         n5085CodCausa = H015M2_n5085CodCausa[0] ;
         A7000Rps_Cod = H015M2_A7000Rps_Cod[0] ;
         n7000Rps_Cod = H015M2_n7000Rps_Cod[0] ;
         A396EmprCod = H015M2_A396EmprCod[0] ;
         A548HisEstReo = H015M2_A548HisEstReo[0] ;
         n548HisEstReo = H015M2_n548HisEstReo[0] ;
         A569HisReoFec = H015M2_A569HisReoFec[0] ;
         n569HisReoFec = H015M2_n569HisReoFec[0] ;
         A252CliCod = H015M2_A252CliCod[0] ;
         n252CliCod = H015M2_n252CliCod[0] ;
         A279CliNom = H015M2_A279CliNom[0] ;
         A540HisBarKgm = H015M2_A540HisBarKgm[0] ;
         n540HisBarKgm = H015M2_n540HisBarKgm[0] ;
         A13699CostCausa = H015M2_A13699CostCausa[0] ;
         n13699CostCausa = H015M2_n13699CostCausa[0] ;
         A542HisBarSer = H015M2_A542HisBarSer[0] ;
         n542HisBarSer = H015M2_n542HisBarSer[0] ;
         A2299HisReoDsc = H015M2_A2299HisReoDsc[0] ;
         n2299HisReoDsc = H015M2_n2299HisReoDsc[0] ;
         A546HisColNom = H015M2_A546HisColNom[0] ;
         n546HisColNom = H015M2_n546HisColNom[0] ;
         A8889HisNomCli = H015M2_A8889HisNomCli[0] ;
         n8889HisNomCli = H015M2_n8889HisNomCli[0] ;
         A12950HisOpeTur = H015M2_A12950HisOpeTur[0] ;
         n12950HisOpeTur = H015M2_n12950HisOpeTur[0] ;
         A602MaqCod = H015M2_A602MaqCod[0] ;
         n602MaqCod = H015M2_n602MaqCod[0] ;
         A12949HisOpecod = H015M2_A12949HisOpecod[0] ;
         n12949HisOpecod = H015M2_n12949HisOpecod[0] ;
         A834TipDefDsc = H015M2_A834TipDefDsc[0] ;
         n834TipDefDsc = H015M2_n834TipDefDsc[0] ;
         A5086DscCausa = H015M2_A5086DscCausa[0] ;
         n5086DscCausa = H015M2_n5086DscCausa[0] ;
         A7001Rps_Dsc = H015M2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H015M2_n7001Rps_Dsc[0] ;
         A544HisCodPar = H015M2_A544HisCodPar[0] ;
         A545HisCodReo = H015M2_A545HisCodReo[0] ;
         A539HisBarCod = H015M2_A539HisBarCod[0] ;
         A13698HisreoLote = H015M2_A13698HisreoLote[0] ;
         n13698HisreoLote = H015M2_n13698HisreoLote[0] ;
         A834TipDefDsc = H015M2_A834TipDefDsc[0] ;
         n834TipDefDsc = H015M2_n834TipDefDsc[0] ;
         A13699CostCausa = H015M2_A13699CostCausa[0] ;
         n13699CostCausa = H015M2_n13699CostCausa[0] ;
         A5086DscCausa = H015M2_A5086DscCausa[0] ;
         n5086DscCausa = H015M2_n5086DscCausa[0] ;
         A7001Rps_Dsc = H015M2_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = H015M2_n7001Rps_Dsc[0] ;
         A279CliNom = H015M2_A279CliNom[0] ;
         if ( ( GXutil.strcmp(A13698HisreoLote, AV45LastLote) == 0 ) && ( GXutil.strcmp(AV45LastLote, " ") != 0 ) )
         {
            if ( AV47lastHisBarcod == A539HisBarCod )
            {
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(41) ;
               }
               if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
               {
                  sendrow_412( ) ;
                  GRID_nEOF = (byte)(1) ;
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
                  {
                     GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
                  }
               }
               if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
               {
                  GRID_nEOF = (byte)(0) ;
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
               {
                  httpContext.doAjaxLoad(41, GridRow);
               }
               AV19KilosLote = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKiloslote_Internalname, GXutil.ltrimstr( AV19KilosLote, 9, 2));
               AV20Valcostelote = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValcostelote_Internalname, GXutil.ltrimstr( AV20Valcostelote, 11, 3));
               AV31Hdrs = "" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
            }
         }
         else
         {
            if ( GXutil.strcmp(AV45LastLote, " ") != 0 )
            {
               /* Load Method */
               if ( wbStart != -1 )
               {
                  wbStart = (short)(41) ;
               }
               if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
               {
                  sendrow_412( ) ;
                  GRID_nEOF = (byte)(1) ;
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                  if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
                  {
                     GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
                  }
               }
               if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
               {
                  GRID_nEOF = (byte)(0) ;
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
               }
               GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
               if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
               {
                  httpContext.doAjaxLoad(41, GridRow);
               }
               AV19KilosLote = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKiloslote_Internalname, GXutil.ltrimstr( AV19KilosLote, 9, 2));
               AV20Valcostelote = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValcostelote_Internalname, GXutil.ltrimstr( AV20Valcostelote, 11, 3));
               AV31Hdrs = "" ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
            }
         }
         AV18BarNHdr = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarnhdr_Internalname, AV18BarNHdr);
         AV17CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV17CliNom);
         AV21HisreoLote = A13698HisreoLote ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreolote_Internalname, AV21HisreoLote);
         if ( GXutil.strcmp(AV31Hdrs, "") == 0 )
         {
            AV31Hdrs = GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
         }
         else
         {
            AV31Hdrs += "/" + GXutil.str( A539HisBarCod, 8, 0) + "-" + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdrs_Internalname, AV31Hdrs);
         }
         AV19KilosLote = AV19KilosLote.add(A540HisBarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKiloslote_Internalname, GXutil.ltrimstr( AV19KilosLote, 9, 2));
         AV20Valcostelote = AV20Valcostelote.add((GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValcostelote_Internalname, GXutil.ltrimstr( AV20Valcostelote, 11, 3));
         AV22HisBarSer = A542HisBarSer ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisbarser_Internalname, AV22HisBarSer);
         AV23HisReoDsc = A2299HisReoDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreodsc_Internalname, AV23HisReoDsc);
         AV24HisColNom = A546HisColNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHiscolnom_Internalname, AV24HisColNom);
         AV25HisNomCli = A8889HisNomCli ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisnomcli_Internalname, AV25HisNomCli);
         AV27HisOpeTur = A12950HisOpeTur ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisopetur_Internalname, GXutil.str( AV27HisOpeTur, 1, 0));
         AV26MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV26MaqCod);
         AV7HisReoFec = A569HisReoFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
         AV48HisOpecod = A12949HisOpecod ;
         AV28TipDefDsc = A834TipDefDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTipdefdsc_Internalname, AV28TipDefDsc);
         AV29DscCausa = A5086DscCausa ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDsccausa_Internalname, AV29DscCausa);
         AV30Rps_Dsc = A7001Rps_Dsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRps_dsc_Internalname, AV30Rps_Dsc);
         AV45LastLote = A13698HisreoLote ;
         AV46LastHdr = GXutil.str( A539HisBarCod, 8, 0) + GXutil.str( A545HisCodReo, 1, 0) + A544HisCodPar ;
         AV47lastHisBarcod = A539HisBarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47lastHisBarcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47lastHisBarcod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLASTHISBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47lastHisBarcod), "ZZZZZZZ9")));
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         sendrow_412( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1215M2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV32ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV34ColumnsSelector.fromJSonString(AV32ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWC_loteColumnsSelector", ((GXutil.strcmp("", AV32ColumnsSelectorXML)==0) ? "" : AV34ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34ColumnsSelector", AV34ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
   }

   public void e1115M2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ReclamacionesyNoConformidadesWC_loteFilters")),GXutil.URLEncode(GXutil.rtrim(AV61Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV39ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ManageFiltersExecutionStep", GXutil.str( AV39ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ReclamacionesyNoConformidadesWC_loteFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV39ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39ManageFiltersExecutionStep", GXutil.str( AV39ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV38ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWC_loteFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         reclamacionesynoconformidadeswc_lote_impl.this.GXt_char1 = GXv_char4[0] ;
         AV38ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV38ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV61Pgmname+"GridState", AV38ManageFiltersXml) ;
            AV14GridState.fromxml(AV38ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV14GridState", AV14GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34ColumnsSelector", AV34ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
   }

   public void e1315M2( )
   {
      /* 'DoExportExcel' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV53ExcelFilename ;
      GXv_char3[0] = AV54ExcelErrorMessage ;
      new app.reclamacionesynoconformidadeswc_loteexport(remoteHandle, context).execute( AV5Emprcod, AV6Clicod, AV41Clicod_to, AV7HisReoFec, AV42HisReoFec_to, AV8HisEstReo, GXv_char4, GXv_char3) ;
      reclamacionesynoconformidadeswc_lote_impl.this.AV53ExcelFilename = GXv_char4[0] ;
      reclamacionesynoconformidadeswc_lote_impl.this.AV54ExcelErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV53ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV53ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV54ExcelErrorMessage);
      }
   }

   public void e1415M2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.reclamacionesynoconformidadeswc_loteexportcsv", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Clicod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Clicod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV7HisReoFec)),GXutil.URLEncode(GXutil.formatDateParm(AV42HisReoFec_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8HisEstReo,1,0))}, new String[] {"Emprcod","Clicod","Clicod_to","HisReoFec","HisReoFec_to","HisEstReo"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV34ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&CliNom", "", "Cliente", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&BarNHdr", "", "N OS", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&KilosLote", "", "Quilos", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Valcostelote", "", "Custo", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisreoLote", "", "Lote", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisBarSer", "", "Artigo", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisReoDsc", "", "Descriçao", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisColNom", "", "Cor", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisNomCli", "", "Cor Cliente", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&MaqCod", "", "Maquina", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisReoFec", "", "Data", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&HisOpeTur", "", "Turno", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&TipDefDsc", "", "Defeito", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&DscCausa", "", "Causa", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Rps_Dsc", "", "Responsabilidade", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV34ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Hdrs", "", "Os(s)", true, "") ;
      AV34ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV33UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWC_loteColumnsSelector", GXv_char4) ;
      reclamacionesynoconformidadeswc_lote_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV33UserCustomValue)==0) ) )
      {
         AV35ColumnsSelectorAux.fromxml(AV33UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV35ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV34ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV35ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV34ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV37ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ReclamacionesyNoConformidadesWC_loteFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV37ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV16FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue(AV61Pgmname+"GridState"), "") == 0 )
      {
         AV14GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV61Pgmname+"GridState"), null, null);
      }
      else
      {
         AV14GridState.fromxml(AV36Session.getValue(AV61Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV15GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV14GridState.fromxml(AV36Session.getValue(AV61Pgmname+"GridState"), null, null);
      AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV14GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV16FilterFullText)==0), (short)(0), AV16FilterFullText, "") ;
      AV14GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Clicod) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Clicod, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV41Clicod_to) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD_TO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41Clicod_to, 6, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7HisReoFec)) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISREOFEC" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV7HisReoFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV42HisReoFec_to)) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISREOFEC_TO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV42HisReoFec_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      if ( ! (0==AV8HisEstReo) )
      {
         AV15GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV15GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8HisEstReo, 1, 0) );
         AV14GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV15GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV61Pgmname+"GridState", AV14GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV49TotKilosLote = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotKilosLote", GXutil.ltrimstr( AV49TotKilosLote, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSLOTE", getSecureSignedToken( sPrefix, localUtil.format( AV49TotKilosLote, "ZZZZZ9.99")));
      AV51TotValcostelote = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotValcostelote", GXutil.ltrimstr( AV51TotValcostelote, 18, 3));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALCOSTELOTE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      /* Using cursor H015M3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Clicod), Integer.valueOf(AV41Clicod_to), AV7HisReoFec, AV42HisReoFec_to, Byte.valueOf(AV8HisEstReo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A5085CodCausa = H015M3_A5085CodCausa[0] ;
         n5085CodCausa = H015M3_n5085CodCausa[0] ;
         A396EmprCod = H015M3_A396EmprCod[0] ;
         A548HisEstReo = H015M3_A548HisEstReo[0] ;
         n548HisEstReo = H015M3_n548HisEstReo[0] ;
         A569HisReoFec = H015M3_A569HisReoFec[0] ;
         n569HisReoFec = H015M3_n569HisReoFec[0] ;
         A252CliCod = H015M3_A252CliCod[0] ;
         n252CliCod = H015M3_n252CliCod[0] ;
         A540HisBarKgm = H015M3_A540HisBarKgm[0] ;
         n540HisBarKgm = H015M3_n540HisBarKgm[0] ;
         A13699CostCausa = H015M3_A13699CostCausa[0] ;
         n13699CostCausa = H015M3_n13699CostCausa[0] ;
         A544HisCodPar = H015M3_A544HisCodPar[0] ;
         A545HisCodReo = H015M3_A545HisCodReo[0] ;
         A539HisBarCod = H015M3_A539HisBarCod[0] ;
         A13698HisreoLote = H015M3_A13698HisreoLote[0] ;
         n13698HisreoLote = H015M3_n13698HisreoLote[0] ;
         A13699CostCausa = H015M3_A13699CostCausa[0] ;
         n13699CostCausa = H015M3_n13699CostCausa[0] ;
         AV49TotKilosLote = AV49TotKilosLote.add(A540HisBarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotKilosLote", GXutil.ltrimstr( AV49TotKilosLote, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKILOSLOTE", getSecureSignedToken( sPrefix, localUtil.format( AV49TotKilosLote, "ZZZZZ9.99")));
         AV51TotValcostelote = AV51TotValcostelote.add((GXutil.roundDecimal( A13699CostCausa.multiply(A540HisBarKgm), 2))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotValcostelote", GXutil.ltrimstr( AV51TotValcostelote, 18, 3));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTVALCOSTELOTE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999")));
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV50TotValueKilosLote = localUtil.format( AV49TotKilosLote, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValueKilosLote", AV50TotValueKilosLote);
      AV52TotValueValcostelote = localUtil.format( AV51TotValcostelote, "ZZZZZZ9.999") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueValcostelote", AV52TotValueValcostelote);
   }

   public void wb_table2_60_15M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekiloslote_Internalname, httpContext.getMessage( "Tot Value Kilos Lote", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekiloslote_Internalname, AV50TotValueKilosLote, GXutil.rtrim( localUtil.format( AV50TotValueKilosLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekiloslote_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekiloslote_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluevalcostelote_Internalname, httpContext.getMessage( "Tot Value Valcostelote", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluevalcostelote_Internalname, AV52TotValueValcostelote, GXutil.rtrim( localUtil.format( AV52TotValueValcostelote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluevalcostelote_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluevalcostelote_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_60_15M2e( true) ;
      }
      else
      {
         wb_table2_60_15M2e( false) ;
      }
   }

   public void wb_table1_23_15M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV37ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_28_15M2( true) ;
      }
      else
      {
         wb_table3_28_15M2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_15M2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_15M2e( true) ;
      }
      else
      {
         wb_table1_23_15M2e( false) ;
      }
   }

   public void wb_table3_28_15M2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV16FilterFullText, GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ReclamacionesyNoConformidadesWC_lote.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_15M2e( true) ;
      }
      else
      {
         wb_table3_28_15M2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      AV41Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Clicod_to), 6, 0));
      AV7HisReoFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
      AV42HisReoFec_to = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HisReoFec_to", localUtil.format(AV42HisReoFec_to, "99/99/99"));
      AV8HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisEstReo", GXutil.str( AV8HisEstReo, 1, 0));
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
      pa15M2( ) ;
      ws15M2( ) ;
      we15M2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV6Clicod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV41Clicod_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV7HisReoFec = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV42HisReoFec_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV8HisEstReo = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa15M2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "reclamacionesynoconformidadeswc_lote", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa15M2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Clicod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
         AV41Clicod_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Clicod_to), 6, 0));
         AV7HisReoFec = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
         AV42HisReoFec_to = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HisReoFec_to", localUtil.format(AV42HisReoFec_to, "99/99/99"));
         AV8HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisEstReo", GXutil.str( AV8HisEstReo, 1, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV41Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41Clicod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7HisReoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV7HisReoFec"), 0) ;
      wcpOAV42HisReoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV42HisReoFec_to"), 0) ;
      wcpOAV8HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6Clicod != wcpOAV6Clicod ) || ( AV41Clicod_to != wcpOAV41Clicod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV7HisReoFec), GXutil.resetTime(wcpOAV7HisReoFec)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV42HisReoFec_to), GXutil.resetTime(wcpOAV42HisReoFec_to)) ) || ( AV8HisEstReo != wcpOAV8HisEstReo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Clicod = AV6Clicod ;
      wcpOAV41Clicod_to = AV41Clicod_to ;
      wcpOAV7HisReoFec = AV7HisReoFec ;
      wcpOAV42HisReoFec_to = AV42HisReoFec_to ;
      wcpOAV8HisEstReo = AV8HisEstReo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV6Clicod = httpContext.cgiGet( sPrefix+"AV6Clicod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Clicod) > 0 )
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Clicod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Clicod), 6, 0));
      }
      else
      {
         AV6Clicod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Clicod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV41Clicod_to = httpContext.cgiGet( sPrefix+"AV41Clicod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV41Clicod_to) > 0 )
      {
         AV41Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41Clicod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Clicod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Clicod_to), 6, 0));
      }
      else
      {
         AV41Clicod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41Clicod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7HisReoFec = httpContext.cgiGet( sPrefix+"AV7HisReoFec_CTRL") ;
      if ( GXutil.len( sCtrlAV7HisReoFec) > 0 )
      {
         AV7HisReoFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV7HisReoFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisreofec_Internalname, localUtil.format(AV7HisReoFec, "99/99/99"));
      }
      else
      {
         AV7HisReoFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV7HisReoFec_PARM"), 0) ;
      }
      sCtrlAV42HisReoFec_to = httpContext.cgiGet( sPrefix+"AV42HisReoFec_to_CTRL") ;
      if ( GXutil.len( sCtrlAV42HisReoFec_to) > 0 )
      {
         AV42HisReoFec_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV42HisReoFec_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42HisReoFec_to", localUtil.format(AV42HisReoFec_to, "99/99/99"));
      }
      else
      {
         AV42HisReoFec_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV42HisReoFec_to_PARM"), 0) ;
      }
      sCtrlAV8HisEstReo = httpContext.cgiGet( sPrefix+"AV8HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV8HisEstReo) > 0 )
      {
         AV8HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HisEstReo", GXutil.str( AV8HisEstReo, 1, 0));
      }
      else
      {
         AV8HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa15M2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws15M2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws15M2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Clicod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Clicod_CTRL", GXutil.rtrim( sCtrlAV6Clicod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Clicod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV41Clicod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41Clicod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41Clicod_to_CTRL", GXutil.rtrim( sCtrlAV41Clicod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HisReoFec_PARM", localUtil.dtoc( AV7HisReoFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7HisReoFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7HisReoFec_CTRL", GXutil.rtrim( sCtrlAV7HisReoFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42HisReoFec_to_PARM", localUtil.dtoc( AV42HisReoFec_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42HisReoFec_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42HisReoFec_to_CTRL", GXutil.rtrim( sCtrlAV42HisReoFec_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV8HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HisEstReo_CTRL", GXutil.rtrim( sCtrlAV8HisEstReo));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we15M2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562563", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("reclamacionesynoconformidadeswc_lote.js", "?202682115562563", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_41_idx ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR_"+sGXsfl_41_idx ;
      edtavKiloslote_Internalname = sPrefix+"vKILOSLOTE_"+sGXsfl_41_idx ;
      edtavValcostelote_Internalname = sPrefix+"vVALCOSTELOTE_"+sGXsfl_41_idx ;
      edtavHisreolote_Internalname = sPrefix+"vHISREOLOTE_"+sGXsfl_41_idx ;
      edtavHisbarser_Internalname = sPrefix+"vHISBARSER_"+sGXsfl_41_idx ;
      edtavHisreodsc_Internalname = sPrefix+"vHISREODSC_"+sGXsfl_41_idx ;
      edtavHiscolnom_Internalname = sPrefix+"vHISCOLNOM_"+sGXsfl_41_idx ;
      edtavHisnomcli_Internalname = sPrefix+"vHISNOMCLI_"+sGXsfl_41_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_41_idx ;
      edtavHisreofec_Internalname = sPrefix+"vHISREOFEC_"+sGXsfl_41_idx ;
      edtavHisopetur_Internalname = sPrefix+"vHISOPETUR_"+sGXsfl_41_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_41_idx ;
      edtavDsccausa_Internalname = sPrefix+"vDSCCAUSA_"+sGXsfl_41_idx ;
      edtavRps_dsc_Internalname = sPrefix+"vRPS_DSC_"+sGXsfl_41_idx ;
      edtavHdrs_Internalname = sPrefix+"vHDRS_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_41_fel_idx ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR_"+sGXsfl_41_fel_idx ;
      edtavKiloslote_Internalname = sPrefix+"vKILOSLOTE_"+sGXsfl_41_fel_idx ;
      edtavValcostelote_Internalname = sPrefix+"vVALCOSTELOTE_"+sGXsfl_41_fel_idx ;
      edtavHisreolote_Internalname = sPrefix+"vHISREOLOTE_"+sGXsfl_41_fel_idx ;
      edtavHisbarser_Internalname = sPrefix+"vHISBARSER_"+sGXsfl_41_fel_idx ;
      edtavHisreodsc_Internalname = sPrefix+"vHISREODSC_"+sGXsfl_41_fel_idx ;
      edtavHiscolnom_Internalname = sPrefix+"vHISCOLNOM_"+sGXsfl_41_fel_idx ;
      edtavHisnomcli_Internalname = sPrefix+"vHISNOMCLI_"+sGXsfl_41_fel_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_41_fel_idx ;
      edtavHisreofec_Internalname = sPrefix+"vHISREOFEC_"+sGXsfl_41_fel_idx ;
      edtavHisopetur_Internalname = sPrefix+"vHISOPETUR_"+sGXsfl_41_fel_idx ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC_"+sGXsfl_41_fel_idx ;
      edtavDsccausa_Internalname = sPrefix+"vDSCCAUSA_"+sGXsfl_41_fel_idx ;
      edtavRps_dsc_Internalname = sPrefix+"vRPS_DSC_"+sGXsfl_41_fel_idx ;
      edtavHdrs_Internalname = sPrefix+"vHDRS_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb15M0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV17CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnhdr_Internalname,GXutil.rtrim( AV18BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarnhdr_Visible),Integer.valueOf(edtavBarnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavKiloslote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKiloslote_Internalname,GXutil.ltrim( localUtil.ntoc( AV19KilosLote, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKiloslote_Enabled!=0) ? localUtil.format( AV19KilosLote, "ZZZZZ9.99") : localUtil.format( AV19KilosLote, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKiloslote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavKiloslote_Visible),Integer.valueOf(edtavKiloslote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValcostelote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValcostelote_Internalname,GXutil.ltrim( localUtil.ntoc( AV20Valcostelote, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValcostelote_Enabled!=0) ? localUtil.format( AV20Valcostelote, "ZZZZZZ9.999") : localUtil.format( AV20Valcostelote, "ZZZZZZ9.999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValcostelote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValcostelote_Visible),Integer.valueOf(edtavValcostelote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHisreolote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisreolote_Internalname,GXutil.rtrim( AV21HisreoLote),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisreolote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisreolote_Visible),Integer.valueOf(edtavHisreolote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHisbarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisbarser_Internalname,GXutil.rtrim( AV22HisBarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisbarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisbarser_Visible),Integer.valueOf(edtavHisbarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHisreodsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisreodsc_Internalname,GXutil.rtrim( AV23HisReoDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisreodsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisreodsc_Visible),Integer.valueOf(edtavHisreodsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHiscolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHiscolnom_Internalname,GXutil.rtrim( AV24HisColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHiscolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHiscolnom_Visible),Integer.valueOf(edtavHiscolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHisnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisnomcli_Internalname,GXutil.rtrim( AV25HisNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisnomcli_Visible),Integer.valueOf(edtavHisnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV26MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavMaqcod_Visible),Integer.valueOf(edtavMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHisreofec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisreofec_Internalname,localUtil.format(AV7HisReoFec, "99/99/99"),localUtil.format( AV7HisReoFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisreofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisreofec_Visible),Integer.valueOf(edtavHisreofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHisopetur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisopetur_Internalname,GXutil.ltrim( localUtil.ntoc( AV27HisOpeTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisopetur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27HisOpeTur), "9") : localUtil.format( DecimalUtil.doubleToDec(AV27HisOpeTur), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisopetur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHisopetur_Visible),Integer.valueOf(edtavHisopetur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipdefdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipdefdsc_Internalname,GXutil.rtrim( AV28TipDefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTipdefdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipdefdsc_Visible),Integer.valueOf(edtavTipdefdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavDsccausa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDsccausa_Internalname,GXutil.rtrim( AV29DscCausa),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDsccausa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDsccausa_Visible),Integer.valueOf(edtavDsccausa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavRps_dsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRps_dsc_Internalname,GXutil.rtrim( AV30Rps_Dsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRps_dsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRps_dsc_Visible),Integer.valueOf(edtavRps_dsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdrs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdrs_Internalname,AV31Hdrs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdrs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavHdrs_Visible),Integer.valueOf(edtavHdrs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes15M2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavKiloslote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValcostelote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Custo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisreolote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisbarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisreodsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descriçao", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHiscolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMaqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisreofec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHisopetur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipdefdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Defeito", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDsccausa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Causa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRps_dsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Responsabilidade", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdrs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Os(s)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV18BarNHdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19KilosLote, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKiloslote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavKiloslote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20Valcostelote, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValcostelote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValcostelote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21HisreoLote));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisreolote_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisreolote_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV22HisBarSer));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisbarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisbarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV23HisReoDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisreodsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisreodsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV24HisColNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHiscolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHiscolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV25HisNomCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV26MaqCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV7HisReoFec, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisreofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisreofec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV27HisOpeTur, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisopetur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHisopetur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV28TipDefDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipdefdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipdefdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV29DscCausa));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDsccausa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDsccausa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV30Rps_Dsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRps_dsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRps_dsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV31Hdrs);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdrs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdrs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexportexcel_Internalname = sPrefix+"BTNEXPORTEXCEL" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavBarnhdr_Internalname = sPrefix+"vBARNHDR" ;
      edtavKiloslote_Internalname = sPrefix+"vKILOSLOTE" ;
      edtavValcostelote_Internalname = sPrefix+"vVALCOSTELOTE" ;
      edtavHisreolote_Internalname = sPrefix+"vHISREOLOTE" ;
      edtavHisbarser_Internalname = sPrefix+"vHISBARSER" ;
      edtavHisreodsc_Internalname = sPrefix+"vHISREODSC" ;
      edtavHiscolnom_Internalname = sPrefix+"vHISCOLNOM" ;
      edtavHisnomcli_Internalname = sPrefix+"vHISNOMCLI" ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      edtavHisreofec_Internalname = sPrefix+"vHISREOFEC" ;
      edtavHisopetur_Internalname = sPrefix+"vHISOPETUR" ;
      edtavTipdefdsc_Internalname = sPrefix+"vTIPDEFDSC" ;
      edtavDsccausa_Internalname = sPrefix+"vDSCCAUSA" ;
      edtavRps_dsc_Internalname = sPrefix+"vRPS_DSC" ;
      edtavHdrs_Internalname = sPrefix+"vHDRS" ;
      edtavTotvaluekiloslote_Internalname = sPrefix+"vTOTVALUEKILOSLOTE" ;
      edtavTotvaluevalcostelote_Internalname = sPrefix+"vTOTVALUEVALCOSTELOTE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = sPrefix+"GRIDTABLEWITHTOTALIZERS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtavHdrs_Jsonclick = "" ;
      edtavHdrs_Enabled = 0 ;
      edtavRps_dsc_Jsonclick = "" ;
      edtavRps_dsc_Enabled = 0 ;
      edtavDsccausa_Jsonclick = "" ;
      edtavDsccausa_Enabled = 0 ;
      edtavTipdefdsc_Jsonclick = "" ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavHisopetur_Jsonclick = "" ;
      edtavHisopetur_Enabled = 0 ;
      edtavHisreofec_Jsonclick = "" ;
      edtavHisreofec_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtavHisnomcli_Jsonclick = "" ;
      edtavHisnomcli_Enabled = 0 ;
      edtavHiscolnom_Jsonclick = "" ;
      edtavHiscolnom_Enabled = 0 ;
      edtavHisreodsc_Jsonclick = "" ;
      edtavHisreodsc_Enabled = 0 ;
      edtavHisbarser_Jsonclick = "" ;
      edtavHisbarser_Enabled = 0 ;
      edtavHisreolote_Jsonclick = "" ;
      edtavHisreolote_Enabled = 0 ;
      edtavValcostelote_Jsonclick = "" ;
      edtavValcostelote_Enabled = 0 ;
      edtavKiloslote_Jsonclick = "" ;
      edtavKiloslote_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluevalcostelote_Jsonclick = "" ;
      edtavTotvaluevalcostelote_Enabled = 1 ;
      edtavTotvaluekiloslote_Jsonclick = "" ;
      edtavTotvaluekiloslote_Enabled = 1 ;
      edtavHdrs_Visible = -1 ;
      edtavRps_dsc_Visible = -1 ;
      edtavDsccausa_Visible = -1 ;
      edtavTipdefdsc_Visible = -1 ;
      edtavHisopetur_Visible = -1 ;
      edtavHisreofec_Visible = -1 ;
      edtavMaqcod_Visible = -1 ;
      edtavHisnomcli_Visible = -1 ;
      edtavHiscolnom_Visible = -1 ;
      edtavHisreodsc_Visible = -1 ;
      edtavHisbarser_Visible = -1 ;
      edtavHisreolote_Visible = -1 ;
      edtavValcostelote_Visible = -1 ;
      edtavKiloslote_Visible = -1 ;
      edtavBarnhdr_Visible = -1 ;
      edtavClinom_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||||||||||||" ;
      Ddo_grid_Columnids = "0:CliNom|1:BarNHdr|2:KilosLote|3:Valcostelote|4:HisreoLote|5:HisBarSer|6:HisReoDsc|7:HisColNom|8:HisNomCli|9:MaqCod|10:HisReoFec|11:HisOpeTur|12:TipDefDsc|13:DscCausa|14:Rps_Dsc|15:Hdrs" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1715M2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV19KilosLote',fld:'vKILOSLOTE',pic:'ZZZZZ9.99'},{av:'AV20Valcostelote',fld:'vVALCOSTELOTE',pic:'ZZZZZZ9.999'},{av:'AV31Hdrs',fld:'vHDRS',pic:''},{av:'AV18BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV17CliNom',fld:'vCLINOM',pic:''},{av:'AV21HisreoLote',fld:'vHISREOLOTE',pic:''},{av:'AV22HisBarSer',fld:'vHISBARSER',pic:''},{av:'AV23HisReoDsc',fld:'vHISREODSC',pic:''},{av:'AV24HisColNom',fld:'vHISCOLNOM',pic:''},{av:'AV25HisNomCli',fld:'vHISNOMCLI',pic:''},{av:'AV27HisOpeTur',fld:'vHISOPETUR',pic:'9'},{av:'AV26MaqCod',fld:'vMAQCOD',pic:''},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV28TipDefDsc',fld:'vTIPDEFDSC',pic:''},{av:'AV29DscCausa',fld:'vDSCCAUSA',pic:''},{av:'AV30Rps_Dsc',fld:'vRPS_DSC',pic:''},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1215M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1115M2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("'DOEXPORTEXCEL'","{handler:'e1315M2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("'DOEXPORTEXCEL'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1415M2',iparms:[{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47lastHisBarcod',fld:'vLASTHISBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A542HisBarSer',fld:'HISBARSER',pic:''},{av:'A2299HisReoDsc',fld:'HISREODSC',pic:''},{av:'A546HisColNom',fld:'HISCOLNOM',pic:''},{av:'A8889HisNomCli',fld:'HISNOMCLI',pic:''},{av:'A12950HisOpeTur',fld:'HISOPETUR',pic:'9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A12949HisOpecod',fld:'HISOPECOD',pic:'ZZZZZ9'},{av:'A834TipDefDsc',fld:'TIPDEFDSC',pic:''},{av:'A5086DscCausa',fld:'DSCCAUSA',pic:''},{av:'A7001Rps_Dsc',fld:'RPS_DSC',pic:''},{av:'sPrefix'},{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV41Clicod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV7HisReoFec',fld:'vHISREOFEC',pic:''},{av:'AV42HisReoFec_to',fld:'vHISREOFEC_TO',pic:''},{av:'AV8HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13698HisreoLote',fld:'HISREOLOTE',pic:''},{av:'A539HisBarCod',fld:'HISBARCOD',pic:'ZZZZZZZ9'},{av:'A545HisCodReo',fld:'HISCODREO',pic:'9'},{av:'A544HisCodPar',fld:'HISCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A569HisReoFec',fld:'HISREOFEC',pic:''},{av:'A548HisEstReo',fld:'HISESTREO',pic:'9'},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'A540HisBarKgm',fld:'HISBARKGM',pic:'ZZZZZ9.99'},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'A13699CostCausa',fld:'COSTCAUSA',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV39ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavBarnhdr_Visible',ctrl:'vBARNHDR',prop:'Visible'},{av:'edtavKiloslote_Visible',ctrl:'vKILOSLOTE',prop:'Visible'},{av:'edtavValcostelote_Visible',ctrl:'vVALCOSTELOTE',prop:'Visible'},{av:'edtavHisreolote_Visible',ctrl:'vHISREOLOTE',prop:'Visible'},{av:'edtavHisbarser_Visible',ctrl:'vHISBARSER',prop:'Visible'},{av:'edtavHisreodsc_Visible',ctrl:'vHISREODSC',prop:'Visible'},{av:'edtavHiscolnom_Visible',ctrl:'vHISCOLNOM',prop:'Visible'},{av:'edtavHisnomcli_Visible',ctrl:'vHISNOMCLI',prop:'Visible'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'edtavHisreofec_Visible',ctrl:'vHISREOFEC',prop:'Visible'},{av:'edtavHisopetur_Visible',ctrl:'vHISOPETUR',prop:'Visible'},{av:'edtavTipdefdsc_Visible',ctrl:'vTIPDEFDSC',prop:'Visible'},{av:'edtavDsccausa_Visible',ctrl:'vDSCCAUSA',prop:'Visible'},{av:'edtavRps_dsc_Visible',ctrl:'vRPS_DSC',prop:'Visible'},{av:'edtavHdrs_Visible',ctrl:'vHDRS',prop:'Visible'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49TotKilosLote',fld:'vTOTKILOSLOTE',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotValcostelote',fld:'vTOTVALCOSTELOTE',pic:'ZZZZZZ9.999',hsh:true},{av:'AV50TotValueKilosLote',fld:'vTOTVALUEKILOSLOTE',pic:''},{av:'AV52TotValueValcostelote',fld:'vTOTVALUEVALCOSTELOTE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Hdrs',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV7HisReoFec = GXutil.nullDate() ;
      wcpOAV42HisReoFec_to = GXutil.nullDate() ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV7HisReoFec = GXutil.nullDate() ;
      AV42HisReoFec_to = GXutil.nullDate() ;
      AV34ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV61Pgmname = "" ;
      AV16FilterFullText = "" ;
      A396EmprCod = "" ;
      A13698HisreoLote = "" ;
      A544HisCodPar = "" ;
      A569HisReoFec = GXutil.nullDate() ;
      AV49TotKilosLote = DecimalUtil.ZERO ;
      A540HisBarKgm = DecimalUtil.ZERO ;
      AV51TotValcostelote = DecimalUtil.ZERO ;
      A13699CostCausa = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A542HisBarSer = "" ;
      A2299HisReoDsc = "" ;
      A546HisColNom = "" ;
      A8889HisNomCli = "" ;
      A602MaqCod = "" ;
      A834TipDefDsc = "" ;
      A5086DscCausa = "" ;
      A7001Rps_Dsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV37ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV40DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexportexcel_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17CliNom = "" ;
      AV18BarNHdr = "" ;
      AV19KilosLote = DecimalUtil.ZERO ;
      AV20Valcostelote = DecimalUtil.ZERO ;
      AV21HisreoLote = "" ;
      AV22HisBarSer = "" ;
      AV23HisReoDsc = "" ;
      AV24HisColNom = "" ;
      AV25HisNomCli = "" ;
      AV26MaqCod = "" ;
      AV28TipDefDsc = "" ;
      AV29DscCausa = "" ;
      AV30Rps_Dsc = "" ;
      AV31Hdrs = "" ;
      GXCCtl = "" ;
      AV50TotValueKilosLote = "" ;
      AV52TotValueValcostelote = "" ;
      AV57Station = "" ;
      GXv_char2 = new String[1] ;
      AV58Emprnom = "" ;
      AV59Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36Session = httpContext.getWebSession();
      AV32ColumnsSelectorXML = "" ;
      AV45LastLote = "" ;
      AV46LastHdr = "" ;
      scmdbuf = "" ;
      H015M2_A833TipDefCod = new short[1] ;
      H015M2_A5085CodCausa = new short[1] ;
      H015M2_n5085CodCausa = new boolean[] {false} ;
      H015M2_A7000Rps_Cod = new short[1] ;
      H015M2_n7000Rps_Cod = new boolean[] {false} ;
      H015M2_A396EmprCod = new String[] {""} ;
      H015M2_A548HisEstReo = new byte[1] ;
      H015M2_n548HisEstReo = new boolean[] {false} ;
      H015M2_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015M2_n569HisReoFec = new boolean[] {false} ;
      H015M2_A252CliCod = new int[1] ;
      H015M2_n252CliCod = new boolean[] {false} ;
      H015M2_A279CliNom = new String[] {""} ;
      H015M2_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015M2_n540HisBarKgm = new boolean[] {false} ;
      H015M2_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015M2_n13699CostCausa = new boolean[] {false} ;
      H015M2_A542HisBarSer = new String[] {""} ;
      H015M2_n542HisBarSer = new boolean[] {false} ;
      H015M2_A2299HisReoDsc = new String[] {""} ;
      H015M2_n2299HisReoDsc = new boolean[] {false} ;
      H015M2_A546HisColNom = new String[] {""} ;
      H015M2_n546HisColNom = new boolean[] {false} ;
      H015M2_A8889HisNomCli = new String[] {""} ;
      H015M2_n8889HisNomCli = new boolean[] {false} ;
      H015M2_A12950HisOpeTur = new byte[1] ;
      H015M2_n12950HisOpeTur = new boolean[] {false} ;
      H015M2_A602MaqCod = new String[] {""} ;
      H015M2_n602MaqCod = new boolean[] {false} ;
      H015M2_A12949HisOpecod = new int[1] ;
      H015M2_n12949HisOpecod = new boolean[] {false} ;
      H015M2_A834TipDefDsc = new String[] {""} ;
      H015M2_n834TipDefDsc = new boolean[] {false} ;
      H015M2_A5086DscCausa = new String[] {""} ;
      H015M2_n5086DscCausa = new boolean[] {false} ;
      H015M2_A7001Rps_Dsc = new String[] {""} ;
      H015M2_n7001Rps_Dsc = new boolean[] {false} ;
      H015M2_A544HisCodPar = new String[] {""} ;
      H015M2_A545HisCodReo = new byte[1] ;
      H015M2_A539HisBarCod = new int[1] ;
      H015M2_A13698HisreoLote = new String[] {""} ;
      H015M2_n13698HisreoLote = new boolean[] {false} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV38ManageFiltersXml = "" ;
      AV53ExcelFilename = "" ;
      AV54ExcelErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV33UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV35ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV15GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      H015M3_A833TipDefCod = new short[1] ;
      H015M3_A5085CodCausa = new short[1] ;
      H015M3_n5085CodCausa = new boolean[] {false} ;
      H015M3_A396EmprCod = new String[] {""} ;
      H015M3_A548HisEstReo = new byte[1] ;
      H015M3_n548HisEstReo = new boolean[] {false} ;
      H015M3_A569HisReoFec = new java.util.Date[] {GXutil.nullDate()} ;
      H015M3_n569HisReoFec = new boolean[] {false} ;
      H015M3_A252CliCod = new int[1] ;
      H015M3_n252CliCod = new boolean[] {false} ;
      H015M3_A540HisBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015M3_n540HisBarKgm = new boolean[] {false} ;
      H015M3_A13699CostCausa = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H015M3_n13699CostCausa = new boolean[] {false} ;
      H015M3_A544HisCodPar = new String[] {""} ;
      H015M3_A545HisCodReo = new byte[1] ;
      H015M3_A539HisBarCod = new int[1] ;
      H015M3_A13698HisreoLote = new String[] {""} ;
      H015M3_n13698HisreoLote = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Clicod = "" ;
      sCtrlAV41Clicod_to = "" ;
      sCtrlAV7HisReoFec = "" ;
      sCtrlAV42HisReoFec_to = "" ;
      sCtrlAV8HisEstReo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.reclamacionesynoconformidadeswc_lote__default(),
         new Object[] {
             new Object[] {
            H015M2_A833TipDefCod, H015M2_A5085CodCausa, H015M2_n5085CodCausa, H015M2_A7000Rps_Cod, H015M2_n7000Rps_Cod, H015M2_A396EmprCod, H015M2_A548HisEstReo, H015M2_n548HisEstReo, H015M2_A569HisReoFec, H015M2_n569HisReoFec,
            H015M2_A252CliCod, H015M2_n252CliCod, H015M2_A279CliNom, H015M2_A540HisBarKgm, H015M2_n540HisBarKgm, H015M2_A13699CostCausa, H015M2_n13699CostCausa, H015M2_A542HisBarSer, H015M2_n542HisBarSer, H015M2_A2299HisReoDsc,
            H015M2_n2299HisReoDsc, H015M2_A546HisColNom, H015M2_n546HisColNom, H015M2_A8889HisNomCli, H015M2_n8889HisNomCli, H015M2_A12950HisOpeTur, H015M2_n12950HisOpeTur, H015M2_A602MaqCod, H015M2_n602MaqCod, H015M2_A12949HisOpecod,
            H015M2_n12949HisOpecod, H015M2_A834TipDefDsc, H015M2_n834TipDefDsc, H015M2_A5086DscCausa, H015M2_n5086DscCausa, H015M2_A7001Rps_Dsc, H015M2_n7001Rps_Dsc, H015M2_A544HisCodPar, H015M2_A545HisCodReo, H015M2_A539HisBarCod,
            H015M2_A13698HisreoLote, H015M2_n13698HisreoLote
            }
            , new Object[] {
            H015M3_A833TipDefCod, H015M3_A5085CodCausa, H015M3_n5085CodCausa, H015M3_A396EmprCod, H015M3_A548HisEstReo, H015M3_n548HisEstReo, H015M3_A569HisReoFec, H015M3_n569HisReoFec, H015M3_A252CliCod, H015M3_n252CliCod,
            H015M3_A540HisBarKgm, H015M3_n540HisBarKgm, H015M3_A13699CostCausa, H015M3_n13699CostCausa, H015M3_A544HisCodPar, H015M3_A545HisCodReo, H015M3_A539HisBarCod, H015M3_A13698HisreoLote, H015M3_n13698HisreoLote
            }
         }
      );
      AV61Pgmname = "ReclamacionesyNoConformidadesWC_lote" ;
      /* GeneXus formulas. */
      AV61Pgmname = "ReclamacionesyNoConformidadesWC_lote" ;
      Gx_err = (short)(0) ;
      edtavClinom_Enabled = 0 ;
      edtavBarnhdr_Enabled = 0 ;
      edtavKiloslote_Enabled = 0 ;
      edtavValcostelote_Enabled = 0 ;
      edtavHisreolote_Enabled = 0 ;
      edtavHisbarser_Enabled = 0 ;
      edtavHisreodsc_Enabled = 0 ;
      edtavHiscolnom_Enabled = 0 ;
      edtavHisnomcli_Enabled = 0 ;
      edtavMaqcod_Enabled = 0 ;
      edtavHisreofec_Enabled = 0 ;
      edtavHisopetur_Enabled = 0 ;
      edtavTipdefdsc_Enabled = 0 ;
      edtavDsccausa_Enabled = 0 ;
      edtavRps_dsc_Enabled = 0 ;
      edtavHdrs_Enabled = 0 ;
      edtavTotvaluekiloslote_Enabled = 0 ;
      edtavTotvaluevalcostelote_Enabled = 0 ;
   }

   private byte wcpOAV8HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV8HisEstReo ;
   private byte AV39ManageFiltersExecutionStep ;
   private byte A545HisCodReo ;
   private byte A548HisEstReo ;
   private byte A12950HisOpeTur ;
   private byte nGXWrapped ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV27HisOpeTur ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A833TipDefCod ;
   private short A5085CodCausa ;
   private short A7000Rps_Cod ;
   private int wcpOAV6Clicod ;
   private int wcpOAV41Clicod_to ;
   private int nRC_GXsfl_41 ;
   private int AV6Clicod ;
   private int AV41Clicod_to ;
   private int subGrid_Rows ;
   private int nGXsfl_41_idx=1 ;
   private int A539HisBarCod ;
   private int A252CliCod ;
   private int AV47lastHisBarcod ;
   private int A12949HisOpecod ;
   private int subGrid_Islastpage ;
   private int edtavClinom_Enabled ;
   private int edtavBarnhdr_Enabled ;
   private int edtavKiloslote_Enabled ;
   private int edtavValcostelote_Enabled ;
   private int edtavHisreolote_Enabled ;
   private int edtavHisbarser_Enabled ;
   private int edtavHisreodsc_Enabled ;
   private int edtavHiscolnom_Enabled ;
   private int edtavHisnomcli_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavHisreofec_Enabled ;
   private int edtavHisopetur_Enabled ;
   private int edtavTipdefdsc_Enabled ;
   private int edtavDsccausa_Enabled ;
   private int edtavRps_dsc_Enabled ;
   private int edtavHdrs_Enabled ;
   private int edtavTotvaluekiloslote_Enabled ;
   private int edtavTotvaluevalcostelote_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavClinom_Visible ;
   private int edtavBarnhdr_Visible ;
   private int edtavKiloslote_Visible ;
   private int edtavValcostelote_Visible ;
   private int edtavHisreolote_Visible ;
   private int edtavHisbarser_Visible ;
   private int edtavHisreodsc_Visible ;
   private int edtavHiscolnom_Visible ;
   private int edtavHisnomcli_Visible ;
   private int edtavMaqcod_Visible ;
   private int edtavHisreofec_Visible ;
   private int edtavHisopetur_Visible ;
   private int edtavTipdefdsc_Visible ;
   private int edtavDsccausa_Visible ;
   private int edtavRps_dsc_Visible ;
   private int edtavHdrs_Visible ;
   private int AV48HisOpecod ;
   private int AV62GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal AV49TotKilosLote ;
   private java.math.BigDecimal A540HisBarKgm ;
   private java.math.BigDecimal AV51TotValcostelote ;
   private java.math.BigDecimal A13699CostCausa ;
   private java.math.BigDecimal AV19KilosLote ;
   private java.math.BigDecimal AV20Valcostelote ;
   private String wcpOAV5Emprcod ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String edtavHisreofec_Internalname ;
   private String sGXsfl_41_idx="0001" ;
   private String AV61Pgmname ;
   private String A396EmprCod ;
   private String A13698HisreoLote ;
   private String A544HisCodPar ;
   private String A279CliNom ;
   private String A542HisBarSer ;
   private String A2299HisReoDsc ;
   private String A546HisColNom ;
   private String A8889HisNomCli ;
   private String A602MaqCod ;
   private String A834TipDefDsc ;
   private String A5086DscCausa ;
   private String A7001Rps_Dsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexportexcel_Internalname ;
   private String bttBtnexportexcel_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String AV17CliNom ;
   private String edtavClinom_Internalname ;
   private String AV18BarNHdr ;
   private String edtavBarnhdr_Internalname ;
   private String edtavKiloslote_Internalname ;
   private String edtavValcostelote_Internalname ;
   private String AV21HisreoLote ;
   private String edtavHisreolote_Internalname ;
   private String AV22HisBarSer ;
   private String edtavHisbarser_Internalname ;
   private String AV23HisReoDsc ;
   private String edtavHisreodsc_Internalname ;
   private String AV24HisColNom ;
   private String edtavHiscolnom_Internalname ;
   private String AV25HisNomCli ;
   private String edtavHisnomcli_Internalname ;
   private String AV26MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String edtavHisopetur_Internalname ;
   private String AV28TipDefDsc ;
   private String edtavTipdefdsc_Internalname ;
   private String AV29DscCausa ;
   private String edtavDsccausa_Internalname ;
   private String AV30Rps_Dsc ;
   private String edtavRps_dsc_Internalname ;
   private String edtavHdrs_Internalname ;
   private String GXCCtl ;
   private String edtavTotvaluekiloslote_Internalname ;
   private String edtavTotvaluevalcostelote_Internalname ;
   private String AV57Station ;
   private String GXv_char2[] ;
   private String AV58Emprnom ;
   private String AV59Usurcod ;
   private String AV45LastLote ;
   private String AV46LastHdr ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekiloslote_Jsonclick ;
   private String edtavTotvaluevalcostelote_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Clicod ;
   private String sCtrlAV41Clicod_to ;
   private String sCtrlAV7HisReoFec ;
   private String sCtrlAV42HisReoFec_to ;
   private String sCtrlAV8HisEstReo ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarnhdr_Jsonclick ;
   private String edtavKiloslote_Jsonclick ;
   private String edtavValcostelote_Jsonclick ;
   private String edtavHisreolote_Jsonclick ;
   private String edtavHisbarser_Jsonclick ;
   private String edtavHisreodsc_Jsonclick ;
   private String edtavHiscolnom_Jsonclick ;
   private String edtavHisnomcli_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavHisreofec_Jsonclick ;
   private String edtavHisopetur_Jsonclick ;
   private String edtavTipdefdsc_Jsonclick ;
   private String edtavDsccausa_Jsonclick ;
   private String edtavRps_dsc_Jsonclick ;
   private String edtavHdrs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV7HisReoFec ;
   private java.util.Date wcpOAV42HisReoFec_to ;
   private java.util.Date AV7HisReoFec ;
   private java.util.Date AV42HisReoFec_to ;
   private java.util.Date A569HisReoFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13698HisreoLote ;
   private boolean n252CliCod ;
   private boolean n569HisReoFec ;
   private boolean n548HisEstReo ;
   private boolean n540HisBarKgm ;
   private boolean n13699CostCausa ;
   private boolean n542HisBarSer ;
   private boolean n2299HisReoDsc ;
   private boolean n546HisColNom ;
   private boolean n8889HisNomCli ;
   private boolean n12950HisOpeTur ;
   private boolean n602MaqCod ;
   private boolean n12949HisOpecod ;
   private boolean n834TipDefDsc ;
   private boolean n5086DscCausa ;
   private boolean n7001Rps_Dsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n5085CodCausa ;
   private boolean n7000Rps_Cod ;
   private String AV32ColumnsSelectorXML ;
   private String AV38ManageFiltersXml ;
   private String AV33UserCustomValue ;
   private String AV16FilterFullText ;
   private String AV31Hdrs ;
   private String AV50TotValueKilosLote ;
   private String AV52TotValueValcostelote ;
   private String AV53ExcelFilename ;
   private String AV54ExcelErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private short[] H015M2_A833TipDefCod ;
   private short[] H015M2_A5085CodCausa ;
   private boolean[] H015M2_n5085CodCausa ;
   private short[] H015M2_A7000Rps_Cod ;
   private boolean[] H015M2_n7000Rps_Cod ;
   private String[] H015M2_A396EmprCod ;
   private byte[] H015M2_A548HisEstReo ;
   private boolean[] H015M2_n548HisEstReo ;
   private java.util.Date[] H015M2_A569HisReoFec ;
   private boolean[] H015M2_n569HisReoFec ;
   private int[] H015M2_A252CliCod ;
   private boolean[] H015M2_n252CliCod ;
   private String[] H015M2_A279CliNom ;
   private java.math.BigDecimal[] H015M2_A540HisBarKgm ;
   private boolean[] H015M2_n540HisBarKgm ;
   private java.math.BigDecimal[] H015M2_A13699CostCausa ;
   private boolean[] H015M2_n13699CostCausa ;
   private String[] H015M2_A542HisBarSer ;
   private boolean[] H015M2_n542HisBarSer ;
   private String[] H015M2_A2299HisReoDsc ;
   private boolean[] H015M2_n2299HisReoDsc ;
   private String[] H015M2_A546HisColNom ;
   private boolean[] H015M2_n546HisColNom ;
   private String[] H015M2_A8889HisNomCli ;
   private boolean[] H015M2_n8889HisNomCli ;
   private byte[] H015M2_A12950HisOpeTur ;
   private boolean[] H015M2_n12950HisOpeTur ;
   private String[] H015M2_A602MaqCod ;
   private boolean[] H015M2_n602MaqCod ;
   private int[] H015M2_A12949HisOpecod ;
   private boolean[] H015M2_n12949HisOpecod ;
   private String[] H015M2_A834TipDefDsc ;
   private boolean[] H015M2_n834TipDefDsc ;
   private String[] H015M2_A5086DscCausa ;
   private boolean[] H015M2_n5086DscCausa ;
   private String[] H015M2_A7001Rps_Dsc ;
   private boolean[] H015M2_n7001Rps_Dsc ;
   private String[] H015M2_A544HisCodPar ;
   private byte[] H015M2_A545HisCodReo ;
   private int[] H015M2_A539HisBarCod ;
   private String[] H015M2_A13698HisreoLote ;
   private boolean[] H015M2_n13698HisreoLote ;
   private short[] H015M3_A833TipDefCod ;
   private short[] H015M3_A5085CodCausa ;
   private boolean[] H015M3_n5085CodCausa ;
   private String[] H015M3_A396EmprCod ;
   private byte[] H015M3_A548HisEstReo ;
   private boolean[] H015M3_n548HisEstReo ;
   private java.util.Date[] H015M3_A569HisReoFec ;
   private boolean[] H015M3_n569HisReoFec ;
   private int[] H015M3_A252CliCod ;
   private boolean[] H015M3_n252CliCod ;
   private java.math.BigDecimal[] H015M3_A540HisBarKgm ;
   private boolean[] H015M3_n540HisBarKgm ;
   private java.math.BigDecimal[] H015M3_A13699CostCausa ;
   private boolean[] H015M3_n13699CostCausa ;
   private String[] H015M3_A544HisCodPar ;
   private byte[] H015M3_A545HisCodReo ;
   private int[] H015M3_A539HisBarCod ;
   private String[] H015M3_A13698HisreoLote ;
   private boolean[] H015M3_n13698HisreoLote ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV37ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV15GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV35ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV40DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class reclamacionesynoconformidadeswc_lote__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H015M2", "SELECT T1.TipDefCod, T1.CodCausa, T1.Rps_Cod, T1.EmprCod, T1.HisEstReo, T1.HisReoFec, T1.CliCod, T5.CliNom, T1.HisBarKgm, T3.CostCausa, T1.HisBarSer, T1.HisReoDsc, T1.HisColNom, T1.HisNomCli, T1.HisOpeTur, T1.MaqCod, T1.HisOpecod, T2.TipDefDsc, T3.DscCausa, T4.Rps_Dsc, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisreoLote FROM ((((TXPHISREO T1 INNER JOIN TXPTIPDEF T2 ON T2.EmprCod = T1.EmprCod AND T2.TipDefCod = T1.TipDefCod) LEFT JOIN TXPTIPCAU T3 ON T3.EmprCod = T1.EmprCod AND T3.CodCausa = T1.CodCausa) LEFT JOIN TXPCODRPS T4 ON T4.EmprCod = T1.EmprCod AND T4.Rps_Cod = T1.Rps_Cod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprCod AND T5.CliCod = T1.CliCod) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) ORDER BY T1.EmprCod, T1.HisreoLote, T1.HisBarCod DESC, T1.HisCodReo DESC, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H015M3", "SELECT T1.TipDefCod, T1.CodCausa, T1.EmprCod, T1.HisEstReo, T1.HisReoFec, T1.CliCod, T1.HisBarKgm, T2.CostCausa, T1.HisCodPar, T1.HisCodReo, T1.HisBarCod, T1.HisreoLote FROM (TXPHISREO T1 LEFT JOIN TXPTIPCAU T2 ON T2.EmprCod = T1.EmprCod AND T2.CodCausa = T1.CodCausa) WHERE (T1.EmprCod = ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.HisReoFec >= ?) AND (T1.HisReoFec <= ?) AND (T1.HisEstReo = ?) ORDER BY T1.EmprCod, T1.HisreoLote, T1.HisBarCod DESC, T1.HisCodReo DESC, T1.HisCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 26);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 60);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 40);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 1);
               ((byte[]) buf[38])[0] = rslt.getByte(22);
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((String[]) buf[40])[0] = rslt.getString(24, 20);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(10);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((String[]) buf[17])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

