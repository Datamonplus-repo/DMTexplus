package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcsituacionprocesoquimicorecetas_impl extends GXWebComponent
{
   public wcsituacionprocesoquimicorecetas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcsituacionprocesoquimicorecetas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcsituacionprocesoquimicorecetas_impl.class ));
   }

   public wcsituacionprocesoquimicorecetas_impl( int remoteHandle ,
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
      cmbRecAcab = new HTMLChoice();
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8Proforcod = httpContext.GetPar( "Proforcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Proforcod", AV8Proforcod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,AV8Proforcod});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV63FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV26ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21ColumnsSelector);
      AV28TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV29TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV31TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV32TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV34TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV35TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV37TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV38TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV40TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV41TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV43TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV44TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV46TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV47TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV49TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV50TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV62TFRecAcab_Sels);
      AV88Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV8Proforcod = httpContext.GetPar( "Proforcod") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paQ32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Recetas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.wcsituacionprocesoquimicorecetas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV8Proforcod))}, new String[] {"Emprcod","Proforcod"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV63FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV24ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV57GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV58GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV55DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV21ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8Proforcod", GXutil.rtrim( wcpOAV8Proforcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV26ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV28TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV31TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV32TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV34TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV35TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV37TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV38TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV40TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV41TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV43TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV44TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV46TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV47TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR", GXutil.rtrim( AV49TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNHDR_SEL", GXutil.rtrim( AV50TFBarNHdr_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFRECACAB_SELS", AV62TFRecAcab_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFRECACAB_SELS", AV62TFRecAcab_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV88Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFORCOD", GXutil.rtrim( AV8Proforcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV12GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV12GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECACAB_SELSJSON", AV61TFRecAcab_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormQ32( )
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
         httpContext.writeTextNL( "</form>") ;
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
      return "FormulacionTinte.WCSituacionProcesoQuimicoRecetas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas", "") ;
   }

   public void wbQ30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.formulaciontinte.wcsituacionprocesoquimicorecetas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSituacionProcesoQuimicoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11q31_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\WCSituacionProcesoQuimicoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSituacionProcesoQuimicoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\WCSituacionProcesoQuimicoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_Q32( true) ;
      }
      else
      {
         wb_table1_25_Q32( false) ;
      }
      return  ;
   }

   public void wb_table1_25_Q32e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV57GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV58GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV55DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV55DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV21ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void startQ32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Recetas", ""), (short)(0)) ;
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
            strupQ30( ) ;
         }
      }
   }

   public void wsQ32( )
   {
      startQ32( ) ;
      evtQ32( ) ;
   }

   public void evtQ32( )
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
                              strupQ30( ) ;
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
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e14Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e15Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e16Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e17Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e18Q32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupQ30( ) ;
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
                              strupQ30( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4695RecVolPrf = (int)(localUtil.ctol( httpContext.cgiGet( edtRecVolPrf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbRecAcab.setName( cmbRecAcab.getInternalname() );
                           cmbRecAcab.setValue( httpContext.cgiGet( cmbRecAcab.getInternalname()) );
                           A6039RecAcab = httpContext.cgiGet( cmbRecAcab.getInternalname()) ;
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
                                       e19Q32 ();
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
                                       e20Q32 ();
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
                                       e21Q32 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV63FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strupQ30( ) ;
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

   public void weQ32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormQ32( ) ;
         }
      }
   }

   public void paQ32( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV63FilterFullText ,
                                 String AV7Emprcod ,
                                 byte AV26ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ,
                                 int AV28TFCliCod ,
                                 int AV29TFCliCod_To ,
                                 String AV31TFCliNom ,
                                 String AV32TFCliNom_Sel ,
                                 String AV34TFBarSer ,
                                 String AV35TFBarSer_Sel ,
                                 String AV37TFBarSerDsc ,
                                 String AV38TFBarSerDsc_Sel ,
                                 String AV40TFBarColNom ,
                                 String AV41TFBarColNom_Sel ,
                                 int AV43TFBarColNum ,
                                 int AV44TFBarColNum_To ,
                                 String AV46TFBarNomCli ,
                                 String AV47TFBarNomCli_Sel ,
                                 String AV49TFBarNHdr ,
                                 String AV50TFBarNHdr_Sel ,
                                 GXSimpleCollection<String> AV62TFRecAcab_Sels ,
                                 String AV88Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 String AV8Proforcod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20Q32 ();
      GRID_nCurrentRecord = 0 ;
      rfQ32( ) ;
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
      send_integrity_hashes( ) ;
      rfQ32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV88Pgmname = "FormulacionTinte.WCSituacionProcesoQuimicoRecetas" ;
      Gx_err = (short)(0) ;
   }

   public void rfQ32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20Q32 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A6039RecAcab ,
                                              AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                              AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                              Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                              Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                              AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                              AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                              AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                              AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                              AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                              AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                              AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                              AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                              Integer.valueOf(AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                              Integer.valueOf(AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                              AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                              AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                              AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                              AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                              Integer.valueOf(AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              AV7Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
         lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
         lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
         lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
         lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
         lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
         /* Using cursor H00Q32 */
         pr_default.execute(0, new Object[] {AV7Emprcod, Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H00Q32_A396EmprCod[0] ;
            A1234BarNomCli = H00Q32_A1234BarNomCli[0] ;
            A136BarColNum = H00Q32_A136BarColNum[0] ;
            A135BarColNom = H00Q32_A135BarColNom[0] ;
            A1652BarSerDsc = H00Q32_A1652BarSerDsc[0] ;
            A212BarSer = H00Q32_A212BarSer[0] ;
            A279CliNom = H00Q32_A279CliNom[0] ;
            A252CliCod = H00Q32_A252CliCod[0] ;
            n252CliCod = H00Q32_n252CliCod[0] ;
            A130BarCodPar = H00Q32_A130BarCodPar[0] ;
            A132BarCodReo = H00Q32_A132BarCodReo[0] ;
            A129BarCod = H00Q32_A129BarCod[0] ;
            A279CliNom = H00Q32_A279CliNom[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e21Q32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wbQ30( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesQ32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV88Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV88Pgmname, ""))));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A6039RecAcab ,
                                           AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                           AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                           Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) ,
                                           Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) ,
                                           AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                           AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                           AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                           AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                           AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                           AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                           AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                           AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                           Integer.valueOf(AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) ,
                                           Integer.valueOf(AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) ,
                                           AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                           AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                           AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                           AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                           Integer.valueOf(AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels.size()) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           AV7Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = GXutil.padr( GXutil.rtrim( AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom), 30, "%") ;
      lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = GXutil.padr( GXutil.rtrim( AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser), 16, "%") ;
      lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc), 26, "%") ;
      lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom), 13, "%") ;
      lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli), 13, "%") ;
      lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr), 11, "%") ;
      /* Using cursor H00Q33 */
      pr_default.execute(1, new Object[] {AV7Emprcod, Integer.valueOf(AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod), Integer.valueOf(AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to), lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom, AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel, lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser, AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel, lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc, AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel, lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom, AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel, Integer.valueOf(AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum), Integer.valueOf(AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to), lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli, AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel, lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr, AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel});
      GRID_nRecordCount = H00Q33_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
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
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV63FilterFullText, AV7Emprcod, AV26ManageFiltersExecutionStep, AV21ColumnsSelector, AV28TFCliCod, AV29TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV34TFBarSer, AV35TFBarSer_Sel, AV37TFBarSerDsc, AV38TFBarSerDsc_Sel, AV40TFBarColNom, AV41TFBarColNom_Sel, AV43TFBarColNum, AV44TFBarColNum_To, AV46TFBarNomCli, AV47TFBarNomCli_Sel, AV49TFBarNHdr, AV50TFBarNHdr_Sel, AV62TFRecAcab_Sels, AV88Pgmname, AV14OrderedBy, AV15OrderedDsc, AV8Proforcod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV88Pgmname = "FormulacionTinte.WCSituacionProcesoQuimicoRecetas" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupQ30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19Q32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV24ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV55DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV21ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV57GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV58GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8Proforcod = httpContext.cgiGet( sPrefix+"wcpOAV8Proforcod") ;
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
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( sPrefix+"DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV63FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV63FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e19Q32 ();
      if (returnInSub) return;
   }

   public void e19Q32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_char1[0] = AV59ProforDsc ;
      new app.pprofordsc(remoteHandle, context).execute( AV7Emprcod, AV8Proforcod, GXv_char1) ;
      wcsituacionprocesoquimicorecetas_impl.this.AV59ProforDsc = GXv_char1[0] ;
      GXt_char2 = AV67Station ;
      GXv_char1[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char1) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char2 = GXv_char1[0] ;
      AV67Station = GXt_char2 ;
      GXv_char1[0] = AV7Emprcod ;
      GXv_char3[0] = AV68Emprnom ;
      GXv_char4[0] = AV69Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char1, GXv_char3, GXv_char4) ;
      wcsituacionprocesoquimicorecetas_impl.this.AV7Emprcod = GXv_char1[0] ;
      wcsituacionprocesoquimicorecetas_impl.this.AV68Emprnom = GXv_char3[0] ;
      wcsituacionprocesoquimicorecetas_impl.this.AV69Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      subGrid_Rows = 10 ;
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
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV55DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV55DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20Q32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV26ManageFiltersExecutionStep == 1 )
      {
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV26ManageFiltersExecutionStep == 2 )
      {
         AV26ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV23Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector"), "") != 0 )
      {
         AV19ColumnsSelectorXML = AV23Session.getValue("FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector") ;
         AV21ColumnsSelector.fromxml(AV19ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNHdr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      cmbRecAcab.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV21ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRecAcab.getInternalname(), "Visible", GXutil.ltrimstr( cmbRecAcab.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      AV57GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridCurrentPage), 10, 0));
      AV58GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridPageCount), 10, 0));
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = AV63FilterFullText ;
      AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod = AV28TFCliCod ;
      AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to = AV29TFCliCod_To ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = AV31TFCliNom ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = AV32TFCliNom_Sel ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = AV34TFBarSer ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = AV35TFBarSer_Sel ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = AV37TFBarSerDsc ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = AV38TFBarSerDsc_Sel ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = AV40TFBarColNom ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = AV41TFBarColNom_Sel ;
      AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum = AV43TFBarColNum ;
      AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to = AV44TFBarColNum_To ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = AV46TFBarNomCli ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = AV47TFBarNomCli_Sel ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = AV49TFBarNHdr ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = AV50TFBarNHdr_Sel ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = AV62TFRecAcab_Sels ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e13Q32( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV56PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV56PageToGo) ;
      }
   }

   public void e14Q32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15Q32( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV31TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom", AV31TFCliNom);
            AV32TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom_Sel", AV32TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV34TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSer", AV34TFBarSer);
            AV35TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSer_Sel", AV35TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV37TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarSerDsc", AV37TFBarSerDsc);
            AV38TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarSerDsc_Sel", AV38TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV40TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
            AV41TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV43TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum), 6, 0));
            AV44TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV46TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
            AV47TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV49TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarNHdr", AV49TFBarNHdr);
            AV50TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarNHdr_Sel", AV50TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecAcab") == 0 )
         {
            AV61TFRecAcab_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFRecAcab_SelsJson", AV61TFRecAcab_SelsJson);
            AV62TFRecAcab_Sels.fromJSonString(AV61TFRecAcab_SelsJson, null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62TFRecAcab_Sels", AV62TFRecAcab_Sels);
   }

   private void e21Q32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
   }

   public void e16Q32( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV19ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV21ColumnsSelector.fromJSonString(AV19ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector", ((GXutil.strcmp("", AV19ColumnsSelectorXML)==0) ? "" : AV21ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e12Q32( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCSituacionProcesoQuimicoRecetasFilters")),GXutil.URLEncode(GXutil.rtrim(AV88Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.WCSituacionProcesoQuimicoRecetasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV26ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26ManageFiltersExecutionStep", GXutil.str( AV26ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char2 = AV25ManageFiltersXml ;
         GXv_char4[0] = GXt_char2 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcsituacionprocesoquimicorecetas_impl.this.GXt_char2 = GXv_char4[0] ;
         AV25ManageFiltersXml = GXt_char2 ;
         if ( (GXutil.strcmp("", AV25ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV88Pgmname+"GridState", AV25ManageFiltersXml) ;
            AV12GridState.fromxml(AV25ManageFiltersXml, null, null);
            AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
            AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV62TFRecAcab_Sels", AV62TFRecAcab_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ColumnsSelector", AV21ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV24ManageFiltersData", AV24ManageFiltersData);
   }

   public void e17Q32( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV17ExcelFilename ;
      GXv_char3[0] = AV18ErrorMessage ;
      new app.formulaciontinte.wcsituacionprocesoquimicorecetasexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcsituacionprocesoquimicorecetas_impl.this.AV17ExcelFilename = GXv_char4[0] ;
      wcsituacionprocesoquimicorecetas_impl.this.AV18ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV17ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV17ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV18ErrorMessage);
      }
   }

   public void e18Q32( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.formulaciontinte.wcsituacionprocesoquimicorecetasexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV21ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliCod", "", "Cliente", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "CliNom", "", "Nombre Cliente", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSer", "", "Serie", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNom", "", "Nombre Color", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarColNum", "", "Numero del Color", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNomCli", "", "Nombre Color Cliente", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarNHdr", "", "N Hdr", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecAcab", "", "", true, "") ;
      AV21ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char2 = AV20UserCustomValue ;
      GXv_char4[0] = GXt_char2 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasColumnsSelector", GXv_char4) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char2 = GXv_char4[0] ;
      AV20UserCustomValue = GXt_char2 ;
      if ( ! ( (GXutil.strcmp("", AV20UserCustomValue)==0) ) )
      {
         AV22ColumnsSelectorAux.fromxml(AV20UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV22ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV21ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV22ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV21ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV24ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.WCSituacionProcesoQuimicoRecetasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV24ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV63FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
      AV28TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
      AV29TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
      AV31TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom", AV31TFCliNom);
      AV32TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom_Sel", AV32TFCliNom_Sel);
      AV34TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSer", AV34TFBarSer);
      AV35TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSer_Sel", AV35TFBarSer_Sel);
      AV37TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarSerDsc", AV37TFBarSerDsc);
      AV38TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarSerDsc_Sel", AV38TFBarSerDsc_Sel);
      AV40TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
      AV41TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
      AV43TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum), 6, 0));
      AV44TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarColNum_To), 6, 0));
      AV46TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
      AV47TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
      AV49TFBarNHdr = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarNHdr", AV49TFBarNHdr);
      AV50TFBarNHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarNHdr_Sel", AV50TFBarNHdr_Sel);
      AV62TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV23Session.getValue(AV88Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV88Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV23Session.getValue(AV88Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV12GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV12GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV12GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV89GXV1 = 1 ;
      while ( AV89GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV89GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV63FilterFullText = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63FilterFullText", AV63FilterFullText);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV28TFCliCod = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFCliCod), 6, 0));
            AV29TFCliCod_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV31TFCliNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFCliNom", AV31TFCliNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV32TFCliNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFCliNom_Sel", AV32TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV34TFBarSer = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFBarSer", AV34TFBarSer);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV35TFBarSer_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFBarSer_Sel", AV35TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV37TFBarSerDsc = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFBarSerDsc", AV37TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV38TFBarSerDsc_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFBarSerDsc_Sel", AV38TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV40TFBarColNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFBarColNom", AV40TFBarColNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV41TFBarColNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFBarColNom_Sel", AV41TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV43TFBarColNum = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFBarColNum), 6, 0));
            AV44TFBarColNum_To = (int)(GXutil.lval( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV46TFBarNomCli = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarNomCli", AV46TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV47TFBarNomCli_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarNomCli_Sel", AV47TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV49TFBarNHdr = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarNHdr", AV49TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV50TFBarNHdr_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarNHdr_Sel", AV50TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECACAB_SEL") == 0 )
         {
            AV61TFRecAcab_SelsJson = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFRecAcab_SelsJson", AV61TFRecAcab_SelsJson);
            AV62TFRecAcab_Sels.fromJSonString(AV61TFRecAcab_SelsJson, null);
         }
         AV89GXV1 = (int)(AV89GXV1+1) ;
      }
      GXt_char2 = "" ;
      GXv_char4[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliNom_Sel)==0), AV32TFCliNom_Sel, GXv_char4) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char2 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSer_Sel)==0), AV35TFBarSer_Sel, GXv_char3) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char1[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarSerDsc_Sel)==0), AV38TFBarSerDsc_Sel, GXv_char1) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char13 = GXv_char1[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, GXv_char15) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, GXv_char17) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarNHdr_Sel)==0), AV50TFBarNHdr_Sel, GXv_char19) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV62TFRecAcab_Sels.size()==0), AV61TFRecAcab_SelsJson, GXv_char21) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char2+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFCliNom)==0), AV31TFCliNom, GXv_char21) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSer)==0), AV34TFBarSer, GXv_char19) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarSerDsc)==0), AV37TFBarSerDsc, GXv_char17) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarColNom)==0), AV40TFBarColNom, GXv_char15) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFBarNomCli)==0), AV46TFBarNomCli, GXv_char4) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFBarNHdr)==0), AV49TFBarNHdr, GXv_char3) ;
      wcsituacionprocesoquimicorecetas_impl.this.GXt_char12 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFCliCod) ? "" : GXutil.str( AV28TFCliCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char14+"|"+((0==AV43TFBarColNum) ? "" : GXutil.str( AV43TFBarColNum, 6, 0))+"|"+GXt_char13+"|"+GXt_char12+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFCliCod_To) ? "" : GXutil.str( AV29TFCliCod_To, 6, 0))+"|||||"+((0==AV44TFBarColNum_To) ? "" : GXutil.str( AV44TFBarColNum_To, 6, 0))+"|||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV23Session.getValue(AV88Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV63FilterFullText)==0), (short)(0), AV63FilterFullText, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV28TFCliCod)&&(0==AV29TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV29TFCliCod_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV31TFCliNom)==0), (short)(0), AV31TFCliNom, "", !(GXutil.strcmp("", AV32TFCliNom_Sel)==0), AV32TFCliNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSER", "", !(GXutil.strcmp("", AV34TFBarSer)==0), (short)(0), AV34TFBarSer, "", !(GXutil.strcmp("", AV35TFBarSer_Sel)==0), AV35TFBarSer_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSERDSC", "", !(GXutil.strcmp("", AV37TFBarSerDsc)==0), (short)(0), AV37TFBarSerDsc, "", !(GXutil.strcmp("", AV38TFBarSerDsc_Sel)==0), AV38TFBarSerDsc_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV40TFBarColNom)==0), (short)(0), AV40TFBarColNom, "", !(GXutil.strcmp("", AV41TFBarColNom_Sel)==0), AV41TFBarColNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNUM", "", !((0==AV43TFBarColNum)&&(0==AV44TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV43TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV44TFBarColNum_To, 6, 0))) ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV46TFBarNomCli)==0), (short)(0), AV46TFBarNomCli, "", !(GXutil.strcmp("", AV47TFBarNomCli_Sel)==0), AV47TFBarNomCli_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNHDR", "", !(GXutil.strcmp("", AV49TFBarNHdr)==0), (short)(0), AV49TFBarNHdr, "", !(GXutil.strcmp("", AV50TFBarNHdr_Sel)==0), AV50TFBarNHdr_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFRECACAB_SEL", "", !(AV62TFRecAcab_Sels.size()==0), (short)(0), AV62TFRecAcab_Sels.toJSonString(false), "") ;
      AV12GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8Proforcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PROFORCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8Proforcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      AV12GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV12GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV88Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV88Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TRECETA" );
      AV23Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_Q32( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV24ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_Q32( true) ;
      }
      else
      {
         wb_table2_30_Q32( false) ;
      }
      return  ;
   }

   public void wb_table2_30_Q32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_Q32e( true) ;
      }
      else
      {
         wb_table1_25_Q32e( false) ;
      }
   }

   public void wb_table2_30_Q32( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV63FilterFullText, GXutil.rtrim( localUtil.format( AV63FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\WCSituacionProcesoQuimicoRecetas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_Q32e( true) ;
      }
      else
      {
         wb_table2_30_Q32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8Proforcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Proforcod", AV8Proforcod);
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
      paQ32( ) ;
      wsQ32( ) ;
      weQ32( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8Proforcod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paQ32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "formulaciontinte\\wcsituacionprocesoquimicorecetas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paQ32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8Proforcod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Proforcod", AV8Proforcod);
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8Proforcod = httpContext.cgiGet( sPrefix+"wcpOAV8Proforcod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || ( GXutil.strcmp(AV8Proforcod, wcpOAV8Proforcod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8Proforcod = AV8Proforcod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8Proforcod = httpContext.cgiGet( sPrefix+"AV8Proforcod_CTRL") ;
      if ( GXutil.len( sCtrlAV8Proforcod) > 0 )
      {
         AV8Proforcod = httpContext.cgiGet( sCtrlAV8Proforcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8Proforcod", AV8Proforcod);
      }
      else
      {
         AV8Proforcod = httpContext.cgiGet( sPrefix+"AV8Proforcod_PARM") ;
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
      paQ32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsQ32( ) ;
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
      wsQ32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Proforcod_PARM", GXutil.rtrim( AV8Proforcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8Proforcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8Proforcod_CTRL", GXutil.rtrim( sCtrlAV8Proforcod));
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
      weQ32( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115565295", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/wcsituacionprocesoquimicorecetas.js", "?202682115565295", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_43_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_43_idx ;
      edtRecVolPrf_Internalname = sPrefix+"RECVOLPRF_"+sGXsfl_43_idx ;
      cmbRecAcab.setInternalname( sPrefix+"RECACAB_"+sGXsfl_43_idx );
   }

   public void subsflControlProps_fel_432( )
   {
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_fel_idx ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR_"+sGXsfl_43_fel_idx ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ_"+sGXsfl_43_fel_idx ;
      edtRecVolPrf_Internalname = sPrefix+"RECVOLPRF_"+sGXsfl_43_fel_idx ;
      cmbRecAcab.setInternalname( sPrefix+"RECACAB_"+sGXsfl_43_fel_idx );
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wbQ30( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNomCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarNHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecVolPrf_Internalname,GXutil.ltrim( localUtil.ntoc( A4695RecVolPrf, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4695RecVolPrf), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecVolPrf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbRecAcab.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbRecAcab.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "RECACAB_" + sGXsfl_43_idx ;
            cmbRecAcab.setName( GXCCtl );
            cmbRecAcab.setWebtags( "" );
            cmbRecAcab.addItem("N", httpContext.getMessage( "Receta Tinte", ""), (short)(0));
            cmbRecAcab.addItem("S", httpContext.getMessage( "Receta acabado", ""), (short)(0));
            if ( cmbRecAcab.getItemCount() > 0 )
            {
               A6039RecAcab = cmbRecAcab.getValidValue(A6039RecAcab) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbRecAcab,cmbRecAcab.getInternalname(),GXutil.rtrim( A6039RecAcab),Integer.valueOf(1),cmbRecAcab.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbRecAcab.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbRecAcab.setValue( GXutil.rtrim( A6039RecAcab) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbRecAcab.getInternalname(), "Values", cmbRecAcab.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         send_integrity_lvl_hashesQ32( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero del Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbRecAcab.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNomCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4695RecVolPrf, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6039RecAcab));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbRecAcab.getVisible(), (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarNHdr_Internalname = sPrefix+"BARNHDR" ;
      edtRecLinMaq_Internalname = sPrefix+"RECLINMAQ" ;
      edtRecVolPrf_Internalname = sPrefix+"RECVOLPRF" ;
      cmbRecAcab.setInternalname( sPrefix+"RECACAB" );
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
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
      cmbRecAcab.setJsonclick( "" );
      edtRecVolPrf_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbRecAcab.setVisible( -1 );
      edtBarNHdr_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.WCSituacionProcesoQuimicoRecetasGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||N:Receta Tinte,S:Receta acabado" ;
      Ddo_grid_Allowmultipleselection = "||||||||T" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|Dynamic|FixedValues" ;
      Ddo_grid_Includedatalist = "|T|T|T|T||T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||T|||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Character|Numeric|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7||8" ;
      Ddo_grid_Columnids = "0:CliCod|1:CliNom|2:BarSer|3:BarSerDsc|4:BarColNom|5:BarColNum|6:BarNomCli|7:BarNHdr|10:RecAcab" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
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
      subGrid_Rows = 0 ;
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
      GXCCtl = "RECACAB_" + sGXsfl_43_idx ;
      cmbRecAcab.setName( GXCCtl );
      cmbRecAcab.setWebtags( "" );
      cmbRecAcab.addItem("N", httpContext.getMessage( "Receta Tinte", ""), (short)(0));
      cmbRecAcab.addItem("S", httpContext.getMessage( "Receta acabado", ""), (short)(0));
      if ( cmbRecAcab.getItemCount() > 0 )
      {
      }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'cmbRecAcab'},{av:'AV57GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV58GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13Q32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14Q32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15Q32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TFRecAcab_SelsJson',fld:'vTFRECACAB_SELSJSON',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21Q32',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16Q32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'cmbRecAcab'},{av:'AV57GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV58GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e12Q32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'AV88Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV8Proforcod',fld:'vPROFORCOD',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TFRecAcab_SelsJson',fld:'vTFRECACAB_SELSJSON',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV26ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV29TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV35TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV37TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV38TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV40TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV41TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV43TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV44TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV46TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV47TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV49TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV50TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV62TFRecAcab_Sels',fld:'vTFRECACAB_SELS',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV61TFRecAcab_SelsJson',fld:'vTFRECACAB_SELSJSON',pic:''},{av:'AV21ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarNHdr_Visible',ctrl:'BARNHDR',prop:'Visible'},{av:'cmbRecAcab'},{av:'AV57GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV58GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17Q32',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e11Q31',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18Q32',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recacab',iparms:[]");
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
      wcpOAV7Emprcod = "" ;
      wcpOAV8Proforcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV8Proforcod = "" ;
      AV63FilterFullText = "" ;
      AV21ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31TFCliNom = "" ;
      AV32TFCliNom_Sel = "" ;
      AV34TFBarSer = "" ;
      AV35TFBarSer_Sel = "" ;
      AV37TFBarSerDsc = "" ;
      AV38TFBarSerDsc_Sel = "" ;
      AV40TFBarColNom = "" ;
      AV41TFBarColNom_Sel = "" ;
      AV46TFBarNomCli = "" ;
      AV47TFBarNomCli_Sel = "" ;
      AV49TFBarNHdr = "" ;
      AV50TFBarNHdr_Sel = "" ;
      AV62TFRecAcab_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV24ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV55DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV61TFRecAcab_SelsJson = "" ;
      A130BarCodPar = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A13696BarNHdr = "" ;
      A6039RecAcab = "" ;
      AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext = "" ;
      AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel = "" ;
      AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom = "" ;
      AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel = "" ;
      AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser = "" ;
      AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel = "" ;
      AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc = "" ;
      AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel = "" ;
      AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom = "" ;
      AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel = "" ;
      AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli = "" ;
      AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel = "" ;
      AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr = "" ;
      A396EmprCod = "" ;
      H00Q32_A396EmprCod = new String[] {""} ;
      H00Q32_A1234BarNomCli = new String[] {""} ;
      H00Q32_A136BarColNum = new int[1] ;
      H00Q32_A135BarColNom = new String[] {""} ;
      H00Q32_A1652BarSerDsc = new String[] {""} ;
      H00Q32_A212BarSer = new String[] {""} ;
      H00Q32_A279CliNom = new String[] {""} ;
      H00Q32_A252CliCod = new int[1] ;
      H00Q32_n252CliCod = new boolean[] {false} ;
      H00Q32_A130BarCodPar = new String[] {""} ;
      H00Q32_A132BarCodReo = new byte[1] ;
      H00Q32_A129BarCod = new int[1] ;
      H00Q33_AGRID_nRecordCount = new long[1] ;
      AV59ProforDsc = "" ;
      AV67Station = "" ;
      AV68Emprnom = "" ;
      AV69Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV23Session = httpContext.getWebSession();
      AV19ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV25ManageFiltersXml = "" ;
      AV17ExcelFilename = "" ;
      AV18ErrorMessage = "" ;
      AV20UserCustomValue = "" ;
      AV22ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char2 = "" ;
      GXv_char1 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8Proforcod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.wcsituacionprocesoquimicorecetas__default(),
         new Object[] {
             new Object[] {
            H00Q32_A396EmprCod, H00Q32_A1234BarNomCli, H00Q32_A136BarColNum, H00Q32_A135BarColNom, H00Q32_A1652BarSerDsc, H00Q32_A212BarSer, H00Q32_A279CliNom, H00Q32_A252CliCod, H00Q32_n252CliCod, H00Q32_A130BarCodPar,
            H00Q32_A132BarCodReo, H00Q32_A129BarCod
            }
            , new Object[] {
            H00Q33_AGRID_nRecordCount
            }
         }
      );
      AV88Pgmname = "FormulacionTinte.WCSituacionProcesoQuimicoRecetas" ;
      /* GeneXus formulas. */
      AV88Pgmname = "FormulacionTinte.WCSituacionProcesoQuimicoRecetas" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV26ManageFiltersExecutionStep ;
   private byte A132BarCodReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV14OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A2804RecLinMaq ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV28TFCliCod ;
   private int AV29TFCliCod_To ;
   private int AV43TFBarColNum ;
   private int AV44TFBarColNum_To ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A4695RecVolPrf ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ;
   private int AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ;
   private int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ;
   private int AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ;
   private int AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarNHdr_Visible ;
   private int AV56PageToGo ;
   private int AV89GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV57GridCurrentPage ;
   private long AV58GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV7Emprcod ;
   private String wcpOAV8Proforcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String AV8Proforcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV31TFCliNom ;
   private String AV32TFCliNom_Sel ;
   private String AV34TFBarSer ;
   private String AV35TFBarSer_Sel ;
   private String AV37TFBarSerDsc ;
   private String AV38TFBarSerDsc_Sel ;
   private String AV40TFBarColNom ;
   private String AV41TFBarColNom_Sel ;
   private String AV46TFBarNomCli ;
   private String AV47TFBarNomCli_Sel ;
   private String AV49TFBarNHdr ;
   private String AV50TFBarNHdr_Sel ;
   private String AV88Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A130BarCodPar ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecVolPrf_Internalname ;
   private String A6039RecAcab ;
   private String scmdbuf ;
   private String lV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String lV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String lV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String lV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String lV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String lV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ;
   private String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ;
   private String AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ;
   private String AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ;
   private String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ;
   private String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ;
   private String AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ;
   private String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ;
   private String AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ;
   private String AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ;
   private String AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ;
   private String AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ;
   private String A396EmprCod ;
   private String AV59ProforDsc ;
   private String AV67Station ;
   private String AV68Emprnom ;
   private String AV69Usurcod ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8Proforcod ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarNHdr_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecVolPrf_Jsonclick ;
   private String GXCCtl ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV61TFRecAcab_SelsJson ;
   private String AV19ColumnsSelectorXML ;
   private String AV25ManageFiltersXml ;
   private String AV20UserCustomValue ;
   private String AV63FilterFullText ;
   private String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ;
   private String AV17ExcelFilename ;
   private String AV18ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV23Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private GXSimpleCollection<String> AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ;
   private HTMLChoice cmbRecAcab ;
   private IDataStoreProvider pr_default ;
   private String[] H00Q32_A396EmprCod ;
   private String[] H00Q32_A1234BarNomCli ;
   private int[] H00Q32_A136BarColNum ;
   private String[] H00Q32_A135BarColNom ;
   private String[] H00Q32_A1652BarSerDsc ;
   private String[] H00Q32_A212BarSer ;
   private String[] H00Q32_A279CliNom ;
   private int[] H00Q32_A252CliCod ;
   private boolean[] H00Q32_n252CliCod ;
   private String[] H00Q32_A130BarCodPar ;
   private byte[] H00Q32_A132BarCodReo ;
   private int[] H00Q32_A129BarCod ;
   private long[] H00Q33_AGRID_nRecordCount ;
   private GXSimpleCollection<String> AV62TFRecAcab_Sels ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV24ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV22ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV55DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcsituacionprocesoquimicorecetas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00Q32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[22];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int23[1] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H00Q33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A6039RecAcab ,
                                          GXSimpleCollection<String> AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels ,
                                          String AV70Formulaciontinte_wcsituacionprocesoquimicorecetasds_1_filterfulltext ,
                                          int AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod ,
                                          int AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to ,
                                          String AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel ,
                                          String AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom ,
                                          String AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel ,
                                          String AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser ,
                                          String AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel ,
                                          String AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc ,
                                          String AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel ,
                                          String AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom ,
                                          int AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum ,
                                          int AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to ,
                                          String AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel ,
                                          String AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli ,
                                          String AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel ,
                                          String AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr ,
                                          int AV87Formulaciontinte_wcsituacionprocesoquimicorecetasds_18_tfrecacab_sels_size ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String AV7Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[17];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV71Formulaciontinte_wcsituacionprocesoquimicorecetasds_2_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[1] = (byte)(1) ;
      }
      if ( ! (0==AV72Formulaciontinte_wcsituacionprocesoquimicorecetasds_3_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV73Formulaciontinte_wcsituacionprocesoquimicorecetasds_4_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74Formulaciontinte_wcsituacionprocesoquimicorecetasds_5_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV75Formulaciontinte_wcsituacionprocesoquimicorecetasds_6_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Formulaciontinte_wcsituacionprocesoquimicorecetasds_7_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV77Formulaciontinte_wcsituacionprocesoquimicorecetasds_8_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV78Formulaciontinte_wcsituacionprocesoquimicorecetasds_9_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV79Formulaciontinte_wcsituacionprocesoquimicorecetasds_10_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Formulaciontinte_wcsituacionprocesoquimicorecetasds_11_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_wcsituacionprocesoquimicorecetasds_12_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_wcsituacionprocesoquimicorecetasds_13_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_wcsituacionprocesoquimicorecetasds_14_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_wcsituacionprocesoquimicorecetasds_15_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_wcsituacionprocesoquimicorecetasds_16_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_wcsituacionprocesoquimicorecetasds_17_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 4 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 5 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 6 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 7 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ! AV15OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV14OrderedBy == 8 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00Q32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_H00Q33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Boolean) dynConstraints[31]).booleanValue() , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00Q32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00Q33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 11);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 13);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 13);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               return;
      }
   }

}

