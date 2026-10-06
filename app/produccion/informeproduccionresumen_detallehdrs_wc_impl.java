package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumen_detallehdrs_wc_impl extends GXWebComponent
{
   public informeproduccionresumen_detallehdrs_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumen_detallehdrs_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumen_detallehdrs_wc_impl.class ));
   }

   public informeproduccionresumen_detallehdrs_wc_impl( int remoteHandle ,
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
            gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
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
               AV28INEmprcod = httpContext.GetPar( "INEmprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28INEmprcod", AV28INEmprcod);
               AV29INHisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "INHisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29INHisEstReo", GXutil.str( AV29INHisEstReo, 1, 0));
               AV30INMaqCod1 = httpContext.GetPar( "INMaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30INMaqCod1", AV30INMaqCod1);
               AV31INMaqCod2 = httpContext.GetPar( "INMaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31INMaqCod2", AV31INMaqCod2);
               AV32INHisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32INHisProFec1", localUtil.ttoc( AV32INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV33INHisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33INHisProFec2", localUtil.ttoc( AV33INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV34OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
               AV35OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV28INEmprcod,Byte.valueOf(AV29INHisEstReo),AV30INMaqCod1,AV31INMaqCod2,AV32INHisProFec1,AV33INHisProFec2,Integer.valueOf(AV34OperarioFrom),Integer.valueOf(AV35OperarioTo)});
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
               gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "INEmprcod") ;
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
      nRC_GXsfl_54 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_54"))) ;
      nGXsfl_54_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_54_idx"))) ;
      sGXsfl_54_idx = httpContext.GetPar( "sGXsfl_54_idx") ;
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
      AV90Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV28INEmprcod = httpContext.GetPar( "INEmprcod") ;
      AV29INHisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "INHisEstReo"))) ;
      AV30INMaqCod1 = httpContext.GetPar( "INMaqCod1") ;
      AV31INMaqCod2 = httpContext.GetPar( "INMaqCod2") ;
      AV32INHisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec1")) ;
      AV33INHisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "INHisProFec2")) ;
      AV34OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV35OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13InformeProduccionResumen_DetalleHdrs_SDT);
      AV43Tot_HisProkgr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HisProkgr"), ".") ;
      AV45Tot_Hispromtr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_Hispromtr"), ".") ;
      AV47Tot_Hispronpzs = GXutil.lval( httpContext.GetPar( "Tot_Hispronpzs")) ;
      AV49Tot_Minutos = GXutil.lval( httpContext.GetPar( "Tot_Minutos")) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2DA2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen (Detalle Hdrs)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumen_detallehdrs_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28INEmprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV29INHisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV30INMaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV31INMaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32INHisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV33INHisProFec2)),GXutil.URLEncode(GXutil.ltrimstr(AV34OperarioFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35OperarioTo,6,0))}, new String[] {"INEmprcod","INHisEstReo","INMaqCod1","INMaqCod2","INHisProFec1","INHisProFec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumen_DetalleHdrs_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPRONPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_MINUTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumen_DetalleHdrs_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumen_detallehdrs_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Informeproduccionresumen_detallehdrs_sdt", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Informeproduccionresumen_detallehdrs_sdt", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Informeproduccionresumen_detallehdrs_sdt", getSecureSignedToken( sPrefix, AV13InformeProduccionResumen_DetalleHdrs_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_54", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_54, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28INEmprcod", GXutil.rtrim( wcpOAV28INEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29INHisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV29INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30INMaqCod1", GXutil.rtrim( wcpOAV30INMaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31INMaqCod2", GXutil.rtrim( wcpOAV31INMaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV32INHisProFec1", localUtil.ttoc( wcpOAV32INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33INHisProFec2", localUtil.ttoc( wcpOAV33INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV34OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV35OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV23ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINEMPRCOD", GXutil.rtrim( AV28INEmprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISESTREO", GXutil.ltrim( localUtil.ntoc( AV29INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINMAQCOD1", GXutil.rtrim( AV30INMaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINMAQCOD2", GXutil.rtrim( AV31INMaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISPROFEC1", localUtil.ttoc( AV32INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINHISPROFEC2", localUtil.ttoc( AV33INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV34OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV35OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumen_DetalleHdrs_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV43Tot_HisProkgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV45Tot_Hispromtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV47Tot_Hispronpzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPRONPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_MINUTOS", GXutil.ltrim( localUtil.ntoc( AV49Tot_Minutos, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_MINUTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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

   public void renderHtmlCloseForm2DA2( )
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
      return "Produccion.InformeProduccionResumen_DetalleHdrs_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen (Detalle Hdrs)", "") ;
   }

   public void wb2DA0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumen_detallehdrs_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 54, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_2DA2( true) ;
      }
      else
      {
         wb_table1_23_2DA2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_2DA2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableregistros_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockregistros_Internalname, httpContext.getMessage( "Registros", ""), "", "", lblTextblockregistros_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRegistros_Internalname, httpContext.getMessage( "Registros", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRegistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV41Registros, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRegistros_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41Registros), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41Registros), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRegistros_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRegistros_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
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
         startgridcontrol54( ) ;
      }
      if ( wbEnd == 54 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_54 = (int)(nGXsfl_54_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV54GXV1 = nGXsfl_54_idx ;
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
         wb_table2_92_2DA2( true) ;
      }
      else
      {
         wb_table2_92_2DA2( false) ;
      }
      return  ;
   }

   public void wb_table2_92_2DA2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV90Pgmname), GXutil.rtrim( localUtil.format( AV90Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
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
      if ( wbEnd == 54 )
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
               AV54GXV1 = nGXsfl_54_idx ;
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

   public void start2DA2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen (Detalle Hdrs)", ""), (short)(0)) ;
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
            strup2DA0( ) ;
         }
      }
   }

   public void ws2DA2( )
   {
      start2DA2( ) ;
      evt2DA2( ) ;
   }

   public void evt2DA2( )
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
                              strup2DA0( ) ;
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
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e132DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e142DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e152DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e162DA2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2DA0( ) ;
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
                              strup2DA0( ) ;
                           }
                           nGXsfl_54_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_542( ) ;
                           AV54GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV13InformeProduccionResumen_DetalleHdrs_SDT.size() >= AV54GXV1 ) && ( AV54GXV1 > 0 ) )
                           {
                              AV13InformeProduccionResumen_DetalleHdrs_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)) );
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
                                       e172DA2 ();
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
                                       e182DA2 ();
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
                                       e192DA2 ();
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
                                    strup2DA0( ) ;
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

   public void we2DA2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2DA2( ) ;
         }
      }
   }

   public void pa2DA2( )
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
      subsflControlProps_542( ) ;
      while ( nGXsfl_54_idx <= nRC_GXsfl_54 )
      {
         sendrow_542( ) ;
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV23ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ,
                                 String AV90Pgmname ,
                                 String AV12FilterFullText ,
                                 String AV28INEmprcod ,
                                 byte AV29INHisEstReo ,
                                 String AV30INMaqCod1 ,
                                 String AV31INMaqCod2 ,
                                 java.util.Date AV32INHisProFec1 ,
                                 java.util.Date AV33INHisProFec2 ,
                                 int AV34OperarioFrom ,
                                 int AV35OperarioTo ,
                                 GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> AV13InformeProduccionResumen_DetalleHdrs_SDT ,
                                 java.math.BigDecimal AV43Tot_HisProkgr ,
                                 java.math.BigDecimal AV45Tot_Hispromtr ,
                                 long AV47Tot_Hispronpzs ,
                                 long AV49Tot_Minutos ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e182DA2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DA2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumen_DetalleHdrs_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\informeproduccionresumen_detallehdrs_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf2DA2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV90Pgmname = "Produccion.InformeProduccionResumen_DetalleHdrs_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavRegistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRegistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRegistros_Enabled), 5, 0), true);
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
      edtavTotvalue_hispronpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispronpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispronpzs_Enabled), 5, 0), true);
      edtavTotvalue_minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_minutos_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DA2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(54) ;
      /* Execute user event: Refresh */
      e182DA2 ();
      nGXsfl_54_idx = 1 ;
      sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_542( ) ;
      bGXsfl_54_Refreshing = true ;
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
         subsflControlProps_542( ) ;
         e192DA2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_54_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e192DA2 ();
         }
         wbEnd = (short)(54) ;
         wb2DA0( ) ;
      }
      bGXsfl_54_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DA2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", AV13InformeProduccionResumen_DetalleHdrs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT", getSecureSignedToken( sPrefix, AV13InformeProduccionResumen_DetalleHdrs_SDT));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV43Tot_HisProkgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV45Tot_Hispromtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPRONPZS", GXutil.ltrim( localUtil.ntoc( AV47Tot_Hispronpzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPRONPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_MINUTOS", GXutil.ltrim( localUtil.ntoc( AV49Tot_Minutos, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_MINUTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9")));
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
      return AV13InformeProduccionResumen_DetalleHdrs_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV23ManageFiltersExecutionStep, AV18ColumnsSelector, AV90Pgmname, AV12FilterFullText, AV28INEmprcod, AV29INHisEstReo, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV13InformeProduccionResumen_DetalleHdrs_SDT, AV43Tot_HisProkgr, AV45Tot_Hispromtr, AV47Tot_Hispronpzs, AV49Tot_Minutos, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV90Pgmname = "Produccion.InformeProduccionResumen_DetalleHdrs_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavRegistros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRegistros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRegistros_Enabled), 5, 0), true);
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled), 5, 0), !bGXsfl_54_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
      edtavTotvalue_hispronpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispronpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispronpzs_Enabled), 5, 0), true);
      edtavTotvalue_minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_minutos_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DA0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e172DA2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Informeproduccionresumen_detallehdrs_sdt"), AV13InformeProduccionResumen_DetalleHdrs_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV21ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV18ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT"), AV13InformeProduccionResumen_DetalleHdrs_SDT);
         /* Read saved values. */
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV27GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV28INEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV28INEmprcod") ;
         wcpOAV29INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29INHisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30INMaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV30INMaqCod1") ;
         wcpOAV31INMaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV31INMaqCod2") ;
         wcpOAV32INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32INHisProFec1"), 0) ;
         wcpOAV33INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV33INHisProFec2"), 0) ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         nRC_GXsfl_54 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_54"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_54_fel_idx = 0 ;
         while ( nGXsfl_54_fel_idx < nRC_GXsfl_54 )
         {
            nGXsfl_54_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_fel_idx+1) ;
            sGXsfl_54_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_542( ) ;
            AV54GXV1 = (int)(nGXsfl_54_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV13InformeProduccionResumen_DetalleHdrs_SDT.size() >= AV54GXV1 ) && ( AV54GXV1 > 0 ) )
            {
               AV13InformeProduccionResumen_DetalleHdrs_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)) );
            }
         }
         if ( nGXsfl_54_fel_idx == 0 )
         {
            nGXsfl_54_idx = 1 ;
            sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_542( ) ;
         }
         nGXsfl_54_fel_idx = 1 ;
         /* Read variables values. */
         AV12FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRegistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRegistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREGISTROS");
            GX_FocusControl = edtavRegistros_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41Registros = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Registros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Registros), 4, 0));
         }
         else
         {
            AV41Registros = (short)(localUtil.ctol( httpContext.cgiGet( edtavRegistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Registros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Registros), 4, 0));
         }
         AV44TotValue_HisProkgr = httpContext.cgiGet( edtavTotvalue_hisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValue_HisProkgr", AV44TotValue_HisProkgr);
         AV46TotValue_Hispromtr = httpContext.cgiGet( edtavTotvalue_hispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_Hispromtr", AV46TotValue_Hispromtr);
         AV48TotValue_Hispronpzs = httpContext.cgiGet( edtavTotvalue_hispronpzs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_Hispronpzs", AV48TotValue_Hispronpzs);
         AV50TotValue_Minutos = httpContext.cgiGet( edtavTotvalue_minutos_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Minutos", AV50TotValue_Minutos);
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"InformeProduccionResumen_DetalleHdrs_WC");
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Pgmname", AV90Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV90Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\informeproduccionresumen_detallehdrs_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e172DA2 ();
      if (returnInSub) return;
   }

   public void e172DA2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumen_detallehdrs_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      GXv_char2[0] = AV36Emprcod ;
      GXv_char3[0] = AV37EmprNom ;
      GXv_char4[0] = AV38UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumen_detallehdrs_wc_impl.this.AV36Emprcod = GXv_char2[0] ;
      informeproduccionresumen_detallehdrs_wc_impl.this.AV37EmprNom = GXv_char3[0] ;
      informeproduccionresumen_detallehdrs_wc_impl.this.AV38UsurCod = GXv_char4[0] ;
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
      GXt_int7 = (byte)(AV40Grulec) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV36Emprcod, httpContext.getMessage( "GRUHDR", ""), GXv_int8) ;
      informeproduccionresumen_detallehdrs_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV40Grulec = GXt_int7 ;
      GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 = AV13InformeProduccionResumen_DetalleHdrs_SDT ;
      GXv_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem10[0] = GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 ;
      new app.produccion.informeproduccionresumen_detallehdrs_dp(remoteHandle, context).execute( AV28INEmprcod, AV30INMaqCod1, AV31INMaqCod2, AV32INHisProFec1, AV33INHisProFec2, AV34OperarioFrom, AV35OperarioTo, AV29INHisEstReo, AV40Grulec, GXv_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem10) ;
      GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 = GXv_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem10[0] ;
      AV13InformeProduccionResumen_DetalleHdrs_SDT = GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 ;
      gx_BV54 = true ;
      AV41Registros = (short)(AV13InformeProduccionResumen_DetalleHdrs_SDT.size()) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Registros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Registros), 4, 0));
   }

   public void e182DA2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
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
      if ( GXutil.strcmp(AV20Session.getValue("Produccion.InformeProduccionResumen_DetalleHdrs_WCColumnsSelector"), "") != 0 )
      {
         AV16ColumnsSelectorXML = AV20Session.getValue("Produccion.InformeProduccionResumen_DetalleHdrs_WCColumnsSelector") ;
         AV18ColumnsSelector.fromxml(AV16ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+28)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+29)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+30)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+31)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+32)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible), 5, 0), !bGXsfl_54_Refreshing);
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV18ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+33)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible), 5, 0), !bGXsfl_54_Refreshing);
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

   public void e122DA2( )
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

   public void e132DA2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e192DA2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV54GXV1 = 1 ;
      while ( AV54GXV1 <= AV13InformeProduccionResumen_DetalleHdrs_SDT.size() )
      {
         AV13InformeProduccionResumen_DetalleHdrs_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(54) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_542( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_54_Refreshing )
         {
            httpContext.doAjaxLoad(54, GridRow);
         }
         AV54GXV1 = (int)(AV54GXV1+1) ;
      }
   }

   public void e142DA2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV16ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV18ColumnsSelector.fromJSonString(AV16ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Produccion.InformeProduccionResumen_DetalleHdrs_WCColumnsSelector", ((GXutil.strcmp("", AV16ColumnsSelectorXML)==0) ? "" : AV18ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV18ColumnsSelector", AV18ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV21ManageFiltersData", AV21ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e112DA2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.InformeProduccionResumen_DetalleHdrs_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV90Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Produccion.InformeProduccionResumen_DetalleHdrs_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV23ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23ManageFiltersExecutionStep", GXutil.str( AV23ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV22ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Produccion.InformeProduccionResumen_DetalleHdrs_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         informeproduccionresumen_detallehdrs_wc_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV22ManageFiltersXml) ;
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

   public void e152DA2( )
   {
      AV54GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV54GXV1 > 0 ) && ( AV13InformeProduccionResumen_DetalleHdrs_SDT.size() >= AV54GXV1 ) )
      {
         AV13InformeProduccionResumen_DetalleHdrs_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV51Websession.setValue(httpContext.getMessage( "InformeProduccionResumen_DetalleHdrs", ""), AV13InformeProduccionResumen_DetalleHdrs_SDT.toJSonString(false));
      GXv_char4[0] = AV14ExcelFilename ;
      GXv_char3[0] = AV15ErrorMessage ;
      new app.produccion.informeproduccionresumen_detallehdrs_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      informeproduccionresumen_detallehdrs_wc_impl.this.AV14ExcelFilename = GXv_char4[0] ;
      informeproduccionresumen_detallehdrs_wc_impl.this.AV15ErrorMessage = GXv_char3[0] ;
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

   public void e162DA2( )
   {
      AV54GXV1 = (int)(nGXsfl_54_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV54GXV1 > 0 ) && ( AV13InformeProduccionResumen_DetalleHdrs_SDT.size() >= AV54GXV1 ) )
      {
         AV13InformeProduccionResumen_DetalleHdrs_SDT.currentItem( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV51Websession.setValue(httpContext.getMessage( "InformeProduccionResumen_DetalleHdrs", ""), AV13InformeProduccionResumen_DetalleHdrs_SDT.toJSonString(false));
      callWebObject(formatLink("app.produccion.informeproduccionresumen_detallehdrs_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
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
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Barnhdr", "", "N Hdr", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Maqcod", "", "Maquina", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__MaqDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hisprofec", "", "Fecha", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__HisProkgr", "", "Kilos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hispromtr", "", "Metros", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hispronpzs", "", "Piezas", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hisprotur", "", "Turno", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hisprof", "", "F?", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hisprodti", "", "Inicio", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Hisprodtf", "", "Fin", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Clicod", "", "Cliente", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Clinom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Barser", "", "Articulo", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__BarSerDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Barcolnom", "", "Color", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__BarcolNum", "", "Numero", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__BarTipcol", "", "TC", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__TipColDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Matcod", "", "Matiz", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__MatDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Gruopecod", "", "Operario", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Openom", "", "Nombre", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Fase", "", "Fase", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__FasDsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Minutos", "", "Minutos", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__HisProtre2", "", "Minutos(tdiff)", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__BarTipArt", "", "Tipo Art.", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__TipArtdsc", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Parcod", "", "Paro", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Parcodnom", "", "Descripcion", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__FlagMarca", "", "Marca", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV18ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "InformeProduccionResumen_DetalleHdrs_SDT__Minutosdec", "", "Minutos (dec)", true, "") ;
      AV18ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV17UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Produccion.InformeProduccionResumen_DetalleHdrs_WCColumnsSelector", GXv_char4) ;
      informeproduccionresumen_detallehdrs_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV17UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV17UserCustomValue)==0) ) )
      {
         AV19ColumnsSelectorAux.fromxml(AV17UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV19ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV18ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV19ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV18ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV21ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Produccion.InformeProduccionResumen_DetalleHdrs_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV21ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
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
      if ( GXutil.strcmp(AV20Session.getValue(AV90Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV90Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV90Pgmname+"GridState"), null, null);
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
      AV91GXV37 = 1 ;
      while ( AV91GXV37 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV91GXV37));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV12FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12FilterFullText", AV12FilterFullText);
         }
         AV91GXV37 = (int)(AV91GXV37+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV90Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV12FilterFullText)==0), (short)(0), AV12FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV28INEmprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INEMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV28INEmprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV29INHisEstReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISESTREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29INHisEstReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV30INMaqCod1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INMAQCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV30INMaqCod1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV31INMaqCod2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INMAQCOD2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV31INMaqCod2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV32INHisProFec1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISPROFEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV32INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV33INHisProFec2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&INHISPROFEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV33INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
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
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV90Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV43Tot_HisProkgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Tot_HisProkgr", GXutil.ltrimstr( AV43Tot_HisProkgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99")));
      AV45Tot_Hispromtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_Hispromtr", GXutil.ltrimstr( AV45Tot_Hispromtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99")));
      AV47Tot_Hispronpzs = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_Hispronpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPRONPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9")));
      AV49Tot_Minutos = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Tot_Minutos), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_MINUTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV92GXV38 = 1 ;
      while ( AV92GXV38 <= AV13InformeProduccionResumen_DetalleHdrs_SDT.size() )
      {
         AV42InformeProduccionResumen_DetalleHdrs_SDTItem = (app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV92GXV38));
         AV43Tot_HisProkgr = AV43Tot_HisProkgr.add((AV42InformeProduccionResumen_DetalleHdrs_SDTItem.getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Tot_HisProkgr", GXutil.ltrimstr( AV43Tot_HisProkgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99")));
         AV45Tot_Hispromtr = AV45Tot_Hispromtr.add((AV42InformeProduccionResumen_DetalleHdrs_SDTItem.getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45Tot_Hispromtr", GXutil.ltrimstr( AV45Tot_Hispromtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99")));
         AV47Tot_Hispronpzs = (long)(AV47Tot_Hispronpzs+(AV42InformeProduccionResumen_DetalleHdrs_SDTItem.getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47Tot_Hispronpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPRONPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9")));
         AV49Tot_Minutos = (long)(AV49Tot_Minutos+(AV42InformeProduccionResumen_DetalleHdrs_SDTItem.getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Tot_Minutos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49Tot_Minutos), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_MINUTOS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9")));
         AV92GXV38 = (int)(AV92GXV38+1) ;
      }
      AV44TotValue_HisProkgr = localUtil.format( AV43Tot_HisProkgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44TotValue_HisProkgr", AV44TotValue_HisProkgr);
      AV46TotValue_Hispromtr = localUtil.format( AV45Tot_Hispromtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TotValue_Hispromtr", AV46TotValue_Hispromtr);
      AV48TotValue_Hispronpzs = localUtil.format( DecimalUtil.doubleToDec(AV47Tot_Hispronpzs), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotValue_Hispronpzs", AV48TotValue_Hispronpzs);
      AV50TotValue_Minutos = localUtil.format( DecimalUtil.doubleToDec(AV49Tot_Minutos), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotValue_Minutos", AV50TotValue_Minutos);
   }

   public void wb_table2_92_2DA2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hisprokgr_Internalname, httpContext.getMessage( "Tot Value_His Prokgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hisprokgr_Internalname, AV44TotValue_HisProkgr, GXutil.rtrim( localUtil.format( AV44TotValue_HisProkgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,102);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hispromtr_Internalname, httpContext.getMessage( "Tot Value_Hispromtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hispromtr_Internalname, AV46TotValue_Hispromtr, GXutil.rtrim( localUtil.format( AV46TotValue_Hispromtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hispronpzs_Internalname, httpContext.getMessage( "Tot Value_Hispronpzs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hispronpzs_Internalname, AV48TotValue_Hispronpzs, GXutil.rtrim( localUtil.format( AV48TotValue_Hispronpzs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,108);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hispronpzs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hispronpzs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_minutos_Internalname, httpContext.getMessage( "Tot Value_Minutos", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_minutos_Internalname, AV50TotValue_Minutos, GXutil.rtrim( localUtil.format( AV50TotValue_Minutos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_minutos_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_minutos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
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
         wb_table2_92_2DA2e( true) ;
      }
      else
      {
         wb_table2_92_2DA2e( false) ;
      }
   }

   public void wb_table1_23_2DA2( boolean wbgen )
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
         wb_table3_28_2DA2( true) ;
      }
      else
      {
         wb_table3_28_2DA2( false) ;
      }
      return  ;
   }

   public void wb_table3_28_2DA2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_2DA2e( true) ;
      }
      else
      {
         wb_table1_23_2DA2e( false) ;
      }
   }

   public void wb_table3_28_2DA2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_54_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV12FilterFullText, GXutil.rtrim( localUtil.format( AV12FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Produccion\\InformeProduccionResumen_DetalleHdrs_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_2DA2e( true) ;
      }
      else
      {
         wb_table3_28_2DA2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28INEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28INEmprcod", AV28INEmprcod);
      AV29INHisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29INHisEstReo", GXutil.str( AV29INHisEstReo, 1, 0));
      AV30INMaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30INMaqCod1", AV30INMaqCod1);
      AV31INMaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31INMaqCod2", AV31INMaqCod2);
      AV32INHisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32INHisProFec1", localUtil.ttoc( AV32INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV33INHisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33INHisProFec2", localUtil.ttoc( AV33INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa2DA2( ) ;
      ws2DA2( ) ;
      we2DA2( ) ;
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
      sCtrlAV28INEmprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV29INHisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV30INMaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV31INMaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV32INHisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV33INHisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV34OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV35OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2DA2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumen_detallehdrs_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2DA2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV28INEmprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28INEmprcod", AV28INEmprcod);
         AV29INHisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29INHisEstReo", GXutil.str( AV29INHisEstReo, 1, 0));
         AV30INMaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30INMaqCod1", AV30INMaqCod1);
         AV31INMaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31INMaqCod2", AV31INMaqCod2);
         AV32INHisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32INHisProFec1", localUtil.ttoc( AV32INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV33INHisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33INHisProFec2", localUtil.ttoc( AV33INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV34OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34OperarioFrom), 6, 0));
         AV35OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35OperarioTo), 6, 0));
      }
      wcpOAV28INEmprcod = httpContext.cgiGet( sPrefix+"wcpOAV28INEmprcod") ;
      wcpOAV29INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV29INHisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30INMaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV30INMaqCod1") ;
      wcpOAV31INMaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV31INMaqCod2") ;
      wcpOAV32INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV32INHisProFec1"), 0) ;
      wcpOAV33INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV33INHisProFec2"), 0) ;
      wcpOAV34OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV34OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV35OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV35OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV28INEmprcod, wcpOAV28INEmprcod) != 0 ) || ( AV29INHisEstReo != wcpOAV29INHisEstReo ) || ( GXutil.strcmp(AV30INMaqCod1, wcpOAV30INMaqCod1) != 0 ) || ( GXutil.strcmp(AV31INMaqCod2, wcpOAV31INMaqCod2) != 0 ) || !( GXutil.dateCompare(AV32INHisProFec1, wcpOAV32INHisProFec1) ) || !( GXutil.dateCompare(AV33INHisProFec2, wcpOAV33INHisProFec2) ) || ( AV34OperarioFrom != wcpOAV34OperarioFrom ) || ( AV35OperarioTo != wcpOAV35OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV28INEmprcod = AV28INEmprcod ;
      wcpOAV29INHisEstReo = AV29INHisEstReo ;
      wcpOAV30INMaqCod1 = AV30INMaqCod1 ;
      wcpOAV31INMaqCod2 = AV31INMaqCod2 ;
      wcpOAV32INHisProFec1 = AV32INHisProFec1 ;
      wcpOAV33INHisProFec2 = AV33INHisProFec2 ;
      wcpOAV34OperarioFrom = AV34OperarioFrom ;
      wcpOAV35OperarioTo = AV35OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV28INEmprcod = httpContext.cgiGet( sPrefix+"AV28INEmprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV28INEmprcod) > 0 )
      {
         AV28INEmprcod = httpContext.cgiGet( sCtrlAV28INEmprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28INEmprcod", AV28INEmprcod);
      }
      else
      {
         AV28INEmprcod = httpContext.cgiGet( sPrefix+"AV28INEmprcod_PARM") ;
      }
      sCtrlAV29INHisEstReo = httpContext.cgiGet( sPrefix+"AV29INHisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV29INHisEstReo) > 0 )
      {
         AV29INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV29INHisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29INHisEstReo", GXutil.str( AV29INHisEstReo, 1, 0));
      }
      else
      {
         AV29INHisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV29INHisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30INMaqCod1 = httpContext.cgiGet( sPrefix+"AV30INMaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV30INMaqCod1) > 0 )
      {
         AV30INMaqCod1 = httpContext.cgiGet( sCtrlAV30INMaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30INMaqCod1", AV30INMaqCod1);
      }
      else
      {
         AV30INMaqCod1 = httpContext.cgiGet( sPrefix+"AV30INMaqCod1_PARM") ;
      }
      sCtrlAV31INMaqCod2 = httpContext.cgiGet( sPrefix+"AV31INMaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV31INMaqCod2) > 0 )
      {
         AV31INMaqCod2 = httpContext.cgiGet( sCtrlAV31INMaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31INMaqCod2", AV31INMaqCod2);
      }
      else
      {
         AV31INMaqCod2 = httpContext.cgiGet( sPrefix+"AV31INMaqCod2_PARM") ;
      }
      sCtrlAV32INHisProFec1 = httpContext.cgiGet( sPrefix+"AV32INHisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV32INHisProFec1) > 0 )
      {
         AV32INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV32INHisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32INHisProFec1", localUtil.ttoc( AV32INHisProFec1, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV32INHisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV32INHisProFec1_PARM"), 0) ;
      }
      sCtrlAV33INHisProFec2 = httpContext.cgiGet( sPrefix+"AV33INHisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV33INHisProFec2) > 0 )
      {
         AV33INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV33INHisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33INHisProFec2", localUtil.ttoc( AV33INHisProFec2, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV33INHisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV33INHisProFec2_PARM"), 0) ;
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
      pa2DA2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2DA2( ) ;
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
      ws2DA2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28INEmprcod_PARM", GXutil.rtrim( AV28INEmprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28INEmprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28INEmprcod_CTRL", GXutil.rtrim( sCtrlAV28INEmprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29INHisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV29INHisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29INHisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29INHisEstReo_CTRL", GXutil.rtrim( sCtrlAV29INHisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30INMaqCod1_PARM", GXutil.rtrim( AV30INMaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30INMaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30INMaqCod1_CTRL", GXutil.rtrim( sCtrlAV30INMaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31INMaqCod2_PARM", GXutil.rtrim( AV31INMaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31INMaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31INMaqCod2_CTRL", GXutil.rtrim( sCtrlAV31INMaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32INHisProFec1_PARM", localUtil.ttoc( AV32INHisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV32INHisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV32INHisProFec1_CTRL", GXutil.rtrim( sCtrlAV32INHisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33INHisProFec2_PARM", localUtil.ttoc( AV33INHisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33INHisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33INHisProFec2_CTRL", GXutil.rtrim( sCtrlAV33INHisProFec2));
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
      we2DA2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551089", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumen_detallehdrs_wc.js", "?202682115551089", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_542( )
   {
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLOT_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLIN_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA_"+sGXsfl_54_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC_"+sGXsfl_54_idx ;
   }

   public void subsflControlProps_fel_542( )
   {
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLOT_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLIN_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA_"+sGXsfl_54_fel_idx ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC_"+sGXsfl_54_fel_idx ;
   }

   public void sendrow_542( )
   {
      subsflControlProps_542( ) ;
      wb2DA0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_54_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_54_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_54_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barnhdr()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname,localUtil.format(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec(), "99/99/99"),localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprofec(), "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprolin()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hispronpzs()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotur()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof()),GXutil.rtrim( localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprof(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname,localUtil.ttoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodti(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname,localUtil.ttoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Clinom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipcoldsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod(), (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod()), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matcod()), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Matdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Gruopecod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Openom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__openom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fase()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutos()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Hisprotre2()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Bartipart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Tipartdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname,GXutil.rtrim( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Parcodnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Flagmarca()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled!=0) ? localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec(), "ZZZZZZ9.99") : localUtil.format( ((app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem)AV13InformeProduccionResumen_DetalleHdrs_SDT.elementAt(-1+AV54GXV1)).getgxTv_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem_Minutosdec(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible),Integer.valueOf(edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(54),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DA2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_54_idx = ((subGrid_Islastpage==1)&&(nGXsfl_54_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_54_idx+1) ;
         sGXsfl_54_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_54_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_542( ) ;
      }
      /* End function sendrow_542 */
   }

   public void startgridcontrol54( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"54\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matiz", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos(tdiff)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Art.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos (dec)", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      lblTextblockregistros_Internalname = sPrefix+"TEXTBLOCKREGISTROS" ;
      edtavRegistros_Internalname = sPrefix+"vREGISTROS" ;
      divUnnamedtableregistros_Internalname = sPrefix+"UNNAMEDTABLEREGISTROS" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLOT" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROLIN" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname = sPrefix+"INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC" ;
      edtavTotvalue_hisprokgr_Internalname = sPrefix+"vTOTVALUE_HISPROKGR" ;
      edtavTotvalue_hispromtr_Internalname = sPrefix+"vTOTVALUE_HISPROMTR" ;
      edtavTotvalue_hispronpzs_Internalname = sPrefix+"vTOTVALUE_HISPRONPZS" ;
      edtavTotvalue_minutos_Internalname = sPrefix+"vTOTVALUE_MINUTOS" ;
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
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Jsonclick = "" ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible = -1 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvalue_minutos_Jsonclick = "" ;
      edtavTotvalue_minutos_Enabled = 1 ;
      edtavTotvalue_hispronpzs_Jsonclick = "" ;
      edtavTotvalue_hispronpzs_Enabled = 1 ;
      edtavTotvalue_hispromtr_Jsonclick = "" ;
      edtavTotvalue_hispromtr_Enabled = 1 ;
      edtavTotvalue_hisprokgr_Jsonclick = "" ;
      edtavTotvalue_hisprokgr_Enabled = 1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled = -1 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavRegistros_Jsonclick = "" ;
      edtavRegistros_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "0:InformeProduccionResumen_DetalleHdrs_SDT__Barnhdr|2:InformeProduccionResumen_DetalleHdrs_SDT__Maqcod|3:InformeProduccionResumen_DetalleHdrs_SDT__MaqDsc|4:InformeProduccionResumen_DetalleHdrs_SDT__Hisprofec|6:InformeProduccionResumen_DetalleHdrs_SDT__HisProkgr|7:InformeProduccionResumen_DetalleHdrs_SDT__Hispromtr|8:InformeProduccionResumen_DetalleHdrs_SDT__Hispronpzs|9:InformeProduccionResumen_DetalleHdrs_SDT__Hisprotur|10:InformeProduccionResumen_DetalleHdrs_SDT__Hisprof|11:InformeProduccionResumen_DetalleHdrs_SDT__Hisprodti|12:InformeProduccionResumen_DetalleHdrs_SDT__Hisprodtf|13:InformeProduccionResumen_DetalleHdrs_SDT__Clicod|14:InformeProduccionResumen_DetalleHdrs_SDT__Clinom|15:InformeProduccionResumen_DetalleHdrs_SDT__Barser|16:InformeProduccionResumen_DetalleHdrs_SDT__BarSerDsc|17:InformeProduccionResumen_DetalleHdrs_SDT__Barcolnom|18:InformeProduccionResumen_DetalleHdrs_SDT__BarcolNum|19:InformeProduccionResumen_DetalleHdrs_SDT__BarTipcol|20:InformeProduccionResumen_DetalleHdrs_SDT__TipColDsc|21:InformeProduccionResumen_DetalleHdrs_SDT__Matcod|22:InformeProduccionResumen_DetalleHdrs_SDT__MatDsc|23:InformeProduccionResumen_DetalleHdrs_SDT__Gruopecod|24:InformeProduccionResumen_DetalleHdrs_SDT__Openom|25:InformeProduccionResumen_DetalleHdrs_SDT__Fase|26:InformeProduccionResumen_DetalleHdrs_SDT__FasDsc|27:InformeProduccionResumen_DetalleHdrs_SDT__Minutos|28:InformeProduccionResumen_DetalleHdrs_SDT__HisProtre2|29:InformeProduccionResumen_DetalleHdrs_SDT__BarTipArt|30:InformeProduccionResumen_DetalleHdrs_SDT__TipArtdsc|31:InformeProduccionResumen_DetalleHdrs_SDT__Parcod|32:InformeProduccionResumen_DetalleHdrs_SDT__Parcodnom|33:InformeProduccionResumen_DetalleHdrs_SDT__FlagMarca|34:InformeProduccionResumen_DetalleHdrs_SDT__Minutosdec" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV29INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV30INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV31INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV32INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'AV44TotValue_HisProkgr',fld:'vTOTVALUE_HISPROKGR',pic:''},{av:'AV46TotValue_Hispromtr',fld:'vTOTVALUE_HISPROMTR',pic:''},{av:'AV48TotValue_Hispronpzs',fld:'vTOTVALUE_HISPRONPZS',pic:''},{av:'AV50TotValue_Minutos',fld:'vTOTVALUE_MINUTOS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122DA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV29INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV30INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV31INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV32INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132DA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV29INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV30INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV31INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV32INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e192DA2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e142DA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV29INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV30INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV31INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV32INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'AV44TotValue_HisProkgr',fld:'vTOTVALUE_HISPROKGR',pic:''},{av:'AV46TotValue_Hispromtr',fld:'vTOTVALUE_HISPROMTR',pic:''},{av:'AV48TotValue_Hispronpzs',fld:'vTOTVALUE_HISPRONPZS',pic:''},{av:'AV50TotValue_Minutos',fld:'vTOTVALUE_MINUTOS',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e112DA2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV90Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28INEmprcod',fld:'vINEMPRCOD',pic:'@!'},{av:'AV29INHisEstReo',fld:'vINHISESTREO',pic:'9'},{av:'AV30INMaqCod1',fld:'vINMAQCOD1',pic:''},{av:'AV31INMaqCod2',fld:'vINMAQCOD2',pic:''},{av:'AV32INHisProFec1',fld:'vINHISPROFEC1',pic:'99/99/99 99:99:99'},{av:'AV33INHisProFec2',fld:'vINHISPROFEC2',pic:'99/99/99 99:99:99'},{av:'AV34OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV35OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV23ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV18ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARNHDR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MAQDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROFEC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROKGR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROMTR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRONPZS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTUR',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTI',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPRODTF',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLICOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__CLINOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSER',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARSERDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARCOLNUM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPCOL',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPCOLDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MATDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__GRUOPECOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__OPENOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASE',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FASDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOS',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__HISPROTRE2',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__BARTIPART',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__TIPARTDSC',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCOD',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__PARCODNOM',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__FLAGMARCA',prop:'Visible'},{ctrl:'INFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT__MINUTOSDEC',prop:'Visible'},{av:'AV26GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV27GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV21ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV43Tot_HisProkgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV45Tot_Hispromtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV47Tot_Hispronpzs',fld:'vTOT_HISPRONPZS',pic:'ZZZ9',hsh:true},{av:'AV49Tot_Minutos',fld:'vTOT_MINUTOS',pic:'ZZZZZ9',hsh:true},{av:'AV44TotValue_HisProkgr',fld:'vTOTVALUE_HISPROKGR',pic:''},{av:'AV46TotValue_Hispromtr',fld:'vTOTVALUE_HISPROMTR',pic:''},{av:'AV48TotValue_Hispronpzs',fld:'vTOTVALUE_HISPRONPZS',pic:''},{av:'AV50TotValue_Minutos',fld:'vTOTVALUE_MINUTOS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e152DA2',iparms:[{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e162DA2',iparms:[{av:'AV13InformeProduccionResumen_DetalleHdrs_SDT',fld:'vINFORMEPRODUCCIONRESUMEN_DETALLEHDRS_SDT',grid:54,pic:'',hsh:true},{av:'nGXsfl_54_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:54},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_54',ctrl:'GRID',prop:'GridRC',grid:54}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV12","{handler:'validv_Gxv12',iparms:[]");
      setEventMetadata("VALIDV_GXV12",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv36',iparms:[]");
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
      wcpOAV28INEmprcod = "" ;
      wcpOAV30INMaqCod1 = "" ;
      wcpOAV31INMaqCod2 = "" ;
      wcpOAV32INHisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV33INHisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV28INEmprcod = "" ;
      AV30INMaqCod1 = "" ;
      AV31INMaqCod2 = "" ;
      AV32INHisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV33INHisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV18ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV90Pgmname = "" ;
      AV12FilterFullText = "" ;
      AV13InformeProduccionResumen_DetalleHdrs_SDT = new GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>(app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem.class, "InformeProduccionResumen_DetalleHdrs_SDTItem", "TexplusNET", remoteHandle);
      AV43Tot_HisProkgr = DecimalUtil.ZERO ;
      AV45Tot_Hispromtr = DecimalUtil.ZERO ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTextblockregistros_Jsonclick = "" ;
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
      AV44TotValue_HisProkgr = "" ;
      AV46TotValue_Hispromtr = "" ;
      AV48TotValue_Hispronpzs = "" ;
      AV50TotValue_Minutos = "" ;
      hsh = "" ;
      AV39Station = "" ;
      AV36Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV37EmprNom = "" ;
      AV38UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 = new GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem>(app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem.class, "InformeProduccionResumen_DetalleHdrs_SDTItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem10 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV20Session = httpContext.getWebSession();
      AV16ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22ManageFiltersXml = "" ;
      AV51Websession = httpContext.getWebSession();
      AV14ExcelFilename = "" ;
      AV15ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV17UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV19ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV42InformeProduccionResumen_DetalleHdrs_SDTItem = new app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV28INEmprcod = "" ;
      sCtrlAV29INHisEstReo = "" ;
      sCtrlAV30INMaqCod1 = "" ;
      sCtrlAV31INMaqCod2 = "" ;
      sCtrlAV32INHisProFec1 = "" ;
      sCtrlAV33INHisProFec2 = "" ;
      sCtrlAV34OperarioFrom = "" ;
      sCtrlAV35OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV90Pgmname = "Produccion.InformeProduccionResumen_DetalleHdrs_WC" ;
      /* GeneXus formulas. */
      AV90Pgmname = "Produccion.InformeProduccionResumen_DetalleHdrs_WC" ;
      Gx_err = (short)(0) ;
      edtavRegistros_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled = 0 ;
      edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled = 0 ;
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      edtavTotvalue_hispromtr_Enabled = 0 ;
      edtavTotvalue_hispronpzs_Enabled = 0 ;
      edtavTotvalue_minutos_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV29INHisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV29INHisEstReo ;
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
   private short wbEnd ;
   private short wbStart ;
   private short AV41Registros ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV40Grulec ;
   private int wcpOAV34OperarioFrom ;
   private int wcpOAV35OperarioTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_54 ;
   private int AV34OperarioFrom ;
   private int AV35OperarioTo ;
   private int nGXsfl_54_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavRegistros_Enabled ;
   private int AV54GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barser_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__openom_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__fase_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Enabled ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Enabled ;
   private int edtavTotvalue_hisprokgr_Enabled ;
   private int edtavTotvalue_hispromtr_Enabled ;
   private int edtavTotvalue_hispronpzs_Enabled ;
   private int edtavTotvalue_minutos_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_54_fel_idx=1 ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barser_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__openom_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__fase_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Visible ;
   private int edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Visible ;
   private int AV25PageToGo ;
   private int AV91GXV37 ;
   private int AV92GXV38 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV47Tot_Hispronpzs ;
   private long AV49Tot_Minutos ;
   private long AV26GridCurrentPage ;
   private long AV27GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV43Tot_HisProkgr ;
   private java.math.BigDecimal AV45Tot_Hispromtr ;
   private String wcpOAV28INEmprcod ;
   private String wcpOAV30INMaqCod1 ;
   private String wcpOAV31INMaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV28INEmprcod ;
   private String AV30INMaqCod1 ;
   private String AV31INMaqCod2 ;
   private String sGXsfl_54_idx="0001" ;
   private String AV90Pgmname ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtableregistros_Internalname ;
   private String lblTextblockregistros_Internalname ;
   private String lblTextblockregistros_Jsonclick ;
   private String edtavRegistros_Internalname ;
   private String edtavRegistros_Jsonclick ;
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
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barser_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__openom_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__fase_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Internalname ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Internalname ;
   private String edtavTotvalue_hisprokgr_Internalname ;
   private String edtavTotvalue_hispromtr_Internalname ;
   private String edtavTotvalue_hispronpzs_Internalname ;
   private String edtavTotvalue_minutos_Internalname ;
   private String sGXsfl_54_fel_idx="0001" ;
   private String hsh ;
   private String AV39Station ;
   private String AV36Emprcod ;
   private String GXv_char2[] ;
   private String AV37EmprNom ;
   private String AV38UsurCod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_hisprokgr_Jsonclick ;
   private String edtavTotvalue_hispromtr_Jsonclick ;
   private String edtavTotvalue_hispronpzs_Jsonclick ;
   private String edtavTotvalue_minutos_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV28INEmprcod ;
   private String sCtrlAV29INHisEstReo ;
   private String sCtrlAV30INMaqCod1 ;
   private String sCtrlAV31INMaqCod2 ;
   private String sCtrlAV32INHisProFec1 ;
   private String sCtrlAV33INHisProFec2 ;
   private String sCtrlAV34OperarioFrom ;
   private String sCtrlAV35OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barnhdr_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprolot_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__maqcod_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__maqdsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprofec_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprolin_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprokgr_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hispromtr_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hispronpzs_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprotur_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprof_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprodti_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprodtf_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__clicod_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__clinom_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barser_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barserdsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barcolnom_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__barcolnum_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__bartipcol_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__tipcoldsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__matcod_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__matdsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__gruopecod_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__openom_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__fase_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__fasdsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__minutos_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__hisprotre2_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__bartipart_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__tipartdsc_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__parcod_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__parcodnom_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__flagmarca_Jsonclick ;
   private String edtavInformeproduccionresumen_detallehdrs_sdt__minutosdec_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV32INHisProFec1 ;
   private java.util.Date wcpOAV33INHisProFec2 ;
   private java.util.Date AV32INHisProFec1 ;
   private java.util.Date AV33INHisProFec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean bGXsfl_54_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV54 ;
   private boolean gx_refresh_fired ;
   private String AV16ColumnsSelectorXML ;
   private String AV22ManageFiltersXml ;
   private String AV17UserCustomValue ;
   private String AV12FilterFullText ;
   private String AV44TotValue_HisProkgr ;
   private String AV46TotValue_Hispromtr ;
   private String AV48TotValue_Hispronpzs ;
   private String AV50TotValue_Minutos ;
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
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexus.webpanels.WebSession AV51Websession ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> AV13InformeProduccionResumen_DetalleHdrs_SDT ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> GXt_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem9 ;
   private GXBaseCollection<app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem> GXv_objcol_SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem10[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV21ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.produccion.SdtInformeProduccionResumen_DetalleHdrs_SDT_InformeProduccionResumen_DetalleHdrs_SDTItem AV42InformeProduccionResumen_DetalleHdrs_SDTItem ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV19ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

