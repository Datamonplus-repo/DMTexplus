package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenturno__wc_impl extends GXWebComponent
{
   public informeproduccionresumenturno__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenturno__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenturno__wc_impl.class ));
   }

   public informeproduccionresumenturno__wc_impl( int remoteHandle ,
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
               AV28Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
               AV29HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisEstReo", GXutil.str( AV29HisEstReo, 1, 0));
               AV30MaqCod1 = httpContext.GetPar( "MaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30MaqCod1", AV30MaqCod1);
               AV31MaqCod2 = httpContext.GetPar( "MaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqCod2", AV31MaqCod2);
               AV32HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32HisProFec1", localUtil.ttoc( AV32HisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV33HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisProFec2", localUtil.ttoc( AV33HisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV34OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
               AV35OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28Emprcod,Byte.valueOf(AV29HisEstReo),AV30MaqCod1,AV31MaqCod2,AV32HisProFec1,AV33HisProFec2,Integer.valueOf(AV34OperarioFrom),Integer.valueOf(AV35OperarioTo)});
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
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
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
      AV23ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV18ColumnsSelector);
      AV60Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28Emprcod = httpContext.GetPar( "Emprcod") ;
      AV29HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV30MaqCod1 = httpContext.GetPar( "MaqCod1") ;
      AV31MaqCod2 = httpContext.GetPar( "MaqCod2") ;
      AV32HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
      AV33HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
      AV34OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV35OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      AV50moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13InformeProduccionResumenTurno_SDT);
      AV42Tot_Kilos1 = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kilos1"), ".") ;
      AV44Tot_Kilos2 = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kilos2"), ".") ;
      AV46Tot_Kilos3 = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kilos3"), ".") ;
      AV48Tot_Kilos4 = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Kilos4"), ".") ;
      AV36InformeProduccionResumenTurno_SDTjson = httpContext.GetPar( "InformeProduccionResumenTurno_SDTjson") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2D82( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen Turno__WC", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenturno__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV30MaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV31MaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32HisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV33HisProFec2)),GXutil.URLEncode(GXutil.ltrimstr(AV34OperarioFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35OperarioTo,6,0))}, new String[] {"Emprcod","HisEstReo","MaqCod1","MaqCod2","HisProFec1","HisProFec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumenTurno_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS1", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS2", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS3", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS4", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", getSecureSignedToken( sPrefix, AV36InformeProduccionResumenTurno_SDTjson));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenTurno__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumenturno__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Informeproduccionresumenturno_sdt", AV13InformeProduccionResumenTurno_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Informeproduccionresumenturno_sdt", AV13InformeProduccionResumenTurno_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Informeproduccionresumenturno_sdt", getSecureSignedToken( sPrefix, AV13InformeProduccionResumenTurno_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV21ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV26GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV27GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV18ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Emprcod", GXutil.rtrim( wcpOAV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV29HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30MaqCod1", GXutil.rtrim( wcpOAV30MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31MaqCod2", GXutil.rtrim( wcpOAV31MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32HisProFec1", localUtil.ttoc( wcpOAV32HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33HisProFec2", localUtil.ttoc( wcpOAV33HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV34OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV35OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV28Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV29HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV30MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV31MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV32HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV33HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV34OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV35OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV50moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDT", AV13InformeProduccionResumenTurno_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDT", AV13InformeProduccionResumenTurno_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumenTurno_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS1", GXutil.ltrim( localUtil.ntoc( AV42Tot_Kilos1, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS1", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS2", GXutil.ltrim( localUtil.ntoc( AV44Tot_Kilos2, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS2", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS3", GXutil.ltrim( localUtil.ntoc( AV46Tot_Kilos3, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS3", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS4", GXutil.ltrim( localUtil.ntoc( AV48Tot_Kilos4, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS4", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", AV36InformeProduccionResumenTurno_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", getSecureSignedToken( sPrefix, AV36InformeProduccionResumenTurno_SDTjson));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm2D82( )
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
      return "Produccion.InformeProduccionResumenTurno__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Turno__WC", "") ;
   }

   public void wb2D80( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenturno__wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_2D82( true) ;
      }
      else
      {
         wb_table1_21_2D82( false) ;
      }
      return  ;
   }

   public void wb_table1_21_2D82e( boolean wbgen )
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
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV53GXV1 = nGXsfl_39_idx ;
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
         wb_table2_48_2D82( true) ;
      }
      else
      {
         wb_table2_48_2D82( false) ;
      }
      return  ;
   }

   public void wb_table2_48_2D82e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV26GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV27GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV60Pgmname), GXutil.rtrim( localUtil.format( AV60Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV18ColumnsSelector);
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
      if ( wbEnd == 39 )
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
               AV53GXV1 = nGXsfl_39_idx ;
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

   public void start2D82( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen Turno__WC", ""), (short)(0)) ;
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
            strup2D80( ) ;
         }
      }
   }

   public void ws2D82( )
   {
      start2D82( ) ;
      evt2D82( ) ;
   }

   public void evt2D82( )
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
                              strup2D80( ) ;
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
                              strup2D80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112D82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122D82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132D82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142D82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e152D82 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'DOEXPORTCSV'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2D80( ) ;
                           }
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV53GXV1 = (int)(nGXsfl_39_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13InformeProduccionResumenTurno_SDT.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
                           {
                              AV13InformeProduccionResumenTurno_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)) );
                           }
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
                                       e162D82 ();
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
                                       e172D82 ();
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
                                       e182D82 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportCSV' */
                                       e192D82 ();
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
                                    strup2D80( ) ;
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

   public void we2D82( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2D82( ) ;
         }
      }
   }

   public void pa2D82( )
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
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV60Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV28Emprcod ,
                                 byte AV29HisEstReo ,
                                 String AV30MaqCod1 ,
                                 String AV31MaqCod2 ,
                                 java.util.Date AV32HisProFec1 ,
                                 java.util.Date AV33HisProFec2 ,
                                 int AV34OperarioFrom ,
                                 int AV35OperarioTo ,
                                 short AV50moda21 ,
                                 GXBaseCollection<app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> AV13InformeProduccionResumenTurno_SDT ,
                                 java.math.BigDecimal AV42Tot_Kilos1 ,
                                 java.math.BigDecimal AV44Tot_Kilos2 ,
                                 java.math.BigDecimal AV46Tot_Kilos3 ,
                                 java.math.BigDecimal AV48Tot_Kilos4 ,
                                 String AV36InformeProduccionResumenTurno_SDTjson ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172D82 ();
      GRID_nCurrentRecord = 0 ;
      rf2D82( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenTurno__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumenturno__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2D82( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV60Pgmname = "Produccion.InformeProduccionResumenTurno__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos1_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos2_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos3_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos4_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvalue_kilos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos1_Enabled), 5, 0), true);
      edtavTotvalue_kilos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos2_Enabled), 5, 0), true);
      edtavTotvalue_kilos3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos3_Enabled), 5, 0), true);
      edtavTotvalue_kilos4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos4_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2D82( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e172D82 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_392( ) ;
         e182D82 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_39_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e182D82 ();
         }
         wbEnd = (short)(39) ;
         wb2D80( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2D82( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV50moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50moda21), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDT", AV13InformeProduccionResumenTurno_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDT", AV13InformeProduccionResumenTurno_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumenTurno_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS1", GXutil.ltrim( localUtil.ntoc( AV42Tot_Kilos1, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS1", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS2", GXutil.ltrim( localUtil.ntoc( AV44Tot_Kilos2, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS2", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS3", GXutil.ltrim( localUtil.ntoc( AV46Tot_Kilos3, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS3", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_KILOS4", GXutil.ltrim( localUtil.ntoc( AV48Tot_Kilos4, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS4", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", AV36InformeProduccionResumenTurno_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", getSecureSignedToken( sPrefix, AV36InformeProduccionResumenTurno_SDTjson));
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
      return AV13InformeProduccionResumenTurno_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV60Pgmname, AV12FilterFullText, AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, AV50moda21, AV13InformeProduccionResumenTurno_SDT, AV42Tot_Kilos1, AV44Tot_Kilos2, AV46Tot_Kilos3, AV48Tot_Kilos4, AV36InformeProduccionResumenTurno_SDTjson, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV60Pgmname = "Produccion.InformeProduccionResumenTurno__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Pgmname", AV60Pgmname);
      Gx_err = (short)(0) ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos1_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos2_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos3_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos4_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavTotvalue_kilos1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos1_Enabled), 5, 0), true);
      edtavTotvalue_kilos2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos2_Enabled), 5, 0), true);
      edtavTotvalue_kilos3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos3_Enabled), 5, 0), true);
      edtavTotvalue_kilos4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_kilos4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_kilos4_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2D80( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162D82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Informeproduccionresumenturno_sdt"), AV13InformeProduccionResumenTurno_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vINFORMEPRODUCCIONRESUMENTURNO_SDT"), AV13InformeProduccionResumenTurno_SDT);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
         wcpOAV29HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV30MaqCod1") ;
         wcpOAV31MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV31MaqCod2") ;
         wcpOAV32HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32HisProFec1"), 0) ;
         wcpOAV33HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV33HisProFec2"), 0) ;
         wcpOAV34OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV35OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV53GXV1 = (int)(nGXsfl_39_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13InformeProduccionResumenTurno_SDT.size() >= AV53GXV1 ) && ( AV53GXV1 > 0 ) )
            {
               AV13InformeProduccionResumenTurno_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)) );
            }
         }
         if ( nGXsfl_39_fel_idx == 0 )
         {
            nGXsfl_39_idx = 1 ;
            sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_392( ) ;
         }
         nGXsfl_39_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         AV43TotValue_Kilos1 = httpContext.cgiGet( edtavTotvalue_kilos1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_Kilos1", AV43TotValue_Kilos1);
         AV45TotValue_Kilos2 = httpContext.cgiGet( edtavTotvalue_kilos2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_Kilos2", AV45TotValue_Kilos2);
         AV47TotValue_Kilos3 = httpContext.cgiGet( edtavTotvalue_kilos3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValue_Kilos3", AV47TotValue_Kilos3);
         AV49TotValue_Kilos4 = httpContext.cgiGet( edtavTotvalue_kilos4_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValue_Kilos4", AV49TotValue_Kilos4);
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Pgmname", AV60Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumenTurno__WC");
         AV60Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60Pgmname", AV60Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV60Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\informeproduccionresumenturno__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e162D82 ();
      if (returnInSub) return;
   }

   public void e162D82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV37Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenturno__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Station = GXt_char1 ;
      GXv_char2[0] = AV28Emprcod ;
      GXv_char3[0] = AV38EmprNom ;
      GXv_char4[0] = AV39UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV37Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenturno__wc_impl.this.AV28Emprcod = GXv_char2[0] ;
      informeproduccionresumenturno__wc_impl.this.AV38EmprNom = GXv_char3[0] ;
      informeproduccionresumenturno__wc_impl.this.AV39UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
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
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV50moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV28Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      informeproduccionresumenturno__wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV50moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50moda21), "ZZZ9")));
      GXt_char1 = AV36InformeProduccionResumenTurno_SDTjson ;
      GXv_char4[0] = GXt_char1 ;
      new app.produccion.informeproduccionresumenturno_prc(remoteHandle, context).execute( AV28Emprcod, AV29HisEstReo, AV30MaqCod1, AV31MaqCod2, AV32HisProFec1, AV33HisProFec2, AV34OperarioFrom, AV35OperarioTo, GXv_char4) ;
      informeproduccionresumenturno__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV36InformeProduccionResumenTurno_SDTjson = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36InformeProduccionResumenTurno_SDTjson", AV36InformeProduccionResumenTurno_SDTjson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON", getSecureSignedToken( sPrefix, AV36InformeProduccionResumenTurno_SDTjson));
      AV13InformeProduccionResumenTurno_SDT.fromJSonString(AV36InformeProduccionResumenTurno_SDTjson, null);
      gx_BV39 = true ;
   }

   public void e172D82( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV23ManageFiltersExecutionStep == 1 )
      {
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV23ManageFiltersExecutionStep == 2 )
      {
         AV23ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.InformeProduccionResumenTurno__WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Produccion.InformeProduccionResumenTurno__WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavInformeproduccionresumenturno_sdt__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqcod_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__maqdsc_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos1_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos1_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos2_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos3_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos3_Visible), 5, 0), !bGXsfl_39_Refreshing);
      edtavInformeproduccionresumenturno_sdt__kilos4_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumenturno_sdt__kilos4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumenturno_sdt__kilos4_Visible), 5, 0), !bGXsfl_39_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV26GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridCurrentPage), 10, 0));
      AV27GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e122D82( )
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
         AV25PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV25PageToGo) ;
      }
   }

   public void e132D82( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e182D82( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV53GXV1 = 1 ;
      while ( AV53GXV1 <= AV13InformeProduccionResumenTurno_SDT.size() )
      {
         AV13InformeProduccionResumenTurno_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(39) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_392( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
         {
            httpContext.doAjaxLoad(39, GridRow);
         }
         AV53GXV1 = (int)(AV53GXV1+1) ;
      }
   }

   public void e142D82( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.InformeProduccionResumenTurno__WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112D82( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.InformeProduccionResumenTurno__WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV60Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.InformeProduccionResumenTurno__WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.InformeProduccionResumenTurno__WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         informeproduccionresumenturno__wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV22ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV22ManageFiltersXml) ;
            AV10GridState.fromxml(AV22ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
   }

   public void e152D82( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV40WebSession.setValue(httpContext.getMessage( "&InformeProduccionResumenTurno_SDTjson", ""), AV36InformeProduccionResumenTurno_SDTjson);
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.produccion.informeproduccionresumenturno__wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      informeproduccionresumenturno__wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      informeproduccionresumenturno__wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV15ErrorMessage);
      }
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV18ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__Maqcod", "", "Maquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__MaqDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__Kilos1", "", "Kilos 1", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__Kilos2", "", "Kilos 2", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__Kilos3", "", "Kilos 3", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      if ( AV50moda21 == 0 )
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "InformeProduccionResumenTurno_SDT__Kilos4", "", "Kilos 4", true, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      else
      {
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "", "", "", false, "") ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.InformeProduccionResumenTurno__WCColumnsSelector", GXv_char4) ;
      informeproduccionresumenturno__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.InformeProduccionResumenTurno__WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV12FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV60Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV60Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV60Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV61GXV8 = 1 ;
      while ( AV61GXV8 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV61GXV8));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV61GXV8 = (int)(AV61GXV8+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV60Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV28Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29HisEstReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29HisEstReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV30MaqCod1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV30MaqCod1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV31MaqCod2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV31MaqCod2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV32HisProFec1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV32HisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV33HisProFec2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV33HisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV34OperarioFrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV34OperarioFrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV35OperarioTo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV35OperarioTo, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV60Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV42Tot_Kilos1 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_Kilos1", GXutil.ltrimstr( AV42Tot_Kilos1, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS1", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99")));
      AV44Tot_Kilos2 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_Kilos2", GXutil.ltrimstr( AV44Tot_Kilos2, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS2", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99")));
      AV46Tot_Kilos3 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Tot_Kilos3", GXutil.ltrimstr( AV46Tot_Kilos3, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS3", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99")));
      AV48Tot_Kilos4 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Tot_Kilos4", GXutil.ltrimstr( AV48Tot_Kilos4, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS4", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV62GXV9 = 1 ;
      while ( AV62GXV9 <= AV13InformeProduccionResumenTurno_SDT.size() )
      {
         AV41InformeProduccionResumenTurno_SDTItem = (app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV62GXV9));
         AV42Tot_Kilos1 = AV42Tot_Kilos1.add((AV41InformeProduccionResumenTurno_SDTItem.getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Tot_Kilos1", GXutil.ltrimstr( AV42Tot_Kilos1, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS1", getSecureSignedToken( sPrefix, localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99")));
         AV44Tot_Kilos2 = AV44Tot_Kilos2.add((AV41InformeProduccionResumenTurno_SDTItem.getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Tot_Kilos2", GXutil.ltrimstr( AV44Tot_Kilos2, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS2", getSecureSignedToken( sPrefix, localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99")));
         AV46Tot_Kilos3 = AV46Tot_Kilos3.add((AV41InformeProduccionResumenTurno_SDTItem.getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46Tot_Kilos3", GXutil.ltrimstr( AV46Tot_Kilos3, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS3", getSecureSignedToken( sPrefix, localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99")));
         AV48Tot_Kilos4 = AV48Tot_Kilos4.add((AV41InformeProduccionResumenTurno_SDTItem.getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Tot_Kilos4", GXutil.ltrimstr( AV48Tot_Kilos4, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_KILOS4", getSecureSignedToken( sPrefix, localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99")));
         AV62GXV9 = (int)(AV62GXV9+1) ;
      }
      AV43TotValue_Kilos1 = localUtil.format( AV42Tot_Kilos1, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotValue_Kilos1", AV43TotValue_Kilos1);
      AV45TotValue_Kilos2 = localUtil.format( AV44Tot_Kilos2, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45TotValue_Kilos2", AV45TotValue_Kilos2);
      AV47TotValue_Kilos3 = localUtil.format( AV46Tot_Kilos3, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TotValue_Kilos3", AV47TotValue_Kilos3);
      AV49TotValue_Kilos4 = localUtil.format( AV48Tot_Kilos4, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotValue_Kilos4", AV49TotValue_Kilos4);
   }

   public void e192D82( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV40WebSession.setValue(httpContext.getMessage( "&InformeProduccionResumenTurno_SDTjson", ""), AV36InformeProduccionResumenTurno_SDTjson);
   }

   public void wb_table2_48_2D82( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_kilos1_Internalname, httpContext.getMessage( "Tot Value_Kilos1", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_kilos1_Internalname, AV43TotValue_Kilos1, GXutil.rtrim( localUtil.format( AV43TotValue_Kilos1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_kilos1_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_kilos1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_kilos2_Internalname, httpContext.getMessage( "Tot Value_Kilos2", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_kilos2_Internalname, AV45TotValue_Kilos2, GXutil.rtrim( localUtil.format( AV45TotValue_Kilos2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_kilos2_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_kilos2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_kilos3_Internalname, httpContext.getMessage( "Tot Value_Kilos3", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_kilos3_Internalname, AV47TotValue_Kilos3, GXutil.rtrim( localUtil.format( AV47TotValue_Kilos3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_kilos3_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_kilos3_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_kilos4_Internalname, httpContext.getMessage( "Tot Value_Kilos4", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_kilos4_Internalname, AV49TotValue_Kilos4, GXutil.rtrim( localUtil.format( AV49TotValue_Kilos4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_kilos4_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_kilos4_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_48_2D82e( true) ;
      }
      else
      {
         wb_table2_48_2D82e( false) ;
      }
   }

   public void wb_table1_21_2D82( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV21ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_26_2D82( true) ;
      }
      else
      {
         wb_table3_26_2D82( false) ;
      }
      return  ;
   }

   public void wb_table3_26_2D82e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_2D82e( true) ;
      }
      else
      {
         wb_table1_21_2D82e( false) ;
      }
   }

   public void wb_table3_26_2D82( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_39_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurno__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_26_2D82e( true) ;
      }
      else
      {
         wb_table3_26_2D82e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      AV29HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisEstReo", GXutil.str( AV29HisEstReo, 1, 0));
      AV30MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30MaqCod1", AV30MaqCod1);
      AV31MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqCod2", AV31MaqCod2);
      AV32HisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32HisProFec1", localUtil.ttoc( AV32HisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV33HisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisProFec2", localUtil.ttoc( AV33HisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV34OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
      AV35OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
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
      pa2D82( ) ;
      ws2D82( ) ;
      we2D82( ) ;
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
      sCtrlAV28Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32HisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33HisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV35OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2D82( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenturno__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2D82( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
         AV29HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisEstReo", GXutil.str( AV29HisEstReo, 1, 0));
         AV30MaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30MaqCod1", AV30MaqCod1);
         AV31MaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqCod2", AV31MaqCod2);
         AV32HisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32HisProFec1", localUtil.ttoc( AV32HisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV33HisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisProFec2", localUtil.ttoc( AV33HisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV34OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
         AV35OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
      }
      wcpOAV28Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV28Emprcod") ;
      wcpOAV29HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV30MaqCod1") ;
      wcpOAV31MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV31MaqCod2") ;
      wcpOAV32HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32HisProFec1"), 0) ;
      wcpOAV33HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV33HisProFec2"), 0) ;
      wcpOAV34OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28Emprcod, wcpOAV28Emprcod) != 0 ) || ( AV29HisEstReo != wcpOAV29HisEstReo ) || ( GXutil.strcmp(AV30MaqCod1, wcpOAV30MaqCod1) != 0 ) || ( GXutil.strcmp(AV31MaqCod2, wcpOAV31MaqCod2) != 0 ) || !( GXutil.dateCompare(AV32HisProFec1, wcpOAV32HisProFec1) ) || !( GXutil.dateCompare(AV33HisProFec2, wcpOAV33HisProFec2) ) || ( AV34OperarioFrom != wcpOAV34OperarioFrom ) || ( AV35OperarioTo != wcpOAV35OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV28Emprcod = AV28Emprcod ;
      wcpOAV29HisEstReo = AV29HisEstReo ;
      wcpOAV30MaqCod1 = AV30MaqCod1 ;
      wcpOAV31MaqCod2 = AV31MaqCod2 ;
      wcpOAV32HisProFec1 = AV32HisProFec1 ;
      wcpOAV33HisProFec2 = AV33HisProFec2 ;
      wcpOAV34OperarioFrom = AV34OperarioFrom ;
      wcpOAV35OperarioTo = AV35OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28Emprcod) > 0 )
      {
         AV28Emprcod = httpContext.cgiGet( sCtrlAV28Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Emprcod", AV28Emprcod);
      }
      else
      {
         AV28Emprcod = httpContext.cgiGet( sPrefix+"AV28Emprcod_PARM") ;
      }
      sCtrlAV29HisEstReo = httpContext.cgiGet( sPrefix+"AV29HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV29HisEstReo) > 0 )
      {
         AV29HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisEstReo", GXutil.str( AV29HisEstReo, 1, 0));
      }
      else
      {
         AV29HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30MaqCod1 = httpContext.cgiGet( sPrefix+"AV30MaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV30MaqCod1) > 0 )
      {
         AV30MaqCod1 = httpContext.cgiGet( sCtrlAV30MaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30MaqCod1", AV30MaqCod1);
      }
      else
      {
         AV30MaqCod1 = httpContext.cgiGet( sPrefix+"AV30MaqCod1_PARM") ;
      }
      sCtrlAV31MaqCod2 = httpContext.cgiGet( sPrefix+"AV31MaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV31MaqCod2) > 0 )
      {
         AV31MaqCod2 = httpContext.cgiGet( sCtrlAV31MaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31MaqCod2", AV31MaqCod2);
      }
      else
      {
         AV31MaqCod2 = httpContext.cgiGet( sPrefix+"AV31MaqCod2_PARM") ;
      }
      sCtrlAV32HisProFec1 = httpContext.cgiGet( sPrefix+"AV32HisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV32HisProFec1) > 0 )
      {
         AV32HisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV32HisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32HisProFec1", localUtil.ttoc( AV32HisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV32HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV32HisProFec1_PARM"), 0) ;
      }
      sCtrlAV33HisProFec2 = httpContext.cgiGet( sPrefix+"AV33HisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV33HisProFec2) > 0 )
      {
         AV33HisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV33HisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33HisProFec2", localUtil.ttoc( AV33HisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV33HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV33HisProFec2_PARM"), 0) ;
      }
      sCtrlAV34OperarioFrom = httpContext.cgiGet( sPrefix+"AV34OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV34OperarioFrom) > 0 )
      {
         AV34OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV34OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
      }
      else
      {
         AV34OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV34OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV35OperarioTo = httpContext.cgiGet( sPrefix+"AV35OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV35OperarioTo) > 0 )
      {
         AV35OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV35OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
      }
      else
      {
         AV35OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV35OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa2D82( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2D82( ) ;
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
      ws2D82( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_PARM", GXutil.rtrim( AV28Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Emprcod_CTRL", GXutil.rtrim( sCtrlAV28Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV29HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HisEstReo_CTRL", GXutil.rtrim( sCtrlAV29HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30MaqCod1_PARM", GXutil.rtrim( AV30MaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30MaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30MaqCod1_CTRL", GXutil.rtrim( sCtrlAV30MaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31MaqCod2_PARM", GXutil.rtrim( AV31MaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31MaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31MaqCod2_CTRL", GXutil.rtrim( sCtrlAV31MaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32HisProFec1_PARM", localUtil.ttoc( AV32HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32HisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32HisProFec1_CTRL", GXutil.rtrim( sCtrlAV32HisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33HisProFec2_PARM", localUtil.ttoc( AV33HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33HisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33HisProFec2_CTRL", GXutil.rtrim( sCtrlAV33HisProFec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV34OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV34OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV35OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35OperarioTo_CTRL", GXutil.rtrim( sCtrlAV35OperarioTo));
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
      we2D82( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115545275", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenturno__wc.js", "?202682115545275", false, true);
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

   public void subsflControlProps_392( )
   {
      edtavInformeproduccionresumenturno_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD_"+sGXsfl_39_idx ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC_"+sGXsfl_39_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1_"+sGXsfl_39_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2_"+sGXsfl_39_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3_"+sGXsfl_39_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      edtavInformeproduccionresumenturno_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD_"+sGXsfl_39_fel_idx ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC_"+sGXsfl_39_fel_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1_"+sGXsfl_39_fel_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2_"+sGXsfl_39_fel_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3_"+sGXsfl_39_fel_idx ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2D80( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_39_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__maqcod_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__maqcod_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__maqdsc_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos1_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__kilos1_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumenturno_sdt__kilos1_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1(), "ZZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos1(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__kilos1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos1_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__kilos2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumenturno_sdt__kilos2_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2(), "ZZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos2(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__kilos2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos2_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos3_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__kilos3_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumenturno_sdt__kilos3_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3(), "ZZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos3(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__kilos3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos3_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos4_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumenturno_sdt__kilos4_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumenturno_sdt__kilos4_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4(), "ZZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem)AV13InformeProduccionResumenTurno_SDT.elementAt(-1+AV53GXV1)).getgxTv_SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem_Kilos4(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumenturno_sdt__kilos4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos4_Visible),Integer.valueOf(edtavInformeproduccionresumenturno_sdt__kilos4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2D82( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_39_idx = ((subGrid_Islastpage==1)&&(nGXsfl_39_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"39\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos1_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos 1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos 2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos3_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos 3", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumenturno_sdt__kilos4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos 4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos1_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos3_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumenturno_sdt__kilos4_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD" ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC" ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1" ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2" ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3" ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4" ;
      edtavTotvalue_kilos1_Internalname = sPrefix+"vTOTVALUE_KILOS1" ;
      edtavTotvalue_kilos2_Internalname = sPrefix+"vTOTVALUE_KILOS2" ;
      edtavTotvalue_kilos3_Internalname = sPrefix+"vTOTVALUE_KILOS3" ;
      edtavTotvalue_kilos4_Internalname = sPrefix+"vTOTVALUE_KILOS4" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
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
      edtavInformeproduccionresumenturno_sdt__kilos4_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Jsonclick = "" ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_kilos4_Jsonclick = "" ;
      edtavTotvalue_kilos4_Enabled = 1 ;
      edtavTotvalue_kilos3_Jsonclick = "" ;
      edtavTotvalue_kilos3_Enabled = 1 ;
      edtavTotvalue_kilos2_Jsonclick = "" ;
      edtavTotvalue_kilos2_Enabled = 1 ;
      edtavTotvalue_kilos1_Jsonclick = "" ;
      edtavTotvalue_kilos1_Enabled = 1 ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Visible = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Enabled = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Enabled = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Enabled = -1 ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Enabled = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled = -1 ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "|||||" ;
      Ddo_grid_Columnids = "0:InformeProduccionResumenTurno_SDT__Maqcod|1:InformeProduccionResumenTurno_SDT__MaqDsc|2:InformeProduccionResumenTurno_SDT__Kilos1|3:InformeProduccionResumenTurno_SDT__Kilos2|4:InformeProduccionResumenTurno_SDT__Kilos3|5:InformeProduccionResumenTurno_SDT__Kilos4" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV31MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV32HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV50moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13InformeProduccionResumenTurno_SDT',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV43TotValue_Kilos1',fld:'vTOTVALUE_KILOS1',pic:''},{av:'AV45TotValue_Kilos2',fld:'vTOTVALUE_KILOS2',pic:''},{av:'AV47TotValue_Kilos3',fld:'vTOTVALUE_KILOS3',pic:''},{av:'AV49TotValue_Kilos4',fld:'vTOTVALUE_KILOS4',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122D82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV31MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV32HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV50moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13InformeProduccionResumenTurno_SDT',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132D82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV31MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV32HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV50moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13InformeProduccionResumenTurno_SDT',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182D82',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142D82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV31MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV32HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV50moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13InformeProduccionResumenTurno_SDT',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV43TotValue_Kilos1',fld:'vTOTVALUE_KILOS1',pic:''},{av:'AV45TotValue_Kilos2',fld:'vTOTVALUE_KILOS2',pic:''},{av:'AV47TotValue_Kilos3',fld:'vTOTVALUE_KILOS3',pic:''},{av:'AV49TotValue_Kilos4',fld:'vTOTVALUE_KILOS4',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112D82',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV60Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV30MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV31MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV32HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV50moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV13InformeProduccionResumenTurno_SDT',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDT',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRID',prop:'GridRC',grid:39},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS1',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS3',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMENTURNO_SDT__KILOS4',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV42Tot_Kilos1',fld:'vTOT_KILOS1',pic:'ZZZZZZ9.99',hsh:true},{av:'AV44Tot_Kilos2',fld:'vTOT_KILOS2',pic:'ZZZZZZ9.99',hsh:true},{av:'AV46Tot_Kilos3',fld:'vTOT_KILOS3',pic:'ZZZZZZ9.99',hsh:true},{av:'AV48Tot_Kilos4',fld:'vTOT_KILOS4',pic:'ZZZZZZ9.99',hsh:true},{av:'AV43TotValue_Kilos1',fld:'vTOTVALUE_KILOS1',pic:''},{av:'AV45TotValue_Kilos2',fld:'vTOTVALUE_KILOS2',pic:''},{av:'AV47TotValue_Kilos3',fld:'vTOTVALUE_KILOS3',pic:''},{av:'AV49TotValue_Kilos4',fld:'vTOTVALUE_KILOS4',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e152D82',iparms:[{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e192D82',iparms:[{av:'AV36InformeProduccionResumenTurno_SDTjson',fld:'vINFORMEPRODUCCIONRESUMENTURNO_SDTJSON',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv7',iparms:[]");
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
      wcpOAV28Emprcod = "" ;
      wcpOAV30MaqCod1 = "" ;
      wcpOAV31MaqCod2 = "" ;
      wcpOAV32HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV33HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28Emprcod = "" ;
      AV30MaqCod1 = "" ;
      AV31MaqCod2 = "" ;
      AV32HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV33HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV60Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13InformeProduccionResumenTurno_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem>(app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem.class, "InformeProduccionResumenTurno_SDTItem", "TexplusNET", remoteHandle);
      AV42Tot_Kilos1 = DecimalUtil.ZERO ;
      AV44Tot_Kilos2 = DecimalUtil.ZERO ;
      AV46Tot_Kilos3 = DecimalUtil.ZERO ;
      AV48Tot_Kilos4 = DecimalUtil.ZERO ;
      AV36InformeProduccionResumenTurno_SDTjson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV21ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV43TotValue_Kilos1 = "" ;
      AV45TotValue_Kilos2 = "" ;
      AV47TotValue_Kilos3 = "" ;
      AV49TotValue_Kilos4 = "" ;
      hsh = "" ;
      AV37Station = "" ;
      GXv_char2 = new String[1] ;
      AV38EmprNom = "" ;
      AV39UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV40WebSession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV41InformeProduccionResumenTurno_SDTItem = new app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28Emprcod = "" ;
      sCtrlAV29HisEstReo = "" ;
      sCtrlAV30MaqCod1 = "" ;
      sCtrlAV31MaqCod2 = "" ;
      sCtrlAV32HisProFec1 = "" ;
      sCtrlAV33HisProFec2 = "" ;
      sCtrlAV34OperarioFrom = "" ;
      sCtrlAV35OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV60Pgmname = "Produccion.InformeProduccionResumenTurno__WC" ;
      /* GeneXus formulas. */
      AV60Pgmname = "Produccion.InformeProduccionResumenTurno__WC" ;
      Gx_err = (short)(0) ;
      edtavInformeproduccionresumenturno_sdt__maqcod_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos1_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos2_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos3_Enabled = 0 ;
      edtavInformeproduccionresumenturno_sdt__kilos4_Enabled = 0 ;
      edtavTotvalue_kilos1_Enabled = 0 ;
      edtavTotvalue_kilos2_Enabled = 0 ;
      edtavTotvalue_kilos3_Enabled = 0 ;
      edtavTotvalue_kilos4_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV29HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29HisEstReo ;
   private byte AV23ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV50moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV34OperarioFrom ;
   private int wcpOAV35OperarioTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int AV34OperarioFrom ;
   private int AV35OperarioTo ;
   private int nGXsfl_39_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV53GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavInformeproduccionresumenturno_sdt__maqcod_Enabled ;
   private int edtavInformeproduccionresumenturno_sdt__maqdsc_Enabled ;
   private int edtavInformeproduccionresumenturno_sdt__kilos1_Enabled ;
   private int edtavInformeproduccionresumenturno_sdt__kilos2_Enabled ;
   private int edtavInformeproduccionresumenturno_sdt__kilos3_Enabled ;
   private int edtavInformeproduccionresumenturno_sdt__kilos4_Enabled ;
   private int edtavTotvalue_kilos1_Enabled ;
   private int edtavTotvalue_kilos2_Enabled ;
   private int edtavTotvalue_kilos3_Enabled ;
   private int edtavTotvalue_kilos4_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_39_fel_idx=1 ;
   private int edtavInformeproduccionresumenturno_sdt__maqcod_Visible ;
   private int edtavInformeproduccionresumenturno_sdt__maqdsc_Visible ;
   private int edtavInformeproduccionresumenturno_sdt__kilos1_Visible ;
   private int edtavInformeproduccionresumenturno_sdt__kilos2_Visible ;
   private int edtavInformeproduccionresumenturno_sdt__kilos3_Visible ;
   private int edtavInformeproduccionresumenturno_sdt__kilos4_Visible ;
   private int AV25PageToGo ;
   private int AV61GXV8 ;
   private int AV62GXV9 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV42Tot_Kilos1 ;
   private java.math.BigDecimal AV44Tot_Kilos2 ;
   private java.math.BigDecimal AV46Tot_Kilos3 ;
   private java.math.BigDecimal AV48Tot_Kilos4 ;
   private String wcpOAV28Emprcod ;
   private String wcpOAV30MaqCod1 ;
   private String wcpOAV31MaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28Emprcod ;
   private String AV30MaqCod1 ;
   private String AV31MaqCod2 ;
   private String sGXsfl_39_idx="0001" ;
   private String AV60Pgmname ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
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
   private String edtavInformeproduccionresumenturno_sdt__maqcod_Internalname ;
   private String edtavInformeproduccionresumenturno_sdt__maqdsc_Internalname ;
   private String edtavInformeproduccionresumenturno_sdt__kilos1_Internalname ;
   private String edtavInformeproduccionresumenturno_sdt__kilos2_Internalname ;
   private String edtavInformeproduccionresumenturno_sdt__kilos3_Internalname ;
   private String edtavInformeproduccionresumenturno_sdt__kilos4_Internalname ;
   private String edtavTotvalue_kilos1_Internalname ;
   private String edtavTotvalue_kilos2_Internalname ;
   private String edtavTotvalue_kilos3_Internalname ;
   private String edtavTotvalue_kilos4_Internalname ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String hsh ;
   private String AV37Station ;
   private String GXv_char2[] ;
   private String AV38EmprNom ;
   private String AV39UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_kilos1_Jsonclick ;
   private String edtavTotvalue_kilos2_Jsonclick ;
   private String edtavTotvalue_kilos3_Jsonclick ;
   private String edtavTotvalue_kilos4_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV28Emprcod ;
   private String sCtrlAV29HisEstReo ;
   private String sCtrlAV30MaqCod1 ;
   private String sCtrlAV31MaqCod2 ;
   private String sCtrlAV32HisProFec1 ;
   private String sCtrlAV33HisProFec2 ;
   private String sCtrlAV34OperarioFrom ;
   private String sCtrlAV35OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavInformeproduccionresumenturno_sdt__maqcod_Jsonclick ;
   private String edtavInformeproduccionresumenturno_sdt__maqdsc_Jsonclick ;
   private String edtavInformeproduccionresumenturno_sdt__kilos1_Jsonclick ;
   private String edtavInformeproduccionresumenturno_sdt__kilos2_Jsonclick ;
   private String edtavInformeproduccionresumenturno_sdt__kilos3_Jsonclick ;
   private String edtavInformeproduccionresumenturno_sdt__kilos4_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV32HisProFec1 ;
   private java.util.Date wcpOAV33HisProFec2 ;
   private java.util.Date AV32HisProFec1 ;
   private java.util.Date AV33HisProFec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV39 ;
   private boolean gx_refresh_fired ;
   private String AV36InformeProduccionResumenTurno_SDTjson ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV43TotValue_Kilos1 ;
   private String AV45TotValue_Kilos2 ;
   private String AV47TotValue_Kilos3 ;
   private String AV49TotValue_Kilos4 ;
   private String AV14ExcelFilename ;
   private String AV15ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV40WebSession ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem> AV13InformeProduccionResumenTurno_SDT ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.produccion.SdtInformeProduccionResumenTurno_SDT_InformeProduccionResumenTurno_SDTItem AV41InformeProduccionResumenTurno_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

