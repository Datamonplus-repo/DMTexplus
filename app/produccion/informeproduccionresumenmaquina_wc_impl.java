package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenmaquina_wc_impl extends GXWebComponent
{
   public informeproduccionresumenmaquina_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenmaquina_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenmaquina_wc_impl.class ));
   }

   public informeproduccionresumenmaquina_wc_impl( int remoteHandle ,
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
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
               AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
               AV26MaqCod1 = httpContext.GetPar( "MaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26MaqCod1", AV26MaqCod1);
               AV27MaqCod2 = httpContext.GetPar( "MaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod2", AV27MaqCod2);
               AV28HisProFec1 = localUtil.parseDateParm( httpContext.GetPar( "HisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProFec1", localUtil.format(AV28HisProFec1, "99/99/99"));
               AV30HoraI = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "HoraI"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HoraI", localUtil.ttoc( AV30HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV29HisProFec2 = localUtil.parseDateParm( httpContext.GetPar( "HisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProFec2", localUtil.format(AV29HisProFec2, "99/99/99"));
               AV31HoraF = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "HoraF"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HoraF", localUtil.ttoc( AV31HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV13EmprCod,Byte.valueOf(AV25HisEstReo),AV26MaqCod1,AV27MaqCod2,AV28HisProFec1,AV30HoraI,AV29HisProFec2,AV31HoraF});
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV26MaqCod1 = httpContext.GetPar( "MaqCod1") ;
      AV27MaqCod2 = httpContext.GetPar( "MaqCod2") ;
      AV28HisProFec1 = localUtil.parseDateParm( httpContext.GetPar( "HisProFec1")) ;
      AV30HoraI = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "HoraI"))) ;
      AV29HisProFec2 = localUtil.parseDateParm( httpContext.GetPar( "HisProFec2")) ;
      AV31HoraF = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "HoraF"))) ;
      AV81Pgmname = httpContext.GetPar( "Pgmname") ;
      AV73TotHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProKgr"), ".") ;
      AV75TotHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProMtr"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      AV35HisProDTI = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTI")) ;
      AV36HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A3612HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
      AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      AV13EmprCod = httpContext.GetPar( "EmprCod") ;
      A606MaqDsc = httpContext.GetPar( "MaqDsc") ;
      n606MaqDsc = false ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV77Col_HisProKgr);
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A3610HisProLot = httpContext.GetPar( "HisProLot") ;
      AV43Grulec = (byte)(GXutil.lval( httpContext.GetPar( "Grulec"))) ;
      AV44FasActTin = httpContext.GetPar( "FasActTin") ;
      A5605HisProTr2 = (short)(GXutil.lval( httpContext.GetPar( "HisProTr2"))) ;
      AV37TTotk = CommonUtil.decimalVal( httpContext.GetPar( "TTotk"), ".") ;
      AV38TTotMt = CommonUtil.decimalVal( httpContext.GetPar( "TTotMt"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YG2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Producción Resumen - Datos por Máquina", "")) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenmaquina_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV26MaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV27MaqCod2)),GXutil.URLEncode(GXutil.formatDateParm(AV28HisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV30HoraI)),GXutil.URLEncode(GXutil.formatDateParm(AV29HisProFec2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31HoraF))}, new String[] {"EmprCod","HisEstReo","MaqCod1","MaqCod2","HisProFec1","HoraI","HisProFec2","HoraF"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV73TotHisProKgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV75TotHisProMtr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOL_HISPROKGR", getSecureSignedToken( sPrefix, AV77Col_HisProKgr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASACTTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV44FasActTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV38TTotMt, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_36, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV19GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV20GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13EmprCod", GXutil.rtrim( wcpOAV13EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26MaqCod1", GXutil.rtrim( wcpOAV26MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27MaqCod2", GXutil.rtrim( wcpOAV27MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28HisProFec1", localUtil.dtoc( wcpOAV28HisProFec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30HoraI", localUtil.ttoc( wcpOAV30HoraI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29HisProFec2", localUtil.dtoc( wcpOAV29HisProFec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31HoraF", localUtil.ttoc( wcpOAV31HoraF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV26MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV27MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.dtoc( AV28HisProFec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHORAI", localUtil.ttoc( AV30HoraI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.dtoc( AV29HisProFec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHORAF", localUtil.ttoc( AV31HoraF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV73TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV73TotHisProKgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV75TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV75TotHisProMtr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQDSC", GXutil.rtrim( A606MaqDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_HISPROKGR", AV77Col_HisProKgr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_HISPROKGR", AV77Col_HisProKgr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOL_HISPROKGR", getSecureSignedToken( sPrefix, AV77Col_HisProKgr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROLOT", GXutil.rtrim( A3610HisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRULEC", GXutil.ltrim( localUtil.ntoc( AV43Grulec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASACTTIN", GXutil.rtrim( AV44FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASACTTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV44FasActTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV37TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV38TTotMt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV38TTotMt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFILENAME", AV54Filename);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTI", localUtil.ttoc( A4440HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROTR2", GXutil.ltrim( localUtil.ntoc( A5605HisProTr2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1YG2( )
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
      return "Produccion.InformeProduccionResumenMaquina_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Producción Resumen - Datos por Máquina", "") ;
   }

   public void wb1YG0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenmaquina_wc");
            httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
            httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, sPrefix+"BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuttonexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 36, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnbuttonexport_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOBUTTONEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_22_1YG2( true) ;
      }
      else
      {
         wb_table1_22_1YG2( false) ;
      }
      return  ;
   }

   public void wb_table1_22_1YG2e( boolean wbgen )
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
         startgridcontrol36( ) ;
      }
      if ( wbEnd == 36 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_36 = (int)(nGXsfl_36_idx-1) ;
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
         wb_table2_47_1YG2( true) ;
      }
      else
      {
         wb_table2_47_1YG2( false) ;
      }
      return  ;
   }

   public void wb_table2_47_1YG2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV19GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV20GridPageCount);
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantidadregistros_Internalname, GXutil.ltrim( localUtil.ntoc( AV72CantidadRegistros, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV72CantidadRegistros), "ZZZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantidadregistros_Jsonclick, 0, "Attribute", "", "", "", "", edtavCantidadregistros_Visible, 1, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV81Pgmname), GXutil.rtrim( localUtil.format( AV81Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavCol_hisprokgrtojson_Internalname, AV78Col_HisProKgrToJSon, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", (short)(0), edtavCol_hisprokgrtojson_Visible, 1, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", 0, "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV35HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV35HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,70);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "Attribute", "", "", "", "", edtavHisprodti_Visible, 1, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavHisprodti_Visible==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV36HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV36HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "Attribute", "", "", "", "", edtavHisprodtf_Visible, 1, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavHisprodtf_Visible==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 36 )
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

   public void start1YG2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Producción Resumen - Datos por Máquina", ""), (short)(0)) ;
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
            strup1YG0( ) ;
         }
      }
   }

   public void ws1YG2( )
   {
      start1YG2( ) ;
      evt1YG2( ) ;
   }

   public void evt1YG2( )
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
                              strup1YG0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111YG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUTTONEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoButtonExport' */
                                 e131YG2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YG0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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
                              strup1YG0( ) ;
                           }
                           nGXsfl_36_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_362( ) ;
                           if ( GXutil.len( sPrefix) == 0 )
                           {
                              AV13EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
                           }
                           AV21MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV21MaqCod);
                           AV22MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV22MaqDsc);
                           AV23HisProKgr = localUtil.ctond( httpContext.cgiGet( edtavHisprokgr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV23HisProKgr, 10, 2));
                           AV50Por1k = localUtil.ctond( httpContext.cgiGet( edtavPor1k_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1k_Internalname, GXutil.ltrimstr( AV50Por1k, 6, 2));
                           AV24HisProMtr = localUtil.ctond( httpContext.cgiGet( edtavHispromtr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV24HisProMtr, 10, 2));
                           AV51Por1m = localUtil.ctond( httpContext.cgiGet( edtavPor1m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1m_Internalname, GXutil.ltrimstr( AV51Por1m, 6, 2));
                           AV40TotalTiempoMaquina = (int)(localUtil.ctol( httpContext.cgiGet( edtavTotaltiempomaquina_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotaltiempomaquina_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), 6, 0));
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e141YG2 ();
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e151YG2 ();
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
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e161YG2 ();
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
                                    strup1YG0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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

   public void we1YG2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YG2( ) ;
         }
      }
   }

   public void pa1YG2( )
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
            GX_FocusControl = edtavTotvaluehisprokgr_Internalname ;
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
      subsflControlProps_362( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         sendrow_362( ) ;
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV26MaqCod1 ,
                                 String AV27MaqCod2 ,
                                 java.util.Date AV28HisProFec1 ,
                                 java.util.Date AV30HoraI ,
                                 java.util.Date AV29HisProFec2 ,
                                 java.util.Date AV31HoraF ,
                                 String AV81Pgmname ,
                                 java.math.BigDecimal AV73TotHisProKgr ,
                                 java.math.BigDecimal AV75TotHisProMtr ,
                                 String A396EmprCod ,
                                 String A602MaqCod ,
                                 java.util.Date A4441HisProDTF ,
                                 java.util.Date AV35HisProDTI ,
                                 java.util.Date AV36HisProDTF ,
                                 short A656ParCod ,
                                 byte A3612HisProReo ,
                                 byte AV25HisEstReo ,
                                 java.math.BigDecimal A1525HisProKgr ,
                                 java.math.BigDecimal A1526HisProMtr ,
                                 String AV13EmprCod ,
                                 String A606MaqDsc ,
                                 GXSimpleCollection<java.math.BigDecimal> AV77Col_HisProKgr ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A3610HisProLot ,
                                 byte AV43Grulec ,
                                 String AV44FasActTin ,
                                 short A5605HisProTr2 ,
                                 java.math.BigDecimal AV37TTotk ,
                                 java.math.BigDecimal AV38TTotMt ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151YG2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YG2( ) ;
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
      rf1YG2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV81Pgmname = "Produccion.InformeProduccionResumenMaquina_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavHisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgr_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPor1k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor1k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1k_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavHispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtr_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPor1m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor1m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1m_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotaltiempomaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotaltiempomaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaltiempomaquina_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
   }

   public void rf1YG2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(36) ;
      /* Execute user event: Refresh */
      e151YG2 ();
      nGXsfl_36_idx = 1 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_362( ) ;
      bGXsfl_36_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
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
         subsflControlProps_362( ) ;
         e161YG2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_36_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e161YG2 ();
         }
         wbEnd = (short)(36) ;
         wb1YG0( ) ;
      }
      bGXsfl_36_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YG2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV73TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV73TotHisProKgr, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV75TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV75TotHisProMtr, "ZZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOL_HISPROKGR", AV77Col_HisProKgr);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOL_HISPROKGR", AV77Col_HisProKgr);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCOL_HISPROKGR", getSecureSignedToken( sPrefix, AV77Col_HisProKgr));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRULEC", GXutil.ltrim( localUtil.ntoc( AV43Grulec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43Grulec), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFASACTTIN", GXutil.rtrim( AV44FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFASACTTIN", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV44FasActTin, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV37TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV38TTotMt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV38TTotMt, "ZZZZZZ9.99")));
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
         gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, AV81Pgmname, AV73TotHisProKgr, AV75TotHisProMtr, A396EmprCod, A602MaqCod, A4441HisProDTF, AV35HisProDTI, AV36HisProDTF, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV13EmprCod, A606MaqDsc, AV77Col_HisProKgr, A129BarCod, A132BarCodReo, A130BarCodPar, A3610HisProLot, AV43Grulec, AV44FasActTin, A5605HisProTr2, AV37TTotk, AV38TTotMt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV81Pgmname = "Produccion.InformeProduccionResumenMaquina_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavMaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavHisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprokgr_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPor1k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor1k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1k_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavHispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHispromtr_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavPor1m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor1m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor1m_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotaltiempomaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotaltiempomaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotaltiempomaquina_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YG0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141YG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV20GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
         wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV26MaqCod1") ;
         wcpOAV27MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCod2") ;
         wcpOAV28HisProFec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28HisProFec1"), 0) ;
         wcpOAV30HoraI = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30HoraI"), 0)) ;
         wcpOAV29HisProFec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29HisProFec2"), 0) ;
         wcpOAV31HoraF = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV31HoraF"), 0)) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV74TotValueHisProKgr = httpContext.cgiGet( edtavTotvaluehisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotValueHisProKgr", AV74TotValueHisProKgr);
         AV76TotValueHisProMtr = httpContext.cgiGet( edtavTotvaluehispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TotValueHisProMtr", AV76TotValueHisProMtr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDADREGISTROS");
            GX_FocusControl = edtavCantidadregistros_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72CantidadRegistros = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CantidadRegistros), 12, 0));
         }
         else
         {
            AV72CantidadRegistros = localUtil.ctol( httpContext.cgiGet( edtavCantidadregistros_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CantidadRegistros), 12, 0));
         }
         AV81Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81Pgmname", AV81Pgmname);
         AV78Col_HisProKgrToJSon = httpContext.cgiGet( edtavCol_hisprokgrtojson_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Col_HisProKgrToJSon", AV78Col_HisProKgrToJSon);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProDTI", localUtil.ttoc( AV35HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV35HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProDTI", localUtil.ttoc( AV35HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV36HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProDTF", localUtil.ttoc( AV36HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV36HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProDTF", localUtil.ttoc( AV36HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
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
      e141YG2 ();
      if (returnInSub) return;
   }

   public void e141YG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV43Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      informeproduccionresumenmaquina_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV43Grulec = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43Grulec", GXutil.str( AV43Grulec, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vGRULEC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV43Grulec), "9")));
      GXt_int1 = AV65lecotex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV13EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int2) ;
      informeproduccionresumenmaquina_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV65lecotex = GXt_int1 ;
      GXt_char3 = AV82Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      informeproduccionresumenmaquina_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV82Station = GXt_char3 ;
      GXv_char4[0] = AV13EmprCod ;
      GXv_char5[0] = AV83Emprnom ;
      GXv_char6[0] = AV84Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV82Station, GXv_char4, GXv_char5, GXv_char6) ;
      informeproduccionresumenmaquina_wc_impl.this.AV13EmprCod = GXv_char4[0] ;
      informeproduccionresumenmaquina_wc_impl.this.AV83Emprnom = GXv_char5[0] ;
      informeproduccionresumenmaquina_wc_impl.this.AV84Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      edtavCantidadregistros_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCantidadregistros_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantidadregistros_Visible), 5, 0), true);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      edtavCol_hisprokgrtojson_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCol_hisprokgrtojson_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCol_hisprokgrtojson_Visible), 5, 0), true);
      edtavHisprodti_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodti_Visible), 5, 0), true);
      edtavHisprodtf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHisprodtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHisprodtf_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV34Fecha_hora = localUtil.dtoc( AV28HisProFec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV30HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV35HisProDTI = localUtil.ctot( AV34Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35HisProDTI", localUtil.ttoc( AV35HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV34Fecha_hora = localUtil.dtoc( AV29HisProFec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV31HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV36HisProDTF = localUtil.ctot( AV34Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36HisProDTF", localUtil.ttoc( AV36HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Execute user subroutine: 'INICIOBARRAPROGRESO' */
      S122 ();
      if (returnInSub) return;
   }

   public void e151YG2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      AV19GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19GridCurrentPage), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      GXt_int8 = AV72CantidadRegistros ;
      GXv_int9[0] = GXt_int8 ;
      new app.produccion.registrosmaquinas(remoteHandle, context).execute( AV13EmprCod, AV26MaqCod1, AV27MaqCod2, AV28HisProFec1, AV30HoraI, AV29HisProFec2, AV31HoraF, GXv_int9) ;
      informeproduccionresumenmaquina_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV72CantidadRegistros = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72CantidadRegistros", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72CantidadRegistros), 12, 0));
      AV69GridRows = ((subGrid_Rows==0) ? 1 : subGrid_Rows) ;
      AV20GridPageCount = (long)((AV72CantidadRegistros/ (double) (AV69GridRows))+1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridPageCount), 10, 0));
      /* Execute user subroutine: 'FINBARRAPROGRESO' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV67ProgressIndicator", AV67ProgressIndicator);
   }

   public void e111YG2( )
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
         AV18PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV18PageToGo) ;
      }
   }

   public void e121YG2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e161YG2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV32Totk = DecimalUtil.doubleToDec(0) ;
      AV33TotMt = DecimalUtil.doubleToDec(0) ;
      /* Using cursor H01YG2 */
      pr_default.execute(0, new Object[] {AV13EmprCod, AV26MaqCod1, AV35HisProDTI, AV36HisProDTF, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo), AV27MaqCod2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1YG3 = false ;
         A602MaqCod = H01YG2_A602MaqCod[0] ;
         A396EmprCod = H01YG2_A396EmprCod[0] ;
         A1525HisProKgr = H01YG2_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YG2_A1526HisProMtr[0] ;
         A130BarCodPar = H01YG2_A130BarCodPar[0] ;
         A132BarCodReo = H01YG2_A132BarCodReo[0] ;
         A129BarCod = H01YG2_A129BarCod[0] ;
         A3610HisProLot = H01YG2_A3610HisProLot[0] ;
         A3612HisProReo = H01YG2_A3612HisProReo[0] ;
         A656ParCod = H01YG2_A656ParCod[0] ;
         n656ParCod = H01YG2_n656ParCod[0] ;
         A606MaqDsc = H01YG2_A606MaqDsc[0] ;
         n606MaqDsc = H01YG2_n606MaqDsc[0] ;
         A4440HisProDTI = H01YG2_A4440HisProDTI[0] ;
         n4440HisProDTI = H01YG2_n4440HisProDTI[0] ;
         A4441HisProDTF = H01YG2_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YG2_n4441HisProDTF[0] ;
         A606MaqDsc = H01YG2_A606MaqDsc[0] ;
         n606MaqDsc = H01YG2_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         AV21MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV21MaqCod);
         AV22MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV22MaqDsc);
         AV24HisProMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV24HisProMtr, 10, 2));
         AV23HisProKgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV23HisProKgr, 10, 2));
         AV40TotalTiempoMaquina = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotaltiempomaquina_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), 6, 0));
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H01YG2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H01YG2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk1YG3 = false ;
            A1525HisProKgr = H01YG2_A1525HisProKgr[0] ;
            A1526HisProMtr = H01YG2_A1526HisProMtr[0] ;
            A130BarCodPar = H01YG2_A130BarCodPar[0] ;
            A132BarCodReo = H01YG2_A132BarCodReo[0] ;
            A129BarCod = H01YG2_A129BarCod[0] ;
            A3610HisProLot = H01YG2_A3610HisProLot[0] ;
            A3612HisProReo = H01YG2_A3612HisProReo[0] ;
            A656ParCod = H01YG2_A656ParCod[0] ;
            n656ParCod = H01YG2_n656ParCod[0] ;
            A4440HisProDTI = H01YG2_A4440HisProDTI[0] ;
            n4440HisProDTI = H01YG2_n4440HisProDTI[0] ;
            A4441HisProDTF = H01YG2_A4441HisProDTF[0] ;
            n4441HisProDTF = H01YG2_n4441HisProDTF[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            AV77Col_HisProKgr.add(A1525HisProKgr, 0);
            AV23HisProKgr = AV23HisProKgr.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV23HisProKgr, 10, 2));
            AV24HisProMtr = AV24HisProMtr.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV24HisProMtr, 10, 2));
            AV41FlagMarca = (byte)(0) ;
            AV42HisProLot = "" ;
            AV42HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV41FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV42HisProLot)==0) ? 1 : AV41FlagMarca)) ;
            if ( AV43Grulec == 0 )
            {
               if ( GXutil.strcmp(AV44FasActTin, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV41FlagMarca = (byte)(1) ;
               }
            }
            else
            {
               if ( ( GXutil.strcmp(A3610HisProLot, AV42HisProLot) == 0 ) && ( GXutil.strcmp(AV44FasActTin, httpContext.getMessage( "N", "")) == 0 ) )
               {
                  AV41FlagMarca = (byte)(1) ;
               }
            }
            AV45HhMm = DecimalUtil.doubleToDec(A5605HisProTr2/ (double) (60)) ;
            AV46HorRea = (short)(A5605HisProTr2/ (double) (60)) ;
            AV47HorReaint = (short)(GXutil.Int( AV46HorRea)) ;
            AV48MinRea = (short)(A5605HisProTr2-(AV47HorReaint*60)) ;
            AV48MinRea = (short)(GXutil.Int( AV48MinRea)) ;
            AV49Minutos = (long)((AV47HorReaint*60)+AV48MinRea) ;
            AV49Minutos = A5605HisProTr2 ;
            AV40TotalTiempoMaquina = (int)(AV40TotalTiempoMaquina+(((AV41FlagMarca==1) ? AV49Minutos : 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotaltiempomaquina_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), 6, 0));
            brk1YG3 = true ;
            pr_default.readNext(0);
         }
         AV50Por1k = ((AV37TTotk.doubleValue()>0) ? (AV23HisProKgr.divide(AV37TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1k_Internalname, GXutil.ltrimstr( AV50Por1k, 6, 2));
         AV51Por1m = ((AV38TTotMt.doubleValue()>0) ? (AV24HisProMtr.divide(AV38TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1m_Internalname, GXutil.ltrimstr( AV51Por1m, 6, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(36) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_362( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_36_Refreshing )
         {
            httpContext.doAjaxLoad(36, GridRow);
         }
         if ( ! brk1YG3 )
         {
            brk1YG3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV78Col_HisProKgrToJSon = AV77Col_HisProKgr.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78Col_HisProKgrToJSon", AV78Col_HisProKgrToJSon);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV77Col_HisProKgr", AV77Col_HisProKgr);
   }

   public void e131YG2( )
   {
      /* 'DoButtonExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'WRITEDATA' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S202 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV81Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV81Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV81Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV81Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'TOTALES' */
      S212 ();
      if (returnInSub) return;
      AV74TotValueHisProKgr = localUtil.format( AV73TotHisProKgr, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TotValueHisProKgr", AV74TotValueHisProKgr);
      AV76TotValueHisProMtr = localUtil.format( AV75TotHisProMtr, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TotValueHisProMtr", AV76TotValueHisProMtr);
   }

   public void S212( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV37TTotk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TTotk", GXutil.ltrimstr( AV37TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotk, "ZZZZZZ9.99")));
      AV38TTotMt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TTotMt", GXutil.ltrimstr( AV38TTotMt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV38TTotMt, "ZZZZZZ9.99")));
      /* Optimized group. */
      /* Using cursor H01YG3 */
      pr_default.execute(1, new Object[] {AV13EmprCod, AV26MaqCod1, AV35HisProDTI, AV36HisProDTF, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo), AV27MaqCod2});
      c1525HisProKgr = H01YG3_A1525HisProKgr[0] ;
      c1526HisProMtr = H01YG3_A1526HisProMtr[0] ;
      pr_default.close(1);
      AV37TTotk = AV37TTotk.add(c1525HisProKgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TTotk", GXutil.ltrimstr( AV37TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotk, "ZZZZZZ9.99")));
      AV38TTotMt = AV38TTotMt.add(c1526HisProMtr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TTotMt", GXutil.ltrimstr( AV38TTotMt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV38TTotMt, "ZZZZZZ9.99")));
      /* End optimized group. */
      AV73TotHisProKgr = AV37TTotk ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TotHisProKgr", GXutil.ltrimstr( AV73TotHisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV73TotHisProKgr, "ZZZZZZ9.99")));
      AV75TotHisProMtr = AV38TTotMt ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TotHisProMtr", GXutil.ltrimstr( AV75TotHisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTHISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV75TotHisProMtr, "ZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV55Random = (int)(GXutil.random( )*10000) ;
      AV54Filename = "InformeProduccionResumenMaquina-" + GXutil.trim( GXutil.str( AV55Random, 8, 0)) + ".xlsx" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Filename", AV54Filename);
      AV53ExcelDocument.Open(AV54Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S222 ();
      if (returnInSub) return;
      AV53ExcelDocument.Clear();
   }

   public void S182( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV56TipoTxt = ((AV25HisEstReo==9) ? httpContext.getMessage( "Todo", "") : ((AV25HisEstReo==0) ? httpContext.getMessage( "Produccion Normal", "") : ((AV25HisEstReo==1) ? httpContext.getMessage( "Produccion RI", "") : httpContext.getMessage( "Produccion RE", "")))) ;
      AV53ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV53ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Informe Produccion por Maquina", "") );
      AV53ExcelDocument.Cells(1, 2, 1, 1).setText( AV56TipoTxt );
      AV53ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Maquinas ", "")+AV26MaqCod1+" "+AV27MaqCod2+httpContext.getMessage( " Periodo ", "")+localUtil.ttoc( AV35HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " hasta ", "")+localUtil.ttoc( AV36HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
      AV61CellRow = 2 ;
      AV62CellCol = 1 ;
      while ( AV62CellCol <= 8 )
      {
         AV53ExcelDocument.Cells((int)(AV61CellRow), (int)(AV62CellCol), 1, 1).setBold( (short)(1) );
         AV62CellCol = (long)(AV62CellCol+1) ;
      }
      AV53ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV53ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV53ExcelDocument.Cells(2, 3, 1, 1).setText( "%" );
      AV53ExcelDocument.Cells(2, 4, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV53ExcelDocument.Cells(2, 5, 1, 1).setText( "%" );
      AV53ExcelDocument.Cells(2, 6, 1, 1).setText( httpContext.getMessage( "tot minutos", "") );
      AV53ExcelDocument.Cells(2, 7, 1, 1).setText( httpContext.getMessage( "tot Hh", "") );
      AV53ExcelDocument.Cells(2, 8, 1, 1).setText( httpContext.getMessage( "tot Mm", "") );
   }

   public void S192( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV61CellRow = 3 ;
      /* Using cursor H01YG4 */
      pr_default.execute(2, new Object[] {AV13EmprCod, AV26MaqCod1, AV35HisProDTI, AV36HisProDTF, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo), AV27MaqCod2});
      while ( (pr_default.getStatus(2) != 101) )
      {
         brk1YG6 = false ;
         A602MaqCod = H01YG4_A602MaqCod[0] ;
         A396EmprCod = H01YG4_A396EmprCod[0] ;
         A1525HisProKgr = H01YG4_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YG4_A1526HisProMtr[0] ;
         A130BarCodPar = H01YG4_A130BarCodPar[0] ;
         A132BarCodReo = H01YG4_A132BarCodReo[0] ;
         A129BarCod = H01YG4_A129BarCod[0] ;
         A3610HisProLot = H01YG4_A3610HisProLot[0] ;
         A3612HisProReo = H01YG4_A3612HisProReo[0] ;
         A656ParCod = H01YG4_A656ParCod[0] ;
         n656ParCod = H01YG4_n656ParCod[0] ;
         A606MaqDsc = H01YG4_A606MaqDsc[0] ;
         n606MaqDsc = H01YG4_n606MaqDsc[0] ;
         A4440HisProDTI = H01YG4_A4440HisProDTI[0] ;
         n4440HisProDTI = H01YG4_n4440HisProDTI[0] ;
         A4441HisProDTF = H01YG4_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YG4_n4441HisProDTF[0] ;
         A606MaqDsc = H01YG4_A606MaqDsc[0] ;
         n606MaqDsc = H01YG4_n606MaqDsc[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
         }
         AV24HisProMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV24HisProMtr, 10, 2));
         AV23HisProKgr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV23HisProKgr, 10, 2));
         AV40TotalTiempoMaquina = 0 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotaltiempomaquina_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), 6, 0));
         while ( (pr_default.getStatus(2) != 101) && ( GXutil.strcmp(H01YG4_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H01YG4_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk1YG6 = false ;
            A1525HisProKgr = H01YG4_A1525HisProKgr[0] ;
            A1526HisProMtr = H01YG4_A1526HisProMtr[0] ;
            A130BarCodPar = H01YG4_A130BarCodPar[0] ;
            A132BarCodReo = H01YG4_A132BarCodReo[0] ;
            A129BarCod = H01YG4_A129BarCod[0] ;
            A3610HisProLot = H01YG4_A3610HisProLot[0] ;
            A3612HisProReo = H01YG4_A3612HisProReo[0] ;
            A656ParCod = H01YG4_A656ParCod[0] ;
            n656ParCod = H01YG4_n656ParCod[0] ;
            A4440HisProDTI = H01YG4_A4440HisProDTI[0] ;
            n4440HisProDTI = H01YG4_n4440HisProDTI[0] ;
            A4441HisProDTF = H01YG4_A4441HisProDTF[0] ;
            n4441HisProDTF = H01YG4_n4441HisProDTF[0] ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            else
            {
               A5605HisProTr2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A5605HisProTr2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5605HisProTr2), 4, 0));
            }
            AV23HisProKgr = AV23HisProKgr.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHisprokgr_Internalname, GXutil.ltrimstr( AV23HisProKgr, 10, 2));
            AV24HisProMtr = AV24HisProMtr.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHispromtr_Internalname, GXutil.ltrimstr( AV24HisProMtr, 10, 2));
            AV41FlagMarca = (byte)(0) ;
            AV42HisProLot = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            AV41FlagMarca = (byte)(((GXutil.strcmp(A3610HisProLot, AV42HisProLot)==0) ? 1 : AV41FlagMarca)) ;
            if ( AV43Grulec == 0 )
            {
               if ( GXutil.strcmp(AV44FasActTin, httpContext.getMessage( "N", "")) == 0 )
               {
                  AV41FlagMarca = (byte)(1) ;
               }
            }
            else
            {
               if ( ( GXutil.strcmp(A3610HisProLot, AV42HisProLot) == 0 ) && ( GXutil.strcmp(AV44FasActTin, httpContext.getMessage( "N", "")) == 0 ) )
               {
                  AV41FlagMarca = (byte)(1) ;
               }
            }
            AV45HhMm = DecimalUtil.doubleToDec(A5605HisProTr2/ (double) (60)) ;
            AV46HorRea = (short)(A5605HisProTr2/ (double) (60)) ;
            AV47HorReaint = (short)(GXutil.Int( AV46HorRea)) ;
            AV48MinRea = (short)(A5605HisProTr2-(AV47HorReaint*60)) ;
            AV48MinRea = (short)(GXutil.Int( AV48MinRea)) ;
            AV49Minutos = (long)((AV47HorReaint*60)+AV48MinRea) ;
            AV49Minutos = A5605HisProTr2 ;
            AV40TotalTiempoMaquina = (int)(AV40TotalTiempoMaquina+(((AV41FlagMarca==1) ? AV49Minutos : 0))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTotaltiempomaquina_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), 6, 0));
            brk1YG6 = true ;
            pr_default.readNext(2);
         }
         AV22MaqDsc = A606MaqDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqdsc_Internalname, AV22MaqDsc);
         AV50Por1k = ((AV37TTotk.doubleValue()>0) ? (AV23HisProKgr.divide(AV37TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1k_Internalname, GXutil.ltrimstr( AV50Por1k, 6, 2));
         AV51Por1m = ((AV38TTotMt.doubleValue()>0) ? (AV24HisProMtr.divide(AV38TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor1m_Internalname, GXutil.ltrimstr( AV51Por1m, 6, 2));
         AV53ExcelDocument.Cells((int)(AV61CellRow), 1, 1, 1).setText( AV22MaqDsc );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 2, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV23HisProKgr)) );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50Por1k)) );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV24HisProMtr)) );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51Por1m)) );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 6, 1, 1).setNumber( AV40TotalTiempoMaquina );
         AV45HhMm = DecimalUtil.doubleToDec(GXutil.Int( AV40TotalTiempoMaquina/ (double) (60))) ;
         AV46HorRea = (short)(GXutil.Int( AV40TotalTiempoMaquina/ (double) (60))) ;
         AV47HorReaint = (short)(GXutil.Int( AV46HorRea)) ;
         AV48MinRea = (short)(AV40TotalTiempoMaquina-(AV47HorReaint*60)) ;
         AV48MinRea = (short)(GXutil.Int( AV48MinRea)) ;
         AV53ExcelDocument.Cells((int)(AV61CellRow), 7, 1, 1).setNumber( AV47HorReaint );
         AV53ExcelDocument.Cells((int)(AV61CellRow), 8, 1, 1).setNumber( AV48MinRea );
         AV61CellRow = (long)(AV61CellRow+1) ;
         if ( ! brk1YG6 )
         {
            brk1YG6 = true ;
            pr_default.readNext(2);
         }
      }
      pr_default.close(2);
   }

   public void S202( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV53ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S222 ();
      if (returnInSub) return;
      AV53ExcelDocument.Close();
      callWebObject(formatLink("app.apget_downloadfile", new String[] {GXutil.URLEncode(GXutil.rtrim(AV54Filename)),GXutil.URLEncode(GXutil.rtrim("report.xls")),GXutil.URLEncode(GXutil.rtrim("application/vnd.ms-excel"))}, new String[] {"vrPathCompleto","vrNomeArquivo","ContentType"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S222( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV53ExcelDocument.getErrCode() != 0 )
      {
         AV54Filename = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54Filename", AV54Filename);
         AV60ErrorMessage = AV53ExcelDocument.getErrDescription() ;
         AV53ExcelDocument.Close();
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S122( )
   {
      /* 'INICIOBARRAPROGRESO' Routine */
      returnInSub = false ;
      AV66WebSession.setValue("InformeProduccionResumenWW_MAQ", httpContext.getMessage( "FINALIZADO", ""));
      AV67ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV67ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV67ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV67ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV67ProgressIndicator.show();
   }

   public void S162( )
   {
      /* 'FINBARRAPROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV66WebSession.getValue("InformeProduccionResumenWW_MAQ"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV66WebSession.remove("InformeProduccionResumenWW_MAQ");
         AV67ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV67ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV67ProgressIndicator.hide();
      }
   }

   public void wb_table2_47_1YG2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisprokgr_Internalname, httpContext.getMessage( "Tot Value His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisprokgr_Internalname, AV74TotValueHisProKgr, GXutil.rtrim( localUtil.format( AV74TotValueHisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehispromtr_Internalname, httpContext.getMessage( "Tot Value His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'" + sPrefix + "',false,'" + sGXsfl_36_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehispromtr_Internalname, AV76TotValueHisProMtr, GXutil.rtrim( localUtil.format( AV76TotValueHisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_47_1YG2e( true) ;
      }
      else
      {
         wb_table2_47_1YG2e( false) ;
      }
   }

   public void wb_table1_22_1YG2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_maquina_Internalname, httpContext.getMessage( "Datos por Máquina", ""), "", "", lblTextblock_maquina_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenMaquina_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_22_1YG2e( true) ;
      }
      else
      {
         wb_table1_22_1YG2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      AV26MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26MaqCod1", AV26MaqCod1);
      AV27MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod2", AV27MaqCod2);
      AV28HisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProFec1", localUtil.format(AV28HisProFec1, "99/99/99"));
      AV30HoraI = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HoraI", localUtil.ttoc( AV30HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV29HisProFec2 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProFec2", localUtil.format(AV29HisProFec2, "99/99/99"));
      AV31HoraF = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HoraF", localUtil.ttoc( AV31HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa1YG2( ) ;
      ws1YG2( ) ;
      we1YG2( ) ;
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
      sCtrlAV25HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV26MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV27MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV28HisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV30HoraI = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV29HisProFec2 = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV31HoraF = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YG2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenmaquina_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YG2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV13EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
         AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
         AV26MaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26MaqCod1", AV26MaqCod1);
         AV27MaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod2", AV27MaqCod2);
         AV28HisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProFec1", localUtil.format(AV28HisProFec1, "99/99/99"));
         AV30HoraI = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HoraI", localUtil.ttoc( AV30HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV29HisProFec2 = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProFec2", localUtil.format(AV29HisProFec2, "99/99/99"));
         AV31HoraF = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HoraF", localUtil.ttoc( AV31HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV13EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV13EmprCod") ;
      wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV26MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV26MaqCod1") ;
      wcpOAV27MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV27MaqCod2") ;
      wcpOAV28HisProFec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28HisProFec1"), 0) ;
      wcpOAV30HoraI = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30HoraI"), 0)) ;
      wcpOAV29HisProFec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV29HisProFec2"), 0) ;
      wcpOAV31HoraF = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV31HoraF"), 0)) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV13EmprCod, wcpOAV13EmprCod) != 0 ) || ( AV25HisEstReo != wcpOAV25HisEstReo ) || ( GXutil.strcmp(AV26MaqCod1, wcpOAV26MaqCod1) != 0 ) || ( GXutil.strcmp(AV27MaqCod2, wcpOAV27MaqCod2) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV28HisProFec1), GXutil.resetTime(wcpOAV28HisProFec1)) ) || !( GXutil.dateCompare(AV30HoraI, wcpOAV30HoraI) ) || !( GXutil.dateCompare(GXutil.resetTime(AV29HisProFec2), GXutil.resetTime(wcpOAV29HisProFec2)) ) || !( GXutil.dateCompare(AV31HoraF, wcpOAV31HoraF) ) ) )
      {
         setjustcreated();
      }
      wcpOAV13EmprCod = AV13EmprCod ;
      wcpOAV25HisEstReo = AV25HisEstReo ;
      wcpOAV26MaqCod1 = AV26MaqCod1 ;
      wcpOAV27MaqCod2 = AV27MaqCod2 ;
      wcpOAV28HisProFec1 = AV28HisProFec1 ;
      wcpOAV30HoraI = AV30HoraI ;
      wcpOAV29HisProFec2 = AV29HisProFec2 ;
      wcpOAV31HoraF = AV31HoraF ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV13EmprCod) > 0 )
      {
         AV13EmprCod = httpContext.cgiGet( sCtrlAV13EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV13EmprCod);
      }
      else
      {
         AV13EmprCod = httpContext.cgiGet( sPrefix+"AV13EmprCod_PARM") ;
      }
      sCtrlAV25HisEstReo = httpContext.cgiGet( sPrefix+"AV25HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV25HisEstReo) > 0 )
      {
         AV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      }
      else
      {
         AV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV26MaqCod1 = httpContext.cgiGet( sPrefix+"AV26MaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV26MaqCod1) > 0 )
      {
         AV26MaqCod1 = httpContext.cgiGet( sCtrlAV26MaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26MaqCod1", AV26MaqCod1);
      }
      else
      {
         AV26MaqCod1 = httpContext.cgiGet( sPrefix+"AV26MaqCod1_PARM") ;
      }
      sCtrlAV27MaqCod2 = httpContext.cgiGet( sPrefix+"AV27MaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV27MaqCod2) > 0 )
      {
         AV27MaqCod2 = httpContext.cgiGet( sCtrlAV27MaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27MaqCod2", AV27MaqCod2);
      }
      else
      {
         AV27MaqCod2 = httpContext.cgiGet( sPrefix+"AV27MaqCod2_PARM") ;
      }
      sCtrlAV28HisProFec1 = httpContext.cgiGet( sPrefix+"AV28HisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV28HisProFec1) > 0 )
      {
         AV28HisProFec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV28HisProFec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProFec1", localUtil.format(AV28HisProFec1, "99/99/99"));
      }
      else
      {
         AV28HisProFec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV28HisProFec1_PARM"), 0) ;
      }
      sCtrlAV30HoraI = httpContext.cgiGet( sPrefix+"AV30HoraI_CTRL") ;
      if ( GXutil.len( sCtrlAV30HoraI) > 0 )
      {
         AV30HoraI = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sCtrlAV30HoraI), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HoraI", localUtil.ttoc( AV30HoraI, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV30HoraI = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"AV30HoraI_PARM"), 0)) ;
      }
      sCtrlAV29HisProFec2 = httpContext.cgiGet( sPrefix+"AV29HisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV29HisProFec2) > 0 )
      {
         AV29HisProFec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV29HisProFec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProFec2", localUtil.format(AV29HisProFec2, "99/99/99"));
      }
      else
      {
         AV29HisProFec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV29HisProFec2_PARM"), 0) ;
      }
      sCtrlAV31HoraF = httpContext.cgiGet( sPrefix+"AV31HoraF_CTRL") ;
      if ( GXutil.len( sCtrlAV31HoraF) > 0 )
      {
         AV31HoraF = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sCtrlAV31HoraF), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HoraF", localUtil.ttoc( AV31HoraF, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV31HoraF = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"AV31HoraF_PARM"), 0)) ;
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
      pa1YG2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YG2( ) ;
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
      ws1YG2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisEstReo_CTRL", GXutil.rtrim( sCtrlAV25HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26MaqCod1_PARM", GXutil.rtrim( AV26MaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26MaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26MaqCod1_CTRL", GXutil.rtrim( sCtrlAV26MaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCod2_PARM", GXutil.rtrim( AV27MaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27MaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27MaqCod2_CTRL", GXutil.rtrim( sCtrlAV27MaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28HisProFec1_PARM", localUtil.dtoc( AV28HisProFec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28HisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28HisProFec1_CTRL", GXutil.rtrim( sCtrlAV28HisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30HoraI_PARM", localUtil.ttoc( AV30HoraI, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30HoraI)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30HoraI_CTRL", GXutil.rtrim( sCtrlAV30HoraI));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HisProFec2_PARM", localUtil.dtoc( AV29HisProFec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29HisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29HisProFec2_CTRL", GXutil.rtrim( sCtrlAV29HisProFec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31HoraF_PARM", localUtil.ttoc( AV31HoraF, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31HoraF)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31HoraF_CTRL", GXutil.rtrim( sCtrlAV31HoraF));
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
      we1YG2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115554015", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenmaquina_wc.js", "?202682115554015", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_362( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_36_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_36_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_36_idx ;
      edtavHisprokgr_Internalname = sPrefix+"vHISPROKGR_"+sGXsfl_36_idx ;
      edtavPor1k_Internalname = sPrefix+"vPOR1K_"+sGXsfl_36_idx ;
      edtavHispromtr_Internalname = sPrefix+"vHISPROMTR_"+sGXsfl_36_idx ;
      edtavPor1m_Internalname = sPrefix+"vPOR1M_"+sGXsfl_36_idx ;
      edtavTotaltiempomaquina_Internalname = sPrefix+"vTOTALTIEMPOMAQUINA_"+sGXsfl_36_idx ;
   }

   public void subsflControlProps_fel_362( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_36_fel_idx ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_36_fel_idx ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC_"+sGXsfl_36_fel_idx ;
      edtavHisprokgr_Internalname = sPrefix+"vHISPROKGR_"+sGXsfl_36_fel_idx ;
      edtavPor1k_Internalname = sPrefix+"vPOR1K_"+sGXsfl_36_fel_idx ;
      edtavHispromtr_Internalname = sPrefix+"vHISPROMTR_"+sGXsfl_36_fel_idx ;
      edtavPor1m_Internalname = sPrefix+"vPOR1M_"+sGXsfl_36_fel_idx ;
      edtavTotaltiempomaquina_Internalname = sPrefix+"vTOTALTIEMPOMAQUINA_"+sGXsfl_36_fel_idx ;
   }

   public void sendrow_362( )
   {
      subsflControlProps_362( ) ;
      wb1YG0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_36_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_36_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmprcod_Internalname,GXutil.rtrim( AV13EmprCod),GXutil.rtrim( localUtil.format( AV13EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEmprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEmprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV21MaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavMaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqdsc_Internalname,GXutil.rtrim( AV22MaqDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMaqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( AV23HisProKgr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHisprokgr_Enabled!=0) ? localUtil.format( AV23HisProKgr, "ZZZZZZ9.99") : localUtil.format( AV23HisProKgr, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor1k_Internalname,GXutil.ltrim( localUtil.ntoc( AV50Por1k, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor1k_Enabled!=0) ? localUtil.format( AV50Por1k, "ZZ9.99") : localUtil.format( AV50Por1k, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPor1k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor1k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV24HisProMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHispromtr_Enabled!=0) ? localUtil.format( AV24HisProMtr, "ZZZZZZ9.99") : localUtil.format( AV24HisProMtr, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavHispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor1m_Internalname,GXutil.ltrim( localUtil.ntoc( AV51Por1m, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor1m_Enabled!=0) ? localUtil.format( AV51Por1m, "ZZ9.99") : localUtil.format( AV51Por1m, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPor1m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor1m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTotaltiempomaquina_Internalname,GXutil.ltrim( localUtil.ntoc( AV40TotalTiempoMaquina, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTotaltiempomaquina_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV40TotalTiempoMaquina), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTotaltiempomaquina_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTotaltiempomaquina_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YG2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_36_idx = ((subGrid_Islastpage==1)&&(nGXsfl_36_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_362( ) ;
      }
      /* End function sendrow_362 */
   }

   public void startgridcontrol36( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"36\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "MaquinaID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "minutos", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13EmprCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21MaqCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV22MaqDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMaqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV23HisProKgr, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50Por1k, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor1k_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24HisProMtr, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51Por1m, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor1m_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40TotalTiempoMaquina, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTotaltiempomaquina_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Barradeprogreso_Internalname = sPrefix+"BARRADEPROGRESO" ;
      bttBtnbuttonexport_Internalname = sPrefix+"BTNBUTTONEXPORT" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      lblTextblock_maquina_Internalname = sPrefix+"TEXTBLOCK_MAQUINA" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      edtavHisprokgr_Internalname = sPrefix+"vHISPROKGR" ;
      edtavPor1k_Internalname = sPrefix+"vPOR1K" ;
      edtavHispromtr_Internalname = sPrefix+"vHISPROMTR" ;
      edtavPor1m_Internalname = sPrefix+"vPOR1M" ;
      edtavTotaltiempomaquina_Internalname = sPrefix+"vTOTALTIEMPOMAQUINA" ;
      edtavTotvaluehisprokgr_Internalname = sPrefix+"vTOTVALUEHISPROKGR" ;
      edtavTotvaluehispromtr_Internalname = sPrefix+"vTOTVALUEHISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavCantidadregistros_Internalname = sPrefix+"vCANTIDADREGISTROS" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavCol_hisprokgrtojson_Internalname = sPrefix+"vCOL_HISPROKGRTOJSON" ;
      edtavHisprodti_Internalname = sPrefix+"vHISPRODTI" ;
      edtavHisprodtf_Internalname = sPrefix+"vHISPRODTF" ;
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
      edtavTotaltiempomaquina_Jsonclick = "" ;
      edtavTotaltiempomaquina_Enabled = 0 ;
      edtavPor1m_Jsonclick = "" ;
      edtavPor1m_Enabled = 0 ;
      edtavHispromtr_Jsonclick = "" ;
      edtavHispromtr_Enabled = 0 ;
      edtavPor1k_Jsonclick = "" ;
      edtavPor1k_Enabled = 0 ;
      edtavHisprokgr_Jsonclick = "" ;
      edtavHisprokgr_Enabled = 0 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluehispromtr_Jsonclick = "" ;
      edtavTotvaluehispromtr_Enabled = 1 ;
      edtavTotvaluehisprokgr_Jsonclick = "" ;
      edtavTotvaluehisprokgr_Enabled = 1 ;
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Visible = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Visible = 1 ;
      edtavCol_hisprokgrtojson_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
      edtavCantidadregistros_Jsonclick = "" ;
      edtavCantidadregistros_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV27MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV28HisProFec1',fld:'vHISPROFEC1',pic:''},{av:'AV30HoraI',fld:'vHORAI',pic:'99:99:99'},{av:'AV29HisProFec2',fld:'vHISPROFEC2',pic:''},{av:'AV31HoraF',fld:'vHORAF',pic:'99:99:99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV75TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV35HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV36HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV77Col_HisProKgr',fld:'vCOL_HISPROKGR',pic:'',hsh:true},{av:'AV43Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV44FasActTin',fld:'vFASACTTIN',pic:'@!',hsh:true},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72CantidadRegistros',fld:'vCANTIDADREGISTROS',pic:'ZZZZZZZZZZZ9'},{av:'AV20GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV74TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV76TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV73TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV75TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111YG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV27MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV28HisProFec1',fld:'vHISPROFEC1',pic:''},{av:'AV30HoraI',fld:'vHORAI',pic:'99:99:99'},{av:'AV29HisProFec2',fld:'vHISPROFEC2',pic:''},{av:'AV31HoraF',fld:'vHORAF',pic:'99:99:99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV75TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV35HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV36HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV77Col_HisProKgr',fld:'vCOL_HISPROKGR',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV43Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV44FasActTin',fld:'vFASACTTIN',pic:'@!',hsh:true},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121YG2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV26MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV27MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV28HisProFec1',fld:'vHISPROFEC1',pic:''},{av:'AV30HoraI',fld:'vHORAI',pic:'99:99:99'},{av:'AV29HisProFec2',fld:'vHISPROFEC2',pic:''},{av:'AV31HoraF',fld:'vHORAF',pic:'99:99:99'},{av:'AV81Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZZ9.99',hsh:true},{av:'AV75TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV35HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV36HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV77Col_HisProKgr',fld:'vCOL_HISPROKGR',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV43Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV44FasActTin',fld:'vFASACTTIN',pic:'@!',hsh:true},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161YG2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV26MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV27MaqCod2',fld:'vMAQCOD2',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV35HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV36HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'AV77Col_HisProKgr',fld:'vCOL_HISPROKGR',pic:'',hsh:true},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV43Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV44FasActTin',fld:'vFASACTTIN',pic:'@!',hsh:true},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV21MaqCod',fld:'vMAQCOD',pic:''},{av:'AV22MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV24HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZZ9.99'},{av:'AV23HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZZ9.99'},{av:'AV40TotalTiempoMaquina',fld:'vTOTALTIEMPOMAQUINA',pic:'ZZZZZ9'},{av:'AV77Col_HisProKgr',fld:'vCOL_HISPROKGR',pic:'',hsh:true},{av:'AV50Por1k',fld:'vPOR1K',pic:'ZZ9.99'},{av:'AV51Por1m',fld:'vPOR1M',pic:'ZZ9.99'},{av:'AV78Col_HisProKgrToJSon',fld:'vCOL_HISPROKGRTOJSON',pic:''}]}");
      setEventMetadata("'DOBUTTONEXPORT'","{handler:'e131YG2',iparms:[{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV26MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV27MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV35HisProDTI',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV36HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV13EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'AV43Grulec',fld:'vGRULEC',pic:'9',hsh:true},{av:'AV44FasActTin',fld:'vFASACTTIN',pic:'@!',hsh:true},{av:'A5605HisProTr2',fld:'HISPROTR2',pic:'ZZZ9'},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'AV37TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV38TTotMt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV54Filename',fld:'vFILENAME',pic:''}]");
      setEventMetadata("'DOBUTTONEXPORT'",",oparms:[{av:'AV54Filename',fld:'vFILENAME',pic:''},{av:'AV24HisProMtr',fld:'vHISPROMTR',pic:'ZZZZZZ9.99'},{av:'AV23HisProKgr',fld:'vHISPROKGR',pic:'ZZZZZZ9.99'},{av:'AV40TotalTiempoMaquina',fld:'vTOTALTIEMPOMAQUINA',pic:'ZZZZZ9'},{av:'AV22MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV50Por1k',fld:'vPOR1K',pic:'ZZ9.99'},{av:'AV51Por1m',fld:'vPOR1M',pic:'ZZ9.99'}]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Totaltiempomaquina',iparms:[]");
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
      AV53ExcelDocument.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV13EmprCod = "" ;
      wcpOAV26MaqCod1 = "" ;
      wcpOAV27MaqCod2 = "" ;
      wcpOAV28HisProFec1 = GXutil.nullDate() ;
      wcpOAV30HoraI = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV29HisProFec2 = GXutil.nullDate() ;
      wcpOAV31HoraF = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV13EmprCod = "" ;
      AV26MaqCod1 = "" ;
      AV27MaqCod2 = "" ;
      AV28HisProFec1 = GXutil.nullDate() ;
      AV30HoraI = GXutil.resetTime( GXutil.nullDate() );
      AV29HisProFec2 = GXutil.nullDate() ;
      AV31HoraF = GXutil.resetTime( GXutil.nullDate() );
      AV81Pgmname = "" ;
      AV73TotHisProKgr = DecimalUtil.ZERO ;
      AV75TotHisProMtr = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV35HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV36HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      AV77Col_HisProKgr = new GXSimpleCollection<java.math.BigDecimal>(java.math.BigDecimal.class, "internal", "");
      A130BarCodPar = "" ;
      A3610HisProLot = "" ;
      AV44FasActTin = "" ;
      AV37TTotk = DecimalUtil.ZERO ;
      AV38TTotMt = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV54Filename = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbuttonexport_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV78Col_HisProKgrToJSon = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21MaqCod = "" ;
      AV22MaqDsc = "" ;
      AV23HisProKgr = DecimalUtil.ZERO ;
      AV50Por1k = DecimalUtil.ZERO ;
      AV24HisProMtr = DecimalUtil.ZERO ;
      AV51Por1m = DecimalUtil.ZERO ;
      AV74TotValueHisProKgr = "" ;
      AV76TotValueHisProMtr = "" ;
      GXv_int2 = new byte[1] ;
      AV82Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV83Emprnom = "" ;
      GXv_char5 = new String[1] ;
      AV84Usurcod = "" ;
      GXv_char6 = new String[1] ;
      AV34Fecha_hora = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int9 = new long[1] ;
      AV67ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV32Totk = DecimalUtil.ZERO ;
      AV33TotMt = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H01YG2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG2_A561HisProLin = new int[1] ;
      H01YG2_A602MaqCod = new String[] {""} ;
      H01YG2_A396EmprCod = new String[] {""} ;
      H01YG2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YG2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YG2_A130BarCodPar = new String[] {""} ;
      H01YG2_A132BarCodReo = new byte[1] ;
      H01YG2_A129BarCod = new int[1] ;
      H01YG2_A3610HisProLot = new String[] {""} ;
      H01YG2_A3612HisProReo = new byte[1] ;
      H01YG2_A656ParCod = new short[1] ;
      H01YG2_n656ParCod = new boolean[] {false} ;
      H01YG2_A606MaqDsc = new String[] {""} ;
      H01YG2_n606MaqDsc = new boolean[] {false} ;
      H01YG2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG2_n4440HisProDTI = new boolean[] {false} ;
      H01YG2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG2_n4441HisProDTF = new boolean[] {false} ;
      AV42HisProLot = "" ;
      AV45HhMm = DecimalUtil.ZERO ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      H01YG3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YG3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV53ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV56TipoTxt = "" ;
      H01YG4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG4_A561HisProLin = new int[1] ;
      H01YG4_A602MaqCod = new String[] {""} ;
      H01YG4_A396EmprCod = new String[] {""} ;
      H01YG4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YG4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YG4_A130BarCodPar = new String[] {""} ;
      H01YG4_A132BarCodReo = new byte[1] ;
      H01YG4_A129BarCod = new int[1] ;
      H01YG4_A3610HisProLot = new String[] {""} ;
      H01YG4_A3612HisProReo = new byte[1] ;
      H01YG4_A656ParCod = new short[1] ;
      H01YG4_n656ParCod = new boolean[] {false} ;
      H01YG4_A606MaqDsc = new String[] {""} ;
      H01YG4_n606MaqDsc = new boolean[] {false} ;
      H01YG4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG4_n4440HisProDTI = new boolean[] {false} ;
      H01YG4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YG4_n4441HisProDTF = new boolean[] {false} ;
      AV60ErrorMessage = "" ;
      AV66WebSession = httpContext.getWebSession();
      lblTextblock_maquina_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV13EmprCod = "" ;
      sCtrlAV25HisEstReo = "" ;
      sCtrlAV26MaqCod1 = "" ;
      sCtrlAV27MaqCod2 = "" ;
      sCtrlAV28HisProFec1 = "" ;
      sCtrlAV30HoraI = "" ;
      sCtrlAV29HisProFec2 = "" ;
      sCtrlAV31HoraF = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenmaquina_wc__default(),
         new Object[] {
             new Object[] {
            H01YG2_A558HisProFec, H01YG2_A561HisProLin, H01YG2_A602MaqCod, H01YG2_A396EmprCod, H01YG2_A1525HisProKgr, H01YG2_A1526HisProMtr, H01YG2_A130BarCodPar, H01YG2_A132BarCodReo, H01YG2_A129BarCod, H01YG2_A3610HisProLot,
            H01YG2_A3612HisProReo, H01YG2_A656ParCod, H01YG2_n656ParCod, H01YG2_A606MaqDsc, H01YG2_n606MaqDsc, H01YG2_A4440HisProDTI, H01YG2_n4440HisProDTI, H01YG2_A4441HisProDTF, H01YG2_n4441HisProDTF
            }
            , new Object[] {
            H01YG3_A1525HisProKgr, H01YG3_A1526HisProMtr
            }
            , new Object[] {
            H01YG4_A558HisProFec, H01YG4_A561HisProLin, H01YG4_A602MaqCod, H01YG4_A396EmprCod, H01YG4_A1525HisProKgr, H01YG4_A1526HisProMtr, H01YG4_A130BarCodPar, H01YG4_A132BarCodReo, H01YG4_A129BarCod, H01YG4_A3610HisProLot,
            H01YG4_A3612HisProReo, H01YG4_A656ParCod, H01YG4_n656ParCod, H01YG4_A606MaqDsc, H01YG4_n606MaqDsc, H01YG4_A4440HisProDTI, H01YG4_n4440HisProDTI, H01YG4_A4441HisProDTF, H01YG4_n4441HisProDTF
            }
         }
      );
      AV81Pgmname = "Produccion.InformeProduccionResumenMaquina_WC" ;
      /* GeneXus formulas. */
      AV81Pgmname = "Produccion.InformeProduccionResumenMaquina_WC" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      edtavMaqcod_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavHisprokgr_Enabled = 0 ;
      edtavPor1k_Enabled = 0 ;
      edtavHispromtr_Enabled = 0 ;
      edtavPor1m_Enabled = 0 ;
      edtavTotaltiempomaquina_Enabled = 0 ;
      edtavTotvaluehisprokgr_Enabled = 0 ;
      edtavTotvaluehispromtr_Enabled = 0 ;
   }

   private byte wcpOAV25HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25HisEstReo ;
   private byte A3612HisProReo ;
   private byte A132BarCodReo ;
   private byte AV43Grulec ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV65lecotex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV41FlagMarca ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV46HorRea ;
   private short AV47HorReaint ;
   private short AV48MinRea ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_36 ;
   private int nGXsfl_36_idx=1 ;
   private int A129BarCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavCantidadregistros_Visible ;
   private int edtavPgmname_Visible ;
   private int edtavCol_hisprokgrtojson_Visible ;
   private int edtavHisprodti_Visible ;
   private int edtavHisprodtf_Visible ;
   private int AV40TotalTiempoMaquina ;
   private int subGrid_Islastpage ;
   private int edtavEmprcod_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavHisprokgr_Enabled ;
   private int edtavPor1k_Enabled ;
   private int edtavHispromtr_Enabled ;
   private int edtavPor1m_Enabled ;
   private int edtavTotaltiempomaquina_Enabled ;
   private int edtavTotvaluehisprokgr_Enabled ;
   private int edtavTotvaluehispromtr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV69GridRows ;
   private int AV18PageToGo ;
   private int AV55Random ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19GridCurrentPage ;
   private long AV20GridPageCount ;
   private long AV72CantidadRegistros ;
   private long GRID_nCurrentRecord ;
   private long GXt_int8 ;
   private long GXv_int9[] ;
   private long AV49Minutos ;
   private long AV61CellRow ;
   private long AV62CellCol ;
   private java.math.BigDecimal AV73TotHisProKgr ;
   private java.math.BigDecimal AV75TotHisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV37TTotk ;
   private java.math.BigDecimal AV38TTotMt ;
   private java.math.BigDecimal AV23HisProKgr ;
   private java.math.BigDecimal AV50Por1k ;
   private java.math.BigDecimal AV24HisProMtr ;
   private java.math.BigDecimal AV51Por1m ;
   private java.math.BigDecimal AV32Totk ;
   private java.math.BigDecimal AV33TotMt ;
   private java.math.BigDecimal AV45HhMm ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String wcpOAV13EmprCod ;
   private String wcpOAV26MaqCod1 ;
   private String wcpOAV27MaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV13EmprCod ;
   private String edtavEmprcod_Internalname ;
   private String AV26MaqCod1 ;
   private String AV27MaqCod2 ;
   private String sGXsfl_36_idx="0001" ;
   private String AV81Pgmname ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
   private String A130BarCodPar ;
   private String A3610HisProLot ;
   private String AV44FasActTin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnbuttonexport_Internalname ;
   private String bttBtnbuttonexport_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavCantidadregistros_Internalname ;
   private String edtavCantidadregistros_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String edtavCol_hisprokgrtojson_Internalname ;
   private String edtavHisprodti_Internalname ;
   private String edtavHisprodti_Jsonclick ;
   private String edtavHisprodtf_Internalname ;
   private String edtavHisprodtf_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluehisprokgr_Internalname ;
   private String AV21MaqCod ;
   private String edtavMaqcod_Internalname ;
   private String AV22MaqDsc ;
   private String edtavMaqdsc_Internalname ;
   private String edtavHisprokgr_Internalname ;
   private String edtavPor1k_Internalname ;
   private String edtavHispromtr_Internalname ;
   private String edtavPor1m_Internalname ;
   private String edtavTotaltiempomaquina_Internalname ;
   private String edtavTotvaluehispromtr_Internalname ;
   private String AV82Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV83Emprnom ;
   private String GXv_char5[] ;
   private String AV84Usurcod ;
   private String GXv_char6[] ;
   private String AV34Fecha_hora ;
   private String scmdbuf ;
   private String AV42HisProLot ;
   private String AV56TipoTxt ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisprokgr_Jsonclick ;
   private String edtavTotvaluehispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_maquina_Internalname ;
   private String lblTextblock_maquina_Jsonclick ;
   private String sCtrlAV13EmprCod ;
   private String sCtrlAV25HisEstReo ;
   private String sCtrlAV26MaqCod1 ;
   private String sCtrlAV27MaqCod2 ;
   private String sCtrlAV28HisProFec1 ;
   private String sCtrlAV30HoraI ;
   private String sCtrlAV29HisProFec2 ;
   private String sCtrlAV31HoraF ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String edtavHisprokgr_Jsonclick ;
   private String edtavPor1k_Jsonclick ;
   private String edtavHispromtr_Jsonclick ;
   private String edtavPor1m_Jsonclick ;
   private String edtavTotaltiempomaquina_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30HoraI ;
   private java.util.Date wcpOAV31HoraF ;
   private java.util.Date AV30HoraI ;
   private java.util.Date AV31HoraF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV35HisProDTI ;
   private java.util.Date AV36HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date wcpOAV28HisProFec1 ;
   private java.util.Date wcpOAV29HisProFec2 ;
   private java.util.Date AV28HisProFec1 ;
   private java.util.Date AV29HisProFec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
   private boolean n606MaqDsc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk1YG3 ;
   private boolean n4440HisProDTI ;
   private boolean brk1YG6 ;
   private String AV78Col_HisProKgrToJSon ;
   private String AV54Filename ;
   private String AV74TotValueHisProKgr ;
   private String AV76TotValueHisProMtr ;
   private String AV60ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01YG2_A558HisProFec ;
   private int[] H01YG2_A561HisProLin ;
   private String[] H01YG2_A602MaqCod ;
   private String[] H01YG2_A396EmprCod ;
   private java.math.BigDecimal[] H01YG2_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YG2_A1526HisProMtr ;
   private String[] H01YG2_A130BarCodPar ;
   private byte[] H01YG2_A132BarCodReo ;
   private int[] H01YG2_A129BarCod ;
   private String[] H01YG2_A3610HisProLot ;
   private byte[] H01YG2_A3612HisProReo ;
   private short[] H01YG2_A656ParCod ;
   private boolean[] H01YG2_n656ParCod ;
   private String[] H01YG2_A606MaqDsc ;
   private boolean[] H01YG2_n606MaqDsc ;
   private java.util.Date[] H01YG2_A4440HisProDTI ;
   private boolean[] H01YG2_n4440HisProDTI ;
   private java.util.Date[] H01YG2_A4441HisProDTF ;
   private boolean[] H01YG2_n4441HisProDTF ;
   private java.math.BigDecimal[] H01YG3_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YG3_A1526HisProMtr ;
   private java.util.Date[] H01YG4_A558HisProFec ;
   private int[] H01YG4_A561HisProLin ;
   private String[] H01YG4_A602MaqCod ;
   private String[] H01YG4_A396EmprCod ;
   private java.math.BigDecimal[] H01YG4_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YG4_A1526HisProMtr ;
   private String[] H01YG4_A130BarCodPar ;
   private byte[] H01YG4_A132BarCodReo ;
   private int[] H01YG4_A129BarCod ;
   private String[] H01YG4_A3610HisProLot ;
   private byte[] H01YG4_A3612HisProReo ;
   private short[] H01YG4_A656ParCod ;
   private boolean[] H01YG4_n656ParCod ;
   private String[] H01YG4_A606MaqDsc ;
   private boolean[] H01YG4_n606MaqDsc ;
   private java.util.Date[] H01YG4_A4440HisProDTI ;
   private boolean[] H01YG4_n4440HisProDTI ;
   private java.util.Date[] H01YG4_A4441HisProDTF ;
   private boolean[] H01YG4_n4441HisProDTF ;
   private com.genexus.gxoffice.ExcelDoc AV53ExcelDocument ;
   private com.genexus.webpanels.WebSession AV66WebSession ;
   private GXSimpleCollection<java.math.BigDecimal> AV77Col_HisProKgr ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV67ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class informeproduccionresumenmaquina_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YG2", "SELECT T1.HisProFec, T1.HisProLin, T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.HisProReo, T1.ParCod, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.HisProReo = ? or ? = 9) AND (T1.ParCod = 0) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YG3", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YG4", "SELECT T1.HisProFec, T1.HisProLin, T1.MaqCod, T1.EmprCod, T1.HisProKgr, T1.HisProMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisProLot, T1.HisProReo, T1.ParCod, T2.MaqDsc, T1.HisProDTI, T1.HisProDTF FROM (TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTF <= ?) AND (T1.HisProReo = ? or ? = 9) AND (T1.ParCod = 0) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               return;
            case 1 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               return;
      }
   }

}

