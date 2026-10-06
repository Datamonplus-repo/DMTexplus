package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cargasproduccionporproceso_wc_impl extends GXWebComponent
{
   public cargasproduccionporproceso_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cargasproduccionporproceso_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cargasproduccionporproceso_wc_impl.class ));
   }

   public cargasproduccionporproceso_wc_impl( int remoteHandle ,
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
      cmbProFasEst = new HTMLChoice();
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
               AV13EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
               AV28ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ProCod", AV28ProCod);
               AV27CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
               AV29CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod_to), 6, 0));
               AV30BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
               AV31BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGen_to", localUtil.format(AV31BarFecGen_to, "99/99/99"));
               AV32BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
               AV33BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSit_to), 2, 0));
               AV26Profasest = (byte)(GXutil.lval( httpContext.GetPar( "Profasest"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Profasest", GXutil.str( AV26Profasest, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13EmprCod,AV28ProCod,Integer.valueOf(AV27CliCod),Integer.valueOf(AV29CliCod_to),AV30BarFecGen,AV31BarFecGen_to,Byte.valueOf(AV32BarSit),Byte.valueOf(AV33BarSit_to),Byte.valueOf(AV26Profasest)});
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
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
      AV28ProCod = httpContext.GetPar( "ProCod") ;
      AV27CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV29CliCod_to = (int)(GXutil.lval( httpContext.GetPar( "CliCod_to"))) ;
      AV30BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV31BarFecGen_to = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen_to")) ;
      AV32BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV33BarSit_to = (byte)(GXutil.lval( httpContext.GetPar( "BarSit_to"))) ;
      AV26Profasest = (byte)(GXutil.lval( httpContext.GetPar( "Profasest"))) ;
      AV21ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV16ColumnsSelector);
      AV90Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV35OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78TFProFasEst_Sels);
      AV42TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV43TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV44TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV45TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV46TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV47TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV48TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV49TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV50TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV51TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV52TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV53TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV54TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV55TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV56TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV57TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV58TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV59TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV60TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV61TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV62TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV63TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV64TFBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm"), ".") ;
      AV65TFBarKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarKgm_To"), ".") ;
      AV66TFBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr"), ".") ;
      AV67TFBarMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarMtr_To"), ".") ;
      AV68TFBarFasCod = httpContext.GetPar( "TFBarFasCod") ;
      AV69TFBarFasCod_Sel = httpContext.GetPar( "TFBarFasCod_Sel") ;
      AV79TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV81TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      A13878PedidoClie = httpContext.GetPar( "PedidoClie") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1ZT2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Cargas Produccionpor Proceso", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.cargasproduccionporproceso_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV28ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV27CliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29CliCod_to,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30BarFecGen)),GXutil.URLEncode(GXutil.formatDateParm(AV31BarFecGen_to)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV33BarSit_to,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV26Profasest,1,0))}, new String[] {"EmprCod","ProCod","CliCod","CliCod_to","BarFecGen","BarFecGen_to","BarSit","BarSit_to","Profasest"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV79TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV81TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV12FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV19ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV24GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV25GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV22DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV16ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13EmprCod", GXutil.rtrim( wcpOAV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28ProCod", GXutil.rtrim( wcpOAV28ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27CliCod", GXutil.ltrim( localUtil.ntoc( wcpOAV27CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29CliCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV29CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30BarFecGen", localUtil.dtoc( wcpOAV30BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31BarFecGen_to", localUtil.dtoc( wcpOAV31BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32BarSit", GXutil.ltrim( localUtil.ntoc( wcpOAV32BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33BarSit_to", GXutil.ltrim( localUtil.ntoc( wcpOAV33BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Profasest", GXutil.ltrim( localUtil.ntoc( wcpOAV26Profasest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV21ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV34OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV35OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vTFPROFASEST_SELS", AV78TFProFasEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vTFPROFASEST_SELS", AV78TFProFasEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV42TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV43TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM", GXutil.rtrim( AV44TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLINOM_SEL", GXutil.rtrim( AV45TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV46TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV47TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV48TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV49TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV50TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV51TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV52TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV53TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV54TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV55TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC", GXutil.rtrim( AV56TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSERDSC_SEL", GXutil.rtrim( AV57TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV58TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV59TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV60TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV61TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV62TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV63TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM", GXutil.ltrim( localUtil.ntoc( AV64TFBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARKGM_TO", GXutil.ltrim( localUtil.ntoc( AV65TFBarKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR", GXutil.ltrim( localUtil.ntoc( AV66TFBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARMTR_TO", GXutil.ltrim( localUtil.ntoc( AV67TFBarMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD", GXutil.rtrim( AV68TFBarFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARFASCOD_SEL", GXutil.rtrim( AV69TFBarFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROCOD", GXutil.rtrim( AV28ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD", GXutil.ltrim( localUtil.ntoc( AV27CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV29CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARFECGEN", localUtil.dtoc( A159BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN", localUtil.dtoc( AV30BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARFECGEN_TO", localUtil.dtoc( AV31BarFecGen_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT", GXutil.ltrim( localUtil.ntoc( AV32BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV33BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPROFASEST", GXutil.ltrim( localUtil.ntoc( AV26Profasest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV79TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV79TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV81TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV81TotBarMtr, "ZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPROFASEST_SELSJSON", AV77TFProFasEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PROEST", GXutil.rtrim( A14284ProEst));
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

   public void renderHtmlCloseForm1ZT2( )
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
      return "Produccion.CargasProduccionporProceso_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Cargas Produccionpor Proceso", "") ;
   }

   public void wb1ZT0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.cargasproduccionporproceso_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnusuexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "PDF", ""), bttBtnusuexportreport_Jsonclick, 5, httpContext.getMessage( "PDF", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOUSUEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1ZT2( true) ;
      }
      else
      {
         wb_table1_25_1ZT2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1ZT2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_64_1ZT2( true) ;
      }
      else
      {
         wb_table2_64_1ZT2( false) ;
      }
      return  ;
   }

   public void wb_table2_64_1ZT2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV24GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV25GridPageCount);
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0093"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0093"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0093"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV22DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV16ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV90Pgmname), GXutil.rtrim( localUtil.format( AV90Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
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

   public void start1ZT2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Cargas Produccionpor Proceso", ""), (short)(0)) ;
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
            strup1ZT0( ) ;
         }
      }
   }

   public void ws1ZT2( )
   {
      start1ZT2( ) ;
      evt1ZT2( ) ;
   }

   public void evt1ZT2( )
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
                              strup1ZT0( ) ;
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
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSUEXPORTREPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUsuExportReport' */
                                 e161ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181ZT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "'DOWINEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "'DOEXPORTREPORT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1ZT0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV70DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV70DetailWebComponent);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           cmbProFasEst.setName( cmbProFasEst.getInternalname() );
                           cmbProFasEst.setValue( httpContext.cgiGet( cmbProFasEst.getInternalname()) );
                           A760ProFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbProFasEst.getInternalname()))) ;
                           n760ProFasEst = false ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           AV37BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV37BarEncCli);
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191ZT2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201ZT2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211ZT2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOWINEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoWinExportReport' */
                                       e221ZT2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportReport' */
                                       e231ZT2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
                                    strup1ZT0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                     if ( nCmpId == 93 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0093") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0093", "", sEvt);
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

   public void we1ZT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1ZT2( ) ;
         }
      }
   }

   public void pa1ZT2( )
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
                                 String AV12FilterFullText ,
                                 String AV13EmprCod ,
                                 String AV28ProCod ,
                                 int AV27CliCod ,
                                 int AV29CliCod_to ,
                                 java.util.Date AV30BarFecGen ,
                                 java.util.Date AV31BarFecGen_to ,
                                 byte AV32BarSit ,
                                 byte AV33BarSit_to ,
                                 byte AV26Profasest ,
                                 byte AV21ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ,
                                 String AV90Pgmname ,
                                 short AV34OrderedBy ,
                                 boolean AV35OrderedDsc ,
                                 GXSimpleCollection<Byte> AV78TFProFasEst_Sels ,
                                 int AV42TFCliCod ,
                                 int AV43TFCliCod_To ,
                                 String AV44TFCliNom ,
                                 String AV45TFCliNom_Sel ,
                                 int AV46TFBarCod ,
                                 int AV47TFBarCod_To ,
                                 byte AV48TFBarCodReo ,
                                 byte AV49TFBarCodReo_To ,
                                 String AV50TFBarCodPar ,
                                 String AV51TFBarCodPar_Sel ,
                                 byte AV52TFBarSit ,
                                 byte AV53TFBarSit_To ,
                                 String AV54TFBarSer ,
                                 String AV55TFBarSer_Sel ,
                                 String AV56TFBarSerDsc ,
                                 String AV57TFBarSerDsc_Sel ,
                                 String AV58TFBarColNom ,
                                 String AV59TFBarColNom_Sel ,
                                 int AV60TFBarColNum ,
                                 int AV61TFBarColNum_To ,
                                 String AV62TFBarNomCli ,
                                 String AV63TFBarNomCli_Sel ,
                                 java.math.BigDecimal AV64TFBarKgm ,
                                 java.math.BigDecimal AV65TFBarKgm_To ,
                                 java.math.BigDecimal AV66TFBarMtr ,
                                 java.math.BigDecimal AV67TFBarMtr_To ,
                                 String AV68TFBarFasCod ,
                                 String AV69TFBarFasCod_Sel ,
                                 java.math.BigDecimal AV79TotBarKgm ,
                                 java.math.BigDecimal AV81TotBarMtr ,
                                 String A13878PedidoClie ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201ZT2 ();
      GRID_nCurrentRecord = 0 ;
      rf1ZT2( ) ;
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
      rf1ZT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV90Pgmname = "Produccion.CargasProduccionporProceso_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV78TFProFasEst_Sels ,
                                           Integer.valueOf(AV42TFCliCod) ,
                                           Integer.valueOf(AV43TFCliCod_To) ,
                                           AV45TFCliNom_Sel ,
                                           AV44TFCliNom ,
                                           Integer.valueOf(AV46TFBarCod) ,
                                           Integer.valueOf(AV47TFBarCod_To) ,
                                           Byte.valueOf(AV48TFBarCodReo) ,
                                           Byte.valueOf(AV49TFBarCodReo_To) ,
                                           AV51TFBarCodPar_Sel ,
                                           AV50TFBarCodPar ,
                                           Byte.valueOf(AV52TFBarSit) ,
                                           Byte.valueOf(AV53TFBarSit_To) ,
                                           AV55TFBarSer_Sel ,
                                           AV54TFBarSer ,
                                           AV57TFBarSerDsc_Sel ,
                                           AV56TFBarSerDsc ,
                                           AV59TFBarColNom_Sel ,
                                           AV58TFBarColNom ,
                                           Integer.valueOf(AV60TFBarColNum) ,
                                           Integer.valueOf(AV61TFBarColNum_To) ,
                                           AV63TFBarNomCli_Sel ,
                                           AV62TFBarNomCli ,
                                           AV64TFBarKgm ,
                                           AV65TFBarKgm_To ,
                                           AV66TFBarMtr ,
                                           AV67TFBarMtr_To ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           Short.valueOf(AV34OrderedBy) ,
                                           Boolean.valueOf(AV35OrderedDsc) ,
                                           AV12FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV78TFProFasEst_Sels.size()) ,
                                           AV69TFBarFasCod_Sel ,
                                           AV68TFBarFasCod ,
                                           Integer.valueOf(AV27CliCod) ,
                                           Integer.valueOf(AV29CliCod_to) ,
                                           A159BarFecGen ,
                                           AV30BarFecGen ,
                                           AV31BarFecGen_to ,
                                           Byte.valueOf(AV32BarSit) ,
                                           Byte.valueOf(AV33BarSit_to) ,
                                           Byte.valueOf(AV26Profasest) ,
                                           A14284ProEst ,
                                           AV13EmprCod ,
                                           AV28ProCod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV68TFBarFasCod = GXutil.padr( GXutil.rtrim( AV68TFBarFasCod), 8, "%") ;
      lV44TFCliNom = GXutil.padr( GXutil.rtrim( AV44TFCliNom), 30, "%") ;
      lV50TFBarCodPar = GXutil.padr( GXutil.rtrim( AV50TFBarCodPar), 1, "%") ;
      lV54TFBarSer = GXutil.padr( GXutil.rtrim( AV54TFBarSer), 16, "%") ;
      lV56TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV56TFBarSerDsc), 26, "%") ;
      lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
      lV62TFBarNomCli = GXutil.padr( GXutil.rtrim( AV62TFBarNomCli), 13, "%") ;
      /* Using cursor H01ZT6 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV28ProCod, AV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, Integer.valueOf(AV78TFProFasEst_Sels.size()), AV69TFBarFasCod_Sel, AV68TFBarFasCod, lV68TFBarFasCod, AV69TFBarFasCod_Sel, AV69TFBarFasCod_Sel, Integer.valueOf(AV27CliCod), Integer.valueOf(AV29CliCod_to), AV30BarFecGen, AV31BarFecGen_to, Byte.valueOf(AV32BarSit), Byte.valueOf(AV33BarSit_to), Byte.valueOf(AV26Profasest), Integer.valueOf(AV42TFCliCod), Integer.valueOf(AV43TFCliCod_To), lV44TFCliNom, AV45TFCliNom_Sel, Integer.valueOf(AV46TFBarCod), Integer.valueOf(AV47TFBarCod_To), Byte.valueOf(AV48TFBarCodReo), Byte.valueOf(AV49TFBarCodReo_To), lV50TFBarCodPar, AV51TFBarCodPar_Sel, Byte.valueOf(AV52TFBarSit), Byte.valueOf(AV53TFBarSit_To), lV54TFBarSer, AV55TFBarSer_Sel, lV56TFBarSerDsc, AV57TFBarSerDsc_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, Integer.valueOf(AV60TFBarColNum), Integer.valueOf(AV61TFBarColNum_To), lV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A159BarFecGen = H01ZT6_A159BarFecGen[0] ;
         A14284ProEst = H01ZT6_A14284ProEst[0] ;
         A758ProCod = H01ZT6_A758ProCod[0] ;
         A1234BarNomCli = H01ZT6_A1234BarNomCli[0] ;
         A136BarColNum = H01ZT6_A136BarColNum[0] ;
         A135BarColNom = H01ZT6_A135BarColNom[0] ;
         A1652BarSerDsc = H01ZT6_A1652BarSerDsc[0] ;
         A212BarSer = H01ZT6_A212BarSer[0] ;
         A213BarSit = H01ZT6_A213BarSit[0] ;
         A130BarCodPar = H01ZT6_A130BarCodPar[0] ;
         A132BarCodReo = H01ZT6_A132BarCodReo[0] ;
         A129BarCod = H01ZT6_A129BarCod[0] ;
         A279CliNom = H01ZT6_A279CliNom[0] ;
         A252CliCod = H01ZT6_A252CliCod[0] ;
         n252CliCod = H01ZT6_n252CliCod[0] ;
         A151BarFasCod = H01ZT6_A151BarFasCod[0] ;
         n151BarFasCod = H01ZT6_n151BarFasCod[0] ;
         A184BarMtr = H01ZT6_A184BarMtr[0] ;
         A166BarKgm = H01ZT6_A166BarKgm[0] ;
         A760ProFasEst = H01ZT6_A760ProFasEst[0] ;
         n760ProFasEst = H01ZT6_n760ProFasEst[0] ;
         A143BarDisNum = H01ZT6_A143BarDisNum[0] ;
         A4812BarEncCli = H01ZT6_A4812BarEncCli[0] ;
         A396EmprCod = H01ZT6_A396EmprCod[0] ;
         A159BarFecGen = H01ZT6_A159BarFecGen[0] ;
         A1234BarNomCli = H01ZT6_A1234BarNomCli[0] ;
         A136BarColNum = H01ZT6_A136BarColNum[0] ;
         A135BarColNom = H01ZT6_A135BarColNom[0] ;
         A1652BarSerDsc = H01ZT6_A1652BarSerDsc[0] ;
         A212BarSer = H01ZT6_A212BarSer[0] ;
         A213BarSit = H01ZT6_A213BarSit[0] ;
         A252CliCod = H01ZT6_A252CliCod[0] ;
         n252CliCod = H01ZT6_n252CliCod[0] ;
         A143BarDisNum = H01ZT6_A143BarDisNum[0] ;
         A4812BarEncCli = H01ZT6_A4812BarEncCli[0] ;
         A279CliNom = H01ZT6_A279CliNom[0] ;
         A14284ProEst = H01ZT6_A14284ProEst[0] ;
         A151BarFasCod = H01ZT6_A151BarFasCod[0] ;
         n151BarFasCod = H01ZT6_n151BarFasCod[0] ;
         A184BarMtr = H01ZT6_A184BarMtr[0] ;
         A166BarKgm = H01ZT6_A166BarKgm[0] ;
         A760ProFasEst = H01ZT6_A760ProFasEst[0] ;
         n760ProFasEst = H01ZT6_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            GXt_char1 = A13878PedidoClie ;
            GXv_char2[0] = A396EmprCod ;
            GXv_char3[0] = A4812BarEncCli ;
            GXv_char4[0] = A143BarDisNum ;
            GXv_char5[0] = GXt_char1 ;
            new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4, GXv_char5) ;
            cargasproduccionporproceso_wc_impl.this.A396EmprCod = GXv_char2[0] ;
            cargasproduccionporproceso_wc_impl.this.A4812BarEncCli = GXv_char3[0] ;
            cargasproduccionporproceso_wc_impl.this.A143BarDisNum = GXv_char4[0] ;
            cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
            A13878PedidoClie = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1ZT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201ZT2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A760ProFasEst) ,
                                              AV78TFProFasEst_Sels ,
                                              Integer.valueOf(AV42TFCliCod) ,
                                              Integer.valueOf(AV43TFCliCod_To) ,
                                              AV45TFCliNom_Sel ,
                                              AV44TFCliNom ,
                                              Integer.valueOf(AV46TFBarCod) ,
                                              Integer.valueOf(AV47TFBarCod_To) ,
                                              Byte.valueOf(AV48TFBarCodReo) ,
                                              Byte.valueOf(AV49TFBarCodReo_To) ,
                                              AV51TFBarCodPar_Sel ,
                                              AV50TFBarCodPar ,
                                              Byte.valueOf(AV52TFBarSit) ,
                                              Byte.valueOf(AV53TFBarSit_To) ,
                                              AV55TFBarSer_Sel ,
                                              AV54TFBarSer ,
                                              AV57TFBarSerDsc_Sel ,
                                              AV56TFBarSerDsc ,
                                              AV59TFBarColNom_Sel ,
                                              AV58TFBarColNom ,
                                              Integer.valueOf(AV60TFBarColNum) ,
                                              Integer.valueOf(AV61TFBarColNum_To) ,
                                              AV63TFBarNomCli_Sel ,
                                              AV62TFBarNomCli ,
                                              AV64TFBarKgm ,
                                              AV65TFBarKgm_To ,
                                              AV66TFBarMtr ,
                                              AV67TFBarMtr_To ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Byte.valueOf(A213BarSit) ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              A166BarKgm ,
                                              A184BarMtr ,
                                              Short.valueOf(AV34OrderedBy) ,
                                              Boolean.valueOf(AV35OrderedDsc) ,
                                              AV12FilterFullText ,
                                              A151BarFasCod ,
                                              Integer.valueOf(AV78TFProFasEst_Sels.size()) ,
                                              AV69TFBarFasCod_Sel ,
                                              AV68TFBarFasCod ,
                                              Integer.valueOf(AV27CliCod) ,
                                              Integer.valueOf(AV29CliCod_to) ,
                                              A159BarFecGen ,
                                              AV30BarFecGen ,
                                              AV31BarFecGen_to ,
                                              Byte.valueOf(AV32BarSit) ,
                                              Byte.valueOf(AV33BarSit_to) ,
                                              Byte.valueOf(AV26Profasest) ,
                                              A14284ProEst ,
                                              AV13EmprCod ,
                                              AV28ProCod ,
                                              A396EmprCod ,
                                              A758ProCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
         lV68TFBarFasCod = GXutil.padr( GXutil.rtrim( AV68TFBarFasCod), 8, "%") ;
         lV44TFCliNom = GXutil.padr( GXutil.rtrim( AV44TFCliNom), 30, "%") ;
         lV50TFBarCodPar = GXutil.padr( GXutil.rtrim( AV50TFBarCodPar), 1, "%") ;
         lV54TFBarSer = GXutil.padr( GXutil.rtrim( AV54TFBarSer), 16, "%") ;
         lV56TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV56TFBarSerDsc), 26, "%") ;
         lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
         lV62TFBarNomCli = GXutil.padr( GXutil.rtrim( AV62TFBarNomCli), 13, "%") ;
         /* Using cursor H01ZT11 */
         pr_default.execute(1, new Object[] {AV13EmprCod, AV28ProCod, AV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, Integer.valueOf(AV78TFProFasEst_Sels.size()), AV69TFBarFasCod_Sel, AV68TFBarFasCod, lV68TFBarFasCod, AV69TFBarFasCod_Sel, AV69TFBarFasCod_Sel, Integer.valueOf(AV27CliCod), Integer.valueOf(AV29CliCod_to), AV30BarFecGen, AV31BarFecGen_to, Byte.valueOf(AV32BarSit), Byte.valueOf(AV33BarSit_to), Byte.valueOf(AV26Profasest), Integer.valueOf(AV42TFCliCod), Integer.valueOf(AV43TFCliCod_To), lV44TFCliNom, AV45TFCliNom_Sel, Integer.valueOf(AV46TFBarCod), Integer.valueOf(AV47TFBarCod_To), Byte.valueOf(AV48TFBarCodReo), Byte.valueOf(AV49TFBarCodReo_To), lV50TFBarCodPar, AV51TFBarCodPar_Sel, Byte.valueOf(AV52TFBarSit), Byte.valueOf(AV53TFBarSit_To), lV54TFBarSer, AV55TFBarSer_Sel, lV56TFBarSerDsc, AV57TFBarSerDsc_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, Integer.valueOf(AV60TFBarColNum), Integer.valueOf(AV61TFBarColNum_To), lV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A159BarFecGen = H01ZT11_A159BarFecGen[0] ;
            A14284ProEst = H01ZT11_A14284ProEst[0] ;
            A758ProCod = H01ZT11_A758ProCod[0] ;
            A1234BarNomCli = H01ZT11_A1234BarNomCli[0] ;
            A136BarColNum = H01ZT11_A136BarColNum[0] ;
            A135BarColNom = H01ZT11_A135BarColNom[0] ;
            A1652BarSerDsc = H01ZT11_A1652BarSerDsc[0] ;
            A212BarSer = H01ZT11_A212BarSer[0] ;
            A213BarSit = H01ZT11_A213BarSit[0] ;
            A130BarCodPar = H01ZT11_A130BarCodPar[0] ;
            A132BarCodReo = H01ZT11_A132BarCodReo[0] ;
            A129BarCod = H01ZT11_A129BarCod[0] ;
            A279CliNom = H01ZT11_A279CliNom[0] ;
            A252CliCod = H01ZT11_A252CliCod[0] ;
            n252CliCod = H01ZT11_n252CliCod[0] ;
            A151BarFasCod = H01ZT11_A151BarFasCod[0] ;
            n151BarFasCod = H01ZT11_n151BarFasCod[0] ;
            A184BarMtr = H01ZT11_A184BarMtr[0] ;
            A166BarKgm = H01ZT11_A166BarKgm[0] ;
            A760ProFasEst = H01ZT11_A760ProFasEst[0] ;
            n760ProFasEst = H01ZT11_n760ProFasEst[0] ;
            A143BarDisNum = H01ZT11_A143BarDisNum[0] ;
            A4812BarEncCli = H01ZT11_A4812BarEncCli[0] ;
            A396EmprCod = H01ZT11_A396EmprCod[0] ;
            A159BarFecGen = H01ZT11_A159BarFecGen[0] ;
            A1234BarNomCli = H01ZT11_A1234BarNomCli[0] ;
            A136BarColNum = H01ZT11_A136BarColNum[0] ;
            A135BarColNom = H01ZT11_A135BarColNom[0] ;
            A1652BarSerDsc = H01ZT11_A1652BarSerDsc[0] ;
            A212BarSer = H01ZT11_A212BarSer[0] ;
            A213BarSit = H01ZT11_A213BarSit[0] ;
            A252CliCod = H01ZT11_A252CliCod[0] ;
            n252CliCod = H01ZT11_n252CliCod[0] ;
            A143BarDisNum = H01ZT11_A143BarDisNum[0] ;
            A4812BarEncCli = H01ZT11_A4812BarEncCli[0] ;
            A279CliNom = H01ZT11_A279CliNom[0] ;
            A14284ProEst = H01ZT11_A14284ProEst[0] ;
            A151BarFasCod = H01ZT11_A151BarFasCod[0] ;
            n151BarFasCod = H01ZT11_n151BarFasCod[0] ;
            A184BarMtr = H01ZT11_A184BarMtr[0] ;
            A166BarKgm = H01ZT11_A166BarKgm[0] ;
            A760ProFasEst = H01ZT11_A760ProFasEst[0] ;
            n760ProFasEst = H01ZT11_n760ProFasEst[0] ;
            if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
            {
               GXt_char1 = A13878PedidoClie ;
               GXv_char5[0] = A396EmprCod ;
               GXv_char4[0] = A4812BarEncCli ;
               GXv_char3[0] = A143BarDisNum ;
               GXv_char2[0] = GXt_char1 ;
               new app.core.ppedidocliente_formula(remoteHandle, context).execute( GXv_char5, GXv_char4, GXv_char3, GXv_char2) ;
               cargasproduccionporproceso_wc_impl.this.A396EmprCod = GXv_char5[0] ;
               cargasproduccionporproceso_wc_impl.this.A4812BarEncCli = GXv_char4[0] ;
               cargasproduccionporproceso_wc_impl.this.A143BarDisNum = GXv_char3[0] ;
               cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A143BarDisNum", A143BarDisNum);
               A13878PedidoClie = GXt_char1 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13878PedidoClie", A13878PedidoClie);
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
               e211ZT2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(43) ;
         wb1ZT0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1ZT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV79TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV79TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV81TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV81TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDIDOCLIE", GXutil.rtrim( A13878PedidoClie));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDIDOCLIE", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A13878PedidoClie, ""))));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV12FilterFullText, AV13EmprCod, AV28ProCod, AV27CliCod, AV29CliCod_to, AV30BarFecGen, AV31BarFecGen_to, AV32BarSit, AV33BarSit_to, AV26Profasest, AV21ManageFiltersExecutionStep, AV16ColumnsSelector, AV90Pgmname, AV34OrderedBy, AV35OrderedDsc, AV78TFProFasEst_Sels, AV42TFCliCod, AV43TFCliCod_To, AV44TFCliNom, AV45TFCliNom_Sel, AV46TFBarCod, AV47TFBarCod_To, AV48TFBarCodReo, AV49TFBarCodReo_To, AV50TFBarCodPar, AV51TFBarCodPar_Sel, AV52TFBarSit, AV53TFBarSit_To, AV54TFBarSer, AV55TFBarSer_Sel, AV56TFBarSerDsc, AV57TFBarSerDsc_Sel, AV58TFBarColNom, AV59TFBarColNom_Sel, AV60TFBarColNum, AV61TFBarColNum_To, AV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To, AV68TFBarFasCod, AV69TFBarFasCod_Sel, AV79TotBarKgm, AV81TotBarMtr, A13878PedidoClie, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV90Pgmname = "Produccion.CargasProduccionporProceso_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191ZT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV19ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV22DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV16ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV25GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
         wcpOAV28ProCod = httpContext.cgiGet( sPrefix+"wcpOAV28ProCod") ;
         wcpOAV27CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV29CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30BarFecGen"), 0) ;
         wcpOAV31BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31BarFecGen_to"), 0) ;
         wcpOAV32BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV33BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26Profasest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Profasest"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13878PedidoClie = httpContext.cgiGet( sPrefix+"PEDIDOCLIE") ;
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
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV80TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TotValueBarKgm", AV80TotValueBarKgm);
         AV82TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueBarMtr", AV82TotValueBarMtr);
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV12FilterFullText) != 0 )
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
      e191ZT2 ();
      if (returnInSub) return;
   }

   public void e191ZT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV83Station ;
      GXv_char5[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char5) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV83Station = GXt_char1 ;
      GXv_char5[0] = AV13EmprCod ;
      GXv_char4[0] = AV84EmprNom ;
      GXv_char3[0] = AV85UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char5, GXv_char4, GXv_char3) ;
      cargasproduccionporproceso_wc_impl.this.AV13EmprCod = GXv_char5[0] ;
      cargasproduccionporproceso_wc_impl.this.AV84EmprNom = GXv_char4[0] ;
      cargasproduccionporproceso_wc_impl.this.AV85UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
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
      if ( AV34OrderedBy < 1 )
      {
         AV34OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV22DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV22DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201ZT2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV6WWPContext = GXv_SdtWWPContext8[0] ;
      if ( AV21ManageFiltersExecutionStep == 1 )
      {
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV21ManageFiltersExecutionStep == 2 )
      {
         AV21ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV18Session.getValue("Produccion.CargasProduccionporProceso_WCColumnsSelector"), "") != 0 )
      {
         AV14ColumnsSelectorXML = AV18Session.getValue("Produccion.CargasProduccionporProceso_WCColumnsSelector") ;
         AV16ColumnsSelector.fromxml(AV14ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      cmbProFasEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbProFasEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbProFasEst.getVisible(), 5, 0), !bGXsfl_43_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtavBarenccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarenccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarCodReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarCodPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSit_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSit_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarColNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarNomCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarNomCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarKgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKgm_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMtr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtBarFasCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV16ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtBarFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV24GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GridCurrentPage), 10, 0));
      AV25GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'FINBARRAPROGRESO' */
      S192 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV71ProgressIndicator", AV71ProgressIndicator);
   }

   public void e121ZT2( )
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
         AV23PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV23PageToGo) ;
      }
   }

   public void e131ZT2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141ZT2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV34OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
         AV35OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedDsc", AV35OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProFasEst") == 0 )
         {
            AV77TFProFasEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFProFasEst_SelsJson", AV77TFProFasEst_SelsJson);
            AV78TFProFasEst_Sels.fromJSonString(GXutil.strReplace( AV77TFProFasEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
            AV43TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV44TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFCliNom", AV44TFCliNom);
            AV45TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV46TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarCod), 8, 0));
            AV47TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV48TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarCodReo", GXutil.str( AV48TFBarCodReo, 1, 0));
            AV49TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarCodReo_To", GXutil.str( AV49TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV50TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarCodPar", AV50TFBarCodPar);
            AV51TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarCodPar_Sel", AV51TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV52TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarSit), 2, 0));
            AV53TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV54TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarSer", AV54TFBarSer);
            AV55TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer_Sel", AV55TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV56TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSerDsc", AV56TFBarSerDsc);
            AV57TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc_Sel", AV57TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV58TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNom", AV58TFBarColNom);
            AV59TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom_Sel", AV59TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV60TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum), 6, 0));
            AV61TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV62TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarNomCli", AV62TFBarNomCli);
            AV63TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarNomCli_Sel", AV63TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarKgm") == 0 )
         {
            AV64TFBarKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarKgm", GXutil.ltrimstr( AV64TFBarKgm, 9, 2));
            AV65TFBarKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarKgm_To", GXutil.ltrimstr( AV65TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarMtr") == 0 )
         {
            AV66TFBarMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarMtr", GXutil.ltrimstr( AV66TFBarMtr, 9, 2));
            AV67TFBarMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarMtr_To", GXutil.ltrimstr( AV67TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasCod") == 0 )
         {
            AV68TFBarFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasCod", AV68TFBarFasCod);
            AV69TFBarFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarFasCod_Sel", AV69TFBarFasCod_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFProFasEst_Sels", AV78TFProFasEst_Sels);
   }

   private void e211ZT2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV70DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV70DetailWebComponent);
         if ( GXutil.strcmp(A4812BarEncCli, " ") != 0 )
         {
            AV37BarEncCli = A4812BarEncCli ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV37BarEncCli);
         }
         else
         {
            AV37BarEncCli = A143BarDisNum ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarenccli_Internalname, AV37BarEncCli);
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(43) ;
         }
         sendrow_432( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151ZT2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV14ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV16ColumnsSelector.fromJSonString(AV14ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporProceso_WCColumnsSelector", ((GXutil.strcmp("", AV14ColumnsSelectorXML)==0) ? "" : AV16ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV71ProgressIndicator", AV71ProgressIndicator);
   }

   public void e111ZT2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S202 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.CargasProduccionporProceso_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV90Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.CargasProduccionporProceso_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV21ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ManageFiltersExecutionStep", GXutil.str( AV21ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV20ManageFiltersXml ;
         GXv_char5[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.CargasProduccionporProceso_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char5[0] ;
         AV20ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV20ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S202 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV20ManageFiltersXml) ;
            AV10GridState.fromxml(AV20ManageFiltersXml, null, null);
            AV34OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
            AV35OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedDsc", AV35OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S212 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFProFasEst_Sels", AV78TFProFasEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV71ProgressIndicator", AV71ProgressIndicator);
   }

   public void e161ZT2( )
   {
      /* 'DoUsuExportReport' Routine */
      returnInSub = false ;
      AV72WebSession.setValue("FiltroProduccionporProceso_ProCod", AV28ProCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S222 ();
      if (returnInSub) return;
      httpContext.popup(formatLink("app.produccion.cargasproduccionporproceso_usuwcexportreport", new String[] {}, new String[] {}) , new Object[] {});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16ColumnsSelector", AV16ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV19ManageFiltersData", AV19ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV71ProgressIndicator", AV71ProgressIndicator);
   }

   public void e171ZT2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV72WebSession.setValue("FiltroProduccionporProceso_ProCod", AV28ProCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S222 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char5[0] = AV38ExcelFilename ;
      GXv_char4[0] = AV39ErrorMessage ;
      new app.produccion.cargasproduccionporproceso_wcexport(remoteHandle, context).execute( GXv_char5, GXv_char4) ;
      cargasproduccionporproceso_wc_impl.this.AV38ExcelFilename = GXv_char5[0] ;
      cargasproduccionporproceso_wc_impl.this.AV39ErrorMessage = GXv_char4[0] ;
      if ( GXutil.strcmp(AV38ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV38ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV39ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFProFasEst_Sels", AV78TFProFasEst_Sels);
   }

   public void e181ZT2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV72WebSession.setValue("FiltroProduccionporProceso_ProCod", AV28ProCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S222 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.produccion.cargasproduccionporproceso_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV78TFProFasEst_Sels", AV78TFProFasEst_Sels);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV34OrderedBy, 4, 0))+":"+(AV35OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV16ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "ProFasEst", "", "Estado", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliCod", "", "Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "CliNom", "", "Cli.Nombre", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&BarEncCli", "", "Disp. Cliente", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarCod", "", "Hdr", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarCodReo", "", "R", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarCodPar", "", "P", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSit", "", "Sit.", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSer", "", "Artículo", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarSerDsc", "", "Descripción", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNom", "", "Color", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarColNum", "", "Número", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarNomCli", "", "Color Cli", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarKgm", "", "Kgs", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarMtr", "", "Mts", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV16ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "BarFasCod", "", "Ult.Fase", true, "") ;
      AV16ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV15UserCustomValue ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.CargasProduccionporProceso_WCColumnsSelector", GXv_char5) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      AV15UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV15UserCustomValue)==0) ) )
      {
         AV17ColumnsSelectorAux.fromxml(AV15UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV17ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV16ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV17ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV16ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV19ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.CargasProduccionporProceso_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV19ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S202( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
      AV78TFProFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV42TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
      AV43TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
      AV44TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFCliNom", AV44TFCliNom);
      AV45TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
      AV46TFBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarCod), 8, 0));
      AV47TFBarCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarCod_To), 8, 0));
      AV48TFBarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarCodReo", GXutil.str( AV48TFBarCodReo, 1, 0));
      AV49TFBarCodReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarCodReo_To", GXutil.str( AV49TFBarCodReo_To, 1, 0));
      AV50TFBarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarCodPar", AV50TFBarCodPar);
      AV51TFBarCodPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarCodPar_Sel", AV51TFBarCodPar_Sel);
      AV52TFBarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarSit), 2, 0));
      AV53TFBarSit_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarSit_To), 2, 0));
      AV54TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarSer", AV54TFBarSer);
      AV55TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer_Sel", AV55TFBarSer_Sel);
      AV56TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSerDsc", AV56TFBarSerDsc);
      AV57TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc_Sel", AV57TFBarSerDsc_Sel);
      AV58TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNom", AV58TFBarColNom);
      AV59TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom_Sel", AV59TFBarColNom_Sel);
      AV60TFBarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum), 6, 0));
      AV61TFBarColNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum_To), 6, 0));
      AV62TFBarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarNomCli", AV62TFBarNomCli);
      AV63TFBarNomCli_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarNomCli_Sel", AV63TFBarNomCli_Sel);
      AV64TFBarKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarKgm", GXutil.ltrimstr( AV64TFBarKgm, 9, 2));
      AV65TFBarKgm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarKgm_To", GXutil.ltrimstr( AV65TFBarKgm_To, 9, 2));
      AV66TFBarMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarMtr", GXutil.ltrimstr( AV66TFBarMtr, 9, 2));
      AV67TFBarMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarMtr_To", GXutil.ltrimstr( AV67TFBarMtr_To, 9, 2));
      AV68TFBarFasCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasCod", AV68TFBarFasCod);
      AV69TFBarFasCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarFasCod_Sel", AV69TFBarFasCod_Sel);
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
      if ( GXutil.strcmp(AV18Session.getValue(AV90Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV90Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV18Session.getValue(AV90Pgmname+"GridState"), null, null);
      }
      AV34OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OrderedBy), 4, 0));
      AV35OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OrderedDsc", AV35OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S212 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S212( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV91GXV1 = 1 ;
      while ( AV91GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFASEST_SEL") == 0 )
         {
            AV77TFProFasEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TFProFasEst_SelsJson", AV77TFProFasEst_SelsJson);
            AV78TFProFasEst_Sels.fromJSonString(AV77TFProFasEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV42TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42TFCliCod), 6, 0));
            AV43TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV44TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TFCliNom", AV44TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV45TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TFCliNom_Sel", AV45TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV46TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFBarCod), 8, 0));
            AV47TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV48TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFBarCodReo", GXutil.str( AV48TFBarCodReo, 1, 0));
            AV49TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFBarCodReo_To", GXutil.str( AV49TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV50TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFBarCodPar", AV50TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV51TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFBarCodPar_Sel", AV51TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV52TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFBarSit), 2, 0));
            AV53TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV54TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFBarSer", AV54TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV55TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFBarSer_Sel", AV55TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV56TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFBarSerDsc", AV56TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV57TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFBarSerDsc_Sel", AV57TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV58TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFBarColNom", AV58TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV59TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFBarColNom_Sel", AV59TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV60TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFBarColNum), 6, 0));
            AV61TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV62TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFBarNomCli", AV62TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV63TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFBarNomCli_Sel", AV63TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARKGM") == 0 )
         {
            AV64TFBarKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFBarKgm", GXutil.ltrimstr( AV64TFBarKgm, 9, 2));
            AV65TFBarKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFBarKgm_To", GXutil.ltrimstr( AV65TFBarKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARMTR") == 0 )
         {
            AV66TFBarMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFBarMtr", GXutil.ltrimstr( AV66TFBarMtr, 9, 2));
            AV67TFBarMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFBarMtr_To", GXutil.ltrimstr( AV67TFBarMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD") == 0 )
         {
            AV68TFBarFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFBarFasCod", AV68TFBarFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASCOD_SEL") == 0 )
         {
            AV69TFBarFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFBarFasCod_Sel", AV69TFBarFasCod_Sel);
         }
         AV91GXV1 = (int)(AV91GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFCliNom_Sel)==0), AV45TFCliNom_Sel, GXv_char5) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0), AV51TFBarCodPar_Sel, GXv_char4) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarSer_Sel)==0), AV55TFBarSer_Sel, GXv_char3) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0), AV57TFBarSerDsc_Sel, GXv_char2) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0), AV59TFBarColNom_Sel, GXv_char17) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0), AV63TFBarNomCli_Sel, GXv_char19) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFBarFasCod_Sel)==0), AV69TFBarFasCod_Sel, GXv_char21) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = ((AV78TFProFasEst_Sels.size()==0) ? "" : AV77TFProFasEst_SelsJson)+"||"+GXt_char1+"||||"+GXt_char13+"||"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"||"+GXt_char18+"|||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFCliNom)==0), AV44TFCliNom, GXv_char21) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFBarCodPar)==0), AV50TFBarCodPar, GXv_char19) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFBarSer)==0), AV54TFBarSer, GXv_char17) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char5[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarSerDsc)==0), AV56TFBarSerDsc, GXv_char5) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char15 = GXv_char5[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFBarColNom)==0), AV58TFBarColNom, GXv_char4) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFBarNomCli)==0), AV62TFBarNomCli, GXv_char3) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFBarFasCod)==0), AV68TFBarFasCod, GXv_char2) ;
      cargasproduccionporproceso_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = "|"+((0==AV42TFCliCod) ? "" : GXutil.str( AV42TFCliCod, 6, 0))+"|"+GXt_char20+"||"+((0==AV46TFBarCod) ? "" : GXutil.str( AV46TFBarCod, 8, 0))+"|"+((0==AV48TFBarCodReo) ? "" : GXutil.str( AV48TFBarCodReo, 1, 0))+"|"+GXt_char18+"|"+((0==AV52TFBarSit) ? "" : GXutil.str( AV52TFBarSit, 2, 0))+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+((0==AV60TFBarColNum) ? "" : GXutil.str( AV60TFBarColNum, 6, 0))+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBarKgm)==0) ? "" : GXutil.str( AV64TFBarKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarMtr)==0) ? "" : GXutil.str( AV66TFBarMtr, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV43TFCliCod_To) ? "" : GXutil.str( AV43TFCliCod_To, 6, 0))+"|||"+((0==AV47TFBarCod_To) ? "" : GXutil.str( AV47TFBarCod_To, 8, 0))+"|"+((0==AV49TFBarCodReo_To) ? "" : GXutil.str( AV49TFBarCodReo_To, 1, 0))+"||"+((0==AV53TFBarSit_To) ? "" : GXutil.str( AV53TFBarSit_To, 2, 0))+"||||"+((0==AV61TFBarColNum_To) ? "" : GXutil.str( AV61TFBarColNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm_To)==0) ? "" : GXutil.str( AV65TFBarKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr_To)==0) ? "" : GXutil.str( AV67TFBarMtr_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV18Session.getValue(AV90Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV34OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV35OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFASEST_SEL", "", !(AV78TFProFasEst_Sels.size()==0), (short)(0), AV78TFProFasEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLICOD", "", !((0==AV42TFCliCod)&&(0==AV43TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV42TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV43TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV44TFCliNom)==0), (short)(0), AV44TFCliNom, "", !(GXutil.strcmp("", AV45TFCliNom_Sel)==0), AV45TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOD", "", !((0==AV46TFBarCod)&&(0==AV47TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV47TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCODREO", "", !((0==AV48TFBarCodReo)&&(0==AV49TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV49TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCODPAR", "", !(GXutil.strcmp("", AV50TFBarCodPar)==0), (short)(0), AV50TFBarCodPar, "", !(GXutil.strcmp("", AV51TFBarCodPar_Sel)==0), AV51TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSIT", "", !((0==AV52TFBarSit)&&(0==AV53TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV53TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSER", "", !(GXutil.strcmp("", AV54TFBarSer)==0), (short)(0), AV54TFBarSer, "", !(GXutil.strcmp("", AV55TFBarSer_Sel)==0), AV55TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARSERDSC", "", !(GXutil.strcmp("", AV56TFBarSerDsc)==0), (short)(0), AV56TFBarSerDsc, "", !(GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0), AV57TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV58TFBarColNom)==0), (short)(0), AV58TFBarColNom, "", !(GXutil.strcmp("", AV59TFBarColNom_Sel)==0), AV59TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARCOLNUM", "", !((0==AV60TFBarColNum)&&(0==AV61TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV61TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV62TFBarNomCli)==0), (short)(0), AV62TFBarNomCli, "", !(GXutil.strcmp("", AV63TFBarNomCli_Sel)==0), AV63TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBarKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV64TFBarKgm, 9, 2)), GXutil.trim( GXutil.str( AV65TFBarKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFBarMtr, 9, 2)), GXutil.trim( GXutil.str( AV67TFBarMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFBARFASCOD", "", !(GXutil.strcmp("", AV68TFBarFasCod)==0), (short)(0), AV68TFBarFasCod, "", !(GXutil.strcmp("", AV69TFBarFasCod_Sel)==0), AV69TFBarFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV90Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Produccion.CargasProduccionporProceso" );
      AV18Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV79TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TotBarKgm", GXutil.ltrimstr( AV79TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV79TotBarKgm, "ZZZZZ9.99")));
      AV81TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TotBarMtr", GXutil.ltrimstr( AV81TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV81TotBarMtr, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A760ProFasEst) ,
                                           AV78TFProFasEst_Sels ,
                                           Integer.valueOf(AV42TFCliCod) ,
                                           Integer.valueOf(AV43TFCliCod_To) ,
                                           AV45TFCliNom_Sel ,
                                           AV44TFCliNom ,
                                           Integer.valueOf(AV46TFBarCod) ,
                                           Integer.valueOf(AV47TFBarCod_To) ,
                                           Byte.valueOf(AV48TFBarCodReo) ,
                                           Byte.valueOf(AV49TFBarCodReo_To) ,
                                           AV51TFBarCodPar_Sel ,
                                           AV50TFBarCodPar ,
                                           Byte.valueOf(AV52TFBarSit) ,
                                           Byte.valueOf(AV53TFBarSit_To) ,
                                           AV55TFBarSer_Sel ,
                                           AV54TFBarSer ,
                                           AV57TFBarSerDsc_Sel ,
                                           AV56TFBarSerDsc ,
                                           AV59TFBarColNom_Sel ,
                                           AV58TFBarColNom ,
                                           Integer.valueOf(AV60TFBarColNum) ,
                                           Integer.valueOf(AV61TFBarColNum_To) ,
                                           AV63TFBarNomCli_Sel ,
                                           AV62TFBarNomCli ,
                                           AV64TFBarKgm ,
                                           AV65TFBarKgm_To ,
                                           AV66TFBarMtr ,
                                           AV67TFBarMtr_To ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Byte.valueOf(A213BarSit) ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           A166BarKgm ,
                                           A184BarMtr ,
                                           AV12FilterFullText ,
                                           A151BarFasCod ,
                                           Integer.valueOf(AV78TFProFasEst_Sels.size()) ,
                                           AV69TFBarFasCod_Sel ,
                                           AV68TFBarFasCod ,
                                           Integer.valueOf(AV27CliCod) ,
                                           Integer.valueOf(AV29CliCod_to) ,
                                           A159BarFecGen ,
                                           AV30BarFecGen ,
                                           AV31BarFecGen_to ,
                                           Byte.valueOf(AV32BarSit) ,
                                           Byte.valueOf(AV33BarSit_to) ,
                                           A14284ProEst ,
                                           Byte.valueOf(AV26Profasest) ,
                                           AV13EmprCod ,
                                           AV28ProCod ,
                                           A396EmprCod ,
                                           A758ProCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV12FilterFullText = GXutil.concat( GXutil.rtrim( AV12FilterFullText), "%", "") ;
      lV68TFBarFasCod = GXutil.padr( GXutil.rtrim( AV68TFBarFasCod), 8, "%") ;
      lV44TFCliNom = GXutil.padr( GXutil.rtrim( AV44TFCliNom), 30, "%") ;
      lV50TFBarCodPar = GXutil.padr( GXutil.rtrim( AV50TFBarCodPar), 1, "%") ;
      lV54TFBarSer = GXutil.padr( GXutil.rtrim( AV54TFBarSer), 16, "%") ;
      lV56TFBarSerDsc = GXutil.padr( GXutil.rtrim( AV56TFBarSerDsc), 26, "%") ;
      lV58TFBarColNom = GXutil.padr( GXutil.rtrim( AV58TFBarColNom), 13, "%") ;
      lV62TFBarNomCli = GXutil.padr( GXutil.rtrim( AV62TFBarNomCli), 13, "%") ;
      /* Using cursor H01ZT16 */
      pr_default.execute(2, new Object[] {AV13EmprCod, AV28ProCod, AV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, lV12FilterFullText, Integer.valueOf(AV78TFProFasEst_Sels.size()), AV69TFBarFasCod_Sel, AV68TFBarFasCod, lV68TFBarFasCod, AV69TFBarFasCod_Sel, AV69TFBarFasCod_Sel, Integer.valueOf(AV27CliCod), Integer.valueOf(AV29CliCod_to), AV30BarFecGen, AV31BarFecGen_to, Byte.valueOf(AV32BarSit), Byte.valueOf(AV33BarSit_to), Byte.valueOf(AV26Profasest), Integer.valueOf(AV42TFCliCod), Integer.valueOf(AV43TFCliCod_To), lV44TFCliNom, AV45TFCliNom_Sel, Integer.valueOf(AV46TFBarCod), Integer.valueOf(AV47TFBarCod_To), Byte.valueOf(AV48TFBarCodReo), Byte.valueOf(AV49TFBarCodReo_To), lV50TFBarCodPar, AV51TFBarCodPar_Sel, Byte.valueOf(AV52TFBarSit), Byte.valueOf(AV53TFBarSit_To), lV54TFBarSer, AV55TFBarSer_Sel, lV56TFBarSerDsc, AV57TFBarSerDsc_Sel, lV58TFBarColNom, AV59TFBarColNom_Sel, Integer.valueOf(AV60TFBarColNum), Integer.valueOf(AV61TFBarColNum_To), lV62TFBarNomCli, AV63TFBarNomCli_Sel, AV64TFBarKgm, AV65TFBarKgm_To, AV66TFBarMtr, AV67TFBarMtr_To});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A14284ProEst = H01ZT16_A14284ProEst[0] ;
         A159BarFecGen = H01ZT16_A159BarFecGen[0] ;
         A758ProCod = H01ZT16_A758ProCod[0] ;
         A396EmprCod = H01ZT16_A396EmprCod[0] ;
         A1234BarNomCli = H01ZT16_A1234BarNomCli[0] ;
         A136BarColNum = H01ZT16_A136BarColNum[0] ;
         A135BarColNom = H01ZT16_A135BarColNom[0] ;
         A1652BarSerDsc = H01ZT16_A1652BarSerDsc[0] ;
         A212BarSer = H01ZT16_A212BarSer[0] ;
         A213BarSit = H01ZT16_A213BarSit[0] ;
         A130BarCodPar = H01ZT16_A130BarCodPar[0] ;
         A132BarCodReo = H01ZT16_A132BarCodReo[0] ;
         A129BarCod = H01ZT16_A129BarCod[0] ;
         A279CliNom = H01ZT16_A279CliNom[0] ;
         A252CliCod = H01ZT16_A252CliCod[0] ;
         n252CliCod = H01ZT16_n252CliCod[0] ;
         A151BarFasCod = H01ZT16_A151BarFasCod[0] ;
         n151BarFasCod = H01ZT16_n151BarFasCod[0] ;
         A184BarMtr = H01ZT16_A184BarMtr[0] ;
         A166BarKgm = H01ZT16_A166BarKgm[0] ;
         A760ProFasEst = H01ZT16_A760ProFasEst[0] ;
         n760ProFasEst = H01ZT16_n760ProFasEst[0] ;
         A14284ProEst = H01ZT16_A14284ProEst[0] ;
         A159BarFecGen = H01ZT16_A159BarFecGen[0] ;
         A1234BarNomCli = H01ZT16_A1234BarNomCli[0] ;
         A136BarColNum = H01ZT16_A136BarColNum[0] ;
         A135BarColNom = H01ZT16_A135BarColNom[0] ;
         A1652BarSerDsc = H01ZT16_A1652BarSerDsc[0] ;
         A212BarSer = H01ZT16_A212BarSer[0] ;
         A213BarSit = H01ZT16_A213BarSit[0] ;
         A252CliCod = H01ZT16_A252CliCod[0] ;
         n252CliCod = H01ZT16_n252CliCod[0] ;
         A279CliNom = H01ZT16_A279CliNom[0] ;
         A151BarFasCod = H01ZT16_A151BarFasCod[0] ;
         n151BarFasCod = H01ZT16_n151BarFasCod[0] ;
         A184BarMtr = H01ZT16_A184BarMtr[0] ;
         A166BarKgm = H01ZT16_A166BarKgm[0] ;
         A760ProFasEst = H01ZT16_A760ProFasEst[0] ;
         n760ProFasEst = H01ZT16_n760ProFasEst[0] ;
         if ( GXutil.strcmp(A14284ProEst, httpContext.getMessage( "A", "")) == 0 )
         {
            AV79TotBarKgm = A166BarKgm.add(AV79TotBarKgm) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TotBarKgm", GXutil.ltrimstr( AV79TotBarKgm, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARKGM", getSecureSignedToken( sPrefix, localUtil.format( AV79TotBarKgm, "ZZZZZ9.99")));
            AV81TotBarMtr = A184BarMtr.add(AV81TotBarMtr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TotBarMtr", GXutil.ltrimstr( AV81TotBarMtr, 18, 2));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTBARMTR", getSecureSignedToken( sPrefix, localUtil.format( AV81TotBarMtr, "ZZZZZ9.99")));
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV80TotValueBarKgm = localUtil.format( AV79TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TotValueBarKgm", AV80TotValueBarKgm);
      AV82TotValueBarMtr = localUtil.format( AV81TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueBarMtr", AV82TotValueBarMtr);
   }

   public void e221ZT2( )
   {
      /* 'DoWinExportReport' Routine */
      returnInSub = false ;
      AV72WebSession.setValue("FiltroProduccionporProceso_ProCod", AV28ProCod);
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e231ZT2( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'GUARDAR VARIABLES FILTROS EN SESSION' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'FINBARRAPROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV72WebSession.getValue("CargasProduccionporProcesoWW"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV72WebSession.remove("CargasProduccionporProcesoWW");
         AV71ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV71ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV71ProgressIndicator.hide();
      }
   }

   public void S222( )
   {
      /* 'GUARDAR VARIABLES FILTROS EN SESSION' Routine */
      returnInSub = false ;
      AV72WebSession.setValue("EmprCod", AV13EmprCod);
      AV72WebSession.setValue("ProCod", AV28ProCod);
      AV72WebSession.setValue("CliCod", GXutil.str( AV27CliCod, 6, 0));
      AV72WebSession.setValue("CliCod_to", GXutil.str( AV29CliCod_to, 6, 0));
      AV72WebSession.setValue("BarFecGen", localUtil.dtoc( AV30BarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV72WebSession.setValue("BarFecGen_to", localUtil.dtoc( AV31BarFecGen_to, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"));
      AV72WebSession.setValue("BarSit", GXutil.str( AV32BarSit, 2, 0));
      AV72WebSession.setValue("BarSit_to", GXutil.str( AV33BarSit_to, 2, 0));
      AV72WebSession.setValue("ProFasEst", GXutil.str( AV26Profasest, 1, 0));
   }

   public void wb_table2_64_1ZT2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV80TotValueBarKgm, GXutil.rtrim( localUtil.format( AV80TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV82TotValueBarMtr, GXutil.rtrim( localUtil.format( AV82TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_64_1ZT2e( true) ;
      }
      else
      {
         wb_table2_64_1ZT2e( false) ;
      }
   }

   public void wb_table1_25_1ZT2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV19ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_30_1ZT2( true) ;
      }
      else
      {
         wb_table3_30_1ZT2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_1ZT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1ZT2e( true) ;
      }
      else
      {
         wb_table1_25_1ZT2e( false) ;
      }
   }

   public void wb_table3_30_1ZT2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\CargasProduccionporProceso_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_1ZT2e( true) ;
      }
      else
      {
         wb_table3_30_1ZT2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      AV28ProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ProCod", AV28ProCod);
      AV27CliCod = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
      AV29CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod_to), 6, 0));
      AV30BarFecGen = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
      AV31BarFecGen_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGen_to", localUtil.format(AV31BarFecGen_to, "99/99/99"));
      AV32BarSit = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
      AV33BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSit_to), 2, 0));
      AV26Profasest = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Profasest", GXutil.str( AV26Profasest, 1, 0));
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
      pa1ZT2( ) ;
      ws1ZT2( ) ;
      we1ZT2( ) ;
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
      sCtrlAV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV28ProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV27CliCod = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV29CliCod_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV30BarFecGen = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV31BarFecGen_to = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV32BarSit = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV33BarSit_to = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV26Profasest = (String)getParm(obj,8,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1ZT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\cargasproduccionporproceso_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1ZT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
         AV28ProCod = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ProCod", AV28ProCod);
         AV27CliCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
         AV29CliCod_to = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod_to), 6, 0));
         AV30BarFecGen = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
         AV31BarFecGen_to = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGen_to", localUtil.format(AV31BarFecGen_to, "99/99/99"));
         AV32BarSit = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
         AV33BarSit_to = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSit_to), 2, 0));
         AV26Profasest = ((Number) GXutil.testNumericType( getParm(obj,10,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Profasest", GXutil.str( AV26Profasest, 1, 0));
      }
      wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
      wcpOAV28ProCod = httpContext.cgiGet( sPrefix+"wcpOAV28ProCod") ;
      wcpOAV27CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV29CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29CliCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV30BarFecGen"), 0) ;
      wcpOAV31BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV31BarFecGen_to"), 0) ;
      wcpOAV32BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV32BarSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV33BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33BarSit_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26Profasest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV26Profasest"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13EmprCod, wcpOAV13EmprCod) != 0 ) || ( GXutil.strcmp(AV28ProCod, wcpOAV28ProCod) != 0 ) || ( AV27CliCod != wcpOAV27CliCod ) || ( AV29CliCod_to != wcpOAV29CliCod_to ) || !( GXutil.dateCompare(GXutil.resetTime(AV30BarFecGen), GXutil.resetTime(wcpOAV30BarFecGen)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV31BarFecGen_to), GXutil.resetTime(wcpOAV31BarFecGen_to)) ) || ( AV32BarSit != wcpOAV32BarSit ) || ( AV33BarSit_to != wcpOAV33BarSit_to ) || ( AV26Profasest != wcpOAV26Profasest ) ) )
      {
         setjustcreated();
      }
      wcpOAV13EmprCod = AV13EmprCod ;
      wcpOAV28ProCod = AV28ProCod ;
      wcpOAV27CliCod = AV27CliCod ;
      wcpOAV29CliCod_to = AV29CliCod_to ;
      wcpOAV30BarFecGen = AV30BarFecGen ;
      wcpOAV31BarFecGen_to = AV31BarFecGen_to ;
      wcpOAV32BarSit = AV32BarSit ;
      wcpOAV33BarSit_to = AV33BarSit_to ;
      wcpOAV26Profasest = AV26Profasest ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13EmprCod) > 0 )
      {
         AV13EmprCod = httpContext.cgiGet( sCtrlAV13EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13EmprCod", AV13EmprCod);
      }
      else
      {
         AV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_PARM") ;
      }
      sCtrlAV28ProCod = httpContext.cgiGet( sPrefix+"AV28ProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV28ProCod) > 0 )
      {
         AV28ProCod = httpContext.cgiGet( sCtrlAV28ProCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28ProCod", AV28ProCod);
      }
      else
      {
         AV28ProCod = httpContext.cgiGet( sPrefix+"AV28ProCod_PARM") ;
      }
      sCtrlAV27CliCod = httpContext.cgiGet( sPrefix+"AV27CliCod_CTRL") ;
      if ( GXutil.len( sCtrlAV27CliCod) > 0 )
      {
         AV27CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27CliCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27CliCod), 6, 0));
      }
      else
      {
         AV27CliCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27CliCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV29CliCod_to = httpContext.cgiGet( sPrefix+"AV29CliCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV29CliCod_to) > 0 )
      {
         AV29CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29CliCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29CliCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29CliCod_to), 6, 0));
      }
      else
      {
         AV29CliCod_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29CliCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30BarFecGen = httpContext.cgiGet( sPrefix+"AV30BarFecGen_CTRL") ;
      if ( GXutil.len( sCtrlAV30BarFecGen) > 0 )
      {
         AV30BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV30BarFecGen), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30BarFecGen", localUtil.format(AV30BarFecGen, "99/99/99"));
      }
      else
      {
         AV30BarFecGen = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV30BarFecGen_PARM"), 0) ;
      }
      sCtrlAV31BarFecGen_to = httpContext.cgiGet( sPrefix+"AV31BarFecGen_to_CTRL") ;
      if ( GXutil.len( sCtrlAV31BarFecGen_to) > 0 )
      {
         AV31BarFecGen_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV31BarFecGen_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31BarFecGen_to", localUtil.format(AV31BarFecGen_to, "99/99/99"));
      }
      else
      {
         AV31BarFecGen_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV31BarFecGen_to_PARM"), 0) ;
      }
      sCtrlAV32BarSit = httpContext.cgiGet( sPrefix+"AV32BarSit_CTRL") ;
      if ( GXutil.len( sCtrlAV32BarSit) > 0 )
      {
         AV32BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV32BarSit), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarSit), 2, 0));
      }
      else
      {
         AV32BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV32BarSit_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV33BarSit_to = httpContext.cgiGet( sPrefix+"AV33BarSit_to_CTRL") ;
      if ( GXutil.len( sCtrlAV33BarSit_to) > 0 )
      {
         AV33BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33BarSit_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33BarSit_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarSit_to), 2, 0));
      }
      else
      {
         AV33BarSit_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33BarSit_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26Profasest = httpContext.cgiGet( sPrefix+"AV26Profasest_CTRL") ;
      if ( GXutil.len( sCtrlAV26Profasest) > 0 )
      {
         AV26Profasest = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV26Profasest), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Profasest", GXutil.str( AV26Profasest, 1, 0));
      }
      else
      {
         AV26Profasest = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV26Profasest_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1ZT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1ZT2( ) ;
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
      ws1ZT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_PARM", GXutil.rtrim( AV13EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13EmprCod_CTRL", GXutil.rtrim( sCtrlAV13EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28ProCod_PARM", GXutil.rtrim( AV28ProCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28ProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28ProCod_CTRL", GXutil.rtrim( sCtrlAV28ProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27CliCod_PARM", GXutil.ltrim( localUtil.ntoc( AV27CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27CliCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27CliCod_CTRL", GXutil.rtrim( sCtrlAV27CliCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29CliCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV29CliCod_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29CliCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29CliCod_to_CTRL", GXutil.rtrim( sCtrlAV29CliCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarFecGen_PARM", localUtil.dtoc( AV30BarFecGen, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30BarFecGen)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30BarFecGen_CTRL", GXutil.rtrim( sCtrlAV30BarFecGen));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarFecGen_to_PARM", localUtil.dtoc( AV31BarFecGen_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31BarFecGen_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31BarFecGen_to_CTRL", GXutil.rtrim( sCtrlAV31BarFecGen_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSit_PARM", GXutil.ltrim( localUtil.ntoc( AV32BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32BarSit)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32BarSit_CTRL", GXutil.rtrim( sCtrlAV32BarSit));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSit_to_PARM", GXutil.ltrim( localUtil.ntoc( AV33BarSit_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33BarSit_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33BarSit_to_CTRL", GXutil.rtrim( sCtrlAV33BarSit_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Profasest_PARM", GXutil.ltrim( localUtil.ntoc( AV26Profasest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Profasest)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Profasest_CTRL", GXutil.rtrim( sCtrlAV26Profasest));
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
      we1ZT2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555841", true, true);
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
      httpContext.AddJavascriptSource("produccion/cargasproduccionporproceso_wc.js", "?202682115555841", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_idx ;
      cmbProFasEst.setInternalname( sPrefix+"PROFASEST_"+sGXsfl_43_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_43_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_43_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_43_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_43_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_fel_idx ;
      cmbProFasEst.setInternalname( sPrefix+"PROFASEST_"+sGXsfl_43_fel_idx );
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_43_fel_idx ;
      edtCliNom_Internalname = sPrefix+"CLINOM_"+sGXsfl_43_fel_idx ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI_"+sGXsfl_43_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_43_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_43_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_43_fel_idx ;
      edtBarSit_Internalname = sPrefix+"BARSIT_"+sGXsfl_43_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_43_fel_idx ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC_"+sGXsfl_43_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_43_fel_idx ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM_"+sGXsfl_43_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_43_fel_idx ;
      edtBarKgm_Internalname = sPrefix+"BARKGM_"+sGXsfl_43_fel_idx ;
      edtBarMtr_Internalname = sPrefix+"BARMTR_"+sGXsfl_43_fel_idx ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1ZT0( ) ;
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV70DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e241zt2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbProFasEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         GXCCtl = "PROFASEST_" + sGXsfl_43_idx ;
         cmbProFasEst.setName( GXCCtl );
         cmbProFasEst.setWebtags( "" );
         cmbProFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
         cmbProFasEst.addItem("1", httpContext.getMessage( "En Proceso (Fase Iniciada)", ""), (short)(0));
         cmbProFasEst.addItem("2", httpContext.getMessage( "En Proceso (Fase Realizada)", ""), (short)(0));
         if ( cmbProFasEst.getItemCount() > 0 )
         {
            A760ProFasEst = (byte)(GXutil.lval( cmbProFasEst.getValidValue(GXutil.trim( GXutil.str( A760ProFasEst, 1, 0))))) ;
            n760ProFasEst = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbProFasEst,cmbProFasEst.getInternalname(),GXutil.trim( GXutil.str( A760ProFasEst, 1, 0)),Integer.valueOf(1),cmbProFasEst.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbProFasEst.getVisible()),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbProFasEst.setValue( GXutil.trim( GXutil.str( A760ProFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbProFasEst.getInternalname(), "Values", cmbProFasEst.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccli_Internalname,GXutil.rtrim( AV37BarEncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarenccli_Enabled!=0)&&(edtavBarenccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavBarenccli_Visible),Integer.valueOf(edtavBarenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCodReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCodPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSit_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarKgm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarFasCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1ZT2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbProFasEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cli.Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBarenccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp. Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSit_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Número", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNomCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarKgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarFasCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult.Fase", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV70DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbProFasEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtCliNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV37BarEncCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarenccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSit_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarKgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarMtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarFasCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtnusuexportreport_Internalname = sPrefix+"BTNUSUEXPORTREPORT" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      cmbProFasEst.setInternalname( sPrefix+"PROFASEST" );
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      edtavBarenccli_Internalname = sPrefix+"vBARENCCLI" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtBarSit_Internalname = sPrefix+"BARSIT" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarColNum_Internalname = sPrefix+"BARCOLNUM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      edtBarMtr_Internalname = sPrefix+"BARMTR" ;
      edtBarFasCod_Internalname = sPrefix+"BARFASCOD" ;
      edtavTotvaluebarkgm_Internalname = sPrefix+"vTOTVALUEBARKGM" ;
      edtavTotvaluebarmtr_Internalname = sPrefix+"vTOTVALUEBARMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
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
      edtBarFasCod_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      cmbProFasEst.setJsonclick( "" );
      edtEmprCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      edtBarFasCod_Visible = -1 ;
      edtBarMtr_Visible = -1 ;
      edtBarKgm_Visible = -1 ;
      edtBarNomCli_Visible = -1 ;
      edtBarColNum_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtBarSit_Visible = -1 ;
      edtBarCodPar_Visible = -1 ;
      edtBarCodReo_Visible = -1 ;
      edtBarCod_Visible = -1 ;
      edtavBarenccli_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      cmbProFasEst.setVisible( -1 );
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Produccion.CargasProduccionporProceso_WCGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "0:Pendiente,1:En Proceso (Fase Iniciada),2:En Proceso (Fase Realizada)|||||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "T|||||||||||||||" ;
      Ddo_grid_Datalisttype = "FixedValues||Dynamic||||Dynamic||Dynamic|Dynamic|Dynamic||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "T||T||||T||T|T|T||T|||T" ;
      Ddo_grid_Filterisrange = "|T|||T|T||T||||T||T|T|" ;
      Ddo_grid_Filtertype = "|Numeric|Character||Numeric|Numeric|Character|Numeric|Character|Character|Character|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "|T|T||T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "|T|T||T|T|T|T|T|T|T|T|T|||" ;
      Ddo_grid_Columnssortvalues = "|2|3||4|5|6|7|8|9|10|11|12|||" ;
      Ddo_grid_Columnids = "2:ProFasEst|3:CliCod|4:CliNom|5:BarEncCli|6:BarCod|7:BarCodReo|8:BarCodPar|9:BarSit|10:BarSer|11:BarSerDsc|12:BarColNom|13:BarColNum|14:BarNomCli|15:BarKgm|16:BarMtr|17:BarFasCod" ;
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
      GXCCtl = "PROFASEST_" + sGXsfl_43_idx ;
      cmbProFasEst.setName( GXCCtl );
      cmbProFasEst.setWebtags( "" );
      cmbProFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbProFasEst.addItem("1", httpContext.getMessage( "En Proceso (Fase Iniciada)", ""), (short)(0));
      cmbProFasEst.addItem("2", httpContext.getMessage( "En Proceso (Fase Realizada)", ""), (short)(0));
      if ( cmbProFasEst.getItemCount() > 0 )
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A14284ProEst',fld:'PROEST',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbProFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV82TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211ZT2',iparms:[{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV70DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV37BarEncCli',fld:'vBARENCCLI',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A14284ProEst',fld:'PROEST',pic:'@!'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbProFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV82TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A14284ProEst',fld:'PROEST',pic:'@!'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbProFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV82TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("'DOUSUEXPORTREPORT'","{handler:'e161ZT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A151BarFasCod',fld:'BARFASCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A14284ProEst',fld:'PROEST',pic:'@!'}]");
      setEventMetadata("'DOUSUEXPORTREPORT'",",oparms:[{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'cmbProFasEst'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtavBarenccli_Visible',ctrl:'vBARENCCLI',prop:'Visible'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtBarSit_Visible',ctrl:'BARSIT',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtBarColNum_Visible',ctrl:'BARCOLNUM',prop:'Visible'},{av:'edtBarNomCli_Visible',ctrl:'BARNOMCLI',prop:'Visible'},{av:'edtBarKgm_Visible',ctrl:'BARKGM',prop:'Visible'},{av:'edtBarMtr_Visible',ctrl:'BARMTR',prop:'Visible'},{av:'edtBarFasCod_Visible',ctrl:'BARFASCOD',prop:'Visible'},{av:'AV24GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV25GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV19ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV82TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171ZT2',iparms:[{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181ZT2',iparms:[{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV35OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'},{av:'AV21ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV78TFProFasEst_Sels',fld:'vTFPROFASEST_SELS',pic:''},{av:'AV42TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV43TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV44TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV45TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV46TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV47TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV48TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV49TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV50TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV51TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV52TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV53TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV54TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV55TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV56TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV57TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV58TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV59TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV60TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV61TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV62TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV63TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV64TFBarKgm',fld:'vTFBARKGM',pic:'ZZZZZ9.99'},{av:'AV65TFBarKgm_To',fld:'vTFBARKGM_TO',pic:'ZZZZZ9.99'},{av:'AV66TFBarMtr',fld:'vTFBARMTR',pic:'ZZZZZ9.99'},{av:'AV67TFBarMtr_To',fld:'vTFBARMTR_TO',pic:'ZZZZZ9.99'},{av:'AV68TFBarFasCod',fld:'vTFBARFASCOD',pic:''},{av:'AV69TFBarFasCod_Sel',fld:'vTFBARFASCOD_SEL',pic:''},{av:'AV79TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV81TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV77TFProFasEst_SelsJson',fld:'vTFPROFASEST_SELSJSON',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e241ZT2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13878PedidoClie',fld:'PEDIDOCLIE',pic:'',hsh:true},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("'DOWINEXPORTREPORT'","{handler:'e221ZT2',iparms:[{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'}]");
      setEventMetadata("'DOWINEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e231ZT2',iparms:[{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV28ProCod',fld:'vPROCOD',pic:''},{av:'AV27CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliCod_to',fld:'vCLICOD_TO',pic:'ZZZZZ9'},{av:'AV30BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV31BarFecGen_to',fld:'vBARFECGEN_TO',pic:''},{av:'AV32BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV33BarSit_to',fld:'vBARSIT_TO',pic:'Z9'},{av:'AV26Profasest',fld:'vPROFASEST',pic:'9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfascod',iparms:[]");
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
      wcpOAV13EmprCod = "" ;
      wcpOAV28ProCod = "" ;
      wcpOAV30BarFecGen = GXutil.nullDate() ;
      wcpOAV31BarFecGen_to = GXutil.nullDate() ;
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
      AV13EmprCod = "" ;
      AV28ProCod = "" ;
      AV30BarFecGen = GXutil.nullDate() ;
      AV31BarFecGen_to = GXutil.nullDate() ;
      AV12FilterFullText = "" ;
      AV16ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV90Pgmname = "" ;
      AV78TFProFasEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV44TFCliNom = "" ;
      AV45TFCliNom_Sel = "" ;
      AV50TFBarCodPar = "" ;
      AV51TFBarCodPar_Sel = "" ;
      AV54TFBarSer = "" ;
      AV55TFBarSer_Sel = "" ;
      AV56TFBarSerDsc = "" ;
      AV57TFBarSerDsc_Sel = "" ;
      AV58TFBarColNom = "" ;
      AV59TFBarColNom_Sel = "" ;
      AV62TFBarNomCli = "" ;
      AV63TFBarNomCli_Sel = "" ;
      AV64TFBarKgm = DecimalUtil.ZERO ;
      AV65TFBarKgm_To = DecimalUtil.ZERO ;
      AV66TFBarMtr = DecimalUtil.ZERO ;
      AV67TFBarMtr_To = DecimalUtil.ZERO ;
      AV68TFBarFasCod = "" ;
      AV69TFBarFasCod_Sel = "" ;
      AV79TotBarKgm = DecimalUtil.ZERO ;
      AV81TotBarMtr = DecimalUtil.ZERO ;
      A13878PedidoClie = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV22DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A758ProCod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV77TFProFasEst_SelsJson = "" ;
      A4812BarEncCli = "" ;
      A143BarDisNum = "" ;
      A14284ProEst = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnusuexportreport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV70DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      AV37BarEncCli = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A151BarFasCod = "" ;
      scmdbuf = "" ;
      lV12FilterFullText = "" ;
      lV68TFBarFasCod = "" ;
      lV44TFCliNom = "" ;
      lV50TFBarCodPar = "" ;
      lV54TFBarSer = "" ;
      lV56TFBarSerDsc = "" ;
      lV58TFBarColNom = "" ;
      lV62TFBarNomCli = "" ;
      H01ZT6_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZT6_A14284ProEst = new String[] {""} ;
      H01ZT6_A758ProCod = new String[] {""} ;
      H01ZT6_A1234BarNomCli = new String[] {""} ;
      H01ZT6_A136BarColNum = new int[1] ;
      H01ZT6_A135BarColNom = new String[] {""} ;
      H01ZT6_A1652BarSerDsc = new String[] {""} ;
      H01ZT6_A212BarSer = new String[] {""} ;
      H01ZT6_A213BarSit = new byte[1] ;
      H01ZT6_A130BarCodPar = new String[] {""} ;
      H01ZT6_A132BarCodReo = new byte[1] ;
      H01ZT6_A129BarCod = new int[1] ;
      H01ZT6_A279CliNom = new String[] {""} ;
      H01ZT6_A252CliCod = new int[1] ;
      H01ZT6_n252CliCod = new boolean[] {false} ;
      H01ZT6_A151BarFasCod = new String[] {""} ;
      H01ZT6_n151BarFasCod = new boolean[] {false} ;
      H01ZT6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT6_A760ProFasEst = new byte[1] ;
      H01ZT6_n760ProFasEst = new boolean[] {false} ;
      H01ZT6_A143BarDisNum = new String[] {""} ;
      H01ZT6_A4812BarEncCli = new String[] {""} ;
      H01ZT6_A396EmprCod = new String[] {""} ;
      H01ZT11_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZT11_A14284ProEst = new String[] {""} ;
      H01ZT11_A758ProCod = new String[] {""} ;
      H01ZT11_A1234BarNomCli = new String[] {""} ;
      H01ZT11_A136BarColNum = new int[1] ;
      H01ZT11_A135BarColNom = new String[] {""} ;
      H01ZT11_A1652BarSerDsc = new String[] {""} ;
      H01ZT11_A212BarSer = new String[] {""} ;
      H01ZT11_A213BarSit = new byte[1] ;
      H01ZT11_A130BarCodPar = new String[] {""} ;
      H01ZT11_A132BarCodReo = new byte[1] ;
      H01ZT11_A129BarCod = new int[1] ;
      H01ZT11_A279CliNom = new String[] {""} ;
      H01ZT11_A252CliCod = new int[1] ;
      H01ZT11_n252CliCod = new boolean[] {false} ;
      H01ZT11_A151BarFasCod = new String[] {""} ;
      H01ZT11_n151BarFasCod = new boolean[] {false} ;
      H01ZT11_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT11_A760ProFasEst = new byte[1] ;
      H01ZT11_n760ProFasEst = new boolean[] {false} ;
      H01ZT11_A143BarDisNum = new String[] {""} ;
      H01ZT11_A4812BarEncCli = new String[] {""} ;
      H01ZT11_A396EmprCod = new String[] {""} ;
      AV80TotValueBarKgm = "" ;
      AV82TotValueBarMtr = "" ;
      AV83Station = "" ;
      AV84EmprNom = "" ;
      AV85UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV18Session = httpContext.getWebSession();
      AV14ColumnsSelectorXML = "" ;
      AV71ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20ManageFiltersXml = "" ;
      AV72WebSession = httpContext.getWebSession();
      AV38ExcelFilename = "" ;
      AV39ErrorMessage = "" ;
      AV15UserCustomValue = "" ;
      AV17ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01ZT16_A14284ProEst = new String[] {""} ;
      H01ZT16_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZT16_A758ProCod = new String[] {""} ;
      H01ZT16_A396EmprCod = new String[] {""} ;
      H01ZT16_A1234BarNomCli = new String[] {""} ;
      H01ZT16_A136BarColNum = new int[1] ;
      H01ZT16_A135BarColNom = new String[] {""} ;
      H01ZT16_A1652BarSerDsc = new String[] {""} ;
      H01ZT16_A212BarSer = new String[] {""} ;
      H01ZT16_A213BarSit = new byte[1] ;
      H01ZT16_A130BarCodPar = new String[] {""} ;
      H01ZT16_A132BarCodReo = new byte[1] ;
      H01ZT16_A129BarCod = new int[1] ;
      H01ZT16_A279CliNom = new String[] {""} ;
      H01ZT16_A252CliCod = new int[1] ;
      H01ZT16_n252CliCod = new boolean[] {false} ;
      H01ZT16_A151BarFasCod = new String[] {""} ;
      H01ZT16_n151BarFasCod = new boolean[] {false} ;
      H01ZT16_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT16_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZT16_A760ProFasEst = new byte[1] ;
      H01ZT16_n760ProFasEst = new boolean[] {false} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13EmprCod = "" ;
      sCtrlAV28ProCod = "" ;
      sCtrlAV27CliCod = "" ;
      sCtrlAV29CliCod_to = "" ;
      sCtrlAV30BarFecGen = "" ;
      sCtrlAV31BarFecGen_to = "" ;
      sCtrlAV32BarSit = "" ;
      sCtrlAV33BarSit_to = "" ;
      sCtrlAV26Profasest = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.cargasproduccionporproceso_wc__default(),
         new Object[] {
             new Object[] {
            H01ZT6_A159BarFecGen, H01ZT6_A14284ProEst, H01ZT6_A758ProCod, H01ZT6_A1234BarNomCli, H01ZT6_A136BarColNum, H01ZT6_A135BarColNom, H01ZT6_A1652BarSerDsc, H01ZT6_A212BarSer, H01ZT6_A213BarSit, H01ZT6_A130BarCodPar,
            H01ZT6_A132BarCodReo, H01ZT6_A129BarCod, H01ZT6_A279CliNom, H01ZT6_A252CliCod, H01ZT6_n252CliCod, H01ZT6_A151BarFasCod, H01ZT6_n151BarFasCod, H01ZT6_A184BarMtr, H01ZT6_A166BarKgm, H01ZT6_A760ProFasEst,
            H01ZT6_n760ProFasEst, H01ZT6_A143BarDisNum, H01ZT6_A4812BarEncCli, H01ZT6_A396EmprCod
            }
            , new Object[] {
            H01ZT11_A159BarFecGen, H01ZT11_A14284ProEst, H01ZT11_A758ProCod, H01ZT11_A1234BarNomCli, H01ZT11_A136BarColNum, H01ZT11_A135BarColNom, H01ZT11_A1652BarSerDsc, H01ZT11_A212BarSer, H01ZT11_A213BarSit, H01ZT11_A130BarCodPar,
            H01ZT11_A132BarCodReo, H01ZT11_A129BarCod, H01ZT11_A279CliNom, H01ZT11_A252CliCod, H01ZT11_n252CliCod, H01ZT11_A151BarFasCod, H01ZT11_n151BarFasCod, H01ZT11_A184BarMtr, H01ZT11_A166BarKgm, H01ZT11_A760ProFasEst,
            H01ZT11_n760ProFasEst, H01ZT11_A143BarDisNum, H01ZT11_A4812BarEncCli, H01ZT11_A396EmprCod
            }
            , new Object[] {
            H01ZT16_A14284ProEst, H01ZT16_A159BarFecGen, H01ZT16_A758ProCod, H01ZT16_A396EmprCod, H01ZT16_A1234BarNomCli, H01ZT16_A136BarColNum, H01ZT16_A135BarColNom, H01ZT16_A1652BarSerDsc, H01ZT16_A212BarSer, H01ZT16_A213BarSit,
            H01ZT16_A130BarCodPar, H01ZT16_A132BarCodReo, H01ZT16_A129BarCod, H01ZT16_A279CliNom, H01ZT16_A252CliCod, H01ZT16_n252CliCod, H01ZT16_A151BarFasCod, H01ZT16_n151BarFasCod, H01ZT16_A184BarMtr, H01ZT16_A166BarKgm,
            H01ZT16_A760ProFasEst, H01ZT16_n760ProFasEst
            }
         }
      );
      AV90Pgmname = "Produccion.CargasProduccionporProceso_WC" ;
      /* GeneXus formulas. */
      AV90Pgmname = "Produccion.CargasProduccionporProceso_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV32BarSit ;
   private byte wcpOAV33BarSit_to ;
   private byte wcpOAV26Profasest ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV32BarSit ;
   private byte AV33BarSit_to ;
   private byte AV26Profasest ;
   private byte AV21ManageFiltersExecutionStep ;
   private byte AV48TFBarCodReo ;
   private byte AV49TFBarCodReo_To ;
   private byte AV52TFBarSit ;
   private byte AV53TFBarSit_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A760ProFasEst ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV34OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV27CliCod ;
   private int wcpOAV29CliCod_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV27CliCod ;
   private int AV29CliCod_to ;
   private int nGXsfl_43_idx=1 ;
   private int AV42TFCliCod ;
   private int AV43TFCliCod_To ;
   private int AV46TFBarCod ;
   private int AV47TFBarCod_To ;
   private int AV60TFBarColNum ;
   private int AV61TFBarColNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Visible ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int AV78TFProFasEst_Sels_size ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtavBarenccli_Visible ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtBarSit_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtBarColNom_Visible ;
   private int edtBarColNum_Visible ;
   private int edtBarNomCli_Visible ;
   private int edtBarKgm_Visible ;
   private int edtBarMtr_Visible ;
   private int edtBarFasCod_Visible ;
   private int AV23PageToGo ;
   private int AV91GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24GridCurrentPage ;
   private long AV25GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV64TFBarKgm ;
   private java.math.BigDecimal AV65TFBarKgm_To ;
   private java.math.BigDecimal AV66TFBarMtr ;
   private java.math.BigDecimal AV67TFBarMtr_To ;
   private java.math.BigDecimal AV79TotBarKgm ;
   private java.math.BigDecimal AV81TotBarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV28ProCod ;
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
   private String AV13EmprCod ;
   private String AV28ProCod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV90Pgmname ;
   private String AV44TFCliNom ;
   private String AV45TFCliNom_Sel ;
   private String AV50TFBarCodPar ;
   private String AV51TFBarCodPar_Sel ;
   private String AV54TFBarSer ;
   private String AV55TFBarSer_Sel ;
   private String AV56TFBarSerDsc ;
   private String AV57TFBarSerDsc_Sel ;
   private String AV58TFBarColNom ;
   private String AV59TFBarColNom_Sel ;
   private String AV62TFBarNomCli ;
   private String AV63TFBarNomCli_Sel ;
   private String AV68TFBarFasCod ;
   private String AV69TFBarFasCod_Sel ;
   private String A13878PedidoClie ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A758ProCod ;
   private String A4812BarEncCli ;
   private String A143BarDisNum ;
   private String A14284ProEst ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtnusuexportreport_Internalname ;
   private String bttBtnusuexportreport_Jsonclick ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV70DetailWebComponent ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String AV37BarEncCli ;
   private String edtavBarenccli_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtBarSit_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String scmdbuf ;
   private String lV68TFBarFasCod ;
   private String lV44TFCliNom ;
   private String lV50TFBarCodPar ;
   private String lV54TFBarSer ;
   private String lV56TFBarSerDsc ;
   private String lV58TFBarColNom ;
   private String lV62TFBarNomCli ;
   private String AV83Station ;
   private String AV84EmprNom ;
   private String AV85UsurCod ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char5[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV13EmprCod ;
   private String sCtrlAV28ProCod ;
   private String sCtrlAV27CliCod ;
   private String sCtrlAV29CliCod_to ;
   private String sCtrlAV30BarFecGen ;
   private String sCtrlAV31BarFecGen_to ;
   private String sCtrlAV32BarSit ;
   private String sCtrlAV33BarSit_to ;
   private String sCtrlAV26Profasest ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String GXCCtl ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30BarFecGen ;
   private java.util.Date wcpOAV31BarFecGen_to ;
   private java.util.Date AV30BarFecGen ;
   private java.util.Date AV31BarFecGen_to ;
   private java.util.Date A159BarFecGen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV35OrderedDsc ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n760ProFasEst ;
   private boolean n252CliCod ;
   private boolean n151BarFasCod ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV77TFProFasEst_SelsJson ;
   private String AV14ColumnsSelectorXML ;
   private String AV20ManageFiltersXml ;
   private String AV15UserCustomValue ;
   private String AV12FilterFullText ;
   private String lV12FilterFullText ;
   private String AV80TotValueBarKgm ;
   private String AV82TotValueBarMtr ;
   private String AV38ExcelFilename ;
   private String AV39ErrorMessage ;
   private GXSimpleCollection<Byte> AV78TFProFasEst_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV18Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbProFasEst ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01ZT6_A159BarFecGen ;
   private String[] H01ZT6_A14284ProEst ;
   private String[] H01ZT6_A758ProCod ;
   private String[] H01ZT6_A1234BarNomCli ;
   private int[] H01ZT6_A136BarColNum ;
   private String[] H01ZT6_A135BarColNom ;
   private String[] H01ZT6_A1652BarSerDsc ;
   private String[] H01ZT6_A212BarSer ;
   private byte[] H01ZT6_A213BarSit ;
   private String[] H01ZT6_A130BarCodPar ;
   private byte[] H01ZT6_A132BarCodReo ;
   private int[] H01ZT6_A129BarCod ;
   private String[] H01ZT6_A279CliNom ;
   private int[] H01ZT6_A252CliCod ;
   private boolean[] H01ZT6_n252CliCod ;
   private String[] H01ZT6_A151BarFasCod ;
   private boolean[] H01ZT6_n151BarFasCod ;
   private java.math.BigDecimal[] H01ZT6_A184BarMtr ;
   private java.math.BigDecimal[] H01ZT6_A166BarKgm ;
   private byte[] H01ZT6_A760ProFasEst ;
   private boolean[] H01ZT6_n760ProFasEst ;
   private String[] H01ZT6_A143BarDisNum ;
   private String[] H01ZT6_A4812BarEncCli ;
   private String[] H01ZT6_A396EmprCod ;
   private java.util.Date[] H01ZT11_A159BarFecGen ;
   private String[] H01ZT11_A14284ProEst ;
   private String[] H01ZT11_A758ProCod ;
   private String[] H01ZT11_A1234BarNomCli ;
   private int[] H01ZT11_A136BarColNum ;
   private String[] H01ZT11_A135BarColNom ;
   private String[] H01ZT11_A1652BarSerDsc ;
   private String[] H01ZT11_A212BarSer ;
   private byte[] H01ZT11_A213BarSit ;
   private String[] H01ZT11_A130BarCodPar ;
   private byte[] H01ZT11_A132BarCodReo ;
   private int[] H01ZT11_A129BarCod ;
   private String[] H01ZT11_A279CliNom ;
   private int[] H01ZT11_A252CliCod ;
   private boolean[] H01ZT11_n252CliCod ;
   private String[] H01ZT11_A151BarFasCod ;
   private boolean[] H01ZT11_n151BarFasCod ;
   private java.math.BigDecimal[] H01ZT11_A184BarMtr ;
   private java.math.BigDecimal[] H01ZT11_A166BarKgm ;
   private byte[] H01ZT11_A760ProFasEst ;
   private boolean[] H01ZT11_n760ProFasEst ;
   private String[] H01ZT11_A143BarDisNum ;
   private String[] H01ZT11_A4812BarEncCli ;
   private String[] H01ZT11_A396EmprCod ;
   private String[] H01ZT16_A14284ProEst ;
   private java.util.Date[] H01ZT16_A159BarFecGen ;
   private String[] H01ZT16_A758ProCod ;
   private String[] H01ZT16_A396EmprCod ;
   private String[] H01ZT16_A1234BarNomCli ;
   private int[] H01ZT16_A136BarColNum ;
   private String[] H01ZT16_A135BarColNom ;
   private String[] H01ZT16_A1652BarSerDsc ;
   private String[] H01ZT16_A212BarSer ;
   private byte[] H01ZT16_A213BarSit ;
   private String[] H01ZT16_A130BarCodPar ;
   private byte[] H01ZT16_A132BarCodReo ;
   private int[] H01ZT16_A129BarCod ;
   private String[] H01ZT16_A279CliNom ;
   private int[] H01ZT16_A252CliCod ;
   private boolean[] H01ZT16_n252CliCod ;
   private String[] H01ZT16_A151BarFasCod ;
   private boolean[] H01ZT16_n151BarFasCod ;
   private java.math.BigDecimal[] H01ZT16_A184BarMtr ;
   private java.math.BigDecimal[] H01ZT16_A166BarKgm ;
   private byte[] H01ZT16_A760ProFasEst ;
   private boolean[] H01ZT16_n760ProFasEst ;
   private com.genexus.webpanels.WebSession AV72WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV19ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV16ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV22DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV71ProgressIndicator ;
}

final  class cargasproduccionporproceso_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01ZT6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A760ProFasEst ,
                                          GXSimpleCollection<Byte> AV78TFProFasEst_Sels ,
                                          int AV42TFCliCod ,
                                          int AV43TFCliCod_To ,
                                          String AV45TFCliNom_Sel ,
                                          String AV44TFCliNom ,
                                          int AV46TFBarCod ,
                                          int AV47TFBarCod_To ,
                                          byte AV48TFBarCodReo ,
                                          byte AV49TFBarCodReo_To ,
                                          String AV51TFBarCodPar_Sel ,
                                          String AV50TFBarCodPar ,
                                          byte AV52TFBarSit ,
                                          byte AV53TFBarSit_To ,
                                          String AV55TFBarSer_Sel ,
                                          String AV54TFBarSer ,
                                          String AV57TFBarSerDsc_Sel ,
                                          String AV56TFBarSerDsc ,
                                          String AV59TFBarColNom_Sel ,
                                          String AV58TFBarColNom ,
                                          int AV60TFBarColNum ,
                                          int AV61TFBarColNum_To ,
                                          String AV63TFBarNomCli_Sel ,
                                          String AV62TFBarNomCli ,
                                          java.math.BigDecimal AV64TFBarKgm ,
                                          java.math.BigDecimal AV65TFBarKgm_To ,
                                          java.math.BigDecimal AV66TFBarMtr ,
                                          java.math.BigDecimal AV67TFBarMtr_To ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          byte A213BarSit ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          java.math.BigDecimal A166BarKgm ,
                                          java.math.BigDecimal A184BarMtr ,
                                          short AV34OrderedBy ,
                                          boolean AV35OrderedDsc ,
                                          String AV12FilterFullText ,
                                          String A151BarFasCod ,
                                          int AV78TFProFasEst_Sels_size ,
                                          String AV69TFBarFasCod_Sel ,
                                          String AV68TFBarFasCod ,
                                          int AV27CliCod ,
                                          int AV29CliCod_to ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date AV30BarFecGen ,
                                          java.util.Date AV31BarFecGen_to ,
                                          byte AV32BarSit ,
                                          byte AV33BarSit_to ,
                                          byte AV26Profasest ,
                                          String A14284ProEst ,
                                          String AV13EmprCod ,
                                          String AV28ProCod ,
                                          String A396EmprCod ,
                                          String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[57];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T4.ProEst, T1.ProCod, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T3.CliNom," ;
      scmdbuf += " T2.CliCod, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T7.ProFasEst, 0) AS ProFasEst," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((((TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT" ;
      scmdbuf += " MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP" ;
      scmdbuf += " BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV78TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV42TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      if ( ! (0==AV43TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int23[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int23[41] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int23[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int23[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int23[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int23[48] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int23[49] = (byte)(1) ;
      }
      if ( ! (0==AV61TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int23[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV62TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int23[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int23[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int23[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int23[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int23[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T2.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01ZT11( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV78TFProFasEst_Sels ,
                                           int AV42TFCliCod ,
                                           int AV43TFCliCod_To ,
                                           String AV45TFCliNom_Sel ,
                                           String AV44TFCliNom ,
                                           int AV46TFBarCod ,
                                           int AV47TFBarCod_To ,
                                           byte AV48TFBarCodReo ,
                                           byte AV49TFBarCodReo_To ,
                                           String AV51TFBarCodPar_Sel ,
                                           String AV50TFBarCodPar ,
                                           byte AV52TFBarSit ,
                                           byte AV53TFBarSit_To ,
                                           String AV55TFBarSer_Sel ,
                                           String AV54TFBarSer ,
                                           String AV57TFBarSerDsc_Sel ,
                                           String AV56TFBarSerDsc ,
                                           String AV59TFBarColNom_Sel ,
                                           String AV58TFBarColNom ,
                                           int AV60TFBarColNum ,
                                           int AV61TFBarColNum_To ,
                                           String AV63TFBarNomCli_Sel ,
                                           String AV62TFBarNomCli ,
                                           java.math.BigDecimal AV64TFBarKgm ,
                                           java.math.BigDecimal AV65TFBarKgm_To ,
                                           java.math.BigDecimal AV66TFBarMtr ,
                                           java.math.BigDecimal AV67TFBarMtr_To ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           short AV34OrderedBy ,
                                           boolean AV35OrderedDsc ,
                                           String AV12FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV78TFProFasEst_Sels_size ,
                                           String AV69TFBarFasCod_Sel ,
                                           String AV68TFBarFasCod ,
                                           int AV27CliCod ,
                                           int AV29CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV30BarFecGen ,
                                           java.util.Date AV31BarFecGen_to ,
                                           byte AV32BarSit ,
                                           byte AV33BarSit_to ,
                                           byte AV26Profasest ,
                                           String A14284ProEst ,
                                           String AV13EmprCod ,
                                           String AV28ProCod ,
                                           String A396EmprCod ,
                                           String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[57];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT T2.BarFecGen, T4.ProEst, T1.ProCod, T2.BarNomCli, T2.BarColNum, T2.BarColNom, T2.BarSerDsc, T2.BarSer, T2.BarSit, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T3.CliNom," ;
      scmdbuf += " T2.CliCod, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T7.ProFasEst, 0) AS ProFasEst," ;
      scmdbuf += " T2.BarDisNum, T2.BarEncCli, T1.EmprCod FROM ((((((TXPBARPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo" ;
      scmdbuf += " AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T4.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT" ;
      scmdbuf += " MAX(BarOrdLin) AS GXC1, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T8.EmprCod AND T9.BarCod = T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP" ;
      scmdbuf += " BY T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT" ;
      scmdbuf += " MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod" ;
      scmdbuf += " ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T2.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV78TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T2.CliCod >= ?)");
      addWhere(sWhereString, "(T2.CliCod <= ?)");
      addWhere(sWhereString, "(T2.BarFecGen >= ?)");
      addWhere(sWhereString, "(T2.BarFecGen <= ?)");
      addWhere(sWhereString, "(T2.BarSit >= ?)");
      addWhere(sWhereString, "(T2.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV42TFCliCod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int26[31] = (byte)(1) ;
      }
      if ( ! (0==AV43TFCliCod_To) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int26[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int26[34] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int26[35] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int26[36] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int26[37] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int26[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int26[40] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarSit) )
      {
         addWhere(sWhereString, "(T2.BarSit >= ?)");
      }
      else
      {
         GXv_int26[41] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarSit_To) )
      {
         addWhere(sWhereString, "(T2.BarSit <= ?)");
      }
      else
      {
         GXv_int26[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int26[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int26[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int26[48] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarColNum) )
      {
         addWhere(sWhereString, "(T2.BarColNum >= ?)");
      }
      else
      {
         GXv_int26[49] = (byte)(1) ;
      }
      if ( ! (0==AV61TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T2.BarColNum <= ?)");
      }
      else
      {
         GXv_int26[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV62TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int26[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int26[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int26[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int26[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int26[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV34OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod, T2.CliCod, T2.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV34OrderedBy == 2 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV34OrderedBy == 3 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV34OrderedBy == 4 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV34OrderedBy == 5 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV34OrderedBy == 6 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSit" ;
      }
      else if ( ( AV34OrderedBy == 7 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSit DESC" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV34OrderedBy == 8 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc" ;
      }
      else if ( ( AV34OrderedBy == 9 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarSerDsc DESC" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV34OrderedBy == 10 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarColNum" ;
      }
      else if ( ( AV34OrderedBy == 11 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarColNum DESC" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ! AV35OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV34OrderedBy == 12 ) && ( AV35OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.BarNomCli DESC" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H01ZT16( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A760ProFasEst ,
                                           GXSimpleCollection<Byte> AV78TFProFasEst_Sels ,
                                           int AV42TFCliCod ,
                                           int AV43TFCliCod_To ,
                                           String AV45TFCliNom_Sel ,
                                           String AV44TFCliNom ,
                                           int AV46TFBarCod ,
                                           int AV47TFBarCod_To ,
                                           byte AV48TFBarCodReo ,
                                           byte AV49TFBarCodReo_To ,
                                           String AV51TFBarCodPar_Sel ,
                                           String AV50TFBarCodPar ,
                                           byte AV52TFBarSit ,
                                           byte AV53TFBarSit_To ,
                                           String AV55TFBarSer_Sel ,
                                           String AV54TFBarSer ,
                                           String AV57TFBarSerDsc_Sel ,
                                           String AV56TFBarSerDsc ,
                                           String AV59TFBarColNom_Sel ,
                                           String AV58TFBarColNom ,
                                           int AV60TFBarColNum ,
                                           int AV61TFBarColNum_To ,
                                           String AV63TFBarNomCli_Sel ,
                                           String AV62TFBarNomCli ,
                                           java.math.BigDecimal AV64TFBarKgm ,
                                           java.math.BigDecimal AV65TFBarKgm_To ,
                                           java.math.BigDecimal AV66TFBarMtr ,
                                           java.math.BigDecimal AV67TFBarMtr_To ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           byte A213BarSit ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           java.math.BigDecimal A166BarKgm ,
                                           java.math.BigDecimal A184BarMtr ,
                                           String AV12FilterFullText ,
                                           String A151BarFasCod ,
                                           int AV78TFProFasEst_Sels_size ,
                                           String AV69TFBarFasCod_Sel ,
                                           String AV68TFBarFasCod ,
                                           int AV27CliCod ,
                                           int AV29CliCod_to ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date AV30BarFecGen ,
                                           java.util.Date AV31BarFecGen_to ,
                                           byte AV32BarSit ,
                                           byte AV33BarSit_to ,
                                           String A14284ProEst ,
                                           byte AV26Profasest ,
                                           String AV13EmprCod ,
                                           String AV28ProCod ,
                                           String A396EmprCod ,
                                           String A758ProCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[57];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T2.ProEst, T3.BarFecGen, T1.ProCod, T1.EmprCod, T3.BarNomCli, T3.BarColNum, T3.BarColNom, T3.BarSerDsc, T3.BarSer, T3.BarSit, T1.BarCodPar, T1.BarCodReo," ;
      scmdbuf += " T1.BarCod, T4.CliNom, T3.CliCod, COALESCE( T5.BarFasCod, ' ') AS BarFasCod, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T7.ProFasEst," ;
      scmdbuf += " 0) AS ProFasEst FROM ((((((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      scmdbuf += " LEFT JOIN (SELECT MIN(T8.FasCod) AS BarFasCod, T8.EmprCod, T8.BarCod, T8.BarCodReo, T8.BarCodPar FROM (TXPBARFAS T8 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC1, EmprCod," ;
      scmdbuf += " BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T9 ON T9.EmprCod = T8.EmprCod AND T9.BarCod =" ;
      scmdbuf += " T8.BarCod AND T9.BarCodReo = T8.BarCodReo AND T9.BarCodPar = T8.BarCodPar) WHERE (T8.BarOrdLin = T9.GXC1) AND (T8.BarFasEst <> 0) GROUP BY T8.EmprCod, T8.BarCod," ;
      scmdbuf += " T8.BarCodReo, T8.BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) LEFT JOIN" ;
      scmdbuf += " (SELECT SUM(BarPieMet) AS BarMtr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      scmdbuf += " ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst," ;
      scmdbuf += " EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar AND T7.ProCod = T1.ProCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ProCod = ?)");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( ( SUBSTR(TO_CHAR(COALESCE( T7.ProFasEst, 0),'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarSit,'90'), 2) like '%' || ?) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.BarColNum,'999990'), 2) like '%' || ?) or ( UPPER(T3.BarNomCli) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarKgm, 0),'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(COALESCE( T6.BarMtr, 0),'999990.99'), 2) like '%' || ?) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?))))");
      addWhere(sWhereString, "(? <= 0 or ( "+GXutil.toValueList("oracle7", AV78TFProFasEst_Sels, "COALESCE( T7.ProFasEst, 0) IN (", ")")+"))");
      addWhere(sWhereString, "(Not ( (rtrim(?) IS NULL) and ( Not (rtrim(?) IS NULL))) or ( UPPER(COALESCE( T5.BarFasCod, ' ')) like '%' || UPPER(?)))");
      addWhere(sWhereString, "((rtrim(?) IS NULL) or ( COALESCE( T5.BarFasCod, ' ') = ?))");
      addWhere(sWhereString, "(T3.CliCod >= ?)");
      addWhere(sWhereString, "(T3.CliCod <= ?)");
      addWhere(sWhereString, "(T3.BarFecGen >= ?)");
      addWhere(sWhereString, "(T3.BarFecGen <= ?)");
      addWhere(sWhereString, "(T3.BarSit >= ?)");
      addWhere(sWhereString, "(T3.BarSit <= ?)");
      addWhere(sWhereString, "(COALESCE( T7.ProFasEst, 0) = ?)");
      if ( ! (0==AV42TFCliCod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV43TFCliCod_To) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV45TFCliNom_Sel)==0) && ( ! (GXutil.strcmp("", AV44TFCliNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV45TFCliNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! (0==AV46TFBarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! (0==AV47TFBarCod_To) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! (0==AV48TFBarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! (0==AV49TFBarCodReo_To) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) && ( ! (GXutil.strcmp("", AV50TFBarCodPar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV51TFBarCodPar_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! (0==AV52TFBarSit) )
      {
         addWhere(sWhereString, "(T3.BarSit >= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! (0==AV53TFBarSit_To) )
      {
         addWhere(sWhereString, "(T3.BarSit <= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV55TFBarSer_Sel)==0) && ( ! (GXutil.strcmp("", AV54TFBarSer)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55TFBarSer_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV56TFBarSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV57TFBarSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV58TFBarColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59TFBarColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV60TFBarColNum) )
      {
         addWhere(sWhereString, "(T3.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV61TFBarColNum_To) )
      {
         addWhere(sWhereString, "(T3.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) && ( ! (GXutil.strcmp("", AV62TFBarNomCli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63TFBarNomCli_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFBarKgm)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) >= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFBarKgm_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarKgm, 0) <= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFBarMtr)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) >= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFBarMtr_To)==0) )
      {
         addWhere(sWhereString, "(COALESCE( T6.BarMtr, 0) <= ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ProCod" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
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
                  return conditional_H01ZT6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] );
            case 1 :
                  return conditional_H01ZT11(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , (java.util.Date)dynConstraints[50] , (java.util.Date)dynConstraints[51] , (java.util.Date)dynConstraints[52] , ((Number) dynConstraints[53]).byteValue() , ((Number) dynConstraints[54]).byteValue() , ((Number) dynConstraints[55]).byteValue() , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] , (String)dynConstraints[59] , (String)dynConstraints[60] );
            case 2 :
                  return conditional_H01ZT16(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).byteValue() , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , (String)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , (java.util.Date)dynConstraints[48] , (java.util.Date)dynConstraints[49] , (java.util.Date)dynConstraints[50] , ((Number) dynConstraints[51]).byteValue() , ((Number) dynConstraints[52]).byteValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).byteValue() , (String)dynConstraints[55] , (String)dynConstraints[56] , (String)dynConstraints[57] , (String)dynConstraints[58] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZT6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZT11", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZT16", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 8);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((String[]) buf[23])[0] = rslt.getString(21, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(15, 8);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((byte[]) buf[19])[0] = rslt.getByte(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 8);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((String[]) buf[23])[0] = rslt.getString(21, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[67], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[68], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[69], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[70], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[71], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[72], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[73], 100);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[74], 100);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[81]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[82]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[83]);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[84]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[85]).byteValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[86]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[87]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 30);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 30);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[92]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[93]).intValue());
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[95]).byteValue());
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 1);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 1);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[98]).byteValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[99]).byteValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[100], 16);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 16);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 26);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[103], 26);
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[104], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[105], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[106]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[107]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[108], 13);
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[109], 13);
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[110], 2);
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[111], 2);
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[112], 2);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[113], 2);
               }
               return;
      }
   }

}

