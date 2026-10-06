package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenturnodp_wc_impl extends GXWebComponent
{
   public informeproduccionresumenturnodp_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenturnodp_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenturnodp_wc_impl.class ));
   }

   public informeproduccionresumenturnodp_wc_impl( int remoteHandle ,
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
               AV5EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
               AV13HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
               AV24MaqCod1 = httpContext.GetPar( "MaqCod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCod1", AV24MaqCod1);
               AV25MaqCod2 = httpContext.GetPar( "MaqCod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MaqCod2", AV25MaqCod2);
               AV16HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16HisProFec1", localUtil.ttoc( AV16HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV17HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HisProFec2", localUtil.ttoc( AV17HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV70OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70OperarioFrom), 6, 0));
               AV71OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71OperarioTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5EmprCod,Byte.valueOf(AV13HisEstReo),AV24MaqCod1,AV25MaqCod2,AV16HisProFec1,AV17HisProFec2,Integer.valueOf(AV70OperarioFrom),Integer.valueOf(AV71OperarioTo)});
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
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      edtavTurnokgs4_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs4_Visible), 5, 0), !bGXsfl_32_Refreshing);
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
      AV76Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV24MaqCod1 = httpContext.GetPar( "MaqCod1") ;
      AV25MaqCod2 = httpContext.GetPar( "MaqCod2") ;
      AV16HisProFec1 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec1")) ;
      AV17HisProFec2 = localUtil.parseDTimeParm( httpContext.GetPar( "HisProFec2")) ;
      AV70OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV71OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV34SDTProduccionResumenTurno);
      AV48TotTurnoKgs1 = CommonUtil.decimalVal( httpContext.GetPar( "TotTurnoKgs1"), ".") ;
      AV49TotTurnoKgs2 = CommonUtil.decimalVal( httpContext.GetPar( "TotTurnoKgs2"), ".") ;
      AV50TotTurnoKgs3 = CommonUtil.decimalVal( httpContext.GetPar( "TotTurnoKgs3"), ".") ;
      AV51TotTurnoKgs4 = CommonUtil.decimalVal( httpContext.GetPar( "TotTurnoKgs4"), ".") ;
      AV40TotalTurnoKgs1 = CommonUtil.decimalVal( httpContext.GetPar( "TotalTurnoKgs1"), ".") ;
      AV41TotalTurnoKgs2 = CommonUtil.decimalVal( httpContext.GetPar( "TotalTurnoKgs2"), ".") ;
      AV42TotalTurnoKgs3 = CommonUtil.decimalVal( httpContext.GetPar( "TotalTurnoKgs3"), ".") ;
      AV43TotalTurnoKgs4 = CommonUtil.decimalVal( httpContext.GetPar( "TotalTurnoKgs4"), ".") ;
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      edtavTurnokgs4_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs4_Visible), 5, 0), !bGXsfl_32_Refreshing);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa22T2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen Turno", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenturnodp_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV24MaqCod1)),GXutil.URLEncode(GXutil.rtrim(AV25MaqCod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV16HisProFec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV17HisProFec2)),GXutil.URLEncode(GXutil.ltrimstr(AV70OperarioFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV71OperarioTo,6,0))}, new String[] {"EmprCod","HisEstReo","MaqCod1","MaqCod2","HisProFec1","HisProFec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTPRODUCCIONRESUMENTURNO", getSecureSignedToken( sPrefix, AV34SDTProduccionResumenTurno));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV48TotTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV49TotTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV50TotTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV51TotTurnoKgs4, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV40TotalTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV41TotalTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV42TotalTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV43TotalTurnoKgs4, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtproduccionresumenturno", AV34SDTProduccionResumenTurno);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtproduccionresumenturno", AV34SDTProduccionResumenTurno);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_Sdtproduccionresumenturno", getSecureSignedToken( sPrefix, AV34SDTProduccionResumenTurno));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_32, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV9GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV10GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5EmprCod", GXutil.rtrim( wcpOAV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV13HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24MaqCod1", GXutil.rtrim( wcpOAV24MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25MaqCod2", GXutil.rtrim( wcpOAV25MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV16HisProFec1", localUtil.ttoc( wcpOAV16HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17HisProFec2", localUtil.ttoc( wcpOAV17HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV70OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV70OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV71OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV71OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV24MaqCod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV25MaqCod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV16HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV17HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV70OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV71OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTPRODUCCIONRESUMENTURNO", AV34SDTProduccionResumenTurno);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTPRODUCCIONRESUMENTURNO", AV34SDTProduccionResumenTurno);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTPRODUCCIONRESUMENTURNO", getSecureSignedToken( sPrefix, AV34SDTProduccionResumenTurno));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS1", GXutil.ltrim( localUtil.ntoc( AV48TotTurnoKgs1, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV48TotTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS2", GXutil.ltrim( localUtil.ntoc( AV49TotTurnoKgs2, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV49TotTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS3", GXutil.ltrim( localUtil.ntoc( AV50TotTurnoKgs3, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV50TotTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS4", GXutil.ltrim( localUtil.ntoc( AV51TotTurnoKgs4, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV51TotTurnoKgs4, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS1", GXutil.ltrim( localUtil.ntoc( AV40TotalTurnoKgs1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV40TotalTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS2", GXutil.ltrim( localUtil.ntoc( AV41TotalTurnoKgs2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV41TotalTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS3", GXutil.ltrim( localUtil.ntoc( AV42TotalTurnoKgs3, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV42TotalTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS4", GXutil.ltrim( localUtil.ntoc( AV43TotalTurnoKgs4, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV43TotalTurnoKgs4, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTURNOKGS4_Visible", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs4_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm22T2( )
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
      return "Produccion.InformeProduccionResumenTurnoDP_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Turno", "") ;
   }

   public void wb22T0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenturnodp_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_22T2( true) ;
      }
      else
      {
         wb_table1_19_22T2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_22T2e( boolean wbgen )
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
         startgridcontrol32( ) ;
      }
      if ( wbEnd == 32 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_32 = (int)(nGXsfl_32_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV74GXV1 = nGXsfl_32_idx ;
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
         wb_table2_41_22T2( true) ;
      }
      else
      {
         wb_table2_41_22T2( false) ;
      }
      return  ;
   }

   public void wb_table2_41_22T2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV9GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV10GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV76Pgmname), GXutil.rtrim( localUtil.format( AV76Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 32 )
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
               AV74GXV1 = nGXsfl_32_idx ;
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

   public void start22T2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen Turno", ""), (short)(0)) ;
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
            strup22T0( ) ;
         }
      }
   }

   public void ws22T2( )
   {
      start22T2( ) ;
      evt22T2( ) ;
   }

   public void evt22T2( )
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
                              strup22T0( ) ;
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
                              strup22T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1122T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1222T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1322T2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22T0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
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
                              strup22T0( ) ;
                           }
                           nGXsfl_32_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_322( ) ;
                           AV74GXV1 = (int)(nGXsfl_32_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV34SDTProduccionResumenTurno.size() >= AV74GXV1 ) && ( AV74GXV1 > 0 ) )
                           {
                              AV34SDTProduccionResumenTurno.currentItem( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)) );
                              if ( GXutil.len( sPrefix) == 0 )
                              {
                                 AV5EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
                              }
                              AV58TurnoKgs1 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs1_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs1_Internalname, GXutil.ltrimstr( AV58TurnoKgs1, 9, 2));
                              AV59TurnoKgs2 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs2_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs2_Internalname, GXutil.ltrimstr( AV59TurnoKgs2, 9, 2));
                              AV60TurnoKgs3 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs3_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs3_Internalname, GXutil.ltrimstr( AV60TurnoKgs3, 9, 2));
                              AV61TurnoKgs4 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs4_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs4_Internalname, GXutil.ltrimstr( AV61TurnoKgs4, 9, 2));
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
                                       GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1422T2 ();
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
                                       GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1522T2 ();
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
                                       GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1622T2 ();
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
                                       GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoExportCSV' */
                                       e1722T2 ();
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
                                    strup22T0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
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

   public void we22T2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm22T2( ) ;
         }
      }
   }

   public void pa22T2( )
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
            GX_FocusControl = edtavTotvalueturnokgs1_Internalname ;
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
      subsflControlProps_322( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         sendrow_322( ) ;
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV76Pgmname ,
                                 byte AV13HisEstReo ,
                                 String AV24MaqCod1 ,
                                 String AV25MaqCod2 ,
                                 java.util.Date AV16HisProFec1 ,
                                 java.util.Date AV17HisProFec2 ,
                                 int AV70OperarioFrom ,
                                 int AV71OperarioTo ,
                                 GXBaseCollection<app.SdtProduccionResumenTurno_SDT> AV34SDTProduccionResumenTurno ,
                                 java.math.BigDecimal AV48TotTurnoKgs1 ,
                                 java.math.BigDecimal AV49TotTurnoKgs2 ,
                                 java.math.BigDecimal AV50TotTurnoKgs3 ,
                                 java.math.BigDecimal AV51TotTurnoKgs4 ,
                                 java.math.BigDecimal AV40TotalTurnoKgs1 ,
                                 java.math.BigDecimal AV41TotalTurnoKgs2 ,
                                 java.math.BigDecimal AV42TotalTurnoKgs3 ,
                                 java.math.BigDecimal AV43TotalTurnoKgs4 ,
                                 String AV5EmprCod ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1522T2 ();
      GRID_nCurrentRecord = 0 ;
      rf22T2( ) ;
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
      rf22T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV76Pgmname = "Produccion.InformeProduccionResumenTurnoDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtproduccionresumenturno__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionresumenturno__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionresumenturno__maqdsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs1_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs3_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs4_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTotvalueturnokgs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs1_Enabled), 5, 0), true);
      edtavTotvalueturnokgs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs2_Enabled), 5, 0), true);
      edtavTotvalueturnokgs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs3_Enabled), 5, 0), true);
      edtavTotvalueturnokgs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs4_Enabled), 5, 0), true);
   }

   public void rf22T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(32) ;
      /* Execute user event: Refresh */
      e1522T2 ();
      nGXsfl_32_idx = 1 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_322( ) ;
      bGXsfl_32_Refreshing = true ;
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
         subsflControlProps_322( ) ;
         e1622T2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_32_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1622T2 ();
         }
         wbEnd = (short)(32) ;
         wb22T0( ) ;
      }
      bGXsfl_32_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22T2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTPRODUCCIONRESUMENTURNO", AV34SDTProduccionResumenTurno);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTPRODUCCIONRESUMENTURNO", AV34SDTProduccionResumenTurno);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTPRODUCCIONRESUMENTURNO", getSecureSignedToken( sPrefix, AV34SDTProduccionResumenTurno));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS1", GXutil.ltrim( localUtil.ntoc( AV48TotTurnoKgs1, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV48TotTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS2", GXutil.ltrim( localUtil.ntoc( AV49TotTurnoKgs2, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV49TotTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS3", GXutil.ltrim( localUtil.ntoc( AV50TotTurnoKgs3, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV50TotTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTTURNOKGS4", GXutil.ltrim( localUtil.ntoc( AV51TotTurnoKgs4, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV51TotTurnoKgs4, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS1", GXutil.ltrim( localUtil.ntoc( AV40TotalTurnoKgs1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV40TotalTurnoKgs1, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS2", GXutil.ltrim( localUtil.ntoc( AV41TotalTurnoKgs2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV41TotalTurnoKgs2, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS3", GXutil.ltrim( localUtil.ntoc( AV42TotalTurnoKgs3, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV42TotalTurnoKgs3, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALTURNOKGS4", GXutil.ltrim( localUtil.ntoc( AV43TotalTurnoKgs4, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV43TotalTurnoKgs4, "ZZZZZ9.99")));
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
      return AV34SDTProduccionResumenTurno.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV76Pgmname, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, AV34SDTProduccionResumenTurno, AV48TotTurnoKgs1, AV49TotTurnoKgs2, AV50TotTurnoKgs3, AV51TotTurnoKgs4, AV40TotalTurnoKgs1, AV41TotalTurnoKgs2, AV42TotalTurnoKgs3, AV43TotalTurnoKgs4, AV5EmprCod, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV76Pgmname = "Produccion.InformeProduccionResumenTurnoDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76Pgmname", AV76Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtproduccionresumenturno__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtproduccionresumenturno__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtproduccionresumenturno__maqdsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs1_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs3_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTurnokgs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs4_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTotvalueturnokgs1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs1_Enabled), 5, 0), true);
      edtavTotvalueturnokgs2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs2_Enabled), 5, 0), true);
      edtavTotvalueturnokgs3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs3_Enabled), 5, 0), true);
      edtavTotvalueturnokgs4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalueturnokgs4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueturnokgs4_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1422T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtproduccionresumenturno"), AV34SDTProduccionResumenTurno);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTPRODUCCIONRESUMENTURNO"), AV34SDTProduccionResumenTurno);
         /* Read saved values. */
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV9GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV10GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
         wcpOAV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV24MaqCod1") ;
         wcpOAV25MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV25MaqCod2") ;
         wcpOAV16HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV16HisProFec1"), 0) ;
         wcpOAV17HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17HisProFec2"), 0) ;
         wcpOAV70OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV71OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_32_fel_idx = 0 ;
         while ( nGXsfl_32_fel_idx < nRC_GXsfl_32 )
         {
            nGXsfl_32_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_fel_idx+1) ;
            sGXsfl_32_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_322( ) ;
            AV74GXV1 = (int)(nGXsfl_32_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV34SDTProduccionResumenTurno.size() >= AV74GXV1 ) && ( AV74GXV1 > 0 ) )
            {
               AV34SDTProduccionResumenTurno.currentItem( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)) );
               if ( GXutil.len( sPrefix) == 0 )
               {
                  AV5EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
               }
               AV58TurnoKgs1 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs1_Internalname)) ;
               AV59TurnoKgs2 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs2_Internalname)) ;
               AV60TurnoKgs3 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs3_Internalname)) ;
               AV61TurnoKgs4 = localUtil.ctond( httpContext.cgiGet( edtavTurnokgs4_Internalname)) ;
            }
         }
         if ( nGXsfl_32_fel_idx == 0 )
         {
            nGXsfl_32_idx = 1 ;
            sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_322( ) ;
         }
         nGXsfl_32_fel_idx = 1 ;
         /* Read variables values. */
         AV52TotValueTurnoKgs1 = httpContext.cgiGet( edtavTotvalueturnokgs1_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueTurnoKgs1", AV52TotValueTurnoKgs1);
         AV53TotValueTurnoKgs2 = httpContext.cgiGet( edtavTotvalueturnokgs2_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotValueTurnoKgs2", AV53TotValueTurnoKgs2);
         AV54TotValueTurnoKgs3 = httpContext.cgiGet( edtavTotvalueturnokgs3_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTurnoKgs3", AV54TotValueTurnoKgs3);
         AV55TotValueTurnoKgs4 = httpContext.cgiGet( edtavTotvalueturnokgs4_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValueTurnoKgs4", AV55TotValueTurnoKgs4);
         AV76Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76Pgmname", AV76Pgmname);
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
      e1422T2 ();
      if (returnInSub) return;
   }

   public void e1422T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV67Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenturnodp_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Station = GXt_char1 ;
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV65EmprNom ;
      GXv_char4[0] = AV66UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenturnodp_wc_impl.this.AV5EmprCod = GXv_char2[0] ;
      informeproduccionresumenturnodp_wc_impl.this.AV65EmprNom = GXv_char3[0] ;
      informeproduccionresumenturnodp_wc_impl.this.AV66UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      /* Execute user subroutine: 'INICIOBARRAPROGRESO' */
      S132 ();
      if (returnInSub) return;
      GXt_objcol_SdtProduccionResumenTurno_SDT5 = AV34SDTProduccionResumenTurno ;
      GXv_objcol_SdtProduccionResumenTurno_SDT6[0] = GXt_objcol_SdtProduccionResumenTurno_SDT5 ;
      new app.produccionresumenturno_dp(remoteHandle, context).execute( AV5EmprCod, AV13HisEstReo, AV24MaqCod1, AV25MaqCod2, AV16HisProFec1, AV17HisProFec2, AV70OperarioFrom, AV71OperarioTo, GXv_objcol_SdtProduccionResumenTurno_SDT6) ;
      GXt_objcol_SdtProduccionResumenTurno_SDT5 = GXv_objcol_SdtProduccionResumenTurno_SDT6[0] ;
      AV34SDTProduccionResumenTurno = GXt_objcol_SdtProduccionResumenTurno_SDT5 ;
      gx_BV32 = true ;
   }

   public void e1522T2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV63WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV63WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S162 ();
      if (returnInSub) return;
      AV9GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9GridCurrentPage), 10, 0));
      AV10GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV62WebSession.getValue("InformeProduccionResumenWW"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV62WebSession.remove("InformeProduccionResumenWW");
         AV33ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV33ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV33ProgressIndicator.hide();
      }
      /* Execute user subroutine: 'FINBARRAPROGRESO' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33ProgressIndicator", AV33ProgressIndicator);
   }

   public void e1122T2( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e1222T2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1622T2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV74GXV1 = 1 ;
      while ( AV74GXV1 <= AV34SDTProduccionResumenTurno.size() )
      {
         AV34SDTProduccionResumenTurno.currentItem( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)) );
         AV58TurnoKgs1 = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs1_Internalname, GXutil.ltrimstr( AV58TurnoKgs1, 9, 2));
         AV59TurnoKgs2 = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs2_Internalname, GXutil.ltrimstr( AV59TurnoKgs2, 9, 2));
         AV60TurnoKgs3 = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs3_Internalname, GXutil.ltrimstr( AV60TurnoKgs3, 9, 2));
         AV61TurnoKgs4 = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs4_Internalname, GXutil.ltrimstr( AV61TurnoKgs4, 9, 2));
         AV77GXV3 = 1 ;
         while ( AV77GXV3 <= ((app.SdtProduccionResumenTurno_SDT)(AV34SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().size() )
         {
            AV35SDTProduccionResumenTurno_Turnos = (app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT)(AV34SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().elementAt(-1+AV77GXV3));
            if ( AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 1 )
            {
               AV58TurnoKgs1 = AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs1_Internalname, GXutil.ltrimstr( AV58TurnoKgs1, 9, 2));
            }
            else if ( AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 2 )
            {
               AV59TurnoKgs2 = AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs2_Internalname, GXutil.ltrimstr( AV59TurnoKgs2, 9, 2));
            }
            else if ( AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 3 )
            {
               AV60TurnoKgs3 = AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs3_Internalname, GXutil.ltrimstr( AV60TurnoKgs3, 9, 2));
            }
            else if ( AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Turno() == 4 )
            {
               AV61TurnoKgs4 = AV35SDTProduccionResumenTurno_Turnos.getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs4_Internalname, GXutil.ltrimstr( AV61TurnoKgs4, 9, 2));
            }
            AV77GXV3 = (int)(AV77GXV3+1) ;
         }
         AV40TotalTurnoKgs1 = AV40TotalTurnoKgs1.add(AV58TurnoKgs1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TotalTurnoKgs1", GXutil.ltrimstr( AV40TotalTurnoKgs1, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV40TotalTurnoKgs1, "ZZZZZ9.99")));
         AV41TotalTurnoKgs2 = AV41TotalTurnoKgs2.add(AV59TurnoKgs2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TotalTurnoKgs2", GXutil.ltrimstr( AV41TotalTurnoKgs2, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV41TotalTurnoKgs2, "ZZZZZ9.99")));
         AV42TotalTurnoKgs3 = AV42TotalTurnoKgs3.add(AV60TurnoKgs3) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TotalTurnoKgs3", GXutil.ltrimstr( AV42TotalTurnoKgs3, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV42TotalTurnoKgs3, "ZZZZZ9.99")));
         AV43TotalTurnoKgs4 = AV43TotalTurnoKgs4.add(AV61TurnoKgs4) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TotalTurnoKgs4", GXutil.ltrimstr( AV43TotalTurnoKgs4, 9, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV43TotalTurnoKgs4, "ZZZZZ9.99")));
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S172 ();
         if (returnInSub) return;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(32) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_322( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_32_Refreshing )
         {
            httpContext.doAjaxLoad(32, GridRow);
         }
         AV74GXV1 = (int)(AV74GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e1322T2( )
   {
      AV74GXV1 = (int)(nGXsfl_32_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV74GXV1 > 0 ) && ( AV34SDTProduccionResumenTurno.size() >= AV74GXV1 ) )
      {
         AV34SDTProduccionResumenTurno.currentItem( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      AV62WebSession.setValue(httpContext.getMessage( "&SDTProduccionResumenTurno", ""), AV34SDTProduccionResumenTurno.toJSonString(false));
      GXv_char4[0] = AV7ExcelFilename ;
      GXv_char3[0] = AV6ErrorMessage ;
      new app.produccion.informeproduccionresumenturnodp_wcexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      informeproduccionresumenturnodp_wc_impl.this.AV7ExcelFilename = GXv_char4[0] ;
      informeproduccionresumenturnodp_wc_impl.this.AV6ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV7ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV7ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV6ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      AV22i = 1 ;
      while ( AV22i <= ((app.SdtProduccionResumenTurno_SDT)(AV34SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().size() )
      {
         AV58TurnoKgs1 = ((app.SdtProduccionResumenTurno_SDT_TurnosItem)((app.SdtProduccionResumenTurno_SDT)(AV34SDTProduccionResumenTurno.currentItem())).getgxTv_SdtProduccionResumenTurno_SDT_Turnos().elementAt(-1+AV22i)).getgxTv_SdtProduccionResumenTurno_SDT_TurnosItem_Kilosturno() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTurnokgs1_Internalname, GXutil.ltrimstr( AV58TurnoKgs1, 9, 2));
         AV22i = (int)(AV22i+1) ;
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( AV34SDTProduccionResumenTurno.size() > 0 )
      {
         AV62WebSession.setValue("SDTProduccionResumenTurno", AV34SDTProduccionResumenTurno.toJSonString(false));
      }
      if ( GXutil.strcmp(AV36Session.getValue(AV76Pgmname+"GridState"), "") == 0 )
      {
         AV11GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV76Pgmname+"GridState"), null, null);
      }
      else
      {
         AV11GridState.fromxml(AV36Session.getValue(AV76Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV11GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV11GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV11GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV11GridState.fromxml(AV36Session.getValue(AV76Pgmname+"GridState"), null, null);
      AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV5EmprCod)==0) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5EmprCod );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! (0==AV13HisEstReo) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13HisEstReo, 1, 0) );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV24MaqCod1)==0) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD1" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV24MaqCod1 );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV25MaqCod2)==0) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD2" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV25MaqCod2 );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV16HisProFec1) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC1" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV16HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV17HisProFec2) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC2" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV17HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! (0==AV70OperarioFrom) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOFROM" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV70OperarioFrom, 6, 0) );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      if ( ! (0==AV71OperarioTo) )
      {
         AV12GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOTO" );
         AV12GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV71OperarioTo, 6, 0) );
         AV11GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV12GridStateFilterValue, 0);
      }
      AV11GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV11GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV76Pgmname+"GridState", AV11GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TurnoKgs4)==0) ) )
      {
         edtavTurnokgs4_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTurnokgs4_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurnokgs4_Visible), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void S152( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV48TotTurnoKgs1 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotTurnoKgs1", GXutil.ltrimstr( AV48TotTurnoKgs1, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS1", getSecureSignedToken( sPrefix, localUtil.format( AV48TotTurnoKgs1, "ZZZZZ9.99")));
      AV49TotTurnoKgs2 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TotTurnoKgs2", GXutil.ltrimstr( AV49TotTurnoKgs2, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS2", getSecureSignedToken( sPrefix, localUtil.format( AV49TotTurnoKgs2, "ZZZZZ9.99")));
      AV50TotTurnoKgs3 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TotTurnoKgs3", GXutil.ltrimstr( AV50TotTurnoKgs3, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS3", getSecureSignedToken( sPrefix, localUtil.format( AV50TotTurnoKgs3, "ZZZZZ9.99")));
      AV51TotTurnoKgs4 = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotTurnoKgs4", GXutil.ltrimstr( AV51TotTurnoKgs4, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTTURNOKGS4", getSecureSignedToken( sPrefix, localUtil.format( AV51TotTurnoKgs4, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         AV52TotValueTurnoKgs1 = localUtil.format( AV48TotTurnoKgs1, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueTurnoKgs1", AV52TotValueTurnoKgs1);
         AV53TotValueTurnoKgs2 = localUtil.format( AV49TotTurnoKgs2, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotValueTurnoKgs2", AV53TotValueTurnoKgs2);
         AV54TotValueTurnoKgs3 = localUtil.format( AV50TotTurnoKgs3, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTurnoKgs3", AV54TotValueTurnoKgs3);
         AV55TotValueTurnoKgs4 = localUtil.format( AV51TotTurnoKgs4, "ZZZZZ9.99") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValueTurnoKgs4", AV55TotValueTurnoKgs4);
      }
      AV52TotValueTurnoKgs1 = localUtil.format( AV40TotalTurnoKgs1, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueTurnoKgs1", AV52TotValueTurnoKgs1);
      AV53TotValueTurnoKgs2 = localUtil.format( AV41TotalTurnoKgs2, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotValueTurnoKgs2", AV53TotValueTurnoKgs2);
      AV54TotValueTurnoKgs3 = localUtil.format( AV42TotalTurnoKgs3, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueTurnoKgs3", AV54TotValueTurnoKgs3);
      AV55TotValueTurnoKgs4 = localUtil.format( AV43TotalTurnoKgs4, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TotValueTurnoKgs4", AV55TotValueTurnoKgs4);
   }

   public void e1722T2( )
   {
      AV74GXV1 = (int)(nGXsfl_32_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV74GXV1 > 0 ) && ( AV34SDTProduccionResumenTurno.size() >= AV74GXV1 ) )
      {
         AV34SDTProduccionResumenTurno.currentItem( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)) );
      }
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      AV62WebSession.setValue(httpContext.getMessage( "&SDTProduccionResumenTurno", ""), AV34SDTProduccionResumenTurno.toJSonString(false));
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'INICIOBARRAPROGRESO' Routine */
      returnInSub = false ;
      AV62WebSession.setValue("InformeProduccionResumenWW_TUR", httpContext.getMessage( "FINALIZADO", ""));
      AV33ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV33ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV33ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV33ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV33ProgressIndicator.show();
   }

   public void S182( )
   {
      /* 'FINBARRAPROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV62WebSession.getValue("InformeProduccionResumenWW_TUR"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV62WebSession.remove("InformeProduccionResumenWW_TUR");
         AV33ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV33ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV33ProgressIndicator.hide();
      }
   }

   public void wb_table2_41_22T2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalueturnokgs1_Internalname, httpContext.getMessage( "Tot Value Turno Kgs1", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalueturnokgs1_Internalname, AV52TotValueTurnoKgs1, GXutil.rtrim( localUtil.format( AV52TotValueTurnoKgs1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalueturnokgs1_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalueturnokgs1_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalueturnokgs2_Internalname, httpContext.getMessage( "Tot Value Turno Kgs2", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalueturnokgs2_Internalname, AV53TotValueTurnoKgs2, GXutil.rtrim( localUtil.format( AV53TotValueTurnoKgs2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalueturnokgs2_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalueturnokgs2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalueturnokgs3_Internalname, httpContext.getMessage( "Tot Value Turno Kgs3", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalueturnokgs3_Internalname, AV54TotValueTurnoKgs3, GXutil.rtrim( localUtil.format( AV54TotValueTurnoKgs3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalueturnokgs3_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalueturnokgs3_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalueturnokgs4_Internalname, httpContext.getMessage( "Tot Value Turno Kgs4", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalueturnokgs4_Internalname, AV55TotValueTurnoKgs4, GXutil.rtrim( localUtil.format( AV55TotValueTurnoKgs4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalueturnokgs4_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalueturnokgs4_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_41_22T2e( true) ;
      }
      else
      {
         wb_table2_41_22T2e( false) ;
      }
   }

   public void wb_table1_19_22T2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_turno_Internalname, httpContext.getMessage( "Datos por Turno", ""), "", "", lblTextblock_turno_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenTurnoDP_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_22T2e( true) ;
      }
      else
      {
         wb_table1_19_22T2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
      AV13HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      AV24MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCod1", AV24MaqCod1);
      AV25MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MaqCod2", AV25MaqCod2);
      AV16HisProFec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16HisProFec1", localUtil.ttoc( AV16HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV17HisProFec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HisProFec2", localUtil.ttoc( AV17HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV70OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70OperarioFrom), 6, 0));
      AV71OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71OperarioTo), 6, 0));
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
      pa22T2( ) ;
      ws22T2( ) ;
      we22T2( ) ;
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
      sCtrlAV5EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV13HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV24MaqCod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV25MaqCod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV16HisProFec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV17HisProFec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV70OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV71OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa22T2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenturnodp_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa22T2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
         AV13HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
         AV24MaqCod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCod1", AV24MaqCod1);
         AV25MaqCod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MaqCod2", AV25MaqCod2);
         AV16HisProFec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16HisProFec1", localUtil.ttoc( AV16HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV17HisProFec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HisProFec2", localUtil.ttoc( AV17HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV70OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70OperarioFrom), 6, 0));
         AV71OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71OperarioTo), 6, 0));
      }
      wcpOAV5EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV5EmprCod") ;
      wcpOAV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV13HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24MaqCod1 = httpContext.cgiGet( sPrefix+"wcpOAV24MaqCod1") ;
      wcpOAV25MaqCod2 = httpContext.cgiGet( sPrefix+"wcpOAV25MaqCod2") ;
      wcpOAV16HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV16HisProFec1"), 0) ;
      wcpOAV17HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV17HisProFec2"), 0) ;
      wcpOAV70OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV70OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV71OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV71OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5EmprCod, wcpOAV5EmprCod) != 0 ) || ( AV13HisEstReo != wcpOAV13HisEstReo ) || ( GXutil.strcmp(AV24MaqCod1, wcpOAV24MaqCod1) != 0 ) || ( GXutil.strcmp(AV25MaqCod2, wcpOAV25MaqCod2) != 0 ) || !( GXutil.dateCompare(AV16HisProFec1, wcpOAV16HisProFec1) ) || !( GXutil.dateCompare(AV17HisProFec2, wcpOAV17HisProFec2) ) || ( AV70OperarioFrom != wcpOAV70OperarioFrom ) || ( AV71OperarioTo != wcpOAV71OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV5EmprCod = AV5EmprCod ;
      wcpOAV13HisEstReo = AV13HisEstReo ;
      wcpOAV24MaqCod1 = AV24MaqCod1 ;
      wcpOAV25MaqCod2 = AV25MaqCod2 ;
      wcpOAV16HisProFec1 = AV16HisProFec1 ;
      wcpOAV17HisProFec2 = AV17HisProFec2 ;
      wcpOAV70OperarioFrom = AV70OperarioFrom ;
      wcpOAV71OperarioTo = AV71OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5EmprCod) > 0 )
      {
         AV5EmprCod = httpContext.cgiGet( sCtrlAV5EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV5EmprCod);
      }
      else
      {
         AV5EmprCod = httpContext.cgiGet( sPrefix+"AV5EmprCod_PARM") ;
      }
      sCtrlAV13HisEstReo = httpContext.cgiGet( sPrefix+"AV13HisEstReo_CTRL") ;
      if ( GXutil.len( sCtrlAV13HisEstReo) > 0 )
      {
         AV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV13HisEstReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13HisEstReo", GXutil.str( AV13HisEstReo, 1, 0));
      }
      else
      {
         AV13HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV13HisEstReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24MaqCod1 = httpContext.cgiGet( sPrefix+"AV24MaqCod1_CTRL") ;
      if ( GXutil.len( sCtrlAV24MaqCod1) > 0 )
      {
         AV24MaqCod1 = httpContext.cgiGet( sCtrlAV24MaqCod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24MaqCod1", AV24MaqCod1);
      }
      else
      {
         AV24MaqCod1 = httpContext.cgiGet( sPrefix+"AV24MaqCod1_PARM") ;
      }
      sCtrlAV25MaqCod2 = httpContext.cgiGet( sPrefix+"AV25MaqCod2_CTRL") ;
      if ( GXutil.len( sCtrlAV25MaqCod2) > 0 )
      {
         AV25MaqCod2 = httpContext.cgiGet( sCtrlAV25MaqCod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25MaqCod2", AV25MaqCod2);
      }
      else
      {
         AV25MaqCod2 = httpContext.cgiGet( sPrefix+"AV25MaqCod2_PARM") ;
      }
      sCtrlAV16HisProFec1 = httpContext.cgiGet( sPrefix+"AV16HisProFec1_CTRL") ;
      if ( GXutil.len( sCtrlAV16HisProFec1) > 0 )
      {
         AV16HisProFec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV16HisProFec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16HisProFec1", localUtil.ttoc( AV16HisProFec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV16HisProFec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV16HisProFec1_PARM"), 0) ;
      }
      sCtrlAV17HisProFec2 = httpContext.cgiGet( sPrefix+"AV17HisProFec2_CTRL") ;
      if ( GXutil.len( sCtrlAV17HisProFec2) > 0 )
      {
         AV17HisProFec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV17HisProFec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17HisProFec2", localUtil.ttoc( AV17HisProFec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV17HisProFec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV17HisProFec2_PARM"), 0) ;
      }
      sCtrlAV70OperarioFrom = httpContext.cgiGet( sPrefix+"AV70OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV70OperarioFrom) > 0 )
      {
         AV70OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV70OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70OperarioFrom), 6, 0));
      }
      else
      {
         AV70OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV70OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV71OperarioTo = httpContext.cgiGet( sPrefix+"AV71OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV71OperarioTo) > 0 )
      {
         AV71OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV71OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71OperarioTo), 6, 0));
      }
      else
      {
         AV71OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV71OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa22T2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws22T2( ) ;
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
      ws22T2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_PARM", GXutil.rtrim( AV5EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5EmprCod_CTRL", GXutil.rtrim( sCtrlAV5EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV13HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV13HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV13HisEstReo_CTRL", GXutil.rtrim( sCtrlAV13HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MaqCod1_PARM", GXutil.rtrim( AV24MaqCod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24MaqCod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24MaqCod1_CTRL", GXutil.rtrim( sCtrlAV24MaqCod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25MaqCod2_PARM", GXutil.rtrim( AV25MaqCod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25MaqCod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25MaqCod2_CTRL", GXutil.rtrim( sCtrlAV25MaqCod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16HisProFec1_PARM", localUtil.ttoc( AV16HisProFec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV16HisProFec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV16HisProFec1_CTRL", GXutil.rtrim( sCtrlAV16HisProFec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17HisProFec2_PARM", localUtil.ttoc( AV17HisProFec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17HisProFec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17HisProFec2_CTRL", GXutil.rtrim( sCtrlAV17HisProFec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV70OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV70OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV70OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV70OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV71OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV71OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV71OperarioTo_CTRL", GXutil.rtrim( sCtrlAV71OperarioTo));
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
      we22T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552970", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenturnodp_wc.js", "?202682115552970", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_322( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_32_idx ;
      edtavSdtproduccionresumenturno__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONRESUMENTURNO__MAQDSC_"+sGXsfl_32_idx ;
      edtavTurnokgs1_Internalname = sPrefix+"vTURNOKGS1_"+sGXsfl_32_idx ;
      edtavTurnokgs2_Internalname = sPrefix+"vTURNOKGS2_"+sGXsfl_32_idx ;
      edtavTurnokgs3_Internalname = sPrefix+"vTURNOKGS3_"+sGXsfl_32_idx ;
      edtavTurnokgs4_Internalname = sPrefix+"vTURNOKGS4_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_322( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_32_fel_idx ;
      edtavSdtproduccionresumenturno__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONRESUMENTURNO__MAQDSC_"+sGXsfl_32_fel_idx ;
      edtavTurnokgs1_Internalname = sPrefix+"vTURNOKGS1_"+sGXsfl_32_fel_idx ;
      edtavTurnokgs2_Internalname = sPrefix+"vTURNOKGS2_"+sGXsfl_32_fel_idx ;
      edtavTurnokgs3_Internalname = sPrefix+"vTURNOKGS3_"+sGXsfl_32_fel_idx ;
      edtavTurnokgs4_Internalname = sPrefix+"vTURNOKGS4_"+sGXsfl_32_fel_idx ;
   }

   public void sendrow_322( )
   {
      subsflControlProps_322( ) ;
      wb22T0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_32_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_32_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmprcod_Internalname,GXutil.rtrim( AV5EmprCod),GXutil.rtrim( localUtil.format( AV5EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEmprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEmprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtproduccionresumenturno__maqdsc_Internalname,GXutil.rtrim( ((app.SdtProduccionResumenTurno_SDT)AV34SDTProduccionResumenTurno.elementAt(-1+AV74GXV1)).getgxTv_SdtProduccionResumenTurno_SDT_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtproduccionresumenturno__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtproduccionresumenturno__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTurnokgs1_Internalname,GXutil.ltrim( localUtil.ntoc( AV58TurnoKgs1, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTurnokgs1_Enabled!=0) ? localUtil.format( AV58TurnoKgs1, "ZZZZZ9.99") : localUtil.format( AV58TurnoKgs1, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTurnokgs1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTurnokgs1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTurnokgs2_Internalname,GXutil.ltrim( localUtil.ntoc( AV59TurnoKgs2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTurnokgs2_Enabled!=0) ? localUtil.format( AV59TurnoKgs2, "ZZZZZ9.99") : localUtil.format( AV59TurnoKgs2, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTurnokgs2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTurnokgs2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTurnokgs3_Internalname,GXutil.ltrim( localUtil.ntoc( AV60TurnoKgs3, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTurnokgs3_Enabled!=0) ? localUtil.format( AV60TurnoKgs3, "ZZZZZ9.99") : localUtil.format( AV60TurnoKgs3, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTurnokgs3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTurnokgs3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTurnokgs4_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTurnokgs4_Internalname,GXutil.ltrim( localUtil.ntoc( AV61TurnoKgs4, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTurnokgs4_Enabled!=0) ? localUtil.format( AV61TurnoKgs4, "ZZZZZ9.99") : localUtil.format( AV61TurnoKgs4, "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTurnokgs4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTurnokgs4_Visible),Integer.valueOf(edtavTurnokgs4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes22T2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      /* End function sendrow_322 */
   }

   public void startgridcontrol32( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"32\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs 1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs 2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs 3", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTurnokgs4_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs 4", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV5EmprCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtproduccionresumenturno__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58TurnoKgs1, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV59TurnoKgs2, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60TurnoKgs3, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61TurnoKgs4, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTurnokgs4_Visible, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock_turno_Internalname = sPrefix+"TEXTBLOCK_TURNO" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtavSdtproduccionresumenturno__maqdsc_Internalname = sPrefix+"SDTPRODUCCIONRESUMENTURNO__MAQDSC" ;
      edtavTurnokgs1_Internalname = sPrefix+"vTURNOKGS1" ;
      edtavTurnokgs2_Internalname = sPrefix+"vTURNOKGS2" ;
      edtavTurnokgs3_Internalname = sPrefix+"vTURNOKGS3" ;
      edtavTurnokgs4_Internalname = sPrefix+"vTURNOKGS4" ;
      edtavTotvalueturnokgs1_Internalname = sPrefix+"vTOTVALUETURNOKGS1" ;
      edtavTotvalueturnokgs2_Internalname = sPrefix+"vTOTVALUETURNOKGS2" ;
      edtavTotvalueturnokgs3_Internalname = sPrefix+"vTOTVALUETURNOKGS3" ;
      edtavTotvalueturnokgs4_Internalname = sPrefix+"vTOTVALUETURNOKGS4" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
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
      edtavTurnokgs4_Jsonclick = "" ;
      edtavTurnokgs4_Enabled = 0 ;
      edtavTurnokgs3_Jsonclick = "" ;
      edtavTurnokgs3_Enabled = 0 ;
      edtavTurnokgs2_Jsonclick = "" ;
      edtavTurnokgs2_Enabled = 0 ;
      edtavTurnokgs1_Jsonclick = "" ;
      edtavTurnokgs1_Enabled = 0 ;
      edtavSdtproduccionresumenturno__maqdsc_Jsonclick = "" ;
      edtavSdtproduccionresumenturno__maqdsc_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalueturnokgs4_Jsonclick = "" ;
      edtavTotvalueturnokgs4_Enabled = 1 ;
      edtavTotvalueturnokgs3_Jsonclick = "" ;
      edtavTotvalueturnokgs3_Enabled = 1 ;
      edtavTotvalueturnokgs2_Jsonclick = "" ;
      edtavTotvalueturnokgs2_Enabled = 1 ;
      edtavTotvalueturnokgs1_Jsonclick = "" ;
      edtavTotvalueturnokgs1_Enabled = 1 ;
      edtavSdtproduccionresumenturno__maqdsc_Enabled = -1 ;
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
      edtavTurnokgs4_Visible = -1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtavTurnokgs4_Visible',ctrl:'vTURNOKGS4',prop:'Visible'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV24MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV25MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV16HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV17HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV70OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV71OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV48TotTurnoKgs1',fld:'vTOTTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV49TotTurnoKgs2',fld:'vTOTTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotTurnoKgs3',fld:'vTOTTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotTurnoKgs4',fld:'vTOTTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV40TotalTurnoKgs1',fld:'vTOTALTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV41TotalTurnoKgs2',fld:'vTOTALTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV42TotalTurnoKgs3',fld:'vTOTALTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV43TotalTurnoKgs4',fld:'vTOTALTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV9GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV10GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48TotTurnoKgs1',fld:'vTOTTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV49TotTurnoKgs2',fld:'vTOTTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotTurnoKgs3',fld:'vTOTTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotTurnoKgs4',fld:'vTOTTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV58TurnoKgs1',fld:'vTURNOKGS1',pic:'ZZZZZ9.99'},{av:'AV52TotValueTurnoKgs1',fld:'vTOTVALUETURNOKGS1',pic:''},{av:'AV53TotValueTurnoKgs2',fld:'vTOTVALUETURNOKGS2',pic:''},{av:'AV54TotValueTurnoKgs3',fld:'vTOTVALUETURNOKGS3',pic:''},{av:'AV55TotValueTurnoKgs4',fld:'vTOTVALUETURNOKGS4',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1122T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV24MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV25MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV16HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV17HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV70OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV71OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV48TotTurnoKgs1',fld:'vTOTTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV49TotTurnoKgs2',fld:'vTOTTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotTurnoKgs3',fld:'vTOTTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotTurnoKgs4',fld:'vTOTTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV40TotalTurnoKgs1',fld:'vTOTALTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV41TotalTurnoKgs2',fld:'vTOTALTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV42TotalTurnoKgs3',fld:'vTOTALTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV43TotalTurnoKgs4',fld:'vTOTALTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtavTurnokgs4_Visible',ctrl:'vTURNOKGS4',prop:'Visible'},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1222T2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV76Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV24MaqCod1',fld:'vMAQCOD1',pic:''},{av:'AV25MaqCod2',fld:'vMAQCOD2',pic:''},{av:'AV16HisProFec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV17HisProFec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV70OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV71OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV48TotTurnoKgs1',fld:'vTOTTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV49TotTurnoKgs2',fld:'vTOTTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotTurnoKgs3',fld:'vTOTTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotTurnoKgs4',fld:'vTOTTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV40TotalTurnoKgs1',fld:'vTOTALTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV41TotalTurnoKgs2',fld:'vTOTALTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV42TotalTurnoKgs3',fld:'vTOTALTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV43TotalTurnoKgs4',fld:'vTOTALTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtavTurnokgs4_Visible',ctrl:'vTURNOKGS4',prop:'Visible'},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1622T2',iparms:[{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV40TotalTurnoKgs1',fld:'vTOTALTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV41TotalTurnoKgs2',fld:'vTOTALTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV42TotalTurnoKgs3',fld:'vTOTALTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV43TotalTurnoKgs4',fld:'vTOTALTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV48TotTurnoKgs1',fld:'vTOTTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV49TotTurnoKgs2',fld:'vTOTTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotTurnoKgs3',fld:'vTOTTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV51TotTurnoKgs4',fld:'vTOTTURNOKGS4',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV58TurnoKgs1',fld:'vTURNOKGS1',pic:'ZZZZZ9.99'},{av:'AV59TurnoKgs2',fld:'vTURNOKGS2',pic:'ZZZZZ9.99'},{av:'AV60TurnoKgs3',fld:'vTURNOKGS3',pic:'ZZZZZ9.99'},{av:'AV61TurnoKgs4',fld:'vTURNOKGS4',pic:'ZZZZZ9.99'},{av:'AV40TotalTurnoKgs1',fld:'vTOTALTURNOKGS1',pic:'ZZZZZ9.99',hsh:true},{av:'AV41TotalTurnoKgs2',fld:'vTOTALTURNOKGS2',pic:'ZZZZZ9.99',hsh:true},{av:'AV42TotalTurnoKgs3',fld:'vTOTALTURNOKGS3',pic:'ZZZZZ9.99',hsh:true},{av:'AV43TotalTurnoKgs4',fld:'vTOTALTURNOKGS4',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotValueTurnoKgs1',fld:'vTOTVALUETURNOKGS1',pic:''},{av:'AV53TotValueTurnoKgs2',fld:'vTOTVALUETURNOKGS2',pic:''},{av:'AV54TotValueTurnoKgs3',fld:'vTOTVALUETURNOKGS3',pic:''},{av:'AV55TotValueTurnoKgs4',fld:'vTOTVALUETURNOKGS4',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1322T2',iparms:[{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1722T2',iparms:[{av:'AV34SDTProduccionResumenTurno',fld:'vSDTPRODUCCIONRESUMENTURNO',grid:32,pic:'',hsh:true},{av:'nGXsfl_32_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:32},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Turnokgs4',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV24MaqCod1 = "" ;
      wcpOAV25MaqCod2 = "" ;
      wcpOAV16HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV17HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5EmprCod = "" ;
      AV24MaqCod1 = "" ;
      AV25MaqCod2 = "" ;
      AV16HisProFec1 = GXutil.resetTime( GXutil.nullDate() );
      AV17HisProFec2 = GXutil.resetTime( GXutil.nullDate() );
      AV76Pgmname = "" ;
      AV34SDTProduccionResumenTurno = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      AV48TotTurnoKgs1 = DecimalUtil.ZERO ;
      AV49TotTurnoKgs2 = DecimalUtil.ZERO ;
      AV50TotTurnoKgs3 = DecimalUtil.ZERO ;
      AV51TotTurnoKgs4 = DecimalUtil.ZERO ;
      AV40TotalTurnoKgs1 = DecimalUtil.ZERO ;
      AV41TotalTurnoKgs2 = DecimalUtil.ZERO ;
      AV42TotalTurnoKgs3 = DecimalUtil.ZERO ;
      AV43TotalTurnoKgs4 = DecimalUtil.ZERO ;
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
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV58TurnoKgs1 = DecimalUtil.ZERO ;
      AV59TurnoKgs2 = DecimalUtil.ZERO ;
      AV60TurnoKgs3 = DecimalUtil.ZERO ;
      AV61TurnoKgs4 = DecimalUtil.ZERO ;
      AV52TotValueTurnoKgs1 = "" ;
      AV53TotValueTurnoKgs2 = "" ;
      AV54TotValueTurnoKgs3 = "" ;
      AV55TotValueTurnoKgs4 = "" ;
      AV67Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV65EmprNom = "" ;
      AV66UsurCod = "" ;
      GXt_objcol_SdtProduccionResumenTurno_SDT5 = new GXBaseCollection<app.SdtProduccionResumenTurno_SDT>(app.SdtProduccionResumenTurno_SDT.class, "ProduccionResumenTurno_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtProduccionResumenTurno_SDT6 = new GXBaseCollection[1] ;
      AV63WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV62WebSession = httpContext.getWebSession();
      AV33ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV35SDTProduccionResumenTurno_Turnos = new app.SdtProduccionResumenTurno_SDT_TurnosItem(remoteHandle, context);
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV7ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV6ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV36Session = httpContext.getWebSession();
      AV11GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV12GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      lblTextblock_turno_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5EmprCod = "" ;
      sCtrlAV13HisEstReo = "" ;
      sCtrlAV24MaqCod1 = "" ;
      sCtrlAV25MaqCod2 = "" ;
      sCtrlAV16HisProFec1 = "" ;
      sCtrlAV17HisProFec2 = "" ;
      sCtrlAV70OperarioFrom = "" ;
      sCtrlAV71OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV76Pgmname = "Produccion.InformeProduccionResumenTurnoDP_WC" ;
      /* GeneXus formulas. */
      AV76Pgmname = "Produccion.InformeProduccionResumenTurnoDP_WC" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      edtavSdtproduccionresumenturno__maqdsc_Enabled = 0 ;
      edtavTurnokgs1_Enabled = 0 ;
      edtavTurnokgs2_Enabled = 0 ;
      edtavTurnokgs3_Enabled = 0 ;
      edtavTurnokgs4_Enabled = 0 ;
      edtavTotvalueturnokgs1_Enabled = 0 ;
      edtavTotvalueturnokgs2_Enabled = 0 ;
      edtavTotvalueturnokgs3_Enabled = 0 ;
      edtavTotvalueturnokgs4_Enabled = 0 ;
   }

   private byte wcpOAV13HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV13HisEstReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV70OperarioFrom ;
   private int wcpOAV71OperarioTo ;
   private int edtavTurnokgs4_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_32 ;
   private int AV70OperarioFrom ;
   private int AV71OperarioTo ;
   private int nGXsfl_32_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV74GXV1 ;
   private int edtavPgmname_Visible ;
   private int subGrid_Islastpage ;
   private int edtavEmprcod_Enabled ;
   private int edtavSdtproduccionresumenturno__maqdsc_Enabled ;
   private int edtavTurnokgs1_Enabled ;
   private int edtavTurnokgs2_Enabled ;
   private int edtavTurnokgs3_Enabled ;
   private int edtavTurnokgs4_Enabled ;
   private int edtavTotvalueturnokgs1_Enabled ;
   private int edtavTotvalueturnokgs2_Enabled ;
   private int edtavTotvalueturnokgs3_Enabled ;
   private int edtavTotvalueturnokgs4_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_32_fel_idx=1 ;
   private int AV32PageToGo ;
   private int AV77GXV3 ;
   private int AV22i ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV9GridCurrentPage ;
   private long AV10GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TotTurnoKgs1 ;
   private java.math.BigDecimal AV49TotTurnoKgs2 ;
   private java.math.BigDecimal AV50TotTurnoKgs3 ;
   private java.math.BigDecimal AV51TotTurnoKgs4 ;
   private java.math.BigDecimal AV40TotalTurnoKgs1 ;
   private java.math.BigDecimal AV41TotalTurnoKgs2 ;
   private java.math.BigDecimal AV42TotalTurnoKgs3 ;
   private java.math.BigDecimal AV43TotalTurnoKgs4 ;
   private java.math.BigDecimal AV58TurnoKgs1 ;
   private java.math.BigDecimal AV59TurnoKgs2 ;
   private java.math.BigDecimal AV60TurnoKgs3 ;
   private java.math.BigDecimal AV61TurnoKgs4 ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV24MaqCod1 ;
   private String wcpOAV25MaqCod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5EmprCod ;
   private String edtavEmprcod_Internalname ;
   private String AV24MaqCod1 ;
   private String AV25MaqCod2 ;
   private String sGXsfl_32_idx="0001" ;
   private String edtavTurnokgs4_Internalname ;
   private String AV76Pgmname ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvalueturnokgs1_Internalname ;
   private String edtavTurnokgs1_Internalname ;
   private String edtavTurnokgs2_Internalname ;
   private String edtavTurnokgs3_Internalname ;
   private String edtavSdtproduccionresumenturno__maqdsc_Internalname ;
   private String edtavTotvalueturnokgs2_Internalname ;
   private String edtavTotvalueturnokgs3_Internalname ;
   private String edtavTotvalueturnokgs4_Internalname ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String AV67Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV65EmprNom ;
   private String AV66UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalueturnokgs1_Jsonclick ;
   private String edtavTotvalueturnokgs2_Jsonclick ;
   private String edtavTotvalueturnokgs3_Jsonclick ;
   private String edtavTotvalueturnokgs4_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_turno_Internalname ;
   private String lblTextblock_turno_Jsonclick ;
   private String sCtrlAV5EmprCod ;
   private String sCtrlAV13HisEstReo ;
   private String sCtrlAV24MaqCod1 ;
   private String sCtrlAV25MaqCod2 ;
   private String sCtrlAV16HisProFec1 ;
   private String sCtrlAV17HisProFec2 ;
   private String sCtrlAV70OperarioFrom ;
   private String sCtrlAV71OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavSdtproduccionresumenturno__maqdsc_Jsonclick ;
   private String edtavTurnokgs1_Jsonclick ;
   private String edtavTurnokgs2_Jsonclick ;
   private String edtavTurnokgs3_Jsonclick ;
   private String edtavTurnokgs4_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV16HisProFec1 ;
   private java.util.Date wcpOAV17HisProFec2 ;
   private java.util.Date AV16HisProFec1 ;
   private java.util.Date AV17HisProFec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_32_Refreshing=false ;
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
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV32 ;
   private boolean gx_refresh_fired ;
   private String AV52TotValueTurnoKgs1 ;
   private String AV53TotValueTurnoKgs2 ;
   private String AV54TotValueTurnoKgs3 ;
   private String AV55TotValueTurnoKgs4 ;
   private String AV7ExcelFilename ;
   private String AV6ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV62WebSession ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV33ProgressIndicator ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> AV34SDTProduccionResumenTurno ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> GXt_objcol_SdtProduccionResumenTurno_SDT5 ;
   private GXBaseCollection<app.SdtProduccionResumenTurno_SDT> GXv_objcol_SdtProduccionResumenTurno_SDT6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV11GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV12GridStateFilterValue ;
   private app.SdtProduccionResumenTurno_SDT_TurnosItem AV35SDTProduccionResumenTurno_Turnos ;
   private app.wwpbaseobjects.SdtWWPContext AV63WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

