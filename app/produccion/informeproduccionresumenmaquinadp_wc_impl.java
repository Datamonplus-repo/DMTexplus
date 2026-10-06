package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenmaquinadp_wc_impl extends GXWebComponent
{
   public informeproduccionresumenmaquinadp_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenmaquinadp_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenmaquinadp_wc_impl.class ));
   }

   public informeproduccionresumenmaquinadp_wc_impl( int remoteHandle ,
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
               AV11EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
               AV27HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27HisEstReo", GXutil.str( AV27HisEstReo, 1, 0));
               AV46MaqCod1 = httpContext.GetPar( "MaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46MaqCod1", AV46MaqCod1);
               AV47MaqCod2 = httpContext.GetPar( "MaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47MaqCod2", AV47MaqCod2);
               AV30HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HisProFec1", localUtil.ttoc( AV30HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV31HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HisProFec2", localUtil.ttoc( AV31HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV97OperarioFrom = (short)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97OperarioFrom), 4, 0));
               AV98OperarioTo = (short)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OperarioTo), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV11EmprCod,Byte.valueOf(AV27HisEstReo),AV46MaqCod1,AV47MaqCod2,AV30HisProFec1,AV31HisProFec2,Short.valueOf(AV97OperarioFrom),Short.valueOf(AV98OperarioTo)});
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
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
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
      AV115Pgmname = httpContext.GetPar( "Pgmname") ;
      AV11EmprCod = httpContext.GetPar( "EmprCod") ;
      AV27HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV46MaqCod1 = httpContext.GetPar( "MaqCod1") ;
      AV47MaqCod2 = httpContext.GetPar( "MaqCod2") ;
      AV30HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
      AV31HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
      AV97OperarioFrom = (short)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV98OperarioTo = (short)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV79SDTInformeProduccionResumenMaquina);
      AV86Tot_HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HisProKgr"), ".") ;
      AV88Tot_HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HisProMtr"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa22H2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenmaquinadp_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV11EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV27HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV46MaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV47MaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV30HisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31HisProFec2)),GXutil.URLEncode(GXutil.ltrimstr(AV97OperarioFrom,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV98OperarioTo,4,0))}, new String[] {"EmprCod","HisEstReo","MaqCod1","MaqCod2","HisProFec1","HisProFec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtinformeproduccionresumenmaquina", AV79SDTInformeProduccionResumenMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtinformeproduccionresumenmaquina", AV79SDTInformeProduccionResumenMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV20GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV21GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11EmprCod", GXutil.rtrim( wcpOAV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV27HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV46MaqCod1", GXutil.rtrim( wcpOAV46MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47MaqCod2", GXutil.rtrim( wcpOAV47MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30HisProFec1", localUtil.ttoc( wcpOAV30HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31HisProFec2", localUtil.ttoc( wcpOAV31HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV97OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV97OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV98OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV98OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV11EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV27HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV46MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV47MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV30HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV31HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV97OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV98OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV86Tot_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV88Tot_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTINFORMEPRODUCCIONRESUMENMAQUINA", AV79SDTInformeProduccionResumenMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTINFORMEPRODUCCIONRESUMENMAQUINA", AV79SDTInformeProduccionResumenMaquina);
      }
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

   public void renderHtmlCloseForm22H2( )
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
      return "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Producción Resumen - Datos por Máquina", "") ;
   }

   public void wb22H0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenmaquinadp_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 33, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_22H2( true) ;
      }
      else
      {
         wb_table1_19_22H2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_22H2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV101GXV1 = nGXsfl_33_idx ;
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
         wb_table2_49_22H2( true) ;
      }
      else
      {
         wb_table2_49_22H2( false) ;
      }
      return  ;
   }

   public void wb_table2_49_22H2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV20GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV21GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV115Pgmname), GXutil.rtrim( localUtil.format( AV115Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname, GXutil.ltrim( localUtil.ntoc( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt(), "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtinformeproduccionresumenmaquina_totalmt_Jsonclick, 0, "Attribute", "", "", "", "", edtavSdtinformeproduccionresumenmaquina_totalmt_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname, GXutil.ltrim( localUtil.ntoc( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg(), "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtinformeproduccionresumenmaquina_totalkg_Jsonclick, 0, "Attribute", "", "", "", "", edtavSdtinformeproduccionresumenmaquina_totalkg_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_kg_Internalname, GXutil.ltrim( localUtil.ntoc( AV83TOTAL_KG, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV83TOTAL_KG, "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_kg_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_kg_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_mt_Internalname, GXutil.ltrim( localUtil.ntoc( AV84TOTAL_MT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV84TOTAL_MT, "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,81);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_mt_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_mt_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodti_Internalname, localUtil.ttoc( AV29HisProDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV29HisProDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,82);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodti_Jsonclick, 0, "Attribute", "", "", "", "", edtavHisprodti_Visible, 1, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavHisprodti_Visible==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavHisprodtf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_Internalname, localUtil.ttoc( AV28HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV28HisProDTF, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHisprodtf_Jsonclick, 0, "Attribute", "", "", "", "", edtavHisprodtf_Visible, 1, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavHisprodtf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((edtavHisprodtf_Visible==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 33 )
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
               AV101GXV1 = nGXsfl_33_idx ;
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

   public void start22H2( )
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
            strup22H0( ) ;
         }
      }
   }

   public void ws22H2( )
   {
      start22H2( ) ;
      evt22H2( ) ;
   }

   public void evt22H2( )
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
                              strup22H0( ) ;
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
                              strup22H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1122H2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1222H2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1322H2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22H0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
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
                              strup22H0( ) ;
                           }
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           AV101GXV1 = (int)(nGXsfl_33_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() >= AV101GXV1 ) && ( AV101GXV1 > 0 ) )
                           {
                              AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)) );
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
                                       GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1422H2 ();
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
                                       GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1522H2 ();
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
                                       GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1622H2 ();
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
                                    strup22H0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
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

   public void we22H2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm22H2( ) ;
         }
      }
   }

   public void pa22H2( )
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
            GX_FocusControl = edtavTotvalue_hisprokgr_Internalname ;
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
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV115Pgmname ,
                                 String AV11EmprCod ,
                                 byte AV27HisEstReo ,
                                 String AV46MaqCod1 ,
                                 String AV47MaqCod2 ,
                                 java.util.Date AV30HisProFec1 ,
                                 java.util.Date AV31HisProFec2 ,
                                 short AV97OperarioFrom ,
                                 short AV98OperarioTo ,
                                 app.produccion.SdtSDTInformeProduccionResumenMaquina AV79SDTInformeProduccionResumenMaquina ,
                                 java.math.BigDecimal AV86Tot_HisProKgr ,
                                 java.math.BigDecimal AV88Tot_HisProMtr ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1522H2 ();
      GRID_nCurrentRecord = 0 ;
      rf22H2( ) ;
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
      rf22H2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV115Pgmname = "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
   }

   public void rf22H2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e1522H2 ();
      nGXsfl_33_idx = 1 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_332( ) ;
         e1622H2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_33_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1622H2 ();
         }
         wbEnd = (short)(33) ;
         wb22H0( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22H2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV86Tot_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV88Tot_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99")));
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
      return AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115Pgmname, AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, AV79SDTInformeProduccionResumenMaquina, AV86Tot_HisProKgr, AV88Tot_HisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV115Pgmname = "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Pgmname", AV115Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22H0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1422H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTINFORMEPRODUCCIONRESUMENMAQUINA"), AV79SDTInformeProduccionResumenMaquina);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtinformeproduccionresumenmaquina"), AV79SDTInformeProduccionResumenMaquina);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV20GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
         wcpOAV27HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV46MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV46MaqCod1") ;
         wcpOAV47MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV47MaqCod2") ;
         wcpOAV30HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30HisProFec1"), 0) ;
         wcpOAV31HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV31HisProFec2"), 0) ;
         wcpOAV97OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV98OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_33_fel_idx = 0 ;
         while ( nGXsfl_33_fel_idx < nRC_GXsfl_33 )
         {
            nGXsfl_33_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_fel_idx+1) ;
            sGXsfl_33_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_332( ) ;
            AV101GXV1 = (int)(nGXsfl_33_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() >= AV101GXV1 ) && ( AV101GXV1 > 0 ) )
            {
               AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)) );
            }
         }
         if ( nGXsfl_33_fel_idx == 0 )
         {
            nGXsfl_33_idx = 1 ;
            sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_332( ) ;
         }
         nGXsfl_33_fel_idx = 1 ;
         /* Read variables values. */
         AV87TotValue_HisProKgr = httpContext.cgiGet( edtavTotvalue_hisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValue_HisProKgr", AV87TotValue_HisProKgr);
         AV89TotValue_HisProMtr = httpContext.cgiGet( edtavTotvalue_hispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotValue_HisProMtr", AV89TotValue_HisProMtr);
         AV115Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV115Pgmname", AV115Pgmname);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTINFORMEPRODUCCIONRESUMENMAQUINA_TOTALMT");
            GX_FocusControl = edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79SDTInformeProduccionResumenMaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt( DecimalUtil.ZERO );
         }
         else
         {
            AV79SDTInformeProduccionResumenMaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalmt( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname)) );
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTINFORMEPRODUCCIONRESUMENMAQUINA_TOTALKG");
            GX_FocusControl = edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79SDTInformeProduccionResumenMaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg( DecimalUtil.ZERO );
         }
         else
         {
            AV79SDTInformeProduccionResumenMaquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_Totalkg( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname)) );
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_KG");
            GX_FocusControl = edtavTotal_kg_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83TOTAL_KG = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TOTAL_KG", GXutil.ltrimstr( AV83TOTAL_KG, 10, 2));
         }
         else
         {
            AV83TOTAL_KG = localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83TOTAL_KG", GXutil.ltrimstr( AV83TOTAL_KG, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_MT");
            GX_FocusControl = edtavTotal_mt_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84TOTAL_MT = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TOTAL_MT", GXutil.ltrimstr( AV84TOTAL_MT, 10, 2));
         }
         else
         {
            AV84TOTAL_MT = localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV84TOTAL_MT", GXutil.ltrimstr( AV84TOTAL_MT, 10, 2));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTI");
            GX_FocusControl = edtavHisprodti_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29HisProDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProDTI", localUtil.ttoc( AV29HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV29HisProDTI = localUtil.ctot( httpContext.cgiGet( edtavHisprodti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29HisProDTI", localUtil.ttoc( AV29HisProDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavHisprodtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHISPRODTF");
            GX_FocusControl = edtavHisprodtf_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28HisProDTF = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProDTF", localUtil.ttoc( AV28HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV28HisProDTF = localUtil.ctot( httpContext.cgiGet( edtavHisprodtf_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28HisProDTF", localUtil.ttoc( AV28HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      e1422H2 ();
      if (returnInSub) return;
   }

   public void e1422H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV25Grulec ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "GRUHDR", ""), GXv_int2) ;
      informeproduccionresumenmaquinadp_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV25Grulec = GXt_int1 ;
      GXt_int1 = AV41lecotex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV11EmprCod, httpContext.getMessage( "LECOTE", ""), GXv_int2) ;
      informeproduccionresumenmaquinadp_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV41lecotex = GXt_int1 ;
      GXt_char3 = AV90Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      informeproduccionresumenmaquinadp_wc_impl.this.GXt_char3 = GXv_char4[0] ;
      AV90Station = GXt_char3 ;
      GXv_char4[0] = AV11EmprCod ;
      GXv_char5[0] = AV91EmprNom ;
      GXv_char6[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV90Station, GXv_char4, GXv_char5, GXv_char6) ;
      informeproduccionresumenmaquinadp_wc_impl.this.AV11EmprCod = GXv_char4[0] ;
      informeproduccionresumenmaquinadp_wc_impl.this.AV91EmprNom = GXv_char5[0] ;
      informeproduccionresumenmaquinadp_wc_impl.this.AV92UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      edtavSdtinformeproduccionresumenmaquina_totalmt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_totalmt_Visible), 5, 0), true);
      edtavSdtinformeproduccionresumenmaquina_totalkg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenmaquina_totalkg_Visible), 5, 0), true);
      edtavTotal_kg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_kg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_kg_Visible), 5, 0), true);
      edtavTotal_mt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_mt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_mt_Visible), 5, 0), true);
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
      GXt_SdtSDTInformeProduccionResumenMaquina7 = AV79SDTInformeProduccionResumenMaquina;
      GXv_SdtSDTInformeProduccionResumenMaquina8[0] = GXt_SdtSDTInformeProduccionResumenMaquina7;
      new app.produccion.dpinformeproduccionresumenmaquina(remoteHandle, context).execute( AV11EmprCod, AV27HisEstReo, AV46MaqCod1, AV47MaqCod2, AV30HisProFec1, AV31HisProFec2, AV97OperarioFrom, AV98OperarioTo, GXv_SdtSDTInformeProduccionResumenMaquina8) ;
      GXt_SdtSDTInformeProduccionResumenMaquina7 = GXv_SdtSDTInformeProduccionResumenMaquina8[0] ;
      AV79SDTInformeProduccionResumenMaquina = GXt_SdtSDTInformeProduccionResumenMaquina7;
      gx_BV33 = true ;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "ProgressBar", new Object[] {Integer.valueOf(1),Integer.valueOf(100),Boolean.valueOf(false),httpContext.getMessage( "Iniciando Informe Produccion Resumen Maquina...", ""),httpContext.getMessage( "GXProgressBarDanger", "")}, true);
      /* Execute user subroutine: 'TOTALES' */
      S122 ();
      if (returnInSub) return;
      AV118GXV17 = 1 ;
      while ( AV118GXV17 <= AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() )
      {
         AV80SDTInformeProduccionResumenMaquina_Maquina = (app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV118GXV17));
         if ( AV80SDTInformeProduccionResumenMaquina_Maquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr().doubleValue() > 0 )
         {
            AV32HisProKgr = AV80SDTInformeProduccionResumenMaquina_Maquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr() ;
            AV80SDTInformeProduccionResumenMaquina_Maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo( ((AV93TTotk.doubleValue()>0) ? (AV32HisProKgr.divide(AV93TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         if ( AV80SDTInformeProduccionResumenMaquina_Maquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr().doubleValue() > 0 )
         {
            AV34HisProMtr = AV80SDTInformeProduccionResumenMaquina_Maquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr() ;
            AV80SDTInformeProduccionResumenMaquina_Maquina.setgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro( ((AV94TTotMt.doubleValue()>0) ? (AV34HisProMtr.divide(AV94TTotMt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         AV118GXV17 = (int)(AV118GXV17+1) ;
      }
   }

   public void e1522H2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV78WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV78WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV20GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20GridCurrentPage), 10, 0));
      AV21GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1122H2( )
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
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e1222H2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1622H2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV101GXV1 = 1 ;
      while ( AV101GXV1 <= AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() )
      {
         AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(33) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_332( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
         {
            httpContext.doAjaxLoad(33, GridRow);
         }
         AV101GXV1 = (int)(AV101GXV1+1) ;
      }
   }

   public void e1322H2( )
   {
      AV101GXV1 = (int)(nGXsfl_33_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV101GXV1 > 0 ) && ( AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() >= AV101GXV1 ) )
      {
         AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char6[0] = AV14ExcelFilename ;
      GXv_char5[0] = AV12ErrorMessage ;
      new app.produccion.informeproduccionresumenmaquinadp_wcexport(remoteHandle, context).execute( AV79SDTInformeProduccionResumenMaquina, GXv_char6, GXv_char5) ;
      informeproduccionresumenmaquinadp_wc_impl.this.AV14ExcelFilename = GXv_char6[0] ;
      informeproduccionresumenmaquinadp_wc_impl.this.AV12ErrorMessage = GXv_char5[0] ;
      if ( GXutil.strcmp(AV14ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV14ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV12ErrorMessage);
      }
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV63Session.getValue(AV115Pgmname+"GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV115Pgmname+"GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV63Session.getValue(AV115Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV23GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV23GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV23GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV23GridState.fromxml(AV63Session.getValue(AV115Pgmname+"GridState"), null, null);
      AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV11EmprCod)==0) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11EmprCod );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (0==AV27HisEstReo) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV27HisEstReo, 1, 0) );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV46MaqCod1)==0) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD1" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV46MaqCod1 );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47MaqCod2)==0) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD2" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47MaqCod2 );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV30HisProFec1) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC1" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV30HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV31HisProFec2) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC2" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV31HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (0==AV97OperarioFrom) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOFROM" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV97OperarioFrom, 4, 0) );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      if ( ! (0==AV98OperarioTo) )
      {
         AV24GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOTO" );
         AV24GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV98OperarioTo, 4, 0) );
         AV23GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV24GridStateFilterValue, 0);
      }
      AV23GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV23GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV115Pgmname+"GridState", AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV86Tot_HisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Tot_HisProKgr", GXutil.ltrimstr( AV86Tot_HisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99")));
      AV88Tot_HisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tot_HisProMtr", GXutil.ltrimstr( AV88Tot_HisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV119GXV18 = 1 ;
      while ( AV119GXV18 <= AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().size() )
      {
         AV85SDTInformeProduccionResumenMaquina_MaquinaItem = (app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV119GXV18));
         AV86Tot_HisProKgr = AV86Tot_HisProKgr.add((AV85SDTInformeProduccionResumenMaquina_MaquinaItem.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86Tot_HisProKgr", GXutil.ltrimstr( AV86Tot_HisProKgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99")));
         AV88Tot_HisProMtr = AV88Tot_HisProMtr.add((AV85SDTInformeProduccionResumenMaquina_MaquinaItem.getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV88Tot_HisProMtr", GXutil.ltrimstr( AV88Tot_HisProMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99")));
         AV119GXV18 = (int)(AV119GXV18+1) ;
      }
      AV87TotValue_HisProKgr = localUtil.format( AV86Tot_HisProKgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV87TotValue_HisProKgr", AV87TotValue_HisProKgr);
      AV89TotValue_HisProMtr = localUtil.format( AV88Tot_HisProMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89TotValue_HisProMtr", AV89TotValue_HisProMtr);
   }

   public void S122( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV93TTotk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TTotk", GXutil.ltrimstr( AV93TTotk, 10, 2));
      AV94TTotMt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TTotMt", GXutil.ltrimstr( AV94TTotMt, 10, 2));
      /* Optimized group. */
      /* Using cursor H022H2 */
      pr_default.execute(0, new Object[] {AV11EmprCod, AV46MaqCod1, AV30HisProFec1, AV31HisProFec2, Byte.valueOf(AV27HisEstReo), Byte.valueOf(AV27HisEstReo), AV47MaqCod2});
      c1525HisProKgr = H022H2_A1525HisProKgr[0] ;
      c1526HisProMtr = H022H2_A1526HisProMtr[0] ;
      pr_default.close(0);
      AV93TTotk = AV93TTotk.add(c1525HisProKgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93TTotk", GXutil.ltrimstr( AV93TTotk, 10, 2));
      AV94TTotMt = AV94TTotMt.add(c1526HisProMtr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV94TTotMt", GXutil.ltrimstr( AV94TTotMt, 10, 2));
      /* End optimized group. */
   }

   public void wb_table2_49_22H2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hisprokgr_Internalname, httpContext.getMessage( "Tot Value_His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hisprokgr_Internalname, AV87TotValue_HisProKgr, GXutil.rtrim( localUtil.format( AV87TotValue_HisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hispromtr_Internalname, httpContext.getMessage( "Tot Value_His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hispromtr_Internalname, AV89TotValue_HisProMtr, GXutil.rtrim( localUtil.format( AV89TotValue_HisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_49_22H2e( true) ;
      }
      else
      {
         wb_table2_49_22H2e( false) ;
      }
   }

   public void wb_table1_19_22H2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_maquina_Internalname, httpContext.getMessage( "Datos por Máquina", ""), "", "", lblTextblock_maquina_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenMaquinaDP_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_22H2e( true) ;
      }
      else
      {
         wb_table1_19_22H2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      AV27HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27HisEstReo", GXutil.str( AV27HisEstReo, 1, 0));
      AV46MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46MaqCod1", AV46MaqCod1);
      AV47MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47MaqCod2", AV47MaqCod2);
      AV30HisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HisProFec1", localUtil.ttoc( AV30HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV31HisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HisProFec2", localUtil.ttoc( AV31HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV97OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97OperarioFrom), 4, 0));
      AV98OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OperarioTo), 4, 0));
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
      pa22H2( ) ;
      ws22H2( ) ;
      we22H2( ) ;
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
      sCtrlAV11EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV27HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV46MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV47MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV30HisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV31HisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV97OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV98OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa22H2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenmaquinadp_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa22H2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV11EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
         AV27HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27HisEstReo", GXutil.str( AV27HisEstReo, 1, 0));
         AV46MaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46MaqCod1", AV46MaqCod1);
         AV47MaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47MaqCod2", AV47MaqCod2);
         AV30HisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HisProFec1", localUtil.ttoc( AV30HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV31HisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HisProFec2", localUtil.ttoc( AV31HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV97OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97OperarioFrom), 4, 0));
         AV98OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OperarioTo), 4, 0));
      }
      wcpOAV11EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV11EmprCod") ;
      wcpOAV27HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV46MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV46MaqCod1") ;
      wcpOAV47MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV47MaqCod2") ;
      wcpOAV30HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30HisProFec1"), 0) ;
      wcpOAV31HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV31HisProFec2"), 0) ;
      wcpOAV97OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV97OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV98OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV98OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV11EmprCod, wcpOAV11EmprCod) != 0 ) || ( AV27HisEstReo != wcpOAV27HisEstReo ) || ( GXutil.strcmp(AV46MaqCod1, wcpOAV46MaqCod1) != 0 ) || ( GXutil.strcmp(AV47MaqCod2, wcpOAV47MaqCod2) != 0 ) || !( GXutil.dateCompare(AV30HisProFec1, wcpOAV30HisProFec1) ) || !( GXutil.dateCompare(AV31HisProFec2, wcpOAV31HisProFec2) ) || ( AV97OperarioFrom != wcpOAV97OperarioFrom ) || ( AV98OperarioTo != wcpOAV98OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV11EmprCod = AV11EmprCod ;
      wcpOAV27HisEstReo = AV27HisEstReo ;
      wcpOAV46MaqCod1 = AV46MaqCod1 ;
      wcpOAV47MaqCod2 = AV47MaqCod2 ;
      wcpOAV30HisProFec1 = AV30HisProFec1 ;
      wcpOAV31HisProFec2 = AV31HisProFec2 ;
      wcpOAV97OperarioFrom = AV97OperarioFrom ;
      wcpOAV98OperarioTo = AV98OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV11EmprCod) > 0 )
      {
         AV11EmprCod = httpContext.cgiGet( sCtrlAV11EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11EmprCod", AV11EmprCod);
      }
      else
      {
         AV11EmprCod = httpContext.cgiGet( sPrefix+"AV11EmprCod_PARM") ;
      }
      sCtrlAV27HisEstReo = httpContext.cgiGet( sPrefix+"AV27HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV27HisEstReo) > 0 )
      {
         AV27HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27HisEstReo", GXutil.str( AV27HisEstReo, 1, 0));
      }
      else
      {
         AV27HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV46MaqCod1 = httpContext.cgiGet( sPrefix+"AV46MaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV46MaqCod1) > 0 )
      {
         AV46MaqCod1 = httpContext.cgiGet( sCtrlAV46MaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46MaqCod1", AV46MaqCod1);
      }
      else
      {
         AV46MaqCod1 = httpContext.cgiGet( sPrefix+"AV46MaqCod1_PARM") ;
      }
      sCtrlAV47MaqCod2 = httpContext.cgiGet( sPrefix+"AV47MaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV47MaqCod2) > 0 )
      {
         AV47MaqCod2 = httpContext.cgiGet( sCtrlAV47MaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47MaqCod2", AV47MaqCod2);
      }
      else
      {
         AV47MaqCod2 = httpContext.cgiGet( sPrefix+"AV47MaqCod2_PARM") ;
      }
      sCtrlAV30HisProFec1 = httpContext.cgiGet( sPrefix+"AV30HisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV30HisProFec1) > 0 )
      {
         AV30HisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV30HisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30HisProFec1", localUtil.ttoc( AV30HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV30HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV30HisProFec1_PARM"), 0) ;
      }
      sCtrlAV31HisProFec2 = httpContext.cgiGet( sPrefix+"AV31HisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV31HisProFec2) > 0 )
      {
         AV31HisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV31HisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31HisProFec2", localUtil.ttoc( AV31HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV31HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV31HisProFec2_PARM"), 0) ;
      }
      sCtrlAV97OperarioFrom = httpContext.cgiGet( sPrefix+"AV97OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV97OperarioFrom) > 0 )
      {
         AV97OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV97OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97OperarioFrom), 4, 0));
      }
      else
      {
         AV97OperarioFrom = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV97OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV98OperarioTo = httpContext.cgiGet( sPrefix+"AV98OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV98OperarioTo) > 0 )
      {
         AV98OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV98OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV98OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OperarioTo), 4, 0));
      }
      else
      {
         AV98OperarioTo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV98OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa22H2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws22H2( ) ;
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
      ws22H2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_PARM", GXutil.rtrim( AV11EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11EmprCod_CTRL", GXutil.rtrim( sCtrlAV11EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV27HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27HisEstReo_CTRL", GXutil.rtrim( sCtrlAV27HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46MaqCod1_PARM", GXutil.rtrim( AV46MaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV46MaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV46MaqCod1_CTRL", GXutil.rtrim( sCtrlAV46MaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47MaqCod2_PARM", GXutil.rtrim( AV47MaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47MaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47MaqCod2_CTRL", GXutil.rtrim( sCtrlAV47MaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30HisProFec1_PARM", localUtil.ttoc( AV30HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30HisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30HisProFec1_CTRL", GXutil.rtrim( sCtrlAV30HisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31HisProFec2_PARM", localUtil.ttoc( AV31HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31HisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31HisProFec2_CTRL", GXutil.rtrim( sCtrlAV31HisProFec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV97OperarioFrom, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV97OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV97OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV97OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV98OperarioTo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV98OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV98OperarioTo_CTRL", GXutil.rtrim( sCtrlAV98OperarioTo));
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
      we22H2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553774", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenmaquinadp_wc.js", "?202682115553774", false, true);
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

   public void subsflControlProps_332( )
   {
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__EMPRCOD_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQCOD_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQDSC_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPRODTF_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PARCOD_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROREO_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROKGR_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORKILO_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROMTR_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORMETRO_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROLOT_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MINUTOS_"+sGXsfl_33_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__TOTALTIEMPOMAQUINA_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_332( )
   {
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__EMPRCOD_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQCOD_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQDSC_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPRODTF_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PARCOD_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROREO_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROKGR_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORKILO_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROMTR_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORMETRO_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROLOT_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MINUTOS_"+sGXsfl_33_fel_idx ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__TOTALTIEMPOMAQUINA_"+sGXsfl_33_fel_idx ;
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb22H0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_33_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod()),GXutil.rtrim( localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname,localUtil.ttoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisproreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Porkilo(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Pormetro(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Hisprolot()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Minutos()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem)AV79SDTInformeProduccionResumenMaquina.getgxTv_SdtSDTInformeProduccionResumenMaquina_Maquina().elementAt(-1+AV101GXV1)).getgxTv_SdtSDTInformeProduccionResumenMaquina_MaquinaItem_Totaltiempomaquina()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes22H2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"33\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Reoperado", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Minutos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Totaltiempo Maquina", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      lblTextblock_maquina_Internalname = sPrefix+"TEXTBLOCK_MAQUINA" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__EMPRCOD" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQCOD" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MAQDSC" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPRODTF" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PARCOD" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROREO" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROKGR" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORKILO" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROMTR" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__PORMETRO" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__HISPROLOT" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__MINUTOS" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_MAQUINA__TOTALTIEMPOMAQUINA" ;
      edtavTotvalue_hisprokgr_Internalname = sPrefix+"vTOTVALUE_HISPROKGR" ;
      edtavTotvalue_hispromtr_Internalname = sPrefix+"vTOTVALUE_HISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_TOTALMT" ;
      edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENMAQUINA_TOTALKG" ;
      edtavTotal_kg_Internalname = sPrefix+"vTOTAL_KG" ;
      edtavTotal_mt_Internalname = sPrefix+"vTOTAL_MT" ;
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
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_hispromtr_Jsonclick = "" ;
      edtavTotvalue_hispromtr_Enabled = 1 ;
      edtavTotvalue_hisprokgr_Jsonclick = "" ;
      edtavTotvalue_hisprokgr_Enabled = 1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled = -1 ;
      edtavHisprodtf_Jsonclick = "" ;
      edtavHisprodtf_Visible = 1 ;
      edtavHisprodti_Jsonclick = "" ;
      edtavHisprodti_Visible = 1 ;
      edtavTotal_mt_Jsonclick = "" ;
      edtavTotal_mt_Visible = 1 ;
      edtavTotal_kg_Jsonclick = "" ;
      edtavTotal_kg_Visible = 1 ;
      edtavSdtinformeproduccionresumenmaquina_totalkg_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_totalkg_Visible = 1 ;
      edtavSdtinformeproduccionresumenmaquina_totalmt_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenmaquina_totalmt_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV46MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV47MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV30HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV31HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV97OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZ9'},{av:'AV98OperarioTo',fld:'vOPERARIOTO',pic:'ZZZ9'},{av:'AV79SDTInformeProduccionResumenMaquina',fld:'vSDTINFORMEPRODUCCIONRESUMENMAQUINA',pic:''},{av:'nRC_GXsfl_33',ctrl:'GRID',prop:'GridRC',grid:33},{av:'AV86Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV88Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV20GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV21GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV86Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV88Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV87TotValue_HisProKgr',fld:'vTOTVALUE_HISPROKGR',pic:''},{av:'AV89TotValue_HisProMtr',fld:'vTOTVALUE_HISPROMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1122H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV46MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV47MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV30HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV31HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV97OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZ9'},{av:'AV98OperarioTo',fld:'vOPERARIOTO',pic:'ZZZ9'},{av:'AV79SDTInformeProduccionResumenMaquina',fld:'vSDTINFORMEPRODUCCIONRESUMENMAQUINA',pic:''},{av:'nRC_GXsfl_33',ctrl:'GRID',prop:'GridRC',grid:33},{av:'AV86Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV88Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1222H2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115Pgmname',fld:'vPGMNAME',pic:''},{av:'AV11EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV46MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV47MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV30HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV31HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV97OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZ9'},{av:'AV98OperarioTo',fld:'vOPERARIOTO',pic:'ZZZ9'},{av:'AV79SDTInformeProduccionResumenMaquina',fld:'vSDTINFORMEPRODUCCIONRESUMENMAQUINA',pic:''},{av:'nRC_GXsfl_33',ctrl:'GRID',prop:'GridRC',grid:33},{av:'AV86Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV88Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1622H2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1322H2',iparms:[{av:'AV79SDTInformeProduccionResumenMaquina',fld:'vSDTINFORMEPRODUCCIONRESUMENMAQUINA',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_33',ctrl:'GRID',prop:'GridRC',grid:33}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv14',iparms:[]");
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
      wcpOAV11EmprCod = "" ;
      wcpOAV46MaqCod1 = "" ;
      wcpOAV47MaqCod2 = "" ;
      wcpOAV30HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV31HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV11EmprCod = "" ;
      AV46MaqCod1 = "" ;
      AV47MaqCod2 = "" ;
      AV30HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV31HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV115Pgmname = "" ;
      AV79SDTInformeProduccionResumenMaquina = new app.produccion.SdtSDTInformeProduccionResumenMaquina(remoteHandle, context);
      AV86Tot_HisProKgr = DecimalUtil.ZERO ;
      AV88Tot_HisProMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      AV83TOTAL_KG = DecimalUtil.ZERO ;
      AV84TOTAL_MT = DecimalUtil.ZERO ;
      AV29HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      AV28HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV87TotValue_HisProKgr = "" ;
      AV89TotValue_HisProMtr = "" ;
      GXv_int2 = new byte[1] ;
      AV90Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV91EmprNom = "" ;
      AV92UsurCod = "" ;
      GXt_SdtSDTInformeProduccionResumenMaquina7 = new app.produccion.SdtSDTInformeProduccionResumenMaquina(remoteHandle, context);
      GXv_SdtSDTInformeProduccionResumenMaquina8 = new app.produccion.SdtSDTInformeProduccionResumenMaquina[1] ;
      AV80SDTInformeProduccionResumenMaquina_Maquina = new app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem(remoteHandle, context);
      AV32HisProKgr = DecimalUtil.ZERO ;
      AV93TTotk = DecimalUtil.ZERO ;
      AV34HisProMtr = DecimalUtil.ZERO ;
      AV94TTotMt = DecimalUtil.ZERO ;
      AV78WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14ExcelFilename = "" ;
      GXv_char6 = new String[1] ;
      AV12ErrorMessage = "" ;
      GXv_char5 = new String[1] ;
      AV63Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV24GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV85SDTInformeProduccionResumenMaquina_MaquinaItem = new app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem(remoteHandle, context);
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H022H2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H022H2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      lblTextblock_maquina_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV11EmprCod = "" ;
      sCtrlAV27HisEstReo = "" ;
      sCtrlAV46MaqCod1 = "" ;
      sCtrlAV47MaqCod2 = "" ;
      sCtrlAV30HisProFec1 = "" ;
      sCtrlAV31HisProFec2 = "" ;
      sCtrlAV97OperarioFrom = "" ;
      sCtrlAV98OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenmaquinadp_wc__default(),
         new Object[] {
             new Object[] {
            H022H2_A1525HisProKgr, H022H2_A1526HisProMtr
            }
         }
      );
      AV115Pgmname = "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
      /* GeneXus formulas. */
      AV115Pgmname = "Produccion.InformeProduccionResumenMaquinaDP_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled = 0 ;
      edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled = 0 ;
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      edtavTotvalue_hispromtr_Enabled = 0 ;
   }

   private byte wcpOAV27HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV27HisEstReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV25Grulec ;
   private byte AV41lecotex ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV97OperarioFrom ;
   private short wcpOAV98OperarioTo ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV97OperarioFrom ;
   private short AV98OperarioTo ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_33 ;
   private int nGXsfl_33_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV101GXV1 ;
   private int edtavPgmname_Visible ;
   private int edtavSdtinformeproduccionresumenmaquina_totalmt_Visible ;
   private int edtavSdtinformeproduccionresumenmaquina_totalkg_Visible ;
   private int edtavTotal_kg_Visible ;
   private int edtavTotal_mt_Visible ;
   private int edtavHisprodti_Visible ;
   private int edtavHisprodtf_Visible ;
   private int subGrid_Islastpage ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Enabled ;
   private int edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Enabled ;
   private int edtavTotvalue_hisprokgr_Enabled ;
   private int edtavTotvalue_hispromtr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_33_fel_idx=1 ;
   private int AV118GXV17 ;
   private int AV55PageToGo ;
   private int AV119GXV18 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV20GridCurrentPage ;
   private long AV21GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV86Tot_HisProKgr ;
   private java.math.BigDecimal AV88Tot_HisProMtr ;
   private java.math.BigDecimal AV83TOTAL_KG ;
   private java.math.BigDecimal AV84TOTAL_MT ;
   private java.math.BigDecimal AV32HisProKgr ;
   private java.math.BigDecimal AV93TTotk ;
   private java.math.BigDecimal AV34HisProMtr ;
   private java.math.BigDecimal AV94TTotMt ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String wcpOAV11EmprCod ;
   private String wcpOAV46MaqCod1 ;
   private String wcpOAV47MaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV11EmprCod ;
   private String AV46MaqCod1 ;
   private String AV47MaqCod2 ;
   private String sGXsfl_33_idx="0001" ;
   private String AV115Pgmname ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_totalmt_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_totalmt_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_totalkg_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_totalkg_Jsonclick ;
   private String edtavTotal_kg_Internalname ;
   private String edtavTotal_kg_Jsonclick ;
   private String edtavTotal_mt_Internalname ;
   private String edtavTotal_mt_Jsonclick ;
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
   private String edtavTotvalue_hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Internalname ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Internalname ;
   private String edtavTotvalue_hispromtr_Internalname ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String AV90Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV91EmprNom ;
   private String AV92UsurCod ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_hisprokgr_Jsonclick ;
   private String edtavTotvalue_hispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_maquina_Internalname ;
   private String lblTextblock_maquina_Jsonclick ;
   private String sCtrlAV11EmprCod ;
   private String sCtrlAV27HisEstReo ;
   private String sCtrlAV46MaqCod1 ;
   private String sCtrlAV47MaqCod2 ;
   private String sCtrlAV30HisProFec1 ;
   private String sCtrlAV31HisProFec2 ;
   private String sCtrlAV97OperarioFrom ;
   private String sCtrlAV98OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__emprcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__maqcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__maqdsc_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprodtf_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__parcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisproreo_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprokgr_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__porkilo_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hispromtr_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__pormetro_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__hisprolot_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__minutos_Jsonclick ;
   private String edtavSdtinformeproduccionresumenmaquina_maquina__totaltiempomaquina_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30HisProFec1 ;
   private java.util.Date wcpOAV31HisProFec2 ;
   private java.util.Date AV30HisProFec1 ;
   private java.util.Date AV31HisProFec2 ;
   private java.util.Date AV29HisProDTI ;
   private java.util.Date AV28HisProDTF ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV33 ;
   private boolean gx_refresh_fired ;
   private String AV87TotValue_HisProKgr ;
   private String AV89TotValue_HisProMtr ;
   private String AV14ExcelFilename ;
   private String AV12ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV63Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H022H2_A1525HisProKgr ;
   private java.math.BigDecimal[] H022H2_A1526HisProMtr ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina AV79SDTInformeProduccionResumenMaquina ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina GXt_SdtSDTInformeProduccionResumenMaquina7 ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina GXv_SdtSDTInformeProduccionResumenMaquina8[] ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem AV80SDTInformeProduccionResumenMaquina_Maquina ;
   private app.produccion.SdtSDTInformeProduccionResumenMaquina_MaquinaItem AV85SDTInformeProduccionResumenMaquina_MaquinaItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV24GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV78WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class informeproduccionresumenmaquinadp_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H022H2", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ? and MaqCod >= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
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
      }
   }

}

