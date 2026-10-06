package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webcontador_metrajepiezas_wc_impl extends GXWebComponent
{
   public webcontador_metrajepiezas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webcontador_metrajepiezas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webcontador_metrajepiezas_wc_impl.class ));
   }

   public webcontador_metrajepiezas_wc_impl( int remoteHandle ,
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
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
               AV55EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55EmprCod", AV55EmprCod);
               AV56BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarCod), 8, 0));
               AV57BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCodReo", GXutil.str( AV57BarCodReo, 1, 0));
               AV58BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodPar", AV58BarCodPar);
               AV64OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OpeCod), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV55EmprCod,Integer.valueOf(AV56BarCod),Byte.valueOf(AV57BarCodReo),AV58BarCodPar,Integer.valueOf(AV64OpeCod)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV55EmprCod = httpContext.GetPar( "EmprCod") ;
      AV56BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV57BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV58BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV28TFMetTerCod = httpContext.GetPar( "TFMetTerCod") ;
      AV29TFMetTerCod_Sel = httpContext.GetPar( "TFMetTerCod_Sel") ;
      AV36TFMetPieCod = httpContext.GetPar( "TFMetPieCod") ;
      AV37TFMetPieCod_Sel = httpContext.GetPar( "TFMetPieCod_Sel") ;
      AV38TFMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil"), ".") ;
      AV39TFMetPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieKil_To"), ".") ;
      AV40TFMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet"), ".") ;
      AV41TFMetPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMet_To"), ".") ;
      AV42TFMetPieAnc = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc"))) ;
      AV43TFMetPieAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieAnc_To"))) ;
      AV44TFMetPieMtD = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD"), ".") ;
      AV45TFMetPieMtD_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetPieMtD_To"), ".") ;
      AV46TFMetPieEst = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst"))) ;
      AV47TFMetPieEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFMetPieEst_To"))) ;
      AV48TFMetPieObs = httpContext.GetPar( "TFMetPieObs") ;
      AV49TFMetPieObs_Sel = httpContext.GetPar( "TFMetPieObs_Sel") ;
      AV59TFMetPieDfUlt = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfUlt"))) ;
      AV60TFMetPieDfUlt_To = (short)(GXutil.lval( httpContext.GetPar( "TFMetPieDfUlt_To"))) ;
      AV61TFBarUniMed = httpContext.GetPar( "TFBarUniMed") ;
      AV62TFBarUniMed_Sel = httpContext.GetPar( "TFBarUniMed_Sel") ;
      AV125Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV64OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV82GridCollapsedRecords);
      AV72TotMetPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieKil"), ".") ;
      AV74TotMetPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TotMetPieMet"), ".") ;
      AV76Grid_GroupCaption = httpContext.GetPar( "Grid_GroupCaption") ;
      AV78GroupOldMetPieEst = (byte)(GXutil.lval( httpContext.GetPar( "GroupOldMetPieEst"))) ;
      A9557ESTADO = httpContext.GetPar( "ESTADO") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV81GridCollapsedRecordsChildren);
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod") ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod"))) ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo"))) ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = httpContext.GetPar( "Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1GW2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " LMETPI", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webcontador_metrajepiezas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV55EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV64OpeCod,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","OpeCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV125Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGROUPOLDMETPIEEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78GroupOldMetPieEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55EmprCod", GXutil.rtrim( wcpOAV55EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56BarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV56BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOAV57BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58BarCodPar", GXutil.rtrim( wcpOAV58BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV64OpeCod", GXutil.ltrim( localUtil.ntoc( wcpOAV64OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV55EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV56BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV57BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV58BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD", GXutil.rtrim( AV28TFMetTerCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETTERCOD_SEL", GXutil.rtrim( AV29TFMetTerCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD", GXutil.rtrim( AV36TFMetPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIECOD_SEL", GXutil.rtrim( AV37TFMetPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV38TFMetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV39TFMetPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV40TFMetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV41TFMetPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC", GXutil.ltrim( localUtil.ntoc( AV42TFMetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEANC_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMetPieAnc_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMTD", GXutil.ltrim( localUtil.ntoc( AV44TFMetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEMTD_TO", GXutil.ltrim( localUtil.ntoc( AV45TFMetPieMtD_To, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV46TFMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEEST_TO", GXutil.ltrim( localUtil.ntoc( AV47TFMetPieEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEOBS", AV48TFMetPieObs);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEOBS_SEL", AV49TFMetPieObs_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFULT", GXutil.ltrim( localUtil.ntoc( AV59TFMetPieDfUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFMETPIEDFULT_TO", GXutil.ltrim( localUtil.ntoc( AV60TFMetPieDfUlt_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARUNIMED", GXutil.rtrim( AV61TFBarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARUNIMED_SEL", GXutil.rtrim( AV62TFBarUniMed_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV125Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV125Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPECOD", GXutil.ltrim( localUtil.ntoc( AV64OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDCOLLAPSEDRECORDS", AV82GridCollapsedRecords);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDCOLLAPSEDRECORDS", AV82GridCollapsedRecords);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV72TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV74TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGROUPOLDMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV78GroupOldMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGROUPOLDMETPIEEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78GroupOldMetPieEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ESTADO", GXutil.rtrim( A9557ESTADO));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDCOLLAPSEDRECORDSCHILDREN", AV81GridCollapsedRecordsChildren);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDCOLLAPSEDRECORDSCHILDREN", AV81GridCollapsedRecordsChildren);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGROUPMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV80GroupMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vADDCHILDREN", AV86AddChildren);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD", GXutil.rtrim( AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR", GXutil.rtrim( AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_GROUP_Gridinternalname", GXutil.rtrim( Grid_group_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_GROUP_Columnindex", GXutil.ltrim( localUtil.ntoc( Grid_group_Columnindex, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_GROUP_Totalizercolumnindexes", GXutil.rtrim( Grid_group_Totalizercolumnindexes));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hasrowgroups", GXutil.booltostr( Grid_empowerer_Hasrowgroups));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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

   public void renderHtmlCloseForm1GW2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " LMETPI", "") ;
   }

   public void wb1GW0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.expedicionesautomatizadas.webcontador_metrajepiezas_wc");
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
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1GW2( true) ;
      }
      else
      {
         wb_table1_19_1GW2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1GW2e( boolean wbgen )
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
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_61_1GW2( true) ;
      }
      else
      {
         wb_table2_61_1GW2( false) ;
      }
      return  ;
   }

   public void wb_table2_61_1GW2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0095"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0095"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_37_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0095"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_group.setProperty("ColumnIndex", Grid_group_Columnindex);
         ucGrid_group.setProperty("TotalizerColumnIndexes", Grid_group_Totalizercolumnindexes);
         ucGrid_group.render(context, "dvelop.dvgroupby", Grid_group_Internalname, sPrefix+"GRID_GROUPContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("HasRowGroups", Grid_empowerer_Hasrowgroups);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 37 )
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

   public void start1GW2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " LMETPI", ""), (short)(0)) ;
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
            strup1GW0( ) ;
         }
      }
   }

   public void ws1GW2( )
   {
      start1GW2( ) ;
      evt1GW2( ) ;
   }

   public void evt1GW2( )
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
                              strup1GW0( ) ;
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
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111GW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121GW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131GW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141GW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151GW2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavExpand_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "VEXPAND.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1GW0( ) ;
                           }
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           AV87Expand = httpContext.cgiGet( edtavExpand_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExpand_Internalname, AV87Expand);
                           AV76Grid_GroupCaption = httpContext.cgiGet( edtavGrid_groupcaption_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGrid_groupcaption_Internalname, AV76Grid_GroupCaption);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV76Grid_GroupCaption, ""))));
                           AV63DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV63DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV54GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A2809MetTerCod = httpContext.cgiGet( edtMetTerCod_Internalname) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2813MetPieCod = httpContext.cgiGet( edtMetPieCod_Internalname) ;
                           AV88MetPieCod_GroupTotalizer = httpContext.cgiGet( edtavMetpiecod_grouptotalizer_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiecod_grouptotalizer_Internalname, AV88MetPieCod_GroupTotalizer);
                           A2814MetPieKil = localUtil.ctond( httpContext.cgiGet( edtMetPieKil_Internalname)) ;
                           AV89MetPieKil_GroupTotalizer = httpContext.cgiGet( edtavMetpiekil_grouptotalizer_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiekil_grouptotalizer_Internalname, AV89MetPieKil_GroupTotalizer);
                           A2815MetPieMet = localUtil.ctond( httpContext.cgiGet( edtMetPieMet_Internalname)) ;
                           AV90MetPieMet_GroupTotalizer = httpContext.cgiGet( edtavMetpiemet_grouptotalizer_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiemet_grouptotalizer_Internalname, AV90MetPieMet_GroupTotalizer);
                           A6635MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4910MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtMetPieMtD_Internalname)) ;
                           A2816MetPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4917MetPieObs = httpContext.cgiGet( edtMetPieObs_Internalname) ;
                           A12994MetPieDfUl = (short)(localUtil.ctol( httpContext.cgiGet( edtMetPieDfUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
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
                                       GX_FocusControl = edtavExpand_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161GW2 ();
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
                                       GX_FocusControl = edtavExpand_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171GW2 ();
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
                                       GX_FocusControl = edtavExpand_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181GW2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VEXPAND.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavExpand_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e191GW2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
                                    strup1GW0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavExpand_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 95 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0095") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0095", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1GW2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1GW2( ) ;
         }
      }
   }

   public void pa1GW2( )
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
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV55EmprCod ,
                                 int AV56BarCod ,
                                 byte AV57BarCodReo ,
                                 String AV58BarCodPar ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV28TFMetTerCod ,
                                 String AV29TFMetTerCod_Sel ,
                                 String AV36TFMetPieCod ,
                                 String AV37TFMetPieCod_Sel ,
                                 java.math.BigDecimal AV38TFMetPieKil ,
                                 java.math.BigDecimal AV39TFMetPieKil_To ,
                                 java.math.BigDecimal AV40TFMetPieMet ,
                                 java.math.BigDecimal AV41TFMetPieMet_To ,
                                 short AV42TFMetPieAnc ,
                                 short AV43TFMetPieAnc_To ,
                                 java.math.BigDecimal AV44TFMetPieMtD ,
                                 java.math.BigDecimal AV45TFMetPieMtD_To ,
                                 byte AV46TFMetPieEst ,
                                 byte AV47TFMetPieEst_To ,
                                 String AV48TFMetPieObs ,
                                 String AV49TFMetPieObs_Sel ,
                                 short AV59TFMetPieDfUlt ,
                                 short AV60TFMetPieDfUlt_To ,
                                 String AV61TFBarUniMed ,
                                 String AV62TFBarUniMed_Sel ,
                                 String AV125Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 int AV64OpeCod ,
                                 GXSimpleCollection<Byte> AV82GridCollapsedRecords ,
                                 java.math.BigDecimal AV72TotMetPieKil ,
                                 java.math.BigDecimal AV74TotMetPieMet ,
                                 String AV76Grid_GroupCaption ,
                                 byte AV78GroupOldMetPieEst ,
                                 String A9557ESTADO ,
                                 GXSimpleCollection<String> AV81GridCollapsedRecordsChildren ,
                                 String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                 int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                 byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                 String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171GW2 ();
      GRID_nCurrentRecord = 0 ;
      rf1GW2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRID_GROUPCAPTION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV76Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRID_GROUPCAPTION", AV76Grid_GroupCaption);
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
      rf1GW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV125Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiecod_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiecod_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiekil_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiekil_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiekil_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiemet_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiemet_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiemet_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavTotvaluemetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiecod_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4917MetPieObs ,
                                           Short.valueOf(A12994MetPieDfUl) ,
                                           A228BarUniMed ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Integer.valueOf(AV81GridCollapsedRecordsChildren.size()) ,
                                           AV81GridCollapsedRecordsChildren ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57BarCodReo) ,
                                           A130BarCodPar ,
                                           AV58BarCodPar ,
                                           AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor H01GW2 */
      pr_default.execute(0, new Object[] {AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A228BarUniMed = H01GW2_A228BarUniMed[0] ;
         A12994MetPieDfUl = H01GW2_A12994MetPieDfUl[0] ;
         A4917MetPieObs = H01GW2_A4917MetPieObs[0] ;
         A2816MetPieEst = H01GW2_A2816MetPieEst[0] ;
         A4910MetPieMtD = H01GW2_A4910MetPieMtD[0] ;
         A6635MetPieAnc = H01GW2_A6635MetPieAnc[0] ;
         A2815MetPieMet = H01GW2_A2815MetPieMet[0] ;
         A2814MetPieKil = H01GW2_A2814MetPieKil[0] ;
         A2813MetPieCod = H01GW2_A2813MetPieCod[0] ;
         A130BarCodPar = H01GW2_A130BarCodPar[0] ;
         A132BarCodReo = H01GW2_A132BarCodReo[0] ;
         A129BarCod = H01GW2_A129BarCod[0] ;
         A2809MetTerCod = H01GW2_A2809MetTerCod[0] ;
         A396EmprCod = H01GW2_A396EmprCod[0] ;
         A228BarUniMed = H01GW2_A228BarUniMed[0] ;
         if ( ( AV81GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A2809MetTerCod+";"+A2813MetPieCod, AV81GridCollapsedRecordsChildren) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1GW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e171GW2 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_372( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                              AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                              AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                              AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                              AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                              AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                              AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                              AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                              AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                              Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                              Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                              AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                              AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                              Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                              Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                              AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                              AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                              Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                              Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                              AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                              AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                              A2809MetTerCod ,
                                              A2813MetPieCod ,
                                              A2814MetPieKil ,
                                              A2815MetPieMet ,
                                              Short.valueOf(A6635MetPieAnc) ,
                                              A4910MetPieMtD ,
                                              Byte.valueOf(A2816MetPieEst) ,
                                              A4917MetPieObs ,
                                              Short.valueOf(A12994MetPieDfUl) ,
                                              A228BarUniMed ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Integer.valueOf(AV81GridCollapsedRecordsChildren.size()) ,
                                              AV81GridCollapsedRecordsChildren ,
                                              A396EmprCod ,
                                              AV55EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV56BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV57BarCodReo) ,
                                              A130BarCodPar ,
                                              AV58BarCodPar ,
                                              AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                              Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                              Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                              AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
         lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
         lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
         lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
         lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
         /* Using cursor H01GW3 */
         pr_default.execute(1, new Object[] {AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
         nGXsfl_37_idx = 1 ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A228BarUniMed = H01GW3_A228BarUniMed[0] ;
            A12994MetPieDfUl = H01GW3_A12994MetPieDfUl[0] ;
            A4917MetPieObs = H01GW3_A4917MetPieObs[0] ;
            A2816MetPieEst = H01GW3_A2816MetPieEst[0] ;
            A4910MetPieMtD = H01GW3_A4910MetPieMtD[0] ;
            A6635MetPieAnc = H01GW3_A6635MetPieAnc[0] ;
            A2815MetPieMet = H01GW3_A2815MetPieMet[0] ;
            A2814MetPieKil = H01GW3_A2814MetPieKil[0] ;
            A2813MetPieCod = H01GW3_A2813MetPieCod[0] ;
            A130BarCodPar = H01GW3_A130BarCodPar[0] ;
            A132BarCodReo = H01GW3_A132BarCodReo[0] ;
            A129BarCod = H01GW3_A129BarCod[0] ;
            A2809MetTerCod = H01GW3_A2809MetTerCod[0] ;
            A396EmprCod = H01GW3_A396EmprCod[0] ;
            A228BarUniMed = H01GW3_A228BarUniMed[0] ;
            if ( ( AV81GridCollapsedRecordsChildren.size() <= 0 ) || ( ! new app.wwpbaseobjects.wwp_itemincollection(remoteHandle, context).executeUdp( A2809MetTerCod+";"+A2813MetPieCod, AV81GridCollapsedRecordsChildren) ) )
            {
               e181GW2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(37) ;
         wb1GW0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1GW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV125Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV125Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEKIL", GXutil.ltrim( localUtil.ntoc( AV72TotMetPieKil, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMETPIEMET", GXutil.ltrim( localUtil.ntoc( AV74TotMetPieMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV76Grid_GroupCaption, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGROUPOLDMETPIEEST", GXutil.ltrim( localUtil.ntoc( AV78GroupOldMetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGROUPOLDMETPIEEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78GroupOldMetPieEst), "9")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, AV125Pgmname, AV12OrderedBy, AV13OrderedDsc, AV64OpeCod, AV82GridCollapsedRecords, AV72TotMetPieKil, AV74TotMetPieMet, AV76Grid_GroupCaption, AV78GroupOldMetPieEst, A9557ESTADO, AV81GridCollapsedRecordsChildren, AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod, AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo, AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV125Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavExpand_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavExpand_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavGrid_groupcaption_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGrid_groupcaption_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_groupcaption_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiecod_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiecod_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiecod_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiekil_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiekil_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiekil_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMetpiemet_grouptotalizer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMetpiemet_grouptotalizer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMetpiemet_grouptotalizer_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavTotvaluemetpiecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiecod_Enabled), 5, 0), true);
      edtavTotvaluemetpiekil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiekil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiekil_Enabled), 5, 0), true);
      edtavTotvaluemetpiemet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemetpiemet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetpiemet_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1GW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161GW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV55EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV55EmprCod") ;
         wcpOAV56BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV58BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV58BarCodPar") ;
         wcpOAV64OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV55EmprCod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         AV56BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV57BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV58BarCodPar = httpContext.cgiGet( sPrefix+"vBARCODPAR") ;
         AV64OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_group_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_GROUP_Gridinternalname") ;
         Grid_group_Columnindex = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_GROUP_Columnindex"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid_group_Totalizercolumnindexes = httpContext.cgiGet( sPrefix+"GRID_GROUP_Totalizercolumnindexes") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Hasrowgroups = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hasrowgroups")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
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
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV71TotValueMetPieCod = httpContext.cgiGet( edtavTotvaluemetpiecod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValueMetPieCod", AV71TotValueMetPieCod);
         AV73TotValueMetPieKil = httpContext.cgiGet( edtavTotvaluemetpiekil_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotValueMetPieKil", AV73TotValueMetPieKil);
         AV75TotValueMetPieMet = httpContext.cgiGet( edtavTotvaluemetpiemet_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotValueMetPieMet", AV75TotValueMetPieMet);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e161GW2 ();
      if (returnInSub) return;
   }

   public void e161GW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV97Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV97Station = GXt_char1 ;
      GXv_char2[0] = AV55EmprCod ;
      GXv_char3[0] = AV98Emprnom ;
      GXv_char4[0] = AV99Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV97Station, GXv_char2, GXv_char3, GXv_char4) ;
      webcontador_metrajepiezas_wc_impl.this.AV55EmprCod = GXv_char2[0] ;
      webcontador_metrajepiezas_wc_impl.this.AV98Emprnom = GXv_char3[0] ;
      webcontador_metrajepiezas_wc_impl.this.AV99Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55EmprCod", AV55EmprCod);
      Grid_group_Gridinternalname = subGrid_Internalname ;
      ucGrid_group.sendProperty(context, sPrefix, false, Grid_group_Internalname, "GridInternalName", Grid_group_Gridinternalname);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 5 ;
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
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171GW2( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtMetTerCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetTerCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetTerCod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieCod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieKil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieKil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieKil_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieMet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieMet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMet_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieAnc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieMtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieMtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieMtD_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieEst_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieObs_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtMetPieDfUl_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieDfUl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetPieDfUl_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtBarUniMed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarUniMed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Visible), 5, 0), !bGXsfl_37_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      edtMetPieEst_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtMetPieEst_Internalname, "Columnheaderclass", edtMetPieEst_Columnheaderclass, !bGXsfl_37_Refreshing);
      AV78GroupOldMetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78GroupOldMetPieEst", GXutil.str( AV78GroupOldMetPieEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGROUPOLDMETPIEEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78GroupOldMetPieEst), "9")));
      AV76Grid_GroupCaption = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGrid_groupcaption_Internalname, AV76Grid_GroupCaption);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV76Grid_GroupCaption, ""))));
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV82GridCollapsedRecords", AV82GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81GridCollapsedRecordsChildren", AV81GridCollapsedRecordsChildren);
   }

   public void e121GW2( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e131GW2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141GW2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetTerCod") == 0 )
         {
            AV28TFMetTerCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetTerCod", AV28TFMetTerCod);
            AV29TFMetTerCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetTerCod_Sel", AV29TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieCod") == 0 )
         {
            AV36TFMetPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMetPieCod", AV36TFMetPieCod);
            AV37TFMetPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieCod_Sel", AV37TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieKil") == 0 )
         {
            AV38TFMetPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieKil", GXutil.ltrimstr( AV38TFMetPieKil, 9, 2));
            AV39TFMetPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil_To", GXutil.ltrimstr( AV39TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMet") == 0 )
         {
            AV40TFMetPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieMet", GXutil.ltrimstr( AV40TFMetPieMet, 9, 2));
            AV41TFMetPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieMet_To", GXutil.ltrimstr( AV41TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieAnc") == 0 )
         {
            AV42TFMetPieAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc), 3, 0));
            AV43TFMetPieAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieMtD") == 0 )
         {
            AV44TFMetPieMtD = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieMtD", GXutil.ltrimstr( AV44TFMetPieMtD, 8, 2));
            AV45TFMetPieMtD_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieMtD_To", GXutil.ltrimstr( AV45TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieEst") == 0 )
         {
            AV46TFMetPieEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieEst", GXutil.str( AV46TFMetPieEst, 1, 0));
            AV47TFMetPieEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieEst_To", GXutil.str( AV47TFMetPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieObs") == 0 )
         {
            AV48TFMetPieObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieObs", AV48TFMetPieObs);
            AV49TFMetPieObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieObs_Sel", AV49TFMetPieObs_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MetPieDfUlt") == 0 )
         {
            AV59TFMetPieDfUlt = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMetPieDfUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFMetPieDfUlt), 4, 0));
            AV60TFMetPieDfUlt_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMetPieDfUlt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFMetPieDfUlt_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarUniMed") == 0 )
         {
            AV61TFBarUniMed = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarUniMed", AV61TFBarUniMed);
            AV62TFBarUniMed_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarUniMed_Sel", AV62TFBarUniMed_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181GW2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV77CalculateTotalizers = (boolean)(((GXutil.strcmp("", AV76Grid_GroupCaption)==0)||(AV78GroupOldMetPieEst!=A2816MetPieEst))) ;
         if ( AV77CalculateTotalizers )
         {
            AV76Grid_GroupCaption = A9557ESTADO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavGrid_groupcaption_Internalname, AV76Grid_GroupCaption);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRID_GROUPCAPTION"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV76Grid_GroupCaption, ""))));
            GXv_char4[0] = AV88MetPieCod_GroupTotalizer ;
            GXv_char3[0] = AV89MetPieKil_GroupTotalizer ;
            GXv_char2[0] = AV90MetPieMet_GroupTotalizer ;
            new app.expedicionesautomatizadas.webcontador_metrajepiezas_wccalcgrptot(remoteHandle, context).execute( A2816MetPieEst, AV55EmprCod, AV56BarCod, AV57BarCodReo, AV58BarCodPar, AV15FilterFullText, AV28TFMetTerCod, AV29TFMetTerCod_Sel, AV36TFMetPieCod, AV37TFMetPieCod_Sel, AV38TFMetPieKil, AV39TFMetPieKil_To, AV40TFMetPieMet, AV41TFMetPieMet_To, AV42TFMetPieAnc, AV43TFMetPieAnc_To, AV44TFMetPieMtD, AV45TFMetPieMtD_To, AV46TFMetPieEst, AV47TFMetPieEst_To, AV48TFMetPieObs, AV49TFMetPieObs_Sel, AV59TFMetPieDfUlt, AV60TFMetPieDfUlt_To, AV61TFBarUniMed, AV62TFBarUniMed_Sel, GXv_char4, GXv_char3, GXv_char2) ;
            webcontador_metrajepiezas_wc_impl.this.AV88MetPieCod_GroupTotalizer = GXv_char4[0] ;
            webcontador_metrajepiezas_wc_impl.this.AV89MetPieKil_GroupTotalizer = GXv_char3[0] ;
            webcontador_metrajepiezas_wc_impl.this.AV90MetPieMet_GroupTotalizer = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiecod_grouptotalizer_Internalname, AV88MetPieCod_GroupTotalizer);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiekil_grouptotalizer_Internalname, AV89MetPieKil_GroupTotalizer);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMetpiemet_grouptotalizer_Internalname, AV90MetPieMet_GroupTotalizer);
            AV78GroupOldMetPieEst = A2816MetPieEst ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78GroupOldMetPieEst", GXutil.str( AV78GroupOldMetPieEst, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGROUPOLDMETPIEEST", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV78GroupOldMetPieEst), "9")));
         }
         AV83Index = AV82GridCollapsedRecords.indexof(A2816MetPieEst) ;
         AV87Expand = ((AV83Index>0) ? "<i class=\"fas fa-angle-right\"></i>" : "<i class=\"fas fa-angle-down\"></i>") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavExpand_Internalname, AV87Expand);
         edtavExpand_Columnclass = ((AV83Index>0) ? "WWPExpand" : "WWPCollapse") ;
         AV63DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV63DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", httpContext.getMessage( "Etiquetas", ""), (short)(0));
         if ( A2816MetPieEst == 0 )
         {
            edtMetPieEst_Columnclass = "WWColumn hidden-xs WWColumnTag WWColumnTagInfoLight WWColumnTagInfoLightSingleCell" ;
         }
         else if ( A2816MetPieEst == 1 )
         {
            edtMetPieEst_Columnclass = "WWColumn hidden-xs WWColumnTag WWColumnTagSuccess WWColumnTagSuccessSingleCell" ;
         }
         else
         {
            edtMetPieEst_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         }
         if ( AV81GridCollapsedRecordsChildren.size() == 0 )
         {
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(37) ;
         }
         sendrow_372( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
      {
         httpContext.doAjaxLoad(37, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV54GridActions, 4, 0)) );
   }

   public void e151GW2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV82GridCollapsedRecords", AV82GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81GridCollapsedRecordsChildren", AV81GridCollapsedRecordsChildren);
   }

   public void e111GW2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV125Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webcontador_metrajepiezas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV125Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            AV82GridCollapsedRecords.fromJSonString(AV10GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
            if ( AV82GridCollapsedRecords.size() > 0 )
            {
               AV86AddChildren = true ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86AddChildren", AV86AddChildren);
               AV126GXV1 = 1 ;
               while ( AV126GXV1 <= AV82GridCollapsedRecords.size() )
               {
                  AV80GroupMetPieEst = ((Number) AV82GridCollapsedRecords.elementAt(-1+AV126GXV1)).byteValue() ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80GroupMetPieEst", GXutil.str( AV80GroupMetPieEst, 1, 0));
                  /* Execute user subroutine: 'ADDREMOVECHILDREN' */
                  S222 ();
                  if (returnInSub) return;
                  AV126GXV1 = (int)(AV126GXV1+1) ;
               }
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV82GridCollapsedRecords", AV82GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81GridCollapsedRecordsChildren", AV81GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e191GW2( )
   {
      /* Expand_Click Routine */
      returnInSub = false ;
      AV80GroupMetPieEst = A2816MetPieEst ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80GroupMetPieEst", GXutil.str( AV80GroupMetPieEst, 1, 0));
      AV83Index = AV82GridCollapsedRecords.indexof(A2816MetPieEst) ;
      if ( AV83Index > 0 )
      {
         AV82GridCollapsedRecords.removeItem((int)(AV83Index));
      }
      else
      {
         AV82GridCollapsedRecords.add((byte)(A2816MetPieEst), 0);
      }
      AV86AddChildren = (0==AV83Index) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86AddChildren", AV86AddChildren);
      /* Execute user subroutine: 'ADDREMOVECHILDREN' */
      S222 ();
      if (returnInSub) return;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV82GridCollapsedRecords", AV82GridCollapsedRecords);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV81GridCollapsedRecordsChildren", AV81GridCollapsedRecordsChildren);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetTerCod", "", "Terminal", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieCod", "", "Pieza", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieKil", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieMet", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieAnc", "", "Ancho Final", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieMtD", "", "Grm2", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieEst", "", "Estado", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieObs", "", "Observaciones", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "MetPieDfUlt", "", "Ultima Linea", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarUniMed", "", "Und", false, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCColumnsSelector", GXv_char4) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV28TFMetTerCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetTerCod", AV28TFMetTerCod);
      AV29TFMetTerCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetTerCod_Sel", AV29TFMetTerCod_Sel);
      AV36TFMetPieCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMetPieCod", AV36TFMetPieCod);
      AV37TFMetPieCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieCod_Sel", AV37TFMetPieCod_Sel);
      AV38TFMetPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieKil", GXutil.ltrimstr( AV38TFMetPieKil, 9, 2));
      AV39TFMetPieKil_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil_To", GXutil.ltrimstr( AV39TFMetPieKil_To, 9, 2));
      AV40TFMetPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieMet", GXutil.ltrimstr( AV40TFMetPieMet, 9, 2));
      AV41TFMetPieMet_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieMet_To", GXutil.ltrimstr( AV41TFMetPieMet_To, 9, 2));
      AV42TFMetPieAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc), 3, 0));
      AV43TFMetPieAnc_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMetPieAnc_To), 3, 0));
      AV44TFMetPieMtD = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieMtD", GXutil.ltrimstr( AV44TFMetPieMtD, 8, 2));
      AV45TFMetPieMtD_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieMtD_To", GXutil.ltrimstr( AV45TFMetPieMtD_To, 8, 2));
      AV46TFMetPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieEst", GXutil.str( AV46TFMetPieEst, 1, 0));
      AV47TFMetPieEst_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieEst_To", GXutil.str( AV47TFMetPieEst_To, 1, 0));
      AV48TFMetPieObs = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieObs", AV48TFMetPieObs);
      AV49TFMetPieObs_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieObs_Sel", AV49TFMetPieObs_Sel);
      AV59TFMetPieDfUlt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMetPieDfUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFMetPieDfUlt), 4, 0));
      AV60TFMetPieDfUlt_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMetPieDfUlt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFMetPieDfUlt_To), 4, 0));
      AV61TFBarUniMed = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarUniMed", AV61TFBarUniMed);
      AV62TFBarUniMed_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarUniMed_Sel", AV62TFBarUniMed_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV82GridCollapsedRecords = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV81GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
   }

   public void S212( )
   {
      /* 'DO ETIQUETAS' Routine */
      returnInSub = false ;
      AV65window.setPosition( 1 );
      AV65window.setWidth( 600 );
      AV65window.setHeight( 400 );
      AV65window.setLeft( 400 );
      AV65window.setTop( 200 );
      AV65window.setAutoresize( 0 );
      AV65window.setUrl( formatLink("app.petctram", new String[] {GXutil.URLEncode(GXutil.rtrim(AV55EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV56BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV57BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV58BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A2813MetPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A2814MetPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A2815MetPieMet)),GXutil.URLEncode(GXutil.ltrimstr(AV64OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "PRN", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","MetPiecod","MetPieKil","MetPieMet","Opecod","Output"})  );
      AV65window.setReturnParms(new Object[] {"AV55EmprCod","AV56BarCod","AV57BarCodReo","AV58BarCodPar","A2813MetPieCod","A2814MetPieKil","A2815MetPieMet","AV64OpeCod",""});
      httpContext.newWindow(AV65window);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV125Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV125Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV125Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
      AV82GridCollapsedRecords.fromJSonString(AV10GridState.getgxTv_SdtWWPGridState_Collapsedrecords(), null);
      if ( AV82GridCollapsedRecords.size() > 0 )
      {
         AV86AddChildren = true ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86AddChildren", AV86AddChildren);
         AV127GXV2 = 1 ;
         while ( AV127GXV2 <= AV82GridCollapsedRecords.size() )
         {
            AV80GroupMetPieEst = ((Number) AV82GridCollapsedRecords.elementAt(-1+AV127GXV2)).byteValue() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80GroupMetPieEst", GXutil.str( AV80GroupMetPieEst, 1, 0));
            /* Execute user subroutine: 'ADDREMOVECHILDREN' */
            S222 ();
            if (returnInSub) return;
            AV127GXV2 = (int)(AV127GXV2+1) ;
         }
      }
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV128GXV3 = 1 ;
      while ( AV128GXV3 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV128GXV3));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD") == 0 )
         {
            AV28TFMetTerCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFMetTerCod", AV28TFMetTerCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETTERCOD_SEL") == 0 )
         {
            AV29TFMetTerCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFMetTerCod_Sel", AV29TFMetTerCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD") == 0 )
         {
            AV36TFMetPieCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFMetPieCod", AV36TFMetPieCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIECOD_SEL") == 0 )
         {
            AV37TFMetPieCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFMetPieCod_Sel", AV37TFMetPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEKIL") == 0 )
         {
            AV38TFMetPieKil = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFMetPieKil", GXutil.ltrimstr( AV38TFMetPieKil, 9, 2));
            AV39TFMetPieKil_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFMetPieKil_To", GXutil.ltrimstr( AV39TFMetPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMET") == 0 )
         {
            AV40TFMetPieMet = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFMetPieMet", GXutil.ltrimstr( AV40TFMetPieMet, 9, 2));
            AV41TFMetPieMet_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFMetPieMet_To", GXutil.ltrimstr( AV41TFMetPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEANC") == 0 )
         {
            AV42TFMetPieAnc = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFMetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFMetPieAnc), 3, 0));
            AV43TFMetPieAnc_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFMetPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFMetPieAnc_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEMTD") == 0 )
         {
            AV44TFMetPieMtD = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFMetPieMtD", GXutil.ltrimstr( AV44TFMetPieMtD, 8, 2));
            AV45TFMetPieMtD_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFMetPieMtD_To", GXutil.ltrimstr( AV45TFMetPieMtD_To, 8, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEEST") == 0 )
         {
            AV46TFMetPieEst = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFMetPieEst", GXutil.str( AV46TFMetPieEst, 1, 0));
            AV47TFMetPieEst_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFMetPieEst_To", GXutil.str( AV47TFMetPieEst_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEOBS") == 0 )
         {
            AV48TFMetPieObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFMetPieObs", AV48TFMetPieObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEOBS_SEL") == 0 )
         {
            AV49TFMetPieObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFMetPieObs_Sel", AV49TFMetPieObs_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETPIEDFULT") == 0 )
         {
            AV59TFMetPieDfUlt = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFMetPieDfUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFMetPieDfUlt), 4, 0));
            AV60TFMetPieDfUlt_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFMetPieDfUlt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFMetPieDfUlt_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED") == 0 )
         {
            AV61TFBarUniMed = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarUniMed", AV61TFBarUniMed);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARUNIMED_SEL") == 0 )
         {
            AV62TFBarUniMed_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarUniMed_Sel", AV62TFBarUniMed_Sel);
         }
         AV128GXV3 = (int)(AV128GXV3+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMetTerCod_Sel)==0), AV29TFMetTerCod_Sel, GXv_char4) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFMetPieCod_Sel)==0), AV37TFMetPieCod_Sel, GXv_char3) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFMetPieObs_Sel)==0), AV49TFMetPieObs_Sel, GXv_char2) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFBarUniMed_Sel)==0), AV62TFBarUniMed_Sel, GXv_char15) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12+"||||||"+GXt_char13+"||"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFMetTerCod)==0), AV28TFMetTerCod, GXv_char15) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFMetPieCod)==0), AV36TFMetPieCod, GXv_char4) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFMetPieObs)==0), AV48TFMetPieObs, GXv_char3) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFBarUniMed)==0), AV61TFBarUniMed, GXv_char2) ;
      webcontador_metrajepiezas_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieKil)==0) ? "" : GXutil.str( AV38TFMetPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieMet)==0) ? "" : GXutil.str( AV40TFMetPieMet, 9, 2))+"|"+((0==AV42TFMetPieAnc) ? "" : GXutil.str( AV42TFMetPieAnc, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMetPieMtD)==0) ? "" : GXutil.str( AV44TFMetPieMtD, 8, 2))+"|"+((0==AV46TFMetPieEst) ? "" : GXutil.str( AV46TFMetPieEst, 1, 0))+"|"+GXt_char12+"|"+((0==AV59TFMetPieDfUlt) ? "" : GXutil.str( AV59TFMetPieDfUlt, 4, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil_To)==0) ? "" : GXutil.str( AV39TFMetPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMetPieMet_To)==0) ? "" : GXutil.str( AV41TFMetPieMet_To, 9, 2))+"|"+((0==AV43TFMetPieAnc_To) ? "" : GXutil.str( AV43TFMetPieAnc_To, 3, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMetPieMtD_To)==0) ? "" : GXutil.str( AV45TFMetPieMtD_To, 8, 2))+"|"+((0==AV47TFMetPieEst_To) ? "" : GXutil.str( AV47TFMetPieEst_To, 1, 0))+"||"+((0==AV60TFMetPieDfUlt_To) ? "" : GXutil.str( AV60TFMetPieDfUlt_To, 4, 0))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV125Pgmname+"GridState"), null, null);
      AV84OldGridState.fromxml(AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETTERCOD", "", !(GXutil.strcmp("", AV28TFMetTerCod)==0), (short)(0), AV28TFMetTerCod, "", !(GXutil.strcmp("", AV29TFMetTerCod_Sel)==0), AV29TFMetTerCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIECOD", "", !(GXutil.strcmp("", AV36TFMetPieCod)==0), (short)(0), AV36TFMetPieCod, "", !(GXutil.strcmp("", AV37TFMetPieCod_Sel)==0), AV37TFMetPieCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFMetPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFMetPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFMetPieKil, 9, 2)), GXutil.trim( GXutil.str( AV39TFMetPieKil_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFMetPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFMetPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFMetPieMet, 9, 2)), GXutil.trim( GXutil.str( AV41TFMetPieMet_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEANC", "", !((0==AV42TFMetPieAnc)&&(0==AV43TFMetPieAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFMetPieAnc, 3, 0)), GXutil.trim( GXutil.str( AV43TFMetPieAnc_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEMTD", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFMetPieMtD)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFMetPieMtD_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV44TFMetPieMtD, 8, 2)), GXutil.trim( GXutil.str( AV45TFMetPieMtD_To, 8, 2))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEEST", "", !((0==AV46TFMetPieEst)&&(0==AV47TFMetPieEst_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFMetPieEst, 1, 0)), GXutil.trim( GXutil.str( AV47TFMetPieEst_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEOBS", "", !(GXutil.strcmp("", AV48TFMetPieObs)==0), (short)(0), AV48TFMetPieObs, "", !(GXutil.strcmp("", AV49TFMetPieObs_Sel)==0), AV49TFMetPieObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFMETPIEDFULT", "", !((0==AV59TFMetPieDfUlt)&&(0==AV60TFMetPieDfUlt_To)), (short)(0), GXutil.trim( GXutil.str( AV59TFMetPieDfUlt, 4, 0)), GXutil.trim( GXutil.str( AV60TFMetPieDfUlt_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFBARUNIMED", "", !(GXutil.strcmp("", AV61TFBarUniMed)==0), (short)(0), AV61TFBarUniMed, "", !(GXutil.strcmp("", AV62TFBarUniMed_Sel)==0), AV62TFBarUniMed_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV55EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV56BarCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56BarCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV57BarCodReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV57BarCodReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV58BarCodPar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV58BarCodPar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV64OpeCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPECOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV64OpeCod, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      if ( new app.wwpbaseobjects.wwp_resetcollapsedrecords(remoteHandle, context).executeUdp( AV84OldGridState, AV10GridState) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         AV82GridCollapsedRecords = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
         AV81GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "") ;
      }
      AV10GridState.setgxTv_SdtWWPGridState_Collapsedrecords( AV82GridCollapsedRecords.toJSonString(false) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV125Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV125Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ExpedicionesAutomatizadas.LMETPI" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV55EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV56BarCod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodReo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV57BarCodReo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "BarCodPar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV58BarCodPar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV70TotMetPieCod = 0 ;
      AV72TotMetPieKil = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotMetPieKil", GXutil.ltrimstr( AV72TotMetPieKil, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99")));
      AV74TotMetPieMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotMetPieMet", GXutil.ltrimstr( AV74TotMetPieMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV91TotalRecords = 0 ;
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4917MetPieObs ,
                                           Short.valueOf(A12994MetPieDfUl) ,
                                           A228BarUniMed ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57BarCodReo) ,
                                           A130BarCodPar ,
                                           AV58BarCodPar ,
                                           AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor H01GW4 */
      pr_default.execute(2, new Object[] {AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A228BarUniMed = H01GW4_A228BarUniMed[0] ;
         A12994MetPieDfUl = H01GW4_A12994MetPieDfUl[0] ;
         A4917MetPieObs = H01GW4_A4917MetPieObs[0] ;
         A2816MetPieEst = H01GW4_A2816MetPieEst[0] ;
         A4910MetPieMtD = H01GW4_A4910MetPieMtD[0] ;
         A6635MetPieAnc = H01GW4_A6635MetPieAnc[0] ;
         A2815MetPieMet = H01GW4_A2815MetPieMet[0] ;
         A2814MetPieKil = H01GW4_A2814MetPieKil[0] ;
         A2813MetPieCod = H01GW4_A2813MetPieCod[0] ;
         A2809MetTerCod = H01GW4_A2809MetTerCod[0] ;
         A130BarCodPar = H01GW4_A130BarCodPar[0] ;
         A132BarCodReo = H01GW4_A132BarCodReo[0] ;
         A129BarCod = H01GW4_A129BarCod[0] ;
         A396EmprCod = H01GW4_A396EmprCod[0] ;
         A228BarUniMed = H01GW4_A228BarUniMed[0] ;
         AV91TotalRecords = (long)(AV91TotalRecords+1) ;
         AV72TotMetPieKil = A2814MetPieKil.add(AV72TotMetPieKil) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TotMetPieKil", GXutil.ltrimstr( AV72TotMetPieKil, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEKIL", getSecureSignedToken( sPrefix, localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99")));
         AV74TotMetPieMet = A2815MetPieMet.add(AV74TotMetPieMet) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotMetPieMet", GXutil.ltrimstr( AV74TotMetPieMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMETPIEMET", getSecureSignedToken( sPrefix, localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV70TotMetPieCod = AV91TotalRecords ;
      AV71TotValueMetPieCod = httpContext.getMessage( "WWP_TotalizerCount", "") + localUtil.format( DecimalUtil.doubleToDec(AV70TotMetPieCod), "ZZZ,ZZZ,ZZZ,ZZZ,ZZZ,ZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TotValueMetPieCod", AV71TotValueMetPieCod);
      AV73TotValueMetPieKil = localUtil.format( AV72TotMetPieKil, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotValueMetPieKil", AV73TotValueMetPieKil);
      AV75TotValueMetPieMet = localUtil.format( AV74TotMetPieMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotValueMetPieMet", AV75TotValueMetPieMet);
   }

   public void S222( )
   {
      /* 'ADDREMOVECHILDREN' Routine */
      returnInSub = false ;
      AV85DiscardFirst = true ;
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = AV55EmprCod ;
      AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod = AV56BarCod ;
      AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo = AV57BarCodReo ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = AV58BarCodPar ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = AV15FilterFullText ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = AV28TFMetTerCod ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = AV29TFMetTerCod_Sel ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = AV36TFMetPieCod ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = AV37TFMetPieCod_Sel ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = AV38TFMetPieKil ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = AV39TFMetPieKil_To ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = AV40TFMetPieMet ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = AV41TFMetPieMet_To ;
      AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc = AV42TFMetPieAnc ;
      AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to = AV43TFMetPieAnc_To ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = AV44TFMetPieMtD ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = AV45TFMetPieMtD_To ;
      AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest = AV46TFMetPieEst ;
      AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to = AV47TFMetPieEst_To ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = AV48TFMetPieObs ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = AV49TFMetPieObs_Sel ;
      AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult = AV59TFMetPieDfUlt ;
      AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to = AV60TFMetPieDfUlt_To ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = AV61TFBarUniMed ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = AV62TFBarUniMed_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                           AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                           AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                           AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                           AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                           AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                           AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                           AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                           AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                           Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) ,
                                           Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) ,
                                           AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                           AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                           Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) ,
                                           Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) ,
                                           AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                           AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                           Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) ,
                                           Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) ,
                                           AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                           AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                           A2809MetTerCod ,
                                           A2813MetPieCod ,
                                           A2814MetPieKil ,
                                           A2815MetPieMet ,
                                           Short.valueOf(A6635MetPieAnc) ,
                                           A4910MetPieMtD ,
                                           Byte.valueOf(A2816MetPieEst) ,
                                           A4917MetPieObs ,
                                           Short.valueOf(A12994MetPieDfUl) ,
                                           A228BarUniMed ,
                                           A396EmprCod ,
                                           AV55EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV56BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV57BarCodReo) ,
                                           A130BarCodPar ,
                                           AV58BarCodPar ,
                                           Byte.valueOf(AV80GroupMetPieEst) ,
                                           AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                           Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod) ,
                                           Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo) ,
                                           AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = GXutil.concat( GXutil.rtrim( AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext), "%", "") ;
      lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = GXutil.padr( GXutil.rtrim( AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod), 10, "%") ;
      lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = GXutil.padr( GXutil.rtrim( AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod), 9, "%") ;
      lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = GXutil.concat( GXutil.rtrim( AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs), "%", "") ;
      lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = GXutil.padr( GXutil.rtrim( AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed), 1, "%") ;
      /* Using cursor H01GW5 */
      pr_default.execute(3, new Object[] {AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod, Integer.valueOf(AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod), Byte.valueOf(AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo), AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar, AV55EmprCod, Integer.valueOf(AV56BarCod), Byte.valueOf(AV57BarCodReo), AV58BarCodPar, Byte.valueOf(AV80GroupMetPieEst), lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext, lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod, AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel, lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod, AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to, Short.valueOf(AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc), Short.valueOf(AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to), AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to, Byte.valueOf(AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest), Byte.valueOf(AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to), lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs, AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel, Short.valueOf(AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult), Short.valueOf(AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to), lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed, AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A228BarUniMed = H01GW5_A228BarUniMed[0] ;
         A12994MetPieDfUl = H01GW5_A12994MetPieDfUl[0] ;
         A4917MetPieObs = H01GW5_A4917MetPieObs[0] ;
         A2816MetPieEst = H01GW5_A2816MetPieEst[0] ;
         A4910MetPieMtD = H01GW5_A4910MetPieMtD[0] ;
         A6635MetPieAnc = H01GW5_A6635MetPieAnc[0] ;
         A2815MetPieMet = H01GW5_A2815MetPieMet[0] ;
         A2814MetPieKil = H01GW5_A2814MetPieKil[0] ;
         A2813MetPieCod = H01GW5_A2813MetPieCod[0] ;
         A2809MetTerCod = H01GW5_A2809MetTerCod[0] ;
         A130BarCodPar = H01GW5_A130BarCodPar[0] ;
         A132BarCodReo = H01GW5_A132BarCodReo[0] ;
         A129BarCod = H01GW5_A129BarCod[0] ;
         A396EmprCod = H01GW5_A396EmprCod[0] ;
         A228BarUniMed = H01GW5_A228BarUniMed[0] ;
         AV79RecordKey = A2809MetTerCod + ";" + A2813MetPieCod ;
         AV83Index = AV81GridCollapsedRecordsChildren.indexof(AV79RecordKey) ;
         if ( AV86AddChildren && ( AV83Index == 0 ) )
         {
            if ( ! AV85DiscardFirst )
            {
               AV81GridCollapsedRecordsChildren.add(AV79RecordKey, 0);
            }
            else
            {
               AV85DiscardFirst = false ;
            }
         }
         else
         {
            if ( ( ! AV86AddChildren ) && ( AV83Index > 0 ) )
            {
               AV81GridCollapsedRecordsChildren.removeItem((int)(AV83Index));
            }
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void wb_table2_61_1GW2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiecod_Internalname, httpContext.getMessage( "Tot Value Met Pie Cod", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiecod_Internalname, AV71TotValueMetPieCod, GXutil.rtrim( localUtil.format( AV71TotValueMetPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiecod_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiecod_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiekil_Internalname, httpContext.getMessage( "Tot Value Met Pie Kil", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiekil_Internalname, AV73TotValueMetPieKil, GXutil.rtrim( localUtil.format( AV73TotValueMetPieKil, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiekil_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiekil_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetpiemet_Internalname, httpContext.getMessage( "Tot Value Met Pie Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetpiemet_Internalname, AV75TotValueMetPieMet, GXutil.rtrim( localUtil.format( AV75TotValueMetPieMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetpiemet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetpiemet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_WC.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_61_1GW2e( true) ;
      }
      else
      {
         wb_table2_61_1GW2e( false) ;
      }
   }

   public void wb_table1_19_1GW2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_24_1GW2( true) ;
      }
      else
      {
         wb_table3_24_1GW2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_1GW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1GW2e( true) ;
      }
      else
      {
         wb_table1_19_1GW2e( false) ;
      }
   }

   public void wb_table3_24_1GW2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebContador_MetrajePiezas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_1GW2e( true) ;
      }
      else
      {
         wb_table3_24_1GW2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV55EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55EmprCod", AV55EmprCod);
      AV56BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarCod), 8, 0));
      AV57BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCodReo", GXutil.str( AV57BarCodReo, 1, 0));
      AV58BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodPar", AV58BarCodPar);
      AV64OpeCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OpeCod), 6, 0));
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
      pa1GW2( ) ;
      ws1GW2( ) ;
      we1GW2( ) ;
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
      sCtrlAV55EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV56BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV57BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV58BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV64OpeCod = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1GW2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "expedicionesautomatizadas\\webcontador_metrajepiezas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1GW2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV55EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55EmprCod", AV55EmprCod);
         AV56BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarCod), 8, 0));
         AV57BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCodReo", GXutil.str( AV57BarCodReo, 1, 0));
         AV58BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodPar", AV58BarCodPar);
         AV64OpeCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OpeCod), 6, 0));
      }
      wcpOAV55EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV55EmprCod") ;
      wcpOAV56BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV57BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV58BarCodPar = httpContext.cgiGet( sPrefix+"wcpOAV58BarCodPar") ;
      wcpOAV64OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV64OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV55EmprCod, wcpOAV55EmprCod) != 0 ) || ( AV56BarCod != wcpOAV56BarCod ) || ( AV57BarCodReo != wcpOAV57BarCodReo ) || ( GXutil.strcmp(AV58BarCodPar, wcpOAV58BarCodPar) != 0 ) || ( AV64OpeCod != wcpOAV64OpeCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV55EmprCod = AV55EmprCod ;
      wcpOAV56BarCod = AV56BarCod ;
      wcpOAV57BarCodReo = AV57BarCodReo ;
      wcpOAV58BarCodPar = AV58BarCodPar ;
      wcpOAV64OpeCod = AV64OpeCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV55EmprCod = httpContext.cgiGet( sPrefix+"AV55EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV55EmprCod) > 0 )
      {
         AV55EmprCod = httpContext.cgiGet( sCtrlAV55EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55EmprCod", AV55EmprCod);
      }
      else
      {
         AV55EmprCod = httpContext.cgiGet( sPrefix+"AV55EmprCod_PARM") ;
      }
      sCtrlAV56BarCod = httpContext.cgiGet( sPrefix+"AV56BarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV56BarCod) > 0 )
      {
         AV56BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56BarCod), 8, 0));
      }
      else
      {
         AV56BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57BarCodReo = httpContext.cgiGet( sPrefix+"AV57BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlAV57BarCodReo) > 0 )
      {
         AV57BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV57BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57BarCodReo", GXutil.str( AV57BarCodReo, 1, 0));
      }
      else
      {
         AV57BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV57BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV58BarCodPar = httpContext.cgiGet( sPrefix+"AV58BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlAV58BarCodPar) > 0 )
      {
         AV58BarCodPar = httpContext.cgiGet( sCtrlAV58BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58BarCodPar", AV58BarCodPar);
      }
      else
      {
         AV58BarCodPar = httpContext.cgiGet( sPrefix+"AV58BarCodPar_PARM") ;
      }
      sCtrlAV64OpeCod = httpContext.cgiGet( sPrefix+"AV64OpeCod_CTRL") ;
      if ( GXutil.len( sCtrlAV64OpeCod) > 0 )
      {
         AV64OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV64OpeCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OpeCod), 6, 0));
      }
      else
      {
         AV64OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV64OpeCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1GW2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1GW2( ) ;
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
      ws1GW2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55EmprCod_PARM", GXutil.rtrim( AV55EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55EmprCod_CTRL", GXutil.rtrim( sCtrlAV55EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56BarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV56BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56BarCod_CTRL", GXutil.rtrim( sCtrlAV56BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( AV57BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57BarCodReo_CTRL", GXutil.rtrim( sCtrlAV57BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58BarCodPar_PARM", GXutil.rtrim( AV58BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58BarCodPar_CTRL", GXutil.rtrim( sCtrlAV58BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64OpeCod_PARM", GXutil.ltrim( localUtil.ntoc( AV64OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV64OpeCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV64OpeCod_CTRL", GXutil.rtrim( sCtrlAV64OpeCod));
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
      we1GW2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115561825", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webcontador_metrajepiezas_wc.js", "?202682115561825", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVGroupBy/DVGroupByRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      edtavExpand_Internalname = sPrefix+"vEXPAND_"+sGXsfl_37_idx ;
      edtavGrid_groupcaption_Internalname = sPrefix+"vGRID_GROUPCAPTION_"+sGXsfl_37_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_idx ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_37_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_37_idx ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_37_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_37_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_37_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_37_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_37_idx ;
      edtavMetpiecod_grouptotalizer_Internalname = sPrefix+"vMETPIECOD_GROUPTOTALIZER_"+sGXsfl_37_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_37_idx ;
      edtavMetpiekil_grouptotalizer_Internalname = sPrefix+"vMETPIEKIL_GROUPTOTALIZER_"+sGXsfl_37_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_37_idx ;
      edtavMetpiemet_grouptotalizer_Internalname = sPrefix+"vMETPIEMET_GROUPTOTALIZER_"+sGXsfl_37_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_37_idx ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD_"+sGXsfl_37_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_37_idx ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS_"+sGXsfl_37_idx ;
      edtMetPieDfUl_Internalname = sPrefix+"METPIEDFUL_"+sGXsfl_37_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      edtavExpand_Internalname = sPrefix+"vEXPAND_"+sGXsfl_37_fel_idx ;
      edtavGrid_groupcaption_Internalname = sPrefix+"vGRID_GROUPCAPTION_"+sGXsfl_37_fel_idx ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_fel_idx ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_37_fel_idx );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_37_fel_idx ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD_"+sGXsfl_37_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_37_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_37_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_37_fel_idx ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD_"+sGXsfl_37_fel_idx ;
      edtavMetpiecod_grouptotalizer_Internalname = sPrefix+"vMETPIECOD_GROUPTOTALIZER_"+sGXsfl_37_fel_idx ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL_"+sGXsfl_37_fel_idx ;
      edtavMetpiekil_grouptotalizer_Internalname = sPrefix+"vMETPIEKIL_GROUPTOTALIZER_"+sGXsfl_37_fel_idx ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET_"+sGXsfl_37_fel_idx ;
      edtavMetpiemet_grouptotalizer_Internalname = sPrefix+"vMETPIEMET_GROUPTOTALIZER_"+sGXsfl_37_fel_idx ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC_"+sGXsfl_37_fel_idx ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD_"+sGXsfl_37_fel_idx ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST_"+sGXsfl_37_fel_idx ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS_"+sGXsfl_37_fel_idx ;
      edtMetPieDfUl_Internalname = sPrefix+"METPIEDFUL_"+sGXsfl_37_fel_idx ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb1GW0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavExpand_Internalname,GXutil.rtrim( AV87Expand),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavExpand_Enabled!=0)&&(edtavExpand_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVEXPAND.CLICK."+sGXsfl_37_idx+"'","","","","",edtavExpand_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtavExpand_Columnclass,"",Integer.valueOf(0),Integer.valueOf(edtavExpand_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_groupcaption_Internalname,AV76Grid_GroupCaption,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_groupcaption_Enabled!=0)&&(edtavGrid_groupcaption_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_groupcaption_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_groupcaption_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV63DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e201gw2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_37_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV54GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV54GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV54GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e211gw2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV54GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_37_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetTerCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetTerCod_Internalname,GXutil.rtrim( A2809MetTerCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetTerCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetTerCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetPieCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieCod_Internalname,GXutil.rtrim( A2813MetPieCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMetpiecod_grouptotalizer_Enabled!=0)&&(edtavMetpiecod_grouptotalizer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetpiecod_grouptotalizer_Internalname,AV88MetPieCod_GroupTotalizer,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMetpiecod_grouptotalizer_Enabled!=0)&&(edtavMetpiecod_grouptotalizer_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMetpiecod_grouptotalizer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavMetpiecod_grouptotalizer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieKil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2814MetPieKil, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMetPieKil_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMetpiekil_grouptotalizer_Enabled!=0)&&(edtavMetpiekil_grouptotalizer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetpiekil_grouptotalizer_Internalname,AV89MetPieKil_GroupTotalizer,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMetpiekil_grouptotalizer_Enabled!=0)&&(edtavMetpiekil_grouptotalizer_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMetpiekil_grouptotalizer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavMetpiekil_grouptotalizer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieMet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A2815MetPieMet, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieMet_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMetpiemet_grouptotalizer_Enabled!=0)&&(edtavMetpiemet_grouptotalizer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMetpiemet_grouptotalizer_Internalname,AV90MetPieMet_GroupTotalizer,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMetpiemet_grouptotalizer_Enabled!=0)&&(edtavMetpiemet_grouptotalizer_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMetpiemet_grouptotalizer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavMetpiemet_grouptotalizer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6635MetPieAnc), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieMtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieMtD_Internalname,GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A4910MetPieMtD, "ZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieMtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieMtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2816MetPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtMetPieEst_Columnclass,edtMetPieEst_Columnheaderclass,Integer.valueOf(edtMetPieEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMetPieObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieObs_Internalname,A4917MetPieObs,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieObs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1024),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtMetPieDfUl_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetPieDfUl_Internalname,GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12994MetPieDfUl), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtMetPieDfUl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMetPieDfUl_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarUniMed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarUniMed_Internalname,GXutil.rtrim( A228BarUniMed),GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarUniMed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarUniMed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1GW2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetTerCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieKil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieMet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho Final", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieMtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Grm2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMetPieDfUl_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultima Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarUniMed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87Expand));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavExpand_Columnclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavExpand_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV76Grid_GroupCaption);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_groupcaption_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV63DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2809MetTerCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetTerCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2813MetPieCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV88MetPieCod_GroupTotalizer);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetpiecod_grouptotalizer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2814MetPieKil, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieKil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV89MetPieKil_GroupTotalizer);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetpiekil_grouptotalizer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2815MetPieMet, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieMet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV90MetPieMet_GroupTotalizer);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMetpiemet_grouptotalizer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6635MetPieAnc, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4910MetPieMtD, (byte)(8), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieMtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2816MetPieEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtMetPieEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtMetPieEst_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieEst_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A4917MetPieObs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12994MetPieDfUl, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMetPieDfUl_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A228BarUniMed));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarUniMed_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavExpand_Internalname = sPrefix+"vEXPAND" ;
      edtavGrid_groupcaption_Internalname = sPrefix+"vGRID_GROUPCAPTION" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtMetTerCod_Internalname = sPrefix+"METTERCOD" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtMetPieCod_Internalname = sPrefix+"METPIECOD" ;
      edtavMetpiecod_grouptotalizer_Internalname = sPrefix+"vMETPIECOD_GROUPTOTALIZER" ;
      edtMetPieKil_Internalname = sPrefix+"METPIEKIL" ;
      edtavMetpiekil_grouptotalizer_Internalname = sPrefix+"vMETPIEKIL_GROUPTOTALIZER" ;
      edtMetPieMet_Internalname = sPrefix+"METPIEMET" ;
      edtavMetpiemet_grouptotalizer_Internalname = sPrefix+"vMETPIEMET_GROUPTOTALIZER" ;
      edtMetPieAnc_Internalname = sPrefix+"METPIEANC" ;
      edtMetPieMtD_Internalname = sPrefix+"METPIEMTD" ;
      edtMetPieEst_Internalname = sPrefix+"METPIEEST" ;
      edtMetPieObs_Internalname = sPrefix+"METPIEOBS" ;
      edtMetPieDfUl_Internalname = sPrefix+"METPIEDFUL" ;
      edtBarUniMed_Internalname = sPrefix+"BARUNIMED" ;
      edtavTotvaluemetpiecod_Internalname = sPrefix+"vTOTVALUEMETPIECOD" ;
      edtavTotvaluemetpiekil_Internalname = sPrefix+"vTOTVALUEMETPIEKIL" ;
      edtavTotvaluemetpiemet_Internalname = sPrefix+"vTOTVALUEMETPIEMET" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_group_Internalname = sPrefix+"GRID_GROUP" ;
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
      edtBarUniMed_Jsonclick = "" ;
      edtMetPieDfUl_Jsonclick = "" ;
      edtMetPieObs_Jsonclick = "" ;
      edtMetPieEst_Jsonclick = "" ;
      edtMetPieEst_Columnclass = "WWColumn hidden-xs" ;
      edtMetPieMtD_Jsonclick = "" ;
      edtMetPieAnc_Jsonclick = "" ;
      edtavMetpiemet_grouptotalizer_Jsonclick = "" ;
      edtavMetpiemet_grouptotalizer_Visible = 0 ;
      edtavMetpiemet_grouptotalizer_Enabled = 1 ;
      edtMetPieMet_Jsonclick = "" ;
      edtavMetpiekil_grouptotalizer_Jsonclick = "" ;
      edtavMetpiekil_grouptotalizer_Visible = 0 ;
      edtavMetpiekil_grouptotalizer_Enabled = 1 ;
      edtMetPieKil_Jsonclick = "" ;
      edtavMetpiecod_grouptotalizer_Jsonclick = "" ;
      edtavMetpiecod_grouptotalizer_Visible = 0 ;
      edtavMetpiecod_grouptotalizer_Enabled = 1 ;
      edtMetPieCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtMetTerCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      edtavGrid_groupcaption_Jsonclick = "" ;
      edtavGrid_groupcaption_Visible = 0 ;
      edtavGrid_groupcaption_Enabled = 1 ;
      edtavExpand_Jsonclick = "" ;
      edtavExpand_Columnclass = "WWIconActionColumn" ;
      edtavExpand_Visible = 0 ;
      edtavExpand_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluemetpiemet_Jsonclick = "" ;
      edtavTotvaluemetpiemet_Enabled = 1 ;
      edtavTotvaluemetpiekil_Jsonclick = "" ;
      edtavTotvaluemetpiekil_Enabled = 1 ;
      edtavTotvaluemetpiecod_Jsonclick = "" ;
      edtavTotvaluemetpiecod_Enabled = 1 ;
      edtMetPieEst_Columnheaderclass = "" ;
      edtBarUniMed_Visible = -1 ;
      edtMetPieDfUl_Visible = -1 ;
      edtMetPieObs_Visible = -1 ;
      edtMetPieEst_Visible = -1 ;
      edtMetPieMtD_Visible = -1 ;
      edtMetPieAnc_Visible = -1 ;
      edtMetPieMet_Visible = -1 ;
      edtMetPieKil_Visible = -1 ;
      edtMetPieCod_Visible = -1 ;
      edtMetTerCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = ";;;L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hasrowgroups = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_group_Totalizercolumnindexes = "9,11,13" ;
      Grid_group_Columnindex = 1 ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||||||T||T" ;
      Ddo_grid_Filterisrange = "||T|T|T|T|T||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T||T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8||9|" ;
      Ddo_grid_Columnids = "5:MetTerCod|9:MetPieCod|11:MetPieKil|13:MetPieMet|15:MetPieAnc|16:MetPieMtD|17:MetPieEst|18:MetPieObs|19:MetPieDfUlt|20:BarUniMed" ;
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
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_37_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieMtD_Visible',ctrl:'METPIEMTD',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtMetPieObs_Visible',ctrl:'METPIEOBS',prop:'Visible'},{av:'edtMetPieDfUl_Visible',ctrl:'METPIEDFUL',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtMetPieEst_Columnheaderclass',ctrl:'METPIEEST',prop:'Columnheaderclass'},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV73TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV75TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181GW2',iparms:[{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV90MetPieMet_GroupTotalizer',fld:'vMETPIEMET_GROUPTOTALIZER',pic:''},{av:'AV89MetPieKil_GroupTotalizer',fld:'vMETPIEKIL_GROUPTOTALIZER',pic:''},{av:'AV88MetPieCod_GroupTotalizer',fld:'vMETPIECOD_GROUPTOTALIZER',pic:''},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'AV87Expand',fld:'vEXPAND',pic:''},{av:'edtavExpand_Columnclass',ctrl:'vEXPAND',prop:'Columnclass'},{av:'AV63DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtMetPieEst_Columnclass',ctrl:'METPIEEST',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieMtD_Visible',ctrl:'METPIEMTD',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtMetPieObs_Visible',ctrl:'METPIEOBS',prop:'Visible'},{av:'edtMetPieDfUl_Visible',ctrl:'METPIEDFUL',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtMetPieEst_Columnheaderclass',ctrl:'METPIEEST',prop:'Columnheaderclass'},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV73TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV75TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'AV80GroupMetPieEst',fld:'vGROUPMETPIEEST',pic:'9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'AV86AddChildren',fld:'vADDCHILDREN',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV86AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV80GroupMetPieEst',fld:'vGROUPMETPIEEST',pic:'9'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieMtD_Visible',ctrl:'METPIEMTD',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtMetPieObs_Visible',ctrl:'METPIEOBS',prop:'Visible'},{av:'edtMetPieDfUl_Visible',ctrl:'METPIEDFUL',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtMetPieEst_Columnheaderclass',ctrl:'METPIEEST',prop:'Columnheaderclass'},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV73TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV75TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e211GW2',iparms:[{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV54GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VEXPAND.CLICK","{handler:'e191GW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV58BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28TFMetTerCod',fld:'vTFMETTERCOD',pic:''},{av:'AV29TFMetTerCod_Sel',fld:'vTFMETTERCOD_SEL',pic:''},{av:'AV36TFMetPieCod',fld:'vTFMETPIECOD',pic:''},{av:'AV37TFMetPieCod_Sel',fld:'vTFMETPIECOD_SEL',pic:''},{av:'AV38TFMetPieKil',fld:'vTFMETPIEKIL',pic:'ZZZZZ9.99'},{av:'AV39TFMetPieKil_To',fld:'vTFMETPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV40TFMetPieMet',fld:'vTFMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV41TFMetPieMet_To',fld:'vTFMETPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetPieAnc',fld:'vTFMETPIEANC',pic:'ZZ9'},{av:'AV43TFMetPieAnc_To',fld:'vTFMETPIEANC_TO',pic:'ZZ9'},{av:'AV44TFMetPieMtD',fld:'vTFMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV45TFMetPieMtD_To',fld:'vTFMETPIEMTD_TO',pic:'ZZZZ9.99'},{av:'AV46TFMetPieEst',fld:'vTFMETPIEEST',pic:'9'},{av:'AV47TFMetPieEst_To',fld:'vTFMETPIEEST_TO',pic:'9'},{av:'AV48TFMetPieObs',fld:'vTFMETPIEOBS',pic:''},{av:'AV49TFMetPieObs_Sel',fld:'vTFMETPIEOBS_SEL',pic:''},{av:'AV59TFMetPieDfUlt',fld:'vTFMETPIEDFULT',pic:'ZZZ9'},{av:'AV60TFMetPieDfUlt_To',fld:'vTFMETPIEDFULT_TO',pic:'ZZZ9'},{av:'AV61TFBarUniMed',fld:'vTFBARUNIMED',pic:'@!'},{av:'AV62TFBarUniMed_Sel',fld:'vTFBARUNIMED_SEL',pic:'@!'},{av:'AV125Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV64OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'A9557ESTADO',fld:'ESTADO',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBCONTADOR_METRAJEPIEZAS_WCDS_4_BARCODPAR',pic:''},{av:'sPrefix'},{av:'A2816MetPieEst',fld:'METPIEEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''},{av:'AV80GroupMetPieEst',fld:'vGROUPMETPIEEST',pic:'9'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'AV86AddChildren',fld:'vADDCHILDREN',pic:''},{av:'A2814MetPieKil',fld:'METPIEKIL',pic:'ZZZZZ9.99'},{av:'A2815MetPieMet',fld:'METPIEMET',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VEXPAND.CLICK",",oparms:[{av:'AV80GroupMetPieEst',fld:'vGROUPMETPIEEST',pic:'9'},{av:'AV82GridCollapsedRecords',fld:'vGRIDCOLLAPSEDRECORDS',pic:''},{av:'AV86AddChildren',fld:'vADDCHILDREN',pic:''},{av:'AV81GridCollapsedRecordsChildren',fld:'vGRIDCOLLAPSEDRECORDSCHILDREN',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtMetTerCod_Visible',ctrl:'METTERCOD',prop:'Visible'},{av:'edtMetPieCod_Visible',ctrl:'METPIECOD',prop:'Visible'},{av:'edtMetPieKil_Visible',ctrl:'METPIEKIL',prop:'Visible'},{av:'edtMetPieMet_Visible',ctrl:'METPIEMET',prop:'Visible'},{av:'edtMetPieAnc_Visible',ctrl:'METPIEANC',prop:'Visible'},{av:'edtMetPieMtD_Visible',ctrl:'METPIEMTD',prop:'Visible'},{av:'edtMetPieEst_Visible',ctrl:'METPIEEST',prop:'Visible'},{av:'edtMetPieObs_Visible',ctrl:'METPIEOBS',prop:'Visible'},{av:'edtMetPieDfUl_Visible',ctrl:'METPIEDFUL',prop:'Visible'},{av:'edtBarUniMed_Visible',ctrl:'BARUNIMED',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtMetPieEst_Columnheaderclass',ctrl:'METPIEEST',prop:'Columnheaderclass'},{av:'AV78GroupOldMetPieEst',fld:'vGROUPOLDMETPIEEST',pic:'9',hsh:true},{av:'AV76Grid_GroupCaption',fld:'vGRID_GROUPCAPTION',pic:'',hsh:true},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV72TotMetPieKil',fld:'vTOTMETPIEKIL',pic:'ZZZZZ9.99',hsh:true},{av:'AV74TotMetPieMet',fld:'vTOTMETPIEMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV71TotValueMetPieCod',fld:'vTOTVALUEMETPIECOD',pic:''},{av:'AV73TotValueMetPieKil',fld:'vTOTVALUEMETPIEKIL',pic:''},{av:'AV75TotValueMetPieMet',fld:'vTOTVALUEMETPIEMET',pic:''}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e201GW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2809MetTerCod',fld:'METTERCOD',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2813MetPieCod',fld:'METPIECOD',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_METTERCOD","{handler:'valid_Mettercod',iparms:[]");
      setEventMetadata("VALID_METTERCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_METPIECOD","{handler:'valid_Metpiecod',iparms:[]");
      setEventMetadata("VALID_METPIECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barunimed',iparms:[]");
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
      wcpOAV55EmprCod = "" ;
      wcpOAV58BarCodPar = "" ;
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
      AV55EmprCod = "" ;
      AV58BarCodPar = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV28TFMetTerCod = "" ;
      AV29TFMetTerCod_Sel = "" ;
      AV36TFMetPieCod = "" ;
      AV37TFMetPieCod_Sel = "" ;
      AV38TFMetPieKil = DecimalUtil.ZERO ;
      AV39TFMetPieKil_To = DecimalUtil.ZERO ;
      AV40TFMetPieMet = DecimalUtil.ZERO ;
      AV41TFMetPieMet_To = DecimalUtil.ZERO ;
      AV44TFMetPieMtD = DecimalUtil.ZERO ;
      AV45TFMetPieMtD_To = DecimalUtil.ZERO ;
      AV48TFMetPieObs = "" ;
      AV49TFMetPieObs_Sel = "" ;
      AV61TFBarUniMed = "" ;
      AV62TFBarUniMed_Sel = "" ;
      AV125Pgmname = "" ;
      AV82GridCollapsedRecords = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV72TotMetPieKil = DecimalUtil.ZERO ;
      AV74TotMetPieMet = DecimalUtil.ZERO ;
      AV76Grid_GroupCaption = "" ;
      A9557ESTADO = "" ;
      AV81GridCollapsedRecordsChildren = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod = "" ;
      AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_group_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_group = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV87Expand = "" ;
      AV63DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A2809MetTerCod = "" ;
      A130BarCodPar = "" ;
      A2813MetPieCod = "" ;
      AV88MetPieCod_GroupTotalizer = "" ;
      A2814MetPieKil = DecimalUtil.ZERO ;
      AV89MetPieKil_GroupTotalizer = "" ;
      A2815MetPieMet = DecimalUtil.ZERO ;
      AV90MetPieMet_GroupTotalizer = "" ;
      A4910MetPieMtD = DecimalUtil.ZERO ;
      A4917MetPieObs = "" ;
      A228BarUniMed = "" ;
      AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel = "" ;
      AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel = "" ;
      AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil = DecimalUtil.ZERO ;
      AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to = DecimalUtil.ZERO ;
      AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet = DecimalUtil.ZERO ;
      AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to = DecimalUtil.ZERO ;
      AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd = DecimalUtil.ZERO ;
      AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to = DecimalUtil.ZERO ;
      AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel = "" ;
      AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel = "" ;
      scmdbuf = "" ;
      lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext = "" ;
      lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod = "" ;
      lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod = "" ;
      lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs = "" ;
      lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed = "" ;
      H01GW2_A228BarUniMed = new String[] {""} ;
      H01GW2_A12994MetPieDfUl = new short[1] ;
      H01GW2_A4917MetPieObs = new String[] {""} ;
      H01GW2_A2816MetPieEst = new byte[1] ;
      H01GW2_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW2_A6635MetPieAnc = new short[1] ;
      H01GW2_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW2_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW2_A2813MetPieCod = new String[] {""} ;
      H01GW2_A130BarCodPar = new String[] {""} ;
      H01GW2_A132BarCodReo = new byte[1] ;
      H01GW2_A129BarCod = new int[1] ;
      H01GW2_A2809MetTerCod = new String[] {""} ;
      H01GW2_A396EmprCod = new String[] {""} ;
      H01GW3_A228BarUniMed = new String[] {""} ;
      H01GW3_A12994MetPieDfUl = new short[1] ;
      H01GW3_A4917MetPieObs = new String[] {""} ;
      H01GW3_A2816MetPieEst = new byte[1] ;
      H01GW3_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW3_A6635MetPieAnc = new short[1] ;
      H01GW3_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW3_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW3_A2813MetPieCod = new String[] {""} ;
      H01GW3_A130BarCodPar = new String[] {""} ;
      H01GW3_A132BarCodReo = new byte[1] ;
      H01GW3_A129BarCod = new int[1] ;
      H01GW3_A2809MetTerCod = new String[] {""} ;
      H01GW3_A396EmprCod = new String[] {""} ;
      AV71TotValueMetPieCod = "" ;
      AV73TotValueMetPieKil = "" ;
      AV75TotValueMetPieMet = "" ;
      AV97Station = "" ;
      AV98Emprnom = "" ;
      AV99Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV65window = new com.genexus.webpanels.GXWindow();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV84OldGridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      H01GW4_A228BarUniMed = new String[] {""} ;
      H01GW4_A12994MetPieDfUl = new short[1] ;
      H01GW4_A4917MetPieObs = new String[] {""} ;
      H01GW4_A2816MetPieEst = new byte[1] ;
      H01GW4_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW4_A6635MetPieAnc = new short[1] ;
      H01GW4_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW4_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW4_A2813MetPieCod = new String[] {""} ;
      H01GW4_A2809MetTerCod = new String[] {""} ;
      H01GW4_A130BarCodPar = new String[] {""} ;
      H01GW4_A132BarCodReo = new byte[1] ;
      H01GW4_A129BarCod = new int[1] ;
      H01GW4_A396EmprCod = new String[] {""} ;
      H01GW5_A228BarUniMed = new String[] {""} ;
      H01GW5_A12994MetPieDfUl = new short[1] ;
      H01GW5_A4917MetPieObs = new String[] {""} ;
      H01GW5_A2816MetPieEst = new byte[1] ;
      H01GW5_A4910MetPieMtD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW5_A6635MetPieAnc = new short[1] ;
      H01GW5_A2815MetPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW5_A2814MetPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01GW5_A2813MetPieCod = new String[] {""} ;
      H01GW5_A2809MetTerCod = new String[] {""} ;
      H01GW5_A130BarCodPar = new String[] {""} ;
      H01GW5_A132BarCodReo = new byte[1] ;
      H01GW5_A129BarCod = new int[1] ;
      H01GW5_A396EmprCod = new String[] {""} ;
      AV79RecordKey = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV55EmprCod = "" ;
      sCtrlAV56BarCod = "" ;
      sCtrlAV57BarCodReo = "" ;
      sCtrlAV58BarCodPar = "" ;
      sCtrlAV64OpeCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webcontador_metrajepiezas_wc__default(),
         new Object[] {
             new Object[] {
            H01GW2_A228BarUniMed, H01GW2_A12994MetPieDfUl, H01GW2_A4917MetPieObs, H01GW2_A2816MetPieEst, H01GW2_A4910MetPieMtD, H01GW2_A6635MetPieAnc, H01GW2_A2815MetPieMet, H01GW2_A2814MetPieKil, H01GW2_A2813MetPieCod, H01GW2_A130BarCodPar,
            H01GW2_A132BarCodReo, H01GW2_A129BarCod, H01GW2_A2809MetTerCod, H01GW2_A396EmprCod
            }
            , new Object[] {
            H01GW3_A228BarUniMed, H01GW3_A12994MetPieDfUl, H01GW3_A4917MetPieObs, H01GW3_A2816MetPieEst, H01GW3_A4910MetPieMtD, H01GW3_A6635MetPieAnc, H01GW3_A2815MetPieMet, H01GW3_A2814MetPieKil, H01GW3_A2813MetPieCod, H01GW3_A130BarCodPar,
            H01GW3_A132BarCodReo, H01GW3_A129BarCod, H01GW3_A2809MetTerCod, H01GW3_A396EmprCod
            }
            , new Object[] {
            H01GW4_A228BarUniMed, H01GW4_A12994MetPieDfUl, H01GW4_A4917MetPieObs, H01GW4_A2816MetPieEst, H01GW4_A4910MetPieMtD, H01GW4_A6635MetPieAnc, H01GW4_A2815MetPieMet, H01GW4_A2814MetPieKil, H01GW4_A2813MetPieCod, H01GW4_A2809MetTerCod,
            H01GW4_A130BarCodPar, H01GW4_A132BarCodReo, H01GW4_A129BarCod, H01GW4_A396EmprCod
            }
            , new Object[] {
            H01GW5_A228BarUniMed, H01GW5_A12994MetPieDfUl, H01GW5_A4917MetPieObs, H01GW5_A2816MetPieEst, H01GW5_A4910MetPieMtD, H01GW5_A6635MetPieAnc, H01GW5_A2815MetPieMet, H01GW5_A2814MetPieKil, H01GW5_A2813MetPieCod, H01GW5_A2809MetTerCod,
            H01GW5_A130BarCodPar, H01GW5_A132BarCodReo, H01GW5_A129BarCod, H01GW5_A396EmprCod
            }
         }
      );
      AV125Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
      /* GeneXus formulas. */
      AV125Pgmname = "ExpedicionesAutomatizadas.WebContador_MetrajePiezas_WC" ;
      Gx_err = (short)(0) ;
      edtavExpand_Enabled = 0 ;
      edtavGrid_groupcaption_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavMetpiecod_grouptotalizer_Enabled = 0 ;
      edtavMetpiekil_grouptotalizer_Enabled = 0 ;
      edtavMetpiemet_grouptotalizer_Enabled = 0 ;
      edtavTotvaluemetpiecod_Enabled = 0 ;
      edtavTotvaluemetpiekil_Enabled = 0 ;
      edtavTotvaluemetpiemet_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV57BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV57BarCodReo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV46TFMetPieEst ;
   private byte AV47TFMetPieEst_To ;
   private byte AV78GroupOldMetPieEst ;
   private byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ;
   private byte AV80GroupMetPieEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A132BarCodReo ;
   private byte A2816MetPieEst ;
   private byte nDonePA ;
   private byte AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ;
   private byte AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
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
   private short AV42TFMetPieAnc ;
   private short AV43TFMetPieAnc_To ;
   private short AV59TFMetPieDfUlt ;
   private short AV60TFMetPieDfUlt_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV54GridActions ;
   private short A6635MetPieAnc ;
   private short A12994MetPieDfUl ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ;
   private short AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ;
   private short AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ;
   private short AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ;
   private int wcpOAV56BarCod ;
   private int wcpOAV64OpeCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV56BarCod ;
   private int AV64OpeCod ;
   private int nGXsfl_37_idx=1 ;
   private int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int Grid_group_Columnindex ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavExpand_Enabled ;
   private int edtavGrid_groupcaption_Enabled ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavMetpiecod_grouptotalizer_Enabled ;
   private int edtavMetpiekil_grouptotalizer_Enabled ;
   private int edtavMetpiemet_grouptotalizer_Enabled ;
   private int edtavTotvaluemetpiecod_Enabled ;
   private int edtavTotvaluemetpiekil_Enabled ;
   private int edtavTotvaluemetpiemet_Enabled ;
   private int AV81GridCollapsedRecordsChildren_size ;
   private int edtMetTerCod_Visible ;
   private int edtMetPieCod_Visible ;
   private int edtMetPieKil_Visible ;
   private int edtMetPieMet_Visible ;
   private int edtMetPieAnc_Visible ;
   private int edtMetPieMtD_Visible ;
   private int edtMetPieEst_Visible ;
   private int edtMetPieObs_Visible ;
   private int edtMetPieDfUl_Visible ;
   private int edtBarUniMed_Visible ;
   private int AV51PageToGo ;
   private int AV126GXV1 ;
   private int AV127GXV2 ;
   private int AV128GXV3 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavExpand_Visible ;
   private int edtavGrid_groupcaption_Visible ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavMetpiecod_grouptotalizer_Visible ;
   private int edtavMetpiekil_grouptotalizer_Visible ;
   private int edtavMetpiemet_grouptotalizer_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV83Index ;
   private long AV70TotMetPieCod ;
   private long AV91TotalRecords ;
   private java.math.BigDecimal AV38TFMetPieKil ;
   private java.math.BigDecimal AV39TFMetPieKil_To ;
   private java.math.BigDecimal AV40TFMetPieMet ;
   private java.math.BigDecimal AV41TFMetPieMet_To ;
   private java.math.BigDecimal AV44TFMetPieMtD ;
   private java.math.BigDecimal AV45TFMetPieMtD_To ;
   private java.math.BigDecimal AV72TotMetPieKil ;
   private java.math.BigDecimal AV74TotMetPieMet ;
   private java.math.BigDecimal A2814MetPieKil ;
   private java.math.BigDecimal A2815MetPieMet ;
   private java.math.BigDecimal A4910MetPieMtD ;
   private java.math.BigDecimal AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ;
   private java.math.BigDecimal AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ;
   private java.math.BigDecimal AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ;
   private java.math.BigDecimal AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ;
   private java.math.BigDecimal AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ;
   private java.math.BigDecimal AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ;
   private String wcpOAV55EmprCod ;
   private String wcpOAV58BarCodPar ;
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
   private String AV55EmprCod ;
   private String AV58BarCodPar ;
   private String sGXsfl_37_idx="0001" ;
   private String AV28TFMetTerCod ;
   private String AV29TFMetTerCod_Sel ;
   private String AV36TFMetPieCod ;
   private String AV37TFMetPieCod_Sel ;
   private String AV61TFBarUniMed ;
   private String AV62TFBarUniMed_Sel ;
   private String AV125Pgmname ;
   private String A9557ESTADO ;
   private String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ;
   private String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar ;
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
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_group_Gridinternalname ;
   private String Grid_group_Totalizercolumnindexes ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_group_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavExpand_Internalname ;
   private String AV87Expand ;
   private String edtavGrid_groupcaption_Internalname ;
   private String AV63DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A2809MetTerCod ;
   private String edtMetTerCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A2813MetPieCod ;
   private String edtMetPieCod_Internalname ;
   private String edtavMetpiecod_grouptotalizer_Internalname ;
   private String edtMetPieKil_Internalname ;
   private String edtavMetpiekil_grouptotalizer_Internalname ;
   private String edtMetPieMet_Internalname ;
   private String edtavMetpiemet_grouptotalizer_Internalname ;
   private String edtMetPieAnc_Internalname ;
   private String edtMetPieMtD_Internalname ;
   private String edtMetPieEst_Internalname ;
   private String edtMetPieObs_Internalname ;
   private String edtMetPieDfUl_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluemetpiecod_Internalname ;
   private String edtavTotvaluemetpiekil_Internalname ;
   private String edtavTotvaluemetpiemet_Internalname ;
   private String AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ;
   private String AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ;
   private String AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ;
   private String scmdbuf ;
   private String lV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ;
   private String lV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ;
   private String lV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ;
   private String AV97Station ;
   private String AV98Emprnom ;
   private String AV99Usurcod ;
   private String edtMetPieEst_Columnheaderclass ;
   private String edtavExpand_Columnclass ;
   private String edtMetPieEst_Columnclass ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluemetpiecod_Jsonclick ;
   private String edtavTotvaluemetpiekil_Jsonclick ;
   private String edtavTotvaluemetpiemet_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV55EmprCod ;
   private String sCtrlAV56BarCod ;
   private String sCtrlAV57BarCodReo ;
   private String sCtrlAV58BarCodPar ;
   private String sCtrlAV64OpeCod ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavExpand_Jsonclick ;
   private String edtavGrid_groupcaption_Jsonclick ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtMetTerCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtMetPieCod_Jsonclick ;
   private String edtavMetpiecod_grouptotalizer_Jsonclick ;
   private String edtMetPieKil_Jsonclick ;
   private String edtavMetpiekil_grouptotalizer_Jsonclick ;
   private String edtMetPieMet_Jsonclick ;
   private String edtavMetpiemet_grouptotalizer_Jsonclick ;
   private String edtMetPieAnc_Jsonclick ;
   private String edtMetPieMtD_Jsonclick ;
   private String edtMetPieEst_Jsonclick ;
   private String edtMetPieObs_Jsonclick ;
   private String edtMetPieDfUl_Jsonclick ;
   private String edtBarUniMed_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean AV86AddChildren ;
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
   private boolean Grid_empowerer_Hasrowgroups ;
   private boolean wbLoad ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV77CalculateTotalizers ;
   private boolean Cond_result ;
   private boolean AV85DiscardFirst ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String AV48TFMetPieObs ;
   private String AV49TFMetPieObs_Sel ;
   private String AV76Grid_GroupCaption ;
   private String AV88MetPieCod_GroupTotalizer ;
   private String AV89MetPieKil_GroupTotalizer ;
   private String AV90MetPieMet_GroupTotalizer ;
   private String A4917MetPieObs ;
   private String AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ;
   private String lV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ;
   private String lV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ;
   private String AV71TotValueMetPieCod ;
   private String AV73TotValueMetPieKil ;
   private String AV75TotValueMetPieMet ;
   private String AV79RecordKey ;
   private GXSimpleCollection<Byte> AV82GridCollapsedRecords ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV65window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_group ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H01GW2_A228BarUniMed ;
   private short[] H01GW2_A12994MetPieDfUl ;
   private String[] H01GW2_A4917MetPieObs ;
   private byte[] H01GW2_A2816MetPieEst ;
   private java.math.BigDecimal[] H01GW2_A4910MetPieMtD ;
   private short[] H01GW2_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01GW2_A2815MetPieMet ;
   private java.math.BigDecimal[] H01GW2_A2814MetPieKil ;
   private String[] H01GW2_A2813MetPieCod ;
   private String[] H01GW2_A130BarCodPar ;
   private byte[] H01GW2_A132BarCodReo ;
   private int[] H01GW2_A129BarCod ;
   private String[] H01GW2_A2809MetTerCod ;
   private String[] H01GW2_A396EmprCod ;
   private String[] H01GW3_A228BarUniMed ;
   private short[] H01GW3_A12994MetPieDfUl ;
   private String[] H01GW3_A4917MetPieObs ;
   private byte[] H01GW3_A2816MetPieEst ;
   private java.math.BigDecimal[] H01GW3_A4910MetPieMtD ;
   private short[] H01GW3_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01GW3_A2815MetPieMet ;
   private java.math.BigDecimal[] H01GW3_A2814MetPieKil ;
   private String[] H01GW3_A2813MetPieCod ;
   private String[] H01GW3_A130BarCodPar ;
   private byte[] H01GW3_A132BarCodReo ;
   private int[] H01GW3_A129BarCod ;
   private String[] H01GW3_A2809MetTerCod ;
   private String[] H01GW3_A396EmprCod ;
   private String[] H01GW4_A228BarUniMed ;
   private short[] H01GW4_A12994MetPieDfUl ;
   private String[] H01GW4_A4917MetPieObs ;
   private byte[] H01GW4_A2816MetPieEst ;
   private java.math.BigDecimal[] H01GW4_A4910MetPieMtD ;
   private short[] H01GW4_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01GW4_A2815MetPieMet ;
   private java.math.BigDecimal[] H01GW4_A2814MetPieKil ;
   private String[] H01GW4_A2813MetPieCod ;
   private String[] H01GW4_A2809MetTerCod ;
   private String[] H01GW4_A130BarCodPar ;
   private byte[] H01GW4_A132BarCodReo ;
   private int[] H01GW4_A129BarCod ;
   private String[] H01GW4_A396EmprCod ;
   private String[] H01GW5_A228BarUniMed ;
   private short[] H01GW5_A12994MetPieDfUl ;
   private String[] H01GW5_A4917MetPieObs ;
   private byte[] H01GW5_A2816MetPieEst ;
   private java.math.BigDecimal[] H01GW5_A4910MetPieMtD ;
   private short[] H01GW5_A6635MetPieAnc ;
   private java.math.BigDecimal[] H01GW5_A2815MetPieMet ;
   private java.math.BigDecimal[] H01GW5_A2814MetPieKil ;
   private String[] H01GW5_A2813MetPieCod ;
   private String[] H01GW5_A2809MetTerCod ;
   private String[] H01GW5_A130BarCodPar ;
   private byte[] H01GW5_A132BarCodReo ;
   private int[] H01GW5_A129BarCod ;
   private String[] H01GW5_A396EmprCod ;
   private GXSimpleCollection<String> AV81GridCollapsedRecordsChildren ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState AV84OldGridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webcontador_metrajepiezas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01GW2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4917MetPieObs ,
                                          short A12994MetPieDfUl ,
                                          String A228BarUniMed ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          int AV81GridCollapsedRecordsChildren_size ,
                                          GXSimpleCollection<String> AV81GridCollapsedRecordsChildren ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          int A129BarCod ,
                                          int AV56BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV57BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV58BarCodPar ,
                                          String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[38];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.MetTerCod, T1.EmprCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
         GXv_int17[9] = (byte)(1) ;
         GXv_int17[10] = (byte)(1) ;
         GXv_int17[11] = (byte)(1) ;
         GXv_int17[12] = (byte)(1) ;
         GXv_int17[13] = (byte)(1) ;
         GXv_int17[14] = (byte)(1) ;
         GXv_int17[15] = (byte)(1) ;
         GXv_int17[16] = (byte)(1) ;
         GXv_int17[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (0==AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int17[33] = (byte)(1) ;
      }
      if ( ! (0==AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int17[34] = (byte)(1) ;
      }
      if ( ! (0==AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int17[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int17[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetTerCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetTerCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieKil" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieMet" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieAnc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieMtD" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieMtD DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieDfUl" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieDfUl DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01GW3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4917MetPieObs ,
                                          short A12994MetPieDfUl ,
                                          String A228BarUniMed ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          int AV81GridCollapsedRecordsChildren_size ,
                                          GXSimpleCollection<String> AV81GridCollapsedRecordsChildren ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          int A129BarCod ,
                                          int AV56BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV57BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV58BarCodPar ,
                                          String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[38];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T1.MetTerCod, T1.EmprCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
         GXv_int19[13] = (byte)(1) ;
         GXv_int19[14] = (byte)(1) ;
         GXv_int19[15] = (byte)(1) ;
         GXv_int19[16] = (byte)(1) ;
         GXv_int19[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (0==AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int19[33] = (byte)(1) ;
      }
      if ( ! (0==AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int19[34] = (byte)(1) ;
      }
      if ( ! (0==AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int19[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int19[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetTerCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetTerCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieKil" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieKil DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieMet" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieMet DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieAnc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieAnc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieMtD" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieMtD DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.MetPieEst, T1.MetPieDfUl" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.MetPieEst DESC, T1.MetPieDfUl DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01GW4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4917MetPieObs ,
                                          short A12994MetPieDfUl ,
                                          String A228BarUniMed ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          int A129BarCod ,
                                          int AV56BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV57BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV58BarCodPar ,
                                          String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[38];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod, T1.MetTerCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
         GXv_int21[13] = (byte)(1) ;
         GXv_int21[14] = (byte)(1) ;
         GXv_int21[15] = (byte)(1) ;
         GXv_int21[16] = (byte)(1) ;
         GXv_int21[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (0==AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( ! (0==AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (0==AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int21[33] = (byte)(1) ;
      }
      if ( ! (0==AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01GW5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext ,
                                          String AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel ,
                                          String AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod ,
                                          String AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel ,
                                          String AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod ,
                                          java.math.BigDecimal AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil ,
                                          java.math.BigDecimal AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to ,
                                          java.math.BigDecimal AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet ,
                                          java.math.BigDecimal AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to ,
                                          short AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc ,
                                          short AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to ,
                                          java.math.BigDecimal AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd ,
                                          java.math.BigDecimal AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to ,
                                          byte AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest ,
                                          byte AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to ,
                                          String AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel ,
                                          String AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs ,
                                          short AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult ,
                                          short AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to ,
                                          String AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel ,
                                          String AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed ,
                                          String A2809MetTerCod ,
                                          String A2813MetPieCod ,
                                          java.math.BigDecimal A2814MetPieKil ,
                                          java.math.BigDecimal A2815MetPieMet ,
                                          short A6635MetPieAnc ,
                                          java.math.BigDecimal A4910MetPieMtD ,
                                          byte A2816MetPieEst ,
                                          String A4917MetPieObs ,
                                          short A12994MetPieDfUl ,
                                          String A228BarUniMed ,
                                          String A396EmprCod ,
                                          String AV55EmprCod ,
                                          int A129BarCod ,
                                          int AV56BarCod ,
                                          byte A132BarCodReo ,
                                          byte AV57BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV58BarCodPar ,
                                          byte AV80GroupMetPieEst ,
                                          String AV100Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_1_emprcod ,
                                          int AV101Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_2_barcod ,
                                          byte AV102Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_3_barcodreo ,
                                          String AV103Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_4_barcodpar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[39];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T2.BarUniMed, T1.MetPieDfUl, T1.MetPieObs, T1.MetPieEst, T1.MetPieMtD, T1.MetPieAnc, T1.MetPieMet, T1.MetPieKil, T1.MetPieCod, T1.MetTerCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.EmprCod FROM (TXPLMETPI T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.MetPieCod) IS NULL AND NOT(T1.MetPieCod IS NULL)))");
      addWhere(sWhereString, "((T1.MetPieEst = 0))");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.MetPieEst = ?)");
      if ( ! (GXutil.strcmp("", AV104Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_5_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.MetTerCod) like '%' || UPPER(?)) or ( UPPER(T1.MetPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieAnc,'990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieMtD,'99990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.MetPieEst,'90'), 2) like '%' || ?) or ( UPPER(T1.MetPieObs) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.MetPieDfUl,'9990'), 2) like '%' || ?) or ( UPPER(T2.BarUniMed) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
         GXv_int23[12] = (byte)(1) ;
         GXv_int23[13] = (byte)(1) ;
         GXv_int23[14] = (byte)(1) ;
         GXv_int23[15] = (byte)(1) ;
         GXv_int23[16] = (byte)(1) ;
         GXv_int23[17] = (byte)(1) ;
         GXv_int23[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) && ( ! (GXutil.strcmp("", AV105Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_6_tfmettercod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetTerCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_7_tfmettercod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetTerCod = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV107Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_8_tfmetpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_9_tfmetpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieCod = ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_10_tfmetpiekil)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil >= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_11_tfmetpiekil_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieKil <= ?)");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_12_tfmetpiemet)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet >= ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_13_tfmetpiemet_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMet <= ?)");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (0==AV113Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_14_tfmetpieanc) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc >= ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (0==AV114Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_15_tfmetpieanc_to) )
      {
         addWhere(sWhereString, "(T1.MetPieAnc <= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV115Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_16_tfmetpiemtd)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD >= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV116Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_17_tfmetpiemtd_to)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieMtD <= ?)");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (0==AV117Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_18_tfmetpieest) )
      {
         addWhere(sWhereString, "(T1.MetPieEst >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV118Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_19_tfmetpieest_to) )
      {
         addWhere(sWhereString, "(T1.MetPieEst <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) && ( ! (GXutil.strcmp("", AV119Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_20_tfmetpieobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MetPieObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV120Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_21_tfmetpieobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MetPieObs = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV121Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_22_tfmetpiedfult) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV122Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_23_tfmetpiedfult_to) )
      {
         addWhere(sWhereString, "(T1.MetPieDfUl <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) && ( ! (GXutil.strcmp("", AV123Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_24_tfbarunimed)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarUniMed) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Expedicionesautomatizadas_webcontador_metrajepiezas_wcds_25_tfbarunimed_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarUniMed = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
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
                  return conditional_H01GW2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , ((Number) dynConstraints[33]).intValue() , (GXSimpleCollection<String>)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
            case 1 :
                  return conditional_H01GW3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , ((Number) dynConstraints[33]).intValue() , (GXSimpleCollection<String>)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] );
            case 2 :
                  return conditional_H01GW4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).intValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] );
            case 3 :
                  return conditional_H01GW5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , ((Number) dynConstraints[9]).shortValue() , ((Number) dynConstraints[10]).shortValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , (java.math.BigDecimal)dynConstraints[26] , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , ((Number) dynConstraints[36]).byteValue() , (String)dynConstraints[37] , (String)dynConstraints[38] , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , ((Number) dynConstraints[41]).intValue() , ((Number) dynConstraints[42]).byteValue() , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01GW2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01GW3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01GW4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01GW5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 10);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 9);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[64]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[65]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 1024);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[72]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[73]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 3);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[45]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 10);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 10);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 9);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 9);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[66]).shortValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[67]).shortValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[71]).byteValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 1024);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 1024);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[74]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[75]).shortValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 1);
               }
               return;
      }
   }

}

