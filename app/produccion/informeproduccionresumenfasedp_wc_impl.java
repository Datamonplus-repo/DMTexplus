package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informeproduccionresumenfasedp_wc_impl extends GXWebComponent
{
   public informeproduccionresumenfasedp_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public informeproduccionresumenfasedp_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproduccionresumenfasedp_wc_impl.class ));
   }

   public informeproduccionresumenfasedp_wc_impl( int remoteHandle ,
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
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12EmprCod", AV12EmprCod);
               AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
               AV34Maqcod1 = httpContext.GetPar( "Maqcod1") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
               AV35Maqcod2 = httpContext.GetPar( "Maqcod2") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
               AV26Hisprofec1 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec1")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.ttoc( AV26Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV28Hisprofec2 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec2")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.ttoc( AV28Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV77OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OperarioFrom), 6, 0));
               AV78OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78OperarioTo), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV12EmprCod,Byte.valueOf(AV25HisEstReo),AV34Maqcod1,AV35Maqcod2,AV26Hisprofec1,AV28Hisprofec2,Integer.valueOf(AV77OperarioFrom),Integer.valueOf(AV78OperarioTo)});
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
      AV93Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25HisEstReo = (byte)(GXutil.lval( httpContext.GetPar( "HisEstReo"))) ;
      AV34Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV35Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV26Hisprofec1 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec1")) ;
      AV28Hisprofec2 = localUtil.parseDTimeParm( httpContext.GetPar( "Hisprofec2")) ;
      AV77OperarioFrom = (int)(GXutil.lval( httpContext.GetPar( "OperarioFrom"))) ;
      AV78OperarioTo = (int)(GXutil.lval( httpContext.GetPar( "OperarioTo"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV60SDTInformeProduccionResumenFase);
      AV65Tot_HisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HisProKgr"), ".") ;
      AV67Tot_HisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "Tot_HisProMtr"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa22L2( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.informeproduccionresumenfasedp_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV12EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV25HisEstReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV34Maqcod1)),GXutil.URLEncode(GXutil.rtrim(AV35Maqcod2)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV26Hisprofec1)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV28Hisprofec2)),GXutil.URLEncode(GXutil.ltrimstr(AV77OperarioFrom,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV78OperarioTo,6,0))}, new String[] {"EmprCod","HisEstReo","Maqcod1","Maqcod2","Hisprofec1","Hisprofec2","OperarioFrom","OperarioTo"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtinformeproduccionresumenfase", AV60SDTInformeProduccionResumenFase);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtinformeproduccionresumenfase", AV60SDTInformeProduccionResumenFase);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_32, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV12EmprCod", GXutil.rtrim( wcpOAV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25HisEstReo", GXutil.ltrim( localUtil.ntoc( wcpOAV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV34Maqcod1", GXutil.rtrim( wcpOAV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV35Maqcod2", GXutil.rtrim( wcpOAV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26Hisprofec1", localUtil.ttoc( wcpOAV26Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28Hisprofec2", localUtil.ttoc( wcpOAV28Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV77OperarioFrom", GXutil.ltrim( localUtil.ntoc( wcpOAV77OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV78OperarioTo", GXutil.ltrim( localUtil.ntoc( wcpOAV78OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV12EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISESTREO", GXutil.ltrim( localUtil.ntoc( AV25HisEstReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD1", GXutil.rtrim( AV34Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD2", GXutil.rtrim( AV35Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC1", localUtil.ttoc( AV26Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHISPROFEC2", localUtil.ttoc( AV28Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOFROM", GXutil.ltrim( localUtil.ntoc( AV77OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vOPERARIOTO", GXutil.ltrim( localUtil.ntoc( AV78OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV65Tot_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV67Tot_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTINFORMEPRODUCCIONRESUMENFASE", AV60SDTInformeProduccionResumenFase);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTINFORMEPRODUCCIONRESUMENFASE", AV60SDTInformeProduccionResumenFase);
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

   public void renderHtmlCloseForm22L2( )
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
      return "Produccion.InformeProduccionResumenFaseDP_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Informe Produccion Resumen Fase", "") ;
   }

   public void wb22L0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.produccion.informeproduccionresumenfasedp_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 32, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_22L2( true) ;
      }
      else
      {
         wb_table1_19_22L2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_22L2e( boolean wbgen )
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
            AV81GXV1 = nGXsfl_32_idx ;
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
         wb_table2_46_22L2( true) ;
      }
      else
      {
         wb_table2_46_22L2( false) ;
      }
      return  ;
   }

   public void wb_table2_46_22L2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV93Pgmname), GXutil.rtrim( localUtil.format( AV93Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", edtavPgmname_Visible, 0, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotallines_Internalname, GXutil.ltrim( localUtil.ntoc( AV48TotalLines, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV48TotalLines), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotallines_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotallines_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtinformeproduccionresumenfase_totalkg_Internalname, GXutil.ltrim( localUtil.ntoc( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Totalkg(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Totalkg(), "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtinformeproduccionresumenfase_totalkg_Jsonclick, 0, "Attribute", "", "", "", "", edtavSdtinformeproduccionresumenfase_totalkg_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSdtinformeproduccionresumenfase_totalmt_Internalname, GXutil.ltrim( localUtil.ntoc( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Totalmt(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Totalmt(), "ZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,78);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSdtinformeproduccionresumenfase_totalmt_Jsonclick, 0, "Attribute", "", "", "", "", edtavSdtinformeproduccionresumenfase_totalmt_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_kg_Internalname, GXutil.ltrim( localUtil.ntoc( AV62TOTAL_KG, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV62TOTAL_KG, "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_kg_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_kg_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotal_mt_Internalname, GXutil.ltrim( localUtil.ntoc( AV63TOTAL_MT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV63TOTAL_MT, "ZZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,80);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotal_mt_Jsonclick, 0, "Attribute", "", "", "", "", edtavTotal_mt_Visible, 1, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
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
               AV81GXV1 = nGXsfl_32_idx ;
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

   public void start22L2( )
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
            strup22L0( ) ;
         }
      }
   }

   public void ws22L2( )
   {
      start22L2( ) ;
      evt22L2( ) ;
   }

   public void evt22L2( )
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
                              strup22L0( ) ;
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
                              strup22L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1122L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1222L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22L0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1322L2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22L0( ) ;
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
                              strup22L0( ) ;
                           }
                           nGXsfl_32_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_322( ) ;
                           AV81GXV1 = (int)(nGXsfl_32_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() >= AV81GXV1 ) && ( AV81GXV1 > 0 ) )
                           {
                              AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)) );
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
                                       e1422L2 ();
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
                                       e1522L2 ();
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
                                       e1622L2 ();
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
                                    strup22L0( ) ;
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

   public void we22L2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm22L2( ) ;
         }
      }
   }

   public void pa22L2( )
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
                                 String AV93Pgmname ,
                                 String AV12EmprCod ,
                                 byte AV25HisEstReo ,
                                 String AV34Maqcod1 ,
                                 String AV35Maqcod2 ,
                                 java.util.Date AV26Hisprofec1 ,
                                 java.util.Date AV28Hisprofec2 ,
                                 int AV77OperarioFrom ,
                                 int AV78OperarioTo ,
                                 app.produccion.SdtSDTInformeProduccionResumenFase AV60SDTInformeProduccionResumenFase ,
                                 java.math.BigDecimal AV65Tot_HisProKgr ,
                                 java.math.BigDecimal AV67Tot_HisProMtr ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1522L2 ();
      GRID_nCurrentRecord = 0 ;
      rf22L2( ) ;
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
      rf22L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV93Pgmname = "Produccion.InformeProduccionResumenFaseDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__fase_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
   }

   public void rf22L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(32) ;
      /* Execute user event: Refresh */
      e1522L2 ();
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
         e1622L2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_32_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1622L2 ();
         }
         wbEnd = (short)(32) ;
         wb22L0( ) ;
      }
      bGXsfl_32_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22L2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROKGR", GXutil.ltrim( localUtil.ntoc( AV65Tot_HisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOT_HISPROMTR", GXutil.ltrim( localUtil.ntoc( AV67Tot_HisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99")));
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
      return AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV93Pgmname, AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, AV60SDTInformeProduccionResumenFase, AV65Tot_HisProKgr, AV67Tot_HisProMtr, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV93Pgmname = "Produccion.InformeProduccionResumenFaseDP_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__fase_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hisprokgr_Enabled), 5, 0), true);
      edtavTotvalue_hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvalue_hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_hispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1422L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vSDTINFORMEPRODUCCIONRESUMENFASE"), AV60SDTInformeProduccionResumenFase);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtinformeproduccionresumenfase"), AV60SDTInformeProduccionResumenFase);
         /* Read saved values. */
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV12EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV12EmprCod") ;
         wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
         wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
         wcpOAV26Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV26Hisprofec1"), 0) ;
         wcpOAV28Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV28Hisprofec2"), 0) ;
         wcpOAV77OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV78OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            AV81GXV1 = (int)(nGXsfl_32_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() >= AV81GXV1 ) && ( AV81GXV1 > 0 ) )
            {
               AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)) );
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
         AV66TotValue_HisProKgr = httpContext.cgiGet( edtavTotvalue_hisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TotValue_HisProKgr", AV66TotValue_HisProKgr);
         AV68TotValue_HisProMtr = httpContext.cgiGet( edtavTotvalue_hispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValue_HisProMtr", AV68TotValue_HisProMtr);
         AV93Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Pgmname", AV93Pgmname);
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
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalkg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalkg_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTINFORMEPRODUCCIONRESUMENFASE_TOTALKG");
            GX_FocusControl = edtavSdtinformeproduccionresumenfase_totalkg_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60SDTInformeProduccionResumenFase.setgxTv_SdtSDTInformeProduccionResumenFase_Totalkg( DecimalUtil.ZERO );
         }
         else
         {
            AV60SDTInformeProduccionResumenFase.setgxTv_SdtSDTInformeProduccionResumenFase_Totalkg( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalkg_Internalname)) );
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalmt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalmt_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SDTINFORMEPRODUCCIONRESUMENFASE_TOTALMT");
            GX_FocusControl = edtavSdtinformeproduccionresumenfase_totalmt_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60SDTInformeProduccionResumenFase.setgxTv_SdtSDTInformeProduccionResumenFase_Totalmt( DecimalUtil.ZERO );
         }
         else
         {
            AV60SDTInformeProduccionResumenFase.setgxTv_SdtSDTInformeProduccionResumenFase_Totalmt( localUtil.ctond( httpContext.cgiGet( edtavSdtinformeproduccionresumenfase_totalmt_Internalname)) );
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_KG");
            GX_FocusControl = edtavTotal_kg_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV62TOTAL_KG = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TOTAL_KG", GXutil.ltrimstr( AV62TOTAL_KG, 10, 2));
         }
         else
         {
            AV62TOTAL_KG = localUtil.ctond( httpContext.cgiGet( edtavTotal_kg_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TOTAL_KG", GXutil.ltrimstr( AV62TOTAL_KG, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOTAL_MT");
            GX_FocusControl = edtavTotal_mt_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63TOTAL_MT = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TOTAL_MT", GXutil.ltrimstr( AV63TOTAL_MT, 10, 2));
         }
         else
         {
            AV63TOTAL_MT = localUtil.ctond( httpContext.cgiGet( edtavTotal_mt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TOTAL_MT", GXutil.ltrimstr( AV63TOTAL_MT, 10, 2));
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
      e1422L2 ();
      if (returnInSub) return;
   }

   public void e1422L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      informeproduccionresumenfasedp_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV72EmprNom ;
      GXv_char4[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      informeproduccionresumenfasedp_wc_impl.this.AV12EmprCod = GXv_char2[0] ;
      informeproduccionresumenfasedp_wc_impl.this.AV72EmprNom = GXv_char3[0] ;
      informeproduccionresumenfasedp_wc_impl.this.AV73UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12EmprCod", AV12EmprCod);
      edtavPgmname_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Visible), 5, 0), true);
      edtavTotallines_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotallines_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotallines_Visible), 5, 0), true);
      edtavSdtinformeproduccionresumenfase_totalkg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_totalkg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_totalkg_Visible), 5, 0), true);
      edtavSdtinformeproduccionresumenfase_totalmt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtinformeproduccionresumenfase_totalmt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtinformeproduccionresumenfase_totalmt_Visible), 5, 0), true);
      edtavTotal_kg_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_kg_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_kg_Visible), 5, 0), true);
      edtavTotal_mt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotal_mt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotal_mt_Visible), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_SdtSDTInformeProduccionResumenFase5 = AV60SDTInformeProduccionResumenFase;
      GXv_SdtSDTInformeProduccionResumenFase6[0] = GXt_SdtSDTInformeProduccionResumenFase5;
      new app.produccion.dpinformeproduccionresumenfases(remoteHandle, context).execute( AV12EmprCod, AV25HisEstReo, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, AV77OperarioFrom, AV78OperarioTo, GXv_SdtSDTInformeProduccionResumenFase6) ;
      GXt_SdtSDTInformeProduccionResumenFase5 = GXv_SdtSDTInformeProduccionResumenFase6[0] ;
      AV60SDTInformeProduccionResumenFase = GXt_SdtSDTInformeProduccionResumenFase5;
      gx_BV32 = true ;
      this.executeExternalObjectMethod(sPrefix, false, "GlobalEvents", "ProgressBar", new Object[] {Integer.valueOf(1),Integer.valueOf(100),Boolean.valueOf(false),httpContext.getMessage( "Iniciando Informe Produccion Resumen Fase...", ""),httpContext.getMessage( "GXProgressBarDanger", "")}, true);
      /* Execute user subroutine: 'TOTALES' */
      S122 ();
      if (returnInSub) return;
      AV96GXV15 = 1 ;
      while ( AV96GXV15 <= AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() )
      {
         AV61SDTInformeProduccionResumenFase_Fase = (app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV96GXV15));
         if ( AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr().doubleValue() > 0 )
         {
            AV56HisProKgr = AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr() ;
            AV61SDTInformeProduccionResumenFase_Fase.setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos( ((AV69TTotk.doubleValue()>0) ? (AV56HisProKgr.divide(AV69TTotk, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         if ( AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr().doubleValue() > 0 )
         {
            AV57HisProMtr = AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr() ;
            AV61SDTInformeProduccionResumenFase_Fase.setgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros( ((AV70TTotmt.doubleValue()>0) ? (AV57HisProMtr.divide(AV70TTotmt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)) : DecimalUtil.doubleToDec(0)) );
         }
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr())==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV61SDTInformeProduccionResumenFase_Fase.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr())==0) )
         {
            AV76idx = (short)(AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().indexof(AV61SDTInformeProduccionResumenFase_Fase)) ;
            AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().removeItem(AV76idx);
            gx_BV32 = true ;
         }
         AV96GXV15 = (int)(AV96GXV15+1) ;
      }
   }

   public void e1522L2( )
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
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1122L2( )
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

   public void e1222L2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1622L2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() )
      {
         AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)) );
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
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
   }

   public void e1322L2( )
   {
      AV81GXV1 = (int)(nGXsfl_32_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV81GXV1 > 0 ) && ( AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() >= AV81GXV1 ) )
      {
         AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().currentItem( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)) );
      }
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV55ExcelFilename ;
      GXv_char3[0] = AV44ErrorMessage ;
      new app.produccion.informeproduccionresumenfasedp_wcexport(remoteHandle, context).execute( AV60SDTInformeProduccionResumenFase, GXv_char4, GXv_char3) ;
      informeproduccionresumenfasedp_wc_impl.this.AV55ExcelFilename = GXv_char4[0] ;
      informeproduccionresumenfasedp_wc_impl.this.AV44ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV55ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV55ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV44ErrorMessage);
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
      if ( GXutil.strcmp(AV19Session.getValue(AV93Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV93Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV93Pgmname+"GridState"), null, null);
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
      AV10GridState.fromxml(AV19Session.getValue(AV93Pgmname+"GridState"), null, null);
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      if ( ! (GXutil.strcmp("", AV12EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV12EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV25HisEstReo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISESTREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV25HisEstReo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV34Maqcod1)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV34Maqcod1 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV35Maqcod2)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV35Maqcod2 );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV26Hisprofec1) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC1" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV26Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV28Hisprofec2) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HISPROFEC2" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV28Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV77OperarioFrom) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOFROM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV77OperarioFrom, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV78OperarioTo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPERARIOTO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV78OperarioTo, 6, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV93Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV65Tot_HisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Tot_HisProKgr", GXutil.ltrimstr( AV65Tot_HisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99")));
      AV67Tot_HisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Tot_HisProMtr", GXutil.ltrimstr( AV67Tot_HisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99")));
   }

   public void S162( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV97GXV16 = 1 ;
      while ( AV97GXV16 <= AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().size() )
      {
         AV64SDTInformeProduccionResumenFase_FaseItem = (app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV97GXV16));
         AV65Tot_HisProKgr = AV65Tot_HisProKgr.add((AV64SDTInformeProduccionResumenFase_FaseItem.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65Tot_HisProKgr", GXutil.ltrimstr( AV65Tot_HisProKgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROKGR", getSecureSignedToken( sPrefix, localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99")));
         AV67Tot_HisProMtr = AV67Tot_HisProMtr.add((AV64SDTInformeProduccionResumenFase_FaseItem.getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr())) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67Tot_HisProMtr", GXutil.ltrimstr( AV67Tot_HisProMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOT_HISPROMTR", getSecureSignedToken( sPrefix, localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99")));
         AV97GXV16 = (int)(AV97GXV16+1) ;
      }
      AV66TotValue_HisProKgr = localUtil.format( AV65Tot_HisProKgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TotValue_HisProKgr", AV66TotValue_HisProKgr);
      AV68TotValue_HisProMtr = localUtil.format( AV67Tot_HisProMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TotValue_HisProMtr", AV68TotValue_HisProMtr);
   }

   public void S122( )
   {
      /* 'TOTALES' Routine */
      returnInSub = false ;
      AV69TTotk = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TTotk", GXutil.ltrimstr( AV69TTotk, 10, 2));
      AV70TTotmt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TTotmt", GXutil.ltrimstr( AV70TTotmt, 10, 2));
      /* Optimized group. */
      /* Using cursor H022L2 */
      pr_default.execute(0, new Object[] {AV12EmprCod, AV34Maqcod1, AV35Maqcod2, AV26Hisprofec1, AV28Hisprofec2, Byte.valueOf(AV25HisEstReo), Byte.valueOf(AV25HisEstReo)});
      c1525HisProKgr = H022L2_A1525HisProKgr[0] ;
      c1526HisProMtr = H022L2_A1526HisProMtr[0] ;
      pr_default.close(0);
      AV69TTotk = AV69TTotk.add(c1525HisProKgr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TTotk", GXutil.ltrimstr( AV69TTotk, 10, 2));
      AV70TTotmt = AV70TTotmt.add(c1526HisProMtr) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TTotmt", GXutil.ltrimstr( AV70TTotmt, 10, 2));
      /* End optimized group. */
   }

   public void wb_table2_46_22L2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_hisprokgr_Internalname, httpContext.getMessage( "Tot Value_His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hisprokgr_Internalname, AV66TotValue_HisProKgr, GXutil.rtrim( localUtil.format( AV66TotValue_HisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'" + sPrefix + "',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_hispromtr_Internalname, AV68TotValue_HisProMtr, GXutil.rtrim( localUtil.format( AV68TotValue_HisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_hispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_hispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_46_22L2e( true) ;
      }
      else
      {
         wb_table2_46_22L2e( false) ;
      }
   }

   public void wb_table1_19_22L2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='TextBlockTitleCell'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock_fase_Internalname, httpContext.getMessage( "Datos por Fase", ""), "", "", lblTextblock_fase_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\InformeProduccionResumenFaseDP_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_22L2e( true) ;
      }
      else
      {
         wb_table1_19_22L2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV12EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12EmprCod", AV12EmprCod);
      AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
      AV34Maqcod1 = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
      AV35Maqcod2 = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
      AV26Hisprofec1 = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.ttoc( AV26Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV28Hisprofec2 = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.ttoc( AV28Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV77OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OperarioFrom), 6, 0));
      AV78OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78OperarioTo), 6, 0));
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
      pa22L2( ) ;
      ws22L2( ) ;
      we22L2( ) ;
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
      sCtrlAV28Hisprofec2 = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV77OperarioFrom = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV78OperarioTo = (String)getParm(obj,7,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa22L2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "produccion\\informeproduccionresumenfasedp_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa22L2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV12EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12EmprCod", AV12EmprCod);
         AV25HisEstReo = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25HisEstReo", GXutil.str( AV25HisEstReo, 1, 0));
         AV34Maqcod1 = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34Maqcod1", AV34Maqcod1);
         AV35Maqcod2 = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35Maqcod2", AV35Maqcod2);
         AV26Hisprofec1 = (java.util.Date)getParm(obj,6,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.ttoc( AV26Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV28Hisprofec2 = (java.util.Date)getParm(obj,7,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.ttoc( AV28Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV77OperarioFrom = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OperarioFrom), 6, 0));
         AV78OperarioTo = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78OperarioTo), 6, 0));
      }
      wcpOAV12EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV12EmprCod") ;
      wcpOAV25HisEstReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25HisEstReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV34Maqcod1 = httpContext.cgiGet( sPrefix+"wcpOAV34Maqcod1") ;
      wcpOAV35Maqcod2 = httpContext.cgiGet( sPrefix+"wcpOAV35Maqcod2") ;
      wcpOAV26Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV26Hisprofec1"), 0) ;
      wcpOAV28Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV28Hisprofec2"), 0) ;
      wcpOAV77OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV77OperarioFrom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV78OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV78OperarioTo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV12EmprCod, wcpOAV12EmprCod) != 0 ) || ( AV25HisEstReo != wcpOAV25HisEstReo ) || ( GXutil.strcmp(AV34Maqcod1, wcpOAV34Maqcod1) != 0 ) || ( GXutil.strcmp(AV35Maqcod2, wcpOAV35Maqcod2) != 0 ) || !( GXutil.dateCompare(AV26Hisprofec1, wcpOAV26Hisprofec1) ) || !( GXutil.dateCompare(AV28Hisprofec2, wcpOAV28Hisprofec2) ) || ( AV77OperarioFrom != wcpOAV77OperarioFrom ) || ( AV78OperarioTo != wcpOAV78OperarioTo ) ) )
      {
         setjustcreated();
      }
      wcpOAV12EmprCod = AV12EmprCod ;
      wcpOAV25HisEstReo = AV25HisEstReo ;
      wcpOAV34Maqcod1 = AV34Maqcod1 ;
      wcpOAV35Maqcod2 = AV35Maqcod2 ;
      wcpOAV26Hisprofec1 = AV26Hisprofec1 ;
      wcpOAV28Hisprofec2 = AV28Hisprofec2 ;
      wcpOAV77OperarioFrom = AV77OperarioFrom ;
      wcpOAV78OperarioTo = AV78OperarioTo ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV12EmprCod = httpContext.cgiGet( sPrefix+"AV12EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV12EmprCod) > 0 )
      {
         AV12EmprCod = httpContext.cgiGet( sCtrlAV12EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12EmprCod", AV12EmprCod);
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
         AV26Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sCtrlAV26Hisprofec1), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26Hisprofec1", localUtil.ttoc( AV26Hisprofec1, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV26Hisprofec1 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV26Hisprofec1_PARM"), 0) ;
      }
      sCtrlAV28Hisprofec2 = httpContext.cgiGet( sPrefix+"AV28Hisprofec2_CTRL") ;
      if ( GXutil.len( sCtrlAV28Hisprofec2) > 0 )
      {
         AV28Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sCtrlAV28Hisprofec2), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28Hisprofec2", localUtil.ttoc( AV28Hisprofec2, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV28Hisprofec2 = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV28Hisprofec2_PARM"), 0) ;
      }
      sCtrlAV77OperarioFrom = httpContext.cgiGet( sPrefix+"AV77OperarioFrom_CTRL") ;
      if ( GXutil.len( sCtrlAV77OperarioFrom) > 0 )
      {
         AV77OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV77OperarioFrom), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77OperarioFrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OperarioFrom), 6, 0));
      }
      else
      {
         AV77OperarioFrom = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV77OperarioFrom_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV78OperarioTo = httpContext.cgiGet( sPrefix+"AV78OperarioTo_CTRL") ;
      if ( GXutil.len( sCtrlAV78OperarioTo) > 0 )
      {
         AV78OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV78OperarioTo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78OperarioTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78OperarioTo), 6, 0));
      }
      else
      {
         AV78OperarioTo = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV78OperarioTo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa22L2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws22L2( ) ;
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
      ws22L2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Hisprofec1_PARM", localUtil.ttoc( AV26Hisprofec1, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26Hisprofec1)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26Hisprofec1_CTRL", GXutil.rtrim( sCtrlAV26Hisprofec1));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Hisprofec2_PARM", localUtil.ttoc( AV28Hisprofec2, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28Hisprofec2)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28Hisprofec2_CTRL", GXutil.rtrim( sCtrlAV28Hisprofec2));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77OperarioFrom_PARM", GXutil.ltrim( localUtil.ntoc( AV77OperarioFrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV77OperarioFrom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV77OperarioFrom_CTRL", GXutil.rtrim( sCtrlAV77OperarioFrom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78OperarioTo_PARM", GXutil.ltrim( localUtil.ntoc( AV78OperarioTo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV78OperarioTo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV78OperarioTo_CTRL", GXutil.rtrim( sCtrlAV78OperarioTo));
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
      we22L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553224", true, true);
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
      httpContext.AddJavascriptSource("produccion/informeproduccionresumenfasedp_wc.js", "?202682115553224", false, true);
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
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__EMPRCOD_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__MAQCOD_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPRODTF_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PARCOD_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROREO_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASE_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASDSC_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROKGR_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORKILOS_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROMTR_"+sGXsfl_32_idx ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORMETROS_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_322( )
   {
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__EMPRCOD_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__MAQCOD_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPRODTF_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PARCOD_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROREO_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASE_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASDSC_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROKGR_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORKILOS_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROMTR_"+sGXsfl_32_fel_idx ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORMETROS_"+sGXsfl_32_fel_idx ;
   }

   public void sendrow_322( )
   {
      subsflControlProps_322( ) ;
      wb22L0( ) ;
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod()),GXutil.rtrim( localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Emprcod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Maqcod()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname,localUtil.ttoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprodtf(), "99/99/99 99:99:99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisproreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__hisproreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__fase_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase()),GXutil.rtrim( localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fase(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname,GXutil.rtrim( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hisprokgr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Porkilos(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__porkilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Hispromtr(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros(), (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled!=0) ? localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros(), "ZZ9.99") : localUtil.format( ((app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem)AV60SDTInformeProduccionResumenFase.getgxTv_SdtSDTInformeProduccionResumenFase_Fase().elementAt(-1+AV81GXV1)).getgxTv_SdtSDTInformeProduccionResumenFase_FaseItem_Pormetros(), "ZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavSdtinformeproduccionresumenfase_fase__pormetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes22L2( ) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
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
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock_fase_Internalname = sPrefix+"TEXTBLOCK_FASE" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__EMPRCOD" ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__MAQCOD" ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPRODTF" ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PARCOD" ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROREO" ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASE" ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__FASDSC" ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROKGR" ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORKILOS" ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__HISPROMTR" ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_FASE__PORMETROS" ;
      edtavTotvalue_hisprokgr_Internalname = sPrefix+"vTOTVALUE_HISPROKGR" ;
      edtavTotvalue_hispromtr_Internalname = sPrefix+"vTOTVALUE_HISPROMTR" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      edtavTotallines_Internalname = sPrefix+"vTOTALLINES" ;
      edtavSdtinformeproduccionresumenfase_totalkg_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_TOTALKG" ;
      edtavSdtinformeproduccionresumenfase_totalmt_Internalname = sPrefix+"SDTINFORMEPRODUCCIONRESUMENFASE_TOTALMT" ;
      edtavTotal_kg_Internalname = sPrefix+"vTOTAL_KG" ;
      edtavTotal_mt_Internalname = sPrefix+"vTOTAL_MT" ;
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
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled = 0 ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_hispromtr_Jsonclick = "" ;
      edtavTotvalue_hispromtr_Enabled = 1 ;
      edtavTotvalue_hisprokgr_Jsonclick = "" ;
      edtavTotvalue_hisprokgr_Enabled = 1 ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled = -1 ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled = -1 ;
      edtavTotal_mt_Jsonclick = "" ;
      edtavTotal_mt_Visible = 1 ;
      edtavTotal_kg_Jsonclick = "" ;
      edtavTotal_kg_Visible = 1 ;
      edtavSdtinformeproduccionresumenfase_totalmt_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_totalmt_Visible = 1 ;
      edtavSdtinformeproduccionresumenfase_totalkg_Jsonclick = "" ;
      edtavSdtinformeproduccionresumenfase_totalkg_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV77OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV78OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV60SDTInformeProduccionResumenFase',fld:'vSDTINFORMEPRODUCCIONRESUMENFASE',pic:''},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV65Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV67Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV65Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV67Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotValue_HisProKgr',fld:'vTOTVALUE_HISPROKGR',pic:''},{av:'AV68TotValue_HisProMtr',fld:'vTOTVALUE_HISPROMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1122L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV77OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV78OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV60SDTInformeProduccionResumenFase',fld:'vSDTINFORMEPRODUCCIONRESUMENFASE',pic:''},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV65Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV67Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1222L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25HisEstReo',fld:'vHISESTREO',pic:'9'},{av:'AV34Maqcod1',fld:'vMAQCOD1',pic:''},{av:'AV35Maqcod2',fld:'vMAQCOD2',pic:''},{av:'AV26Hisprofec1',fld:'vHISPROFEC1',pic:'99/99/99 99:99'},{av:'AV28Hisprofec2',fld:'vHISPROFEC2',pic:'99/99/99 99:99'},{av:'AV77OperarioFrom',fld:'vOPERARIOFROM',pic:'ZZZZZ9'},{av:'AV78OperarioTo',fld:'vOPERARIOTO',pic:'ZZZZZ9'},{av:'AV60SDTInformeProduccionResumenFase',fld:'vSDTINFORMEPRODUCCIONRESUMENFASE',pic:''},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32},{av:'AV65Tot_HisProKgr',fld:'vTOT_HISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV67Tot_HisProMtr',fld:'vTOT_HISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1622L2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1322L2',iparms:[{av:'AV60SDTInformeProduccionResumenFase',fld:'vSDTINFORMEPRODUCCIONRESUMENFASE',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_32',ctrl:'GRID',prop:'GridRC',grid:32}]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv12',iparms:[]");
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
      wcpOAV12EmprCod = "" ;
      wcpOAV34Maqcod1 = "" ;
      wcpOAV35Maqcod2 = "" ;
      wcpOAV26Hisprofec1 = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV28Hisprofec2 = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV12EmprCod = "" ;
      AV34Maqcod1 = "" ;
      AV35Maqcod2 = "" ;
      AV26Hisprofec1 = GXutil.resetTime( GXutil.nullDate() );
      AV28Hisprofec2 = GXutil.resetTime( GXutil.nullDate() );
      AV93Pgmname = "" ;
      AV60SDTInformeProduccionResumenFase = new app.produccion.SdtSDTInformeProduccionResumenFase(remoteHandle, context);
      AV65Tot_HisProKgr = DecimalUtil.ZERO ;
      AV67Tot_HisProMtr = DecimalUtil.ZERO ;
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
      AV62TOTAL_KG = DecimalUtil.ZERO ;
      AV63TOTAL_MT = DecimalUtil.ZERO ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV66TotValue_HisProKgr = "" ;
      AV68TotValue_HisProMtr = "" ;
      AV71Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV72EmprNom = "" ;
      AV73UsurCod = "" ;
      GXt_SdtSDTInformeProduccionResumenFase5 = new app.produccion.SdtSDTInformeProduccionResumenFase(remoteHandle, context);
      GXv_SdtSDTInformeProduccionResumenFase6 = new app.produccion.SdtSDTInformeProduccionResumenFase[1] ;
      AV61SDTInformeProduccionResumenFase_Fase = new app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem(remoteHandle, context);
      AV56HisProKgr = DecimalUtil.ZERO ;
      AV69TTotk = DecimalUtil.ZERO ;
      AV57HisProMtr = DecimalUtil.ZERO ;
      AV70TTotmt = DecimalUtil.ZERO ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV55ExcelFilename = "" ;
      GXv_char4 = new String[1] ;
      AV44ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      AV64SDTInformeProduccionResumenFase_FaseItem = new app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem(remoteHandle, context);
      c1525HisProKgr = DecimalUtil.ZERO ;
      c1526HisProMtr = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H022L2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H022L2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      lblTextblock_fase_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV12EmprCod = "" ;
      sCtrlAV25HisEstReo = "" ;
      sCtrlAV34Maqcod1 = "" ;
      sCtrlAV35Maqcod2 = "" ;
      sCtrlAV26Hisprofec1 = "" ;
      sCtrlAV28Hisprofec2 = "" ;
      sCtrlAV77OperarioFrom = "" ;
      sCtrlAV78OperarioTo = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.informeproduccionresumenfasedp_wc__default(),
         new Object[] {
             new Object[] {
            H022L2_A1525HisProKgr, H022L2_A1526HisProMtr
            }
         }
      );
      AV93Pgmname = "Produccion.InformeProduccionResumenFaseDP_WC" ;
      /* GeneXus formulas. */
      AV93Pgmname = "Produccion.InformeProduccionResumenFaseDP_WC" ;
      Gx_err = (short)(0) ;
      edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__fase_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled = 0 ;
      edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled = 0 ;
      edtavTotvalue_hisprokgr_Enabled = 0 ;
      edtavTotvalue_hispromtr_Enabled = 0 ;
   }

   private byte wcpOAV25HisEstReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25HisEstReo ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV48TotalLines ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV76idx ;
   private int wcpOAV77OperarioFrom ;
   private int wcpOAV78OperarioTo ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_32 ;
   private int AV77OperarioFrom ;
   private int AV78OperarioTo ;
   private int nGXsfl_32_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV81GXV1 ;
   private int edtavPgmname_Visible ;
   private int edtavTotallines_Visible ;
   private int edtavSdtinformeproduccionresumenfase_totalkg_Visible ;
   private int edtavSdtinformeproduccionresumenfase_totalmt_Visible ;
   private int edtavTotal_kg_Visible ;
   private int edtavTotal_mt_Visible ;
   private int subGrid_Islastpage ;
   private int edtavSdtinformeproduccionresumenfase_fase__emprcod_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__maqcod_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__parcod_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__hisproreo_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__fase_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__fasdsc_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__porkilos_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__hispromtr_Enabled ;
   private int edtavSdtinformeproduccionresumenfase_fase__pormetros_Enabled ;
   private int edtavTotvalue_hisprokgr_Enabled ;
   private int edtavTotvalue_hispromtr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_32_fel_idx=1 ;
   private int AV96GXV15 ;
   private int AV20PageToGo ;
   private int AV97GXV16 ;
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
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV65Tot_HisProKgr ;
   private java.math.BigDecimal AV67Tot_HisProMtr ;
   private java.math.BigDecimal AV62TOTAL_KG ;
   private java.math.BigDecimal AV63TOTAL_MT ;
   private java.math.BigDecimal AV56HisProKgr ;
   private java.math.BigDecimal AV69TTotk ;
   private java.math.BigDecimal AV57HisProMtr ;
   private java.math.BigDecimal AV70TTotmt ;
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
   private String AV34Maqcod1 ;
   private String AV35Maqcod2 ;
   private String sGXsfl_32_idx="0001" ;
   private String AV93Pgmname ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String edtavTotallines_Internalname ;
   private String edtavTotallines_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_totalkg_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_totalkg_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_totalmt_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_totalmt_Jsonclick ;
   private String edtavTotal_kg_Internalname ;
   private String edtavTotal_kg_Jsonclick ;
   private String edtavTotal_mt_Internalname ;
   private String edtavTotal_mt_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavTotvalue_hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__emprcod_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__maqcod_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__parcod_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisproreo_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__fase_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__fasdsc_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__porkilos_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__hispromtr_Internalname ;
   private String edtavSdtinformeproduccionresumenfase_fase__pormetros_Internalname ;
   private String edtavTotvalue_hispromtr_Internalname ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String AV71Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV72EmprNom ;
   private String AV73UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_hisprokgr_Jsonclick ;
   private String edtavTotvalue_hispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String lblTextblock_fase_Internalname ;
   private String lblTextblock_fase_Jsonclick ;
   private String sCtrlAV12EmprCod ;
   private String sCtrlAV25HisEstReo ;
   private String sCtrlAV34Maqcod1 ;
   private String sCtrlAV35Maqcod2 ;
   private String sCtrlAV26Hisprofec1 ;
   private String sCtrlAV28Hisprofec2 ;
   private String sCtrlAV77OperarioFrom ;
   private String sCtrlAV78OperarioTo ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSdtinformeproduccionresumenfase_fase__emprcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__maqcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisprodtf_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__parcod_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisproreo_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__fase_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__fasdsc_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__hisprokgr_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__porkilos_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__hispromtr_Jsonclick ;
   private String edtavSdtinformeproduccionresumenfase_fase__pormetros_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV26Hisprofec1 ;
   private java.util.Date wcpOAV28Hisprofec2 ;
   private java.util.Date AV26Hisprofec1 ;
   private java.util.Date AV28Hisprofec2 ;
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
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV32 ;
   private boolean gx_refresh_fired ;
   private String AV66TotValue_HisProKgr ;
   private String AV68TotValue_HisProMtr ;
   private String AV55ExcelFilename ;
   private String AV44ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] H022L2_A1525HisProKgr ;
   private java.math.BigDecimal[] H022L2_A1526HisProMtr ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.produccion.SdtSDTInformeProduccionResumenFase AV60SDTInformeProduccionResumenFase ;
   private app.produccion.SdtSDTInformeProduccionResumenFase GXt_SdtSDTInformeProduccionResumenFase5 ;
   private app.produccion.SdtSDTInformeProduccionResumenFase GXv_SdtSDTInformeProduccionResumenFase6[] ;
   private app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem AV61SDTInformeProduccionResumenFase_Fase ;
   private app.produccion.SdtSDTInformeProduccionResumenFase_FaseItem AV64SDTInformeProduccionResumenFase_FaseItem ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class informeproduccionresumenfasedp_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H022L2", "SELECT SUM(HisProKgr), SUM(HisProMtr) FROM TXPLHIPRO WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (HisProDTF >= ?) AND (HisProDTF <= ?) AND (HisProReo = ? or ? = 9) AND (ParCod = 0) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

