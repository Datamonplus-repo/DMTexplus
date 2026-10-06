package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenfase_wc_impl extends GXWebComponent
{
   public informeproduccionresumenfase_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenfase_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenfase_wc_impl.class ));
   }

   public informeproduccionresumenfase_wc_impl( int remoteHandle ,
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
               AV12EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
               AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
               AV34Maqcod1 = httpContext.GetPar( "Maqcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
               AV35Maqcod2 = httpContext.GetPar( "Maqcod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
               AV26Hisprofec1 = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.format(AV26Hisprofec1, "99/99/99"));
               AV29Horai = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "Horai"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Horai", localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV28Hisprofec2 = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.format(AV28Hisprofec2, "99/99/99"));
               AV30Horaf = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "Horaf"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Horaf", localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV12EmprCod,Byte.valueOf(AV25HisEstReo),AV34Maqcod1,AV35Maqcod2,AV26Hisprofec1,AV29Horai,AV28Hisprofec2,AV30Horaf});
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      AV12EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV34Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV35Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV26Hisprofec1 = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec1")) ;
      AV29Horai = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "Horai"))) ;
      AV28Hisprofec2 = localUtil.parseDateParm( httpContext.GetPar( "Hisprofec2")) ;
      AV30Horaf = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "Horaf"))) ;
      AV57Pgmname = httpContext.GetPar( "Pgmname") ;
      AV51TotKgsFase = CommonUtil.decimalVal( httpContext.GetPar( "TotKgsFase"), ".") ;
      AV53TotMtsFase = CommonUtil.decimalVal( httpContext.GetPar( "TotMtsFase"), ".") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A461Fase = httpContext.GetPar( "Fase") ;
      A602MaqCod = httpContext.GetPar( "MaqCod") ;
      A4441HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      n4441HisProDTF = false ;
      AV23Hisprodti = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodti")) ;
      AV24Hisprodtf = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprodtf")) ;
      A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
      n656ParCod = false ;
      A3612HisProReo = (byte)(GXutil.lval( httpContext.GetPar( "HisProReo"))) ;
      AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      A1525HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "HisProKgr"), ".") ;
      A1526HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "HisProMtr"), ".") ;
      AV12EmprCod = httpContext.GetPar( "EmprCod") ;
      AV36TTotk = CommonUtil.decimalVal( httpContext.GetPar( "TTotk"), ".") ;
      AV37TTotmt = CommonUtil.decimalVal( httpContext.GetPar( "TTotmt"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1YK2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Informe Produccion Resumen Fase", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenfase_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34Maqcod1)),GXutil.URLEncode(GXutil.rtrim(AV35Maqcod2)),GXutil.URLEncode(GXutil.formatDateParm(AV26Hisprofec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV29Horai)),GXutil.URLEncode(GXutil.formatDateParm(AV28Hisprofec2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV30Horaf))}, new String[] {"EmprCod","HisEstReo","Maqcod1","Maqcod2","Hisprofec1","Horai","Hisprofec2","Horaf"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotKgsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV53TotMtsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV36TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotmt, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12EmprCod", GXutil.rtrim( wcpOAV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Maqcod1", GXutil.rtrim( wcpOAV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Maqcod2", GXutil.rtrim( wcpOAV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Hisprofec1", localUtil.dtoc( wcpOAV26Hisprofec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV29Horai", localUtil.ttoc( wcpOAV29Horai, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Hisprofec2", localUtil.dtoc( wcpOAV28Hisprofec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30Horaf", localUtil.ttoc( wcpOAV30Horaf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.dtoc( AV26Hisprofec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHORAI", localUtil.ttoc( AV29Horai, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.dtoc( AV28Hisprofec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHORAF", localUtil.ttoc( AV30Horaf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGSFASE", GXutil.ltrim( localUtil.ntoc( AV51TotKgsFase, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotKgsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTSFASE", GXutil.ltrim( localUtil.ntoc( AV53TotMtsFase, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV53TotMtsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"FASE", GXutil.rtrim( A461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPRODTF", localUtil.ttoc( A4441HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTI", localUtil.ttoc( AV23Hisprodti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPRODTF", localUtil.ttoc( AV24Hisprodtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV36TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV36TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV37TTotmt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotmt, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFILENAME", AV39Filename);
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1YK2( )
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
      return "Produccion.InformeProduccionResumenFase_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Fase", "") ;
   }

   public void wb1YK0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenfase_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbuttonexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Excel", ""), bttBtnbuttonexport_Jsonclick, 5, httpContext.getMessage( "Excel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOBUTTONEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_22_1YK2( true) ;
      }
      else
      {
         wb_table1_22_1YK2( false) ;
      }
      return  ;
   }

   public void wb_table1_22_1YK2e( boolean wbgen )
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
         startgridcontrol35( ) ;
      }
      if ( wbEnd == 35 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_35 = (int)(nGXsfl_35_idx-1) ;
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
         wb_table2_45_1YK2( true) ;
      }
      else
      {
         wb_table2_45_1YK2( false) ;
      }
      return  ;
   }

   public void wb_table2_45_1YK2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV57Pgmname), GXutil.rtrim( localUtil.format( AV57Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotallines_Internalname, GXutil.ltrim( localUtil.ntoc( AV48TotalLines, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TotalLines), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotallines_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotallines_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 35 )
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

   public void start1YK2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Informe Produccion Resumen Fase", ""), (short)(0)) ;
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
            strup1YK0( ) ;
         }
      }
   }

   public void ws1YK2( )
   {
      start1YK2( ) ;
      evt1YK2( ) ;
   }

   public void evt1YK2( )
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
                              strup1YK0( ) ;
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
                              strup1YK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOBUTTONEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoButtonExport' */
                                 e131YK2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1YK0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
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
                              strup1YK0( ) ;
                           }
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           if ( GXutil.len( sPrefix) == 0 )
                           {
                              AV12EmprCod = GXutil.upper( httpContext.cgiGet( edtavEmprcod_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
                           }
                           AV13FasCodGrid = GXutil.upper( httpContext.cgiGet( edtavFascodgrid_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFascodgrid_Internalname, AV13FasCodGrid);
                           AV14FasDscGrid = httpContext.cgiGet( edtavFasdscgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscgrid_Internalname, AV14FasDscGrid);
                           AV15KgsFase = localUtil.ctond( httpContext.cgiGet( edtavKgsfase_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsfase_Internalname, GXutil.ltrimstr( AV15KgsFase, 10, 2));
                           AV16Por5k = localUtil.ctond( httpContext.cgiGet( edtavPor5k_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5k_Internalname, GXutil.ltrimstr( AV16Por5k, 6, 2));
                           AV17MtsFase = localUtil.ctond( httpContext.cgiGet( edtavMtsfase_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsfase_Internalname, GXutil.ltrimstr( AV17MtsFase, 10, 2));
                           AV18Por5m = localUtil.ctond( httpContext.cgiGet( edtavPor5m_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5m_Internalname, GXutil.ltrimstr( AV18Por5m, 6, 2));
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
                                       GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e141YK2 ();
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
                                       GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e151YK2 ();
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
                                       GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e161YK2 ();
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
                                    strup1YK0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
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

   public void we1YK2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1YK2( ) ;
         }
      }
   }

   public void pa1YK2( )
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
            GX_FocusControl = edtavTotvaluekgsfase_Internalname ;
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
      subsflControlProps_352( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         sendrow_352( ) ;
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV34Maqcod1 ,
                                 String AV35Maqcod2 ,
                                 java.util.Date AV26Hisprofec1 ,
                                 java.util.Date AV29Horai ,
                                 java.util.Date AV28Hisprofec2 ,
                                 java.util.Date AV30Horaf ,
                                 String AV57Pgmname ,
                                 java.math.BigDecimal AV51TotKgsFase ,
                                 java.math.BigDecimal AV53TotMtsFase ,
                                 String A396EmprCod ,
                                 String A461Fase ,
                                 String A602MaqCod ,
                                 java.util.Date A4441HisProDTF ,
                                 java.util.Date AV23Hisprodti ,
                                 java.util.Date AV24Hisprodtf ,
                                 short A656ParCod ,
                                 byte A3612HisProReo ,
                                 byte AV25HisEstReo ,
                                 java.math.BigDecimal A1525HisProKgr ,
                                 java.math.BigDecimal A1526HisProMtr ,
                                 String AV12EmprCod ,
                                 java.math.BigDecimal AV36TTotk ,
                                 java.math.BigDecimal AV37TTotmt ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151YK2 ();
      GRID_nCurrentRecord = 0 ;
      rf1YK2( ) ;
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
      rf1YK2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV57Pgmname = "Produccion.InformeProduccionResumenFase_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavFascodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodgrid_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavFasdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscgrid_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavKgsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsfase_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPor5k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor5k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor5k_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavMtsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMtsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsfase_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPor5m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor5m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor5m_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavTotvaluekgsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgsfase_Enabled), 5, 0), true);
      edtavTotvaluemtsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtsfase_Enabled), 5, 0), true);
   }

   public void rf1YK2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e151YK2 ();
      nGXsfl_35_idx = 1 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
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
         subsflControlProps_352( ) ;
         e161YK2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_35_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e161YK2 ();
         }
         wbEnd = (short)(35) ;
         wb1YK0( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1YK2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTKGSFASE", GXutil.ltrim( localUtil.ntoc( AV51TotKgsFase, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotKgsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTMTSFASE", GXutil.ltrim( localUtil.ntoc( AV53TotMtsFase, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV53TotMtsFase, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTK", GXutil.ltrim( localUtil.ntoc( AV36TTotk, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV36TTotk, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTTOTMT", GXutil.ltrim( localUtil.ntoc( AV37TTotmt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotmt, "ZZZZZZ9.99")));
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
         gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, AV57Pgmname, AV51TotKgsFase, AV53TotMtsFase, A396EmprCod, A461Fase, A602MaqCod, A4441HisProDTF, AV23Hisprodti, AV24Hisprodtf, A656ParCod, A3612HisProReo, AV25HisEstReo, A1525HisProKgr, A1526HisProMtr, AV12EmprCod, AV36TTotk, AV37TTotmt, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV57Pgmname = "Produccion.InformeProduccionResumenFase_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEmprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavFascodgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFascodgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFascodgrid_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavFasdscgrid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdscgrid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdscgrid_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavKgsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavKgsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavKgsfase_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPor5k_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor5k_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor5k_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavMtsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMtsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMtsfase_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPor5m_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPor5m_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPor5m_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavTotvaluekgsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluekgsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekgsfase_Enabled), 5, 0), true);
      edtavTotvaluemtsfase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluemtsfase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemtsfase_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1YK0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141YK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV12EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV12EmprCod") ;
         wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
         wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
         wcpOAV26Hisprofec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26Hisprofec1"), 0) ;
         wcpOAV29Horai = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29Horai"), 0)) ;
         wcpOAV28Hisprofec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28Hisprofec2"), 0) ;
         wcpOAV30Horaf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30Horaf"), 0)) ;
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
         AV52TotValueKgsFase = httpContext.cgiGet( edtavTotvaluekgsfase_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueKgsFase", AV52TotValueKgsFase);
         AV54TotValueMtsFase = httpContext.cgiGet( edtavTotvaluemtsfase_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueMtsFase", AV54TotValueMtsFase);
         AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57Pgmname", AV57Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTotallines_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTotallines_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTALLINES");
            GX_FocusControl = edtavTotallines_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48TotalLines = (short)(0) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotalLines", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TotalLines), 4, 0));
         }
         else
         {
            AV48TotalLines = (short)(localUtil.ctol( httpContext.cgiGet( edtavTotallines_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TotalLines", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TotalLines), 4, 0));
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
      e141YK2 ();
      if (returnInSub) return;
   }

   public void e141YK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV58Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenfase_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV58Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV59Emprnom ;
      GXv_char4[0] = AV60Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV58Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenfase_wc_impl.this.AV12EmprCod = GXv_char2[0] ;
      informeproduccionresumenfase_wc_impl.this.AV59Emprnom = GXv_char3[0] ;
      informeproduccionresumenfase_wc_impl.this.AV60Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      edtavTotallines_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotallines_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotallines_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV27Fecha_hora = localUtil.dtoc( AV26Hisprofec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV23Hisprodti = localUtil.ctot( AV27Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprodti", localUtil.ttoc( AV23Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV27Fecha_hora = localUtil.dtoc( AV28Hisprofec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV24Hisprodtf = localUtil.ctot( AV27Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Hisprodtf", localUtil.ttoc( AV24Hisprodtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Execute user subroutine: 'INICIOBARRAPROGRESO' */
      S122 ();
      if (returnInSub) return;
   }

   public void e151YK2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV6WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S142 ();
      if (returnInSub) return;
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      GXt_int6 = AV50CantidadRegistros ;
      GXv_int7[0] = GXt_int6 ;
      new app.produccion.registrosfase(remoteHandle, context).execute( AV12EmprCod, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV29Horai, AV28Hisprofec2, AV30Horaf, GXv_int7) ;
      informeproduccionresumenfase_wc_impl.this.GXt_int6 = GXv_int7[0] ;
      AV50CantidadRegistros = GXt_int6 ;
      AV49GridRows = ((subGrid_Rows==0) ? 1 : subGrid_Rows) ;
      AV22GridPageCount = (long)((AV50CantidadRegistros/ (double) (AV49GridRows))+1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      /* Execute user subroutine: 'FINBARRAPROGRESO' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ProgressIndicator", AV45ProgressIndicator);
   }

   public void e111YK2( )
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
         AV20PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV20PageToGo) ;
      }
   }

   public void e121YK2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e161YK2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV16Por5k = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5k_Internalname, GXutil.ltrimstr( AV16Por5k, 6, 2));
      AV18Por5m = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5m_Internalname, GXutil.ltrimstr( AV18Por5m, 6, 2));
      /* Using cursor H01YK2 */
      pr_default.execute(0, new Object[] {AV12EmprCod, AV34Maqcod1, AV35Maqcod2, AV23Hisprodti, AV24Hisprodtf, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1YK3 = false ;
         A461Fase = H01YK2_A461Fase[0] ;
         A396EmprCod = H01YK2_A396EmprCod[0] ;
         A1525HisProKgr = H01YK2_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YK2_A1526HisProMtr[0] ;
         A3612HisProReo = H01YK2_A3612HisProReo[0] ;
         A656ParCod = H01YK2_A656ParCod[0] ;
         n656ParCod = H01YK2_n656ParCod[0] ;
         A4441HisProDTF = H01YK2_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YK2_n4441HisProDTF[0] ;
         A602MaqCod = H01YK2_A602MaqCod[0] ;
         AV15KgsFase = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsfase_Internalname, GXutil.ltrimstr( AV15KgsFase, 10, 2));
         AV17MtsFase = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsfase_Internalname, GXutil.ltrimstr( AV17MtsFase, 10, 2));
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H01YK2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H01YK2_A461Fase[0], A461Fase) == 0 ) )
         {
            brk1YK3 = false ;
            A1525HisProKgr = H01YK2_A1525HisProKgr[0] ;
            A1526HisProMtr = H01YK2_A1526HisProMtr[0] ;
            A3612HisProReo = H01YK2_A3612HisProReo[0] ;
            A656ParCod = H01YK2_A656ParCod[0] ;
            n656ParCod = H01YK2_n656ParCod[0] ;
            A4441HisProDTF = H01YK2_A4441HisProDTF[0] ;
            n4441HisProDTF = H01YK2_n4441HisProDTF[0] ;
            A602MaqCod = H01YK2_A602MaqCod[0] ;
            AV15KgsFase = AV15KgsFase.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsfase_Internalname, GXutil.ltrimstr( AV15KgsFase, 10, 2));
            AV17MtsFase = AV17MtsFase.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsfase_Internalname, GXutil.ltrimstr( AV17MtsFase, 10, 2));
            brk1YK3 = true ;
            pr_default.readNext(0);
         }
         AV13FasCodGrid = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFascodgrid_Internalname, AV13FasCodGrid);
         GXt_char1 = AV14FasDscGrid ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
         informeproduccionresumenfase_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14FasDscGrid = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscgrid_Internalname, AV14FasDscGrid);
         AV16Por5k = ((AV36TTotk.doubleValue()>0) ? (AV15KgsFase.divide(AV36TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5k_Internalname, GXutil.ltrimstr( AV16Por5k, 6, 2));
         AV18Por5m = ((AV37TTotmt.doubleValue()>0) ? (AV17MtsFase.divide(AV37TTotmt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5m_Internalname, GXutil.ltrimstr( AV18Por5m, 6, 2));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(35) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_352( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
         {
            httpContext.doAjaxLoad(35, GridRow);
         }
         if ( ! brk1YK3 )
         {
            brk1YK3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e131YK2( )
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
      if ( GXutil.strcmp(AV19Session.getValue(AV57Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV57Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV57Pgmname+"GridState"), null, null);
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
      AV10GridState.fromxml(AV19Session.getValue(AV57Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV57Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
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
      AV52TotValueKgsFase = localUtil.format( AV51TotKgsFase, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TotValueKgsFase", AV52TotValueKgsFase);
      AV54TotValueMtsFase = localUtil.format( AV53TotMtsFase, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TotValueMtsFase", AV54TotValueMtsFase);
   }

   public void S172( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV38Random = (int)(GXutil.random( )*10000) ;
      AV39Filename = "InformeProduccionResumenFase-" + GXutil.trim( GXutil.str( AV38Random, 8, 0)) + ".xlsx" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Filename", AV39Filename);
      AV40ExcelDocument.Open(AV39Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S222 ();
      if (returnInSub) return;
      AV40ExcelDocument.Clear();
   }

   public void S182( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV41TipoTxt = ((AV25HisEstReo==9) ? httpContext.getMessage( "Todo", "") : ((AV25HisEstReo==0) ? httpContext.getMessage( "Produccion Normal", "") : ((AV25HisEstReo==1) ? httpContext.getMessage( "Produccion RI", "") : httpContext.getMessage( "Produccion RE", "")))) ;
      AV40ExcelDocument.Cells(1, 1, 1, 1).setBold( (short)(1) );
      AV40ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Informe Produccion por Fase", "") );
      AV40ExcelDocument.Cells(1, 2, 1, 1).setText( AV41TipoTxt );
      AV40ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Maquinas ", "")+AV34Maqcod1+" "+AV35Maqcod2+httpContext.getMessage( " Periodo ", "")+localUtil.ttoc( AV23Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+httpContext.getMessage( " hasta ", "")+localUtil.ttoc( AV24Hisprodtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
      AV42CellRow = 2 ;
      AV43CellCol = (short)(1) ;
      while ( AV43CellCol <= 6 )
      {
         AV40ExcelDocument.Cells((int)(AV42CellRow), AV43CellCol, 1, 1).setBold( (short)(1) );
         AV43CellCol = (short)(AV43CellCol+1) ;
      }
      AV40ExcelDocument.Cells(2, 1, 1, 1).setText( httpContext.getMessage( "Fase", "") );
      AV40ExcelDocument.Cells(2, 2, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV40ExcelDocument.Cells(2, 3, 1, 1).setText( httpContext.getMessage( "Kilos", "") );
      AV40ExcelDocument.Cells(2, 4, 1, 1).setText( "%" );
      AV40ExcelDocument.Cells(2, 5, 1, 1).setText( httpContext.getMessage( "Metros", "") );
      AV40ExcelDocument.Cells(2, 6, 1, 1).setText( "%" );
   }

   public void S192( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV42CellRow = 3 ;
      AV27Fecha_hora = localUtil.dtoc( AV26Hisprofec1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV23Hisprodti = localUtil.ctot( AV27Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Hisprodti", localUtil.ttoc( AV23Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV27Fecha_hora = localUtil.dtoc( AV28Hisprofec2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
      AV24Hisprodtf = localUtil.ctot( AV27Fecha_hora, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Hisprodtf", localUtil.ttoc( AV24Hisprodtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV16Por5k = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5k_Internalname, GXutil.ltrimstr( AV16Por5k, 6, 2));
      AV18Por5m = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5m_Internalname, GXutil.ltrimstr( AV18Por5m, 6, 2));
      /* Using cursor H01YK3 */
      pr_default.execute(1, new Object[] {AV12EmprCod, AV34Maqcod1, AV35Maqcod2, AV23Hisprodti, AV24Hisprodtf, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk1YK5 = false ;
         A461Fase = H01YK3_A461Fase[0] ;
         A396EmprCod = H01YK3_A396EmprCod[0] ;
         A1525HisProKgr = H01YK3_A1525HisProKgr[0] ;
         A1526HisProMtr = H01YK3_A1526HisProMtr[0] ;
         A3612HisProReo = H01YK3_A3612HisProReo[0] ;
         A656ParCod = H01YK3_A656ParCod[0] ;
         n656ParCod = H01YK3_n656ParCod[0] ;
         A4441HisProDTF = H01YK3_A4441HisProDTF[0] ;
         n4441HisProDTF = H01YK3_n4441HisProDTF[0] ;
         A602MaqCod = H01YK3_A602MaqCod[0] ;
         AV15KgsFase = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsfase_Internalname, GXutil.ltrimstr( AV15KgsFase, 10, 2));
         AV17MtsFase = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsfase_Internalname, GXutil.ltrimstr( AV17MtsFase, 10, 2));
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(H01YK3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(H01YK3_A461Fase[0], A461Fase) == 0 ) )
         {
            brk1YK5 = false ;
            A1525HisProKgr = H01YK3_A1525HisProKgr[0] ;
            A1526HisProMtr = H01YK3_A1526HisProMtr[0] ;
            A3612HisProReo = H01YK3_A3612HisProReo[0] ;
            A656ParCod = H01YK3_A656ParCod[0] ;
            n656ParCod = H01YK3_n656ParCod[0] ;
            A4441HisProDTF = H01YK3_A4441HisProDTF[0] ;
            n4441HisProDTF = H01YK3_n4441HisProDTF[0] ;
            A602MaqCod = H01YK3_A602MaqCod[0] ;
            AV15KgsFase = AV15KgsFase.add(A1525HisProKgr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavKgsfase_Internalname, GXutil.ltrimstr( AV15KgsFase, 10, 2));
            AV17MtsFase = AV17MtsFase.add(A1526HisProMtr) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMtsfase_Internalname, GXutil.ltrimstr( AV17MtsFase, 10, 2));
            brk1YK5 = true ;
            pr_default.readNext(1);
         }
         AV13FasCodGrid = A461Fase ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFascodgrid_Internalname, AV13FasCodGrid);
         GXt_char1 = AV14FasDscGrid ;
         GXv_char4[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char4) ;
         informeproduccionresumenfase_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV14FasDscGrid = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdscgrid_Internalname, AV14FasDscGrid);
         AV16Por5k = ((AV36TTotk.doubleValue()>0) ? (AV15KgsFase.divide(AV36TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5k_Internalname, GXutil.ltrimstr( AV16Por5k, 6, 2));
         AV18Por5m = ((AV37TTotmt.doubleValue()>0) ? (AV17MtsFase.divide(AV37TTotmt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPor5m_Internalname, GXutil.ltrimstr( AV18Por5m, 6, 2));
         AV40ExcelDocument.Cells((int)(AV42CellRow), 1, 1, 1).setText( AV13FasCodGrid );
         AV40ExcelDocument.Cells((int)(AV42CellRow), 2, 1, 1).setText( AV14FasDscGrid );
         AV40ExcelDocument.Cells((int)(AV42CellRow), 3, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV15KgsFase)) );
         AV40ExcelDocument.Cells((int)(AV42CellRow), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV16Por5k)) );
         AV40ExcelDocument.Cells((int)(AV42CellRow), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV17MtsFase)) );
         AV40ExcelDocument.Cells((int)(AV42CellRow), 6, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV18Por5m)) );
         AV42CellRow = (long)(AV42CellRow+1) ;
         if ( ! brk1YK5 )
         {
            brk1YK5 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
   }

   public void S202( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV40ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S222 ();
      if (returnInSub) return;
      AV40ExcelDocument.Close();
      Gx_msg = httpContext.getMessage( "Reporte xls InformeDatos p/Fase - Generado!", "") ;
      callWebObject(formatLink("app.apget_downloadfile", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39Filename)),GXutil.URLEncode(GXutil.rtrim("report.xls")),GXutil.URLEncode(GXutil.rtrim("application/vnd.ms-excel"))}, new String[] {"vrPathCompleto","vrNomeArquivo","ContentType"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S222( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV40ExcelDocument.getErrCode() != 0 )
      {
         AV39Filename = "" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39Filename", AV39Filename);
         AV44ErrorMessage = AV40ExcelDocument.getErrDescription() ;
         AV40ExcelDocument.Close();
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S212( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV36TTotk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TTotk", GXutil.ltrimstr( AV36TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV36TTotk, "ZZZZZZ9.99")));
      AV37TTotmt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TTotmt", GXutil.ltrimstr( AV37TTotmt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotmt, "ZZZZZZ9.99")));
      /* Optimized group. */
      /* Using cursor H01YK4 */
      pr_default.execute(2, new Object[] {AV12EmprCod, AV34Maqcod1, AV35Maqcod2, AV23Hisprodti, AV24Hisprodtf, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo)});
      c1525HisProKgr = H01YK4_A1525HisProKgr[0] ;
      c1526HisProMtr = H01YK4_A1526HisProMtr[0] ;
      pr_default.close(2);
      AV36TTotk = AV36TTotk.add(c1525HisProKgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TTotk", GXutil.ltrimstr( AV36TTotk, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTK", getSecureSignedToken( sPrefix, localUtil.format( AV36TTotk, "ZZZZZZ9.99")));
      AV37TTotmt = AV37TTotmt.add(c1526HisProMtr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TTotmt", GXutil.ltrimstr( AV37TTotmt, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTTOTMT", getSecureSignedToken( sPrefix, localUtil.format( AV37TTotmt, "ZZZZZZ9.99")));
      /* End optimized group. */
      AV51TotKgsFase = AV36TTotk ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TotKgsFase", GXutil.ltrimstr( AV51TotKgsFase, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTKGSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV51TotKgsFase, "ZZZZZZ9.99")));
      AV53TotMtsFase = AV37TTotmt ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TotMtsFase", GXutil.ltrimstr( AV53TotMtsFase, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTMTSFASE", getSecureSignedToken( sPrefix, localUtil.format( AV53TotMtsFase, "ZZZZZZ9.99")));
   }

   public void S122( )
   {
      /* 'INICIOBARRAPROGRESO' Routine */
      returnInSub = false ;
      AV46WebSession.setValue("InformeProduccionResumenWW_FAS", httpContext.getMessage( "FINALIZADO", ""));
      AV45ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV45ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV45ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV45ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV45ProgressIndicator.show();
   }

   public void S162( )
   {
      /* 'FINBARRAPROGRESO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.upper( GXutil.trim( AV46WebSession.getValue("InformeProduccionResumenWW_FAS"))), httpContext.getMessage( "FINALIZADO", "")) == 0 )
      {
         AV46WebSession.remove("InformeProduccionResumenWW_FAS");
         AV45ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV45ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso finalizado", ""));
         AV45ProgressIndicator.hide();
      }
   }

   public void wb_table2_45_1YK2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekgsfase_Internalname, httpContext.getMessage( "Tot Value Kgs Fase", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekgsfase_Internalname, AV52TotValueKgsFase, GXutil.rtrim( localUtil.format( AV52TotValueKgsFase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekgsfase_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekgsfase_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemtsfase_Internalname, httpContext.getMessage( "Tot Value Mts Fase", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemtsfase_Internalname, AV54TotValueMtsFase, GXutil.rtrim( localUtil.format( AV54TotValueMtsFase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemtsfase_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemtsfase_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_45_1YK2e( true) ;
      }
      else
      {
         wb_table2_45_1YK2e( false) ;
      }
   }

   public void wb_table1_22_1YK2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_fase_Internalname, httpContext.getMessage( "Datos por Fase", ""), "", "", lblTextblock_fase_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenFase_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_22_1YK2e( true) ;
      }
      else
      {
         wb_table1_22_1YK2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
      AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      AV34Maqcod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
      AV35Maqcod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
      AV26Hisprofec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.format(AV26Hisprofec1, "99/99/99"));
      AV29Horai = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Horai", localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV28Hisprofec2 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.format(AV28Hisprofec2, "99/99/99"));
      AV30Horaf = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Horaf", localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
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
      pa1YK2( ) ;
      ws1YK2( ) ;
      we1YK2( ) ;
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
      sCtrlAV12EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV25HisEstReo = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV34Maqcod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV35Maqcod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV26Hisprofec1 = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV29Horai = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV28Hisprofec2 = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV30Horaf = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1YK2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenfase_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1YK2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV12EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
         AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
         AV34Maqcod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
         AV35Maqcod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
         AV26Hisprofec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.format(AV26Hisprofec1, "99/99/99"));
         AV29Horai = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Horai", localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV28Hisprofec2 = (java.util.Date)getParm(obj,8,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.format(AV28Hisprofec2, "99/99/99"));
         AV30Horaf = (java.util.Date)getParm(obj,9,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Horaf", localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      wcpOAV12EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV12EmprCod") ;
      wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
      wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
      wcpOAV26Hisprofec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV26Hisprofec1"), 0) ;
      wcpOAV29Horai = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV29Horai"), 0)) ;
      wcpOAV28Hisprofec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV28Hisprofec2"), 0) ;
      wcpOAV30Horaf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV30Horaf"), 0)) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV12EmprCod, wcpOAV12EmprCod) != 0 ) || ( AV25HisEstReo != wcpOAV25HisEstReo ) || ( GXutil.strcmp(AV34Maqcod1, wcpOAV34Maqcod1) != 0 ) || ( GXutil.strcmp(AV35Maqcod2, wcpOAV35Maqcod2) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV26Hisprofec1), GXutil.resetTime(wcpOAV26Hisprofec1)) ) || !( GXutil.dateCompare(AV29Horai, wcpOAV29Horai) ) || !( GXutil.dateCompare(GXutil.resetTime(AV28Hisprofec2), GXutil.resetTime(wcpOAV28Hisprofec2)) ) || !( GXutil.dateCompare(AV30Horaf, wcpOAV30Horaf) ) ) )
      {
         setjustcreated();
      }
      wcpOAV12EmprCod = AV12EmprCod ;
      wcpOAV25HisEstReo = AV25HisEstReo ;
      wcpOAV34Maqcod1 = AV34Maqcod1 ;
      wcpOAV35Maqcod2 = AV35Maqcod2 ;
      wcpOAV26Hisprofec1 = AV26Hisprofec1 ;
      wcpOAV29Horai = AV29Horai ;
      wcpOAV28Hisprofec2 = AV28Hisprofec2 ;
      wcpOAV30Horaf = AV30Horaf ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV12EmprCod = httpContext.cgiGet( sPrefix+"AV12EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12EmprCod) > 0 )
      {
         AV12EmprCod = httpContext.cgiGet( sCtrlAV12EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEmprcod_Internalname, AV12EmprCod);
      }
      else
      {
         AV12EmprCod = httpContext.cgiGet( sPrefix+"AV12EmprCod_PARM") ;
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
      sCtrlAV34Maqcod1 = httpContext.cgiGet( sPrefix+"AV34Maqcod1_CTRL") ;
      if ( GXutil.len( sCtrlAV34Maqcod1) > 0 )
      {
         AV34Maqcod1 = httpContext.cgiGet( sCtrlAV34Maqcod1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
      }
      else
      {
         AV34Maqcod1 = httpContext.cgiGet( sPrefix+"AV34Maqcod1_PARM") ;
      }
      sCtrlAV35Maqcod2 = httpContext.cgiGet( sPrefix+"AV35Maqcod2_CTRL") ;
      if ( GXutil.len( sCtrlAV35Maqcod2) > 0 )
      {
         AV35Maqcod2 = httpContext.cgiGet( sCtrlAV35Maqcod2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
      }
      else
      {
         AV35Maqcod2 = httpContext.cgiGet( sPrefix+"AV35Maqcod2_PARM") ;
      }
      sCtrlAV26Hisprofec1 = httpContext.cgiGet( sPrefix+"AV26Hisprofec1_CTRL") ;
      if ( GXutil.len( sCtrlAV26Hisprofec1) > 0 )
      {
         AV26Hisprofec1 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV26Hisprofec1), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.format(AV26Hisprofec1, "99/99/99"));
      }
      else
      {
         AV26Hisprofec1 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV26Hisprofec1_PARM"), 0) ;
      }
      sCtrlAV29Horai = httpContext.cgiGet( sPrefix+"AV29Horai_CTRL") ;
      if ( GXutil.len( sCtrlAV29Horai) > 0 )
      {
         AV29Horai = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sCtrlAV29Horai), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29Horai", localUtil.ttoc( AV29Horai, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV29Horai = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"AV29Horai_PARM"), 0)) ;
      }
      sCtrlAV28Hisprofec2 = httpContext.cgiGet( sPrefix+"AV28Hisprofec2_CTRL") ;
      if ( GXutil.len( sCtrlAV28Hisprofec2) > 0 )
      {
         AV28Hisprofec2 = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV28Hisprofec2), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.format(AV28Hisprofec2, "99/99/99"));
      }
      else
      {
         AV28Hisprofec2 = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV28Hisprofec2_PARM"), 0) ;
      }
      sCtrlAV30Horaf = httpContext.cgiGet( sPrefix+"AV30Horaf_CTRL") ;
      if ( GXutil.len( sCtrlAV30Horaf) > 0 )
      {
         AV30Horaf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sCtrlAV30Horaf), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30Horaf", localUtil.ttoc( AV30Horaf, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV30Horaf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( sPrefix+"AV30Horaf_PARM"), 0)) ;
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
      pa1YK2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1YK2( ) ;
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
      ws1YK2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12EmprCod_PARM", GXutil.rtrim( AV12EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV12EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV12EmprCod_CTRL", GXutil.rtrim( sCtrlAV12EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisEstReo_PARM", GXutil.ltrim( localUtil.ntoc( AV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25HisEstReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25HisEstReo_CTRL", GXutil.rtrim( sCtrlAV25HisEstReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Maqcod1_PARM", GXutil.rtrim( AV34Maqcod1));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV34Maqcod1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV34Maqcod1_CTRL", GXutil.rtrim( sCtrlAV34Maqcod1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Maqcod2_PARM", GXutil.rtrim( AV35Maqcod2));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV35Maqcod2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV35Maqcod2_CTRL", GXutil.rtrim( sCtrlAV35Maqcod2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Hisprofec1_PARM", localUtil.dtoc( AV26Hisprofec1, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Hisprofec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Hisprofec1_CTRL", GXutil.rtrim( sCtrlAV26Hisprofec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Horai_PARM", localUtil.ttoc( AV29Horai, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV29Horai)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV29Horai_CTRL", GXutil.rtrim( sCtrlAV29Horai));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Hisprofec2_PARM", localUtil.dtoc( AV28Hisprofec2, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Hisprofec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Hisprofec2_CTRL", GXutil.rtrim( sCtrlAV28Hisprofec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Horaf_PARM", localUtil.ttoc( AV30Horaf, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30Horaf)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30Horaf_CTRL", GXutil.rtrim( sCtrlAV30Horaf));
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
      we1YK2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553788", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenfase_wc.js", "?202682115553788", false, true);
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

   public void subsflControlProps_352( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_35_idx ;
      edtavFascodgrid_Internalname = sPrefix+"vFASCODGRID_"+sGXsfl_35_idx ;
      edtavFasdscgrid_Internalname = sPrefix+"vFASDSCGRID_"+sGXsfl_35_idx ;
      edtavKgsfase_Internalname = sPrefix+"vKGSFASE_"+sGXsfl_35_idx ;
      edtavPor5k_Internalname = sPrefix+"vPOR5K_"+sGXsfl_35_idx ;
      edtavMtsfase_Internalname = sPrefix+"vMTSFASE_"+sGXsfl_35_idx ;
      edtavPor5m_Internalname = sPrefix+"vPOR5M_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD_"+sGXsfl_35_fel_idx ;
      edtavFascodgrid_Internalname = sPrefix+"vFASCODGRID_"+sGXsfl_35_fel_idx ;
      edtavFasdscgrid_Internalname = sPrefix+"vFASDSCGRID_"+sGXsfl_35_fel_idx ;
      edtavKgsfase_Internalname = sPrefix+"vKGSFASE_"+sGXsfl_35_fel_idx ;
      edtavPor5k_Internalname = sPrefix+"vPOR5K_"+sGXsfl_35_fel_idx ;
      edtavMtsfase_Internalname = sPrefix+"vMTSFASE_"+sGXsfl_35_fel_idx ;
      edtavPor5m_Internalname = sPrefix+"vPOR5M_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wb1YK0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_35_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEmprcod_Internalname,GXutil.rtrim( AV12EmprCod),GXutil.rtrim( localUtil.format( AV12EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEmprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavEmprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFascodgrid_Internalname,GXutil.rtrim( AV13FasCodGrid),GXutil.rtrim( localUtil.format( AV13FasCodGrid, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFascodgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFascodgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdscgrid_Internalname,GXutil.rtrim( AV14FasDscGrid),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdscgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdscgrid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavKgsfase_Internalname,GXutil.ltrim( localUtil.ntoc( AV15KgsFase, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavKgsfase_Enabled!=0) ? localUtil.format( AV15KgsFase, "ZZZZZZ9.99") : localUtil.format( AV15KgsFase, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavKgsfase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavKgsfase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor5k_Internalname,GXutil.ltrim( localUtil.ntoc( AV16Por5k, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor5k_Enabled!=0) ? localUtil.format( AV16Por5k, "ZZ9.99") : localUtil.format( AV16Por5k, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPor5k_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor5k_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMtsfase_Internalname,GXutil.ltrim( localUtil.ntoc( AV17MtsFase, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMtsfase_Enabled!=0) ? localUtil.format( AV17MtsFase, "ZZZZZZ9.99") : localUtil.format( AV17MtsFase, "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMtsfase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavMtsfase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPor5m_Internalname,GXutil.ltrim( localUtil.ntoc( AV18Por5m, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPor5m_Enabled!=0) ? localUtil.format( AV18Por5m, "ZZ9.99") : localUtil.format( AV18Por5m, "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPor5m_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPor5m_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1YK2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      /* End function sendrow_352 */
   }

   public void startgridcontrol35( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"35\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV12EmprCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEmprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13FasCodGrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFascodgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14FasDscGrid));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdscgrid_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV15KgsFase, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavKgsfase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16Por5k, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor5k_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17MtsFase, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMtsfase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18Por5m, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPor5m_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock_fase_Internalname = sPrefix+"TEXTBLOCK_FASE" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavEmprcod_Internalname = sPrefix+"vEMPRCOD" ;
      edtavFascodgrid_Internalname = sPrefix+"vFASCODGRID" ;
      edtavFasdscgrid_Internalname = sPrefix+"vFASDSCGRID" ;
      edtavKgsfase_Internalname = sPrefix+"vKGSFASE" ;
      edtavPor5k_Internalname = sPrefix+"vPOR5K" ;
      edtavMtsfase_Internalname = sPrefix+"vMTSFASE" ;
      edtavPor5m_Internalname = sPrefix+"vPOR5M" ;
      edtavTotvaluekgsfase_Internalname = sPrefix+"vTOTVALUEKGSFASE" ;
      edtavTotvaluemtsfase_Internalname = sPrefix+"vTOTVALUEMTSFASE" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavTotallines_Internalname = sPrefix+"vTOTALLINES" ;
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
      edtavPor5m_Jsonclick = "" ;
      edtavPor5m_Enabled = 0 ;
      edtavMtsfase_Jsonclick = "" ;
      edtavMtsfase_Enabled = 0 ;
      edtavPor5k_Jsonclick = "" ;
      edtavPor5k_Enabled = 0 ;
      edtavKgsfase_Jsonclick = "" ;
      edtavKgsfase_Enabled = 0 ;
      edtavFasdscgrid_Jsonclick = "" ;
      edtavFasdscgrid_Enabled = 0 ;
      edtavFascodgrid_Jsonclick = "" ;
      edtavFascodgrid_Enabled = 0 ;
      edtavEmprcod_Jsonclick = "" ;
      edtavEmprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluemtsfase_Jsonclick = "" ;
      edtavTotvaluemtsfase_Enabled = 1 ;
      edtavTotvaluekgsfase_Jsonclick = "" ;
      edtavTotvaluekgsfase_Enabled = 1 ;
      edtavTotallines_Jsonclick = "" ;
      edtavTotallines_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:''},{av:'AV29Horai',fld:'vHORAI',pic:'99:99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:''},{av:'AV30Horaf',fld:'vHORAF',pic:'99:99:99'},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51TotKgsFase',fld:'vTOTKGSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV53TotMtsFase',fld:'vTOTMTSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV52TotValueKgsFase',fld:'vTOTVALUEKGSFASE',pic:''},{av:'AV54TotValueMtsFase',fld:'vTOTVALUEMTSFASE',pic:''},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV51TotKgsFase',fld:'vTOTKGSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV53TotMtsFase',fld:'vTOTMTSFASE',pic:'ZZZZZZ9.99',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:''},{av:'AV29Horai',fld:'vHORAI',pic:'99:99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:''},{av:'AV30Horaf',fld:'vHORAF',pic:'99:99:99'},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51TotKgsFase',fld:'vTOTKGSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV53TotMtsFase',fld:'vTOTMTSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121YK2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:''},{av:'AV29Horai',fld:'vHORAI',pic:'99:99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:''},{av:'AV30Horaf',fld:'vHORAF',pic:'99:99:99'},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV51TotKgsFase',fld:'vTOTKGSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'AV53TotMtsFase',fld:'vTOTMTSFASE',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161YK2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV16Por5k',fld:'vPOR5K',pic:'ZZ9.99'},{av:'AV18Por5m',fld:'vPOR5M',pic:'ZZ9.99'},{av:'AV15KgsFase',fld:'vKGSFASE',pic:'ZZZZZZ9.99'},{av:'AV17MtsFase',fld:'vMTSFASE',pic:'ZZZZZZ9.99'},{av:'AV13FasCodGrid',fld:'vFASCODGRID',pic:'@!'},{av:'AV14FasDscGrid',fld:'vFASDSCGRID',pic:''}]}");
      setEventMetadata("'DOBUTTONEXPORT'","{handler:'e131YK2',iparms:[{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:''},{av:'AV29Horai',fld:'vHORAI',pic:'99:99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:''},{av:'AV30Horaf',fld:'vHORAF',pic:'99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A4441HisProDTF',fld:'HISPRODTF',pic:'99/99/99 99:99:99'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'AV36TTotk',fld:'vTTOTK',pic:'ZZZZZZ9.99',hsh:true},{av:'AV37TTotmt',fld:'vTTOTMT',pic:'ZZZZZZ9.99',hsh:true},{av:'AV39Filename',fld:'vFILENAME',pic:''}]");
      setEventMetadata("'DOBUTTONEXPORT'",",oparms:[{av:'AV39Filename',fld:'vFILENAME',pic:''},{av:'AV23Hisprodti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV24Hisprodtf',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV16Por5k',fld:'vPOR5K',pic:'ZZ9.99'},{av:'AV18Por5m',fld:'vPOR5M',pic:'ZZ9.99'},{av:'AV15KgsFase',fld:'vKGSFASE',pic:'ZZZZZZ9.99'},{av:'AV17MtsFase',fld:'vMTSFASE',pic:'ZZZZZZ9.99'},{av:'AV13FasCodGrid',fld:'vFASCODGRID',pic:'@!'},{av:'AV14FasDscGrid',fld:'vFASDSCGRID',pic:''}]}");
      setEventMetadata("VALIDV_EMPRCOD","{handler:'validv_Emprcod',iparms:[]");
      setEventMetadata("VALIDV_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Por5m',iparms:[]");
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
      AV40ExcelDocument.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV12EmprCod = "" ;
      wcpOAV34Maqcod1 = "" ;
      wcpOAV35Maqcod2 = "" ;
      wcpOAV26Hisprofec1 = GXutil.nullDate() ;
      wcpOAV29Horai = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV28Hisprofec2 = GXutil.nullDate() ;
      wcpOAV30Horaf = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV12EmprCod = "" ;
      AV34Maqcod1 = "" ;
      AV35Maqcod2 = "" ;
      AV26Hisprofec1 = GXutil.nullDate() ;
      AV29Horai = GXutil.resetTime( GXutil.nullDate() );
      AV28Hisprofec2 = GXutil.nullDate() ;
      AV30Horaf = GXutil.resetTime( GXutil.nullDate() );
      AV57Pgmname = "" ;
      AV51TotKgsFase = DecimalUtil.ZERO ;
      AV53TotMtsFase = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A461Fase = "" ;
      A602MaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV23Hisprodti = GXutil.resetTime( GXutil.nullDate() );
      AV24Hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      AV36TTotk = DecimalUtil.ZERO ;
      AV37TTotmt = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV39Filename = "" ;
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
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV13FasCodGrid = "" ;
      AV14FasDscGrid = "" ;
      AV15KgsFase = DecimalUtil.ZERO ;
      AV16Por5k = DecimalUtil.ZERO ;
      AV17MtsFase = DecimalUtil.ZERO ;
      AV18Por5m = DecimalUtil.ZERO ;
      AV52TotValueKgsFase = "" ;
      AV54TotValueMtsFase = "" ;
      AV58Station = "" ;
      GXv_char2 = new String[1] ;
      AV59Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV60Usurcod = "" ;
      AV27Fecha_hora = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int7 = new long[1] ;
      AV45ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H01YK2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YK2_A561HisProLin = new int[1] ;
      H01YK2_A461Fase = new String[] {""} ;
      H01YK2_A396EmprCod = new String[] {""} ;
      H01YK2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YK2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YK2_A3612HisProReo = new byte[1] ;
      H01YK2_A656ParCod = new short[1] ;
      H01YK2_n656ParCod = new boolean[] {false} ;
      H01YK2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YK2_n4441HisProDTF = new boolean[] {false} ;
      H01YK2_A602MaqCod = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV19Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV40ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV41TipoTxt = "" ;
      H01YK3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01YK3_A561HisProLin = new int[1] ;
      H01YK3_A461Fase = new String[] {""} ;
      H01YK3_A396EmprCod = new String[] {""} ;
      H01YK3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YK3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YK3_A3612HisProReo = new byte[1] ;
      H01YK3_A656ParCod = new short[1] ;
      H01YK3_n656ParCod = new boolean[] {false} ;
      H01YK3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01YK3_n4441HisProDTF = new boolean[] {false} ;
      H01YK3_A602MaqCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Gx_msg = "" ;
      AV44ErrorMessage = "" ;
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      H01YK4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01YK4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV46WebSession = httpContext.getWebSession();
      lblTextblock_fase_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV12EmprCod = "" ;
      sCtrlAV25HisEstReo = "" ;
      sCtrlAV34Maqcod1 = "" ;
      sCtrlAV35Maqcod2 = "" ;
      sCtrlAV26Hisprofec1 = "" ;
      sCtrlAV29Horai = "" ;
      sCtrlAV28Hisprofec2 = "" ;
      sCtrlAV30Horaf = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenfase_wc__default(),
         new Object[] {
             new Object[] {
            H01YK2_A558HisProFec, H01YK2_A561HisProLin, H01YK2_A461Fase, H01YK2_A396EmprCod, H01YK2_A1525HisProKgr, H01YK2_A1526HisProMtr, H01YK2_A3612HisProReo, H01YK2_A656ParCod, H01YK2_n656ParCod, H01YK2_A4441HisProDTF,
            H01YK2_n4441HisProDTF, H01YK2_A602MaqCod
            }
            , new Object[] {
            H01YK3_A558HisProFec, H01YK3_A561HisProLin, H01YK3_A461Fase, H01YK3_A396EmprCod, H01YK3_A1525HisProKgr, H01YK3_A1526HisProMtr, H01YK3_A3612HisProReo, H01YK3_A656ParCod, H01YK3_n656ParCod, H01YK3_A4441HisProDTF,
            H01YK3_n4441HisProDTF, H01YK3_A602MaqCod
            }
            , new Object[] {
            H01YK4_A1525HisProKgr, H01YK4_A1526HisProMtr
            }
         }
      );
      AV57Pgmname = "Produccion.InformeProduccionResumenFase_WC" ;
      /* GeneXus formulas. */
      AV57Pgmname = "Produccion.InformeProduccionResumenFase_WC" ;
      Gx_err = (short)(0) ;
      edtavEmprcod_Enabled = 0 ;
      edtavFascodgrid_Enabled = 0 ;
      edtavFasdscgrid_Enabled = 0 ;
      edtavKgsfase_Enabled = 0 ;
      edtavPor5k_Enabled = 0 ;
      edtavMtsfase_Enabled = 0 ;
      edtavPor5m_Enabled = 0 ;
      edtavTotvaluekgsfase_Enabled = 0 ;
      edtavTotvaluemtsfase_Enabled = 0 ;
   }

   private byte wcpOAV25HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25HisEstReo ;
   private byte A3612HisProReo ;
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
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A656ParCod ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48TotalLines ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV43CellCol ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Visible ;
   private int edtavTotallines_Visible ;
   private int subGrid_Islastpage ;
   private int edtavEmprcod_Enabled ;
   private int edtavFascodgrid_Enabled ;
   private int edtavFasdscgrid_Enabled ;
   private int edtavKgsfase_Enabled ;
   private int edtavPor5k_Enabled ;
   private int edtavMtsfase_Enabled ;
   private int edtavPor5m_Enabled ;
   private int edtavTotvaluekgsfase_Enabled ;
   private int edtavTotvaluemtsfase_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV49GridRows ;
   private int AV20PageToGo ;
   private int AV38Random ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long AV50CantidadRegistros ;
   private long GXt_int6 ;
   private long GXv_int7[] ;
   private long AV42CellRow ;
   private java.math.BigDecimal AV51TotKgsFase ;
   private java.math.BigDecimal AV53TotMtsFase ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV36TTotk ;
   private java.math.BigDecimal AV37TTotmt ;
   private java.math.BigDecimal AV15KgsFase ;
   private java.math.BigDecimal AV16Por5k ;
   private java.math.BigDecimal AV17MtsFase ;
   private java.math.BigDecimal AV18Por5m ;
   private java.math.BigDecimal c1525HisProKgr ;
   private java.math.BigDecimal c1526HisProMtr ;
   private String wcpOAV12EmprCod ;
   private String wcpOAV34Maqcod1 ;
   private String wcpOAV35Maqcod2 ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV12EmprCod ;
   private String edtavEmprcod_Internalname ;
   private String AV34Maqcod1 ;
   private String AV35Maqcod2 ;
   private String sGXsfl_35_idx="0001" ;
   private String AV57Pgmname ;
   private String A396EmprCod ;
   private String A461Fase ;
   private String A602MaqCod ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String edtavTotallines_Internalname ;
   private String edtavTotallines_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvaluekgsfase_Internalname ;
   private String AV13FasCodGrid ;
   private String edtavFascodgrid_Internalname ;
   private String AV14FasDscGrid ;
   private String edtavFasdscgrid_Internalname ;
   private String edtavKgsfase_Internalname ;
   private String edtavPor5k_Internalname ;
   private String edtavMtsfase_Internalname ;
   private String edtavPor5m_Internalname ;
   private String edtavTotvaluemtsfase_Internalname ;
   private String AV58Station ;
   private String GXv_char2[] ;
   private String AV59Emprnom ;
   private String GXv_char3[] ;
   private String AV60Usurcod ;
   private String AV27Fecha_hora ;
   private String scmdbuf ;
   private String AV41TipoTxt ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Gx_msg ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekgsfase_Jsonclick ;
   private String edtavTotvaluemtsfase_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_fase_Internalname ;
   private String lblTextblock_fase_Jsonclick ;
   private String sCtrlAV12EmprCod ;
   private String sCtrlAV25HisEstReo ;
   private String sCtrlAV34Maqcod1 ;
   private String sCtrlAV35Maqcod2 ;
   private String sCtrlAV26Hisprofec1 ;
   private String sCtrlAV29Horai ;
   private String sCtrlAV28Hisprofec2 ;
   private String sCtrlAV30Horaf ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEmprcod_Jsonclick ;
   private String edtavFascodgrid_Jsonclick ;
   private String edtavFasdscgrid_Jsonclick ;
   private String edtavKgsfase_Jsonclick ;
   private String edtavPor5k_Jsonclick ;
   private String edtavMtsfase_Jsonclick ;
   private String edtavPor5m_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV29Horai ;
   private java.util.Date wcpOAV30Horaf ;
   private java.util.Date AV29Horai ;
   private java.util.Date AV30Horaf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV23Hisprodti ;
   private java.util.Date AV24Hisprodtf ;
   private java.util.Date wcpOAV26Hisprofec1 ;
   private java.util.Date wcpOAV28Hisprofec2 ;
   private java.util.Date AV26Hisprofec1 ;
   private java.util.Date AV28Hisprofec2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4441HisProDTF ;
   private boolean n656ParCod ;
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
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk1YK3 ;
   private boolean brk1YK5 ;
   private String AV39Filename ;
   private String AV52TotValueKgsFase ;
   private String AV54TotValueMtsFase ;
   private String AV44ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01YK2_A558HisProFec ;
   private int[] H01YK2_A561HisProLin ;
   private String[] H01YK2_A461Fase ;
   private String[] H01YK2_A396EmprCod ;
   private java.math.BigDecimal[] H01YK2_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YK2_A1526HisProMtr ;
   private byte[] H01YK2_A3612HisProReo ;
   private short[] H01YK2_A656ParCod ;
   private boolean[] H01YK2_n656ParCod ;
   private java.util.Date[] H01YK2_A4441HisProDTF ;
   private boolean[] H01YK2_n4441HisProDTF ;
   private String[] H01YK2_A602MaqCod ;
   private java.util.Date[] H01YK3_A558HisProFec ;
   private int[] H01YK3_A561HisProLin ;
   private String[] H01YK3_A461Fase ;
   private String[] H01YK3_A396EmprCod ;
   private java.math.BigDecimal[] H01YK3_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YK3_A1526HisProMtr ;
   private byte[] H01YK3_A3612HisProReo ;
   private short[] H01YK3_A656ParCod ;
   private boolean[] H01YK3_n656ParCod ;
   private java.util.Date[] H01YK3_A4441HisProDTF ;
   private boolean[] H01YK3_n4441HisProDTF ;
   private String[] H01YK3_A602MaqCod ;
   private java.math.BigDecimal[] H01YK4_A1525HisProKgr ;
   private java.math.BigDecimal[] H01YK4_A1526HisProMtr ;
   private com.genexus.gxoffice.ExcelDoc AV40ExcelDocument ;
   private com.genexus.webpanels.WebSession AV46WebSession ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV45ProgressIndicator ;
}

final  class informeproduccionresumenfase_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01YK2", "SELECT HisProFec, HisProLin, Fase, EmprCod, HisProKgr, HisProMtr, HisProReo, ParCod, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ORDER BY EmprCod, Fase ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YK3", "SELECT HisProFec, HisProLin, Fase, EmprCod, HisProKgr, HisProMtr, HisProReo, ParCod, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ORDER BY EmprCod, Fase ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01YK4", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               return;
            case 2 :
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

